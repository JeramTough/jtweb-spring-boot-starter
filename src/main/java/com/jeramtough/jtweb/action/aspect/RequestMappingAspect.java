package com.jeramtough.jtweb.action.aspect;

import com.jeramtough.jtlog.with.WithLogger;
import com.jeramtough.jtweb.component.optlog.bean.InterfaceDetail;
import com.jeramtough.jtweb.component.optlog.bean.InterfaceDetailFactory;
import com.jeramtough.jtweb.component.optlog.config.OptLoggerConfig;
import com.jeramtough.jtweb.component.optlog.core.LogSaver;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * <pre>
 * Created on 2020/12/7 16:22
 * by @author WeiBoWen
 * </pre>
 */
@Aspect
@Component
public class RequestMappingAspect extends BaseLogAspect implements WithLogger {


    private final LogSaver logSaver;

    @Autowired
    protected RequestMappingAspect(WebApplicationContext webApplicationContext,
                                   OptLoggerConfig bsmLoggerConfig,
                                   @Qualifier("defaultLogSaver")
                                           LogSaver logSaver) {
        super(webApplicationContext, bsmLoggerConfig);
        this.logSaver = logSaver;
    }

    /**
     * 日志切入点
     */
    @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)||" +
            "@annotation(org.springframework.web.bind.annotation.GetMapping)||" +
            "@annotation(org.springframework.web.bind.annotation.DeleteMapping)||" +
            "@annotation(org.springframework.web.bind.annotation.PutMapping)||" +
            "@annotation(org.springframework.web.bind.annotation.PatchMapping)||" +
            "@annotation(org.springframework.web.bind.annotation.PostMapping)")
    public void logPointCut() {
    }


    @Around("logPointCut()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {

        Method aspectMethod = getAspectMethod(joinPoint);
        if (aspectMethod == null) {
            getLogger().warn("获取切面方法失败！");
            return joinPoint.proceed();
        }

        if (getOptLoggerConfig().isAble() == null || !getOptLoggerConfig().isAble()) {
            getLogger().debug("isAble=false,操作日志切面不记录日志");
            return joinPoint.proceed();
        }

        getLogger().verbose("获取接口java方法信息");
        InterfaceDetail interfaceDetail = getInterfaceDetail(aspectMethod, joinPoint);
        getLogger().debug(interfaceDetail.toString());

        if (interfaceDetail.getIgnoreMethod()) {
            getLogger().debug("ignoreMethod=true,操作日志切面不记录日志");
            return joinPoint.proceed();
        }

        boolean isCompleted = true;
        Object returnValue = null;
        try {
            returnValue = joinPoint.proceed();
            return returnValue;
        }
        catch (Throwable throwable) {
            isCompleted = false;
            getLogger().info("API接口执行【失败】");
            String failMessage = throwable.getMessage();
            //因为结果出错了，resp直接设置为错误信息
            logSaver.save(
                    getApiHistoryInfoHandler().newAddHistoryParams(
                            interfaceDetail, joinPoint.getArgs(), failMessage, false));
            throw throwable;
        }
        finally {
            if (isCompleted) {
                try {
                    getLogger().verbose("API接口执行【完毕】");
                    logSaver.save(
                            getApiHistoryInfoHandler().newAddHistoryParams(
                                    interfaceDetail, joinPoint.getArgs(), returnValue, true));
                }
                catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }

    }


    //************************

    private Method getAspectMethod(ProceedingJoinPoint joinPoint) {
        String javaMethodName = joinPoint.getSignature().getName();
        Class<?>[] argsClass = new Class<?>[joinPoint.getArgs().length];
        for (int i = 0; i < joinPoint.getArgs().length; i++) {
            argsClass[i] = joinPoint.getArgs()[i].getClass();
        }
        Method method = null;
        try {
            method = joinPoint.getTarget().getClass().getDeclaredMethod(javaMethodName, argsClass);
        }
        catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        //拿名字匹配
        List<Method> methodList = new ArrayList<>();
        if (method == null) {
            for (Method declaredMethod : joinPoint.getTarget().getClass().getDeclaredMethods()) {
                if (javaMethodName.equals(declaredMethod.getName())) {
                    methodList.add(declaredMethod);
                }
            }
        }

        //如果只有一个同名的方法就用
        if (methodList.size() == 1) {
            method = methodList.get(0);
        }

        return method;
    }

    private InterfaceDetail getInterfaceDetail(Method aspectMethod,
                                               ProceedingJoinPoint joinPoint) {
        Object interfaceDetailCache = Objects.requireNonNull(getWC().getServletContext()).getAttribute(
                joinPoint.toLongString() + ".interfaceDetail");
        if (interfaceDetailCache != null) {
            return (InterfaceDetail) interfaceDetailCache;
        }

        InterfaceDetail interfaceDetail = InterfaceDetailFactory.getInterfaceDetail(aspectMethod, joinPoint);
        //缓存接口信息
        getWC().getServletContext().setAttribute(joinPoint.toLongString() + ".interfaceDetail",
                interfaceDetail);
        return interfaceDetail;
    }
}

package com.jeramtough.jtweb.component.optlog.aspect;

import com.jeramtough.jtlog.with.WithLogger;
import com.jeramtough.jtweb.component.aspect.MethodGather;
import com.jeramtough.jtweb.component.optlog.bean.InterfaceDetail;
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

/**
 * <pre>
 * Created on 2020/12/7 16:22
 * by @author WeiBoWen
 * </pre>
 */
@Aspect
@Component
public class RequestMappingLogAspect extends BaseLogAspect implements WithLogger {


    private final LogSaver logSaver;

    @Autowired
    protected RequestMappingLogAspect(WebApplicationContext webApplicationContext,
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
        try {
            if (getOptLoggerConfig().isAble() == null || !getOptLoggerConfig().isAble()) {
                getLogger().debug("isAble=false,操作日志切面不记录日志");
                return joinPoint.proceed();
            }

            Method aspectMethod = MethodGather.getAspectMethod(joinPoint);
            if (aspectMethod == null) {
                getLogger().warn("获取切面方法失败！");
                return joinPoint.proceed();
            }

            getLogger().verbose("获取接口java方法信息");


            InterfaceDetail interfaceDetail = MethodGather.getInterfaceDetail
                    (getWC().getServletContext(), aspectMethod, joinPoint);
            getLogger().debug(interfaceDetail.toString());

            if (interfaceDetail.getIgnoreMethod()) {
                getLogger().verbose("ignoreMethod=true,操作日志切面不记录日志");
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
                getLogger().info("API[%s]接口执行【失败】", interfaceDetail.getShortJavaMethodName());
                throwable.printStackTrace();

                logSaver.save(
                        getApiHistoryInfoHandler().newAddHistoryParams(
                                interfaceDetail, joinPoint.getArgs(), throwable));
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
                    catch (Exception ignored) {
                    }
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            return joinPoint.proceed();
        }

    }


    //************************
}

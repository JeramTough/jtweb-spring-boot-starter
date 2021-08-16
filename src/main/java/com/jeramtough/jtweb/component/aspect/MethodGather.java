package com.jeramtough.jtweb.component.aspect;

import com.jeramtough.jtweb.component.optlog.bean.InterfaceDetail;
import com.jeramtough.jtweb.component.optlog.bean.InterfaceDetailFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.reflect.MethodSignature;

import javax.servlet.ServletContext;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * <pre>
 * Created on 2021/4/21 9:50
 * by @author WeiBoWen
 * </pre>
 */
public class MethodGather {

    /**
     * 得到切面方法
     */
    public static Method getAspectMethod(ProceedingJoinPoint joinPoint) {
        Method method = null;
        String javaMethodName = joinPoint.getSignature().getName();

        //第一种获取方法
        Signature signature = joinPoint.getSignature();
        if (signature instanceof MethodSignature) {
            MethodSignature methodSignature = (MethodSignature) signature;
            method = methodSignature.getMethod();
        }

        //fanshepipei
        if (method == null) {
            Class<?>[] argsClass = new Class<?>[joinPoint.getArgs().length];
            for (int i = 0; i < joinPoint.getArgs().length; i++) {
                if (joinPoint.getArgs()[i] == null) {
                    argsClass = null;
                    break;
                }
                argsClass[i] = joinPoint.getArgs()[i].getClass();
            }

            try {
                if (argsClass != null) {
                    method = joinPoint.getTarget().getClass().getDeclaredMethod(javaMethodName, argsClass);
                }
            }
            catch (NoSuchMethodException ignored) {
            }
        }

        //拿名字匹配
        if (method == null) {
            List<Method> methodList = new ArrayList<>();
            for (Method declaredMethod : joinPoint.getTarget().getClass().getDeclaredMethods()) {
                if (javaMethodName.equals(declaredMethod.getName())) {
                    methodList.add(declaredMethod);
                }
            }
            //如果只有一个同名的方法就用
            if (methodList.size() == 1) {
                method = methodList.get(0);
            }
        }


        return method;
    }

    /**
     * 得到接口描述
     */
    public static InterfaceDetail getInterfaceDetail(
            ServletContext servletContext,
            Method aspectMethod,
            ProceedingJoinPoint joinPoint) {
        Object interfaceDetailCache = Objects.requireNonNull(servletContext).getAttribute(
                joinPoint.toLongString() + ".interfaceDetail");
        if (interfaceDetailCache != null) {
            return (InterfaceDetail) interfaceDetailCache;
        }

        InterfaceDetail interfaceDetail = InterfaceDetailFactory.getInterfaceDetail(aspectMethod, joinPoint);
        //缓存接口信息
        servletContext.setAttribute(joinPoint.toLongString() + ".interfaceDetail",
                interfaceDetail);
        return interfaceDetail;
    }

}

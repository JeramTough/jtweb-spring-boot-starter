package com.jeramtough.jtweb.component.optlog.bean;

import com.jeramtough.jtweb.component.optlog.annotation.IgnoreOptLog;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StringUtils;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Objects;

/**
 * <pre>
 * Created on 2021/2/22 13:32
 * by @author WeiBoWen
 * </pre>
 */
public class InterfaceDetailFactory {

    public static InterfaceDetail getInterfaceDetail(Method aspectMethod,
                                                     ProceedingJoinPoint joinPoint) {
        InterfaceDetail interfaceDetail = new InterfaceDetail();

        Operation apiOperationAnnotation = Objects.requireNonNull(
                aspectMethod).getDeclaredAnnotation(
                Operation.class);

        String apiDescription = null;
        if (apiOperationAnnotation != null) {
            apiDescription = apiOperationAnnotation.description();
            if (!StringUtils.isEmpty(apiDescription)) {
                apiDescription = apiOperationAnnotation.description();
            }
            else {
                if (StringUtils.hasText(apiOperationAnnotation.summary())) {
                    apiDescription = apiOperationAnnotation.summary();
                }
            }
        }
        interfaceDetail.setApiDescription(apiDescription);

        Tag apiAnnotation = joinPoint.getTarget().getClass().getDeclaredAnnotation(Tag.class);
        String apiModuleTag = null;
        if (apiAnnotation != null) {
            if (StringUtils.hasText(apiAnnotation.name())) {
                apiModuleTag = apiAnnotation.name();
            }
        }
        interfaceDetail.setApiModuleTag(apiModuleTag);

        Parameter[] parameters = aspectMethod.getParameters();
        if (parameters != null) {
            String[] argsClasses = new String[parameters.length];
            for (int i = 0; i < parameters.length; i++) {
                if (parameters[i] != null) {
                    Parameter parameter = parameters[i];
                    argsClasses[i] = parameter.getType().getSimpleName();
                }
            }
            interfaceDetail.setMethodArgsClasses(argsClasses);
        }

        //先拿类的注释，如果方法有在用方法的代替
        IgnoreOptLog ignoreOptLogAnnotation =
                joinPoint.getTarget().getClass().getDeclaredAnnotation(IgnoreOptLog.class);
        if (aspectMethod.getDeclaredAnnotation(IgnoreOptLog.class) != null) {
            ignoreOptLogAnnotation = aspectMethod.getDeclaredAnnotation(IgnoreOptLog.class);
        }

        if (ignoreOptLogAnnotation == null) {
            interfaceDetail.setIgnoreMethod(false);
            interfaceDetail.setIgnoreArgs(false);
            interfaceDetail.setIgnoreResponse(false);
        }
        else {
            interfaceDetail.setIgnoreMethod(ignoreOptLogAnnotation.isIgnoreMethod());
            interfaceDetail.setIgnoreArgs(ignoreOptLogAnnotation.isIgnoreArgs());
            interfaceDetail.setIgnoreResponse(ignoreOptLogAnnotation.isIgnoreResponse());
        }

        String longJavaMethodName = formatJavaMethod(joinPoint.toLongString());
        String shortJavaMethodName = formatJavaMethod(joinPoint.toShortString());
        interfaceDetail.setLongJavaMethodName(longJavaMethodName);
        interfaceDetail.setShortJavaMethodName(shortJavaMethodName);

        ApiTypeEnum apiTypeEnum = ApiTypeEnum.OTHER;
        if (longJavaMethodName.contains("get") || longJavaMethodName.contains("search")
                || longJavaMethodName.contains("index") || longJavaMethodName.contains(
                "Get")) {
            apiTypeEnum = ApiTypeEnum.SELECT;
        }
        else if (longJavaMethodName.contains("addByParams") || longJavaMethodName.contains(
                "Add") || longJavaMethodName.contains("insert") ||
                longJavaMethodName.contains("save")) {
            apiTypeEnum = ApiTypeEnum.INSERT;
        }
        else if (longJavaMethodName.contains("update") || longJavaMethodName.contains("set")
                || longJavaMethodName.contains("Set")) {
            apiTypeEnum = ApiTypeEnum.UPDATE;
        }
        else if (longJavaMethodName.contains("delete") || longJavaMethodName.contains("remove")
                || longJavaMethodName.contains("Delete")) {
            apiTypeEnum = ApiTypeEnum.DELETE;
        }
        interfaceDetail.setApiTypeEnum(apiTypeEnum);

        return interfaceDetail;

    }

    //******************

    private static String formatJavaMethod(String javaMethod) {
        if (javaMethod.startsWith("execution(")) {
            javaMethod = javaMethod.trim().replace("execution(", "");
            if (javaMethod.length() > 0) {
                javaMethod = javaMethod.substring(0, javaMethod.length() - 1);
            }
        }
        return javaMethod;
    }

}

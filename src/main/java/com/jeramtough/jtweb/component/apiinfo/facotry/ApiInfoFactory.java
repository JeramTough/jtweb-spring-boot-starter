package com.jeramtough.jtweb.component.apiinfo.facotry;

import com.jeramtough.jtcomponent.utils.StringUtil;
import com.jeramtough.jtweb.component.apiinfo.bean.ApiInfo;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * <pre>
 * Created on 2022/12/22 上午10:45
 * by @author WeiBoWen
 * </pre>
 */
public class ApiInfoFactory {

    public static ApiInfo getApiInfo(Class<?> controllerClass, Method method) {
        ApiInfo apiInfo = new ApiInfo();

        apiInfo.setMethodName(method.getName());

        Tag apiAnnotation = controllerClass.getDeclaredAnnotation(Tag.class);
        if (apiAnnotation != null && StringUtils.hasText(apiAnnotation.name())) {
            apiInfo.setGroupName(apiAnnotation.name());
        }
        else {
            apiInfo.setGroupName(controllerClass.getSimpleName());
        }

        RequestMapping controllerRequestMappingAnnotation =
                controllerClass.getDeclaredAnnotation(RequestMapping.class);
        String basePath = "";
        if (controllerRequestMappingAnnotation != null) {
            if (controllerRequestMappingAnnotation.value().length > 0) {
                basePath = (StringUtil.appendByComma(
                        Arrays.stream(controllerRequestMappingAnnotation.value()).toList()));
            }
            else {
                if (controllerRequestMappingAnnotation.path().length > 0) {
                    basePath = (StringUtil.appendByComma(
                            Arrays.stream(
                                    controllerRequestMappingAnnotation.path()).toList()));
                }
            }
        }

        Operation apiOperationAnnotation = method.getDeclaredAnnotation(Operation.class);
        if (apiOperationAnnotation != null) {
            if (!StringUtil.isEmpty(apiOperationAnnotation.summary())) {
                apiInfo.setDescription(apiOperationAnnotation.summary());
            }
            else {
                if (!StringUtil.isEmpty(apiOperationAnnotation.description())) {
                    apiInfo.setDescription(apiOperationAnnotation.description());
                }
            }
        }

        RequestMapping requestMappingAnnotation = method.getDeclaredAnnotation(
                RequestMapping.class);
        if (requestMappingAnnotation != null) {
            if (requestMappingAnnotation.value().length > 0) {
                apiInfo.setPath(basePath + StringUtil.appendByComma(
                        Arrays.stream(requestMappingAnnotation.value()).toList()));
                return apiInfo;
            }
            else {
                if (requestMappingAnnotation.path().length > 0) {
                    apiInfo.setPath(basePath + StringUtil.appendByComma(
                            Arrays.stream(requestMappingAnnotation.path()).toList()));
                    return apiInfo;
                }
            }
        }

        GetMapping getMappingAnnotation = method.getDeclaredAnnotation(GetMapping.class);
        if (getMappingAnnotation != null) {
            if (getMappingAnnotation.value().length > 0) {
                apiInfo.setPath(basePath + StringUtil.appendByComma(
                        Arrays.stream(getMappingAnnotation.value()).toList()));
                return apiInfo;
            }
            else {
                if (getMappingAnnotation.path().length > 0) {
                    apiInfo.setPath(basePath + StringUtil.appendByComma(
                            Arrays.stream(getMappingAnnotation.path()).toList()));
                    return apiInfo;
                }
            }
        }

        PostMapping postMappingAnnotation = method.getDeclaredAnnotation(PostMapping.class);
        if (postMappingAnnotation != null) {
            if (postMappingAnnotation.value().length > 0) {
                apiInfo.setPath(basePath + StringUtil.appendByComma(
                        Arrays.stream(postMappingAnnotation.value()).toList()));
                return apiInfo;
            }
            else {
                if (postMappingAnnotation.path().length > 0) {
                    apiInfo.setPath(basePath + StringUtil.appendByComma(
                            Arrays.stream(postMappingAnnotation.path()).toList()));
                    return apiInfo;
                }
            }
        }

        DeleteMapping deleteMappingAnnotation = method.getDeclaredAnnotation(
                DeleteMapping.class);
        if (deleteMappingAnnotation != null) {
            if (deleteMappingAnnotation.value().length > 0) {
                apiInfo.setPath(basePath + StringUtil.appendByComma(
                        Arrays.stream(deleteMappingAnnotation.value()).toList()));
                return apiInfo;
            }
            else {
                if (deleteMappingAnnotation.path().length > 0) {
                    apiInfo.setPath(basePath + StringUtil.appendByComma(
                            Arrays.stream(deleteMappingAnnotation.path()).toList()));
                    return apiInfo;
                }
            }
        }

        PutMapping putMappingAnnotation = method.getDeclaredAnnotation(PutMapping.class);
        if (putMappingAnnotation != null) {
            if (putMappingAnnotation.value().length > 0) {
                apiInfo.setPath(basePath + StringUtil.appendByComma(
                        Arrays.stream(putMappingAnnotation.value()).toList()));
                return apiInfo;
            }
            else {
                if (putMappingAnnotation.path().length > 0) {
                    apiInfo.setPath(basePath + StringUtil.appendByComma(
                            Arrays.stream(putMappingAnnotation.path()).toList()));
                    return apiInfo;
                }
            }
        }

        return apiInfo;
    }
}

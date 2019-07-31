package com.jeramtough.apiresponse;

import io.swagger.annotations.ApiResponses;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created on 2019/7/29 14:52
 * by @author WeiBoWen
 */
public class ApiResponsesHandler {
    private static ApiResponsesHandler ourInstance = new ApiResponsesHandler();

    private static final int DEFALUT_FAILED_CODE = 0;

    private Map<Integer, RestfulApiResponse> failedResponseMap;


    public static ApiResponsesHandler getInstance() {
        return ourInstance;
    }

    private ApiResponsesHandler() {
        failedResponseMap = new HashMap<>(20);

        RestfulApiResponse defaultFailedRestfulApiResponse = new RestfulApiResponse();
        defaultFailedRestfulApiResponse.setIsSuccessful(false);
        defaultFailedRestfulApiResponse.setStatusCode(DEFALUT_FAILED_CODE);
        defaultFailedRestfulApiResponse.setResponseBody(
                "System has happened unexpected error, " +
                        "please contact the administrator\n系统发生不可预测的错误，请联系专门的系统管理人员");
        failedResponseMap.put(DEFALUT_FAILED_CODE, defaultFailedRestfulApiResponse);
    }

    public void parseingApiResponseAnnotations(Class clazz) {
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            ApiResponses apiResponsesAnnotation = method.getAnnotation(ApiResponses.class);
            if (apiResponsesAnnotation != null) {
                for (io.swagger.annotations.ApiResponse apiResponseAnnotation :
                        apiResponsesAnnotation.value()) {
                    this.addFailedResponse(apiResponseAnnotation.code(),
                            apiResponseAnnotation.message());
                }
            }
        }
    }

    public void addFailedResponse(Integer code, String failedMessage) {
        if (!failedResponseMap.containsKey(code)) {
            RestfulApiResponse restfulApiResponse = new RestfulApiResponse();
            restfulApiResponse.setStatusCode(code);
            restfulApiResponse.setResponseBody(failedMessage);
            restfulApiResponse.setSuccessful(false);
            failedResponseMap.put(code, restfulApiResponse);
        }
        else {
        }
    }

    public RestfulApiResponse getSuccessfulApiResponse(Object responseBody) {
        RestfulApiResponse restfulApiResponse = new RestfulApiResponse();
        restfulApiResponse.setResponseBody(responseBody);
        restfulApiResponse.setSuccessful(true);
        return restfulApiResponse;
    }

    public RestfulApiResponse getFailedResponse(int code) {
        return Objects.requireNonNull(failedResponseMap.get(code));
    }

    public RestfulApiResponse getFailedResponse(ApiResponseException e) {
        return Objects.requireNonNull(failedResponseMap.get(e.getCode()));
    }

    public RestfulApiResponse getFailedResponse(Exception e) {
        if (e instanceof ApiResponseException) {
            ApiResponseException apiResponseException = (ApiResponseException) e;
            return getFailedResponse(apiResponseException);
        }
        else {
            return null;
        }
    }

    public RestfulApiResponse getDefaultFailedResponse() {
        return failedResponseMap.get(DEFALUT_FAILED_CODE);
    }

}

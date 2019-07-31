package com.jeramtough.apiresponse;

import com.jeramtough.apiresponse.bean.FailureReason;
import com.jeramtough.apiresponse.bean.RestfulApiResponse;
import com.jeramtough.apiresponse.exception.ApiResponseException;
import com.jeramtough.apiresponse.exception.CodeHasSameException;
import io.swagger.annotations.ApiResponses;

import javax.validation.constraints.NotNull;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created on 2019/7/29 14:52
 * by @author WeiBoWen
 */
public class ApiResponsesAnnotationHandler {
    private static ApiResponsesAnnotationHandler ourInstance = new ApiResponsesAnnotationHandler();

    public static final int DEFALUT_FAILED_CODE = 0;
    public static final int DEFALUT_SUCCESSFUL_CODE = 666;

    public static final String DEFALUT_FAILED_MESSAGE = "System has happened unexpected " +
            "error, " +
            "please contact the administrator\n系统发生不可预测的错误，请联系专门的系统管理人员";

    private Map<Integer, String> failedResponseMessageMap;


    public static ApiResponsesAnnotationHandler getInstance() {
        return ourInstance;
    }

    private ApiResponsesAnnotationHandler() {
        failedResponseMessageMap = new HashMap<>(20);

        failedResponseMessageMap.put(DEFALUT_FAILED_CODE, DEFALUT_FAILED_MESSAGE);
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

    public @NotNull String getFailedMessage(int code){
        return Objects.requireNonNull(failedResponseMessageMap.get(code));
    }


    //*******************************

    private void addFailedResponse(int code, String failedMessage) {
        if (!failedResponseMessageMap.containsKey(code)) {
            failedResponseMessageMap.put(code, failedMessage);
        }
        else {
            throw new CodeHasSameException(code);
        }
    }
}

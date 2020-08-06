package com.jeramtough.jtweb.component.apiresponse;

import com.jeramtough.jtweb.component.apiresponse.bean.CommonApiResponse;
import com.jeramtough.jtweb.component.apiresponse.exception.ApiResponseException;
import com.jeramtough.jtweb.exception.NotRegisteredException;

import java.util.Objects;

/**
 * Created on 2019/7/31 15:56
 * by @author WeiBoWen
 */
public class ApiResponseFactory {


    public static <T> CommonApiResponse<T> getSuccessfulApiResponse(T responseBody) {
        CommonApiResponse<T> commonApiResponse = new CommonApiResponse<>();
        commonApiResponse.setResponseBody(responseBody);
        commonApiResponse.setStatusCode(
                ApiResponsesAnnotationHandler.DEFAULT_SUCCESSFUL_CODE);
        commonApiResponse.setSuccessful(true);
        return commonApiResponse;
    }

    public static CommonApiResponse<String> getDefaultFailedResponse() {
        CommonApiResponse<String> commonApiResponse = new CommonApiResponse<>();
        commonApiResponse.setResponseBody(
                ApiResponsesAnnotationHandler.DEFAULT_FAILED_MESSAGE);
        commonApiResponse.setStatusCode(ApiResponsesAnnotationHandler.DEFAULT_FAILED_CODE);
        commonApiResponse.setSuccessful(false);
        return commonApiResponse;
    }

    public static CommonApiResponse<String> getFailedResponse(Exception e) {
        if (e instanceof ApiResponseException) {
            ApiResponseException apiResponseException = (ApiResponseException) e;
            return getFailedResponse(apiResponseException);
        }
        else {
            return getDefaultFailedResponse();
        }
    }

    public static CommonApiResponse<String> getFailedResponse(ApiResponseException e) {
        String failedMessage =
                ApiResponsesAnnotationHandler.getInstance().getFailedMessage(
                        e.getFailureReason().getCode());

        CommonApiResponse<String> commonApiResponse = new CommonApiResponse<>();
        commonApiResponse.setStatusCode(e.getFailureReason().getCode());

        failedMessage = String.format(failedMessage,
                e.getFailureReason().getPlaceholders().toArray(new Object[0]));

        commonApiResponse.setResponseBody(failedMessage);
        commonApiResponse.setSuccessful(false);
        return commonApiResponse;
    }

}

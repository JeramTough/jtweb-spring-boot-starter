package com.jeramtough.apiresponse;

import com.jeramtough.apiresponse.bean.RestfulApiResponse;
import com.jeramtough.apiresponse.exception.ApiResponseException;

/**
 * Created on 2019/7/31 15:56
 * by @author WeiBoWen
 */
public class ApiResponseFactory {


    public static RestfulApiResponse getSuccessfulApiResponse(Object responseBody) {
        RestfulApiResponse restfulApiResponse = new RestfulApiResponse();
        restfulApiResponse.setResponseBody(responseBody);
        restfulApiResponse.setStatusCode(
                ApiResponsesAnnotationHandler.DEFALUT_SUCCESSFUL_CODE);
        restfulApiResponse.setSuccessful(true);
        return restfulApiResponse;
    }

    public static RestfulApiResponse getDefaultFailedResponse() {
        RestfulApiResponse restfulApiResponse = new RestfulApiResponse();
        restfulApiResponse.setResponseBody(
                ApiResponsesAnnotationHandler.DEFALUT_FAILED_MESSAGE);
        restfulApiResponse.setStatusCode(ApiResponsesAnnotationHandler.DEFALUT_FAILED_CODE);
        restfulApiResponse.setSuccessful(false);
        return restfulApiResponse;
    }

    public static RestfulApiResponse getFailedResponse(Exception e) {
        if (e instanceof ApiResponseException) {
            ApiResponseException apiResponseException = (ApiResponseException) e;
            return getFailedResponse(apiResponseException);
        }
        else {
            return getDefaultFailedResponse();
        }
    }

    public static RestfulApiResponse getFailedResponse(ApiResponseException e) {
        String failedMessage =
                ApiResponsesAnnotationHandler.getInstance().getFailedMessage(
                        e.getFailureReason().getCode());
        RestfulApiResponse restfulApiResponse = new RestfulApiResponse();
        restfulApiResponse.setStatusCode(e.getFailureReason().getCode());

        failedMessage = String.format(failedMessage, e.getFailureReason().getPlaceholders());

        restfulApiResponse.setResponseBody(failedMessage);
        restfulApiResponse.setSuccessful(false);
        return restfulApiResponse;
    }

}

package com.jeramtough.jtweb.component.apiresponse;

import com.jeramtough.jtcomponent.utils.DateTimeUtil;
import com.jeramtough.jtweb.component.apiresponse.bean.CommonApiResponse;
import com.jeramtough.jtweb.component.apiresponse.exception.ApiResponseBeanException;
import com.jeramtough.jtweb.component.apiresponse.exception.ApiResponseException;
import com.jeramtough.jtweb.exception.CodeNotRegiserException;

import java.time.LocalDateTime;

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
        commonApiResponse.setTimestamp(DateTimeUtil.getTimestamp(LocalDateTime.now()));
        commonApiResponse.setSuccessful(true);
        return commonApiResponse;
    }

    public static CommonApiResponse<String> getDefaultFailedResponse(Exception e) {
        CommonApiResponse<String> commonApiResponse = new CommonApiResponse<>();
        commonApiResponse.setResponseBody(
                ApiResponsesAnnotationHandler.DEFAULT_FAILED_MESSAGE + "\n【" + e.getMessage()+"】");
        commonApiResponse.setStatusCode(ApiResponsesAnnotationHandler.DEFAULT_FAILED_CODE);
        commonApiResponse.setTimestamp(DateTimeUtil.getTimestamp(LocalDateTime.now()));
        commonApiResponse.setSuccessful(false);
        return commonApiResponse;
    }

    public static CommonApiResponse<String> getFailedResponse(Exception e) {
        if (e instanceof ApiResponseException) {
            if (e instanceof ApiResponseBeanException) {
                ApiResponseBeanException apiResponseBeanException = (ApiResponseBeanException) e;
                return getFailedResponse(apiResponseBeanException);
            }
            ApiResponseException apiResponseException = (ApiResponseException) e;
            return getFailedResponse(apiResponseException);
        }
        else {
            return getDefaultFailedResponse(e);
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
        commonApiResponse.setTimestamp(DateTimeUtil.getTimestamp(LocalDateTime.now()));
        commonApiResponse.setSuccessful(false);
        return commonApiResponse;
    }

    public static CommonApiResponse<String> getFailedResponse(ApiResponseBeanException e) {
        String failedMessage =
                ApiResponsesAnnotationHandler.getInstance().getFailedMessage(
                        e.getFailureReason().getCode());

        CommonApiResponse<String> commonApiResponse = new CommonApiResponse<>();
        commonApiResponse.setStatusCode(e.getFailureReason().getCode());

        failedMessage = failedMessage.replace("%t", e.getFieldName());

        failedMessage = String.format(failedMessage,
                e.getFailureReason().getPlaceholders().toArray(new Object[0]));

        commonApiResponse.setResponseBody(failedMessage);
        commonApiResponse.setTimestamp(DateTimeUtil.getTimestamp(LocalDateTime.now()));
        commonApiResponse.setSuccessful(false);
        return commonApiResponse;
    }

    //********************

}

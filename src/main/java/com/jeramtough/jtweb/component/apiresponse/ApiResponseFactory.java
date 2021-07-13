package com.jeramtough.jtweb.component.apiresponse;

import com.jeramtough.jtcomponent.utils.DateTimeUtil;
import com.jeramtough.jtweb.component.apiresponse.bean.CommonApiResponse;
import com.jeramtough.jtweb.component.apiresponse.exception.ApiException;
import com.jeramtough.jtweb.component.apiresponse.exception.ApiResponseBeanException;
import com.jeramtough.jtweb.component.apiresponse.exception.ApiResponseException;

import java.time.LocalDateTime;
import java.util.List;

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
        commonApiResponse.setMessage("The response is successful");
        return commonApiResponse;
    }

    public static CommonApiResponse<String> getDefaultFailedResponse(Exception e) {
        CommonApiResponse<String> commonApiResponse = new CommonApiResponse<>();
        String message = ApiResponsesAnnotationHandler.DEFAULT_FAILED_MESSAGE;
        message = message + "\n[" + e.getClass().getSimpleName() + "]";
        if (e.getMessage() != null) {
            message = message + "\n【" + e.getMessage() + "】";
        }

        commonApiResponse.setResponseBody(message);
        commonApiResponse.setStatusCode(ApiResponsesAnnotationHandler.DEFAULT_FAILED_CODE);
        commonApiResponse.setTimestamp(DateTimeUtil.getTimestamp(LocalDateTime.now()));
        commonApiResponse.setSuccessful(false);
        commonApiResponse.setMessage(message);
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
        else if (e instanceof ApiException) {
            ApiException apiException = (ApiException) e;
            return getFailedResponse(apiException);
        }
        else {
            return getDefaultFailedResponse(e);
        }
    }

    public static CommonApiResponse<String> getFailedResponse(ApiException e) {
        CommonApiResponse<String> commonApiResponse = new CommonApiResponse<>();
        if (e.getCustomErrorCode() != null) {
            commonApiResponse.setStatusCode(e.getCustomErrorCode());
        }
        else {
            commonApiResponse.setStatusCode(e.getErrorCode().number());
        }
        commonApiResponse.setIsSuccessful(false);
        commonApiResponse.setMessage(e.getMessage());
        commonApiResponse.setTimestamp(System.currentTimeMillis());
        return commonApiResponse;
    }

    public static CommonApiResponse<String> getFailedResponse(ApiResponseException e) {
        if (e instanceof ApiResponseBeanException) {
            ApiResponseBeanException apiResponseBeanException = (ApiResponseBeanException) e;
            return getFailedResponse(apiResponseBeanException);
        }

        String failedMessage =
                ApiResponsesAnnotationHandler.getInstance().getFailedMessage(
                        e.getFailureReason().getCode());

        if (failedMessage.contains("[%t]")) {
            List<String> placeholderList = e.getFailureReason().getPlaceholders();
            if (placeholderList.size() >= 2) {
                int code = e.getCode();
                String fieldName = placeholderList.get(0);
                String[] placeholders = new String[placeholderList.size() - 1];
                for (int i = 1; i < placeholderList.size(); i++) {
                    placeholders[i - 1] = placeholderList.get(i);
                }
                ApiResponseBeanException apiResponseBeanException =
                        new ApiResponseBeanException(code, fieldName, placeholders);
                return getFailedResponse(apiResponseBeanException);

            }
        }

        CommonApiResponse<String> commonApiResponse = new CommonApiResponse<>();
        commonApiResponse.setStatusCode(e.getFailureReason().getCode());

        failedMessage = String.format(failedMessage,
                e.getFailureReason().getPlaceholders().toArray(new Object[0]));
        if (e.getFailureReason().getException() != null) {
            failedMessage = failedMessage + "\n" + "[" + e.getFailureReason().getException().getClass().getSimpleName() + "]";
            if (e.getFailureReason().getException().getMessage() != null) {
                failedMessage = failedMessage + "\n" + e.getFailureReason().getException().getMessage();
            }
        }

        commonApiResponse.setResponseBody(failedMessage);
        commonApiResponse.setTimestamp(DateTimeUtil.getTimestamp(LocalDateTime.now()));
        commonApiResponse.setSuccessful(false);
        commonApiResponse.setMessage(failedMessage);
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
        if (e.getFailureReason().getException() != null) {
            failedMessage = failedMessage + "\n" + "[" + e.getFailureReason().getException().getClass().getSimpleName() + "]";
            if (e.getFailureReason().getException().getMessage() != null) {
                failedMessage = failedMessage + "\n" + e.getFailureReason().getException().getMessage();
            }
        }

        commonApiResponse.setResponseBody(failedMessage);
        commonApiResponse.setTimestamp(DateTimeUtil.getTimestamp(LocalDateTime.now()));
        commonApiResponse.setSuccessful(false);
        commonApiResponse.setMessage(failedMessage);
        return commonApiResponse;
    }

    //********************

}

package com.jeramtough.web.action.controller;

import com.jeramtough.apiresponse.ApiResponsesHandler;
import com.jeramtough.apiresponse.RestfulApiResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created on 2019/7/26 14:35
 * by @author WeiBoWen
 */
@ControllerAdvice
public abstract class BaseSwaggerController {

    private ApiResponsesHandler apiResponsesHandler;

    public BaseSwaggerController() {
        apiResponsesHandler = ApiResponsesHandler.getInstance();
        apiResponsesHandler.parseingApiResponseAnnotations(this.getClass());
    }

    RestfulApiResponse getSuccessfulApiResponse(Object responseBody) {
        return apiResponsesHandler.getSuccessfulApiResponse(responseBody);
    }


    @ExceptionHandler(value = Exception.class)//指定拦截的异常
    public final RestfulApiResponse errorHandler(HttpServletRequest request,
                                                 HttpServletResponse response,
                                                 Exception e) {

        RestfulApiResponse failedApiResponse =
                apiResponsesHandler.getFailedResponse(e);


        if (failedApiResponse == null) {
            e.printStackTrace();
            failedApiResponse = exceptionHandled(request, response, e);
            if (failedApiResponse == null) {
                return apiResponsesHandler.getDefaultFailedResponse();
            }
        }
        return failedApiResponse;
    }

    /**
     * 处理非正常情况的异常
     */
    protected RestfulApiResponse exceptionHandled(HttpServletRequest request,
                                                  HttpServletResponse response,
                                                  Exception e) {
        return null;
    }


}

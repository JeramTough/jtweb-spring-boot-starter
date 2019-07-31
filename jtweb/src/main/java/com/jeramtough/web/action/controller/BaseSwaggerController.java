package com.jeramtough.web.action.controller;

import com.jeramtough.apiresponse.ApiResponseFactory;
import com.jeramtough.apiresponse.ApiResponsesAnnotationHandler;
import com.jeramtough.apiresponse.bean.RestfulApiResponse;
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


    public BaseSwaggerController() {
        ApiResponsesAnnotationHandler.getInstance().parseingApiResponseAnnotations(
                this.getClass());
    }

    public RestfulApiResponse getSuccessfulApiResponse(Object responseBody) {
        return ApiResponseFactory.getSuccessfulApiResponse(responseBody);
    }


    @ExceptionHandler(value = Exception.class)//指定拦截的异常
    public final RestfulApiResponse errorHandler(HttpServletRequest request,
                                                 HttpServletResponse response,
                                                 Exception e) {

        RestfulApiResponse failedApiResponse =
                ApiResponseFactory.getFailedResponse(e);
        return exceptionHandled(request, response, failedApiResponse, e);
    }

    /**
     * 处理非正常情况的异常
     */
    protected RestfulApiResponse exceptionHandled(HttpServletRequest request,
                                                  HttpServletResponse response,
                                                  RestfulApiResponse failedApiResponse,
                                                  Exception e) {
        return failedApiResponse;
    }


}

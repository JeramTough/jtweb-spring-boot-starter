package com.jeramtough.jtweb.action.controller;

import com.jeramtough.jtcomponent.task.response.ReturnResponse;
import com.jeramtough.jtweb.component.apiresponse.ApiResponseFactory;
import com.jeramtough.jtweb.component.apiresponse.ApiResponsesAnnotationHandler;
import com.jeramtough.jtweb.component.apiresponse.bean.CommonApiResponse;
import com.jeramtough.jtweb.component.apiresponse.exception.ApiResponseException;
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
        ApiResponsesAnnotationHandler.getInstance().parsingApiResponseAnnotations(
                this.getClass());
    }

    public CommonApiResponse getSuccessfulApiResponse(Object responseBody) {
        return ApiResponseFactory.getSuccessfulApiResponse(responseBody);
    }

    public CommonApiResponse getSuccessfulApiResponse(ReturnResponse returnResponse) {
        return ApiResponseFactory.getSuccessfulApiResponse(returnResponse.getReturn());
    }


    @ExceptionHandler(value = Exception.class)//指定拦截的异常
    public final CommonApiResponse errorHandler(HttpServletRequest request,
                                                HttpServletResponse response,
                                                Exception e) {
        if (!(e instanceof ApiResponseException)) {
            e.printStackTrace();
        }

        CommonApiResponse failedApiResponse =
                ApiResponseFactory.getFailedResponse(e);
        return exceptionHandled(request, response, failedApiResponse, e);
    }

    /**
     * 处理非正常情况的异常
     */
    protected CommonApiResponse exceptionHandled(HttpServletRequest request,
                                                 HttpServletResponse response,
                                                 CommonApiResponse failedApiResponse,
                                                 Exception e) {
        return failedApiResponse;
    }


}

package com.jeramtough.jtweb.action.controller;

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

    public <T> CommonApiResponse<T> getSuccessfulApiResponse(T responseBody) {
        return ApiResponseFactory.getSuccessfulApiResponse(responseBody);
    }


    /**
     *
     * @param request {@link HttpServletRequest}
     * @param response {@link HttpServletResponse}
     * @param e API异常
     * @return 相应对象
     */
    @ExceptionHandler(value = Exception.class)//指定拦截的异常
    public final CommonApiResponse<String> errorHandler(HttpServletRequest request,
                                                        HttpServletResponse response,
                                                        Exception e) {
        if (!(e instanceof ApiResponseException)) {
            e.printStackTrace();
        }

        CommonApiResponse<String> failedApiResponse =
                ApiResponseFactory.getFailedResponse(e);
        return handleException(request, response, failedApiResponse, e);
    }

    /**
     * 如果需要自定义处理的异常响应的钩子方法
     */
    protected CommonApiResponse<String> handleException(HttpServletRequest request,
                                                        HttpServletResponse response,
                                                        CommonApiResponse<String> failedApiResponse,
                                                        Exception e) {
        return failedApiResponse;
    }


}

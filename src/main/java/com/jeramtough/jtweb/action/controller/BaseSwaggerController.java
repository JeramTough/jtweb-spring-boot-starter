package com.jeramtough.jtweb.action.controller;

import com.alibaba.fastjson.JSON;
import com.jeramtough.jtlog.with.WithLogger;
import com.jeramtough.jtweb.component.apiresponse.ApiResponseFactory;
import com.jeramtough.jtweb.component.apiresponse.ApiResponsesAnnotationHandler;
import com.jeramtough.jtweb.component.apiresponse.bean.CommonApiResponse;
import com.jeramtough.jtweb.component.apiresponse.error.ErrorCode;
import com.jeramtough.jtweb.component.apiresponse.exception.ApiException;
import com.jeramtough.jtweb.component.apiresponse.exception.ApiResponseException;
import com.jeramtough.jtweb.component.optlog.annotation.IgnoreOptLog;
import com.jeramtough.jtweb.model.error.ErrorS;
import com.jeramtough.jtweb.model.error.ErrorU;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created on 2019/7/26 14:35
 * by @author WeiBoWen
 */
@ApiResponses({
        @ApiResponse(code = ErrorU.CODE_1.C, message = ErrorU.CODE_1.M),
        @ApiResponse(code = ErrorU.CODE_2.C, message = ErrorU.CODE_2.M),
        @ApiResponse(code = ErrorU.CODE_3.C, message = ErrorU.CODE_3.M),
        @ApiResponse(code = ErrorU.CODE_4.C, message = ErrorU.CODE_4.M),
        @ApiResponse(code = ErrorU.CODE_5.C, message = ErrorU.CODE_5.M),
        @ApiResponse(code = ErrorU.CODE_6.C, message = ErrorU.CODE_6.M),
        @ApiResponse(code = ErrorU.CODE_7.C, message = ErrorU.CODE_7.M),
        @ApiResponse(code = ErrorU.CODE_8.C, message = ErrorU.CODE_8.M),
        @ApiResponse(code = ErrorU.CODE_9.C, message = ErrorU.CODE_9.M),
        @ApiResponse(code = ErrorU.CODE_10.C, message = ErrorU.CODE_10.M),
        @ApiResponse(code = ErrorU.CODE_11.C, message = ErrorU.CODE_11.M),
        @ApiResponse(code = ErrorU.CODE_12.C, message = ErrorU.CODE_12.M),
        @ApiResponse(code = ErrorU.CODE_13.C, message = ErrorU.CODE_13.M),

        @ApiResponse(code = ErrorS.CODE_1.C, message = ErrorS.CODE_1.M),
        @ApiResponse(code = ErrorS.CODE_2.C, message = ErrorS.CODE_2.M),
        @ApiResponse(code = ErrorS.CODE_3.C, message = ErrorS.CODE_3.M),
        @ApiResponse(code = ErrorS.CODE_4.C, message = ErrorS.CODE_4.M),
        @ApiResponse(code = ErrorS.CODE_5.C, message = ErrorS.CODE_5.M),
        @ApiResponse(code = ErrorS.CODE_6.C, message = ErrorS.CODE_6.M),
        @ApiResponse(code = ErrorS.CODE_7.C, message = ErrorS.CODE_7.M),
})
@ControllerAdvice
public abstract class BaseSwaggerController implements WithLogger {


    public BaseSwaggerController() {
        ApiResponsesAnnotationHandler.getInstance().parsingApiResponseAnnotations(
                this.getClass());
    }

    public <T> CommonApiResponse<T> getSuccessfulApiResponse(T responseBody) {
        return ApiResponseFactory.getSuccessfulApiResponse(responseBody);
    }

    public CommonApiResponse<String> getFailedApiResponse(Integer customErrorCode,
                                                          String message) {
        ApiException apiException = new ApiException(customErrorCode, message);
        CommonApiResponse<String> failedApiResponse =
                ApiResponseFactory.getFailedResponse(apiException);
        return failedApiResponse;
    }

    public CommonApiResponse<String> getFailedApiResponse(ErrorCode errorCode,
                                                          String message) {
        ApiException apiException = new ApiException(errorCode, message);
        CommonApiResponse<String> failedApiResponse =
                ApiResponseFactory.getFailedResponse(apiException);
        return failedApiResponse;
    }

    public CommonApiResponse<String> getFailedApiResponse(Exception e) {
        CommonApiResponse<String> failedApiResponse =
                ApiResponseFactory.getFailedResponse(e);
        return failedApiResponse;
    }


    /**
     * @param request  {@link HttpServletRequest}
     * @param response {@link HttpServletResponse}
     * @param e        API异常
     * @return 相应对象
     */
    @ExceptionHandler(value = Exception.class)//指定拦截的异常
    public final void errorHandler(HttpServletRequest request,
                                   HttpServletResponse response,
                                   Exception e) {
        //是不可控异常才打印输出，可控异常ApiException就不用打印了
        if (!((e instanceof ApiException) || (e instanceof ApiResponseException))) {
            e.printStackTrace();
        }

        CommonApiResponse<String> failedApiResponse =
                ApiResponseFactory.getFailedResponse(e);
        failedApiResponse = handleException(request, response, failedApiResponse, e);

        returnCommonApiResponse(failedApiResponse, response);
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

    //******************

    private void returnCommonApiResponse(CommonApiResponse commonApiResponse,
                                         HttpServletResponse httpServletResponse) {
        httpServletResponse.setCharacterEncoding("UTF-8");
        httpServletResponse.setContentType("application/json; charset=utf-8");
        try (PrintWriter out = httpServletResponse.getWriter()) {
            out.append(JSON.toJSONString(commonApiResponse));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}

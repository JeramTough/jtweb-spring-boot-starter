package com.jeramtough.jtweb.action.filter;

import com.alibaba.fastjson.JSON;
import com.jeramtough.jtweb.component.apiresponse.ApiResponseFactory;
import com.jeramtough.jtweb.component.apiresponse.bean.CommonApiResponse;
import com.jeramtough.jtweb.component.apiresponse.exception.ApiResponseException;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * <pre>
 * Created on 2020/3/23 19:25
 * by @author JeramTough
 * </pre>
 */
public interface BaseSwaggerFilter {

    default CommonApiResponse getSuccessfulApiResponse(Object responseBody) {
        return ApiResponseFactory.getSuccessfulApiResponse(responseBody);
    }

    default CommonApiResponse getFailedApiResponse(ApiResponseException e) {
        CommonApiResponse failedApiResponse =
                ApiResponseFactory.getFailedResponse(e);
        return failedApiResponse;
    }


    default void returnRestfulApiResponse(CommonApiResponse commonApiResponse,
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
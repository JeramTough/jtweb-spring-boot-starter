package com.jeramtough.jtweb.action.controller;

import cn.hutool.core.io.IoUtil;
import com.jeramtough.jtlog.facade.L;
import com.jeramtough.jtweb.component.apiresponse.exception.ApiResponseException;
import com.jeramtough.jtweb.component.http.HttpContentTypeHandler;
import com.jeramtough.jtweb.model.error.ErrorS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;

/**
 * <pre>
 * Created on 2020/11/16 9:20
 * by @author WeiBoWen
 * </pre>
 */
@Controller
public class JtBaseController extends BaseSwaggerController {

    @Autowired
    private WebApplicationContext webApplicationContext;


    public WebApplicationContext getWC() {
        return webApplicationContext;
    }

    public void returnResoureFile(File file) {


        String contentType = HttpContentTypeHandler.getInstance().getContentType(file);
        Objects.requireNonNull(contentType);

        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        Objects.requireNonNull(requestAttributes);
        HttpServletRequest request = requestAttributes.getRequest();
        HttpServletResponse response = requestAttributes.getResponse();

        getLogger().debug("[%s]请求响应content-type为 [%s] ", request.getRequestURI(), contentType);

        try {
            response.setContentType(contentType);

            IoUtil.copy(new FileInputStream(file), response.getOutputStream());
        }
        catch (IOException e) {
            e.printStackTrace();
            throw new ApiResponseException(ErrorS.CODE_2.C, "读取资源文件");
        }

    }
}

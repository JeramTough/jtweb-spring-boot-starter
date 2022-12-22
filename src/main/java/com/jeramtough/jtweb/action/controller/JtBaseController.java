package com.jeramtough.jtweb.action.controller;

import cn.hutool.core.io.IoUtil;
import com.jeramtough.jtweb.component.apiinfo.core.ApiInfoRecorder;
import com.jeramtough.jtweb.component.apiresponse.exception.ApiResponseException;
import com.jeramtough.jtweb.component.http.HttpContentTypeHandler;
import com.jeramtough.jtweb.model.error.ErrorS;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

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

    public JtBaseController() {
        //登记api接口信息
        ApiInfoRecorder.getInstance().registerApiInfo(this.getClass());
    }

    public WebApplicationContext getWC() {
        return webApplicationContext;
    }

    public void returnResoureFile(File file) {
        this.returnResoureFile(file, 0L);
    }

    public void returnResoureFile(File file, Long expiresTime) {

        String contentType = HttpContentTypeHandler.getInstance().getContentType(file);
        Objects.requireNonNull(contentType);

        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        Objects.requireNonNull(requestAttributes);
        HttpServletRequest request = requestAttributes.getRequest();
        HttpServletResponse response = requestAttributes.getResponse();
        Objects.requireNonNull(response);

        getLogger().verbose("[%s]请求响应content-type为 [%s] ", request.getRequestURI(),
                contentType);

        if (expiresTime != 0L) {
            getLogger().verbose("[%s]请求缓存时间为 [%s] ", request.getRequestURI(),
                    expiresTime + "");
            response.setDateHeader("Expires", System.currentTimeMillis() + expiresTime);
        }

        try {
            response.setContentType(contentType);

            IoUtil.copy(new FileInputStream(file), response.getOutputStream());
        }
        catch (IOException e) {
            e.printStackTrace();
            throw new ApiResponseException(Integer.parseInt(ErrorS.CODE_2.C), "读取资源文件");
        }
    }
}

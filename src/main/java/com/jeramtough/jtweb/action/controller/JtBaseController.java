package com.jeramtough.jtweb.action.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.WebApplicationContext;

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

}

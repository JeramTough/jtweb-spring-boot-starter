package com.jeramtough.jtweb.springconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * <pre>
 * Created on 2020/10/21 23:04
 * by @author WeiBoWen
 * </pre>
 */

@Configuration
@ComponentScan(basePackages = {
        "com.jeramtough.jtweb.action.aspect",
        "com.jeramtough.jtweb.component.optlog",
})
public class JtWebConfig extends WebMvcConfigurationSupport {


}

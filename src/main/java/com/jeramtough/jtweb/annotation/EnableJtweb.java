package com.jeramtough.jtweb.annotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * <pre>
 * Created on 2022/12/22 下午4:59
 * by @author WeiBoWen
 * </pre>
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import({com.jeramtough.jtweb.springconfig.JtSpringConfig.class,
        com.jeramtough.jtweb.springconfig.JsonConfig.class,
        com.jeramtough.jtweb.springconfig.JtWebConfig.class})
@Documented
public @interface EnableJtweb {
}

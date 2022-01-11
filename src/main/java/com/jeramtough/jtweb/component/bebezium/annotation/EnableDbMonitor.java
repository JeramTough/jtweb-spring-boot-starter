package com.jeramtough.jtweb.component.bebezium.annotation;

import com.jeramtough.jtweb.springconfig.JtDebeziumConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * <pre>
 * Created on 2021/4/21 13:57
 * by @author WeiBoWen
 * </pre>
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import({JtDebeziumConfig.class})
@Documented
public @interface EnableDbMonitor {
}

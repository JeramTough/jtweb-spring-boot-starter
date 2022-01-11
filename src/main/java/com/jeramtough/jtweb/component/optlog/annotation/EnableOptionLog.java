package com.jeramtough.jtweb.component.optlog.annotation;

import com.jeramtough.jtweb.component.optlog.config.OptLogComponentScanConfig;
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
@Import({OptLogComponentScanConfig.class})
@Documented
public @interface EnableOptionLog {
}

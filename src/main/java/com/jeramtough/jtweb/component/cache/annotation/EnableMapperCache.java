package com.jeramtough.jtweb.component.cache.annotation;

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
@Import({com.jeramtough.jtweb.springconfig.JtCacheConfig.class})
@Documented
public @interface EnableMapperCache {
}

package com.jeramtough.jtweb.component.cache.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <pre>
 * Created on 2021/8/15 上午11:26
 * by @author WeiBoWen
 * </pre>
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface BeCached {

    String value() default "";

    String cacheId() default "";

    /**
     * 默认缓存一分钟
     */
    long timed() default 1000L*60;
}

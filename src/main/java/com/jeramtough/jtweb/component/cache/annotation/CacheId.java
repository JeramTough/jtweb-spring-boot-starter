package com.jeramtough.jtweb.component.cache.annotation;

import java.lang.annotation.*;

/**
 * <pre>
 * Created on 2021/8/15 上午10:36
 * by @author WeiBoWen
 * </pre>
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.ANNOTATION_TYPE})
public @interface CacheId {
    String value() default "";
}

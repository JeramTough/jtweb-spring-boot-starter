package com.jeramtough.jtweb.component.cache.annotation;

import java.lang.annotation.*;

/**
 * <pre>
 * Created on 2021/8/15 上午11:26
 * by @author WeiBoWen
 * </pre>
 */
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface CacheMapper {

    String value() default "";

    Class<?> entity() default Object.class;


}

package com.jeramtough.jtweb.component.optlog.annotation;

import java.lang.annotation.*;

/**
 * <pre>
 * Created on 2021/2/21 4:01
 * by @author WeiBoWen
 * </pre>
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface IgnoreOptLog {

    boolean isIgnoreMethod() default true;

    boolean isIgnoreArgs() default true;

    boolean isIgnoreResponse() default true;

}

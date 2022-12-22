package com.jeramtough.jtweb.component.apiinfo.annotation;

import java.lang.annotation.*;

/**
 * <pre>
 *     将这个api记录到系统的标记注释
 *
 * Created on 2022/12/22 上午9:22
 * by @author WeiBoWen
 * </pre>
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RegApi {
}

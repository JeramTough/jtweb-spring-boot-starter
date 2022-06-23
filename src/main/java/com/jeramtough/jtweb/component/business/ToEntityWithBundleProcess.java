package com.jeramtough.jtweb.component.business;

import java.util.Map;

/**
 * <pre>
 * Created on 2020/10/24 15:09
 * by @author WeiBoWen
 * </pre>
 */
public interface ToEntityWithBundleProcess<T> {

    T toEntity(T t, Map<String, Object> bundle);

}

package com.jeramtough.jtweb.component.business.extractentity;

/**
 * <pre>
 * Created on 2021/8/13 下午3:27
 * by @author WeiBoWen
 * </pre>
 */
public interface ExtractEntityRunner<T> {

    T getEntity() throws Throwable;
}

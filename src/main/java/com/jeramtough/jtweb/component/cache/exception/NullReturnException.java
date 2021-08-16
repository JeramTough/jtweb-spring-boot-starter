package com.jeramtough.jtweb.component.cache.exception;

/**
 * <pre>
 * Created on 2021/8/15 下午6:05
 * by @author WeiBoWen
 * </pre>
 */
public class NullReturnException extends Exception {

    private final String methodKey;

    public NullReturnException(String methodKey) {
        this.methodKey = methodKey;
    }

    public String getMethodKey() {
        return methodKey;
    }
}

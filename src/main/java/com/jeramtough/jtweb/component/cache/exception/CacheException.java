package com.jeramtough.jtweb.component.cache.exception;

/**
 * <pre>
 * Created on 2021/8/15 下午6:05
 * by @author WeiBoWen
 * </pre>
 */
public class CacheException extends Exception {

    private final String methodKey;
    private final Exception exception;

    public CacheException(String methodKey, Exception exception) {
        this.methodKey = methodKey;
        this.exception = exception;
    }

    public String getMethodKey() {
        return methodKey;
    }


    public Exception getException() {
        return exception;
    }
}

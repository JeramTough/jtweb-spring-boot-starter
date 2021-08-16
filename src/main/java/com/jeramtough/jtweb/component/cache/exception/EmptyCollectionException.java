package com.jeramtough.jtweb.component.cache.exception;

import java.util.Collection;

/**
 * <pre>
 * Created on 2021/8/15 下午6:05
 * by @author WeiBoWen
 * </pre>
 */
public class EmptyCollectionException extends Exception {

    private final Class<? extends Collection> collectionClass;
    private final String methodKey;

    public EmptyCollectionException(
            Class<? extends Collection> collectionClass, String methodKey) {
        this.collectionClass = collectionClass;
        this.methodKey = methodKey;
    }

    public Class<? extends Collection> getCollectionClass() {
        return collectionClass;
    }


    public String getMethodKey() {
        return methodKey;
    }
}

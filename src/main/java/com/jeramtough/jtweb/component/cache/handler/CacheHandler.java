package com.jeramtough.jtweb.component.cache.handler;

import java.io.Serializable;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * <pre>
 * Created on 2021/8/12 下午4:19
 * by @author WeiBoWen
 * </pre>
 */
public interface CacheHandler {

    String get(String key);

    <T> T get(String key, Class<T> clazz);

    <D extends Serializable> void put(String key, D data);

    boolean containsKey(String key);

    void remove(String key);

    ReentrantReadWriteLock getRwLock();

    void setRwLock(ReentrantReadWriteLock rwLock);

}

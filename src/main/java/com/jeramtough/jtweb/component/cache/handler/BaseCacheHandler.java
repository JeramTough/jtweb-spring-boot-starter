package com.jeramtough.jtweb.component.cache.handler;

import com.jeramtough.jtlog.with.WithLogger;
import com.jeramtough.jtweb.component.cache.template.CacheTemplate;

import java.io.Serializable;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * <pre>
 * Created on 2021/8/12 下午11:07
 * by @author WeiBoWen
 * </pre>
 */
public abstract class BaseCacheHandler implements CacheHandler, WithLogger {

    private final CacheTemplate cacheTemplate;
    private ReentrantReadWriteLock rwLock;

    public BaseCacheHandler(
            CacheTemplate cacheTemplate) {
        this.cacheTemplate = cacheTemplate;
    }

    public CacheTemplate getCacheTemplate() {
        return cacheTemplate;
    }


    @Override
    public ReentrantReadWriteLock getRwLock() {
        return rwLock;
    }

    @Override
    public void setRwLock(ReentrantReadWriteLock rwLock) {
        this.rwLock = rwLock;
    }

}

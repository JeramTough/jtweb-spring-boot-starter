package com.jeramtough.jtweb.component.cache.template;

import cn.hutool.cache.CacheUtil;
import cn.hutool.cache.impl.TimedCache;
import com.jeramtough.jtweb.component.cache.handler.DefaultCacheHandler;

/**
 * <pre>
 * Created on 2021/8/13 上午1:34
 * by @author WeiBoWen
 * </pre>
 */
public class InMemoryCacheTemplate extends BaseCacheTemplate {

    protected TimedCache<String, String> timedCache;

    @Override
    public String get(String key) {
        lazyInit();
        String value = timedCache.get(key);
        return value;
    }

    @Override
    public void put(String key, String value) {
        lazyInit();
        timedCache.put(key, value, getRandomTimedCount());
    }

    @Override
    public boolean containsKey(String key) {
        lazyInit();
        return timedCache.containsKey(key);
    }

    @Override
    public void remove(String key) {
        lazyInit();
        timedCache.remove(key);
    }

    //***************************

    private void lazyInit() {
        if (timedCache == null) {
            synchronized (DefaultCacheHandler.class) {
                if (timedCache == null) {
                    timedCache = CacheUtil.newTimedCache(getBaseTimedCount());
                }
            }
        }
    }
}

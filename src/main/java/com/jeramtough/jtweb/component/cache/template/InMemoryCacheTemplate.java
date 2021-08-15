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
        long timed = getRandomTimedCount();
        //除非显式的配置0，不然都进不来
        if (timed != 0) {
            timedCache.put(key, value, timed);
        }
    }

    @Override
    public void putCachedObject(String key, Object o) {
        lazyInit();
        long timed = getConfigTimedCount(o);
        //除非显式的配置0，不然都进不来
        if (timed != 0) {
            timedCache.put(key, o.toString(), timed);
        }
    }

    @Override
    public void put(String key, String value, long outTimedMillisSecond) {
        lazyInit();
        long timed = outTimedMillisSecond;
        if (timed != 0) {
            timedCache.put(key, value, timed);
        }
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

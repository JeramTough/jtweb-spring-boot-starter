package com.jeramtough.jtweb.component.cache.template;

/**
 * <pre>
 * Created on 2021/8/13 上午1:22
 * by @author WeiBoWen
 * </pre>
 */
public interface CacheTemplate {

    void setBaseOutTimed(long baseOutTimed);

    String get(String key);

    void put(String key, String value);

    void putCachedObject(String key, Object o);

    void put(String key, String value,long outTimedMillisSecond);

    boolean containsKey(String key);

    void remove(String key);

}

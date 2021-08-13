package com.jeramtough.jtweb.component.cache.template;

/**
 * <pre>
 * Created on 2021/8/13 上午1:22
 * by @author WeiBoWen
 * </pre>
 */
public interface CacheTemplate {

    String get(String key);

    void put(String key, String value);

    boolean containsKey(String key);

    void remove(String key);

}

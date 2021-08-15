package com.jeramtough.jtweb.component.cache.handler;

import com.alibaba.fastjson.JSON;
import com.jeramtough.jtweb.component.cache.template.CacheTemplate;

import java.io.Serializable;
import java.util.Objects;

/**
 * <pre>
 * Created on 2021/8/12 下午4:31
 * by @author WeiBoWen
 * </pre>
 */
public class DefaultCacheHandler extends BaseCacheHandler {

    public DefaultCacheHandler(
            CacheTemplate cacheTemplate) {
        super(cacheTemplate);
    }

    @Override
    public String get(String key) {
        return getCacheTemplate().get(key);
    }

    @Override
    public <T> T get(String key, Class<T> clazz) {
        String json = this.get(key);
        if (json == null) {
            return null;
        }
        T data = JSON.parseObject(json, clazz);
        return data;
    }


    @Override
    public <D extends Serializable> void put(String key, D data) {
        Objects.requireNonNull(data);
        String json = JSON.toJSONString(data);
        getCacheTemplate().put(key, json);
    }

    @Override
    public <D extends Serializable> void put(String key, D data, long outTimed) {
        Objects.requireNonNull(data);
        String json = JSON.toJSONString(data);
        getCacheTemplate().put(key, json, outTimed);
    }

    @Override
    public boolean containsKey(String key) {
        return getCacheTemplate().containsKey(key);
    }

    @Override
    public void remove(String key) {
        getCacheTemplate().remove(key);
    }

    //***************


}

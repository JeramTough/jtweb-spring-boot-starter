package com.jeramtough.jtweb.component.cache.template;

import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.concurrent.TimeUnit;

/**
 * <pre>
 * Created on 2021/8/13 上午1:23
 * by @author WeiBoWen
 * </pre>
 */
public class RedisCacheTemplate extends BaseCacheTemplate {

    private final StringRedisTemplate stringRedisTemplate;

    public RedisCacheTemplate(
            StringRedisTemplate stringRedisTemplate) {
        this.stringRedisTemplate = stringRedisTemplate;
    }

    @Override
    public String get(String key) {
        return stringRedisTemplate.boundValueOps(key).get();
    }

    @Override
    public void put(String key, String value) {
        stringRedisTemplate.boundValueOps(key).set(value, getRandomTimedCount(),
                TimeUnit.MILLISECONDS);
    }

    @Override
    public boolean containsKey(String key) {
        if (stringRedisTemplate.hasKey(key) == null) {
            return false;
        }

        Boolean has = stringRedisTemplate.hasKey(key);
        return has != null && has;
    }

    @Override
    public void remove(String key) {
        stringRedisTemplate.delete(key);
    }
}

package com.jeramtough.jtweb.component.cache.template;

import cn.hutool.core.util.RandomUtil;

/**
 * <pre>
 * Created on 2021/8/13 上午1:25
 * by @author WeiBoWen
 * </pre>
 */
public abstract class BaseCacheTemplate implements CacheTemplate {

    /**
     * 十分钟,过时基数
     */
    private static final Integer BASE_TIMED_COUNT = 10;

    /**
     * 偏移基数，10+3 || 10-3
     */
    private static final Integer OFFSET_TIMED_COUNT = 3;


    protected int getRandomTimedCount() {
        int random = RandomUtil.randomInt(BASE_TIMED_COUNT - OFFSET_TIMED_COUNT,
                BASE_TIMED_COUNT + OFFSET_TIMED_COUNT);
        return random * 1000 * 60;
    }

    protected int getBaseTimedCount() {
        return BASE_TIMED_COUNT * 1000 * 60;
    }


}

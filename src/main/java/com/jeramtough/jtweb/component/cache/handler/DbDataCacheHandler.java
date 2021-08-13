package com.jeramtough.jtweb.component.cache.handler;

import com.jeramtough.jtcomponent.task.bean.TaskResult;
import com.jeramtough.jtweb.component.business.extractentity.ExtractEntityRunner;
import com.jeramtough.jtweb.component.cache.bean.DbDataKey;

/**
 * <pre>
 * Created on 2021/8/13 上午12:02
 * by @author WeiBoWen
 * </pre>
 */
public interface DbDataCacheHandler extends CacheHandler {

    /**
     * 添加数据库表关联关系的键值对缓存
     */
    <T> void put(String key, DbDataKey dbDataKey, T data);

    <T> void put(String cacheKey, TaskResult taskResult, Class<T> clazz);

    <T> void put(String cacheKey, Class<T> clazz, ExtractEntityRunner<T> runner);

}

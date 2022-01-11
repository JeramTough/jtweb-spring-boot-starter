package com.jeramtough.jtweb.component.cache.handler;

import com.jeramtough.jtweb.component.business.extractentity.ExtractEntityRunner;
import com.jeramtough.jtweb.component.cache.bean.DbDataKey;

import java.util.List;

/**
 * <pre>
 * Created on 2021/8/13 上午12:02
 * by @author WeiBoWen
 * </pre>
 */
public interface DbDataCacheHandler extends CacheHandler {

    boolean containsKey(String cacheKey, DbDataKey dbDataKey);

    Object get(String cacheKey, DbDataKey dbDataKey);

    /**
     * 添加数据库表关联关系的键值对缓存
     */
    <T> void put(String cacheKey, List<DbDataKey> dbDataKeys, T data);


    /**
     * 返回实体对象的返回类型
     */
    DbDataKey put(String cacheKey, ExtractEntityRunner<Object> runner) throws Exception;

}

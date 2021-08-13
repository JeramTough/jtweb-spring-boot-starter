package com.jeramtough.jtweb.component.cache.handler;

import com.alibaba.fastjson.JSON;
import com.jeramtough.jtcomponent.task.bean.TaskResult;
import com.jeramtough.jtweb.component.bebezium.event.DbDataChangedEvent;
import com.jeramtough.jtweb.component.bebezium.listener.DbDataChangedListener;
import com.jeramtough.jtweb.component.bebezium.subscriber.DebeziumSubscriber;
import com.jeramtough.jtweb.component.business.extractentity.ExtractEntityRunner;
import com.jeramtough.jtweb.component.cache.bean.DbDataKey;
import com.jeramtough.jtweb.component.cache.factory.DbDataKeyFactory;
import com.jeramtough.jtweb.component.cache.template.CacheTemplate;

import java.util.Objects;

/**
 * <pre>
 * Created on 2021/8/12 下午4:31
 * by @author WeiBoWen
 * </pre>
 */
public class DefaultDbDataCacheHandler extends DefaultCacheHandler
        implements DbDataCacheHandler, DbDataChangedListener {

    private final DebeziumSubscriber debeziumSubscriber;


    public DefaultDbDataCacheHandler(
            CacheTemplate cacheTemplate,
            DebeziumSubscriber debeziumSubscriber) {
        super(cacheTemplate);
        this.debeziumSubscriber = debeziumSubscriber;

        debeziumSubscriber.addListener(this);
    }

    @Override
    public <T> void put(String key, DbDataKey dbDataKey, T data) {
        Objects.requireNonNull(data);
        String json = JSON.toJSONString(data);

        //先把普通的键值模式的进行添加
        this.put(key, json);

        //进行数据库表数据关联关系的键值添加
        String key2 = dbDataKey.toString();
        this.put(key2, json);
    }


    @Override
    public <T> void put(String cacheKey, TaskResult taskResult, Class<T> clazz) {

    }

    @Override
    public <T> void put(String cacheKey, Class<T> clazz, ExtractEntityRunner<T> runner) {
        if (getRwLock() != null) {
            getRwLock().writeLock().lock();
        }

        try {
            T entity = runner.getEntity();
            if (entity != null) {
                DbDataKey dbDataKey = DbDataKeyFactory.getDbDataKey(entity);
                this.put(cacheKey, dbDataKey, entity);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        finally {
            if (getRwLock() != null) {
                getRwLock().writeLock().unlock();
            }
        }
    }


    @Override
    public void onChanged(DbDataChangedEvent dbDataChangedEvent) {
        if (getRwLock() != null) {
            getRwLock().writeLock().lock();
        }
        DbDataKey dbDataKey = DbDataKeyFactory.getDbDataKey(dbDataChangedEvent);
        if (dbDataKey != null) {
            String key = dbDataKey.toString();
            super.getCacheTemplate().remove(key);
        }
        if (getRwLock() != null) {
            getRwLock().writeLock().unlock();
        }
    }

    //*********************


}

package com.jeramtough.jtweb.component.cache.handler;

import cn.hutool.core.util.IdUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jeramtough.jtweb.component.bebezium.event.DbDataChangedEvent;
import com.jeramtough.jtweb.component.bebezium.listener.DbDataChangedListener;
import com.jeramtough.jtweb.component.bebezium.subscriber.DebeziumSubscriber;
import com.jeramtough.jtweb.component.business.extractentity.ExtractEntityRunner;
import com.jeramtough.jtweb.component.cache.bean.DbDataKey;
import com.jeramtough.jtweb.component.cache.exception.CacheException;
import com.jeramtough.jtweb.component.cache.exception.EmptyCollectionException;
import com.jeramtough.jtweb.component.cache.exception.NullReturnException;
import com.jeramtough.jtweb.component.cache.factory.DbDataKeyFactory;
import com.jeramtough.jtweb.component.cache.template.CacheTemplate;
import com.jeramtough.jtweb.component.cache.util.JtCacheUtil;

import java.util.*;
import java.util.stream.Collectors;

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
    public boolean containsKey(String cacheKey, DbDataKey dbDataKey) {
        if (getRwLock() != null) {
            getRwLock().readLock().lock();
        }

        try {
            if (dbDataKey == null) {
                return false;
            }

            Map<String, String> cacheKeyDataKeyMap = getCacheKeyDataKeyMap(dbDataKey);
            if (cacheKeyDataKeyMap.isEmpty()) {
                return false;
            }

            String dataKey = cacheKeyDataKeyMap.get(cacheKey);
            return getCacheTemplate().containsKey(dataKey);
        }
        finally {
            if (getRwLock() != null) {
                getRwLock().readLock().unlock();
            }
        }
    }

    @Override
    public Object get(String cacheKey, DbDataKey dbDataKey) {
        if (getRwLock() != null) {
            getRwLock().readLock().lock();
        }

        try {
            Objects.requireNonNull(dbDataKey);
            Objects.requireNonNull(dbDataKey.getDataClass());

            Map<String, String> cacheKeyDataKeyMap = getCacheKeyDataKeyMap(dbDataKey);
            String dataKey = cacheKeyDataKeyMap.get(cacheKey);
            String dataJson = getCacheTemplate().get(dataKey);

            if (dbDataKey.getWrapperClass() == null) {
                Objects.requireNonNull(dataJson);
                Object o = JSON.parseObject(dataJson, dbDataKey.getDataClass());
                return o;
            }
            else {
                JSONArray jsonArray = JSON.parseArray(dataJson);
                if (dbDataKey.getWrapperClass() == List.class) {
                    List<?> list = jsonArray
                            .stream()
                            .map(JSON::toJSONString)
                            .map(jsonStr -> JSON.parseObject(jsonStr,
                                    dbDataKey.getDataClass()))
                            .collect(Collectors.toList());
                    return list;
                }
                else if (dbDataKey.getWrapperClass() == Set.class) {
                    Set<?> set = jsonArray
                            .parallelStream()
                            .map(JSON::toJSONString)
                            .map(jsonStr -> JSON.parseObject(jsonStr,
                                    dbDataKey.getDataClass()))
                            .collect(Collectors.toSet());
                    return set;
                }

                throw new NullPointerException(
                        "不能正确解析" + dbDataKey.getDataClass().getName() + "," + dbDataKey.getWrapperClass().getName());
            }
        }
        finally {
            if (getRwLock() != null) {
                getRwLock().readLock().unlock();
            }
        }
    }

    @Override
    public <T> void put(String cacheKey, List<DbDataKey> dbDataKeys, T data) {
        Objects.requireNonNull(data);
        String json = JSON.toJSONString(data);

        //获取超时时间
        final Long outTimed = JtCacheUtil.getOutTimedFromCacheObject(data);

        //先存数据key,和数据data
        String dataKey = data.hashCode() + "_" + IdUtil.fastSimpleUUID();
        if (outTimed == null) {
            this.getCacheTemplate().put(dataKey, json);
        }
        else {
            this.getCacheTemplate().put(dataKey, json, outTimed + 1000);
        }

        //进行数据库表和数据的key进行关联关系的键值添加
        dbDataKeys
                .parallelStream()
                .forEach(dbDataKey -> {
                    if (dbDataKey != null) {
                        Map<String, String> cacheKeyDataKeyMap = getCacheKeyDataKeyMap(
                                dbDataKey);
                        cacheKeyDataKeyMap.put(cacheKey, dataKey);
                        setCacheKeyDataKeyMap(dbDataKey, cacheKeyDataKeyMap, outTimed);
                    }
                });

    }


    @Override
    public DbDataKey put(String cacheKey, ExtractEntityRunner<Object> runner) throws
            Exception {
        if (getRwLock() != null) {
            getRwLock().writeLock().lock();
        }

        try {
            Object returnObject = runner.getEntity();

            //能从数据库获取到数据的情况下
            if (returnObject != null) {
                if (returnObject instanceof List) {
                    List<?> returnList = (List<?>) returnObject;
                    List<DbDataKey> dbDataKeys = DbDataKeyFactory.getDbDataKey(returnList);
                    if (!dbDataKeys.isEmpty()) {
                        this.put(cacheKey, dbDataKeys, returnObject);
                        //这里必须有数据
                        return dbDataKeys.get(0);
                    }
                    else {
                        throw new EmptyCollectionException(List.class, cacheKey);
                    }

                }
                if (returnObject instanceof Set) {
                    Set<?> returnSet = (Set<?>) returnObject;
                    List<DbDataKey> dbDataKeys = DbDataKeyFactory.getDbDataKey(returnSet);
                    if (!dbDataKeys.isEmpty()) {
                        this.put(cacheKey, dbDataKeys, returnObject);
                        //这里必须有数据
                        return dbDataKeys.get(0);
                    }
                    else {
                        throw new EmptyCollectionException(Set.class, cacheKey);
                    }

                }
                else if (returnObject instanceof Page) {

                }
                else {
                    List<DbDataKey> dbDataKeys = DbDataKeyFactory.getDbDataKey(returnObject);
                    this.put(cacheKey, dbDataKeys, returnObject);
                    //这里必须有数据
                    return dbDataKeys.get(0);
                }

            }
            //正常执行，但是数据库没有数据
            else {
                NullReturnException nullReturnException = new NullReturnException(cacheKey);
                throw nullReturnException;
            }
        }
        catch (EmptyCollectionException | NullReturnException e) {
            throw e;
        }
        catch (Exception e) {
            e.printStackTrace();
            CacheException cacheException = new CacheException(cacheKey, e);
            throw cacheException;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        finally {
            if (getRwLock() != null) {
                getRwLock().writeLock().unlock();
            }
        }
        return null;
    }


    @Override
    public void onChanged(DbDataChangedEvent dbDataChangedEvent) {
        if (getRwLock() != null) {
            getRwLock().writeLock().lock();
        }

        DbDataKey dbDataKey = DbDataKeyFactory.getDbDataKey(dbDataChangedEvent);

        Map<String, String> cacheKeyDataKeyMap = getCacheKeyDataKeyMap(dbDataKey);
        cacheKeyDataKeyMap
                .entrySet()
                .parallelStream()
                .forEach(entry -> {
                    String dataKey = entry.getValue();
                    getCacheTemplate().remove(dataKey);
                });
        getCacheTemplate().remove(dbDataKey.toKey1());
        getCacheTemplate().remove(dbDataKey.toKey2());

        if (getRwLock() != null) {
            getRwLock().writeLock().unlock();
        }
    }

    //*********************


    private Map<String, String> getCacheKeyDataKeyMap(DbDataKey dbDataKey) {
        //两种key去获取json
        String mapJson = getCacheTemplate().get(dbDataKey.toKey1());
        if (mapJson == null) {
            mapJson = getCacheTemplate().get(dbDataKey.toKey2());
        }

        Map<String, String> cacheKeyDataKeyMap;
        if (mapJson == null) {
            cacheKeyDataKeyMap = new HashMap<>();
        }
        else {
            cacheKeyDataKeyMap = JSON.parseObject(mapJson, Map.class);
        }
        return cacheKeyDataKeyMap;
    }

    private void setCacheKeyDataKeyMap(DbDataKey dbDataKey,
                                       Map<String, String> cacheKeyDataKeyMap
            , Long outTimed) {
        String mapJson = JSON.toJSONString(cacheKeyDataKeyMap);
        if (outTimed == null) {
            getCacheTemplate().put(dbDataKey.toString(), mapJson);
        }
        else {
            getCacheTemplate().put(dbDataKey.toString(), mapJson, outTimed);
        }
    }

}

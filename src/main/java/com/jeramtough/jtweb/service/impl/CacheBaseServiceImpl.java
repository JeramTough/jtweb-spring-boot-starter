package com.jeramtough.jtweb.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jeramtough.jtlog.with.WithLogger;
import com.jeramtough.jtweb.component.apiresponse.exception.ApiResponseException;
import com.jeramtough.jtweb.component.cache.handler.DefaultDbDataCacheHandler;
import com.jeramtough.jtweb.model.error.ErrorU;
import com.jeramtough.jtweb.service.CacheBaseService;
import org.springframework.web.context.WebApplicationContext;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * <pre>
 * Created on 2020/10/25 16:43
 * by @author WeiBoWen
 * </pre>
 */
public abstract class CacheBaseServiceImpl<M extends BaseMapper<T>, T, D>
        extends JtBaseServiceImpl<M, T, D> implements CacheBaseService<T, D>, WithLogger {

    /**
     * 是否正在进行取数据库数据到缓存操作
     */
    private boolean isRunning = false;

    private final DefaultDbDataCacheHandler dbDataCacheHandler;

    /**
     * 读写锁
     */
    private final ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();

    public CacheBaseServiceImpl(WebApplicationContext wc) {
        super(wc);

        dbDataCacheHandler = wc.getBean(DefaultDbDataCacheHandler.class);
        dbDataCacheHandler.setRwLock(rwLock);
    }

    @Override
    public T getOne(final Wrapper<T> queryWrapper) {
        String cacheKey = this.getEntityClass().getName() + "_" + queryWrapper.getTargetSql();

        if (!dbDataCacheHandler.containsKey(cacheKey)) {
            //写入缓存线程只开启一条
            if (!isRunning) {
                isRunning = true;
                getLogger().debug("数据库缓存池没有【%s】数据，准备开启子线程去填充数据", cacheKey);
                //内部会上写锁
                dbDataCacheHandler.put(cacheKey, getEntityClass(),
                        () -> CacheBaseServiceImpl.super.getOne(queryWrapper));
            }
        }

        //所有数据库读取操作阻塞在这里，上读锁
        T entity = dbDataCacheHandler.get(cacheKey, getEntityClass());
        if (entity == null) {
            throw new ApiResponseException(ErrorU.CODE_9.C, "fid对应");
        }
        return entity;
    }

    @Override
    public T getById(Serializable id) {
        String cacheKey = this.getEntityClass().getName() + "_" + "id=" + id;

        if (!dbDataCacheHandler.containsKey(cacheKey)) {
            //写入缓存线程只开启一条
            if (!isRunning) {
                isRunning = true;
                getLogger().debug("数据库缓存池没有【%s】数据，准备开启子线程去填充数据", cacheKey);
                //内部会上写锁
                dbDataCacheHandler.put(cacheKey, getEntityClass(),
                        () -> CacheBaseServiceImpl.super.getById(id));
            }
        }

        //所有数据库读取操作阻塞在这里，上读锁
        T entity = dbDataCacheHandler.get(cacheKey, getEntityClass());
        if (entity == null) {
            throw new ApiResponseException(ErrorU.CODE_9.C, "fid对应");
        }
        return entity;
    }

    @Override
    public List<T> listByIds(Collection<? extends Serializable> idList) {
        return super.listByIds(idList);
    }

    @Override
    public List<T> list(Wrapper<T> queryWrapper) {
        return super.list(queryWrapper);
    }


    @Override
    public List<T> listByMap(Map<String, Object> columnMap) {
        return super.listByMap(columnMap);
    }

    @Override
    public Map<String, Object> getMap(Wrapper<T> queryWrapper) {
        return super.getMap(queryWrapper);
    }

    @Override
    public List<Map<String, Object>> listMaps() {
        return super.listMaps();
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<T> queryWrapper) {
        return super.listMaps(queryWrapper);
    }

    @Override
    public <E extends IPage<T>> E page(E page) {
        return super.page(page);
    }

    @Override
    public <E extends IPage<Map<String, Object>>> E pageMaps(E page) {
        return super.pageMaps(page);
    }

    @Override
    public <E extends IPage<T>> E page(E page, Wrapper<T> queryWrapper) {
        return super.page(page, queryWrapper);
    }

    @Override
    public <E extends IPage<Map<String, Object>>> E pageMaps(E page, Wrapper<T> queryWrapper) {
        return super.pageMaps(page, queryWrapper);
    }


    //***********************************

    //{{{{{{{{{{}}}}}}}}}}}}}}}


}

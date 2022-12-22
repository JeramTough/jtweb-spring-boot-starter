package com.jeramtough.jtweb.component.cache.aspect;

import com.alibaba.fastjson2.JSON;
import com.jeramtough.jtlog.with.WithLogger;
import com.jeramtough.jtweb.component.aspect.MethodGather;
import com.jeramtough.jtweb.component.business.extractentity.ExtractEntityRunner;
import com.jeramtough.jtweb.component.cache.annotation.IgnoreCache;
import com.jeramtough.jtweb.component.cache.bean.DbDataKey;
import com.jeramtough.jtweb.component.cache.exception.CacheException;
import com.jeramtough.jtweb.component.cache.exception.EmptyCollectionException;
import com.jeramtough.jtweb.component.cache.exception.NullReturnException;
import com.jeramtough.jtweb.component.cache.handler.DbDataCacheHandler;
import com.jeramtough.jtweb.component.cache.setting.JtCacheSetting;
import com.jeramtough.jtweb.component.cache.util.JtCacheUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * <pre>
 * Created on 2021/8/15 上午8:42
 * by @author WeiBoWen
 * </pre>
 */
@Aspect
@Component
public class MapperCacheAspect extends BaseCacheAspect implements WithLogger {

    private final MethodHandler methodHandler;

    @Autowired
    protected MapperCacheAspect(
            WebApplicationContext webApplicationContext,
            DbDataCacheHandler dbDataCacheHandler,
            JtCacheSetting jtCacheSetting) {
        super(webApplicationContext, dbDataCacheHandler, jtCacheSetting);

        methodHandler = new MethodHandler();
    }

    /**
     * 切入点
     */
    @Pointcut("@within(org.apache.ibatis.annotations.Mapper)||" +
            "@within(com.jeramtough.jtweb.component.cache.annotation.CacheMapper)||" +
            "target(com.jeramtough.jtweb.component.cache.mapper.CacheMapper)||" +
            "target(com.baomidou.mybatisplus.core.mapper.BaseMapper)")
//    @Pointcut("target(com.baomidou.mybatisplus.core.mapper.BaseMapper)")
    public void pointCut() {
    }


    @Around("pointCut()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            if (!super.jtCacheSetting.isEnableMapper()) {
                getLogger().debug("isAble=false,mapper缓存禁用！");
                return joinPoint.proceed();
            }

            Method aspectMethod = MethodGather.getAspectMethod(joinPoint);
            if (aspectMethod == null) {
                getLogger().warn("获取切面方法失败！");
                return joinPoint.proceed();
            }

            //先拿类的注释，如果方法有在用方法的代替
            IgnoreCache ignoreCacheAnnotation =
                    joinPoint.getTarget().getClass().getDeclaredAnnotation(IgnoreCache.class);
            if (aspectMethod.getDeclaredAnnotation(IgnoreCache.class) != null) {
                ignoreCacheAnnotation = aspectMethod.getDeclaredAnnotation(IgnoreCache.class);
            }

            if (ignoreCacheAnnotation != null) {
                getLogger().debug("ignoreCache=true,忽略该mapper【%s】缓存！", aspectMethod.getName());
                return joinPoint.proceed();
            }

            //得到方法和参数组成的key
            String cacheMethodKey = JtCacheUtil.generateKey(joinPoint);

            boolean hasCache = super.dbDataCacheHandler.containsKey(cacheMethodKey,
                    methodHandler.getMethodReturnDbDataKey(cacheMethodKey));
            if (hasCache) {
                getLogger().debug("执行mapper方法：[%s] 已存在缓存！", cacheMethodKey);
            }
            if (!hasCache) {
                //写入缓存线程只开启一条
                if (!methodHandler.isRunning(cacheMethodKey)) {
                    getLogger().debug("数据库缓存池没有【%s】数据，准备开启子线程去填充数据", cacheMethodKey);

                    //上读写锁
                    ReentrantReadWriteLock reLock =
                            methodHandler.getRwLock(cacheMethodKey);
                    super.dbDataCacheHandler.setRwLock(reLock);

                    //执行mapper操作并把数据库结果添加到缓存，DbDataKey为方法返回的类型
                    DbDataKey dbDataKey = super.dbDataCacheHandler.put(cacheMethodKey,
                            (ExtractEntityRunner<Object>) joinPoint::proceed);

                    //把该方法返回的类型缓存起来，这个要永久保存
                    methodHandler.setMethodReturnDbDataKey(cacheMethodKey, dbDataKey);

                    getLogger().debug("给mapper方法：[%s] 添加缓存成功！[%s]"
                            , cacheMethodKey,
                            dbDataKey.getIdValue());
                    methodHandler.resetRunning(cacheMethodKey);
                }
            }

            //所有数据库读取操作阻塞在这里，内部会上读锁
            DbDataKey dbDataKey = methodHandler
                    .getMethodReturnDbDataKey(cacheMethodKey);
            Objects.requireNonNull(dbDataKey);
            Object entity = dbDataCacheHandler.get(cacheMethodKey, dbDataKey);
            return entity;
        }
        catch (EmptyCollectionException e) {
            methodHandler.resetRunning(e.getMethodKey());
            if (e.getCollectionClass() == List.class) {
                return new ArrayList<>(0);
            }
            else if (e.getCollectionClass() == Set.class) {
                return new HashSet<>(0);
            }
            return joinPoint.proceed();
        }
        catch (NullReturnException e) {
            //mapper返回null时执行这里
            methodHandler.resetRunning(e.getMethodKey());
            return null;
        }
        catch (CacheException e) {
            methodHandler.resetRunning(e.getMethodKey());
            e.printStackTrace();
            return joinPoint.proceed();
        }

    }

    //{{{{{}}}}}}}}

    private class MethodHandler {

        private final Map<String, ReentrantReadWriteLock> rwLockMap = new HashMap<>();

        public boolean isRunning(String method) {
            String key = MapperCacheAspect.class.getSimpleName() +
                    "_" + method + "_isRunning";
            String isRunning =
                    getDbDataCacheHandler().get(key);
            if (isRunning == null) {
                //第一次进入返回假,并进入提取线程可运行状态
                getDbDataCacheHandler().put(key, true);
                return false;
            }
            else {
                return Boolean.parseBoolean(isRunning);
            }
        }

        public void resetRunning(String method) {
            String key = MapperCacheAspect.class.getSimpleName() +
                    "_" + method + "_isRunning";
            getDbDataCacheHandler().put(key, false);
        }

        public ReentrantReadWriteLock getRwLock(String method) {
            ReentrantReadWriteLock lock = rwLockMap.get(method);
            if (lock == null) {
                lock = new ReentrantReadWriteLock();
                rwLockMap.put(method, lock);
            }
            return lock;
        }

        public DbDataKey getMethodReturnDbDataKey(String method) {
            String key = MapperCacheAspect.class.getSimpleName() +
                    "_" + method + "_dbDataKey";
            String json =
                    getDbDataCacheHandler().get(key);
            if (json == null) {
                return null;
            }
            else {
                return JSON.parseObject(json, DbDataKey.class);
            }
        }

        public void setMethodReturnDbDataKey(String method, DbDataKey dbDataKey) {
            Objects.requireNonNull(dbDataKey);
            String key = MapperCacheAspect.class.getSimpleName() +
                    "_" + method + "_dbDataKey";
            getDbDataCacheHandler().put(key, dbDataKey);
        }

    }
}

package com.jeramtough.jtweb.component.cache.aspect;

import com.jeramtough.jtweb.component.cache.handler.DbDataCacheHandler;
import com.jeramtough.jtweb.component.cache.setting.JtCacheSetting;
import com.jeramtough.jtweb.component.optlog.core.ApiHistoryInfoHandler;
import org.springframework.web.context.WebApplicationContext;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * <pre>
 * Created on 2020/12/7 16:28
 * by @author WeiBoWen
 * </pre>
 */
public abstract class BaseCacheAspect {
    protected final WebApplicationContext webApplicationContext;
    protected final DbDataCacheHandler dbDataCacheHandler;
    protected final JtCacheSetting jtCacheSetting;

    protected final ExecutorService executorService;


    protected BaseCacheAspect(WebApplicationContext webApplicationContext,
                              DbDataCacheHandler dbDataCacheHandler,
                              JtCacheSetting jtCacheSetting) {
        this.webApplicationContext = webApplicationContext;
        this.dbDataCacheHandler = dbDataCacheHandler;
        this.jtCacheSetting = jtCacheSetting;

        executorService = new ThreadPoolExecutor(0, Integer.MAX_VALUE,
                60L, TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>());
    }

    public ApiHistoryInfoHandler getApiHistoryInfoHandler() {
        ApiHistoryInfoHandler apiHistoryInfoHandler = webApplicationContext.getBean(ApiHistoryInfoHandler.class);
        return apiHistoryInfoHandler;
    }

    public WebApplicationContext getWC() {
        return webApplicationContext;
    }

    public DbDataCacheHandler getDbDataCacheHandler() {
        return dbDataCacheHandler;
    }
}

package com.jeramtough.jtweb.action.aspect;

import com.jeramtough.jtweb.component.optlog.config.OptLoggerConfig;
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
public abstract class BaseLogAspect {
    protected final WebApplicationContext webApplicationContext;

    protected final ExecutorService executorService;

    private final OptLoggerConfig optLoggerConfig;

    protected BaseLogAspect(WebApplicationContext webApplicationContext,
                            OptLoggerConfig optLoggerConfig) {
        this.webApplicationContext = webApplicationContext;
        this.optLoggerConfig = optLoggerConfig;

        executorService = new ThreadPoolExecutor(0, Integer.MAX_VALUE,
                60L, TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>());
    }

    public ApiHistoryInfoHandler getApiHistoryInfoHandler() {
        ApiHistoryInfoHandler apiHistoryInfoHandler = webApplicationContext.getBean(ApiHistoryInfoHandler.class);
        return apiHistoryInfoHandler;
    }

    public OptLoggerConfig getOptLoggerConfig() {
        return optLoggerConfig;
    }

    public WebApplicationContext getWC() {
        return webApplicationContext;
    }
}

package com.jeramtough.jtweb.springconfig;

import com.jeramtough.jtweb.component.bebezium.subscriber.DebeziumSubscriber;
import com.jeramtough.jtweb.component.cache.handler.DbDataCacheHandler;
import com.jeramtough.jtweb.component.cache.handler.DefaultDbDataCacheHandler;
import com.jeramtough.jtweb.component.cache.setting.JtCacheSetting;
import com.jeramtough.jtweb.component.cache.template.CacheTemplate;
import com.jeramtough.jtweb.component.cache.template.CacheType;
import com.jeramtough.jtweb.component.cache.template.InMemoryCacheTemplate;
import com.jeramtough.jtweb.component.cache.template.RedisCacheTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.*;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.context.WebApplicationContext;

import java.util.Objects;

/**
 * <pre>
 * Created on 2021/8/13 下午11:16
 * by @author WeiBoWen
 * </pre>
 */
@Configuration
@ComponentScan(
        value = {
                "com.jeramtough.jtweb.component.cache",
        },
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,
                value = {})})
public class JtCacheConfig {

    private final WebApplicationContext webApplicationContext;
    private final JtCacheSetting jtCacheSetting;

    @Autowired
    public JtCacheConfig(
            WebApplicationContext webApplicationContext,
            JtCacheSetting jtCacheSetting) {
        this.webApplicationContext = webApplicationContext;
        this.jtCacheSetting = jtCacheSetting;
    }

    @Bean
    @ConditionalOnMissingBean(CacheTemplate.class)
    public CacheTemplate cacheTemplate() {
        CacheType cacheType = CacheType.valueOf(
                jtCacheSetting.getType().toUpperCase().trim());
        CacheTemplate cacheTemplate;
        switch (cacheType) {
            default:
            case MEMORY:
                cacheTemplate = new InMemoryCacheTemplate();
                break;
            case REDIS:
                StringRedisTemplate stringRedisTemplate =
                        webApplicationContext.getBean(StringRedisTemplate.class);
                cacheTemplate = new RedisCacheTemplate(stringRedisTemplate);
                break;
        }
        Objects.requireNonNull(cacheTemplate);
        cacheTemplate.setBaseOutTimed(jtCacheSetting.getOutTimed());
        return cacheTemplate;
    }


    /*@Bean("dbDataCacheHandler")
    @Primary
    @ConditionalOnBean({DebeziumSubscriber.class, CacheTemplate.class})
    public DbDataCacheHandler dbDataCacheHandler() {
        CacheTemplate cacheTemplate = webApplicationContext.getBean(CacheTemplate.class);
        DebeziumSubscriber debeziumSubscriber = webApplicationContext.getBean(
                DebeziumSubscriber.class);
        DbDataCacheHandler dbDataCacheHandler = new DefaultDbDataCacheHandler(cacheTemplate,
                debeziumSubscriber);
        return dbDataCacheHandler;
    }*/



    /*@Bean("defaultOptLoggerConfig")
    @ConditionalOnMissingBean(OptLoggerConfig.class)
    public OptLoggerConfig optLoggerConfig() {
        return new OptLoggerConfig() {

            @Override
            public String getExpandInfo() {
                return null;
            }

            @Override
            public Boolean isAble() {
                return false;
            }

            @Override
            public LogChannel[] logChanels() {
                return new LogChannel[0];
            }
        };

    }*/

}

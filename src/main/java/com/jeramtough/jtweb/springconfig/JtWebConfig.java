package com.jeramtough.jtweb.springconfig;

import com.jeramtough.jtweb.component.bebezium.subscriber.DebeziumSubscriber;
import com.jeramtough.jtweb.component.cache.handler.CacheHandler;
import com.jeramtough.jtweb.component.cache.handler.DbDataCacheHandler;
import com.jeramtough.jtweb.component.cache.handler.DefaultCacheHandler;
import com.jeramtough.jtweb.component.cache.handler.DefaultDbDataCacheHandler;
import com.jeramtough.jtweb.component.cache.template.CacheTemplate;
import com.jeramtough.jtweb.component.cache.template.CacheType;
import com.jeramtough.jtweb.component.cache.template.InMemoryCacheTemplate;
import com.jeramtough.jtweb.component.cache.template.RedisCacheTemplate;
import com.jeramtough.jtweb.springconfig.properties.JtwebProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.context.WebApplicationContext;

/**
 * <pre>
 * Created on 2020/10/21 23:04
 * by @author WeiBoWen
 * </pre>
 */

@Configuration
@ComponentScan(basePackages = {
        "com.jeramtough.jtweb.action.aspect",
})
public class JtWebConfig {


    private final WebApplicationContext webApplicationContext;
    private final JtwebProperties jtwebProperties;

    @Autowired
    public JtWebConfig(
            WebApplicationContext webApplicationContext,
            JtwebProperties jtwebProperties) {
        this.webApplicationContext = webApplicationContext;
        this.jtwebProperties = jtwebProperties;
    }

    @Bean
    @ConditionalOnMissingBean(CacheTemplate.class)
    public CacheTemplate cacheTemplate() {
        CacheType cacheType = CacheType.valueOf(
                jtwebProperties.getCacheType().toUpperCase().trim());
        switch (cacheType) {
            case MEMORY:
                return new InMemoryCacheTemplate();
            case REDIS:
                StringRedisTemplate stringRedisTemplate =
                        webApplicationContext.getBean(StringRedisTemplate.class);
                return new RedisCacheTemplate(stringRedisTemplate);
            default:
                return null;
        }
    }

    @Primary
    @Bean("cacheHandler")
    @ConditionalOnBean(CacheTemplate.class)
    public CacheHandler cacheHandler() {
        CacheTemplate cacheTemplate = webApplicationContext.getBean(CacheTemplate.class);
        CacheHandler cacheHandler = new DefaultCacheHandler(cacheTemplate);
        return cacheHandler;
    }

    @Bean("dbDataCacheHandler")
    @Primary
    @ConditionalOnBean({DebeziumSubscriber.class, CacheTemplate.class})
    public DbDataCacheHandler dbDataCacheHandler() {
        CacheTemplate cacheTemplate = webApplicationContext.getBean(CacheTemplate.class);
        DebeziumSubscriber debeziumSubscriber = webApplicationContext.getBean(
                DebeziumSubscriber.class);
        DbDataCacheHandler dbDataCacheHandler = new DefaultDbDataCacheHandler(cacheTemplate,
                debeziumSubscriber);
        return dbDataCacheHandler;
    }



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

package com.jeramtough.jtweb.springconfig;

import com.jeramtough.jtweb.component.bebezium.publisher.PublisherType;
import com.jeramtough.jtweb.component.bebezium.publisher.RedisDebeziumPublisher;
import com.jeramtough.jtweb.component.bebezium.setting.DbMonitorSetting;
import com.jeramtough.jtweb.component.bebezium.subscriber.AbstractRedisDebeziumSubscriber;
import com.jeramtough.jtweb.component.bebezium.subscriber.DebeziumSubscriber;
import com.jeramtough.jtweb.component.bebezium.subscriber.DefaultEventBusDebeziumSubscriber;
import com.jeramtough.jtweb.component.bebezium.subscriber.DefaultRedisDebeziumSubscriber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;

/**
 * <pre>
 * Created on 2021/8/12 上午9:37
 * by @author WeiBoWen
 * </pre>
 */

@EnableCaching
@Configuration
@ComponentScan(
        value = {
                "com.jeramtough.jtweb.component.bebezium",
        },
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,
                value = {})})
public class JtDebeziumConfig {

    private final DbMonitorSetting dbMonitorSetting;
    private final ApplicationContext applicationContext;

    @Autowired
    public JtDebeziumConfig(
            DbMonitorSetting dbMonitorSetting,
            ApplicationContext applicationContext) {
        this.dbMonitorSetting = dbMonitorSetting;
        this.applicationContext = applicationContext;
    }


    /**
     * 如果没有Debezium订阅者，那就读取配置文件，注入一个Debezium订阅者
     * 默认是EventBus实现的
     */
    @Bean
    @ConditionalOnMissingBean(DebeziumSubscriber.class)
    public DebeziumSubscriber debeziumSubscriber() {
        int publisherTypeValue = dbMonitorSetting.getPublisherType();
        PublisherType publisherType = PublisherType.toPublisherType(publisherTypeValue);

        DebeziumSubscriber debeziumSubscriber;
        switch (publisherType) {
            default:
            case EVENT_BUS:
                debeziumSubscriber = new DefaultEventBusDebeziumSubscriber();
                break;
            case REDIS:
                debeziumSubscriber = new DefaultRedisDebeziumSubscriber();
                break;
        }
        return debeziumSubscriber;
    }


    /**
     * 没有redis监听器容器的情况下
     * RedisMessageListenerContainer
     */
    @Bean
    @ConditionalOnBean({AbstractRedisDebeziumSubscriber.class})
    @ConditionalOnMissingBean({RedisMessageListenerContainer.class})
    public RedisMessageListenerContainer redisMessageListenerContainer() {
        AbstractRedisDebeziumSubscriber redisDebeziumSubscriber =
                applicationContext.getBean(AbstractRedisDebeziumSubscriber.class);
        RedisConnectionFactory connectionFactory =
                applicationContext.getBean(RedisConnectionFactory.class);
        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);

        //订阅了一个数据库数据改变监听通道
        container.addMessageListener(new MessageListenerAdapter(redisDebeziumSubscriber),
                new PatternTopic(RedisDebeziumPublisher.TOPIC_NAME));

        //这个container 可以添加多个 messageListener
        return container;
    }

    /**
     * 已经存在监听器容器的情况下
     * RedisMessageListenerContainer
     */
    @Bean
    @ConditionalOnBean(
            {AbstractRedisDebeziumSubscriber.class, RedisMessageListenerContainer.class})
    public void redisMessageListenerContainer1() {
        AbstractRedisDebeziumSubscriber redisDebeziumSubscriber =
                applicationContext.getBean(AbstractRedisDebeziumSubscriber.class);
        RedisConnectionFactory connectionFactory =
                applicationContext.getBean(RedisConnectionFactory.class);
        RedisMessageListenerContainer container =
                applicationContext.getBean(RedisMessageListenerContainer.class);
        container.setConnectionFactory(connectionFactory);

        //订阅了一个数据库数据改变监听通道
        container.addMessageListener(new MessageListenerAdapter(redisDebeziumSubscriber),
                new PatternTopic(RedisDebeziumPublisher.TOPIC_NAME));

    }

}

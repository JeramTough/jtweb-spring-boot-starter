package com.jeramtough.jtweb.component.bebezium.factory;

import com.jeramtough.jtweb.component.bebezium.publisher.DebeziumPublisher;
import com.jeramtough.jtweb.component.bebezium.publisher.EventbusDebeziumPublisher;
import com.jeramtough.jtweb.component.bebezium.publisher.RedisDebeziumPublisher;
import org.springframework.context.ApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.Objects;

/**
 * <pre>
 * Created on 2021/8/11 下午11:49
 * by @author WeiBoWen
 * </pre>
 */
public class BebeziumPublisherFactory {

    public static DebeziumPublisher getBebeziumPublisher(ApplicationContext ac,
                                                         int publisherType) {
        DebeziumPublisher debeziumPublisher = null;
        switch (publisherType) {
            case 0:
                debeziumPublisher = new EventbusDebeziumPublisher();
                break;
            case 1:
                StringRedisTemplate stringRedisTemplate=ac.getBean(StringRedisTemplate.class);
                debeziumPublisher = new RedisDebeziumPublisher(stringRedisTemplate);
                break;
            default:
        }
        Objects.requireNonNull(debeziumPublisher);
        return debeziumPublisher;
    }

}

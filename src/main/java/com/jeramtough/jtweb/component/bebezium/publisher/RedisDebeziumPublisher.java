package com.jeramtough.jtweb.component.bebezium.publisher;

import com.alibaba.fastjson.JSON;
import com.jeramtough.jtweb.component.bebezium.event.DbDataChangedEvent;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * <pre>
 * Created on 2021/8/11 下午11:39
 * by @author WeiBoWen
 * </pre>
 */
public class RedisDebeziumPublisher implements DebeziumPublisher {

    public static String TOPIC_NAME = "CHANGEING_DB_DATA_TOPIC";

    private final StringRedisTemplate stringRedisTemplate;

    public RedisDebeziumPublisher(
            StringRedisTemplate stringRedisTemplate) {
        this.stringRedisTemplate = stringRedisTemplate;
    }

    @Override
    public void publish(DbDataChangedEvent dbDataChangedEvent) {
        stringRedisTemplate.convertAndSend(TOPIC_NAME, JSON.toJSONString(dbDataChangedEvent));
    }
}

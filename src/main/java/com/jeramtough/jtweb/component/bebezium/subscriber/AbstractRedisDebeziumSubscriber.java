package com.jeramtough.jtweb.component.bebezium.subscriber;

import com.alibaba.fastjson.JSON;
import com.jeramtough.jtweb.component.bebezium.event.DbDataChangedEvent;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

import java.io.Serializable;
import java.nio.charset.StandardCharsets;

/**
 * Randl 实体对象 变化（曾删改查）监听器
 *
 * <pre>
 * Created on 2021/8/9 下午9:58
 * by @author WeiBoWen
 * </pre>
 */
public abstract class AbstractRedisDebeziumSubscriber extends BaseDebeziumSubscriber implements
        MessageListener, DebeziumSubscriber {

    @Override
    public void onMessage(Message message, byte[] bytes) {
        onHandler(dbDataChangedEvent(message.getBody()));
    }



}

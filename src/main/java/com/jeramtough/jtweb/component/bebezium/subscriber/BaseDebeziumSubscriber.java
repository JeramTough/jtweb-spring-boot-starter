package com.jeramtough.jtweb.component.bebezium.subscriber;

import com.alibaba.fastjson.JSON;
import com.jeramtough.jtweb.component.bebezium.event.DbDataChangedEvent;
import com.jeramtough.jtweb.component.bebezium.listener.DbDataChangedListener;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * <pre>
 * Created on 2021/8/12 上午1:47
 * by @author WeiBoWen
 * </pre>
 */
public abstract class BaseDebeziumSubscriber implements DebeziumSubscriber {

    private final List<DbDataChangedListener> listenerList = new ArrayList<>();

    protected DbDataChangedEvent dbDataChangedEvent(byte[] bytes) {
        String jsonMessage = new String(bytes,
                StandardCharsets.UTF_8);
        DbDataChangedEvent dbDataChangedEvent = JSON.parseObject(jsonMessage,
                DbDataChangedEvent.class);
        return dbDataChangedEvent;
    }


    @Override
    public void addListener(DbDataChangedListener listener) {
        listenerList.add(listener);
    }

    @Override
    public void onHandler(DbDataChangedEvent dbDataChangedEvent) {
        listenerList
                .parallelStream()
                .filter(Objects::nonNull)
                .forEach(listener -> listener.onChanged(dbDataChangedEvent));
    }
}

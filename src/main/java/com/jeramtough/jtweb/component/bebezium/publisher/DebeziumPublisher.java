package com.jeramtough.jtweb.component.bebezium.publisher;

import com.jeramtough.jtweb.component.bebezium.event.DbDataChangedEvent;

/**
 * <pre>
 * Created on 2021/8/11 下午11:35
 * by @author WeiBoWen
 * </pre>
 */
public interface DebeziumPublisher {

    void publish( DbDataChangedEvent dbDataChangedEvent);

}

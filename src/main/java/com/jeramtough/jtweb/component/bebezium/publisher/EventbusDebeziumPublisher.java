package com.jeramtough.jtweb.component.bebezium.publisher;

import com.jeramtough.jtweb.component.bebezium.event.DbDataChangedEvent;
import org.greenrobot.eventbus.EventBus;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * <pre>
 * Created on 2021/8/11 下午11:36
 * by @author WeiBoWen
 * </pre>
 */
@Lazy
@Component
public class EventbusDebeziumPublisher implements DebeziumPublisher {

    @Override
    public void publish( DbDataChangedEvent dbDataChangedEvent) {
        EventBus.getDefault().post(dbDataChangedEvent);
    }
}

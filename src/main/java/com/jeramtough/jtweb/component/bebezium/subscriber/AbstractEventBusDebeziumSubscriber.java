package com.jeramtough.jtweb.component.bebezium.subscriber;

import com.jeramtough.jtweb.component.bebezium.event.DbDataChangedEvent;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.springframework.context.SmartLifecycle;

/**
 * <pre>
 * Created on 2021/8/12 上午1:42
 * by @author WeiBoWen
 * </pre>
 */
public abstract class AbstractEventBusDebeziumSubscriber extends BaseDebeziumSubscriber
        implements DebeziumSubscriber,
        SmartLifecycle {

    private boolean isRunning = false;

    public AbstractEventBusDebeziumSubscriber() {
        start();
    }

    @Subscribe
    public void onThisHandler(DbDataChangedEvent dbDataChangedEvent) {
        onHandler(dbDataChangedEvent);
    }

    @Override
    public void start() {
        if (!isRunning) {
            EventBus.getDefault().register(this);
            isRunning = true;
        }
    }

    @Override
    public void stop() {
        EventBus.getDefault().unregister(this);
    }

    @Override
    public boolean isRunning() {
        return isRunning;
    }
}

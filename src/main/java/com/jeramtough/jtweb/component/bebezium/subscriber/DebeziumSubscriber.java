package com.jeramtough.jtweb.component.bebezium.subscriber;

import com.jeramtough.jtweb.component.bebezium.event.DbDataChangedEvent;
import com.jeramtough.jtweb.component.bebezium.listener.DbDataChangedListener;

/**
 * DebeziumS订阅者，
 * 注入自己的webioc容器中直接用，@EnableDbMonitor会自动注入DefaultDebeziums
 *
 * <pre>
 * Created on 2021/8/11 下午11:35
 * by @author WeiBoWen
 * </pre>
 */
public interface DebeziumSubscriber {

    void addListener(DbDataChangedListener listener);

    void onHandler(DbDataChangedEvent dbDataChangedEvent);

}

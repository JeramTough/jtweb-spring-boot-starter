package com.jeramtough.jtweb.component.bebezium.listener;

import com.jeramtough.jtweb.component.bebezium.event.DbDataChangedEvent;

/**
 * <pre>
 * Created on 2021/8/12 下午11:52
 * by @author WeiBoWen
 * </pre>
 */
public interface DbDataChangedListener {

    void onChanged(DbDataChangedEvent dbDataChangedEvent);

}

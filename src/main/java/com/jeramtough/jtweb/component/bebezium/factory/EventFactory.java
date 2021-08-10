package com.jeramtough.jtweb.component.bebezium.factory;

import com.jeramtough.jtweb.component.bebezium.bean.ChangedData;
import com.jeramtough.jtweb.component.bebezium.event.DbDataChangedEvent;

/**
 * <pre>
 * Created on 2021/8/10 下午3:15
 * by @author WeiBoWen
 * </pre>
 */
public class EventFactory {

    public static DbDataChangedEvent getDbDataChangedEvent(ChangedData changedData) {
        DbDataChangedEvent event = new DbDataChangedEvent();
        event.setChangedData(changedData);
        event.setDbOptionType(changedData.getDbOptionType());
        return event;
    }
}

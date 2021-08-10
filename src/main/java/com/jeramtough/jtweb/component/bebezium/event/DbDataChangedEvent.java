package com.jeramtough.jtweb.component.bebezium.event;

import com.jeramtough.jtweb.component.bebezium.bean.ChangedData;
import com.jeramtough.jtweb.component.bebezium.bean.DbOptionType;

import java.io.Serializable;

/**
 * <pre>
 * Created on 2021/8/10 下午3:05
 * by @author WeiBoWen
 * </pre>
 */
public class DbDataChangedEvent implements Serializable {

    private DbOptionType dbOptionType;
    private ChangedData changedData;

    public DbOptionType getDbOptionType() {
        return dbOptionType;
    }

    public void setDbOptionType(DbOptionType dbOptionType) {
        this.dbOptionType = dbOptionType;
    }

    public ChangedData getChangedData() {
        return changedData;
    }

    public void setChangedData(ChangedData changedData) {
        this.changedData = changedData;
    }
}

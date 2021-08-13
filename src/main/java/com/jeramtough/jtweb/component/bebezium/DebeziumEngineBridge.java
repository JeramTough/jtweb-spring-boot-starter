package com.jeramtough.jtweb.component.bebezium;

import com.jeramtough.jtweb.component.bebezium.setting.DbSourceSetting;
import io.debezium.engine.DebeziumEngine;

/**
 * <pre>
 * Created on 2021/8/12 上午12:42
 * by @author WeiBoWen
 * </pre>
 */
public class DebeziumEngineBridge {

    private final DbSourceSetting dbSourceSetting;
    private final DebeziumEngine<?> debeziumEngine;

    public DebeziumEngineBridge(
            DbSourceSetting dbSourceSetting,
            DebeziumEngine<?> debeziumEngine) {
        this.dbSourceSetting = dbSourceSetting;
        this.debeziumEngine = debeziumEngine;
    }

    public DbSourceSetting getDbSourceSetting() {
        return dbSourceSetting;
    }

    public DebeziumEngine<?> getDebeziumEngine() {
        return debeziumEngine;
    }
}

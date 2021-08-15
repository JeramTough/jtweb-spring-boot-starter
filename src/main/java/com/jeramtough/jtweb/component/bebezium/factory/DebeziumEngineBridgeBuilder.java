package com.jeramtough.jtweb.component.bebezium.factory;

import com.jeramtough.jtweb.component.bebezium.DebeziumEngineBridge;
import com.jeramtough.jtweb.component.bebezium.setting.DbSourceSetting;
import io.debezium.config.Configuration;
import io.debezium.embedded.EmbeddedEngine;
import io.debezium.engine.DebeziumEngine;
import org.apache.kafka.connect.source.SourceRecord;

import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * <pre>
 * Created on 2021/8/12 上午12:50
 * by @author WeiBoWen
 * </pre>
 */
public class DebeziumEngineBridgeBuilder {

    private String name;
    private DbSourceSetting dbSourceSetting;
    private DebeziumEngine.ChangeConsumer<SourceRecord> consumer;

    public DebeziumEngineBridgeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public DebeziumEngineBridgeBuilder setDbSourceSetting(
            DbSourceSetting dbSourceSetting) {
        this.dbSourceSetting = dbSourceSetting;
        return this;
    }

    public DebeziumEngineBridgeBuilder setConsumer(
            DebeziumEngine.ChangeConsumer<SourceRecord> consumer) {
        this.consumer = consumer;
        return this;
    }

    public DebeziumEngineBridge build() {
        Objects.requireNonNull(name);
        Objects.requireNonNull(dbSourceSetting);
        Objects.requireNonNull(consumer);

        Configuration configuration = DebeziumConfigFactory.getConfiguration(name,
                dbSourceSetting);
        DebeziumEngine<?> debeziumEngine = EmbeddedEngine.create()
                                                         .using(configuration)
                                                         .notifying(consumer)
                                                         .build();
        DebeziumEngineBridge debeziumEngineBridge = new DebeziumEngineBridge(dbSourceSetting,
                debeziumEngine);
        return debeziumEngineBridge;
    }


}

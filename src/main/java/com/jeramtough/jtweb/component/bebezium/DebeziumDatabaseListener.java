package com.jeramtough.jtweb.component.bebezium;

import com.jeramtough.jtlog.with.WithLogger;
import com.jeramtough.jtweb.component.bebezium.bean.ChangedData;
import com.jeramtough.jtweb.component.bebezium.event.DbDataChangedEvent;
import com.jeramtough.jtweb.component.bebezium.factory.BebeziumPublisherFactory;
import com.jeramtough.jtweb.component.bebezium.factory.ChangeDataFactory;
import com.jeramtough.jtweb.component.bebezium.factory.DebeziumEngineBridgeBuilder;
import com.jeramtough.jtweb.component.bebezium.factory.EventFactory;
import com.jeramtough.jtweb.component.bebezium.publisher.DebeziumPublisher;
import com.jeramtough.jtweb.component.bebezium.setting.DbMonitorSetting;
import com.jeramtough.jtweb.component.bebezium.setting.DbSourceSetting;
import io.debezium.engine.DebeziumEngine;
import org.apache.kafka.connect.source.SourceRecord;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * 数据库监听事件
 *
 * <pre>
 * Created on 2021/8/10 上午12:44
 * by @author WeiBoWen
 * </pre>
 */
@Component
public class DebeziumDatabaseListener implements InitializingBean, SmartLifecycle, WithLogger {

    private boolean isAble = false;
    private final ApplicationContext applicationContext;
    private final DbMonitorSetting dbMonitorSetting;

    private final Executor executor = Executors.newSingleThreadExecutor();
    private final List<DebeziumEngineBridge> debeziumEngineBridgeList = new ArrayList<>();

    @Autowired
    public DebeziumDatabaseListener(
            ApplicationContext applicationContext,
            DbMonitorSetting dbMonitorSetting) {
        this.applicationContext = applicationContext;
        this.dbMonitorSetting = dbMonitorSetting;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // Create the engine with this configuration ...
        this.isAble = dbMonitorSetting.isEnable();

        if (isAble) {
            for (Map.Entry<String, DbSourceSetting> entry : dbMonitorSetting.getDatasource().entrySet()) {
                DebeziumEngineBridge debeziumEngineBridge = new DebeziumEngineBridgeBuilder()
                        .setName(entry.getKey())
                        .setDbSourceSetting(entry.getValue())
                        .setConsumer(this::handleEvent)
                        .build();
                debeziumEngineBridgeList.add(debeziumEngineBridge);
            }
        }


    }


    @Override
    public void start() {
        if (isAble) {
            debeziumEngineBridgeList
                    .parallelStream()
                    .map(DebeziumEngineBridge::getDebeziumEngine)
                    .forEach(executor::execute);
        }
    }

    @Override
    public void stop() {
        if (isAble) {
            debeziumEngineBridgeList
                    .parallelStream()
                    .map(DebeziumEngineBridge::getDebeziumEngine)
                    .forEach(debeziumEngine -> {
                        try {
                            debeziumEngine.close();
                        }
                        catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
        }
    }

    @Override
    public boolean isRunning() {
        return false;
    }

    /**
     * 每句sql修改了多少条记录，Records大小就是多少
     */
    protected void handleEvent(List<SourceRecord> sourceRecords,
                               DebeziumEngine.RecordCommitter<SourceRecord> sourceRecordRecordCommitter) {

        sourceRecords
                .parallelStream()
                .forEach(sourceRecord -> {
                    try {
                        ChangedData changedData = ChangeDataFactory.getChangedData(
                                sourceRecord);

                        if (changedData != null) {

                            DebeziumPublisher debeziumPublisher = BebeziumPublisherFactory
                                    .getBebeziumPublisher(applicationContext,
                                            dbMonitorSetting.getPublisherType());

                            DbDataChangedEvent dbDataChangedEvent =
                                    EventFactory.getDbDataChangedEvent(changedData);
                            debeziumPublisher.publish(dbDataChangedEvent);
                        }

                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                });

    }


}

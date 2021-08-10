package com.jeramtough.jtweb.component.bebezium;

import com.jeramtough.jtlog.with.WithLogger;
import com.jeramtough.jtweb.component.bebezium.bean.ChangedData;
import com.jeramtough.jtweb.component.bebezium.event.DbDataChangedEvent;
import com.jeramtough.jtweb.component.bebezium.factory.ChangeDataFactory;
import com.jeramtough.jtweb.component.bebezium.factory.DebeziumConfigFactory;
import com.jeramtough.jtweb.component.bebezium.factory.EventFactory;
import com.jeramtough.jtweb.component.bebezium.setting.DbMoniterConfig;
import io.debezium.config.Configuration;
import io.debezium.embedded.EmbeddedEngine;
import io.debezium.engine.DebeziumEngine;
import org.apache.kafka.connect.source.SourceRecord;
import org.greenrobot.eventbus.EventBus;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
    private final DbMoniterConfig dbMoniterConfig;

    private final Executor executor = Executors.newSingleThreadExecutor();
    private final List<DebeziumEngine<?>> debeziumEngineList = new ArrayList<>();

    @Autowired
    public DebeziumDatabaseListener(
            DbMoniterConfig dbMoniterConfig) {
        this.dbMoniterConfig = dbMoniterConfig;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // Create the engine with this configuration ...
        this.isAble = dbMoniterConfig.isAble();

        if (isAble) {
            List<Configuration> configurationList =
                    DebeziumConfigFactory.getConfigurationList(dbMoniterConfig);

            for (Configuration configuration : configurationList) {
                DebeziumEngine<?> debeziumEngine = EmbeddedEngine.create()
                                                                 .using(configuration)
                                                                 .notifying(this::handleEvent)
                                                                 .build();
                debeziumEngineList.add(debeziumEngine);
            }

        }


    }


    @Override
    public void start() {
        if (isAble) {
            debeziumEngineList
                    .parallelStream()
                    .forEach(executor::execute);
        }
    }

    @Override
    public void stop() {
        if (isAble) {
            debeziumEngineList
                    .parallelStream()
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

    protected void handleEvent(List<SourceRecord> sourceRecords,
                               DebeziumEngine.RecordCommitter<SourceRecord> sourceRecordRecordCommitter) {
        for (SourceRecord sourceRecord : sourceRecords) {
            try {
                ChangedData changedData = ChangeDataFactory.getChangedData(sourceRecord);
                DbDataChangedEvent dbDataChangedEvent =
                        EventFactory.getDbDataChangedEvent(changedData);

                EventBus.getDefault().post(dbDataChangedEvent);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}

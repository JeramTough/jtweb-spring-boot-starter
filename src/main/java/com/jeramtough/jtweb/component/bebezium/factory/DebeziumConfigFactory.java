package com.jeramtough.jtweb.component.bebezium.factory;

import com.jeramtough.jtweb.component.bebezium.setting.DbMoniterConfig;
import com.jeramtough.jtweb.component.bebezium.setting.DbSourceConfig;
import io.debezium.config.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * Created on 2021/8/10 下午1:34
 * by @author WeiBoWen
 * </pre>
 */
public class DebeziumConfigFactory {

    public static List<Configuration> getConfigurationList(DbMoniterConfig dbMoniterConfig) {
        List<Configuration> configurationList = new ArrayList<>();
        for (Map.Entry<String, DbSourceConfig> entry : dbMoniterConfig.getDatasource().entrySet()) {

            if (!entry.getValue().getIsAble()) {
                continue;
            }

            String name = "debezium-connector-" + entry.getKey();
            String connectorClass = null;
            if ("mysql".equals(entry.getValue().getDatabaseType())) {
                connectorClass = "io.debezium.connector.mysql.MySqlConnector";
            }
            // Define the configuration for the embedded and MySQL connector ...
            Configuration config = Configuration
                    .create()
                    /* begin engine properties */
                    .with("connector.class", connectorClass)
                    .with("offset.storage",
                            "org.apache.kafka.connect.storage.FileOffsetBackingStore")
                    .with("offset.storage.file.filename",
                            entry.getValue().getOffsetStorageFile())
                    .with("offset.flush.interval.ms", 60000)
                    /* begin connector properties */
                    .with("name", name)
                    .with("database.hostname", entry.getValue().getHostname())
                    .with("database.port", entry.getValue().getPort())
                    .with("database.user", entry.getValue().getUser())
                    .with("database.password", entry.getValue().getPassword())
                    .with("database.include.list", entry.getValue().getIncludeDb())
                    //是否包含数据库结构的变更事件
                    .with("database.schema.changes", "true")
                    .with("database.server.id", entry.getValue().getServerId())
                    .with("database.server.name", name)
                    .with("database.history",
                            "io.debezium.relational.history.FileDatabaseHistory")
                    .with("database.history.file.filename",
                            entry.getValue().getDatabaseHistoryFile())
                    .build();

            configurationList.add(config);
        }

        return configurationList;
    }
}

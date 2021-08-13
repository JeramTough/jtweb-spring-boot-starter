package com.jeramtough.jtweb.component.bebezium.factory;

import com.jeramtough.jtweb.component.bebezium.setting.DbMoniterSetting;
import com.jeramtough.jtweb.component.bebezium.setting.DbSourceSetting;
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

    public static List<Configuration> getConfigurationList(DbMoniterSetting dbMoniterSetting) {
        List<Configuration> configurationList = new ArrayList<>();
        for (Map.Entry<String, DbSourceSetting> entry : dbMoniterSetting.getDatasource().entrySet()) {
            Configuration config = getConfiguration(entry.getKey(), entry.getValue());
            if (config != null) {
                configurationList.add(config);
            }
        }

        return configurationList;
    }

    public static Configuration getConfiguration(String name,
                                                 DbSourceSetting dbSourceSetting) {

        if (!dbSourceSetting.getIsAble()) {
            return null;
        }

        String connectName = "debezium-connector-" + name;
        String connectorClass = null;
        if ("mysql".equals(dbSourceSetting.getDatabaseType())) {
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
                        dbSourceSetting.getOffsetStorageFile())
                .with("offset.flush.interval.ms", 60000)
                /* begin connector properties */
                .with("name", connectName)
                .with("database.hostname", dbSourceSetting.getHostname())
                .with("database.port", dbSourceSetting.getPort())
                .with("database.user", dbSourceSetting.getUser())
                .with("database.password", dbSourceSetting.getPassword())
                .with("database.include.list", dbSourceSetting.getIncludeDb())
                //是否包含数据库结构的变更事件
                .with("database.schema.changes", "true")
                .with("database.server.id", dbSourceSetting.getServerId())
                .with("database.server.name", connectName)
                .with("database.history",
                        "io.debezium.relational.history.FileDatabaseHistory")
                .with("database.history.file.filename",
                        dbSourceSetting.getDatabaseHistoryFile())
                .build();

        return config;
    }


}

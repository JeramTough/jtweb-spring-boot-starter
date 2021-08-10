package com.jeramtough.jtweb.component.bebezium.setting;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

/**
 * <pre>
 * Created on 2021/8/10 上午11:49
 * by @author WeiBoWen
 * </pre>
 */
@Configuration
@ConfigurationProperties(prefix = "dbmoniter")
public class DbMoniterConfig {

    private boolean isAble =false;
    private Map<String, DbSourceConfig> datasource;


    public boolean isAble() {
        return isAble;
    }

    public boolean getIsAble() {
        return isAble;
    }

    public void setIsAble(boolean isAble) {
        this.isAble = isAble;
    }

    public Map<String, DbSourceConfig> getDatasource() {
        return datasource;
    }

    public void setDatasource(
            Map<String, DbSourceConfig> datasource) {
        this.datasource = datasource;
    }
}

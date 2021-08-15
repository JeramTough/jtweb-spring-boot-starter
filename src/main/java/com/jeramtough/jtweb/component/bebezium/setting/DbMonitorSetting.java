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
@ConfigurationProperties(prefix = "jtweb.dbmonitor")
public class DbMonitorSetting {

    private boolean enable = true;
    private Integer publisherType = 0;
    private Map<String, DbSourceSetting> datasource;


    public boolean isEnable() {
        return enable;
    }

    public boolean getEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public Map<String, DbSourceSetting> getDatasource() {
        return datasource;
    }

    public void setDatasource(
            Map<String, DbSourceSetting> datasource) {
        this.datasource = datasource;
    }

    public Integer getPublisherType() {
        return publisherType;
    }

    public void setPublisherType(Integer publisherType) {
        this.publisherType = publisherType;
    }
}

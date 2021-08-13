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
public class DbMoniterSetting {

    private boolean isAble =false;
    private Integer publisherType=0;
    private Map<String, DbSourceSetting> datasource;



    public boolean isAble() {
        return isAble;
    }

    public boolean getIsAble() {
        return isAble;
    }

    public void setIsAble(boolean isAble) {
        this.isAble = isAble;
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

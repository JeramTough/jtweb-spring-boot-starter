package com.jeramtough.jtweb.component.cache.setting;

import com.jeramtough.jtweb.component.cache.template.CacheType;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * <pre>
 * Created on 2021/8/10 上午11:49
 * by @author WeiBoWen
 * </pre>
 */
@Configuration
@ConfigurationProperties(prefix = "jtweb.cache")
public class JtCacheSetting {

    private Boolean enableMapper = true;
    private String type = CacheType.MEMORY.name();
    private Long outTimed = 1000L * 60 * 60;


    public Boolean isEnableMapper() {
        return enableMapper;
    }

    public Boolean getEnableMapper() {
        return enableMapper;
    }

    public void setEnableMapper(Boolean enableMapper) {
        this.enableMapper = enableMapper;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getOutTimed() {
        return outTimed;
    }

    public void setOutTimed(Long outTimed) {
        this.outTimed = outTimed;
    }
}

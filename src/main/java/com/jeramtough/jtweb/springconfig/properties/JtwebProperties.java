package com.jeramtough.jtweb.springconfig.properties;

import com.jeramtough.jtweb.component.cache.template.CacheType;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <pre>
 * Created on 2020/5/15 14:39
 * by @author JeramTough
 * </pre>
 */
@ConfigurationProperties(prefix = "jtweb")
public class JtwebProperties {

    private boolean usedFastJson = false;
    private String cacheType= CacheType.REDIS.name();

    public boolean isUsedFastJson() {
        return usedFastJson;
    }

    public void setUsedFastJson(boolean usedFastJson) {
        this.usedFastJson = usedFastJson;
    }

    public String getCacheType() {
        return cacheType;
    }

    public void setCacheType(String cacheType) {
        this.cacheType = cacheType;
    }
}

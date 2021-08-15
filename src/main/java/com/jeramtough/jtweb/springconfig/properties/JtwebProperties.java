package com.jeramtough.jtweb.springconfig.properties;

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


    public boolean isUsedFastJson() {
        return usedFastJson;
    }

    public void setUsedFastJson(boolean usedFastJson) {
        this.usedFastJson = usedFastJson;
    }


}

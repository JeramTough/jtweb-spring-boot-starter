package com.jeramtough.jtweb.springconfig;

import com.jeramtough.jtweb.springconfig.properties.JtwebProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.WebApplicationContext;

/**
 * <pre>
 * Created on 2020/10/21 23:04
 * by @author WeiBoWen
 * </pre>
 */

@Configuration
@ComponentScan(basePackages = {
        "com.jeramtough.jtweb.action.aspect",
})
public class JtWebConfig {


    private final WebApplicationContext webApplicationContext;
    private final JtwebProperties jtwebProperties;

    @Autowired
    public JtWebConfig(
            WebApplicationContext webApplicationContext,
            JtwebProperties jtwebProperties) {
        this.webApplicationContext = webApplicationContext;
        this.jtwebProperties = jtwebProperties;
    }


    /*@Bean("defaultOptLoggerConfig")
    @ConditionalOnMissingBean(OptLoggerConfig.class)
    public OptLoggerConfig optLoggerConfig() {
        return new OptLoggerConfig() {

            @Override
            public String getExpandInfo() {
                return null;
            }

            @Override
            public Boolean isAble() {
                return false;
            }

            @Override
            public LogChannel[] logChanels() {
                return new LogChannel[0];
            }
        };

    }*/

}

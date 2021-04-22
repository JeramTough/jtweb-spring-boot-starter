package com.jeramtough.jtweb.springconfig;

import com.jeramtough.jtweb.component.optlog.channel.LogChannel;
import com.jeramtough.jtweb.component.optlog.config.OptLoggerConfig;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

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

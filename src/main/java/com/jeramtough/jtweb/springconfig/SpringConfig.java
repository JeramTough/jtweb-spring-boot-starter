package com.jeramtough.jtweb.springconfig;

import com.jeramtough.jtweb.action.starter.BootStarterListener;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <pre>
 * Created on 2020/5/16 17:16
 * by @author JeramTough
 * </pre>
 */
@Configuration
public class SpringConfig {

    @Bean
    @ConditionalOnMissingBean(BootStarterListener.class)
    public BootStarterListener bootStarterListener() {
        return new BootStarterListener();
    }

}

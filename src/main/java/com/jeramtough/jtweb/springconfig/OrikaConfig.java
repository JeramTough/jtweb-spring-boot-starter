package com.jeramtough.jtweb.springconfig;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.OrikaSystemProperties;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import ma.glasnost.orika.impl.generator.JavassistCompilerStrategy;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created on 2019/7/31 14:41
 * by @author WeiBoWen
 */
@Configuration
public class OrikaConfig {


    @Bean
    @ConditionalOnMissingBean(MapperFacade.class)
    public MapperFacade injectMapperFacade() {
        System.setProperty(OrikaSystemProperties.COMPILER_STRATEGY,
                JavassistCompilerStrategy.class.getName());

        System.setProperty(OrikaSystemProperties.WRITE_SOURCE_FILES, "true");
        System.setProperty(OrikaSystemProperties.WRITE_CLASS_FILES, "true");

        MapperFactory factory = new DefaultMapperFactory.Builder().build();
        MapperFacade mapperFacade = factory.getMapperFacade();

        return mapperFacade;
    }
}

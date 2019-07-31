package com.jeramtough.web.springconfig;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created on 2019/7/31 14:41
 * by @author WeiBoWen
 */
@Configuration
public class OrikaConfig {


    @Bean
    public MapperFacade injectMapperFacade() {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        MapperFacade mapperFacade = mapperFactory.getMapperFacade();
        return mapperFacade;
    }
}

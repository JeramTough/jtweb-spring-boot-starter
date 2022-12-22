package com.jeramtough.jtweb.springconfig;

import com.alibaba.fastjson2.support.config.FastJsonConfig;
import com.alibaba.fastjson2.support.spring.http.converter.FastJsonHttpMessageConverter;
import com.jeramtough.jtweb.springconfig.properties.JtwebProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.util.Arrays;

/**
 * Created on 2019/7/26 8:06
 * by @author WeiBoWen
 */
@Configuration
@EnableConfigurationProperties(JtwebProperties.class)
public class JsonConfig {

    @Autowired
    private JtwebProperties jtwebProperties;

    @Bean
    @ConditionalOnMissingBean(HttpMessageConverters.class)
    public HttpMessageConverters fastjsonHttpMessageConverter() {

        if (jtwebProperties.isUsedFastJson()) {
            //定义一个转换消息的对象
            FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
            //添加fastjson的配置信息 比如 ：是否要格式化返回的json数据
            FastJsonConfig fastJsonConfig = new FastJsonConfig();
            fastConverter.setSupportedMediaTypes(Arrays.asList(
                    MediaType.APPLICATION_JSON, new MediaType("application", "*+json")));
            //在转换器中添加配置信息
            fastConverter.setFastJsonConfig(fastJsonConfig);
            return new HttpMessageConverters(fastConverter);
        }
        else {
            MappingJackson2HttpMessageConverter jacksonConverter =
                    new MappingJackson2HttpMessageConverter();
            return new HttpMessageConverters(jacksonConverter);
        }


    }
}

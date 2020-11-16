package com.jeramtough.jtweb.service.impl;

import ma.glasnost.orika.MapperFacade;
import org.springframework.web.context.WebApplicationContext;

/**
 * <pre>
 * Created on 2020/10/3 18:19
 * by @author WeiBoWen
 * </pre>
 */
public class BaseServiceImpl {

    private WebApplicationContext wc;
    private MapperFacade mapperFacade;

    public BaseServiceImpl(WebApplicationContext wc) {
        this.wc = wc;
    }

    public WebApplicationContext getWC() {
        return wc;
    }

    public MapperFacade getMapperFacade() {
        if (mapperFacade == null) {
            synchronized (this) {
                if (mapperFacade == null) {
                    mapperFacade = getWC().getBean(MapperFacade.class);
                }
            }
        }
        return mapperFacade;
    }

}

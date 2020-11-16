package com.jeramtough.jtweb.component.business;

import ma.glasnost.orika.MapperFacade;

/**
 * <pre>
 * Created on 2020/10/24 15:09
 * by @author WeiBoWen
 * </pre>
 */
public interface ToDtoProcess<T,D> {

    D toDto(T t,MapperFacade mapperFacade);

}

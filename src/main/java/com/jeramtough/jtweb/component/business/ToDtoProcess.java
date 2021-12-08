package com.jeramtough.jtweb.component.business;

/**
 * <pre>
 * Created on 2020/10/24 15:09
 * by @author WeiBoWen
 * </pre>
 */
public interface ToDtoProcess<T,D> {

    D toDto(T t);

}

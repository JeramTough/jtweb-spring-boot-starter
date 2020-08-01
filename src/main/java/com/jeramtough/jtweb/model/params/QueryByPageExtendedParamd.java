package com.jeramtough.jtweb.model.params;

import io.swagger.annotations.ApiParam;

import javax.validation.constraints.NotNull;

/**
 * <pre>
 * Created on 2020/6/10 21:44
 * by @author JeramTough
 * </pre>
 */
public class QueryByPageExtendedParamd<T> extends QueryByPageParams{

    @NotNull(message = "{'code':667,'placeholders':['获取数据','每页大小']}")
    @ApiParam(value = "每页的大小", required = true, example = "10")
    private T extendedParams;
}
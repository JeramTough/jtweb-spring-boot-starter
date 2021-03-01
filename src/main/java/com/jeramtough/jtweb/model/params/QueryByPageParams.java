package com.jeramtough.jtweb.model.params;

import io.swagger.annotations.ApiParam;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * <pre>
 * Created on 2020/2/8 16:36
 * by @author JeramTough
 * </pre>
 */
public class QueryByPageParams implements Serializable {

    private static final long serialVersionUID = -7842849962531285279L;

    @NotNull(message = "{'code':667,'placeholders':['获取数据','第几页']}")
    @ApiParam(value = "第几页", required = true, example = "1")
    private Long index;

    @NotNull(message = "{'code':667,'placeholders':['获取数据','每页大小']}")
    @ApiParam(value = "每页的大小", required = true, example = "10")
    private Long size;



    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }
}

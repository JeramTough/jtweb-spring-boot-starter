package com.jeramtough.jtweb.model.params;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

/**
 * <pre>
 * Created on 2020/6/10 21:44
 * by @author JeramTough
 * </pre>
 */
public class QueryByPageExtendedParamd<T> extends QueryByPageParams{

    private static final long serialVersionUID = -8101986446815976208L;

    @NotNull(message = "{'code':667,'placeholders':['获取数据','每页大小']}")
    @Schema(description = "每页的大小", required = true, example = "10")
    private T extendedParams;
}

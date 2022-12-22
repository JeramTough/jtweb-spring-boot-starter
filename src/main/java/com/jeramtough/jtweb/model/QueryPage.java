package com.jeramtough.jtweb.model;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jeramtough.jtweb.model.params.QueryByPageParams;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * <pre>
 * Created on 2020/2/8 21:13
 * by @author JeramTough
 * </pre>
 */
@Schema(description = "分页查询结果对象")
public class QueryPage<T> extends Page<T> {

    public QueryPage(QueryByPageParams params) {
        super(params.getIndex(), params.getSize(), true);
    }
}

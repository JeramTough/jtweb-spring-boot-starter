package com.jeramtough.jtweb.service;

import com.jeramtough.jtweb.model.dto.PageDto;
import com.jeramtough.jtweb.model.params.BaseConditionParams;
import com.jeramtough.jtweb.model.params.QueryByPageParams;

/**
 * <pre>
 * Created on 2021/8/12 下午5:55
 * by @author WeiBoWen
 * </pre>
 */
public interface CacheBaseService<T, D> extends JtBaseService<T, D> {


    @Override
    default PageDto<D> pageByCondition(QueryByPageParams queryByPageParams,
                                       BaseConditionParams params) {
        return null;
    }
}

package com.jeramtough.jtweb.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.jeramtough.jtweb.component.business.ToEntityProcess;
import com.jeramtough.jtweb.component.business.ToEntityWithBundleProcess;
import com.jeramtough.jtweb.model.dto.PageDto;
import com.jeramtough.jtweb.model.params.BaseConditionParams;
import com.jeramtough.jtweb.model.params.QueryByPageParams;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 对BaseDtoService的增强
 *
 * <pre>
 * Created on 2020/10/25 16:47
 * by @author WeiBoWen
 * </pre>
 */
public interface JtBaseService<T, D> extends BaseDtoService<T, D> {

    String addByParams(Object params);

    String updateByParams(Object params);

    String addOrUpdateBatchByParamsList(List<?> paramsList);

    String addOrUpdateBatchByParamsList(List<?> paramsList,
                                        ToEntityProcess<T> toEntityProcess);

    String addOrUpdateBatchByParamsList(List<?> paramsList,
                                        Map<String, Object> bundle,
                                        ToEntityWithBundleProcess<T> toEntityProcess);

    String addOrUpdateByParams(Object params);

    String updateByParamsList(List<?> params);

    String removeOneById(Long fid);

    PageDto<D> pageByCondition(QueryByPageParams queryByPageParams,
                               BaseConditionParams params);


    @Override
    T getOne(Wrapper<T> queryWrapper);

    @Override
    T getById(Serializable id);
}

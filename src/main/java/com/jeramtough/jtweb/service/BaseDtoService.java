package com.jeramtough.jtweb.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jeramtough.jtweb.model.dto.PageDto;
import com.jeramtough.jtweb.model.params.QueryByPageParams;

import java.util.List;

/**
 * <pre>
 * Created on 2020/6/11 21:01
 * by @author JeramTough
 * </pre>
 */
public interface BaseDtoService<T,D> extends IService<T> {

    PageDto<D> getBaseDtoListByPage(QueryByPageParams queryByPageParams);

    List<D> getAllBaseDto();

    D getBaseDtoById(Long id);

}

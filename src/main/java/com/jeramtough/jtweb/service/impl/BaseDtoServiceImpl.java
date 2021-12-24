package com.jeramtough.jtweb.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.ReflectionKit;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jeramtough.jtcomponent.utils.StringUtil;
import com.jeramtough.jtweb.component.apiresponse.exception.ApiResponseException;
import com.jeramtough.jtweb.component.business.ToDtoProcess;
import com.jeramtough.jtweb.component.validation.BeanValidator;
import com.jeramtough.jtweb.model.QueryPage;
import com.jeramtough.jtweb.model.dto.PageDto;
import com.jeramtough.jtweb.model.params.QueryByPageParams;
import com.jeramtough.jtweb.service.BaseDtoService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.context.WebApplicationContext;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * <pre>
 * Created on 2020/1/30 14:41
 * by @author JeramTough
 * </pre>
 */
public abstract class BaseDtoServiceImpl<M extends BaseMapper<T>, T, D>
        extends ServiceImpl<M, T> implements BaseDtoService<T, D> {

    private WebApplicationContext wc;

    /**
     * Dto的class
     */
    private final Class<D> dClass = (Class<D>) ReflectionKit.getSuperClassGenericType(
            this.getClass(), 2);

    public BaseDtoServiceImpl(WebApplicationContext wc) {
        this.wc = wc;
    }

    protected D toDto(T t) {
        try {
            D d = dClass.newInstance();
            BeanUtils.copyProperties(t, d);
            return d;
        }
        catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        throw new IllegalStateException("bean映射失败！");


    }


    protected T toEntity(Object params, Class<?> tClass) {
        try {
            Constructor constructor=tClass.getConstructor();
            T t = (T) constructor.newInstance();
            BeanUtils.copyProperties(params, t);
            return t;
        }
        catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        throw new IllegalStateException("bean映射失败");
    }


    protected <S> S mapBean(Object o,Class<S> sClass){
        try {
            Constructor<S> constructor=sClass.getConstructor();
            S s = constructor.newInstance();
            BeanUtils.copyProperties(o, s);
            return s;
        }
        catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        throw new IllegalStateException("bean映射失败");
    }

    public WebApplicationContext getWC() {
        return wc;
    }

    @Override
    public boolean save(T entity) {
        BeanValidator.verifyParams(entity);
        return super.save(entity);
    }

    @Override
    public boolean saveBatch(Collection<T> entityList, int batchSize) {
        for (T entity : entityList) {
            BeanValidator.verifyParams(entity);
        }
        return super.saveBatch(entityList, batchSize);
    }

    @Override
    public boolean saveOrUpdate(T entity) {
        BeanValidator.verifyParams(entity);
        return super.saveOrUpdate(entity);
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<T> entityList, int batchSize) {
        for (T entity : entityList) {
            BeanValidator.verifyParams(entity);
        }
        return super.saveOrUpdateBatch(entityList, batchSize);
    }

    public D getBaseDto(T t) {
        return toDto(t);
    }

    public List<D> getDtoList(List<T> tList) {
        List<D> dList = new ArrayList<>(tList.size());
        for (T t : tList) {
            dList.add(toDto(t));
        }
        return dList;
    }

    public List<D> getDtoListForAsyn(List<T> tList) {
        List<D> dList = tList
                .parallelStream()
                .map(this::toDto)
                .collect(Collectors.toList());
        return dList;
    }

    @Override
    public PageDto<D> getBaseDtoListByPage(QueryByPageParams queryByPageParams) {
        BeanValidator.verifyParams(queryByPageParams);
        QueryPage<T> queryPage = getBaseMapper().selectPage(
                new QueryPage<>(queryByPageParams), null);
        return toPageDto(queryPage);
    }

    @Override
    public List<D> getAllBaseDto() {
        List<T> list = getBaseMapper().selectList(null);
        return getDtoList(list);
    }

    public List<D> getAllBaseDto(ToDtoProcess<T, D> toDtoProcess) {
        List<T> list = getBaseMapper().selectList(null);
        return gettDtoListByProcess(list, toDtoProcess);
    }

    @Override
    public D getBaseDtoById(Long id) {
        T t = getById(id);
        if (t == null) {
            throw new ApiResponseException(669);
        }
        return toDto(t);
    }

    public PageDto<Map<String, Object>> toMapPageDto(
            QueryPage<Map<String, Object>> queryPage) {
        IPage<Map<String, Object>> iPage = queryPage;
        return toMapPageDto(iPage);
    }

    public PageDto<Map<String, Object>> toMapPageDto(IPage<Map<String, Object>> iPage) {
        PageDto<Map<String, Object>> pageDto = new PageDto<>();
        pageDto.setIndex(iPage.getCurrent());
        pageDto.setSize(iPage.getSize());
        pageDto.setTotal(iPage.getTotal());

        List<Map<String, Object>> mapRecordList = new ArrayList<>(iPage.getRecords().size());
        for (Map<String, Object> record : iPage.getRecords()) {
            Map<String, Object> mapRecord = new HashMap<>(record.size());
            for (Map.Entry<String, Object> entry : record.entrySet()) {
                mapRecord.put(StringUtil.lineToHump(entry.getKey()), entry.getValue());
            }
            mapRecordList.add(mapRecord);
        }
        pageDto.setList(mapRecordList);
        return pageDto;
    }

    public PageDto<D> toPageDto(QueryPage<T> queryPage) {
        IPage<T> iPage = queryPage;
        return toPageDto(iPage);
    }

    public PageDto<D> toPageDto(IPage<T> iPage) {
        PageDto<D> pageDto = new PageDto<>();
        pageDto.setIndex(iPage.getCurrent());
        pageDto.setSize(iPage.getSize());
        pageDto.setTotal(iPage.getTotal());
        pageDto.setList(getDtoList(iPage.getRecords()));
        return pageDto;
    }

    public PageDto<D> toPageDto(IPage<T> iPage, ToDtoProcess<T, D> toDtoProcess) {
        PageDto<D> pageDto = new PageDto<>();
        pageDto.setIndex(iPage.getCurrent());
        pageDto.setSize(iPage.getSize());
        pageDto.setTotal(iPage.getTotal());
        pageDto.setList(gettDtoListByProcess(iPage.getRecords(), toDtoProcess));
        return pageDto;
    }

    //********************

    private List<D> gettDtoListByProcess(List<T> list, ToDtoProcess<T, D> toDtoProcess) {
        List<D> dtoList = new ArrayList<>(list.size());
        for (T t : list) {
            dtoList.add(toDtoProcess.toDto(t));
        }
        return dtoList;
    }

}

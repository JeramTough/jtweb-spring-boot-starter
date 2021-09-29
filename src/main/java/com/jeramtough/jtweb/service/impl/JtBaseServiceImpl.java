package com.jeramtough.jtweb.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jeramtough.jtcomponent.utils.ObjectsUtil;
import com.jeramtough.jtcomponent.utils.StringUtil;
import com.jeramtough.jtweb.component.apiresponse.exception.ApiResponseBeanException;
import com.jeramtough.jtweb.component.apiresponse.exception.ApiResponseException;
import com.jeramtough.jtweb.component.business.ToEntityProcess;
import com.jeramtough.jtweb.component.validation.BeanValidator;
import com.jeramtough.jtweb.model.QueryPage;
import com.jeramtough.jtweb.model.dto.PageDto;
import com.jeramtough.jtweb.model.error.ErrorS;
import com.jeramtough.jtweb.model.error.ErrorU;
import com.jeramtough.jtweb.model.params.BaseConditionParams;
import com.jeramtough.jtweb.model.params.QueryByPageParams;
import com.jeramtough.jtweb.service.JtBaseService;
import org.springframework.web.context.WebApplicationContext;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <pre>
 * Created on 2020/10/25 16:43
 * by @author WeiBoWen
 * </pre>
 */
public abstract class JtBaseServiceImpl<M extends BaseMapper<T>, T, D>
        extends BaseDtoServiceImpl<M, T, D> implements JtBaseService<T, D> {

    /**
     * 数据库主键名
     */
    private static final String[] PRIMARY_KEY_NAME = new String[]{"fid", "id"};

    private static final String[] CREATE_TIME_NAME = new String[]{"createTime"};
    private static final String[] UPDATE_TIME_NAME = new String[]{"updateTime"};

    public JtBaseServiceImpl(WebApplicationContext wc) {
        super(wc);
    }


    @Override
    public String addByParams(Object params) {
        BeanValidator.verifyParams(params);

        T entity = getMapperFacade().map(params, getEntityClass());

        setCreateTime(entity);

        boolean isSuccessful = this.save(entity);
        if (!isSuccessful) {
            throw new ApiResponseException(ErrorS.CODE_2.C, "插入");
        }
        return "新增成功";
    }

    @Override
    public String updateByParams(Object params) {
        BeanValidator.verifyParams(params);

        Long fid = getPrimaryKeyValue(params);
        T entityFromDb = getBaseMapper().selectById(fid);
        if (entityFromDb == null) {
            throw new ApiResponseException(ErrorU.CODE_9.C, "主键" + PRIMARY_KEY_NAME);
        }

        T entity = (T) getMapperFacade().map(params, entityFromDb.getClass());

        setUpdateTime(entity);

        int resultCount = getBaseMapper().updateById(entity);
        if (resultCount == 0) {
            throw new ApiResponseException(ErrorS.CODE_5.C,
                    "[" + PRIMARY_KEY_NAME + "=" + fid);
        }

        return "更新成功";
    }

    @Override
    public String addOrUpdateBatchByParamsList(List<?> paramsList) {
        return addOrUpdateBatchByParamsList(paramsList, null);
    }

    @Override
    public String addOrUpdateBatchByParamsList(List<?> paramsList,
                                               ToEntityProcess<T> toEntityProcess) {
        List<T> entityList = paramsList
                .parallelStream()
                .peek(BeanValidator::verifyParams)
                .map(params -> getMapperFacade().map(params, getEntityClass()))
                .collect(Collectors.toList());

        entityList
                .parallelStream()
                .forEach(entity -> {
                    Long fid = getPrimaryKeyValue(entity);
                    if (fid == null) {
                        setCreateTime(entity);
                    }
                    else {
                        setUpdateTime(entity);
                    }

                    if (toEntityProcess != null) {
                        toEntityProcess.toEntity(entity);
                    }
                });

        boolean isSuccessful = saveOrUpdateBatch(entityList);
        if (!isSuccessful) {
            throw new ApiResponseException(ErrorS.CODE_2.C, "更新");
        }
        return "新增/更新成功！";
    }

    @Override
    public String addOrUpdateByParams(Object params) {
        BeanValidator.verifyParams(params);

        Long fid = getPrimaryKeyValue(params);
        if (fid != null) {
            return this.updateByParams(params);
        }
        else {
            return this.addByParams(params);
        }
    }

    @Override
    public String updateByParamsList(List<?> params) {
        params.parallelStream()
              .forEach(this::updateByParams);
        return "批量更新成功";
    }

    @Override
    public String removeOneById(Long fid) {
        if (getBaseMapper().selectById(fid) == null) {
            throw new ApiResponseException(ErrorU.CODE_9.C, "fid对应");
        }
        if (getBaseMapper().deleteById(fid) == 0) {
            throw new ApiResponseException(ErrorS.CODE_2.C, "删除资源");
        }
        return "删除成功！";
    }

    @Override
    public PageDto<D> pageByCondition(QueryByPageParams queryByPageParams,
                                      BaseConditionParams params) {
        BeanValidator.verifyParams(params);

        QueryWrapper<T> queryWrapper = new QueryWrapper<>();
        if (params.getOrderBy() != null) {
            List<String> columns = StringUtil.splitByComma(params.getOrderBy());
            for (int i = 0; i < columns.size(); i++) {
                String colum = columns.get(i);
                colum = StringUtil.humpToLine(colum);
                columns.set(i, colum);
            }

            if (params.isAsc()) {
                queryWrapper.orderByAsc(columns.toArray(new String[0]));
            }
            else {
                queryWrapper.orderByDesc(columns.toArray(new String[0]));
            }
        }

        return pageByConditionTwo(queryByPageParams, params, queryWrapper);
    }

    public PageDto<D> pageByConditionTwo(QueryByPageParams queryByPageParams,
                                         BaseConditionParams params,
                                         QueryWrapper<T> queryWrapper) {
        return pageByConditionThree(queryByPageParams, params, queryWrapper);
    }

    public PageDto<D> pageByConditionThree(QueryByPageParams queryByPageParams,
                                           BaseConditionParams params,
                                           QueryWrapper<T> queryWrapper) {


        if (params.getStartDate() != null && params.getEndDate() != null) {
            queryWrapper.and(wrapper ->
                    wrapper.between("create_time", params.getStartDate(),
                            params.getEndDate()));
        }

        QueryPage<T> queryPage =
                getBaseMapper().selectPage(new QueryPage<>(queryByPageParams),
                        queryWrapper);

        return toPageDto(queryPage);
    }

    @Override
    public boolean save(T entity) {
        boolean isSuccessful = super.save(entity);
        if (!isSuccessful) {
            throw new ApiResponseException(ErrorS.CODE_2.C, "保存");
        }
        return true;
    }

    @Override
    public boolean saveOrUpdate(T entity) {
        boolean isSuccessful = super.saveOrUpdate(entity);
        if (!isSuccessful) {
            throw new ApiResponseException(ErrorS.CODE_2.C, "保存或者更新");
        }
        return true;
    }

    @Override
    public boolean saveOrUpdate(T entity, Wrapper<T> updateWrapper) {
        boolean isSuccessful = super.saveOrUpdate(entity, updateWrapper);
        if (!isSuccessful) {
            throw new ApiResponseException(ErrorS.CODE_2.C, "保存或者更新");
        }
        return true;
    }

    @Override
    public boolean saveBatch(Collection<T> entityList) {
        boolean isSuccessful = super.saveBatch(entityList);
        if (!isSuccessful) {
            throw new ApiResponseException(ErrorS.CODE_2.C, "批量保存");
        }
        return true;
    }

    @Override
    public boolean saveBatch(Collection<T> entityList, int batchSize) {
        boolean isSuccessful = super.saveBatch(entityList, batchSize);
        if (!isSuccessful) {
            throw new ApiResponseException(ErrorS.CODE_2.C, "批量保存");
        }
        return true;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<T> entityList) {
        boolean isSuccessful = super.saveOrUpdateBatch(entityList);
        if (!isSuccessful) {
            throw new ApiResponseException(ErrorS.CODE_2.C, "批量保存或者更新");
        }
        return true;
    }


    @Override
    public boolean saveOrUpdateBatch(Collection<T> entityList, int batchSize) {
        boolean isSuccessful = super.saveOrUpdateBatch(entityList, batchSize);
        if (!isSuccessful) {
            throw new ApiResponseException(ErrorS.CODE_2.C, "批量保存或者更新");
        }
        return true;
    }

    @Override
    public boolean remove(Wrapper<T> queryWrapper) {
        boolean isSuccessful = super.remove(queryWrapper);
        if (!isSuccessful) {
            throw new ApiResponseException(ErrorS.CODE_2.C, "删除");
        }
        return true;
    }

    @Override
    public boolean removeById(Serializable id) {
        boolean isSuccessful = super.removeById(id);
        if (!isSuccessful) {
            throw new ApiResponseException(ErrorS.CODE_2.C, "根据Id删除");
        }
        return true;
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        boolean isSuccessful = super.removeByIds(idList);
        if (!isSuccessful) {
            throw new ApiResponseException(ErrorS.CODE_2.C, "根据Id批量删除");
        }
        return true;
    }

    @Override
    public T getById(Serializable id) {
        T t = super.getById(id);
        if (t == null) {
            throw new ApiResponseException(ErrorU.CODE_9.C, "fid对应");
        }
        return t;
    }

    @Override
    public T getOne(Wrapper<T> queryWrapper) {
        T t = super.getOne(queryWrapper);
        if (t == null) {
            throw new ApiResponseException(ErrorU.CODE_9.C, "查询对应");
        }
        return t;
    }

    //***********************************

    private Long getPrimaryKeyValue(Object params) {
        boolean has = false;
        Long fid = null;
        for (String name : PRIMARY_KEY_NAME) {
            try {
                Field field = params.getClass().getDeclaredField(name);
                field.setAccessible(true);
                fid = (Long) field.get(params);
                has = true;
                break;
            }
            catch (NoSuchFieldException | IllegalAccessException ignored) {
            }
        }

        if (!has) {
            throw new ApiResponseBeanException(ErrorU.CODE_1.C,
                    Arrays.toString(PRIMARY_KEY_NAME));
        }
        else {
            return fid;
        }

    }

    private void setCreateTime(T entity) {
        for (String name : CREATE_TIME_NAME) {
            ObjectsUtil.setTime(entity, name);
        }
    }

    private void setUpdateTime(T entity) {
        for (String name : UPDATE_TIME_NAME) {
            ObjectsUtil.setTime(entity, name);
        }
    }


}

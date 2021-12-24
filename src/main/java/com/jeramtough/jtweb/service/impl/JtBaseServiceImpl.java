package com.jeramtough.jtweb.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jeramtough.jtcomponent.utils.ObjectsUtil;
import com.jeramtough.jtcomponent.utils.StringUtil;
import com.jeramtough.jtweb.component.apiresponse.exception.ApiResponseBeanException;
import com.jeramtough.jtweb.component.apiresponse.exception.ApiResponseException;
import com.jeramtough.jtweb.component.business.ToEntityProcess;
import com.jeramtough.jtweb.component.business.ToEntityWithBundleProcess;
import com.jeramtough.jtweb.component.validation.BeanValidator;
import com.jeramtough.jtweb.model.QueryPage;
import com.jeramtough.jtweb.model.dto.PageDto;
import com.jeramtough.jtweb.model.error.ErrorS;
import com.jeramtough.jtweb.model.error.ErrorU;
import com.jeramtough.jtweb.model.params.BaseConditionParams;
import com.jeramtough.jtweb.model.params.QueryByPageParams;
import com.jeramtough.jtweb.service.JtBaseService;
import org.springframework.util.StringUtils;
import org.springframework.web.context.WebApplicationContext;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.*;

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
    private static final String[] DEFAULT_PRIMARY_KEY_NAME = new String[]{"fid", "id"};

    private static final String[] CREATE_TIME_NAME = new String[]{"createTime"};
    private static final String[] UPDATE_TIME_NAME = new String[]{"updateTime"};

    public JtBaseServiceImpl(WebApplicationContext wc) {
        super(wc);
    }


    @Override
    public String addByParams(Object params) {
        BeanValidator.verifyParams(params);

        T entity = toEntity(params, getEntityClass());

        setCreateTime(entity);

        boolean isSuccessful = this.save(entity);
        if (!isSuccessful) {
            throw new ApiResponseException(ErrorS.CODE_2.C, "插入");
        }
        return "新增成功";
    }

    @Override
    public T addByParamsAndReturnEntity(Object params) {
        BeanValidator.verifyParams(params);

        T entity = toEntity(params, getEntityClass());

        setCreateTime(entity);

        boolean isSuccessful = this.save(entity);
        if (!isSuccessful) {
            throw new ApiResponseException(ErrorS.CODE_2.C, "插入");
        }
        return entity;
    }

    @Override
    public String updateByParams(Object params) {
        BeanValidator.verifyParams(params);

        Serializable fid = getPrimaryKeyValue(params);
        T entityFromDb = getBaseMapper().selectById(fid);
        if (entityFromDb == null) {
            throw new ApiResponseException(ErrorU.CODE_9.C,
                    "主键" + getPrimaryKeyNames(DEFAULT_PRIMARY_KEY_NAME));
        }

        T entity = toEntity(params, entityFromDb.getClass());

        setUpdateTime(entity);

        int resultCount = getBaseMapper().updateById(entity);
        if (resultCount == 0) {
            throw new ApiResponseException(ErrorS.CODE_5.C,
                    "[" + DEFAULT_PRIMARY_KEY_NAME + "=" + fid);
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
        List<T> entityList = new ArrayList<>();
        for (Object params : paramsList) {
            BeanValidator.verifyParams(params);
            T t = toEntity(params, getEntityClass());
            entityList.add(t);
        }

        entityList
                .parallelStream()
                .forEach(entity -> {
                    Serializable fid = getPrimaryKeyValue(entity);
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
    public String addOrUpdateBatchByParamsList(List<?> paramsList,
                                               Map<String, Object> bundle,
                                               ToEntityWithBundleProcess<T> toEntityProcess) {

        if (bundle == null) {
            bundle = new HashMap<>(0);
        }

        List<T> entityList = new ArrayList<>();
        for (Object params : paramsList) {
            BeanValidator.verifyParams(params);
            T t = toEntity(params, getEntityClass());
            entityList.add(t);
        }

        Map<String, Object> finalBundle = bundle;

        entityList
                .parallelStream()
                .forEach(entity -> {
                    Serializable fid = getPrimaryKeyValue(entity);
                    if (fid == null) {
                        setCreateTime(entity);
                    }
                    else {
                        setUpdateTime(entity);
                    }

                    if (toEntityProcess != null) {
                        toEntityProcess.toEntity(entity, finalBundle);
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

        Serializable fid = getPrimaryKeyValue(params);
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
    public D oneByCondition(BaseConditionParams params, boolean enableReturnNull) {
        BeanValidator.verifyParams(params);
        QueryWrapper<T> queryWrapper = new QueryWrapper<>();
        setCondition(params, queryWrapper);

        T t = getOne(queryWrapper);
        if (!enableReturnNull) {
            if (t == null) {
                throw new ApiResponseBeanException(ErrorU.CODE_10.C,
                        getEntityClass().getSimpleName(), params == null ? "查詢条件" :
                        params.toString());
            }
        }
        return toDto(t);
    }

    @Override
    public List<D> listByCondition(BaseConditionParams params) {
        BeanValidator.verifyParams(params);
        QueryWrapper<T> queryWrapper = new QueryWrapper<>();
        setCondition(params, queryWrapper);

        List<T> entityList = list(queryWrapper);
        List<D> dList = getDtoList(entityList);
        return dList;
    }

    @Override
    public PageDto<D> pageByCondition(QueryByPageParams queryByPageParams,
                                      BaseConditionParams params) {
        BeanValidator.verifyParams(params);

        QueryWrapper<T> queryWrapper = new QueryWrapper<>();

        setCondition(params, queryWrapper);

        QueryPage<T> queryPage =
                getBaseMapper().selectPage(new QueryPage<>(queryByPageParams),
                        queryWrapper);

        return toPageDto(queryPage);
    }

    @Override
    public String removeByCondition(BaseConditionParams params, boolean enableReturnNull) {
        BeanValidator.verifyParams(params);

        QueryWrapper<T> queryWrapper = new QueryWrapper<>();
        setCondition(params,queryWrapper);

        int removeCount=getBaseMapper().delete(queryWrapper);
        if (removeCount==0){
            if (enableReturnNull){
                return null;
            }
            else{
                throw new ApiResponseException(ErrorS.CODE_2.C, "删除资源");
            }
        }
        else{
            return "删除成功!";
        }
    }

    public void setCondition(BaseConditionParams params, QueryWrapper<T> queryWrapper) {
        //排序
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

        //时间环
        if (params.getStartDate() != null && params.getEndDate() != null) {
            String column = "create_time";
            if (StringUtils.hasText(params.getOrderBy())) {
                column = params.getOrderBy();
            }

            if (StringUtils.hasText(params.getTimeBy())) {
                column = params.getTimeBy();
            }

            String finalColumn = column;
            queryWrapper.and(wrapper ->
                    wrapper.between(finalColumn, params.getStartDate(),
                            params.getEndDate()));
        }

        if (params.getStartTime() != null && params.getEndTime() != null) {
            String column = "create_time";
            if (StringUtils.hasText(params.getOrderBy())) {
                column = params.getOrderBy();
            }

            if (StringUtils.hasText(params.getTimeBy())) {
                column = params.getTimeBy();
            }

            String finalColumn = column;
            queryWrapper.and(wrapper ->
                    wrapper.between(finalColumn, params.getStartTime(),
                            params.getEndTime()));
        }

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

    @Override
    public List<T> listByIds(Collection<? extends Serializable> idList) {
        if (idList == null || idList.isEmpty()) {
            return new ArrayList<>();
        }
        return super.listByIds(idList);
    }

    protected String[] getPrimaryKeyNames(String[] defaultPrimaryKeyName) {
        return defaultPrimaryKeyName;
    }

    //////////////////////////////////////////////////

    protected Serializable getPrimaryKeyValue(Object params) {
        boolean has = false;
        Serializable fid = null;
        String[] pimaryKeyNames = getPrimaryKeyNames(DEFAULT_PRIMARY_KEY_NAME);

        for (String name : pimaryKeyNames) {
            try {
                Field field = params.getClass().getDeclaredField(name);
                field.setAccessible(true);
                fid = (Serializable) field.get(params);
                has = true;
                break;
            }
            catch (NoSuchFieldException | IllegalAccessException ignored) {
            }
        }

        if (!has) {
            throw new ApiResponseBeanException(ErrorU.CODE_1.C,
                    Arrays.toString(getPrimaryKeyNames(DEFAULT_PRIMARY_KEY_NAME)));
        }
        else {
            return fid;
        }

    }

    protected void setCreateTime(T entity) {
        for (String name : CREATE_TIME_NAME) {
            ObjectsUtil.setTime(entity, name);
        }
    }

    protected void setUpdateTime(T entity) {
        for (String name : UPDATE_TIME_NAME) {
            ObjectsUtil.setTime(entity, name);
        }
    }


}

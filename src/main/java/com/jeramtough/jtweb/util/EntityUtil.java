package com.jeramtough.jtweb.util;

import com.baomidou.mybatisplus.annotation.TableId;
import com.jeramtough.jtcomponent.utils.StringUtil;
import com.jeramtough.jtweb.component.cache.annotation.BeCached;
import com.jeramtough.jtweb.component.cache.annotation.CacheId;

import java.io.Serializable;
import java.lang.reflect.Field;

/**
 * <pre>
 * Created on 2021/8/13 下午2:43
 * by @author WeiBoWen
 * </pre>
 */
public class EntityUtil {

    public static Serializable getIdValue(Object entity) {
        Serializable idValue = null;

        //方案1
        BeCached beCachedAnnotation = entity.getClass().getDeclaredAnnotation(BeCached.class);
        if (beCachedAnnotation != null) {
            String idName=null;

            if (!StringUtil.isEmpty(beCachedAnnotation.value())){
                idName=beCachedAnnotation.value();
            }

            if (StringUtil.isEmpty(idName)){
                if (!StringUtil.isEmpty(beCachedAnnotation.cacheId())){
                    idName=beCachedAnnotation.cacheId();
                }
            }

            if (!StringUtil.isEmpty(idName)){
                Field field;
                try {
                    field = entity.getClass().getDeclaredField(idName);
                    idValue = field.get(entity) == null ? null : (Serializable) field.get(
                            entity);
                }
                catch (NoSuchFieldException | IllegalAccessException e) {
                    e.printStackTrace();
                }

            }
        }

        //方案2
        if (idValue==null){
            for (Field field : entity.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                TableId tableIdAnnotaion = field.getDeclaredAnnotation(TableId.class);
                CacheId cacheIdAnnotaion = field.getDeclaredAnnotation(CacheId.class);
                if (tableIdAnnotaion != null || cacheIdAnnotaion != null) {
                    try {
                        idValue = field.get(entity) == null ? null : (Serializable) field.get(
                                entity);
                        break;
                    }
                    catch (IllegalAccessException ignored) {
                    }
                }
            }
        }

        //方案3
        if (idValue == null) {
            String[] maybeIdNames = {"id", "ID", "fid", "FID"};
            Field idField = null;

            for (String idName : maybeIdNames) {
                try {
                    idField = entity.getClass().getField(idName);
                    break;
                }
                catch (NoSuchFieldException e) {
                    e.printStackTrace();
                }
            }
            if (idField != null) {
                try {
                    idValue = idField.get(entity) == null ? null : (Serializable) idField.get(
                            entity);
                }
                catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return idValue;
    }

}

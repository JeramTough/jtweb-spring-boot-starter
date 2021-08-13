package com.jeramtough.jtweb.util;

import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.lang.reflect.Field;

/**
 * <pre>
 * Created on 2021/8/13 下午2:43
 * by @author WeiBoWen
 * </pre>
 */
public class EntityUtil {

    public static Serializable getIdVallue(Object entity) {
        Serializable idValue = null;
        for (Field field : entity.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            TableId tableIdAnnotaion = field.getDeclaredAnnotation(TableId.class);
            if (tableIdAnnotaion != null) {
                try {
                    idValue = field.get(entity) == null ? null : (Serializable) field.get(
                            entity);
                    break;
                }
                catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
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

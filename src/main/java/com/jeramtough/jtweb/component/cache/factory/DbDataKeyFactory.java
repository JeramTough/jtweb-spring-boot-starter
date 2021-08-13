package com.jeramtough.jtweb.component.cache.factory;

import cn.hutool.core.util.ClassUtil;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.jeramtough.jtcomponent.utils.StringUtil;
import com.jeramtough.jtweb.component.bebezium.event.DbDataChangedEvent;
import com.jeramtough.jtweb.component.cache.bean.DbDataKey;
import com.jeramtough.jtweb.util.EntityUtil;

import java.io.Serializable;
import java.lang.reflect.Field;

/**
 * <pre>
 * Created on 2021/8/13 上午9:48
 * by @author WeiBoWen
 * </pre>
 */
public class DbDataKeyFactory {

    public static DbDataKey getDbDataKey(DbDataChangedEvent dbDataChangedEvent) {
        return null;
    }

    public static DbDataKey getDbDataKey(Object entity) {
        TableName tableNameAnnotation = entity.getClass().getDeclaredAnnotation(
                TableName.class);
        String tableName = tableNameAnnotation.value();
        if (StringUtil.isEmpty(tableName)) {
            tableName = StringUtil.humpToLine(entity.getClass().getSimpleName());
        }

        String databaseName = tableNameAnnotation.schema();
        if (StringUtil.isEmpty(databaseName)) {
            databaseName = null;
        }

        String idValue;
        Serializable tempVar = EntityUtil.getIdVallue(entity);
        idValue = tempVar == null ? null : tempVar.toString();

        DbDataKey dbDataKey = new DbDataKey();
        dbDataKey.setDatabaseName(databaseName);
        dbDataKey.setTableName(tableName);
        dbDataKey.setIdValue(idValue);
        return dbDataKey;
    }
}

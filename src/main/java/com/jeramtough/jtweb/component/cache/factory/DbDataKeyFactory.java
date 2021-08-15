package com.jeramtough.jtweb.component.cache.factory;

import com.baomidou.mybatisplus.annotation.TableName;
import com.jeramtough.jtcomponent.utils.StringUtil;
import com.jeramtough.jtweb.component.bebezium.event.DbDataChangedEvent;
import com.jeramtough.jtweb.component.cache.bean.DbDataKey;
import com.jeramtough.jtweb.util.EntityUtil;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

/**
 * <pre>
 * Created on 2021/8/13 上午9:48
 * by @author WeiBoWen
 * </pre>
 */
public class DbDataKeyFactory {

    public static DbDataKey getDbDataKey(DbDataChangedEvent dbDataChangedEvent) {
        DbDataKey dbDataKey = new DbDataKey();
        dbDataKey.setIdValue(dbDataChangedEvent.getChangedData().getIdKeyValue());
        dbDataKey.setTableName(dbDataChangedEvent.getChangedData().getTableName());
        dbDataKey.setDatabaseName(dbDataChangedEvent.getChangedData().getDbName());
        return dbDataKey;
    }

    public static List<DbDataKey> getDbDataKey(Object entity) {
        if (entity == null) {
            return new ArrayList<>();
        }
        return Collections.singletonList(toDbDataKey(entity));
    }

    public static List<DbDataKey> getDbDataKey(List<?> listEntity) {
        if (listEntity.isEmpty()) {
            return new ArrayList<>();
        }

        List<DbDataKey> dataKeyList = listEntity
                .parallelStream()
                .map(DbDataKeyFactory::toDbDataKey)
                .collect(Collectors.toList());
        return dataKeyList;
    }

    public static List<DbDataKey> getDbDataKey(Set<?> setEntity) {
        if (setEntity.isEmpty()) {
            return new ArrayList<>();
        }

        List<DbDataKey> dataKeyList = setEntity
                .parallelStream()
                .map(DbDataKeyFactory::toDbDataKey)
                .collect(Collectors.toList());
        return dataKeyList;
    }

    //*************

    private static DbDataKey toDbDataKey(Object entity) {
        TableName tableNameAnnotation = entity.getClass().getDeclaredAnnotation(
                TableName.class);
        String tableName;
        String databaseName = null;
        if (tableNameAnnotation != null) {
            tableName = tableNameAnnotation.value();

            if (StringUtil.isEmpty(tableName)) {
                tableName = StringUtil.humpToLine(entity.getClass().getSimpleName());
            }

            databaseName = tableNameAnnotation.schema();
        }
        else {
            tableName = StringUtil.humpToLine(entity.getClass().getSimpleName());
        }


        String idValue;
        Serializable tempVar = EntityUtil.getIdValue(entity);
        idValue = tempVar == null ? null : tempVar.toString();

        DbDataKey dbDataKey = new DbDataKey();
        dbDataKey.setDatabaseName(databaseName);
        dbDataKey.setTableName(tableName);
        dbDataKey.setIdValue(idValue);
        dbDataKey.setDataClass(entity.getClass());
        return dbDataKey;
    }
}

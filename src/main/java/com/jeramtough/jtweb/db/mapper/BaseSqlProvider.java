package com.jeramtough.jtweb.db.mapper;

import com.jeramtough.jtcomponent.utils.ObjectsUtil;
import org.apache.ibatis.jdbc.SQL;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * Created on 2020/10/20 14:03
 * by @author WeiBoWen
 * </pre>
 */
public class BaseSqlProvider<T> {

    /**
     * Field集合的最大缓存数
     */
    public static final int CACHE_CAPACITY = 100;

    private static Map<Class, List<Field>> fieldsCache;

    static {
        fieldsCache = new HashMap<>(CACHE_CAPACITY);
    }

    public String getTableName(Class<T> clazz) {
        return com.jeramtough.jtcomponent.utils.StringUtil.humpToLine(clazz.getSimpleName());
    }

    public String getTableAliasName() {
        return "tb_1";
    }

    public SQL getCommonSql(Class<T> clazz) {
        SQL sql = new SQL();
        List<Field> fieldList = fieldsCache.get(clazz);
        if (fieldList == null) {
            fieldList = ObjectsUtil.getFieldsIfIncludeGetSet(clazz);
            putFieldsCache(clazz, fieldList);
        }
        String[] fields = new String[fieldList.size()];
        for (int i = 0; i < fieldList.size(); i++) {
            String javaObjectFieldName = fieldList.get(i).getName();
            fields[i] = com.jeramtough.jtcomponent.utils.StringUtil.humpToLine(javaObjectFieldName);
        }
        sql.SELECT(fields);
        sql.FROM(getTableName(clazz) + " AS " + getTableAliasName());
        return sql;
    }

    public static synchronized void putFieldsCache(Class<?> clazz, List<Field> fieldList) {
        if (fieldsCache.size() > CACHE_CAPACITY) {
            fieldsCache.clear();
        }
        fieldsCache.put(clazz, fieldList);
    }
}

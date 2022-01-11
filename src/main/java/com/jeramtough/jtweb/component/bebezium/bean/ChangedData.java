package com.jeramtough.jtweb.component.bebezium.bean;

import java.io.Serializable;
import java.util.Map;

/**
 * <pre>
 * Created on 2021/8/10 上午10:52
 * by @author WeiBoWen
 * </pre>
 */
public class ChangedData implements Serializable {

    private String dbName;
    private String tableName;
    private DbOptionType dbOptionType;
    private Map<String, Object> data;
    private String idKeyName;
    private String idKeyValue;


    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }


    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public DbOptionType getDbOptionType() {
        return dbOptionType;
    }

    public void setDbOptionType(DbOptionType dbOptionType) {
        this.dbOptionType = dbOptionType;
    }

    public String getIdKeyName() {
        return idKeyName;
    }

    public void setIdKeyName(String idKeyName) {
        this.idKeyName = idKeyName;
    }

    public String getIdKeyValue() {
        return idKeyValue;
    }

    public void setIdKeyValue(String idKeyValue) {
        this.idKeyValue = idKeyValue;
    }
}

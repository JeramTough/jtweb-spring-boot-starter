package com.jeramtough.jtweb.component.cache.bean;

import java.io.Serializable;

/**
 * <pre>
 * Created on 2021/8/13 上午9:42
 * by @author WeiBoWen
 * </pre>
 */
public class DbDataKey implements Serializable {

    private static final long serialVersionUID = -5669547469508491714L;

    private String databaseName;
    private String tableName;
    private String idValue;
    private Class<?> dataClass;
    private Class<?> wrapperClass;

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getIdValue() {
        return idValue;
    }

    public void setIdValue(String idValue) {
        this.idValue = idValue;
    }

    public Class<?> getDataClass() {
        return dataClass;
    }

    public void setDataClass(Class<?> dataClass) {
        this.dataClass = dataClass;
    }

    public Class<?> getWrapperClass() {
        return wrapperClass;
    }

    public void setWrapperClass(Class<?> wrapperClass) {
        this.wrapperClass = wrapperClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DbDataKey dbDataKey = (DbDataKey) o;

        if (databaseName != null ? !databaseName.equals(
                dbDataKey.databaseName) : dbDataKey.databaseName != null) {
            return false;
        }
        if (tableName != null ? !tableName.equals(
                dbDataKey.tableName) : dbDataKey.tableName != null) {
            return false;
        }
        return idValue != null ? idValue.equals(dbDataKey.idValue) : dbDataKey.idValue == null;
    }

    @Override
    public int hashCode() {
        int result = databaseName != null ? databaseName.hashCode() : 0;
        result = 31 * result + (tableName != null ? tableName.hashCode() : 0);
        result = 31 * result + (idValue != null ? idValue.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        if (databaseName != null && databaseName.length() > 0) {
            return "DbDataKey{" +
                    "databaseName='" + databaseName + '\'' +
                    ", tableName='" + tableName + '\'' +
                    ", idValue='" + idValue + '\'' +
                    '}';
        }
        else {
            return "DbDataKey{" +
                    ", tableName='" + tableName + '\'' +
                    ", idValue='" + idValue + '\'' +
                    '}';
        }
    }

    /**
     * 有时候会有没有数据库的情况，所以会有两种情况，key1和key2
     */
    public String toKey2() {
        return "DbDataKey{" +
                "databaseName='" + databaseName + '\'' +
                ", tableName='" + tableName + '\'' +
                ", idValue='" + idValue + '\'' +
                '}';
    }

    /**
     * 有时候会有没有数据库的情况，所以会有两种情况，key1和key2
     */
    public String toKey1() {
        return "DbDataKey{" +
                ", tableName='" + tableName + '\'' +
                ", idValue='" + idValue + '\'' +
                '}';
    }
}

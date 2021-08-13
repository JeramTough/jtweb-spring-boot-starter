package com.jeramtough.jtweb.component.cache.bean;

/**
 * <pre>
 * Created on 2021/8/13 上午9:42
 * by @author WeiBoWen
 * </pre>
 */
public class DbDataKey {

    private String databaseName;
    private String tableName;
    private String idValue;

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
}

package com.jeramtough.jtweb.component.bebezium.setting;

/**
 * <pre>
 * Created on 2021/8/10 上午11:58
 * by @author WeiBoWen
 * </pre>
 */
public class DbSourceSetting {

    private Boolean enable = true;
    private String serverId;
    private String hostname = "127.0.0.1";
    private String user = "root";
    private String password = "123456";
    private Integer port = 3306;
    private String databaseHistoryFile = "/var/mysql-cache/storage/dbhistory.dat";
    private String offsetStorageFile = "/var/mysql-cache/storage/offset.dat";
    private String includeDb;


    private String databaseType = "mysql";

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getDatabaseHistoryFile() {
        return databaseHistoryFile;
    }

    public void setDatabaseHistoryFile(String databaseHistoryFile) {
        this.databaseHistoryFile = databaseHistoryFile;
    }

    public String getOffsetStorageFile() {
        return offsetStorageFile;
    }

    public void setOffsetStorageFile(String offsetStorageFile) {
        this.offsetStorageFile = offsetStorageFile;
    }

    public String getIncludeDb() {
        return includeDb;
    }

    public void setIncludeDb(String includeDb) {
        this.includeDb = includeDb;
    }

    public String getDatabaseType() {
        return databaseType;
    }

    public void setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
    }


    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }
}

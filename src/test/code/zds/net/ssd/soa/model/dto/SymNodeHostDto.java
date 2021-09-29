package net.ssd.soa.model.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author WeiBoWen
 * @since 2021-09-08
 */
@ApiModel(value="SymNodeHost对象", description="")
public class SymNodeHostDto implements Serializable{

    private static final long serialVersionUID=1L;

    private String nodeId;

    private String hostName;

    private String instanceId;

    private String ipAddress;

    private String osUser;

    private String osName;

    private String osArch;

    private String osVersion;

    private Integer availableProcessors;

    private Long freeMemoryBytes;

    private Long totalMemoryBytes;

    private Long maxMemoryBytes;

    private String javaVersion;

    private String javaVendor;

    private String jdbcVersion;

    private String symmetricVersion;

    private String timezoneOffset;

    private LocalDateTime heartbeatTime;

    private LocalDateTime lastRestartTime;

    private LocalDateTime createTime;


    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getOsUser() {
        return osUser;
    }

    public void setOsUser(String osUser) {
        this.osUser = osUser;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getOsArch() {
        return osArch;
    }

    public void setOsArch(String osArch) {
        this.osArch = osArch;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public Integer getAvailableProcessors() {
        return availableProcessors;
    }

    public void setAvailableProcessors(Integer availableProcessors) {
        this.availableProcessors = availableProcessors;
    }

    public Long getFreeMemoryBytes() {
        return freeMemoryBytes;
    }

    public void setFreeMemoryBytes(Long freeMemoryBytes) {
        this.freeMemoryBytes = freeMemoryBytes;
    }

    public Long getTotalMemoryBytes() {
        return totalMemoryBytes;
    }

    public void setTotalMemoryBytes(Long totalMemoryBytes) {
        this.totalMemoryBytes = totalMemoryBytes;
    }

    public Long getMaxMemoryBytes() {
        return maxMemoryBytes;
    }

    public void setMaxMemoryBytes(Long maxMemoryBytes) {
        this.maxMemoryBytes = maxMemoryBytes;
    }

    public String getJavaVersion() {
        return javaVersion;
    }

    public void setJavaVersion(String javaVersion) {
        this.javaVersion = javaVersion;
    }

    public String getJavaVendor() {
        return javaVendor;
    }

    public void setJavaVendor(String javaVendor) {
        this.javaVendor = javaVendor;
    }

    public String getJdbcVersion() {
        return jdbcVersion;
    }

    public void setJdbcVersion(String jdbcVersion) {
        this.jdbcVersion = jdbcVersion;
    }

    public String getSymmetricVersion() {
        return symmetricVersion;
    }

    public void setSymmetricVersion(String symmetricVersion) {
        this.symmetricVersion = symmetricVersion;
    }

    public String getTimezoneOffset() {
        return timezoneOffset;
    }

    public void setTimezoneOffset(String timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }

    public LocalDateTime getHeartbeatTime() {
        return heartbeatTime;
    }

    public void setHeartbeatTime(LocalDateTime heartbeatTime) {
        this.heartbeatTime = heartbeatTime;
    }

    public LocalDateTime getLastRestartTime() {
        return lastRestartTime;
    }

    public void setLastRestartTime(LocalDateTime lastRestartTime) {
        this.lastRestartTime = lastRestartTime;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SymNodeHost{" +
        "nodeId=" + nodeId +
        ", hostName=" + hostName +
        ", instanceId=" + instanceId +
        ", ipAddress=" + ipAddress +
        ", osUser=" + osUser +
        ", osName=" + osName +
        ", osArch=" + osArch +
        ", osVersion=" + osVersion +
        ", availableProcessors=" + availableProcessors +
        ", freeMemoryBytes=" + freeMemoryBytes +
        ", totalMemoryBytes=" + totalMemoryBytes +
        ", maxMemoryBytes=" + maxMemoryBytes +
        ", javaVersion=" + javaVersion +
        ", javaVendor=" + javaVendor +
        ", jdbcVersion=" + jdbcVersion +
        ", symmetricVersion=" + symmetricVersion +
        ", timezoneOffset=" + timezoneOffset +
        ", heartbeatTime=" + heartbeatTime +
        ", lastRestartTime=" + lastRestartTime +
        ", createTime=" + createTime +
        "}";
    }
}

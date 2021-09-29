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
@ApiModel(value="SymNodeSecurity对象", description="")
public class SymNodeSecurityDto implements Serializable{

    private static final long serialVersionUID=1L;

    private String nodeId;

    private String nodePassword;

    private Integer registrationEnabled;

    private LocalDateTime registrationTime;

    private Integer initialLoadEnabled;

    private LocalDateTime initialLoadTime;

    private LocalDateTime initialLoadEndTime;

    private Long initialLoadId;

    private String initialLoadCreateBy;

    private Integer revInitialLoadEnabled;

    private LocalDateTime revInitialLoadTime;

    private Long revInitialLoadId;

    private String revInitialLoadCreateBy;

    private Integer failedLogins;

    private String createdAtNodeId;


    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodePassword() {
        return nodePassword;
    }

    public void setNodePassword(String nodePassword) {
        this.nodePassword = nodePassword;
    }

    public Integer getRegistrationEnabled() {
        return registrationEnabled;
    }

    public void setRegistrationEnabled(Integer registrationEnabled) {
        this.registrationEnabled = registrationEnabled;
    }

    public LocalDateTime getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(LocalDateTime registrationTime) {
        this.registrationTime = registrationTime;
    }

    public Integer getInitialLoadEnabled() {
        return initialLoadEnabled;
    }

    public void setInitialLoadEnabled(Integer initialLoadEnabled) {
        this.initialLoadEnabled = initialLoadEnabled;
    }

    public LocalDateTime getInitialLoadTime() {
        return initialLoadTime;
    }

    public void setInitialLoadTime(LocalDateTime initialLoadTime) {
        this.initialLoadTime = initialLoadTime;
    }

    public LocalDateTime getInitialLoadEndTime() {
        return initialLoadEndTime;
    }

    public void setInitialLoadEndTime(LocalDateTime initialLoadEndTime) {
        this.initialLoadEndTime = initialLoadEndTime;
    }

    public Long getInitialLoadId() {
        return initialLoadId;
    }

    public void setInitialLoadId(Long initialLoadId) {
        this.initialLoadId = initialLoadId;
    }

    public String getInitialLoadCreateBy() {
        return initialLoadCreateBy;
    }

    public void setInitialLoadCreateBy(String initialLoadCreateBy) {
        this.initialLoadCreateBy = initialLoadCreateBy;
    }

    public Integer getRevInitialLoadEnabled() {
        return revInitialLoadEnabled;
    }

    public void setRevInitialLoadEnabled(Integer revInitialLoadEnabled) {
        this.revInitialLoadEnabled = revInitialLoadEnabled;
    }

    public LocalDateTime getRevInitialLoadTime() {
        return revInitialLoadTime;
    }

    public void setRevInitialLoadTime(LocalDateTime revInitialLoadTime) {
        this.revInitialLoadTime = revInitialLoadTime;
    }

    public Long getRevInitialLoadId() {
        return revInitialLoadId;
    }

    public void setRevInitialLoadId(Long revInitialLoadId) {
        this.revInitialLoadId = revInitialLoadId;
    }

    public String getRevInitialLoadCreateBy() {
        return revInitialLoadCreateBy;
    }

    public void setRevInitialLoadCreateBy(String revInitialLoadCreateBy) {
        this.revInitialLoadCreateBy = revInitialLoadCreateBy;
    }

    public Integer getFailedLogins() {
        return failedLogins;
    }

    public void setFailedLogins(Integer failedLogins) {
        this.failedLogins = failedLogins;
    }

    public String getCreatedAtNodeId() {
        return createdAtNodeId;
    }

    public void setCreatedAtNodeId(String createdAtNodeId) {
        this.createdAtNodeId = createdAtNodeId;
    }

    @Override
    public String toString() {
        return "SymNodeSecurity{" +
        "nodeId=" + nodeId +
        ", nodePassword=" + nodePassword +
        ", registrationEnabled=" + registrationEnabled +
        ", registrationTime=" + registrationTime +
        ", initialLoadEnabled=" + initialLoadEnabled +
        ", initialLoadTime=" + initialLoadTime +
        ", initialLoadEndTime=" + initialLoadEndTime +
        ", initialLoadId=" + initialLoadId +
        ", initialLoadCreateBy=" + initialLoadCreateBy +
        ", revInitialLoadEnabled=" + revInitialLoadEnabled +
        ", revInitialLoadTime=" + revInitialLoadTime +
        ", revInitialLoadId=" + revInitialLoadId +
        ", revInitialLoadCreateBy=" + revInitialLoadCreateBy +
        ", failedLogins=" + failedLogins +
        ", createdAtNodeId=" + createdAtNodeId +
        "}";
    }
}

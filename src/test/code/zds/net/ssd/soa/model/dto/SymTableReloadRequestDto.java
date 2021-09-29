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
@ApiModel(value="SymTableReloadRequest对象", description="")
public class SymTableReloadRequestDto implements Serializable{

    private static final long serialVersionUID=1L;

    private String targetNodeId;

    private String sourceNodeId;

    private String triggerId;

    private String routerId;

    private LocalDateTime createTime;

    private Integer createTable;

    private Integer deleteFirst;

    private String reloadSelect;

    private String beforeCustomSql;

    private LocalDateTime reloadTime;

    private Long loadId;

    private Integer processed;

    private String channelId;

    private String lastUpdateBy;

    private LocalDateTime lastUpdateTime;


    public String getTargetNodeId() {
        return targetNodeId;
    }

    public void setTargetNodeId(String targetNodeId) {
        this.targetNodeId = targetNodeId;
    }

    public String getSourceNodeId() {
        return sourceNodeId;
    }

    public void setSourceNodeId(String sourceNodeId) {
        this.sourceNodeId = sourceNodeId;
    }

    public String getTriggerId() {
        return triggerId;
    }

    public void setTriggerId(String triggerId) {
        this.triggerId = triggerId;
    }

    public String getRouterId() {
        return routerId;
    }

    public void setRouterId(String routerId) {
        this.routerId = routerId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateTable() {
        return createTable;
    }

    public void setCreateTable(Integer createTable) {
        this.createTable = createTable;
    }

    public Integer getDeleteFirst() {
        return deleteFirst;
    }

    public void setDeleteFirst(Integer deleteFirst) {
        this.deleteFirst = deleteFirst;
    }

    public String getReloadSelect() {
        return reloadSelect;
    }

    public void setReloadSelect(String reloadSelect) {
        this.reloadSelect = reloadSelect;
    }

    public String getBeforeCustomSql() {
        return beforeCustomSql;
    }

    public void setBeforeCustomSql(String beforeCustomSql) {
        this.beforeCustomSql = beforeCustomSql;
    }

    public LocalDateTime getReloadTime() {
        return reloadTime;
    }

    public void setReloadTime(LocalDateTime reloadTime) {
        this.reloadTime = reloadTime;
    }

    public Long getLoadId() {
        return loadId;
    }

    public void setLoadId(Long loadId) {
        this.loadId = loadId;
    }

    public Integer getProcessed() {
        return processed;
    }

    public void setProcessed(Integer processed) {
        this.processed = processed;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public LocalDateTime getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(LocalDateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Override
    public String toString() {
        return "SymTableReloadRequest{" +
        "targetNodeId=" + targetNodeId +
        ", sourceNodeId=" + sourceNodeId +
        ", triggerId=" + triggerId +
        ", routerId=" + routerId +
        ", createTime=" + createTime +
        ", createTable=" + createTable +
        ", deleteFirst=" + deleteFirst +
        ", reloadSelect=" + reloadSelect +
        ", beforeCustomSql=" + beforeCustomSql +
        ", reloadTime=" + reloadTime +
        ", loadId=" + loadId +
        ", processed=" + processed +
        ", channelId=" + channelId +
        ", lastUpdateBy=" + lastUpdateBy +
        ", lastUpdateTime=" + lastUpdateTime +
        "}";
    }
}

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
@ApiModel(value="SymTableReloadStatus对象", description="")
public class SymTableReloadStatusDto implements Serializable{

    private static final long serialVersionUID=1L;

    private Long loadId;

    private String sourceNodeId;

    private String targetNodeId;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private Integer completed;

    private Integer cancelled;

    private Integer fullLoad;

    private Long startDataBatchId;

    private Long endDataBatchId;

    private Long setupBatchCount;

    private Long dataBatchCount;

    private Long finalizeBatchCount;

    private Long setupBatchLoaded;

    private Long dataBatchLoaded;

    private Long finalizeBatchLoaded;

    private Long tableCount;

    private Long rowsLoaded;

    private Long rowsCount;

    private Integer errorFlag;

    private String sqlState;

    private Integer sqlCode;

    private String sqlMessage;

    private String lastUpdateBy;

    private LocalDateTime lastUpdateTime;


    public Long getLoadId() {
        return loadId;
    }

    public void setLoadId(Long loadId) {
        this.loadId = loadId;
    }

    public String getSourceNodeId() {
        return sourceNodeId;
    }

    public void setSourceNodeId(String sourceNodeId) {
        this.sourceNodeId = sourceNodeId;
    }

    public String getTargetNodeId() {
        return targetNodeId;
    }

    public void setTargetNodeId(String targetNodeId) {
        this.targetNodeId = targetNodeId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Integer getCompleted() {
        return completed;
    }

    public void setCompleted(Integer completed) {
        this.completed = completed;
    }

    public Integer getCancelled() {
        return cancelled;
    }

    public void setCancelled(Integer cancelled) {
        this.cancelled = cancelled;
    }

    public Integer getFullLoad() {
        return fullLoad;
    }

    public void setFullLoad(Integer fullLoad) {
        this.fullLoad = fullLoad;
    }

    public Long getStartDataBatchId() {
        return startDataBatchId;
    }

    public void setStartDataBatchId(Long startDataBatchId) {
        this.startDataBatchId = startDataBatchId;
    }

    public Long getEndDataBatchId() {
        return endDataBatchId;
    }

    public void setEndDataBatchId(Long endDataBatchId) {
        this.endDataBatchId = endDataBatchId;
    }

    public Long getSetupBatchCount() {
        return setupBatchCount;
    }

    public void setSetupBatchCount(Long setupBatchCount) {
        this.setupBatchCount = setupBatchCount;
    }

    public Long getDataBatchCount() {
        return dataBatchCount;
    }

    public void setDataBatchCount(Long dataBatchCount) {
        this.dataBatchCount = dataBatchCount;
    }

    public Long getFinalizeBatchCount() {
        return finalizeBatchCount;
    }

    public void setFinalizeBatchCount(Long finalizeBatchCount) {
        this.finalizeBatchCount = finalizeBatchCount;
    }

    public Long getSetupBatchLoaded() {
        return setupBatchLoaded;
    }

    public void setSetupBatchLoaded(Long setupBatchLoaded) {
        this.setupBatchLoaded = setupBatchLoaded;
    }

    public Long getDataBatchLoaded() {
        return dataBatchLoaded;
    }

    public void setDataBatchLoaded(Long dataBatchLoaded) {
        this.dataBatchLoaded = dataBatchLoaded;
    }

    public Long getFinalizeBatchLoaded() {
        return finalizeBatchLoaded;
    }

    public void setFinalizeBatchLoaded(Long finalizeBatchLoaded) {
        this.finalizeBatchLoaded = finalizeBatchLoaded;
    }

    public Long getTableCount() {
        return tableCount;
    }

    public void setTableCount(Long tableCount) {
        this.tableCount = tableCount;
    }

    public Long getRowsLoaded() {
        return rowsLoaded;
    }

    public void setRowsLoaded(Long rowsLoaded) {
        this.rowsLoaded = rowsLoaded;
    }

    public Long getRowsCount() {
        return rowsCount;
    }

    public void setRowsCount(Long rowsCount) {
        this.rowsCount = rowsCount;
    }

    public Integer getErrorFlag() {
        return errorFlag;
    }

    public void setErrorFlag(Integer errorFlag) {
        this.errorFlag = errorFlag;
    }

    public String getSqlState() {
        return sqlState;
    }

    public void setSqlState(String sqlState) {
        this.sqlState = sqlState;
    }

    public Integer getSqlCode() {
        return sqlCode;
    }

    public void setSqlCode(Integer sqlCode) {
        this.sqlCode = sqlCode;
    }

    public String getSqlMessage() {
        return sqlMessage;
    }

    public void setSqlMessage(String sqlMessage) {
        this.sqlMessage = sqlMessage;
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
        return "SymTableReloadStatus{" +
        "loadId=" + loadId +
        ", sourceNodeId=" + sourceNodeId +
        ", targetNodeId=" + targetNodeId +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", completed=" + completed +
        ", cancelled=" + cancelled +
        ", fullLoad=" + fullLoad +
        ", startDataBatchId=" + startDataBatchId +
        ", endDataBatchId=" + endDataBatchId +
        ", setupBatchCount=" + setupBatchCount +
        ", dataBatchCount=" + dataBatchCount +
        ", finalizeBatchCount=" + finalizeBatchCount +
        ", setupBatchLoaded=" + setupBatchLoaded +
        ", dataBatchLoaded=" + dataBatchLoaded +
        ", finalizeBatchLoaded=" + finalizeBatchLoaded +
        ", tableCount=" + tableCount +
        ", rowsLoaded=" + rowsLoaded +
        ", rowsCount=" + rowsCount +
        ", errorFlag=" + errorFlag +
        ", sqlState=" + sqlState +
        ", sqlCode=" + sqlCode +
        ", sqlMessage=" + sqlMessage +
        ", lastUpdateBy=" + lastUpdateBy +
        ", lastUpdateTime=" + lastUpdateTime +
        "}";
    }
}

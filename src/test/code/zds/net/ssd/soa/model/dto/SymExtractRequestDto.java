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
@ApiModel(value="SymExtractRequest对象", description="")
public class SymExtractRequestDto implements Serializable{

    private static final long serialVersionUID=1L;

    private Long requestId;

    private String nodeId;

    private String queue;

    private String status;

    private Long startBatchId;

    private Long endBatchId;

    private String triggerId;

    private String routerId;

    private Long loadId;

    private String tableName;

    private Long extractedRows;

    private Long extractedMillis;

    private Long transferredRows;

    private Long transferredMillis;

    private Long lastTransferredBatchId;

    private Long loadedRows;

    private Long loadedMillis;

    private Long lastLoadedBatchId;

    private Long totalRows;

    private LocalDateTime loadedTime;

    private Long parentRequestId;

    private LocalDateTime lastUpdateTime;

    private LocalDateTime createTime;


    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getStartBatchId() {
        return startBatchId;
    }

    public void setStartBatchId(Long startBatchId) {
        this.startBatchId = startBatchId;
    }

    public Long getEndBatchId() {
        return endBatchId;
    }

    public void setEndBatchId(Long endBatchId) {
        this.endBatchId = endBatchId;
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

    public Long getLoadId() {
        return loadId;
    }

    public void setLoadId(Long loadId) {
        this.loadId = loadId;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Long getExtractedRows() {
        return extractedRows;
    }

    public void setExtractedRows(Long extractedRows) {
        this.extractedRows = extractedRows;
    }

    public Long getExtractedMillis() {
        return extractedMillis;
    }

    public void setExtractedMillis(Long extractedMillis) {
        this.extractedMillis = extractedMillis;
    }

    public Long getTransferredRows() {
        return transferredRows;
    }

    public void setTransferredRows(Long transferredRows) {
        this.transferredRows = transferredRows;
    }

    public Long getTransferredMillis() {
        return transferredMillis;
    }

    public void setTransferredMillis(Long transferredMillis) {
        this.transferredMillis = transferredMillis;
    }

    public Long getLastTransferredBatchId() {
        return lastTransferredBatchId;
    }

    public void setLastTransferredBatchId(Long lastTransferredBatchId) {
        this.lastTransferredBatchId = lastTransferredBatchId;
    }

    public Long getLoadedRows() {
        return loadedRows;
    }

    public void setLoadedRows(Long loadedRows) {
        this.loadedRows = loadedRows;
    }

    public Long getLoadedMillis() {
        return loadedMillis;
    }

    public void setLoadedMillis(Long loadedMillis) {
        this.loadedMillis = loadedMillis;
    }

    public Long getLastLoadedBatchId() {
        return lastLoadedBatchId;
    }

    public void setLastLoadedBatchId(Long lastLoadedBatchId) {
        this.lastLoadedBatchId = lastLoadedBatchId;
    }

    public Long getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(Long totalRows) {
        this.totalRows = totalRows;
    }

    public LocalDateTime getLoadedTime() {
        return loadedTime;
    }

    public void setLoadedTime(LocalDateTime loadedTime) {
        this.loadedTime = loadedTime;
    }

    public Long getParentRequestId() {
        return parentRequestId;
    }

    public void setParentRequestId(Long parentRequestId) {
        this.parentRequestId = parentRequestId;
    }

    public LocalDateTime getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(LocalDateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SymExtractRequest{" +
        "requestId=" + requestId +
        ", nodeId=" + nodeId +
        ", queue=" + queue +
        ", status=" + status +
        ", startBatchId=" + startBatchId +
        ", endBatchId=" + endBatchId +
        ", triggerId=" + triggerId +
        ", routerId=" + routerId +
        ", loadId=" + loadId +
        ", tableName=" + tableName +
        ", extractedRows=" + extractedRows +
        ", extractedMillis=" + extractedMillis +
        ", transferredRows=" + transferredRows +
        ", transferredMillis=" + transferredMillis +
        ", lastTransferredBatchId=" + lastTransferredBatchId +
        ", loadedRows=" + loadedRows +
        ", loadedMillis=" + loadedMillis +
        ", lastLoadedBatchId=" + lastLoadedBatchId +
        ", totalRows=" + totalRows +
        ", loadedTime=" + loadedTime +
        ", parentRequestId=" + parentRequestId +
        ", lastUpdateTime=" + lastUpdateTime +
        ", createTime=" + createTime +
        "}";
    }
}

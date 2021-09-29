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
@ApiModel(value="SymOutgoingBatch对象", description="")
public class SymOutgoingBatchDto implements Serializable{

    private static final long serialVersionUID=1L;

    private Long batchId;

    private String nodeId;

    private String channelId;

    private String status;

    private Integer errorFlag;

    private String sqlState;

    private Integer sqlCode;

    private String sqlMessage;

    private String lastUpdateHostname;

    private LocalDateTime lastUpdateTime;

    private LocalDateTime createTime;

    private String summary;

    private Integer ignoreCount;

    private Long byteCount;

    private Integer loadFlag;

    private Integer extractCount;

    private Integer sentCount;

    private Integer loadCount;

    private Integer reloadRowCount;

    private Integer otherRowCount;

    private Integer dataRowCount;

    private Integer extractRowCount;

    private Integer loadRowCount;

    private Integer dataInsertRowCount;

    private Integer dataUpdateRowCount;

    private Integer dataDeleteRowCount;

    private Integer extractInsertRowCount;

    private Integer extractUpdateRowCount;

    private Integer extractDeleteRowCount;

    private Integer loadInsertRowCount;

    private Integer loadUpdateRowCount;

    private Integer loadDeleteRowCount;

    private Integer networkMillis;

    private Integer filterMillis;

    private Integer loadMillis;

    private Integer routerMillis;

    private Integer extractMillis;

    private Integer transformExtractMillis;

    private Integer transformLoadMillis;

    private Long loadId;

    private Integer commonFlag;

    private Integer fallbackInsertCount;

    private Integer fallbackUpdateCount;

    private Integer ignoreRowCount;

    private Integer missingDeleteCount;

    private Integer skipCount;

    private Integer totalExtractMillis;

    private Integer totalLoadMillis;

    private Integer extractJobFlag;

    private LocalDateTime extractStartTime;

    private LocalDateTime transferStartTime;

    private LocalDateTime loadStartTime;

    private Long failedDataId;

    private Long failedLineNumber;

    private String createBy;


    public Long getBatchId() {
        return batchId;
    }

    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getLastUpdateHostname() {
        return lastUpdateHostname;
    }

    public void setLastUpdateHostname(String lastUpdateHostname) {
        this.lastUpdateHostname = lastUpdateHostname;
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

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getIgnoreCount() {
        return ignoreCount;
    }

    public void setIgnoreCount(Integer ignoreCount) {
        this.ignoreCount = ignoreCount;
    }

    public Long getByteCount() {
        return byteCount;
    }

    public void setByteCount(Long byteCount) {
        this.byteCount = byteCount;
    }

    public Integer getLoadFlag() {
        return loadFlag;
    }

    public void setLoadFlag(Integer loadFlag) {
        this.loadFlag = loadFlag;
    }

    public Integer getExtractCount() {
        return extractCount;
    }

    public void setExtractCount(Integer extractCount) {
        this.extractCount = extractCount;
    }

    public Integer getSentCount() {
        return sentCount;
    }

    public void setSentCount(Integer sentCount) {
        this.sentCount = sentCount;
    }

    public Integer getLoadCount() {
        return loadCount;
    }

    public void setLoadCount(Integer loadCount) {
        this.loadCount = loadCount;
    }

    public Integer getReloadRowCount() {
        return reloadRowCount;
    }

    public void setReloadRowCount(Integer reloadRowCount) {
        this.reloadRowCount = reloadRowCount;
    }

    public Integer getOtherRowCount() {
        return otherRowCount;
    }

    public void setOtherRowCount(Integer otherRowCount) {
        this.otherRowCount = otherRowCount;
    }

    public Integer getDataRowCount() {
        return dataRowCount;
    }

    public void setDataRowCount(Integer dataRowCount) {
        this.dataRowCount = dataRowCount;
    }

    public Integer getExtractRowCount() {
        return extractRowCount;
    }

    public void setExtractRowCount(Integer extractRowCount) {
        this.extractRowCount = extractRowCount;
    }

    public Integer getLoadRowCount() {
        return loadRowCount;
    }

    public void setLoadRowCount(Integer loadRowCount) {
        this.loadRowCount = loadRowCount;
    }

    public Integer getDataInsertRowCount() {
        return dataInsertRowCount;
    }

    public void setDataInsertRowCount(Integer dataInsertRowCount) {
        this.dataInsertRowCount = dataInsertRowCount;
    }

    public Integer getDataUpdateRowCount() {
        return dataUpdateRowCount;
    }

    public void setDataUpdateRowCount(Integer dataUpdateRowCount) {
        this.dataUpdateRowCount = dataUpdateRowCount;
    }

    public Integer getDataDeleteRowCount() {
        return dataDeleteRowCount;
    }

    public void setDataDeleteRowCount(Integer dataDeleteRowCount) {
        this.dataDeleteRowCount = dataDeleteRowCount;
    }

    public Integer getExtractInsertRowCount() {
        return extractInsertRowCount;
    }

    public void setExtractInsertRowCount(Integer extractInsertRowCount) {
        this.extractInsertRowCount = extractInsertRowCount;
    }

    public Integer getExtractUpdateRowCount() {
        return extractUpdateRowCount;
    }

    public void setExtractUpdateRowCount(Integer extractUpdateRowCount) {
        this.extractUpdateRowCount = extractUpdateRowCount;
    }

    public Integer getExtractDeleteRowCount() {
        return extractDeleteRowCount;
    }

    public void setExtractDeleteRowCount(Integer extractDeleteRowCount) {
        this.extractDeleteRowCount = extractDeleteRowCount;
    }

    public Integer getLoadInsertRowCount() {
        return loadInsertRowCount;
    }

    public void setLoadInsertRowCount(Integer loadInsertRowCount) {
        this.loadInsertRowCount = loadInsertRowCount;
    }

    public Integer getLoadUpdateRowCount() {
        return loadUpdateRowCount;
    }

    public void setLoadUpdateRowCount(Integer loadUpdateRowCount) {
        this.loadUpdateRowCount = loadUpdateRowCount;
    }

    public Integer getLoadDeleteRowCount() {
        return loadDeleteRowCount;
    }

    public void setLoadDeleteRowCount(Integer loadDeleteRowCount) {
        this.loadDeleteRowCount = loadDeleteRowCount;
    }

    public Integer getNetworkMillis() {
        return networkMillis;
    }

    public void setNetworkMillis(Integer networkMillis) {
        this.networkMillis = networkMillis;
    }

    public Integer getFilterMillis() {
        return filterMillis;
    }

    public void setFilterMillis(Integer filterMillis) {
        this.filterMillis = filterMillis;
    }

    public Integer getLoadMillis() {
        return loadMillis;
    }

    public void setLoadMillis(Integer loadMillis) {
        this.loadMillis = loadMillis;
    }

    public Integer getRouterMillis() {
        return routerMillis;
    }

    public void setRouterMillis(Integer routerMillis) {
        this.routerMillis = routerMillis;
    }

    public Integer getExtractMillis() {
        return extractMillis;
    }

    public void setExtractMillis(Integer extractMillis) {
        this.extractMillis = extractMillis;
    }

    public Integer getTransformExtractMillis() {
        return transformExtractMillis;
    }

    public void setTransformExtractMillis(Integer transformExtractMillis) {
        this.transformExtractMillis = transformExtractMillis;
    }

    public Integer getTransformLoadMillis() {
        return transformLoadMillis;
    }

    public void setTransformLoadMillis(Integer transformLoadMillis) {
        this.transformLoadMillis = transformLoadMillis;
    }

    public Long getLoadId() {
        return loadId;
    }

    public void setLoadId(Long loadId) {
        this.loadId = loadId;
    }

    public Integer getCommonFlag() {
        return commonFlag;
    }

    public void setCommonFlag(Integer commonFlag) {
        this.commonFlag = commonFlag;
    }

    public Integer getFallbackInsertCount() {
        return fallbackInsertCount;
    }

    public void setFallbackInsertCount(Integer fallbackInsertCount) {
        this.fallbackInsertCount = fallbackInsertCount;
    }

    public Integer getFallbackUpdateCount() {
        return fallbackUpdateCount;
    }

    public void setFallbackUpdateCount(Integer fallbackUpdateCount) {
        this.fallbackUpdateCount = fallbackUpdateCount;
    }

    public Integer getIgnoreRowCount() {
        return ignoreRowCount;
    }

    public void setIgnoreRowCount(Integer ignoreRowCount) {
        this.ignoreRowCount = ignoreRowCount;
    }

    public Integer getMissingDeleteCount() {
        return missingDeleteCount;
    }

    public void setMissingDeleteCount(Integer missingDeleteCount) {
        this.missingDeleteCount = missingDeleteCount;
    }

    public Integer getSkipCount() {
        return skipCount;
    }

    public void setSkipCount(Integer skipCount) {
        this.skipCount = skipCount;
    }

    public Integer getTotalExtractMillis() {
        return totalExtractMillis;
    }

    public void setTotalExtractMillis(Integer totalExtractMillis) {
        this.totalExtractMillis = totalExtractMillis;
    }

    public Integer getTotalLoadMillis() {
        return totalLoadMillis;
    }

    public void setTotalLoadMillis(Integer totalLoadMillis) {
        this.totalLoadMillis = totalLoadMillis;
    }

    public Integer getExtractJobFlag() {
        return extractJobFlag;
    }

    public void setExtractJobFlag(Integer extractJobFlag) {
        this.extractJobFlag = extractJobFlag;
    }

    public LocalDateTime getExtractStartTime() {
        return extractStartTime;
    }

    public void setExtractStartTime(LocalDateTime extractStartTime) {
        this.extractStartTime = extractStartTime;
    }

    public LocalDateTime getTransferStartTime() {
        return transferStartTime;
    }

    public void setTransferStartTime(LocalDateTime transferStartTime) {
        this.transferStartTime = transferStartTime;
    }

    public LocalDateTime getLoadStartTime() {
        return loadStartTime;
    }

    public void setLoadStartTime(LocalDateTime loadStartTime) {
        this.loadStartTime = loadStartTime;
    }

    public Long getFailedDataId() {
        return failedDataId;
    }

    public void setFailedDataId(Long failedDataId) {
        this.failedDataId = failedDataId;
    }

    public Long getFailedLineNumber() {
        return failedLineNumber;
    }

    public void setFailedLineNumber(Long failedLineNumber) {
        this.failedLineNumber = failedLineNumber;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Override
    public String toString() {
        return "SymOutgoingBatch{" +
        "batchId=" + batchId +
        ", nodeId=" + nodeId +
        ", channelId=" + channelId +
        ", status=" + status +
        ", errorFlag=" + errorFlag +
        ", sqlState=" + sqlState +
        ", sqlCode=" + sqlCode +
        ", sqlMessage=" + sqlMessage +
        ", lastUpdateHostname=" + lastUpdateHostname +
        ", lastUpdateTime=" + lastUpdateTime +
        ", createTime=" + createTime +
        ", summary=" + summary +
        ", ignoreCount=" + ignoreCount +
        ", byteCount=" + byteCount +
        ", loadFlag=" + loadFlag +
        ", extractCount=" + extractCount +
        ", sentCount=" + sentCount +
        ", loadCount=" + loadCount +
        ", reloadRowCount=" + reloadRowCount +
        ", otherRowCount=" + otherRowCount +
        ", dataRowCount=" + dataRowCount +
        ", extractRowCount=" + extractRowCount +
        ", loadRowCount=" + loadRowCount +
        ", dataInsertRowCount=" + dataInsertRowCount +
        ", dataUpdateRowCount=" + dataUpdateRowCount +
        ", dataDeleteRowCount=" + dataDeleteRowCount +
        ", extractInsertRowCount=" + extractInsertRowCount +
        ", extractUpdateRowCount=" + extractUpdateRowCount +
        ", extractDeleteRowCount=" + extractDeleteRowCount +
        ", loadInsertRowCount=" + loadInsertRowCount +
        ", loadUpdateRowCount=" + loadUpdateRowCount +
        ", loadDeleteRowCount=" + loadDeleteRowCount +
        ", networkMillis=" + networkMillis +
        ", filterMillis=" + filterMillis +
        ", loadMillis=" + loadMillis +
        ", routerMillis=" + routerMillis +
        ", extractMillis=" + extractMillis +
        ", transformExtractMillis=" + transformExtractMillis +
        ", transformLoadMillis=" + transformLoadMillis +
        ", loadId=" + loadId +
        ", commonFlag=" + commonFlag +
        ", fallbackInsertCount=" + fallbackInsertCount +
        ", fallbackUpdateCount=" + fallbackUpdateCount +
        ", ignoreRowCount=" + ignoreRowCount +
        ", missingDeleteCount=" + missingDeleteCount +
        ", skipCount=" + skipCount +
        ", totalExtractMillis=" + totalExtractMillis +
        ", totalLoadMillis=" + totalLoadMillis +
        ", extractJobFlag=" + extractJobFlag +
        ", extractStartTime=" + extractStartTime +
        ", transferStartTime=" + transferStartTime +
        ", loadStartTime=" + loadStartTime +
        ", failedDataId=" + failedDataId +
        ", failedLineNumber=" + failedLineNumber +
        ", createBy=" + createBy +
        "}";
    }
}

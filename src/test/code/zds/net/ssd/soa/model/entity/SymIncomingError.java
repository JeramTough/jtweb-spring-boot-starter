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
@ApiModel(value="SymIncomingError对象", description="")
public class SymIncomingError implements Serializable {

    private static final long serialVersionUID=1L;

    private Long batchId;

    private String nodeId;

    private Long failedRowNumber;

    private Long failedLineNumber;

    private String targetCatalogName;

    private String targetSchemaName;

    private String targetTableName;

    private String eventType;

    private String binaryEncoding;

    private String columnNames;

    private String pkColumnNames;

    private String rowData;

    private String oldData;

    private String curData;

    private String resolveData;

    private Integer resolveIgnore;

    private String conflictId;

    private LocalDateTime createTime;

    private String lastUpdateBy;

    private LocalDateTime lastUpdateTime;


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

    public Long getFailedRowNumber() {
        return failedRowNumber;
    }

    public void setFailedRowNumber(Long failedRowNumber) {
        this.failedRowNumber = failedRowNumber;
    }

    public Long getFailedLineNumber() {
        return failedLineNumber;
    }

    public void setFailedLineNumber(Long failedLineNumber) {
        this.failedLineNumber = failedLineNumber;
    }

    public String getTargetCatalogName() {
        return targetCatalogName;
    }

    public void setTargetCatalogName(String targetCatalogName) {
        this.targetCatalogName = targetCatalogName;
    }

    public String getTargetSchemaName() {
        return targetSchemaName;
    }

    public void setTargetSchemaName(String targetSchemaName) {
        this.targetSchemaName = targetSchemaName;
    }

    public String getTargetTableName() {
        return targetTableName;
    }

    public void setTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getBinaryEncoding() {
        return binaryEncoding;
    }

    public void setBinaryEncoding(String binaryEncoding) {
        this.binaryEncoding = binaryEncoding;
    }

    public String getColumnNames() {
        return columnNames;
    }

    public void setColumnNames(String columnNames) {
        this.columnNames = columnNames;
    }

    public String getPkColumnNames() {
        return pkColumnNames;
    }

    public void setPkColumnNames(String pkColumnNames) {
        this.pkColumnNames = pkColumnNames;
    }

    public String getRowData() {
        return rowData;
    }

    public void setRowData(String rowData) {
        this.rowData = rowData;
    }

    public String getOldData() {
        return oldData;
    }

    public void setOldData(String oldData) {
        this.oldData = oldData;
    }

    public String getCurData() {
        return curData;
    }

    public void setCurData(String curData) {
        this.curData = curData;
    }

    public String getResolveData() {
        return resolveData;
    }

    public void setResolveData(String resolveData) {
        this.resolveData = resolveData;
    }

    public Integer getResolveIgnore() {
        return resolveIgnore;
    }

    public void setResolveIgnore(Integer resolveIgnore) {
        this.resolveIgnore = resolveIgnore;
    }

    public String getConflictId() {
        return conflictId;
    }

    public void setConflictId(String conflictId) {
        this.conflictId = conflictId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
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
        return "SymIncomingError{" +
        "batchId=" + batchId +
        ", nodeId=" + nodeId +
        ", failedRowNumber=" + failedRowNumber +
        ", failedLineNumber=" + failedLineNumber +
        ", targetCatalogName=" + targetCatalogName +
        ", targetSchemaName=" + targetSchemaName +
        ", targetTableName=" + targetTableName +
        ", eventType=" + eventType +
        ", binaryEncoding=" + binaryEncoding +
        ", columnNames=" + columnNames +
        ", pkColumnNames=" + pkColumnNames +
        ", rowData=" + rowData +
        ", oldData=" + oldData +
        ", curData=" + curData +
        ", resolveData=" + resolveData +
        ", resolveIgnore=" + resolveIgnore +
        ", conflictId=" + conflictId +
        ", createTime=" + createTime +
        ", lastUpdateBy=" + lastUpdateBy +
        ", lastUpdateTime=" + lastUpdateTime +
        "}";
    }
}

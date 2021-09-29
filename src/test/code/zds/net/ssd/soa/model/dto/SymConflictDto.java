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
@ApiModel(value="SymConflict对象", description="")
public class SymConflictDto implements Serializable{

    private static final long serialVersionUID=1L;

    private String conflictId;

    private String sourceNodeGroupId;

    private String targetNodeGroupId;

    private String targetChannelId;

    private String targetCatalogName;

    private String targetSchemaName;

    private String targetTableName;

    private String detectType;

    private String detectExpression;

    private String resolveType;

    private String pingBack;

    private Integer resolveChangesOnly;

    private Integer resolveRowOnly;

    private LocalDateTime createTime;

    private String lastUpdateBy;

    private LocalDateTime lastUpdateTime;


    public String getConflictId() {
        return conflictId;
    }

    public void setConflictId(String conflictId) {
        this.conflictId = conflictId;
    }

    public String getSourceNodeGroupId() {
        return sourceNodeGroupId;
    }

    public void setSourceNodeGroupId(String sourceNodeGroupId) {
        this.sourceNodeGroupId = sourceNodeGroupId;
    }

    public String getTargetNodeGroupId() {
        return targetNodeGroupId;
    }

    public void setTargetNodeGroupId(String targetNodeGroupId) {
        this.targetNodeGroupId = targetNodeGroupId;
    }

    public String getTargetChannelId() {
        return targetChannelId;
    }

    public void setTargetChannelId(String targetChannelId) {
        this.targetChannelId = targetChannelId;
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

    public String getDetectType() {
        return detectType;
    }

    public void setDetectType(String detectType) {
        this.detectType = detectType;
    }

    public String getDetectExpression() {
        return detectExpression;
    }

    public void setDetectExpression(String detectExpression) {
        this.detectExpression = detectExpression;
    }

    public String getResolveType() {
        return resolveType;
    }

    public void setResolveType(String resolveType) {
        this.resolveType = resolveType;
    }

    public String getPingBack() {
        return pingBack;
    }

    public void setPingBack(String pingBack) {
        this.pingBack = pingBack;
    }

    public Integer getResolveChangesOnly() {
        return resolveChangesOnly;
    }

    public void setResolveChangesOnly(Integer resolveChangesOnly) {
        this.resolveChangesOnly = resolveChangesOnly;
    }

    public Integer getResolveRowOnly() {
        return resolveRowOnly;
    }

    public void setResolveRowOnly(Integer resolveRowOnly) {
        this.resolveRowOnly = resolveRowOnly;
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
        return "SymConflict{" +
        "conflictId=" + conflictId +
        ", sourceNodeGroupId=" + sourceNodeGroupId +
        ", targetNodeGroupId=" + targetNodeGroupId +
        ", targetChannelId=" + targetChannelId +
        ", targetCatalogName=" + targetCatalogName +
        ", targetSchemaName=" + targetSchemaName +
        ", targetTableName=" + targetTableName +
        ", detectType=" + detectType +
        ", detectExpression=" + detectExpression +
        ", resolveType=" + resolveType +
        ", pingBack=" + pingBack +
        ", resolveChangesOnly=" + resolveChangesOnly +
        ", resolveRowOnly=" + resolveRowOnly +
        ", createTime=" + createTime +
        ", lastUpdateBy=" + lastUpdateBy +
        ", lastUpdateTime=" + lastUpdateTime +
        "}";
    }
}

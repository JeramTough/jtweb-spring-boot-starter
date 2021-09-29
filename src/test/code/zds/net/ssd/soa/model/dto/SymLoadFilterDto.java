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
@ApiModel(value="SymLoadFilter对象", description="")
public class SymLoadFilterDto implements Serializable{

    private static final long serialVersionUID=1L;

    private String loadFilterId;

    private String loadFilterType;

    private String sourceNodeGroupId;

    private String targetNodeGroupId;

    private String targetCatalogName;

    private String targetSchemaName;

    private String targetTableName;

    private Integer filterOnUpdate;

    private Integer filterOnInsert;

    private Integer filterOnDelete;

    private String beforeWriteScript;

    private String afterWriteScript;

    private String batchCompleteScript;

    private String batchCommitScript;

    private String batchRollbackScript;

    private String handleErrorScript;

    private LocalDateTime createTime;

    private String lastUpdateBy;

    private LocalDateTime lastUpdateTime;

    private Integer loadFilterOrder;

    private Integer failOnError;


    public String getLoadFilterId() {
        return loadFilterId;
    }

    public void setLoadFilterId(String loadFilterId) {
        this.loadFilterId = loadFilterId;
    }

    public String getLoadFilterType() {
        return loadFilterType;
    }

    public void setLoadFilterType(String loadFilterType) {
        this.loadFilterType = loadFilterType;
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

    public Integer getFilterOnUpdate() {
        return filterOnUpdate;
    }

    public void setFilterOnUpdate(Integer filterOnUpdate) {
        this.filterOnUpdate = filterOnUpdate;
    }

    public Integer getFilterOnInsert() {
        return filterOnInsert;
    }

    public void setFilterOnInsert(Integer filterOnInsert) {
        this.filterOnInsert = filterOnInsert;
    }

    public Integer getFilterOnDelete() {
        return filterOnDelete;
    }

    public void setFilterOnDelete(Integer filterOnDelete) {
        this.filterOnDelete = filterOnDelete;
    }

    public String getBeforeWriteScript() {
        return beforeWriteScript;
    }

    public void setBeforeWriteScript(String beforeWriteScript) {
        this.beforeWriteScript = beforeWriteScript;
    }

    public String getAfterWriteScript() {
        return afterWriteScript;
    }

    public void setAfterWriteScript(String afterWriteScript) {
        this.afterWriteScript = afterWriteScript;
    }

    public String getBatchCompleteScript() {
        return batchCompleteScript;
    }

    public void setBatchCompleteScript(String batchCompleteScript) {
        this.batchCompleteScript = batchCompleteScript;
    }

    public String getBatchCommitScript() {
        return batchCommitScript;
    }

    public void setBatchCommitScript(String batchCommitScript) {
        this.batchCommitScript = batchCommitScript;
    }

    public String getBatchRollbackScript() {
        return batchRollbackScript;
    }

    public void setBatchRollbackScript(String batchRollbackScript) {
        this.batchRollbackScript = batchRollbackScript;
    }

    public String getHandleErrorScript() {
        return handleErrorScript;
    }

    public void setHandleErrorScript(String handleErrorScript) {
        this.handleErrorScript = handleErrorScript;
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

    public Integer getLoadFilterOrder() {
        return loadFilterOrder;
    }

    public void setLoadFilterOrder(Integer loadFilterOrder) {
        this.loadFilterOrder = loadFilterOrder;
    }

    public Integer getFailOnError() {
        return failOnError;
    }

    public void setFailOnError(Integer failOnError) {
        this.failOnError = failOnError;
    }

    @Override
    public String toString() {
        return "SymLoadFilter{" +
        "loadFilterId=" + loadFilterId +
        ", loadFilterType=" + loadFilterType +
        ", sourceNodeGroupId=" + sourceNodeGroupId +
        ", targetNodeGroupId=" + targetNodeGroupId +
        ", targetCatalogName=" + targetCatalogName +
        ", targetSchemaName=" + targetSchemaName +
        ", targetTableName=" + targetTableName +
        ", filterOnUpdate=" + filterOnUpdate +
        ", filterOnInsert=" + filterOnInsert +
        ", filterOnDelete=" + filterOnDelete +
        ", beforeWriteScript=" + beforeWriteScript +
        ", afterWriteScript=" + afterWriteScript +
        ", batchCompleteScript=" + batchCompleteScript +
        ", batchCommitScript=" + batchCommitScript +
        ", batchRollbackScript=" + batchRollbackScript +
        ", handleErrorScript=" + handleErrorScript +
        ", createTime=" + createTime +
        ", lastUpdateBy=" + lastUpdateBy +
        ", lastUpdateTime=" + lastUpdateTime +
        ", loadFilterOrder=" + loadFilterOrder +
        ", failOnError=" + failOnError +
        "}";
    }
}

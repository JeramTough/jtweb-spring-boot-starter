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
@ApiModel(value="SymTransformTable对象", description="")
public class SymTransformTable implements Serializable {

    private static final long serialVersionUID=1L;

    private String transformId;

    private String sourceNodeGroupId;

    private String targetNodeGroupId;

    private String transformPoint;

    private String sourceCatalogName;

    private String sourceSchemaName;

    private String sourceTableName;

    private String targetCatalogName;

    private String targetSchemaName;

    private String targetTableName;

    private Integer updateFirst;

    private String updateAction;

    private String deleteAction;

    private Integer transformOrder;

    private String columnPolicy;

    private LocalDateTime createTime;

    private String lastUpdateBy;

    private LocalDateTime lastUpdateTime;

    private String description;


    public String getTransformId() {
        return transformId;
    }

    public void setTransformId(String transformId) {
        this.transformId = transformId;
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

    public String getTransformPoint() {
        return transformPoint;
    }

    public void setTransformPoint(String transformPoint) {
        this.transformPoint = transformPoint;
    }

    public String getSourceCatalogName() {
        return sourceCatalogName;
    }

    public void setSourceCatalogName(String sourceCatalogName) {
        this.sourceCatalogName = sourceCatalogName;
    }

    public String getSourceSchemaName() {
        return sourceSchemaName;
    }

    public void setSourceSchemaName(String sourceSchemaName) {
        this.sourceSchemaName = sourceSchemaName;
    }

    public String getSourceTableName() {
        return sourceTableName;
    }

    public void setSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
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

    public Integer getUpdateFirst() {
        return updateFirst;
    }

    public void setUpdateFirst(Integer updateFirst) {
        this.updateFirst = updateFirst;
    }

    public String getUpdateAction() {
        return updateAction;
    }

    public void setUpdateAction(String updateAction) {
        this.updateAction = updateAction;
    }

    public String getDeleteAction() {
        return deleteAction;
    }

    public void setDeleteAction(String deleteAction) {
        this.deleteAction = deleteAction;
    }

    public Integer getTransformOrder() {
        return transformOrder;
    }

    public void setTransformOrder(Integer transformOrder) {
        this.transformOrder = transformOrder;
    }

    public String getColumnPolicy() {
        return columnPolicy;
    }

    public void setColumnPolicy(String columnPolicy) {
        this.columnPolicy = columnPolicy;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "SymTransformTable{" +
        "transformId=" + transformId +
        ", sourceNodeGroupId=" + sourceNodeGroupId +
        ", targetNodeGroupId=" + targetNodeGroupId +
        ", transformPoint=" + transformPoint +
        ", sourceCatalogName=" + sourceCatalogName +
        ", sourceSchemaName=" + sourceSchemaName +
        ", sourceTableName=" + sourceTableName +
        ", targetCatalogName=" + targetCatalogName +
        ", targetSchemaName=" + targetSchemaName +
        ", targetTableName=" + targetTableName +
        ", updateFirst=" + updateFirst +
        ", updateAction=" + updateAction +
        ", deleteAction=" + deleteAction +
        ", transformOrder=" + transformOrder +
        ", columnPolicy=" + columnPolicy +
        ", createTime=" + createTime +
        ", lastUpdateBy=" + lastUpdateBy +
        ", lastUpdateTime=" + lastUpdateTime +
        ", description=" + description +
        "}";
    }
}

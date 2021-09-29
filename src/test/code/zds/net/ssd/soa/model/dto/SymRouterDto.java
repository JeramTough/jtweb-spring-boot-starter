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
@ApiModel(value="SymRouter对象", description="")
public class SymRouterDto implements Serializable{

    private static final long serialVersionUID=1L;

    private String routerId;

    private String targetCatalogName;

    private String targetSchemaName;

    private String targetTableName;

    private String sourceNodeGroupId;

    private String targetNodeGroupId;

    private String routerType;

    private String routerExpression;

    private Integer syncOnUpdate;

    private Integer syncOnInsert;

    private Integer syncOnDelete;

    private Integer useSourceCatalogSchema;

    private LocalDateTime createTime;

    private String lastUpdateBy;

    private LocalDateTime lastUpdateTime;

    private String description;


    public String getRouterId() {
        return routerId;
    }

    public void setRouterId(String routerId) {
        this.routerId = routerId;
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

    public String getRouterType() {
        return routerType;
    }

    public void setRouterType(String routerType) {
        this.routerType = routerType;
    }

    public String getRouterExpression() {
        return routerExpression;
    }

    public void setRouterExpression(String routerExpression) {
        this.routerExpression = routerExpression;
    }

    public Integer getSyncOnUpdate() {
        return syncOnUpdate;
    }

    public void setSyncOnUpdate(Integer syncOnUpdate) {
        this.syncOnUpdate = syncOnUpdate;
    }

    public Integer getSyncOnInsert() {
        return syncOnInsert;
    }

    public void setSyncOnInsert(Integer syncOnInsert) {
        this.syncOnInsert = syncOnInsert;
    }

    public Integer getSyncOnDelete() {
        return syncOnDelete;
    }

    public void setSyncOnDelete(Integer syncOnDelete) {
        this.syncOnDelete = syncOnDelete;
    }

    public Integer getUseSourceCatalogSchema() {
        return useSourceCatalogSchema;
    }

    public void setUseSourceCatalogSchema(Integer useSourceCatalogSchema) {
        this.useSourceCatalogSchema = useSourceCatalogSchema;
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
        return "SymRouter{" +
        "routerId=" + routerId +
        ", targetCatalogName=" + targetCatalogName +
        ", targetSchemaName=" + targetSchemaName +
        ", targetTableName=" + targetTableName +
        ", sourceNodeGroupId=" + sourceNodeGroupId +
        ", targetNodeGroupId=" + targetNodeGroupId +
        ", routerType=" + routerType +
        ", routerExpression=" + routerExpression +
        ", syncOnUpdate=" + syncOnUpdate +
        ", syncOnInsert=" + syncOnInsert +
        ", syncOnDelete=" + syncOnDelete +
        ", useSourceCatalogSchema=" + useSourceCatalogSchema +
        ", createTime=" + createTime +
        ", lastUpdateBy=" + lastUpdateBy +
        ", lastUpdateTime=" + lastUpdateTime +
        ", description=" + description +
        "}";
    }
}

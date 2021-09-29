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
@ApiModel(value="SymTriggerHist对象", description="")
public class SymTriggerHist implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer triggerHistId;

    private String triggerId;

    private String sourceTableName;

    private String sourceCatalogName;

    private String sourceSchemaName;

    private String nameForUpdateTrigger;

    private String nameForInsertTrigger;

    private String nameForDeleteTrigger;

    private Long tableHash;

    private Long triggerRowHash;

    private Long triggerTemplateHash;

    private String columnNames;

    private String pkColumnNames;

    private String lastTriggerBuildReason;

    private String errorMessage;

    private LocalDateTime createTime;

    private LocalDateTime inactiveTime;


    public Integer getTriggerHistId() {
        return triggerHistId;
    }

    public void setTriggerHistId(Integer triggerHistId) {
        this.triggerHistId = triggerHistId;
    }

    public String getTriggerId() {
        return triggerId;
    }

    public void setTriggerId(String triggerId) {
        this.triggerId = triggerId;
    }

    public String getSourceTableName() {
        return sourceTableName;
    }

    public void setSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
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

    public String getNameForUpdateTrigger() {
        return nameForUpdateTrigger;
    }

    public void setNameForUpdateTrigger(String nameForUpdateTrigger) {
        this.nameForUpdateTrigger = nameForUpdateTrigger;
    }

    public String getNameForInsertTrigger() {
        return nameForInsertTrigger;
    }

    public void setNameForInsertTrigger(String nameForInsertTrigger) {
        this.nameForInsertTrigger = nameForInsertTrigger;
    }

    public String getNameForDeleteTrigger() {
        return nameForDeleteTrigger;
    }

    public void setNameForDeleteTrigger(String nameForDeleteTrigger) {
        this.nameForDeleteTrigger = nameForDeleteTrigger;
    }

    public Long getTableHash() {
        return tableHash;
    }

    public void setTableHash(Long tableHash) {
        this.tableHash = tableHash;
    }

    public Long getTriggerRowHash() {
        return triggerRowHash;
    }

    public void setTriggerRowHash(Long triggerRowHash) {
        this.triggerRowHash = triggerRowHash;
    }

    public Long getTriggerTemplateHash() {
        return triggerTemplateHash;
    }

    public void setTriggerTemplateHash(Long triggerTemplateHash) {
        this.triggerTemplateHash = triggerTemplateHash;
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

    public String getLastTriggerBuildReason() {
        return lastTriggerBuildReason;
    }

    public void setLastTriggerBuildReason(String lastTriggerBuildReason) {
        this.lastTriggerBuildReason = lastTriggerBuildReason;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getInactiveTime() {
        return inactiveTime;
    }

    public void setInactiveTime(LocalDateTime inactiveTime) {
        this.inactiveTime = inactiveTime;
    }

    @Override
    public String toString() {
        return "SymTriggerHist{" +
        "triggerHistId=" + triggerHistId +
        ", triggerId=" + triggerId +
        ", sourceTableName=" + sourceTableName +
        ", sourceCatalogName=" + sourceCatalogName +
        ", sourceSchemaName=" + sourceSchemaName +
        ", nameForUpdateTrigger=" + nameForUpdateTrigger +
        ", nameForInsertTrigger=" + nameForInsertTrigger +
        ", nameForDeleteTrigger=" + nameForDeleteTrigger +
        ", tableHash=" + tableHash +
        ", triggerRowHash=" + triggerRowHash +
        ", triggerTemplateHash=" + triggerTemplateHash +
        ", columnNames=" + columnNames +
        ", pkColumnNames=" + pkColumnNames +
        ", lastTriggerBuildReason=" + lastTriggerBuildReason +
        ", errorMessage=" + errorMessage +
        ", createTime=" + createTime +
        ", inactiveTime=" + inactiveTime +
        "}";
    }
}

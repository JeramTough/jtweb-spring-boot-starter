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
@ApiModel(value="SymTrigger对象", description="")
public class SymTrigger implements Serializable {

    private static final long serialVersionUID=1L;

    private String triggerId;

    private String sourceCatalogName;

    private String sourceSchemaName;

    private String sourceTableName;

    private String channelId;

    private String reloadChannelId;

    private Integer syncOnUpdate;

    private Integer syncOnInsert;

    private Integer syncOnDelete;

    private Integer syncOnIncomingBatch;

    private String nameForUpdateTrigger;

    private String nameForInsertTrigger;

    private String nameForDeleteTrigger;

    private String syncOnUpdateCondition;

    private String syncOnInsertCondition;

    private String syncOnDeleteCondition;

    private String customBeforeUpdateText;

    private String customBeforeInsertText;

    private String customBeforeDeleteText;

    private String customOnUpdateText;

    private String customOnInsertText;

    private String customOnDeleteText;

    private String externalSelect;

    private String txIdExpression;

    private String channelExpression;

    private String excludedColumnNames;

    private String includedColumnNames;

    private String syncKeyNames;

    private Integer useStreamLobs;

    private Integer useCaptureLobs;

    private Integer useCaptureOldData;

    private Integer useHandleKeyUpdates;

    private Integer streamRow;

    private LocalDateTime createTime;

    private String lastUpdateBy;

    private LocalDateTime lastUpdateTime;

    private String description;


    public String getTriggerId() {
        return triggerId;
    }

    public void setTriggerId(String triggerId) {
        this.triggerId = triggerId;
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

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getReloadChannelId() {
        return reloadChannelId;
    }

    public void setReloadChannelId(String reloadChannelId) {
        this.reloadChannelId = reloadChannelId;
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

    public Integer getSyncOnIncomingBatch() {
        return syncOnIncomingBatch;
    }

    public void setSyncOnIncomingBatch(Integer syncOnIncomingBatch) {
        this.syncOnIncomingBatch = syncOnIncomingBatch;
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

    public String getSyncOnUpdateCondition() {
        return syncOnUpdateCondition;
    }

    public void setSyncOnUpdateCondition(String syncOnUpdateCondition) {
        this.syncOnUpdateCondition = syncOnUpdateCondition;
    }

    public String getSyncOnInsertCondition() {
        return syncOnInsertCondition;
    }

    public void setSyncOnInsertCondition(String syncOnInsertCondition) {
        this.syncOnInsertCondition = syncOnInsertCondition;
    }

    public String getSyncOnDeleteCondition() {
        return syncOnDeleteCondition;
    }

    public void setSyncOnDeleteCondition(String syncOnDeleteCondition) {
        this.syncOnDeleteCondition = syncOnDeleteCondition;
    }

    public String getCustomBeforeUpdateText() {
        return customBeforeUpdateText;
    }

    public void setCustomBeforeUpdateText(String customBeforeUpdateText) {
        this.customBeforeUpdateText = customBeforeUpdateText;
    }

    public String getCustomBeforeInsertText() {
        return customBeforeInsertText;
    }

    public void setCustomBeforeInsertText(String customBeforeInsertText) {
        this.customBeforeInsertText = customBeforeInsertText;
    }

    public String getCustomBeforeDeleteText() {
        return customBeforeDeleteText;
    }

    public void setCustomBeforeDeleteText(String customBeforeDeleteText) {
        this.customBeforeDeleteText = customBeforeDeleteText;
    }

    public String getCustomOnUpdateText() {
        return customOnUpdateText;
    }

    public void setCustomOnUpdateText(String customOnUpdateText) {
        this.customOnUpdateText = customOnUpdateText;
    }

    public String getCustomOnInsertText() {
        return customOnInsertText;
    }

    public void setCustomOnInsertText(String customOnInsertText) {
        this.customOnInsertText = customOnInsertText;
    }

    public String getCustomOnDeleteText() {
        return customOnDeleteText;
    }

    public void setCustomOnDeleteText(String customOnDeleteText) {
        this.customOnDeleteText = customOnDeleteText;
    }

    public String getExternalSelect() {
        return externalSelect;
    }

    public void setExternalSelect(String externalSelect) {
        this.externalSelect = externalSelect;
    }

    public String getTxIdExpression() {
        return txIdExpression;
    }

    public void setTxIdExpression(String txIdExpression) {
        this.txIdExpression = txIdExpression;
    }

    public String getChannelExpression() {
        return channelExpression;
    }

    public void setChannelExpression(String channelExpression) {
        this.channelExpression = channelExpression;
    }

    public String getExcludedColumnNames() {
        return excludedColumnNames;
    }

    public void setExcludedColumnNames(String excludedColumnNames) {
        this.excludedColumnNames = excludedColumnNames;
    }

    public String getIncludedColumnNames() {
        return includedColumnNames;
    }

    public void setIncludedColumnNames(String includedColumnNames) {
        this.includedColumnNames = includedColumnNames;
    }

    public String getSyncKeyNames() {
        return syncKeyNames;
    }

    public void setSyncKeyNames(String syncKeyNames) {
        this.syncKeyNames = syncKeyNames;
    }

    public Integer getUseStreamLobs() {
        return useStreamLobs;
    }

    public void setUseStreamLobs(Integer useStreamLobs) {
        this.useStreamLobs = useStreamLobs;
    }

    public Integer getUseCaptureLobs() {
        return useCaptureLobs;
    }

    public void setUseCaptureLobs(Integer useCaptureLobs) {
        this.useCaptureLobs = useCaptureLobs;
    }

    public Integer getUseCaptureOldData() {
        return useCaptureOldData;
    }

    public void setUseCaptureOldData(Integer useCaptureOldData) {
        this.useCaptureOldData = useCaptureOldData;
    }

    public Integer getUseHandleKeyUpdates() {
        return useHandleKeyUpdates;
    }

    public void setUseHandleKeyUpdates(Integer useHandleKeyUpdates) {
        this.useHandleKeyUpdates = useHandleKeyUpdates;
    }

    public Integer getStreamRow() {
        return streamRow;
    }

    public void setStreamRow(Integer streamRow) {
        this.streamRow = streamRow;
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
        return "SymTrigger{" +
        "triggerId=" + triggerId +
        ", sourceCatalogName=" + sourceCatalogName +
        ", sourceSchemaName=" + sourceSchemaName +
        ", sourceTableName=" + sourceTableName +
        ", channelId=" + channelId +
        ", reloadChannelId=" + reloadChannelId +
        ", syncOnUpdate=" + syncOnUpdate +
        ", syncOnInsert=" + syncOnInsert +
        ", syncOnDelete=" + syncOnDelete +
        ", syncOnIncomingBatch=" + syncOnIncomingBatch +
        ", nameForUpdateTrigger=" + nameForUpdateTrigger +
        ", nameForInsertTrigger=" + nameForInsertTrigger +
        ", nameForDeleteTrigger=" + nameForDeleteTrigger +
        ", syncOnUpdateCondition=" + syncOnUpdateCondition +
        ", syncOnInsertCondition=" + syncOnInsertCondition +
        ", syncOnDeleteCondition=" + syncOnDeleteCondition +
        ", customBeforeUpdateText=" + customBeforeUpdateText +
        ", customBeforeInsertText=" + customBeforeInsertText +
        ", customBeforeDeleteText=" + customBeforeDeleteText +
        ", customOnUpdateText=" + customOnUpdateText +
        ", customOnInsertText=" + customOnInsertText +
        ", customOnDeleteText=" + customOnDeleteText +
        ", externalSelect=" + externalSelect +
        ", txIdExpression=" + txIdExpression +
        ", channelExpression=" + channelExpression +
        ", excludedColumnNames=" + excludedColumnNames +
        ", includedColumnNames=" + includedColumnNames +
        ", syncKeyNames=" + syncKeyNames +
        ", useStreamLobs=" + useStreamLobs +
        ", useCaptureLobs=" + useCaptureLobs +
        ", useCaptureOldData=" + useCaptureOldData +
        ", useHandleKeyUpdates=" + useHandleKeyUpdates +
        ", streamRow=" + streamRow +
        ", createTime=" + createTime +
        ", lastUpdateBy=" + lastUpdateBy +
        ", lastUpdateTime=" + lastUpdateTime +
        ", description=" + description +
        "}";
    }
}

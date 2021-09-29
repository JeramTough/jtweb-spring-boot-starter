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
@ApiModel(value="SymFileTrigger对象", description="")
public class SymFileTriggerDto implements Serializable{

    private static final long serialVersionUID=1L;

    private String triggerId;

    private String channelId;

    private String reloadChannelId;

    private String baseDir;

    private Integer recurse;

    private String includesFiles;

    private String excludesFiles;

    private Integer syncOnCreate;

    private Integer syncOnModified;

    private Integer syncOnDelete;

    private Integer syncOnCtlFile;

    private Integer deleteAfterSync;

    private String beforeCopyScript;

    private String afterCopyScript;

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

    public String getBaseDir() {
        return baseDir;
    }

    public void setBaseDir(String baseDir) {
        this.baseDir = baseDir;
    }

    public Integer getRecurse() {
        return recurse;
    }

    public void setRecurse(Integer recurse) {
        this.recurse = recurse;
    }

    public String getIncludesFiles() {
        return includesFiles;
    }

    public void setIncludesFiles(String includesFiles) {
        this.includesFiles = includesFiles;
    }

    public String getExcludesFiles() {
        return excludesFiles;
    }

    public void setExcludesFiles(String excludesFiles) {
        this.excludesFiles = excludesFiles;
    }

    public Integer getSyncOnCreate() {
        return syncOnCreate;
    }

    public void setSyncOnCreate(Integer syncOnCreate) {
        this.syncOnCreate = syncOnCreate;
    }

    public Integer getSyncOnModified() {
        return syncOnModified;
    }

    public void setSyncOnModified(Integer syncOnModified) {
        this.syncOnModified = syncOnModified;
    }

    public Integer getSyncOnDelete() {
        return syncOnDelete;
    }

    public void setSyncOnDelete(Integer syncOnDelete) {
        this.syncOnDelete = syncOnDelete;
    }

    public Integer getSyncOnCtlFile() {
        return syncOnCtlFile;
    }

    public void setSyncOnCtlFile(Integer syncOnCtlFile) {
        this.syncOnCtlFile = syncOnCtlFile;
    }

    public Integer getDeleteAfterSync() {
        return deleteAfterSync;
    }

    public void setDeleteAfterSync(Integer deleteAfterSync) {
        this.deleteAfterSync = deleteAfterSync;
    }

    public String getBeforeCopyScript() {
        return beforeCopyScript;
    }

    public void setBeforeCopyScript(String beforeCopyScript) {
        this.beforeCopyScript = beforeCopyScript;
    }

    public String getAfterCopyScript() {
        return afterCopyScript;
    }

    public void setAfterCopyScript(String afterCopyScript) {
        this.afterCopyScript = afterCopyScript;
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
        return "SymFileTrigger{" +
        "triggerId=" + triggerId +
        ", channelId=" + channelId +
        ", reloadChannelId=" + reloadChannelId +
        ", baseDir=" + baseDir +
        ", recurse=" + recurse +
        ", includesFiles=" + includesFiles +
        ", excludesFiles=" + excludesFiles +
        ", syncOnCreate=" + syncOnCreate +
        ", syncOnModified=" + syncOnModified +
        ", syncOnDelete=" + syncOnDelete +
        ", syncOnCtlFile=" + syncOnCtlFile +
        ", deleteAfterSync=" + deleteAfterSync +
        ", beforeCopyScript=" + beforeCopyScript +
        ", afterCopyScript=" + afterCopyScript +
        ", createTime=" + createTime +
        ", lastUpdateBy=" + lastUpdateBy +
        ", lastUpdateTime=" + lastUpdateTime +
        ", description=" + description +
        "}";
    }
}

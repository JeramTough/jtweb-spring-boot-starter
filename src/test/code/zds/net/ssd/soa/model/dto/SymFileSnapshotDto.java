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
@ApiModel(value="SymFileSnapshot对象", description="")
public class SymFileSnapshotDto implements Serializable{

    private static final long serialVersionUID=1L;

    private String triggerId;

    private String routerId;

    private String relativeDir;

    private String fileName;

    private String channelId;

    private String reloadChannelId;

    private String lastEventType;

    private Long crc32Checksum;

    private Long fileSize;

    private Long fileModifiedTime;

    private LocalDateTime lastUpdateTime;

    private String lastUpdateBy;

    private LocalDateTime createTime;


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

    public String getRelativeDir() {
        return relativeDir;
    }

    public void setRelativeDir(String relativeDir) {
        this.relativeDir = relativeDir;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
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

    public String getLastEventType() {
        return lastEventType;
    }

    public void setLastEventType(String lastEventType) {
        this.lastEventType = lastEventType;
    }

    public Long getCrc32Checksum() {
        return crc32Checksum;
    }

    public void setCrc32Checksum(Long crc32Checksum) {
        this.crc32Checksum = crc32Checksum;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public Long getFileModifiedTime() {
        return fileModifiedTime;
    }

    public void setFileModifiedTime(Long fileModifiedTime) {
        this.fileModifiedTime = fileModifiedTime;
    }

    public LocalDateTime getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(LocalDateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SymFileSnapshot{" +
        "triggerId=" + triggerId +
        ", routerId=" + routerId +
        ", relativeDir=" + relativeDir +
        ", fileName=" + fileName +
        ", channelId=" + channelId +
        ", reloadChannelId=" + reloadChannelId +
        ", lastEventType=" + lastEventType +
        ", crc32Checksum=" + crc32Checksum +
        ", fileSize=" + fileSize +
        ", fileModifiedTime=" + fileModifiedTime +
        ", lastUpdateTime=" + lastUpdateTime +
        ", lastUpdateBy=" + lastUpdateBy +
        ", createTime=" + createTime +
        "}";
    }
}

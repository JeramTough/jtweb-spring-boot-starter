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
@ApiModel(value="SymNodeGroupChannelWnd对象", description="")
public class SymNodeGroupChannelWndDto implements Serializable{

    private static final long serialVersionUID=1L;

    private String nodeGroupId;

    private String channelId;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private Integer enabled;


    public String getNodeGroupId() {
        return nodeGroupId;
    }

    public void setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "SymNodeGroupChannelWnd{" +
        "nodeGroupId=" + nodeGroupId +
        ", channelId=" + channelId +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", enabled=" + enabled +
        "}";
    }
}

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
@ApiModel(value="SymNodeChannelCtl对象", description="")
public class SymNodeChannelCtl implements Serializable {

    private static final long serialVersionUID=1L;

    private String nodeId;

    private String channelId;

    private Integer suspendEnabled;

    private Integer ignoreEnabled;

    private LocalDateTime lastExtractTime;


    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public Integer getSuspendEnabled() {
        return suspendEnabled;
    }

    public void setSuspendEnabled(Integer suspendEnabled) {
        this.suspendEnabled = suspendEnabled;
    }

    public Integer getIgnoreEnabled() {
        return ignoreEnabled;
    }

    public void setIgnoreEnabled(Integer ignoreEnabled) {
        this.ignoreEnabled = ignoreEnabled;
    }

    public LocalDateTime getLastExtractTime() {
        return lastExtractTime;
    }

    public void setLastExtractTime(LocalDateTime lastExtractTime) {
        this.lastExtractTime = lastExtractTime;
    }

    @Override
    public String toString() {
        return "SymNodeChannelCtl{" +
        "nodeId=" + nodeId +
        ", channelId=" + channelId +
        ", suspendEnabled=" + suspendEnabled +
        ", ignoreEnabled=" + ignoreEnabled +
        ", lastExtractTime=" + lastExtractTime +
        "}";
    }
}

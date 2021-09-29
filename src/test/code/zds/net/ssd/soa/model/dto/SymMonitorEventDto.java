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
@ApiModel(value="SymMonitorEvent对象", description="")
public class SymMonitorEventDto implements Serializable{

    private static final long serialVersionUID=1L;

    private String monitorId;

    private String nodeId;

    private LocalDateTime eventTime;

    private String hostName;

    private String type;

    private Long threshold;

    private Long eventValue;

    private Integer eventCount;

    private Integer severityLevel;

    private Integer isResolved;

    private Integer isNotified;

    private String details;

    private LocalDateTime lastUpdateTime;


    public String getMonitorId() {
        return monitorId;
    }

    public void setMonitorId(String monitorId) {
        this.monitorId = monitorId;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public LocalDateTime getEventTime() {
        return eventTime;
    }

    public void setEventTime(LocalDateTime eventTime) {
        this.eventTime = eventTime;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getThreshold() {
        return threshold;
    }

    public void setThreshold(Long threshold) {
        this.threshold = threshold;
    }

    public Long getEventValue() {
        return eventValue;
    }

    public void setEventValue(Long eventValue) {
        this.eventValue = eventValue;
    }

    public Integer getEventCount() {
        return eventCount;
    }

    public void setEventCount(Integer eventCount) {
        this.eventCount = eventCount;
    }

    public Integer getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(Integer severityLevel) {
        this.severityLevel = severityLevel;
    }

    public Integer getIsResolved() {
        return isResolved;
    }

    public void setIsResolved(Integer isResolved) {
        this.isResolved = isResolved;
    }

    public Integer getIsNotified() {
        return isNotified;
    }

    public void setIsNotified(Integer isNotified) {
        this.isNotified = isNotified;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDateTime getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(LocalDateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Override
    public String toString() {
        return "SymMonitorEvent{" +
        "monitorId=" + monitorId +
        ", nodeId=" + nodeId +
        ", eventTime=" + eventTime +
        ", hostName=" + hostName +
        ", type=" + type +
        ", threshold=" + threshold +
        ", eventValue=" + eventValue +
        ", eventCount=" + eventCount +
        ", severityLevel=" + severityLevel +
        ", isResolved=" + isResolved +
        ", isNotified=" + isNotified +
        ", details=" + details +
        ", lastUpdateTime=" + lastUpdateTime +
        "}";
    }
}

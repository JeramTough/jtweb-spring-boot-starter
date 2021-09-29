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
@ApiModel(value="SymNodeHostStats对象", description="")
public class SymNodeHostStats implements Serializable {

    private static final long serialVersionUID=1L;

    private String nodeId;

    private String hostName;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private Long restarted;

    private Long nodesPulled;

    private Long totalNodesPullTime;

    private Long nodesPushed;

    private Long totalNodesPushTime;

    private Long nodesRejected;

    private Long nodesRegistered;

    private Long nodesLoaded;

    private Long nodesDisabled;

    private Long purgedDataRows;

    private Long purgedDataEventRows;

    private Long purgedBatchOutgoingRows;

    private Long purgedBatchIncomingRows;

    private Long triggersCreatedCount;

    private Long triggersRebuiltCount;

    private Long triggersRemovedCount;


    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
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

    public Long getRestarted() {
        return restarted;
    }

    public void setRestarted(Long restarted) {
        this.restarted = restarted;
    }

    public Long getNodesPulled() {
        return nodesPulled;
    }

    public void setNodesPulled(Long nodesPulled) {
        this.nodesPulled = nodesPulled;
    }

    public Long getTotalNodesPullTime() {
        return totalNodesPullTime;
    }

    public void setTotalNodesPullTime(Long totalNodesPullTime) {
        this.totalNodesPullTime = totalNodesPullTime;
    }

    public Long getNodesPushed() {
        return nodesPushed;
    }

    public void setNodesPushed(Long nodesPushed) {
        this.nodesPushed = nodesPushed;
    }

    public Long getTotalNodesPushTime() {
        return totalNodesPushTime;
    }

    public void setTotalNodesPushTime(Long totalNodesPushTime) {
        this.totalNodesPushTime = totalNodesPushTime;
    }

    public Long getNodesRejected() {
        return nodesRejected;
    }

    public void setNodesRejected(Long nodesRejected) {
        this.nodesRejected = nodesRejected;
    }

    public Long getNodesRegistered() {
        return nodesRegistered;
    }

    public void setNodesRegistered(Long nodesRegistered) {
        this.nodesRegistered = nodesRegistered;
    }

    public Long getNodesLoaded() {
        return nodesLoaded;
    }

    public void setNodesLoaded(Long nodesLoaded) {
        this.nodesLoaded = nodesLoaded;
    }

    public Long getNodesDisabled() {
        return nodesDisabled;
    }

    public void setNodesDisabled(Long nodesDisabled) {
        this.nodesDisabled = nodesDisabled;
    }

    public Long getPurgedDataRows() {
        return purgedDataRows;
    }

    public void setPurgedDataRows(Long purgedDataRows) {
        this.purgedDataRows = purgedDataRows;
    }

    public Long getPurgedDataEventRows() {
        return purgedDataEventRows;
    }

    public void setPurgedDataEventRows(Long purgedDataEventRows) {
        this.purgedDataEventRows = purgedDataEventRows;
    }

    public Long getPurgedBatchOutgoingRows() {
        return purgedBatchOutgoingRows;
    }

    public void setPurgedBatchOutgoingRows(Long purgedBatchOutgoingRows) {
        this.purgedBatchOutgoingRows = purgedBatchOutgoingRows;
    }

    public Long getPurgedBatchIncomingRows() {
        return purgedBatchIncomingRows;
    }

    public void setPurgedBatchIncomingRows(Long purgedBatchIncomingRows) {
        this.purgedBatchIncomingRows = purgedBatchIncomingRows;
    }

    public Long getTriggersCreatedCount() {
        return triggersCreatedCount;
    }

    public void setTriggersCreatedCount(Long triggersCreatedCount) {
        this.triggersCreatedCount = triggersCreatedCount;
    }

    public Long getTriggersRebuiltCount() {
        return triggersRebuiltCount;
    }

    public void setTriggersRebuiltCount(Long triggersRebuiltCount) {
        this.triggersRebuiltCount = triggersRebuiltCount;
    }

    public Long getTriggersRemovedCount() {
        return triggersRemovedCount;
    }

    public void setTriggersRemovedCount(Long triggersRemovedCount) {
        this.triggersRemovedCount = triggersRemovedCount;
    }

    @Override
    public String toString() {
        return "SymNodeHostStats{" +
        "nodeId=" + nodeId +
        ", hostName=" + hostName +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", restarted=" + restarted +
        ", nodesPulled=" + nodesPulled +
        ", totalNodesPullTime=" + totalNodesPullTime +
        ", nodesPushed=" + nodesPushed +
        ", totalNodesPushTime=" + totalNodesPushTime +
        ", nodesRejected=" + nodesRejected +
        ", nodesRegistered=" + nodesRegistered +
        ", nodesLoaded=" + nodesLoaded +
        ", nodesDisabled=" + nodesDisabled +
        ", purgedDataRows=" + purgedDataRows +
        ", purgedDataEventRows=" + purgedDataEventRows +
        ", purgedBatchOutgoingRows=" + purgedBatchOutgoingRows +
        ", purgedBatchIncomingRows=" + purgedBatchIncomingRows +
        ", triggersCreatedCount=" + triggersCreatedCount +
        ", triggersRebuiltCount=" + triggersRebuiltCount +
        ", triggersRemovedCount=" + triggersRemovedCount +
        "}";
    }
}

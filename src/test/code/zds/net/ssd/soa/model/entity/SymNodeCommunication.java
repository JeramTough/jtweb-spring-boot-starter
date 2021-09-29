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
@ApiModel(value="SymNodeCommunication对象", description="")
public class SymNodeCommunication implements Serializable {

    private static final long serialVersionUID=1L;

    private String nodeId;

    private String queue;

    private String communicationType;

    private LocalDateTime lockTime;

    private String lockingServerId;

    private LocalDateTime lastLockTime;

    private Long lastLockMillis;

    private Long successCount;

    private Long failCount;

    private Long skipCount;

    private Long totalSuccessCount;

    private Long totalFailCount;

    private Long totalSuccessMillis;

    private Long totalFailMillis;

    private Long batchToSendCount;

    private Integer nodePriority;


    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public String getCommunicationType() {
        return communicationType;
    }

    public void setCommunicationType(String communicationType) {
        this.communicationType = communicationType;
    }

    public LocalDateTime getLockTime() {
        return lockTime;
    }

    public void setLockTime(LocalDateTime lockTime) {
        this.lockTime = lockTime;
    }

    public String getLockingServerId() {
        return lockingServerId;
    }

    public void setLockingServerId(String lockingServerId) {
        this.lockingServerId = lockingServerId;
    }

    public LocalDateTime getLastLockTime() {
        return lastLockTime;
    }

    public void setLastLockTime(LocalDateTime lastLockTime) {
        this.lastLockTime = lastLockTime;
    }

    public Long getLastLockMillis() {
        return lastLockMillis;
    }

    public void setLastLockMillis(Long lastLockMillis) {
        this.lastLockMillis = lastLockMillis;
    }

    public Long getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Long successCount) {
        this.successCount = successCount;
    }

    public Long getFailCount() {
        return failCount;
    }

    public void setFailCount(Long failCount) {
        this.failCount = failCount;
    }

    public Long getSkipCount() {
        return skipCount;
    }

    public void setSkipCount(Long skipCount) {
        this.skipCount = skipCount;
    }

    public Long getTotalSuccessCount() {
        return totalSuccessCount;
    }

    public void setTotalSuccessCount(Long totalSuccessCount) {
        this.totalSuccessCount = totalSuccessCount;
    }

    public Long getTotalFailCount() {
        return totalFailCount;
    }

    public void setTotalFailCount(Long totalFailCount) {
        this.totalFailCount = totalFailCount;
    }

    public Long getTotalSuccessMillis() {
        return totalSuccessMillis;
    }

    public void setTotalSuccessMillis(Long totalSuccessMillis) {
        this.totalSuccessMillis = totalSuccessMillis;
    }

    public Long getTotalFailMillis() {
        return totalFailMillis;
    }

    public void setTotalFailMillis(Long totalFailMillis) {
        this.totalFailMillis = totalFailMillis;
    }

    public Long getBatchToSendCount() {
        return batchToSendCount;
    }

    public void setBatchToSendCount(Long batchToSendCount) {
        this.batchToSendCount = batchToSendCount;
    }

    public Integer getNodePriority() {
        return nodePriority;
    }

    public void setNodePriority(Integer nodePriority) {
        this.nodePriority = nodePriority;
    }

    @Override
    public String toString() {
        return "SymNodeCommunication{" +
        "nodeId=" + nodeId +
        ", queue=" + queue +
        ", communicationType=" + communicationType +
        ", lockTime=" + lockTime +
        ", lockingServerId=" + lockingServerId +
        ", lastLockTime=" + lastLockTime +
        ", lastLockMillis=" + lastLockMillis +
        ", successCount=" + successCount +
        ", failCount=" + failCount +
        ", skipCount=" + skipCount +
        ", totalSuccessCount=" + totalSuccessCount +
        ", totalFailCount=" + totalFailCount +
        ", totalSuccessMillis=" + totalSuccessMillis +
        ", totalFailMillis=" + totalFailMillis +
        ", batchToSendCount=" + batchToSendCount +
        ", nodePriority=" + nodePriority +
        "}";
    }
}

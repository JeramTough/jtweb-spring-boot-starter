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
@ApiModel(value="SymNodeHostJobStats对象", description="")
public class SymNodeHostJobStats implements Serializable {

    private static final long serialVersionUID=1L;

    private String nodeId;

    private String hostName;

    private String jobName;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private Long processedCount;

    private String targetNodeId;

    private Integer targetNodeCount;


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

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
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

    public Long getProcessedCount() {
        return processedCount;
    }

    public void setProcessedCount(Long processedCount) {
        this.processedCount = processedCount;
    }

    public String getTargetNodeId() {
        return targetNodeId;
    }

    public void setTargetNodeId(String targetNodeId) {
        this.targetNodeId = targetNodeId;
    }

    public Integer getTargetNodeCount() {
        return targetNodeCount;
    }

    public void setTargetNodeCount(Integer targetNodeCount) {
        this.targetNodeCount = targetNodeCount;
    }

    @Override
    public String toString() {
        return "SymNodeHostJobStats{" +
        "nodeId=" + nodeId +
        ", hostName=" + hostName +
        ", jobName=" + jobName +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", processedCount=" + processedCount +
        ", targetNodeId=" + targetNodeId +
        ", targetNodeCount=" + targetNodeCount +
        "}";
    }
}

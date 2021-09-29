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
@ApiModel(value="SymJob对象", description="")
public class SymJobDto implements Serializable{

    private static final long serialVersionUID=1L;

    private String jobName;

    private String jobType;

    private Integer requiresRegistration;

    private String jobExpression;

    private String description;

    private String defaultSchedule;

    private Integer defaultAutoStart;

    private String nodeGroupId;

    private String createBy;

    private LocalDateTime createTime;

    private String lastUpdateBy;

    private LocalDateTime lastUpdateTime;


    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public Integer getRequiresRegistration() {
        return requiresRegistration;
    }

    public void setRequiresRegistration(Integer requiresRegistration) {
        this.requiresRegistration = requiresRegistration;
    }

    public String getJobExpression() {
        return jobExpression;
    }

    public void setJobExpression(String jobExpression) {
        this.jobExpression = jobExpression;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDefaultSchedule() {
        return defaultSchedule;
    }

    public void setDefaultSchedule(String defaultSchedule) {
        this.defaultSchedule = defaultSchedule;
    }

    public Integer getDefaultAutoStart() {
        return defaultAutoStart;
    }

    public void setDefaultAutoStart(Integer defaultAutoStart) {
        this.defaultAutoStart = defaultAutoStart;
    }

    public String getNodeGroupId() {
        return nodeGroupId;
    }

    public void setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
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

    @Override
    public String toString() {
        return "SymJob{" +
        "jobName=" + jobName +
        ", jobType=" + jobType +
        ", requiresRegistration=" + requiresRegistration +
        ", jobExpression=" + jobExpression +
        ", description=" + description +
        ", defaultSchedule=" + defaultSchedule +
        ", defaultAutoStart=" + defaultAutoStart +
        ", nodeGroupId=" + nodeGroupId +
        ", createBy=" + createBy +
        ", createTime=" + createTime +
        ", lastUpdateBy=" + lastUpdateBy +
        ", lastUpdateTime=" + lastUpdateTime +
        "}";
    }
}

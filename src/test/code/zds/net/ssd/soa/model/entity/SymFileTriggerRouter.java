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
@ApiModel(value="SymFileTriggerRouter对象", description="")
public class SymFileTriggerRouter implements Serializable {

    private static final long serialVersionUID=1L;

    private String triggerId;

    private String routerId;

    private Integer enabled;

    private Integer initialLoadEnabled;

    private String targetBaseDir;

    private String conflictStrategy;

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

    public String getRouterId() {
        return routerId;
    }

    public void setRouterId(String routerId) {
        this.routerId = routerId;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public Integer getInitialLoadEnabled() {
        return initialLoadEnabled;
    }

    public void setInitialLoadEnabled(Integer initialLoadEnabled) {
        this.initialLoadEnabled = initialLoadEnabled;
    }

    public String getTargetBaseDir() {
        return targetBaseDir;
    }

    public void setTargetBaseDir(String targetBaseDir) {
        this.targetBaseDir = targetBaseDir;
    }

    public String getConflictStrategy() {
        return conflictStrategy;
    }

    public void setConflictStrategy(String conflictStrategy) {
        this.conflictStrategy = conflictStrategy;
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
        return "SymFileTriggerRouter{" +
        "triggerId=" + triggerId +
        ", routerId=" + routerId +
        ", enabled=" + enabled +
        ", initialLoadEnabled=" + initialLoadEnabled +
        ", targetBaseDir=" + targetBaseDir +
        ", conflictStrategy=" + conflictStrategy +
        ", createTime=" + createTime +
        ", lastUpdateBy=" + lastUpdateBy +
        ", lastUpdateTime=" + lastUpdateTime +
        ", description=" + description +
        "}";
    }
}

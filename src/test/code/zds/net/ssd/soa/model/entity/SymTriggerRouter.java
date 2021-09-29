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
@ApiModel(value="SymTriggerRouter对象", description="")
public class SymTriggerRouter implements Serializable {

    private static final long serialVersionUID=1L;

    private String triggerId;

    private String routerId;

    private Integer enabled;

    private Integer initialLoadOrder;

    private String initialLoadSelect;

    private String initialLoadDeleteStmt;

    private Integer pingBackEnabled;

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

    public Integer getInitialLoadOrder() {
        return initialLoadOrder;
    }

    public void setInitialLoadOrder(Integer initialLoadOrder) {
        this.initialLoadOrder = initialLoadOrder;
    }

    public String getInitialLoadSelect() {
        return initialLoadSelect;
    }

    public void setInitialLoadSelect(String initialLoadSelect) {
        this.initialLoadSelect = initialLoadSelect;
    }

    public String getInitialLoadDeleteStmt() {
        return initialLoadDeleteStmt;
    }

    public void setInitialLoadDeleteStmt(String initialLoadDeleteStmt) {
        this.initialLoadDeleteStmt = initialLoadDeleteStmt;
    }

    public Integer getPingBackEnabled() {
        return pingBackEnabled;
    }

    public void setPingBackEnabled(Integer pingBackEnabled) {
        this.pingBackEnabled = pingBackEnabled;
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
        return "SymTriggerRouter{" +
        "triggerId=" + triggerId +
        ", routerId=" + routerId +
        ", enabled=" + enabled +
        ", initialLoadOrder=" + initialLoadOrder +
        ", initialLoadSelect=" + initialLoadSelect +
        ", initialLoadDeleteStmt=" + initialLoadDeleteStmt +
        ", pingBackEnabled=" + pingBackEnabled +
        ", createTime=" + createTime +
        ", lastUpdateBy=" + lastUpdateBy +
        ", lastUpdateTime=" + lastUpdateTime +
        ", description=" + description +
        "}";
    }
}

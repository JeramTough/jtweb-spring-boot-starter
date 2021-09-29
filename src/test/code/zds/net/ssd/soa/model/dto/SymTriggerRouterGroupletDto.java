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
@ApiModel(value="SymTriggerRouterGrouplet对象", description="")
public class SymTriggerRouterGroupletDto implements Serializable{

    private static final long serialVersionUID=1L;

    private String groupletId;

    private String triggerId;

    private String routerId;

    private String appliesWhen;

    private LocalDateTime createTime;

    private String lastUpdateBy;

    private LocalDateTime lastUpdateTime;


    public String getGroupletId() {
        return groupletId;
    }

    public void setGroupletId(String groupletId) {
        this.groupletId = groupletId;
    }

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

    public String getAppliesWhen() {
        return appliesWhen;
    }

    public void setAppliesWhen(String appliesWhen) {
        this.appliesWhen = appliesWhen;
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
        return "SymTriggerRouterGrouplet{" +
        "groupletId=" + groupletId +
        ", triggerId=" + triggerId +
        ", routerId=" + routerId +
        ", appliesWhen=" + appliesWhen +
        ", createTime=" + createTime +
        ", lastUpdateBy=" + lastUpdateBy +
        ", lastUpdateTime=" + lastUpdateTime +
        "}";
    }
}

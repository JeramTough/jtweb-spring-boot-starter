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
@ApiModel(value="SymNodeGroupLink对象", description="")
public class SymNodeGroupLink implements Serializable {

    private static final long serialVersionUID=1L;

    private String sourceNodeGroupId;

    private String targetNodeGroupId;

    private String dataEventAction;

    private Integer syncConfigEnabled;

    private Integer isReversible;

    private LocalDateTime createTime;

    private String lastUpdateBy;

    private LocalDateTime lastUpdateTime;


    public String getSourceNodeGroupId() {
        return sourceNodeGroupId;
    }

    public void setSourceNodeGroupId(String sourceNodeGroupId) {
        this.sourceNodeGroupId = sourceNodeGroupId;
    }

    public String getTargetNodeGroupId() {
        return targetNodeGroupId;
    }

    public void setTargetNodeGroupId(String targetNodeGroupId) {
        this.targetNodeGroupId = targetNodeGroupId;
    }

    public String getDataEventAction() {
        return dataEventAction;
    }

    public void setDataEventAction(String dataEventAction) {
        this.dataEventAction = dataEventAction;
    }

    public Integer getSyncConfigEnabled() {
        return syncConfigEnabled;
    }

    public void setSyncConfigEnabled(Integer syncConfigEnabled) {
        this.syncConfigEnabled = syncConfigEnabled;
    }

    public Integer getIsReversible() {
        return isReversible;
    }

    public void setIsReversible(Integer isReversible) {
        this.isReversible = isReversible;
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
        return "SymNodeGroupLink{" +
        "sourceNodeGroupId=" + sourceNodeGroupId +
        ", targetNodeGroupId=" + targetNodeGroupId +
        ", dataEventAction=" + dataEventAction +
        ", syncConfigEnabled=" + syncConfigEnabled +
        ", isReversible=" + isReversible +
        ", createTime=" + createTime +
        ", lastUpdateBy=" + lastUpdateBy +
        ", lastUpdateTime=" + lastUpdateTime +
        "}";
    }
}

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
@ApiModel(value="SymGrouplet对象", description="")
public class SymGrouplet implements Serializable {

    private static final long serialVersionUID=1L;

    private String groupletId;

    private String groupletLinkPolicy;

    private String description;

    private LocalDateTime createTime;

    private String lastUpdateBy;

    private LocalDateTime lastUpdateTime;


    public String getGroupletId() {
        return groupletId;
    }

    public void setGroupletId(String groupletId) {
        this.groupletId = groupletId;
    }

    public String getGroupletLinkPolicy() {
        return groupletLinkPolicy;
    }

    public void setGroupletLinkPolicy(String groupletLinkPolicy) {
        this.groupletLinkPolicy = groupletLinkPolicy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        return "SymGrouplet{" +
        "groupletId=" + groupletId +
        ", groupletLinkPolicy=" + groupletLinkPolicy +
        ", description=" + description +
        ", createTime=" + createTime +
        ", lastUpdateBy=" + lastUpdateBy +
        ", lastUpdateTime=" + lastUpdateTime +
        "}";
    }
}

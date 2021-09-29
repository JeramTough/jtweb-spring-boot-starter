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
@ApiModel(value="SymDataGap对象", description="")
public class SymDataGapDto implements Serializable{

    private static final long serialVersionUID=1L;

    private Long startId;

    private Long endId;

    private LocalDateTime createTime;

    private String lastUpdateHostname;


    public Long getStartId() {
        return startId;
    }

    public void setStartId(Long startId) {
        this.startId = startId;
    }

    public Long getEndId() {
        return endId;
    }

    public void setEndId(Long endId) {
        this.endId = endId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getLastUpdateHostname() {
        return lastUpdateHostname;
    }

    public void setLastUpdateHostname(String lastUpdateHostname) {
        this.lastUpdateHostname = lastUpdateHostname;
    }

    @Override
    public String toString() {
        return "SymDataGap{" +
        "startId=" + startId +
        ", endId=" + endId +
        ", createTime=" + createTime +
        ", lastUpdateHostname=" + lastUpdateHostname +
        "}";
    }
}

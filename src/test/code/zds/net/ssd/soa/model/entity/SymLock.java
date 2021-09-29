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
@ApiModel(value="SymLock对象", description="")
public class SymLock implements Serializable {

    private static final long serialVersionUID=1L;

    private String lockAction;

    private String lockType;

    private String lockingServerId;

    private LocalDateTime lockTime;

    private Integer sharedCount;

    private Integer sharedEnable;

    private LocalDateTime lastLockTime;

    private String lastLockingServerId;


    public String getLockAction() {
        return lockAction;
    }

    public void setLockAction(String lockAction) {
        this.lockAction = lockAction;
    }

    public String getLockType() {
        return lockType;
    }

    public void setLockType(String lockType) {
        this.lockType = lockType;
    }

    public String getLockingServerId() {
        return lockingServerId;
    }

    public void setLockingServerId(String lockingServerId) {
        this.lockingServerId = lockingServerId;
    }

    public LocalDateTime getLockTime() {
        return lockTime;
    }

    public void setLockTime(LocalDateTime lockTime) {
        this.lockTime = lockTime;
    }

    public Integer getSharedCount() {
        return sharedCount;
    }

    public void setSharedCount(Integer sharedCount) {
        this.sharedCount = sharedCount;
    }

    public Integer getSharedEnable() {
        return sharedEnable;
    }

    public void setSharedEnable(Integer sharedEnable) {
        this.sharedEnable = sharedEnable;
    }

    public LocalDateTime getLastLockTime() {
        return lastLockTime;
    }

    public void setLastLockTime(LocalDateTime lastLockTime) {
        this.lastLockTime = lastLockTime;
    }

    public String getLastLockingServerId() {
        return lastLockingServerId;
    }

    public void setLastLockingServerId(String lastLockingServerId) {
        this.lastLockingServerId = lastLockingServerId;
    }

    @Override
    public String toString() {
        return "SymLock{" +
        "lockAction=" + lockAction +
        ", lockType=" + lockType +
        ", lockingServerId=" + lockingServerId +
        ", lockTime=" + lockTime +
        ", sharedCount=" + sharedCount +
        ", sharedEnable=" + sharedEnable +
        ", lastLockTime=" + lastLockTime +
        ", lastLockingServerId=" + lastLockingServerId +
        "}";
    }
}

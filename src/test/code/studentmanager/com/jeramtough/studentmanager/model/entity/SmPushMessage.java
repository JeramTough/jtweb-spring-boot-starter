package com.jeramtough.studentmanager.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author WeiJieHui
 * @since 2020-12-22
 */
@ApiModel(value="SmPushMessage对象", description="")
public class SmPushMessage implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "fid", type = IdType.AUTO)
    private Long fid;

    private String message;

    private String type;

    private String createTime;

    private String hasReadUserIds;

    private Long adminUserId;

    private String adminUserName;


    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getHasReadUserIds() {
        return hasReadUserIds;
    }

    public void setHasReadUserIds(String hasReadUserIds) {
        this.hasReadUserIds = hasReadUserIds;
    }

    public Long getAdminUserId() {
        return adminUserId;
    }

    public void setAdminUserId(Long adminUserId) {
        this.adminUserId = adminUserId;
    }

    public String getAdminUserName() {
        return adminUserName;
    }

    public void setAdminUserName(String adminUserName) {
        this.adminUserName = adminUserName;
    }

    @Override
    public String toString() {
        return "SmPushMessage{" +
        "fid=" + fid +
        ", message=" + message +
        ", type=" + type +
        ", createTime=" + createTime +
        ", hasReadUserIds=" + hasReadUserIds +
        ", adminUserId=" + adminUserId +
        ", adminUserName=" + adminUserName +
        "}";
    }
}

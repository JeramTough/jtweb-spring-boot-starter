package com.jeramtough.im.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * @since 2021-10-22
 */
@ApiModel(value="ImParentCommunication对象", description="")
public class ImParentCommunication implements Serializable {

    private static final long serialVersionUID=1L;

  /**
   * 主键
   */
    @TableId(value = "fid", type = IdType.AUTO)
    private Long fid;

  /**
   * 家长id
   */
    private Long parentId;

  /**
   * 沟通内容
   */
    private String content;

  /**
   * 沟通时间
   */
    private LocalDateTime time;

  /**
   * 家长支持度
   */
    private String approvalState;

  /**
   * 家境情况
   */
    private String familyState;

    private Long operatorUid;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getApprovalState() {
        return approvalState;
    }

    public void setApprovalState(String approvalState) {
        this.approvalState = approvalState;
    }

    public String getFamilyState() {
        return familyState;
    }

    public void setFamilyState(String familyState) {
        this.familyState = familyState;
    }

    public Long getOperatorUid() {
        return operatorUid;
    }

    public void setOperatorUid(Long operatorUid) {
        this.operatorUid = operatorUid;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "ImParentCommunication{" +
        "fid=" + fid +
        ", parentId=" + parentId +
        ", content=" + content +
        ", time=" + time +
        ", approvalState=" + approvalState +
        ", familyState=" + familyState +
        ", operatorUid=" + operatorUid +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}

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
 * @since 2021-10-02
 */
@ApiModel(value="ImParent对象", description="")
public class ImParent implements Serializable {

    private static final long serialVersionUID=1L;

  /**
   * 主键id
   */
    @TableId(value = "fid", type = IdType.AUTO)
    private Long fid;

  /**
   * 数据录入者id
   */
    private Long operatorUid;

  /**
   * 家长名字
   */
    private String name;

  /**
   * 学生id
   */
    private Long studentId;

  /**
   * 关系
   */
    private String relation;

  /**
   * 工作单位
   */
    private String organization;

  /**
   * 联系电话
   */
    private String phoneNumber;

  /**
   * 数据创建时间
   */
    private LocalDateTime createTime;

  /**
   * 数据更新时间
   */
    private LocalDateTime updateTime;


    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public Long getOperatorUid() {
        return operatorUid;
    }

    public void setOperatorUid(Long operatorUid) {
        this.operatorUid = operatorUid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
        return "ImParent{" +
        "fid=" + fid +
        ", operatorUid=" + operatorUid +
        ", name=" + name +
        ", studentId=" + studentId +
        ", relation=" + relation +
        ", organization=" + organization +
        ", phoneNumber=" + phoneNumber +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}

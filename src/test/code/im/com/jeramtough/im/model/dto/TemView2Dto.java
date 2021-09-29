package com.jeramtough.im.model.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * VIEW
 * </p>
 *
 * @author WeiBoWen
 * @since 2021-09-23
 */
@ApiModel(value="TemView2对象", description="VIEW")
public class TemView2Dto implements Serializable{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "沟通内容")
    private String content;

    @ApiModelProperty(value = "主键")
    private Long fid;

    @ApiModelProperty(value = "沟通时间")
    private LocalDateTime time;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    @ApiModelProperty(value = "家长名字")
    private String parentName;

    @ApiModelProperty(value = "主键")
    private Long studentId;

    @ApiModelProperty(value = "真实名字")
    private String studentName;

    @ApiModelProperty(value = "学号")
    private String studentNumber;

    private Long operatorUid;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
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

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Long getOperatorUid() {
        return operatorUid;
    }

    public void setOperatorUid(Long operatorUid) {
        this.operatorUid = operatorUid;
    }

    @Override
    public String toString() {
        return "TemView2{" +
        "content=" + content +
        ", fid=" + fid +
        ", time=" + time +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", parentName=" + parentName +
        ", studentId=" + studentId +
        ", studentName=" + studentName +
        ", studentNumber=" + studentNumber +
        ", operatorUid=" + operatorUid +
        "}";
    }
}

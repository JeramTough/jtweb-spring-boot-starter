package com.jeramtough.studentmanager.model.entity;

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
@ApiModel(value="SmTeacherScore对象", description="")
public class SmTeacherScore implements Serializable {

    private static final long serialVersionUID=1L;

    private Long fid;

    private Long teacherId;

  /**
   * 成绩
   */
    private Double score;

    private Long scheduleId;

    private String comment;


    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "SmTeacherScore{" +
        "fid=" + fid +
        ", teacherId=" + teacherId +
        ", score=" + score +
        ", scheduleId=" + scheduleId +
        ", comment=" + comment +
        "}";
    }
}

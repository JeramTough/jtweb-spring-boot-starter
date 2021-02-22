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
@ApiModel(value="SmStudentScore对象", description="")
public class SmStudentScoreDto implements Serializable{

    private static final long serialVersionUID=1L;

    private Long fid;

    private Long scheduleId;

    @ApiModelProperty(value = "成绩")
    private Double score;

    private Long studentId;

    @ApiModelProperty(value = "建议")
    private String comment;


    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public Long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "SmStudentScore{" +
        "fid=" + fid +
        ", scheduleId=" + scheduleId +
        ", score=" + score +
        ", studentId=" + studentId +
        ", comment=" + comment +
        "}";
    }
}

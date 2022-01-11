package com.jeramtough.test.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author WeiJieHui
 * @since 2021-03-07
 */
@ApiModel(value="SmStudentScore对象", description="")
public class SmStudentScoreDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableId(value = "fid", type = IdType.AUTO)
    private Long fid;

    private Long scheduleId;

    @ApiModelProperty(value = "成绩")
    private Double score;

    private Long studentId;

    private Integer lateCount;

    private Integer leaveCount;

    private Integer truantCount;

    private Integer vacateCount;


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

    public Integer getLateCount() {
        return lateCount;
    }

    public void setLateCount(Integer lateCount) {
        this.lateCount = lateCount;
    }

    public Integer getLeaveCount() {
        return leaveCount;
    }

    public void setLeaveCount(Integer leaveCount) {
        this.leaveCount = leaveCount;
    }

    public Integer getTruantCount() {
        return truantCount;
    }

    public void setTruantCount(Integer truantCount) {
        this.truantCount = truantCount;
    }

    public Integer getVacateCount() {
        return vacateCount;
    }

    public void setVacateCount(Integer vacateCount) {
        this.vacateCount = vacateCount;
    }

    @Override
    public String toString() {
        return "SmStudentScore{" +
        "fid=" + fid +
        ", scheduleId=" + scheduleId +
        ", score=" + score +
        ", studentId=" + studentId +
        ", lateCount=" + lateCount +
        ", leaveCount=" + leaveCount +
        ", truantCount=" + truantCount +
        ", vacateCount=" + vacateCount +
        "}";
    }
}

package com.jeramtough.im.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
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
 * @since 2021-09-23
 */
@ApiModel(value="ImStudentTimeSheet对象", description="")
public class ImStudentTimeSheet implements Serializable {

    private static final long serialVersionUID=1L;

  /**
   * 主键
   */
    @TableId(value = "fid", type = IdType.AUTO)
    private Long fid;

  /**
   * 学生id
   */
    private Long studentId;

  /**
   * 出勤类型
   */
    private String attendanceType;

  /**
   * 早上出勤情况
   */
    private String morning;

  /**
   * 下午出勤情况
   */
    private String afternoon;

  /**
   * 晚上出勤情况
   */
    private String evening;

  /**
   * 沟通时间
   */
    private LocalDate date;

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

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getAttendanceType() {
        return attendanceType;
    }

    public void setAttendanceType(String attendanceType) {
        this.attendanceType = attendanceType;
    }

    public String getMorning() {
        return morning;
    }

    public void setMorning(String morning) {
        this.morning = morning;
    }

    public String getAfternoon() {
        return afternoon;
    }

    public void setAfternoon(String afternoon) {
        this.afternoon = afternoon;
    }

    public String getEvening() {
        return evening;
    }

    public void setEvening(String evening) {
        this.evening = evening;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
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
        return "ImStudentTimeSheet{" +
        "fid=" + fid +
        ", studentId=" + studentId +
        ", attendanceType=" + attendanceType +
        ", morning=" + morning +
        ", afternoon=" + afternoon +
        ", evening=" + evening +
        ", date=" + date +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}

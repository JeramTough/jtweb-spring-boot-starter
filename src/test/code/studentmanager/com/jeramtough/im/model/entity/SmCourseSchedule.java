package com.jeramtough.im.model.entity;

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
 * @since 2021-08-24
 */
@ApiModel(value="SmCourseSchedule对象", description="")
public class SmCourseSchedule implements Serializable {

    private static final long serialVersionUID=1L;

  /**
   * id
   */
    @TableId(value = "fid", type = IdType.AUTO)
    private Long fid;

  /**
   * 教师id
   */
    private Long classroomId;

  /**
   * 课程id
   */
    private Long courseId;

  /**
   * 教师Id
   */
    private Long teacherId;

  /**
   * 星期几
   */
    private Integer week;

  /**
   * 第几节课
   */
    private Integer timeIndex;

  /**
   * 班别id
   */
    private Long classId;


    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public Long getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Long classroomId) {
        this.classroomId = classroomId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public Integer getTimeIndex() {
        return timeIndex;
    }

    public void setTimeIndex(Integer timeIndex) {
        this.timeIndex = timeIndex;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "SmCourseSchedule{" +
        "fid=" + fid +
        ", classroomId=" + classroomId +
        ", courseId=" + courseId +
        ", teacherId=" + teacherId +
        ", week=" + week +
        ", timeIndex=" + timeIndex +
        ", classId=" + classId +
        "}";
    }
}

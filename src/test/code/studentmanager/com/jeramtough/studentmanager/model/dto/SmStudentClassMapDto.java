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
 * @since 2021-03-07
 */
@ApiModel(value="SmStudentClassMap对象", description="")
public class SmStudentClassMapDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableId(value = "fid", type = IdType.AUTO)
    private Long fid;

    private Long studentId;

    private Long classId;


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

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "SmStudentClassMap{" +
        "fid=" + fid +
        ", studentId=" + studentId +
        ", classId=" + classId +
        "}";
    }
}

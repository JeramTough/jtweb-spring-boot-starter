package com.jeramtough.im.model.entity;

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
@ApiModel(value="TempView对象", description="VIEW")
public class TempViewDto implements Serializable{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键id")
    private Long parentId;

    @ApiModelProperty(value = "家长名字")
    private String parentName;

    @ApiModelProperty(value = "关系")
    private String relation;

    @ApiModelProperty(value = "工作单位")
    private String organization;

    @ApiModelProperty(value = "联系电话")
    private String phoneNumber;

    @ApiModelProperty(value = "主键")
    private Long studentId;

    @ApiModelProperty(value = "真实名字")
    private String studentName;

    @ApiModelProperty(value = "性别")
    private String studentGender;

    @ApiModelProperty(value = "班级编号")
    private String studentNumber;

    @ApiModelProperty(value = "就读学校")
    private String school;

    @ApiModelProperty(value = "学号")
    private String number;

    @ApiModelProperty(value = "身份证号")
    private String studentIdentityNumber;


    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
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

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStudentIdentityNumber() {
        return studentIdentityNumber;
    }

    public void setStudentIdentityNumber(String studentIdentityNumber) {
        this.studentIdentityNumber = studentIdentityNumber;
    }

    @Override
    public String toString() {
        return "TempView{" +
        "parentId=" + parentId +
        ", parentName=" + parentName +
        ", relation=" + relation +
        ", organization=" + organization +
        ", phoneNumber=" + phoneNumber +
        ", studentId=" + studentId +
        ", studentName=" + studentName +
        ", studentGender=" + studentGender +
        ", studentNumber=" + studentNumber +
        ", school=" + school +
        ", number=" + number +
        ", studentIdentityNumber=" + studentIdentityNumber +
        "}";
    }
}

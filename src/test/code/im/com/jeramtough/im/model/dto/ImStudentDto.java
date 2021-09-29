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
@ApiModel(value="ImStudent对象", description="")
public class ImStudentDto implements Serializable{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "fid", type = IdType.AUTO)
    private Long fid;

    @ApiModelProperty(value = "操作者用户id")
    private Long operatorUid;

    @ApiModelProperty(value = "真实名字")
    private String realname;

    @ApiModelProperty(value = "性别")
    private String gender;

    @ApiModelProperty(value = "班级编号")
    private String classNumber;

    @ApiModelProperty(value = "就读学校")
    private String school;

    @ApiModelProperty(value = "入学日期")
    private LocalDate startDate;

    @ApiModelProperty(value = "学号")
    private String number;

    @ApiModelProperty(value = "身份证号")
    private String identityNumber;

    @ApiModelProperty(value = "家庭地址")
    private String homeAddress;

    @ApiModelProperty(value = "宿舍号码")
    private String dormitoryNumber;

    @ApiModelProperty(value = "校服尺寸")
    private String schoolUniformSize;

    @ApiModelProperty(value = "报读专业")
    private String thinkMajor;

    @ApiModelProperty(value = "报读班型")
    private String classType;

    @ApiModelProperty(value = "文理标志")
    private String studyTag;

    @ApiModelProperty(value = "联系方式")
    private String contactWay;

    @ApiModelProperty(value = "注意事项")
    private String remark;

    @ApiModelProperty(value = "缴费情况")
    private String paymentStatus;

    @ApiModelProperty(value = "头像路径")
    private String headimagePath;

    @ApiModelProperty(value = "性格分析")
    private String characterAnalysis;

    @ApiModelProperty(value = "省级编码")
    private String regionCode1;

    @ApiModelProperty(value = "市级编码")
    private String regionCode2;

    @ApiModelProperty(value = "区县编码")
    private String regionCode3;

    @ApiModelProperty(value = "数据创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "数据更新时间")
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

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getDormitoryNumber() {
        return dormitoryNumber;
    }

    public void setDormitoryNumber(String dormitoryNumber) {
        this.dormitoryNumber = dormitoryNumber;
    }

    public String getSchoolUniformSize() {
        return schoolUniformSize;
    }

    public void setSchoolUniformSize(String schoolUniformSize) {
        this.schoolUniformSize = schoolUniformSize;
    }

    public String getThinkMajor() {
        return thinkMajor;
    }

    public void setThinkMajor(String thinkMajor) {
        this.thinkMajor = thinkMajor;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String getStudyTag() {
        return studyTag;
    }

    public void setStudyTag(String studyTag) {
        this.studyTag = studyTag;
    }

    public String getContactWay() {
        return contactWay;
    }

    public void setContactWay(String contactWay) {
        this.contactWay = contactWay;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getHeadimagePath() {
        return headimagePath;
    }

    public void setHeadimagePath(String headimagePath) {
        this.headimagePath = headimagePath;
    }

    public String getCharacterAnalysis() {
        return characterAnalysis;
    }

    public void setCharacterAnalysis(String characterAnalysis) {
        this.characterAnalysis = characterAnalysis;
    }

    public String getRegionCode1() {
        return regionCode1;
    }

    public void setRegionCode1(String regionCode1) {
        this.regionCode1 = regionCode1;
    }

    public String getRegionCode2() {
        return regionCode2;
    }

    public void setRegionCode2(String regionCode2) {
        this.regionCode2 = regionCode2;
    }

    public String getRegionCode3() {
        return regionCode3;
    }

    public void setRegionCode3(String regionCode3) {
        this.regionCode3 = regionCode3;
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
        return "ImStudent{" +
        "fid=" + fid +
        ", operatorUid=" + operatorUid +
        ", realname=" + realname +
        ", gender=" + gender +
        ", classNumber=" + classNumber +
        ", school=" + school +
        ", startDate=" + startDate +
        ", number=" + number +
        ", identityNumber=" + identityNumber +
        ", homeAddress=" + homeAddress +
        ", dormitoryNumber=" + dormitoryNumber +
        ", schoolUniformSize=" + schoolUniformSize +
        ", thinkMajor=" + thinkMajor +
        ", classType=" + classType +
        ", studyTag=" + studyTag +
        ", contactWay=" + contactWay +
        ", remark=" + remark +
        ", paymentStatus=" + paymentStatus +
        ", headimagePath=" + headimagePath +
        ", characterAnalysis=" + characterAnalysis +
        ", regionCode1=" + regionCode1 +
        ", regionCode2=" + regionCode2 +
        ", regionCode3=" + regionCode3 +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}

package com.jeramtough.randl2.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author JeramTough
 * @since 2021-02-22
 */
@ApiModel(value="RandlPersonalInfo对象", description="")
public class RandlPersonalInfoDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableId(value = "fid", type = IdType.AUTO)
    private Long fid;

    private Long uid;

    private String gender;

    private Integer age;

    private LocalDate birthday;

    private String nickname;

    private String realname;

    private String homeAddress;

    private String school;

    private String company;

    private String job;

    private String contactWays;

    private String personalizedSignature;

    private String identityNumber;

    @ApiModelProperty(value = "民族")
    private String nationality;

    @ApiModelProperty(value = "是否已婚")
    @TableField("isMarried")
    private Integer isMarried;


    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getContactWays() {
        return contactWays;
    }

    public void setContactWays(String contactWays) {
        this.contactWays = contactWays;
    }

    public String getPersonalizedSignature() {
        return personalizedSignature;
    }

    public void setPersonalizedSignature(String personalizedSignature) {
        this.personalizedSignature = personalizedSignature;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Integer getIsMarried() {
        return isMarried;
    }

    public void setIsMarried(Integer isMarried) {
        this.isMarried = isMarried;
    }

    @Override
    public String toString() {
        return "RandlPersonalInfo{" +
        "fid=" + fid +
        ", uid=" + uid +
        ", gender=" + gender +
        ", age=" + age +
        ", birthday=" + birthday +
        ", nickname=" + nickname +
        ", realname=" + realname +
        ", homeAddress=" + homeAddress +
        ", school=" + school +
        ", company=" + company +
        ", job=" + job +
        ", contactWays=" + contactWays +
        ", personalizedSignature=" + personalizedSignature +
        ", identityNumber=" + identityNumber +
        ", nationality=" + nationality +
        ", isMarried=" + isMarried +
        "}";
    }
}

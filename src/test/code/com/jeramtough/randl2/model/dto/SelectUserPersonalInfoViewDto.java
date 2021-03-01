package com.jeramtough.randl2.model.entity;

import java.time.LocalDate;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * VIEW
 * </p>
 *
 * @author JeramTough
 * @since 2021-02-22
 */
@ApiModel(value="SelectUserPersonalInfoView对象", description="VIEW")
public class SelectUserPersonalInfoViewDto implements Serializable{

    private static final long serialVersionUID=1L;

    private Long fid;

    @ApiModelProperty(value = "用户id主键")
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

    @ApiModelProperty(value = "系统账号")
    private String account;

    @ApiModelProperty(value = "手机号码")
    private String phoneNumber;

    @ApiModelProperty(value = "邮箱地址")
    private String emailAddress;

    @ApiModelProperty(value = "头像id")
    private Long surfaceImageId;

    @ApiModelProperty(value = "用户来源渠道 0:管理员添加 | 1:用户注册 | 2:数据库直接添加")
    private Integer channel;

    @ApiModelProperty(value = "账号状态 0:禁用 | 1:启用 | 2:标记删除")
    private Integer accountStatus;


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

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Long getSurfaceImageId() {
        return surfaceImageId;
    }

    public void setSurfaceImageId(Long surfaceImageId) {
        this.surfaceImageId = surfaceImageId;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public Integer getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(Integer accountStatus) {
        this.accountStatus = accountStatus;
    }

    @Override
    public String toString() {
        return "SelectUserPersonalInfoView{" +
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
        ", account=" + account +
        ", phoneNumber=" + phoneNumber +
        ", emailAddress=" + emailAddress +
        ", surfaceImageId=" + surfaceImageId +
        ", channel=" + channel +
        ", accountStatus=" + accountStatus +
        "}";
    }
}

package com.icloudmap.newerp.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 员工表
 * </p>
 *
 * @author WeiBoWen
 * @since 2021-11-24
 */
@TableName("BS_STAFF")
@ApiModel(value = "BsStaff对象", description = "员工表")
public class BsStaff implements Serializable{

private static final long serialVersionUID=1L;

        @ApiModelProperty(value = "用户编号")
                @TableId("USERID")
                private String uSERID;

        @ApiModelProperty(value = "出生日期")
    @TableField("BORTH")
        private String bORTH;

        @ApiModelProperty(value = "年龄")
    @TableField("AGE")
        private Long aGE;

        @ApiModelProperty(value = "民族")
    @TableField("NATION")
        private String nATION;

        @ApiModelProperty(value = "婚姻状况")
    @TableField("MARRIAGE")
        private String mARRIAGE;

        @ApiModelProperty(value = "籍贯")
    @TableField("NATIVEPLACE")
        private String nATIVEPLACE;

        @ApiModelProperty(value = "身份证号")
    @TableField("ID_NO")
        private String idNo;

        @ApiModelProperty(value = "家庭地址")
    @TableField("HOME_ADDRESS")
        private String homeAddress;

        @ApiModelProperty(value = "家庭电话")
    @TableField("HOME_TELEPHONE")
        private String homeTelephone;

        @ApiModelProperty(value = "现在住址")
    @TableField("NOW_ADDRESS")
        private String nowAddress;

        @ApiModelProperty(value = "住址电话")
    @TableField("NOW_TELEPHONE")
        private String nowTelephone;

        @ApiModelProperty(value = "政治面貌")
    @TableField("POLITICS_STATUS")
        private String politicsStatus;

        @ApiModelProperty(value = "学位")
    @TableField("DEGREE")
        private String dEGREE;

        @ApiModelProperty(value = "毕业学校")
    @TableField("GRADUATED_FROM")
        private String graduatedFrom;

        @ApiModelProperty(value = "专业")
    @TableField("MAJOR")
        private String mAJOR;

        @ApiModelProperty(value = "报到日期")
    @TableField("CHECK_IN")
        private String checkIn;

        @ApiModelProperty(value = "合同有效期")
    @TableField("CONTRACT_LIFE")
        private String contractLife;

        @ApiModelProperty(value = "参加工作日期")
    @TableField("WORK_DATE")
        private String workDate;

        @ApiModelProperty(value = "招聘途径")
    @TableField("RECRUITMENT_METHODS")
        private String recruitmentMethods;

        @ApiModelProperty(value = "用工形式")
    @TableField("WORK_TYPE")
        private String workType;

        @ApiModelProperty(value = "行政级别")
    @TableField("GRADE")
        private String gRADE;

        @ApiModelProperty(value = "职称")
    @TableField("HOLDEROFANOFFICE")
        private String hOLDEROFANOFFICE;

        @ApiModelProperty(value = "职务")
    @TableField("DUTIES")
        private String dUTIES;

        @ApiModelProperty(value = "离职时间")
    @TableField("LEAVE_TIME")
        private String leaveTime;

        @ApiModelProperty(value = "离职理由")
    @TableField("LEAVE_REASON")
        private String leaveReason;

        @ApiModelProperty(value = "员工状态")
    @TableField("STAFF_STATUS")
        private String staffStatus;

        @ApiModelProperty(value = "开户行")
    @TableField("BANK_NAME")
        private String bankName;

        @ApiModelProperty(value = "银行账号")
    @TableField("BANK_CARD")
        private String bankCard;

        @ApiModelProperty(value = "开户行地址")
    @TableField("BANK_ADDRESS")
        private String bankAddress;

        @ApiModelProperty(value = "头像")
    @TableField("HEAD_PORTRAIT")
        private String headPortrait;

        @ApiModelProperty(value = "学历")
    @TableField("EDUCATION")
        private String eDUCATION;

        @ApiModelProperty(value = "毕业时间")
    @TableField("GRADUATION_DATE")
        private String graduationDate;

        @ApiModelProperty(value = "人员自编号")
    @TableField("STAFF_NO")
        private String staffNo;

        @ApiModelProperty(value = "出生地")
    @TableField("BIRTHPLACE")
        private String bIRTHPLACE;

        @ApiModelProperty(value = "正式员工，1为正式，0为临时")
    @TableField("REGULAR_EMPLOYEE")
        private String regularEmployee;


    public String getuSERID(){
            return uSERID;
            }

        public void setuSERID(String uSERID) {
            this.uSERID = uSERID;
            }

    public String getbORTH(){
            return bORTH;
            }

        public void setbORTH(String bORTH) {
            this.bORTH = bORTH;
            }

    public Long getaGE(){
            return aGE;
            }

        public void setaGE(Long aGE) {
            this.aGE = aGE;
            }

    public String getnATION(){
            return nATION;
            }

        public void setnATION(String nATION) {
            this.nATION = nATION;
            }

    public String getmARRIAGE(){
            return mARRIAGE;
            }

        public void setmARRIAGE(String mARRIAGE) {
            this.mARRIAGE = mARRIAGE;
            }

    public String getnATIVEPLACE(){
            return nATIVEPLACE;
            }

        public void setnATIVEPLACE(String nATIVEPLACE) {
            this.nATIVEPLACE = nATIVEPLACE;
            }

    public String getIdNo(){
            return idNo;
            }

        public void setIdNo(String idNo) {
            this.idNo = idNo;
            }

    public String getHomeAddress(){
            return homeAddress;
            }

        public void setHomeAddress(String homeAddress) {
            this.homeAddress = homeAddress;
            }

    public String getHomeTelephone(){
            return homeTelephone;
            }

        public void setHomeTelephone(String homeTelephone) {
            this.homeTelephone = homeTelephone;
            }

    public String getNowAddress(){
            return nowAddress;
            }

        public void setNowAddress(String nowAddress) {
            this.nowAddress = nowAddress;
            }

    public String getNowTelephone(){
            return nowTelephone;
            }

        public void setNowTelephone(String nowTelephone) {
            this.nowTelephone = nowTelephone;
            }

    public String getPoliticsStatus(){
            return politicsStatus;
            }

        public void setPoliticsStatus(String politicsStatus) {
            this.politicsStatus = politicsStatus;
            }

    public String getdEGREE(){
            return dEGREE;
            }

        public void setdEGREE(String dEGREE) {
            this.dEGREE = dEGREE;
            }

    public String getGraduatedFrom(){
            return graduatedFrom;
            }

        public void setGraduatedFrom(String graduatedFrom) {
            this.graduatedFrom = graduatedFrom;
            }

    public String getmAJOR(){
            return mAJOR;
            }

        public void setmAJOR(String mAJOR) {
            this.mAJOR = mAJOR;
            }

    public String getCheckIn(){
            return checkIn;
            }

        public void setCheckIn(String checkIn) {
            this.checkIn = checkIn;
            }

    public String getContractLife(){
            return contractLife;
            }

        public void setContractLife(String contractLife) {
            this.contractLife = contractLife;
            }

    public String getWorkDate(){
            return workDate;
            }

        public void setWorkDate(String workDate) {
            this.workDate = workDate;
            }

    public String getRecruitmentMethods(){
            return recruitmentMethods;
            }

        public void setRecruitmentMethods(String recruitmentMethods) {
            this.recruitmentMethods = recruitmentMethods;
            }

    public String getWorkType(){
            return workType;
            }

        public void setWorkType(String workType) {
            this.workType = workType;
            }

    public String getgRADE(){
            return gRADE;
            }

        public void setgRADE(String gRADE) {
            this.gRADE = gRADE;
            }

    public String gethOLDEROFANOFFICE(){
            return hOLDEROFANOFFICE;
            }

        public void sethOLDEROFANOFFICE(String hOLDEROFANOFFICE) {
            this.hOLDEROFANOFFICE = hOLDEROFANOFFICE;
            }

    public String getdUTIES(){
            return dUTIES;
            }

        public void setdUTIES(String dUTIES) {
            this.dUTIES = dUTIES;
            }

    public String getLeaveTime(){
            return leaveTime;
            }

        public void setLeaveTime(String leaveTime) {
            this.leaveTime = leaveTime;
            }

    public String getLeaveReason(){
            return leaveReason;
            }

        public void setLeaveReason(String leaveReason) {
            this.leaveReason = leaveReason;
            }

    public String getStaffStatus(){
            return staffStatus;
            }

        public void setStaffStatus(String staffStatus) {
            this.staffStatus = staffStatus;
            }

    public String getBankName(){
            return bankName;
            }

        public void setBankName(String bankName) {
            this.bankName = bankName;
            }

    public String getBankCard(){
            return bankCard;
            }

        public void setBankCard(String bankCard) {
            this.bankCard = bankCard;
            }

    public String getBankAddress(){
            return bankAddress;
            }

        public void setBankAddress(String bankAddress) {
            this.bankAddress = bankAddress;
            }

    public String getHeadPortrait(){
            return headPortrait;
            }

        public void setHeadPortrait(String headPortrait) {
            this.headPortrait = headPortrait;
            }

    public String geteDUCATION(){
            return eDUCATION;
            }

        public void seteDUCATION(String eDUCATION) {
            this.eDUCATION = eDUCATION;
            }

    public String getGraduationDate(){
            return graduationDate;
            }

        public void setGraduationDate(String graduationDate) {
            this.graduationDate = graduationDate;
            }

    public String getStaffNo(){
            return staffNo;
            }

        public void setStaffNo(String staffNo) {
            this.staffNo = staffNo;
            }

    public String getbIRTHPLACE(){
            return bIRTHPLACE;
            }

        public void setbIRTHPLACE(String bIRTHPLACE) {
            this.bIRTHPLACE = bIRTHPLACE;
            }

    public String getRegularEmployee(){
            return regularEmployee;
            }

        public void setRegularEmployee(String regularEmployee) {
            this.regularEmployee = regularEmployee;
            }
    
@Override
public String toString() {
        return "BsStaff{" +
                "uSERID=" + uSERID +
                ", bORTH=" + bORTH +
                ", aGE=" + aGE +
                ", nATION=" + nATION +
                ", mARRIAGE=" + mARRIAGE +
                ", nATIVEPLACE=" + nATIVEPLACE +
                ", idNo=" + idNo +
                ", homeAddress=" + homeAddress +
                ", homeTelephone=" + homeTelephone +
                ", nowAddress=" + nowAddress +
                ", nowTelephone=" + nowTelephone +
                ", politicsStatus=" + politicsStatus +
                ", dEGREE=" + dEGREE +
                ", graduatedFrom=" + graduatedFrom +
                ", mAJOR=" + mAJOR +
                ", checkIn=" + checkIn +
                ", contractLife=" + contractLife +
                ", workDate=" + workDate +
                ", recruitmentMethods=" + recruitmentMethods +
                ", workType=" + workType +
                ", gRADE=" + gRADE +
                ", hOLDEROFANOFFICE=" + hOLDEROFANOFFICE +
                ", dUTIES=" + dUTIES +
                ", leaveTime=" + leaveTime +
                ", leaveReason=" + leaveReason +
                ", staffStatus=" + staffStatus +
                ", bankName=" + bankName +
                ", bankCard=" + bankCard +
                ", bankAddress=" + bankAddress +
                ", headPortrait=" + headPortrait +
                ", eDUCATION=" + eDUCATION +
                ", graduationDate=" + graduationDate +
                ", staffNo=" + staffNo +
                ", bIRTHPLACE=" + bIRTHPLACE +
                ", regularEmployee=" + regularEmployee +
        "}";
        }
        }

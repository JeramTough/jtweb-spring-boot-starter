package com.icloudmap.newerp.model.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
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
 * @author WeiBoWen
 * @since 2021-11-24
 */
@TableName("WX_APPROVAL")
@ApiModel(value = "WxApproval对象", description = "")
public class WxApproval implements Serializable{

private static final long serialVersionUID=1L;

    @TableField("SPNAME")
        private String sPNAME;

    @TableField("APPLY_NAME")
        private String applyName;

    @TableField("APPLY_ORG")
        private String applyOrg;

    @TableField("APPROVAL_NAME")
        private String approvalName;

    @TableField("NOTIFY_NAME")
        private String notifyName;

        @ApiModelProperty(value = "审批状态：1审批中；2 已通过；3已驳回；4已取消；6通过后撤销；10已支付")
    @TableField("SP_STATUS")
        private BigDecimal spStatus;

    @TableField("SP_STATUSV")
        private String spStatusv;

        @ApiModelProperty(value = "审批号")
                @TableId("SP_NUM")
                private BigDecimal spNum;

    @TableField("APPLY_TIME")
        private BigDecimal applyTime;

    @TableField("APPLY_TIMEV")
        private String applyTimev;

    @TableField("APPLY_USER_ID")
        private String applyUserId;

        @ApiModelProperty(value = "请假时间单位：0半天；1小时")
    @TableField("TIMEUNIT")
        private BigDecimal tIMEUNIT;

    @TableField("TIMEUNITV")
        private String tIMEUNITV;

        @ApiModelProperty(value = "请假类型：1年假；2事假；3病假；4调休假；5婚假；6产假；7陪产假；8其他")
    @TableField("LEAVE_TYPE")
        private BigDecimal leaveType;

    @TableField("LEAVE_TYPEV")
        private String leaveTypev;

    @TableField("START_TIME")
        private BigDecimal startTime;

    @TableField("START_TIMEV")
        private String startTimev;

    @TableField("END_TIME")
        private BigDecimal endTime;

    @TableField("END_TIMEV")
        private String endTimev;

    @TableField("DURATION")
        private BigDecimal dURATION;

    @TableField("REASON")
        private String rEASON;

    @TableField("SOURCE")
        private String sOURCE;

    @TableField("DEST")
        private String dEST;

    @TableField("DURATIONV")
        private String dURATIONV;


    public String getsPNAME(){
            return sPNAME;
            }

        public void setsPNAME(String sPNAME) {
            this.sPNAME = sPNAME;
            }

    public String getApplyName(){
            return applyName;
            }

        public void setApplyName(String applyName) {
            this.applyName = applyName;
            }

    public String getApplyOrg(){
            return applyOrg;
            }

        public void setApplyOrg(String applyOrg) {
            this.applyOrg = applyOrg;
            }

    public String getApprovalName(){
            return approvalName;
            }

        public void setApprovalName(String approvalName) {
            this.approvalName = approvalName;
            }

    public String getNotifyName(){
            return notifyName;
            }

        public void setNotifyName(String notifyName) {
            this.notifyName = notifyName;
            }

    public BigDecimal getSpStatus(){
            return spStatus;
            }

        public void setSpStatus(BigDecimal spStatus) {
            this.spStatus = spStatus;
            }

    public String getSpStatusv(){
            return spStatusv;
            }

        public void setSpStatusv(String spStatusv) {
            this.spStatusv = spStatusv;
            }

    public BigDecimal getSpNum(){
            return spNum;
            }

        public void setSpNum(BigDecimal spNum) {
            this.spNum = spNum;
            }

    public BigDecimal getApplyTime(){
            return applyTime;
            }

        public void setApplyTime(BigDecimal applyTime) {
            this.applyTime = applyTime;
            }

    public String getApplyTimev(){
            return applyTimev;
            }

        public void setApplyTimev(String applyTimev) {
            this.applyTimev = applyTimev;
            }

    public String getApplyUserId(){
            return applyUserId;
            }

        public void setApplyUserId(String applyUserId) {
            this.applyUserId = applyUserId;
            }

    public BigDecimal gettIMEUNIT(){
            return tIMEUNIT;
            }

        public void settIMEUNIT(BigDecimal tIMEUNIT) {
            this.tIMEUNIT = tIMEUNIT;
            }

    public String gettIMEUNITV(){
            return tIMEUNITV;
            }

        public void settIMEUNITV(String tIMEUNITV) {
            this.tIMEUNITV = tIMEUNITV;
            }

    public BigDecimal getLeaveType(){
            return leaveType;
            }

        public void setLeaveType(BigDecimal leaveType) {
            this.leaveType = leaveType;
            }

    public String getLeaveTypev(){
            return leaveTypev;
            }

        public void setLeaveTypev(String leaveTypev) {
            this.leaveTypev = leaveTypev;
            }

    public BigDecimal getStartTime(){
            return startTime;
            }

        public void setStartTime(BigDecimal startTime) {
            this.startTime = startTime;
            }

    public String getStartTimev(){
            return startTimev;
            }

        public void setStartTimev(String startTimev) {
            this.startTimev = startTimev;
            }

    public BigDecimal getEndTime(){
            return endTime;
            }

        public void setEndTime(BigDecimal endTime) {
            this.endTime = endTime;
            }

    public String getEndTimev(){
            return endTimev;
            }

        public void setEndTimev(String endTimev) {
            this.endTimev = endTimev;
            }

    public BigDecimal getdURATION(){
            return dURATION;
            }

        public void setdURATION(BigDecimal dURATION) {
            this.dURATION = dURATION;
            }

    public String getrEASON(){
            return rEASON;
            }

        public void setrEASON(String rEASON) {
            this.rEASON = rEASON;
            }

    public String getsOURCE(){
            return sOURCE;
            }

        public void setsOURCE(String sOURCE) {
            this.sOURCE = sOURCE;
            }

    public String getdEST(){
            return dEST;
            }

        public void setdEST(String dEST) {
            this.dEST = dEST;
            }

    public String getdURATIONV(){
            return dURATIONV;
            }

        public void setdURATIONV(String dURATIONV) {
            this.dURATIONV = dURATIONV;
            }
    
@Override
public String toString() {
        return "WxApproval{" +
                "sPNAME=" + sPNAME +
                ", applyName=" + applyName +
                ", applyOrg=" + applyOrg +
                ", approvalName=" + approvalName +
                ", notifyName=" + notifyName +
                ", spStatus=" + spStatus +
                ", spStatusv=" + spStatusv +
                ", spNum=" + spNum +
                ", applyTime=" + applyTime +
                ", applyTimev=" + applyTimev +
                ", applyUserId=" + applyUserId +
                ", tIMEUNIT=" + tIMEUNIT +
                ", tIMEUNITV=" + tIMEUNITV +
                ", leaveType=" + leaveType +
                ", leaveTypev=" + leaveTypev +
                ", startTime=" + startTime +
                ", startTimev=" + startTimev +
                ", endTime=" + endTime +
                ", endTimev=" + endTimev +
                ", dURATION=" + dURATION +
                ", rEASON=" + rEASON +
                ", sOURCE=" + sOURCE +
                ", dEST=" + dEST +
                ", dURATIONV=" + dURATIONV +
        "}";
        }
        }

package com.icloudmap.newerp.model.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("YW_V_审批数据")
@ApiModel(value="YwV审批数据对象", description="")
public class YwV审批数据Dto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableField("APPLY_NAME")
    private String applyName;

    @TableField("APPLY_ORG")
    private String applyOrg;

    @TableField("SPNAME")
    private String sPNAME;

    @TableField("SP_STATUSV")
    private String spStatusv;

    @TableField("LEAVE_TYPEV")
    private String leaveTypev;

    @TableField("START_TIMEV")
    private String startTimev;

    @TableField("END_TIMEV")
    private String endTimev;

    @TableField("REASON")
    private String rEASON;

    @TableField("DURATIONV")
    private String dURATIONV;

    @TableField("SOURCE")
    private String sOURCE;

    @TableField("DEST")
    private String dEST;

    @TableField("SP_STATUS")
    private BigDecimal spStatus;


    public String getApplyName() {
        return applyName;
    }

    public void setApplyName(String applyName) {
        this.applyName = applyName;
    }

    public String getApplyOrg() {
        return applyOrg;
    }

    public void setApplyOrg(String applyOrg) {
        this.applyOrg = applyOrg;
    }

    public String getsPNAME() {
        return sPNAME;
    }

    public void setsPNAME(String sPNAME) {
        this.sPNAME = sPNAME;
    }

    public String getSpStatusv() {
        return spStatusv;
    }

    public void setSpStatusv(String spStatusv) {
        this.spStatusv = spStatusv;
    }

    public String getLeaveTypev() {
        return leaveTypev;
    }

    public void setLeaveTypev(String leaveTypev) {
        this.leaveTypev = leaveTypev;
    }

    public String getStartTimev() {
        return startTimev;
    }

    public void setStartTimev(String startTimev) {
        this.startTimev = startTimev;
    }

    public String getEndTimev() {
        return endTimev;
    }

    public void setEndTimev(String endTimev) {
        this.endTimev = endTimev;
    }

    public String getrEASON() {
        return rEASON;
    }

    public void setrEASON(String rEASON) {
        this.rEASON = rEASON;
    }

    public String getdURATIONV() {
        return dURATIONV;
    }

    public void setdURATIONV(String dURATIONV) {
        this.dURATIONV = dURATIONV;
    }

    public String getsOURCE() {
        return sOURCE;
    }

    public void setsOURCE(String sOURCE) {
        this.sOURCE = sOURCE;
    }

    public String getdEST() {
        return dEST;
    }

    public void setdEST(String dEST) {
        this.dEST = dEST;
    }

    public BigDecimal getSpStatus() {
        return spStatus;
    }

    public void setSpStatus(BigDecimal spStatus) {
        this.spStatus = spStatus;
    }

    @Override
    public String toString() {
        return "YwV审批数据{" +
        "applyName=" + applyName +
        ", applyOrg=" + applyOrg +
        ", sPNAME=" + sPNAME +
        ", spStatusv=" + spStatusv +
        ", leaveTypev=" + leaveTypev +
        ", startTimev=" + startTimev +
        ", endTimev=" + endTimev +
        ", rEASON=" + rEASON +
        ", dURATIONV=" + dURATIONV +
        ", sOURCE=" + sOURCE +
        ", dEST=" + dEST +
        ", spStatus=" + spStatus +
        "}";
    }
}

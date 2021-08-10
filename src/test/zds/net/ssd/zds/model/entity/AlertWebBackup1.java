package net.ssd.zds.model.entity;

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
 * @since 2021-04-25
 */
@ApiModel(value="AlertWebBackup1对象", description="")
public class AlertWebBackup1 implements Serializable {

    private static final long serialVersionUID=1L;

    @TableField("AlertId")
    private String alertid;

    @TableField("AlertPID")
    private String alertpid;

    @TableField("Province")
    private String province;

    @TableField("City")
    private String city;

    @TableField("StationName")
    private String stationname;

    @TableField("StationId")
    private String stationid;

    @TableField("Signaltype")
    private String signaltype;

    @TableField("Signallevel")
    private String signallevel;

    @TableField("Issuetime")
    private String issuetime;

    @TableField("Issuecontent")
    private String issuecontent;

    @TableField("Recoverychannel")
    private String recoverychannel;

    @TableField("Dstandardtune")
    private String dstandardtune;

    @TableField("Relievetime")
    private String relievetime;

    @TableField("Distinctionlevel")
    private String distinctionlevel;

    @TableField("Dffectvaluate")
    private String dffectvaluate;

    @TableField("Docietybenefit")
    private String docietybenefit;

    @TableField("TNUMBER")
    private String tnumber;

    @TableField("Underwriter")
    private String underwriter;

    @TableField("IfRelieve")
    private Integer ifrelieve;

    @TableField("relieveId")
    private String relieveid;

    @TableField("underWrite")
    private String underwrite;


    public String getAlertid() {
        return alertid;
    }

    public void setAlertid(String alertid) {
        this.alertid = alertid;
    }

    public String getAlertpid() {
        return alertpid;
    }

    public void setAlertpid(String alertpid) {
        this.alertpid = alertpid;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStationname() {
        return stationname;
    }

    public void setStationname(String stationname) {
        this.stationname = stationname;
    }

    public String getStationid() {
        return stationid;
    }

    public void setStationid(String stationid) {
        this.stationid = stationid;
    }

    public String getSignaltype() {
        return signaltype;
    }

    public void setSignaltype(String signaltype) {
        this.signaltype = signaltype;
    }

    public String getSignallevel() {
        return signallevel;
    }

    public void setSignallevel(String signallevel) {
        this.signallevel = signallevel;
    }

    public String getIssuetime() {
        return issuetime;
    }

    public void setIssuetime(String issuetime) {
        this.issuetime = issuetime;
    }

    public String getIssuecontent() {
        return issuecontent;
    }

    public void setIssuecontent(String issuecontent) {
        this.issuecontent = issuecontent;
    }

    public String getRecoverychannel() {
        return recoverychannel;
    }

    public void setRecoverychannel(String recoverychannel) {
        this.recoverychannel = recoverychannel;
    }

    public String getDstandardtune() {
        return dstandardtune;
    }

    public void setDstandardtune(String dstandardtune) {
        this.dstandardtune = dstandardtune;
    }

    public String getRelievetime() {
        return relievetime;
    }

    public void setRelievetime(String relievetime) {
        this.relievetime = relievetime;
    }

    public String getDistinctionlevel() {
        return distinctionlevel;
    }

    public void setDistinctionlevel(String distinctionlevel) {
        this.distinctionlevel = distinctionlevel;
    }

    public String getDffectvaluate() {
        return dffectvaluate;
    }

    public void setDffectvaluate(String dffectvaluate) {
        this.dffectvaluate = dffectvaluate;
    }

    public String getDocietybenefit() {
        return docietybenefit;
    }

    public void setDocietybenefit(String docietybenefit) {
        this.docietybenefit = docietybenefit;
    }

    public String getTnumber() {
        return tnumber;
    }

    public void setTnumber(String tnumber) {
        this.tnumber = tnumber;
    }

    public String getUnderwriter() {
        return underwriter;
    }

    public void setUnderwriter(String underwriter) {
        this.underwriter = underwriter;
    }

    public Integer getIfrelieve() {
        return ifrelieve;
    }

    public void setIfrelieve(Integer ifrelieve) {
        this.ifrelieve = ifrelieve;
    }

    public String getRelieveid() {
        return relieveid;
    }

    public void setRelieveid(String relieveid) {
        this.relieveid = relieveid;
    }

    public String getUnderwrite() {
        return underwrite;
    }

    public void setUnderwrite(String underwrite) {
        this.underwrite = underwrite;
    }

    @Override
    public String toString() {
        return "AlertWebBackup1{" +
        "alertid=" + alertid +
        ", alertpid=" + alertpid +
        ", province=" + province +
        ", city=" + city +
        ", stationname=" + stationname +
        ", stationid=" + stationid +
        ", signaltype=" + signaltype +
        ", signallevel=" + signallevel +
        ", issuetime=" + issuetime +
        ", issuecontent=" + issuecontent +
        ", recoverychannel=" + recoverychannel +
        ", dstandardtune=" + dstandardtune +
        ", relievetime=" + relievetime +
        ", distinctionlevel=" + distinctionlevel +
        ", dffectvaluate=" + dffectvaluate +
        ", docietybenefit=" + docietybenefit +
        ", tnumber=" + tnumber +
        ", underwriter=" + underwriter +
        ", ifrelieve=" + ifrelieve +
        ", relieveid=" + relieveid +
        ", underwrite=" + underwrite +
        "}";
    }
}

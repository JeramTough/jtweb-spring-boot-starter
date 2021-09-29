package net.ssd.soa.model.entity;

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
 * @since 2021-09-08
 */
@ApiModel(value="AlertWeb对象", description="")
public class AlertWeb implements Serializable {

    private static final long serialVersionUID=1L;

    @TableField("AlertId")
    private String alertId;

    @TableField("AlertPID")
    private String alertPID;

    @TableField("Province")
    private String province;

    @TableField("City")
    private String city;

    @TableField("StationName")
    private String stationName;

    @TableField("StationId")
    private String stationId;

    @TableField("Signaltype")
    private String signaltype;

    @TableField("Signallevel")
    private String signallevel;

    @TableField("Issuetime")
    private Long issuetime;

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
    private String tNUMBER;

    @TableField("Underwriter")
    private String underwriter;

    @TableField("IfRelieve")
    private Integer ifRelieve;

    @TableField("relieveId")
    private String relieveId;

    @TableField("underWrite")
    private String underWrite;

    private Long id;


    public String getAlertId() {
        return alertId;
    }

    public void setAlertId(String alertId) {
        this.alertId = alertId;
    }

    public String getAlertPID() {
        return alertPID;
    }

    public void setAlertPID(String alertPID) {
        this.alertPID = alertPID;
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

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
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

    public Long getIssuetime() {
        return issuetime;
    }

    public void setIssuetime(Long issuetime) {
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

    public String gettNUMBER() {
        return tNUMBER;
    }

    public void settNUMBER(String tNUMBER) {
        this.tNUMBER = tNUMBER;
    }

    public String getUnderwriter() {
        return underwriter;
    }

    public void setUnderwriter(String underwriter) {
        this.underwriter = underwriter;
    }

    public Integer getIfRelieve() {
        return ifRelieve;
    }

    public void setIfRelieve(Integer ifRelieve) {
        this.ifRelieve = ifRelieve;
    }

    public String getRelieveId() {
        return relieveId;
    }

    public void setRelieveId(String relieveId) {
        this.relieveId = relieveId;
    }

    public String getUnderWrite() {
        return underWrite;
    }

    public void setUnderWrite(String underWrite) {
        this.underWrite = underWrite;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AlertWeb{" +
        "alertId=" + alertId +
        ", alertPID=" + alertPID +
        ", province=" + province +
        ", city=" + city +
        ", stationName=" + stationName +
        ", stationId=" + stationId +
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
        ", tNUMBER=" + tNUMBER +
        ", underwriter=" + underwriter +
        ", ifRelieve=" + ifRelieve +
        ", relieveId=" + relieveId +
        ", underWrite=" + underWrite +
        ", id=" + id +
        "}";
    }
}

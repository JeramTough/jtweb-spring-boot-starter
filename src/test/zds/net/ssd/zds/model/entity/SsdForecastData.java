package net.ssd.zds.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
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
@TableName("Ssd_ForeCast_Data")
@ApiModel(value="SsdForecastData对象", description="")
public class SsdForecastData implements Serializable {

    private static final long serialVersionUID=1L;

    @TableField("nID")
    private Long nid;

    @TableField("vcAreaCode")
    private String vcareacode;

    @TableField("vcAreaName")
    private String vcareaname;

    @TableField("vcFaBaoTime")
    private String vcfabaotime;

    @TableField("vcQiBaoDate")
    private String vcqibaodate;

    @TableField("vcForCastSlip")
    private String vcforcastslip;

    @TableField("nTemperature")
    private Double ntemperature;

    @TableField("nHumidity")
    private Double nhumidity;

    @TableField("nWindDirection")
    private Double nwinddirection;

    @TableField("nWindSpeed")
    private Double nwindspeed;

    @TableField("nAirPressure")
    private Double nairpressure;

    @TableField("nRainMount")
    private Double nrainmount;

    @TableField("nCloudMount")
    private Double ncloudmount;

    @TableField("nCloudLow")
    private Double ncloudlow;

    @TableField("vcWeather")
    private String vcweather;

    @TableField("nVisibility")
    private Double nvisibility;

    @TableField("nMaxTemp")
    private Double nmaxtemp;

    @TableField("nMinTemp")
    private Double nmintemp;

    @TableField("nMaxHumidity")
    private Double nmaxhumidity;

    @TableField("nMinHumidity")
    private Double nminhumidity;

    @TableField("nRain24")
    private Double nrain24;

    @TableField("nRain12")
    private Double nrain12;

    @TableField("nCloudMount12")
    private Double ncloudmount12;

    @TableField("nCloudLow12")
    private Double ncloudlow12;

    @TableField("vcWeather12")
    private String vcweather12;

    @TableField("nWindDirect12")
    private Double nwinddirect12;

    @TableField("nWindSpeed12")
    private Double nwindspeed12;

    @TableField("vcAreaProv")
    private String vcareaprov;

    @TableField("vcAreaCity")
    private String vcareacity;

    @TableField("vcForcastTime")
    private String vcforcasttime;

    @TableField("dtSubmitTime")
    private LocalDateTime dtsubmittime;

    @TableField("vcUpdateTime")
    private String vcupdatetime;

    @TableField("nSource")
    private Integer nsource;

    @TableField("vcExp1")
    private String vcexp1;

    @TableField("vcExp2")
    private String vcexp2;

    @TableField("vcExp3")
    private String vcexp3;


    public Long getNid() {
        return nid;
    }

    public void setNid(Long nid) {
        this.nid = nid;
    }

    public String getVcareacode() {
        return vcareacode;
    }

    public void setVcareacode(String vcareacode) {
        this.vcareacode = vcareacode;
    }

    public String getVcareaname() {
        return vcareaname;
    }

    public void setVcareaname(String vcareaname) {
        this.vcareaname = vcareaname;
    }

    public String getVcfabaotime() {
        return vcfabaotime;
    }

    public void setVcfabaotime(String vcfabaotime) {
        this.vcfabaotime = vcfabaotime;
    }

    public String getVcqibaodate() {
        return vcqibaodate;
    }

    public void setVcqibaodate(String vcqibaodate) {
        this.vcqibaodate = vcqibaodate;
    }

    public String getVcforcastslip() {
        return vcforcastslip;
    }

    public void setVcforcastslip(String vcforcastslip) {
        this.vcforcastslip = vcforcastslip;
    }

    public Double getNtemperature() {
        return ntemperature;
    }

    public void setNtemperature(Double ntemperature) {
        this.ntemperature = ntemperature;
    }

    public Double getNhumidity() {
        return nhumidity;
    }

    public void setNhumidity(Double nhumidity) {
        this.nhumidity = nhumidity;
    }

    public Double getNwinddirection() {
        return nwinddirection;
    }

    public void setNwinddirection(Double nwinddirection) {
        this.nwinddirection = nwinddirection;
    }

    public Double getNwindspeed() {
        return nwindspeed;
    }

    public void setNwindspeed(Double nwindspeed) {
        this.nwindspeed = nwindspeed;
    }

    public Double getNairpressure() {
        return nairpressure;
    }

    public void setNairpressure(Double nairpressure) {
        this.nairpressure = nairpressure;
    }

    public Double getNrainmount() {
        return nrainmount;
    }

    public void setNrainmount(Double nrainmount) {
        this.nrainmount = nrainmount;
    }

    public Double getNcloudmount() {
        return ncloudmount;
    }

    public void setNcloudmount(Double ncloudmount) {
        this.ncloudmount = ncloudmount;
    }

    public Double getNcloudlow() {
        return ncloudlow;
    }

    public void setNcloudlow(Double ncloudlow) {
        this.ncloudlow = ncloudlow;
    }

    public String getVcweather() {
        return vcweather;
    }

    public void setVcweather(String vcweather) {
        this.vcweather = vcweather;
    }

    public Double getNvisibility() {
        return nvisibility;
    }

    public void setNvisibility(Double nvisibility) {
        this.nvisibility = nvisibility;
    }

    public Double getNmaxtemp() {
        return nmaxtemp;
    }

    public void setNmaxtemp(Double nmaxtemp) {
        this.nmaxtemp = nmaxtemp;
    }

    public Double getNmintemp() {
        return nmintemp;
    }

    public void setNmintemp(Double nmintemp) {
        this.nmintemp = nmintemp;
    }

    public Double getNmaxhumidity() {
        return nmaxhumidity;
    }

    public void setNmaxhumidity(Double nmaxhumidity) {
        this.nmaxhumidity = nmaxhumidity;
    }

    public Double getNminhumidity() {
        return nminhumidity;
    }

    public void setNminhumidity(Double nminhumidity) {
        this.nminhumidity = nminhumidity;
    }

    public Double getNrain24() {
        return nrain24;
    }

    public void setNrain24(Double nrain24) {
        this.nrain24 = nrain24;
    }

    public Double getNrain12() {
        return nrain12;
    }

    public void setNrain12(Double nrain12) {
        this.nrain12 = nrain12;
    }

    public Double getNcloudmount12() {
        return ncloudmount12;
    }

    public void setNcloudmount12(Double ncloudmount12) {
        this.ncloudmount12 = ncloudmount12;
    }

    public Double getNcloudlow12() {
        return ncloudlow12;
    }

    public void setNcloudlow12(Double ncloudlow12) {
        this.ncloudlow12 = ncloudlow12;
    }

    public String getVcweather12() {
        return vcweather12;
    }

    public void setVcweather12(String vcweather12) {
        this.vcweather12 = vcweather12;
    }

    public Double getNwinddirect12() {
        return nwinddirect12;
    }

    public void setNwinddirect12(Double nwinddirect12) {
        this.nwinddirect12 = nwinddirect12;
    }

    public Double getNwindspeed12() {
        return nwindspeed12;
    }

    public void setNwindspeed12(Double nwindspeed12) {
        this.nwindspeed12 = nwindspeed12;
    }

    public String getVcareaprov() {
        return vcareaprov;
    }

    public void setVcareaprov(String vcareaprov) {
        this.vcareaprov = vcareaprov;
    }

    public String getVcareacity() {
        return vcareacity;
    }

    public void setVcareacity(String vcareacity) {
        this.vcareacity = vcareacity;
    }

    public String getVcforcasttime() {
        return vcforcasttime;
    }

    public void setVcforcasttime(String vcforcasttime) {
        this.vcforcasttime = vcforcasttime;
    }

    public LocalDateTime getDtsubmittime() {
        return dtsubmittime;
    }

    public void setDtsubmittime(LocalDateTime dtsubmittime) {
        this.dtsubmittime = dtsubmittime;
    }

    public String getVcupdatetime() {
        return vcupdatetime;
    }

    public void setVcupdatetime(String vcupdatetime) {
        this.vcupdatetime = vcupdatetime;
    }

    public Integer getNsource() {
        return nsource;
    }

    public void setNsource(Integer nsource) {
        this.nsource = nsource;
    }

    public String getVcexp1() {
        return vcexp1;
    }

    public void setVcexp1(String vcexp1) {
        this.vcexp1 = vcexp1;
    }

    public String getVcexp2() {
        return vcexp2;
    }

    public void setVcexp2(String vcexp2) {
        this.vcexp2 = vcexp2;
    }

    public String getVcexp3() {
        return vcexp3;
    }

    public void setVcexp3(String vcexp3) {
        this.vcexp3 = vcexp3;
    }

    @Override
    public String toString() {
        return "SsdForecastData{" +
        "nid=" + nid +
        ", vcareacode=" + vcareacode +
        ", vcareaname=" + vcareaname +
        ", vcfabaotime=" + vcfabaotime +
        ", vcqibaodate=" + vcqibaodate +
        ", vcforcastslip=" + vcforcastslip +
        ", ntemperature=" + ntemperature +
        ", nhumidity=" + nhumidity +
        ", nwinddirection=" + nwinddirection +
        ", nwindspeed=" + nwindspeed +
        ", nairpressure=" + nairpressure +
        ", nrainmount=" + nrainmount +
        ", ncloudmount=" + ncloudmount +
        ", ncloudlow=" + ncloudlow +
        ", vcweather=" + vcweather +
        ", nvisibility=" + nvisibility +
        ", nmaxtemp=" + nmaxtemp +
        ", nmintemp=" + nmintemp +
        ", nmaxhumidity=" + nmaxhumidity +
        ", nminhumidity=" + nminhumidity +
        ", nrain24=" + nrain24 +
        ", nrain12=" + nrain12 +
        ", ncloudmount12=" + ncloudmount12 +
        ", ncloudlow12=" + ncloudlow12 +
        ", vcweather12=" + vcweather12 +
        ", nwinddirect12=" + nwinddirect12 +
        ", nwindspeed12=" + nwindspeed12 +
        ", vcareaprov=" + vcareaprov +
        ", vcareacity=" + vcareacity +
        ", vcforcasttime=" + vcforcasttime +
        ", dtsubmittime=" + dtsubmittime +
        ", vcupdatetime=" + vcupdatetime +
        ", nsource=" + nsource +
        ", vcexp1=" + vcexp1 +
        ", vcexp2=" + vcexp2 +
        ", vcexp3=" + vcexp3 +
        "}";
    }
}

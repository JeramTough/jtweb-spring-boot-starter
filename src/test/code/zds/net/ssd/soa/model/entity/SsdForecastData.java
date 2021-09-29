package net.ssd.soa.model.entity;

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
 * @author WeiBoWen
 * @since 2021-08-24
 */
@TableName("Ssd_ForeCast_Data")
@ApiModel(value="SsdForecastData对象", description="")
public class SsdForecastData implements Serializable {

    private static final long serialVersionUID=1L;

    @TableField("nID")
    private Long nID;

    @TableField("vcAreaCode")
    private String vcAreaCode;

    @TableField("vcAreaName")
    private String vcAreaName;

    @TableField("vcFaBaoTime")
    private String vcFaBaoTime;

    @TableField("vcQiBaoDate")
    private String vcQiBaoDate;

    @TableField("vcForCastSlip")
    private String vcForCastSlip;

    @TableField("nTemperature")
    private Double nTemperature;

    @TableField("nHumidity")
    private Double nHumidity;

    @TableField("nWindDirection")
    private Double nWindDirection;

    @TableField("nWindSpeed")
    private Double nWindSpeed;

    @TableField("nAirPressure")
    private Double nAirPressure;

    @TableField("nRainMount")
    private Double nRainMount;

    @TableField("nCloudMount")
    private Double nCloudMount;

    @TableField("nCloudLow")
    private Double nCloudLow;

    @TableField("vcWeather")
    private String vcWeather;

    @TableField("nVisibility")
    private Double nVisibility;

    @TableField("nMaxTemp")
    private Double nMaxTemp;

    @TableField("nMinTemp")
    private Double nMinTemp;

    @TableField("nMaxHumidity")
    private Double nMaxHumidity;

    @TableField("nMinHumidity")
    private Double nMinHumidity;

    @TableField("nRain24")
    private Double nRain24;

    @TableField("nRain12")
    private Double nRain12;

    @TableField("nCloudMount12")
    private Double nCloudMount12;

    @TableField("nCloudLow12")
    private Double nCloudLow12;

    @TableField("vcWeather12")
    private String vcWeather12;

    @TableField("nWindDirect12")
    private Double nWindDirect12;

    @TableField("nWindSpeed12")
    private Double nWindSpeed12;

    @TableField("vcAreaProv")
    private String vcAreaProv;

    @TableField("vcAreaCity")
    private String vcAreaCity;

    @TableField("vcForcastTime")
    private String vcForcastTime;

    @TableField("dtSubmitTime")
    private LocalDateTime dtSubmitTime;

    @TableField("vcUpdateTime")
    private String vcUpdateTime;

    @TableField("nSource")
    private Integer nSource;

    @TableField("vcExp1")
    private String vcExp1;

    @TableField("vcExp2")
    private String vcExp2;

    @TableField("vcExp3")
    private String vcExp3;


    public Long getnID() {
        return nID;
    }

    public void setnID(Long nID) {
        this.nID = nID;
    }

    public String getVcAreaCode() {
        return vcAreaCode;
    }

    public void setVcAreaCode(String vcAreaCode) {
        this.vcAreaCode = vcAreaCode;
    }

    public String getVcAreaName() {
        return vcAreaName;
    }

    public void setVcAreaName(String vcAreaName) {
        this.vcAreaName = vcAreaName;
    }

    public String getVcFaBaoTime() {
        return vcFaBaoTime;
    }

    public void setVcFaBaoTime(String vcFaBaoTime) {
        this.vcFaBaoTime = vcFaBaoTime;
    }

    public String getVcQiBaoDate() {
        return vcQiBaoDate;
    }

    public void setVcQiBaoDate(String vcQiBaoDate) {
        this.vcQiBaoDate = vcQiBaoDate;
    }

    public String getVcForCastSlip() {
        return vcForCastSlip;
    }

    public void setVcForCastSlip(String vcForCastSlip) {
        this.vcForCastSlip = vcForCastSlip;
    }

    public Double getnTemperature() {
        return nTemperature;
    }

    public void setnTemperature(Double nTemperature) {
        this.nTemperature = nTemperature;
    }

    public Double getnHumidity() {
        return nHumidity;
    }

    public void setnHumidity(Double nHumidity) {
        this.nHumidity = nHumidity;
    }

    public Double getnWindDirection() {
        return nWindDirection;
    }

    public void setnWindDirection(Double nWindDirection) {
        this.nWindDirection = nWindDirection;
    }

    public Double getnWindSpeed() {
        return nWindSpeed;
    }

    public void setnWindSpeed(Double nWindSpeed) {
        this.nWindSpeed = nWindSpeed;
    }

    public Double getnAirPressure() {
        return nAirPressure;
    }

    public void setnAirPressure(Double nAirPressure) {
        this.nAirPressure = nAirPressure;
    }

    public Double getnRainMount() {
        return nRainMount;
    }

    public void setnRainMount(Double nRainMount) {
        this.nRainMount = nRainMount;
    }

    public Double getnCloudMount() {
        return nCloudMount;
    }

    public void setnCloudMount(Double nCloudMount) {
        this.nCloudMount = nCloudMount;
    }

    public Double getnCloudLow() {
        return nCloudLow;
    }

    public void setnCloudLow(Double nCloudLow) {
        this.nCloudLow = nCloudLow;
    }

    public String getVcWeather() {
        return vcWeather;
    }

    public void setVcWeather(String vcWeather) {
        this.vcWeather = vcWeather;
    }

    public Double getnVisibility() {
        return nVisibility;
    }

    public void setnVisibility(Double nVisibility) {
        this.nVisibility = nVisibility;
    }

    public Double getnMaxTemp() {
        return nMaxTemp;
    }

    public void setnMaxTemp(Double nMaxTemp) {
        this.nMaxTemp = nMaxTemp;
    }

    public Double getnMinTemp() {
        return nMinTemp;
    }

    public void setnMinTemp(Double nMinTemp) {
        this.nMinTemp = nMinTemp;
    }

    public Double getnMaxHumidity() {
        return nMaxHumidity;
    }

    public void setnMaxHumidity(Double nMaxHumidity) {
        this.nMaxHumidity = nMaxHumidity;
    }

    public Double getnMinHumidity() {
        return nMinHumidity;
    }

    public void setnMinHumidity(Double nMinHumidity) {
        this.nMinHumidity = nMinHumidity;
    }

    public Double getnRain24() {
        return nRain24;
    }

    public void setnRain24(Double nRain24) {
        this.nRain24 = nRain24;
    }

    public Double getnRain12() {
        return nRain12;
    }

    public void setnRain12(Double nRain12) {
        this.nRain12 = nRain12;
    }

    public Double getnCloudMount12() {
        return nCloudMount12;
    }

    public void setnCloudMount12(Double nCloudMount12) {
        this.nCloudMount12 = nCloudMount12;
    }

    public Double getnCloudLow12() {
        return nCloudLow12;
    }

    public void setnCloudLow12(Double nCloudLow12) {
        this.nCloudLow12 = nCloudLow12;
    }

    public String getVcWeather12() {
        return vcWeather12;
    }

    public void setVcWeather12(String vcWeather12) {
        this.vcWeather12 = vcWeather12;
    }

    public Double getnWindDirect12() {
        return nWindDirect12;
    }

    public void setnWindDirect12(Double nWindDirect12) {
        this.nWindDirect12 = nWindDirect12;
    }

    public Double getnWindSpeed12() {
        return nWindSpeed12;
    }

    public void setnWindSpeed12(Double nWindSpeed12) {
        this.nWindSpeed12 = nWindSpeed12;
    }

    public String getVcAreaProv() {
        return vcAreaProv;
    }

    public void setVcAreaProv(String vcAreaProv) {
        this.vcAreaProv = vcAreaProv;
    }

    public String getVcAreaCity() {
        return vcAreaCity;
    }

    public void setVcAreaCity(String vcAreaCity) {
        this.vcAreaCity = vcAreaCity;
    }

    public String getVcForcastTime() {
        return vcForcastTime;
    }

    public void setVcForcastTime(String vcForcastTime) {
        this.vcForcastTime = vcForcastTime;
    }

    public LocalDateTime getDtSubmitTime() {
        return dtSubmitTime;
    }

    public void setDtSubmitTime(LocalDateTime dtSubmitTime) {
        this.dtSubmitTime = dtSubmitTime;
    }

    public String getVcUpdateTime() {
        return vcUpdateTime;
    }

    public void setVcUpdateTime(String vcUpdateTime) {
        this.vcUpdateTime = vcUpdateTime;
    }

    public Integer getnSource() {
        return nSource;
    }

    public void setnSource(Integer nSource) {
        this.nSource = nSource;
    }

    public String getVcExp1() {
        return vcExp1;
    }

    public void setVcExp1(String vcExp1) {
        this.vcExp1 = vcExp1;
    }

    public String getVcExp2() {
        return vcExp2;
    }

    public void setVcExp2(String vcExp2) {
        this.vcExp2 = vcExp2;
    }

    public String getVcExp3() {
        return vcExp3;
    }

    public void setVcExp3(String vcExp3) {
        this.vcExp3 = vcExp3;
    }

    @Override
    public String toString() {
        return "SsdForecastData{" +
        "nID=" + nID +
        ", vcAreaCode=" + vcAreaCode +
        ", vcAreaName=" + vcAreaName +
        ", vcFaBaoTime=" + vcFaBaoTime +
        ", vcQiBaoDate=" + vcQiBaoDate +
        ", vcForCastSlip=" + vcForCastSlip +
        ", nTemperature=" + nTemperature +
        ", nHumidity=" + nHumidity +
        ", nWindDirection=" + nWindDirection +
        ", nWindSpeed=" + nWindSpeed +
        ", nAirPressure=" + nAirPressure +
        ", nRainMount=" + nRainMount +
        ", nCloudMount=" + nCloudMount +
        ", nCloudLow=" + nCloudLow +
        ", vcWeather=" + vcWeather +
        ", nVisibility=" + nVisibility +
        ", nMaxTemp=" + nMaxTemp +
        ", nMinTemp=" + nMinTemp +
        ", nMaxHumidity=" + nMaxHumidity +
        ", nMinHumidity=" + nMinHumidity +
        ", nRain24=" + nRain24 +
        ", nRain12=" + nRain12 +
        ", nCloudMount12=" + nCloudMount12 +
        ", nCloudLow12=" + nCloudLow12 +
        ", vcWeather12=" + vcWeather12 +
        ", nWindDirect12=" + nWindDirect12 +
        ", nWindSpeed12=" + nWindSpeed12 +
        ", vcAreaProv=" + vcAreaProv +
        ", vcAreaCity=" + vcAreaCity +
        ", vcForcastTime=" + vcForcastTime +
        ", dtSubmitTime=" + dtSubmitTime +
        ", vcUpdateTime=" + vcUpdateTime +
        ", nSource=" + nSource +
        ", vcExp1=" + vcExp1 +
        ", vcExp2=" + vcExp2 +
        ", vcExp3=" + vcExp3 +
        "}";
    }
}

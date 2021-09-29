package net.ssd.soa.model.entity;

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
 * @since 2021-08-24
 */
@TableName("Wic_History_Ice_hasIce")
@ApiModel(value="WicHistoryIceHasice对象", description="")
public class WicHistoryIceHasice implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId("ID")
    private String iD;

    @TableField("StationNum")
    private String stationNum;

    @TableField("Year")
    private String year;

    @TableField("Month")
    private String month;

    @TableField("Day")
    private String day;

    @TableField("AvgTemp")
    private Float avgTemp;

    @TableField("MaxTemp")
    private Float maxTemp;

    @TableField("MinTemp")
    private Float minTemp;

    @TableField("RH")
    private Float rH;

    @TableField("PRE")
    private Float pRE;

    @TableField("EVP")
    private Float eVP;

    @TableField("IceThickness")
    private Float iceThickness;

    @TableField("StationName")
    private String stationName;


    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getStationNum() {
        return stationNum;
    }

    public void setStationNum(String stationNum) {
        this.stationNum = stationNum;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Float getAvgTemp() {
        return avgTemp;
    }

    public void setAvgTemp(Float avgTemp) {
        this.avgTemp = avgTemp;
    }

    public Float getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(Float maxTemp) {
        this.maxTemp = maxTemp;
    }

    public Float getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(Float minTemp) {
        this.minTemp = minTemp;
    }

    public Float getrH() {
        return rH;
    }

    public void setrH(Float rH) {
        this.rH = rH;
    }

    public Float getpRE() {
        return pRE;
    }

    public void setpRE(Float pRE) {
        this.pRE = pRE;
    }

    public Float geteVP() {
        return eVP;
    }

    public void seteVP(Float eVP) {
        this.eVP = eVP;
    }

    public Float getIceThickness() {
        return iceThickness;
    }

    public void setIceThickness(Float iceThickness) {
        this.iceThickness = iceThickness;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    @Override
    public String toString() {
        return "WicHistoryIceHasice{" +
        "iD=" + iD +
        ", stationNum=" + stationNum +
        ", year=" + year +
        ", month=" + month +
        ", day=" + day +
        ", avgTemp=" + avgTemp +
        ", maxTemp=" + maxTemp +
        ", minTemp=" + minTemp +
        ", rH=" + rH +
        ", pRE=" + pRE +
        ", eVP=" + eVP +
        ", iceThickness=" + iceThickness +
        ", stationName=" + stationName +
        "}";
    }
}

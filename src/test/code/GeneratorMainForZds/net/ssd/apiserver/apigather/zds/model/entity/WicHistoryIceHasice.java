package net.ssd.apiserver.apigather.zds.model.entity;

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
 * @since 2021-03-08
 */
@TableName("Wic_History_Ice_hasIce")
@ApiModel(value="WicHistoryIceHasice对象", description="")
public class WicHistoryIceHasice implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId("ID")
    private String id;

    @TableField("StationNum")
    private String stationnum;

    @TableField("Year")
    private String year;

    @TableField("Month")
    private String month;

    @TableField("Day")
    private String day;

    @TableField("AvgTemp")
    private Float avgtemp;

    @TableField("MaxTemp")
    private Float maxtemp;

    @TableField("MinTemp")
    private Float mintemp;

    @TableField("RH")
    private Float rh;

    @TableField("PRE")
    private Float pre;

    @TableField("EVP")
    private Float evp;

    @TableField("IceThickness")
    private Float icethickness;

    @TableField("StationName")
    private String stationname;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStationnum() {
        return stationnum;
    }

    public void setStationnum(String stationnum) {
        this.stationnum = stationnum;
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

    public Float getAvgtemp() {
        return avgtemp;
    }

    public void setAvgtemp(Float avgtemp) {
        this.avgtemp = avgtemp;
    }

    public Float getMaxtemp() {
        return maxtemp;
    }

    public void setMaxtemp(Float maxtemp) {
        this.maxtemp = maxtemp;
    }

    public Float getMintemp() {
        return mintemp;
    }

    public void setMintemp(Float mintemp) {
        this.mintemp = mintemp;
    }

    public Float getRh() {
        return rh;
    }

    public void setRh(Float rh) {
        this.rh = rh;
    }

    public Float getPre() {
        return pre;
    }

    public void setPre(Float pre) {
        this.pre = pre;
    }

    public Float getEvp() {
        return evp;
    }

    public void setEvp(Float evp) {
        this.evp = evp;
    }

    public Float getIcethickness() {
        return icethickness;
    }

    public void setIcethickness(Float icethickness) {
        this.icethickness = icethickness;
    }

    public String getStationname() {
        return stationname;
    }

    public void setStationname(String stationname) {
        this.stationname = stationname;
    }

    @Override
    public String toString() {
        return "WicHistoryIceHasice{" +
        "id=" + id +
        ", stationnum=" + stationnum +
        ", year=" + year +
        ", month=" + month +
        ", day=" + day +
        ", avgtemp=" + avgtemp +
        ", maxtemp=" + maxtemp +
        ", mintemp=" + mintemp +
        ", rh=" + rh +
        ", pre=" + pre +
        ", evp=" + evp +
        ", icethickness=" + icethickness +
        ", stationname=" + stationname +
        "}";
    }
}

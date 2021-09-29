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
 * @since 2021-08-24
 */
@ApiModel(value="AutostationInfoOld对象", description="")
public class AutostationInfoOld implements Serializable {

    private static final long serialVersionUID=1L;

    @TableField("ID")
    private Float iD;

    @TableField("BasinID")
    private String basinID;

    @TableField("BasinName")
    private String basinName;

    @TableField("Lon")
    private Float lon;

    @TableField("Lat")
    private Float lat;

    @TableField("City")
    private String city;

    @TableField("autoNum")
    private String autoNum;

    @TableField("County")
    private String county;

    @TableField("Village")
    private String village;

    @TableField("autoName")
    private String autoName;

    @TableField("Province")
    private String province;

    @TableField("F_basinName")
    private String fBasinname;


    public Float getiD() {
        return iD;
    }

    public void setiD(Float iD) {
        this.iD = iD;
    }

    public String getBasinID() {
        return basinID;
    }

    public void setBasinID(String basinID) {
        this.basinID = basinID;
    }

    public String getBasinName() {
        return basinName;
    }

    public void setBasinName(String basinName) {
        this.basinName = basinName;
    }

    public Float getLon() {
        return lon;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAutoNum() {
        return autoNum;
    }

    public void setAutoNum(String autoNum) {
        this.autoNum = autoNum;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getAutoName() {
        return autoName;
    }

    public void setAutoName(String autoName) {
        this.autoName = autoName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getfBasinname() {
        return fBasinname;
    }

    public void setfBasinname(String fBasinname) {
        this.fBasinname = fBasinname;
    }

    @Override
    public String toString() {
        return "AutostationInfoOld{" +
        "iD=" + iD +
        ", basinID=" + basinID +
        ", basinName=" + basinName +
        ", lon=" + lon +
        ", lat=" + lat +
        ", city=" + city +
        ", autoNum=" + autoNum +
        ", county=" + county +
        ", village=" + village +
        ", autoName=" + autoName +
        ", province=" + province +
        ", fBasinname=" + fBasinname +
        "}";
    }
}

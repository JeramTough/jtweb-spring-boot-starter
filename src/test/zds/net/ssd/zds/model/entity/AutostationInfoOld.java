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
@ApiModel(value="AutostationInfoOld对象", description="")
public class AutostationInfoOld implements Serializable {

    private static final long serialVersionUID=1L;

    @TableField("ID")
    private Float id;

    @TableField("BasinID")
    private String basinid;

    @TableField("BasinName")
    private String basinname;

    @TableField("Lon")
    private Float lon;

    @TableField("Lat")
    private Float lat;

    @TableField("City")
    private String city;

    @TableField("autoNum")
    private String autonum;

    @TableField("County")
    private String county;

    @TableField("Village")
    private String village;

    @TableField("autoName")
    private String autoname;

    @TableField("Province")
    private String province;

    @TableField("F_basinName")
    private String fBasinname;


    public Float getId() {
        return id;
    }

    public void setId(Float id) {
        this.id = id;
    }

    public String getBasinid() {
        return basinid;
    }

    public void setBasinid(String basinid) {
        this.basinid = basinid;
    }

    public String getBasinname() {
        return basinname;
    }

    public void setBasinname(String basinname) {
        this.basinname = basinname;
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

    public String getAutonum() {
        return autonum;
    }

    public void setAutonum(String autonum) {
        this.autonum = autonum;
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

    public String getAutoname() {
        return autoname;
    }

    public void setAutoname(String autoname) {
        this.autoname = autoname;
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
        "id=" + id +
        ", basinid=" + basinid +
        ", basinname=" + basinname +
        ", lon=" + lon +
        ", lat=" + lat +
        ", city=" + city +
        ", autonum=" + autonum +
        ", county=" + county +
        ", village=" + village +
        ", autoname=" + autoname +
        ", province=" + province +
        ", fBasinname=" + fBasinname +
        "}";
    }
}

package net.ssd.apiserver.apigather.zds.model.entity;

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
@ApiModel(value="AutostationInfo对象", description="")
public class AutostationInfo implements Serializable {

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

    @TableField("autoNum")
    private String autonum;

    @TableField("autoName")
    private String autoname;

    @TableField("F_basinName")
    private String fBasinname;

    @TableField("Province")
    private String province;


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

    public String getAutonum() {
        return autonum;
    }

    public void setAutonum(String autonum) {
        this.autonum = autonum;
    }

    public String getAutoname() {
        return autoname;
    }

    public void setAutoname(String autoname) {
        this.autoname = autoname;
    }

    public String getfBasinname() {
        return fBasinname;
    }

    public void setfBasinname(String fBasinname) {
        this.fBasinname = fBasinname;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "AutostationInfo{" +
        "id=" + id +
        ", basinid=" + basinid +
        ", basinname=" + basinname +
        ", lon=" + lon +
        ", lat=" + lat +
        ", autonum=" + autonum +
        ", autoname=" + autoname +
        ", fBasinname=" + fBasinname +
        ", province=" + province +
        "}";
    }
}

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
 * @since 2021-09-14
 */
@ApiModel(value="AutostationInfo对象", description="")
public class AutostationInfo implements Serializable {

    private static final long serialVersionUID=1L;

    private Double id;

    @TableField("BasinID")
    private String basinID;

    @TableField("BasinName")
    private String basinName;

    @TableField("Lon")
    private Double lon;

    @TableField("Lat")
    private Double lat;

    @TableField("autoNum")
    private String autoNum;

    @TableField("autoName")
    private String autoName;

    @TableField("F_basinName")
    private String fBasinname;

    @TableField("Province")
    private String province;


    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
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

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public String getAutoNum() {
        return autoNum;
    }

    public void setAutoNum(String autoNum) {
        this.autoNum = autoNum;
    }

    public String getAutoName() {
        return autoName;
    }

    public void setAutoName(String autoName) {
        this.autoName = autoName;
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
        ", basinID=" + basinID +
        ", basinName=" + basinName +
        ", lon=" + lon +
        ", lat=" + lat +
        ", autoNum=" + autoNum +
        ", autoName=" + autoName +
        ", fBasinname=" + fBasinname +
        ", province=" + province +
        "}";
    }
}

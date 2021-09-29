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
@ApiModel(value="AutostationInfo对象", description="")
public class AutostationInfoDto implements Serializable{

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

    @TableField("autoNum")
    private String autoNum;

    @TableField("autoName")
    private String autoName;

    @TableField("F_basinName")
    private String fBasinname;

    @TableField("Province")
    private String province;


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
        "iD=" + iD +
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

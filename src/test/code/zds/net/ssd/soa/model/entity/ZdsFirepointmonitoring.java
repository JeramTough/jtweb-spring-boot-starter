package net.ssd.soa.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("ZDS_FirePointMonitoring")
@ApiModel(value="ZdsFirepointmonitoring对象", description="")
public class ZdsFirepointmonitoring implements Serializable {

    private static final long serialVersionUID=1L;

    @TableField("LDate")
    private String lDate;

    @TableField("County")
    private String county;

    @TableField("Lon")
    private String lon;

    @TableField("Lat")
    private String lat;


    public String getlDate() {
        return lDate;
    }

    public void setlDate(String lDate) {
        this.lDate = lDate;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "ZdsFirepointmonitoring{" +
        "lDate=" + lDate +
        ", county=" + county +
        ", lon=" + lon +
        ", lat=" + lat +
        "}";
    }
}

package net.ssd.zds.model.entity;

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
 * @author JeramTough
 * @since 2021-04-25
 */
@TableName("ZDS_FirePointMonitoring")
@ApiModel(value="ZdsFirepointmonitoring对象", description="")
public class ZdsFirepointmonitoringDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableId("LDate")
    private String ldate;

    @TableField("County")
    private String county;

    @TableField("Lon")
    private String lon;

    @TableField("Lat")
    private String lat;


    public String getLdate() {
        return ldate;
    }

    public void setLdate(String ldate) {
        this.ldate = ldate;
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
        "ldate=" + ldate +
        ", county=" + county +
        ", lon=" + lon +
        ", lat=" + lat +
        "}";
    }
}

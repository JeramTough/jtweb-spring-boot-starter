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
@ApiModel(value="SsdStation对象", description="")
public class SsdStation implements Serializable {

    private static final long serialVersionUID=1L;

    private Long id;

    @TableField("stationNum")
    private String stationnum;

    @TableField("stationName")
    private String stationname;

    private String lon;

    private String lat;

    private String areaCode;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStationnum() {
        return stationnum;
    }

    public void setStationnum(String stationnum) {
        this.stationnum = stationnum;
    }

    public String getStationname() {
        return stationname;
    }

    public void setStationname(String stationname) {
        this.stationname = stationname;
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

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    @Override
    public String toString() {
        return "SsdStation{" +
        "id=" + id +
        ", stationnum=" + stationnum +
        ", stationname=" + stationname +
        ", lon=" + lon +
        ", lat=" + lat +
        ", areaCode=" + areaCode +
        "}";
    }
}

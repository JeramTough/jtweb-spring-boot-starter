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
@ApiModel(value="SsdStation对象", description="")
public class SsdStationDto implements Serializable{

    private static final long serialVersionUID=1L;

    private Long id;

    @TableField("stationNum")
    private String stationNum;

    @TableField("stationName")
    private String stationName;

    private String lon;

    private String lat;

    private String areaCode;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStationNum() {
        return stationNum;
    }

    public void setStationNum(String stationNum) {
        this.stationNum = stationNum;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
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
        ", stationNum=" + stationNum +
        ", stationName=" + stationName +
        ", lon=" + lon +
        ", lat=" + lat +
        ", areaCode=" + areaCode +
        "}";
    }
}

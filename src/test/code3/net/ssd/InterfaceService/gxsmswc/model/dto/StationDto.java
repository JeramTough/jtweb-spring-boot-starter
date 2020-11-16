package net.ssd.InterfaceService.gxsmswc.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author JeramTough
 * @since 2020-09-16
 */
@ApiModel(value="Station对象", description="")
public class StationDto implements Serializable{

    private static final long serialVersionUID=1L;

    private String town;

    private String province;

    private String latitude;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String longitude;

    private String stationType;

    private String stationName;

    private String county;

    private String city;

    private String height;

    private String stationNum;

    private String adminCode;


    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getStationType() {
        return stationType;
    }

    public void setStationType(String stationType) {
        this.stationType = stationType;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getStationNum() {
        return stationNum;
    }

    public void setStationNum(String stationNum) {
        this.stationNum = stationNum;
    }

    public String getAdminCode() {
        return adminCode;
    }

    public void setAdminCode(String adminCode) {
        this.adminCode = adminCode;
    }

    @Override
    public String toString() {
        return "Station{" +
        "town=" + town +
        ", province=" + province +
        ", latitude=" + latitude +
        ", id=" + id +
        ", longitude=" + longitude +
        ", stationType=" + stationType +
        ", stationName=" + stationName +
        ", county=" + county +
        ", city=" + city +
        ", height=" + height +
        ", stationNum=" + stationNum +
        ", adminCode=" + adminCode +
        "}";
    }
}

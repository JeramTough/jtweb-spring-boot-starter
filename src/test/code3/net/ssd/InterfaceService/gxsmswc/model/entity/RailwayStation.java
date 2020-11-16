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
@ApiModel(value="RailwayStation对象", description="")
public class RailwayStation implements Serializable {

    private static final long serialVersionUID=1L;

    private String stationNum;

    private String stationType;

    private String latitude;

    private String trackDivision;

    private String nearFid;

    private String lineId;

    private String stationLevel;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String stationName;

    private String areaCode;

    private String lineName;

    private String longitude;

    private String belong;

    private String nearDist;


    public String getStationNum() {
        return stationNum;
    }

    public void setStationNum(String stationNum) {
        this.stationNum = stationNum;
    }

    public String getStationType() {
        return stationType;
    }

    public void setStationType(String stationType) {
        this.stationType = stationType;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getTrackDivision() {
        return trackDivision;
    }

    public void setTrackDivision(String trackDivision) {
        this.trackDivision = trackDivision;
    }

    public String getNearFid() {
        return nearFid;
    }

    public void setNearFid(String nearFid) {
        this.nearFid = nearFid;
    }

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public String getStationLevel() {
        return stationLevel;
    }

    public void setStationLevel(String stationLevel) {
        this.stationLevel = stationLevel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getBelong() {
        return belong;
    }

    public void setBelong(String belong) {
        this.belong = belong;
    }

    public String getNearDist() {
        return nearDist;
    }

    public void setNearDist(String nearDist) {
        this.nearDist = nearDist;
    }

    @Override
    public String toString() {
        return "RailwayStation{" +
        "stationNum=" + stationNum +
        ", stationType=" + stationType +
        ", latitude=" + latitude +
        ", trackDivision=" + trackDivision +
        ", nearFid=" + nearFid +
        ", lineId=" + lineId +
        ", stationLevel=" + stationLevel +
        ", id=" + id +
        ", stationName=" + stationName +
        ", areaCode=" + areaCode +
        ", lineName=" + lineName +
        ", longitude=" + longitude +
        ", belong=" + belong +
        ", nearDist=" + nearDist +
        "}";
    }
}

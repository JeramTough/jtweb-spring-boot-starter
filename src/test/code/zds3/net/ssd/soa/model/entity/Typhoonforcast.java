package net.ssd.soa.model.entity;

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
@ApiModel(value="Typhoonforcast对象", description="")
public class Typhoonforcast implements Serializable {

    private static final long serialVersionUID=1L;

    private String typhoonId;

    private String stationCode;

    private String currentTime;

    private String predictTime;

    private String longitude;

    private String latitude;

    private String pressure;

    private String windPower;

    private String radius7;

    private String radius10;

    private String moveSpeed;

    private String moveDirection;

    private String affectAffect;

    private Integer id;


    public String getTyphoonId() {
        return typhoonId;
    }

    public void setTyphoonId(String typhoonId) {
        this.typhoonId = typhoonId;
    }

    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    public String getPredictTime() {
        return predictTime;
    }

    public void setPredictTime(String predictTime) {
        this.predictTime = predictTime;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getWindPower() {
        return windPower;
    }

    public void setWindPower(String windPower) {
        this.windPower = windPower;
    }

    public String getRadius7() {
        return radius7;
    }

    public void setRadius7(String radius7) {
        this.radius7 = radius7;
    }

    public String getRadius10() {
        return radius10;
    }

    public void setRadius10(String radius10) {
        this.radius10 = radius10;
    }

    public String getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(String moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public String getMoveDirection() {
        return moveDirection;
    }

    public void setMoveDirection(String moveDirection) {
        this.moveDirection = moveDirection;
    }

    public String getAffectAffect() {
        return affectAffect;
    }

    public void setAffectAffect(String affectAffect) {
        this.affectAffect = affectAffect;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Typhoonforcast{" +
        "typhoonId=" + typhoonId +
        ", stationCode=" + stationCode +
        ", currentTime=" + currentTime +
        ", predictTime=" + predictTime +
        ", longitude=" + longitude +
        ", latitude=" + latitude +
        ", pressure=" + pressure +
        ", windPower=" + windPower +
        ", radius7=" + radius7 +
        ", radius10=" + radius10 +
        ", moveSpeed=" + moveSpeed +
        ", moveDirection=" + moveDirection +
        ", affectAffect=" + affectAffect +
        ", id=" + id +
        "}";
    }
}

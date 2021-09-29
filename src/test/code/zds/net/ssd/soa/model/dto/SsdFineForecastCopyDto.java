package net.ssd.soa.model.entity;

import java.time.LocalDateTime;
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
 * @since 2021-08-24
 */
@ApiModel(value="SsdFineForecastCopy对象", description="")
public class SsdFineForecastCopyDto implements Serializable{

    private static final long serialVersionUID=1L;

    private String id;

    @TableField("stationNum")
    private String stationNum;

    @TableField("stationName")
    private String stationName;

    private String lon;

    private String lat;

    private String hour;

    private String ltime;

    private String ldate;

    private String rain;

    private String windU;

    private String windV;

    private String speed;

    private String direction;

    private String temp;

    @TableField("saveTime")
    private LocalDateTime saveTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getLtime() {
        return ltime;
    }

    public void setLtime(String ltime) {
        this.ltime = ltime;
    }

    public String getLdate() {
        return ldate;
    }

    public void setLdate(String ldate) {
        this.ldate = ldate;
    }

    public String getRain() {
        return rain;
    }

    public void setRain(String rain) {
        this.rain = rain;
    }

    public String getWindU() {
        return windU;
    }

    public void setWindU(String windU) {
        this.windU = windU;
    }

    public String getWindV() {
        return windV;
    }

    public void setWindV(String windV) {
        this.windV = windV;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public LocalDateTime getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(LocalDateTime saveTime) {
        this.saveTime = saveTime;
    }

    @Override
    public String toString() {
        return "SsdFineForecastCopy{" +
        "id=" + id +
        ", stationNum=" + stationNum +
        ", stationName=" + stationName +
        ", lon=" + lon +
        ", lat=" + lat +
        ", hour=" + hour +
        ", ltime=" + ltime +
        ", ldate=" + ldate +
        ", rain=" + rain +
        ", windU=" + windU +
        ", windV=" + windV +
        ", speed=" + speed +
        ", direction=" + direction +
        ", temp=" + temp +
        ", saveTime=" + saveTime +
        "}";
    }
}

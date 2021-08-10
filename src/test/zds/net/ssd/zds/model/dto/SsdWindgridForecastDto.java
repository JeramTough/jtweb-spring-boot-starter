package net.ssd.zds.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
 * @author JeramTough
 * @since 2021-04-25
 */
@TableName("ssd_windGrid_forecast")
@ApiModel(value="SsdWindgridForecast对象", description="")
public class SsdWindgridForecastDto implements Serializable{

    private static final long serialVersionUID=1L;

    private String id;

    private String windU;

    private String windV;

    private Float lon;

    private Float lat;

    private Float speed;

    private String direction;

    private String ldate;

    private String ltime;

    private Integer hour;

    @TableField("saveTime")
    private LocalDateTime savetime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getLdate() {
        return ldate;
    }

    public void setLdate(String ldate) {
        this.ldate = ldate;
    }

    public String getLtime() {
        return ltime;
    }

    public void setLtime(String ltime) {
        this.ltime = ltime;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public LocalDateTime getSavetime() {
        return savetime;
    }

    public void setSavetime(LocalDateTime savetime) {
        this.savetime = savetime;
    }

    @Override
    public String toString() {
        return "SsdWindgridForecast{" +
        "id=" + id +
        ", windU=" + windU +
        ", windV=" + windV +
        ", lon=" + lon +
        ", lat=" + lat +
        ", speed=" + speed +
        ", direction=" + direction +
        ", ldate=" + ldate +
        ", ltime=" + ltime +
        ", hour=" + hour +
        ", savetime=" + savetime +
        "}";
    }
}

package net.ssd.InterfaceService.gxsmswc.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
 * @since 2020-09-16
 */
@TableName("Ssd_City_Forecast")
@ApiModel(value="SsdCityForecast对象", description="")
public class SsdCityForecast implements Serializable {

    private static final long serialVersionUID=1L;

    private String type;

    @TableField("minTemp")
    private String minTemp;

    private String forecastDay;

    private String stationName;

    private String timeRange;

    private String city;

    @TableField("maxTemp")
    private String maxTemp;

    private String mark;

    private String date;

    private String wind;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String weather;

    private String stationNum;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(String minTemp) {
        this.minTemp = minTemp;
    }

    public String getForecastDay() {
        return forecastDay;
    }

    public void setForecastDay(String forecastDay) {
        this.forecastDay = forecastDay;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(String maxTemp) {
        this.maxTemp = maxTemp;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getStationNum() {
        return stationNum;
    }

    public void setStationNum(String stationNum) {
        this.stationNum = stationNum;
    }

    @Override
    public String toString() {
        return "SsdCityForecast{" +
        "type=" + type +
        ", minTemp=" + minTemp +
        ", forecastDay=" + forecastDay +
        ", stationName=" + stationName +
        ", timeRange=" + timeRange +
        ", city=" + city +
        ", maxTemp=" + maxTemp +
        ", mark=" + mark +
        ", date=" + date +
        ", wind=" + wind +
        ", id=" + id +
        ", weather=" + weather +
        ", stationNum=" + stationNum +
        "}";
    }
}

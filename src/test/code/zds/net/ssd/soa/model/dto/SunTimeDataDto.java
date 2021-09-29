package net.ssd.soa.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("Sun_Time_Data")
@ApiModel(value="SunTimeData对象", description="")
public class SunTimeDataDto implements Serializable{

    private static final long serialVersionUID=1L;

    private String id;

    private String city;

    private String year;

    private String mon;

    private String day;

    private String sunriseTime;

    private String sunsetTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getSunriseTime() {
        return sunriseTime;
    }

    public void setSunriseTime(String sunriseTime) {
        this.sunriseTime = sunriseTime;
    }

    public String getSunsetTime() {
        return sunsetTime;
    }

    public void setSunsetTime(String sunsetTime) {
        this.sunsetTime = sunsetTime;
    }

    @Override
    public String toString() {
        return "SunTimeData{" +
        "id=" + id +
        ", city=" + city +
        ", year=" + year +
        ", mon=" + mon +
        ", day=" + day +
        ", sunriseTime=" + sunriseTime +
        ", sunsetTime=" + sunsetTime +
        "}";
    }
}

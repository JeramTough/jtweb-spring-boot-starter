package net.ssd.zds.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("ZDS_TEMPERATUREWET")
@ApiModel(value="ZdsTemperaturewet对象", description="")
public class ZdsTemperaturewetDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableField("LDATE")
    private String ldate;

    @TableField("CITY")
    private String city;

    @TableField("TMAX")
    private Float tmax;

    @TableField("BELIEF1")
    private String belief1;

    @TableField("TMIN")
    private Float tmin;

    @TableField("BELIEF2")
    private String belief2;

    @TableField("WET")
    private String wet;

    @TableField("BELIEF3")
    private String belief3;

    @TableField("WEATHER")
    private String weather;

    private String txt;


    public String getLdate() {
        return ldate;
    }

    public void setLdate(String ldate) {
        this.ldate = ldate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Float getTmax() {
        return tmax;
    }

    public void setTmax(Float tmax) {
        this.tmax = tmax;
    }

    public String getBelief1() {
        return belief1;
    }

    public void setBelief1(String belief1) {
        this.belief1 = belief1;
    }

    public Float getTmin() {
        return tmin;
    }

    public void setTmin(Float tmin) {
        this.tmin = tmin;
    }

    public String getBelief2() {
        return belief2;
    }

    public void setBelief2(String belief2) {
        this.belief2 = belief2;
    }

    public String getWet() {
        return wet;
    }

    public void setWet(String wet) {
        this.wet = wet;
    }

    public String getBelief3() {
        return belief3;
    }

    public void setBelief3(String belief3) {
        this.belief3 = belief3;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    @Override
    public String toString() {
        return "ZdsTemperaturewet{" +
        "ldate=" + ldate +
        ", city=" + city +
        ", tmax=" + tmax +
        ", belief1=" + belief1 +
        ", tmin=" + tmin +
        ", belief2=" + belief2 +
        ", wet=" + wet +
        ", belief3=" + belief3 +
        ", weather=" + weather +
        ", txt=" + txt +
        "}";
    }
}

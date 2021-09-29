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
@ApiModel(value="ZdsTemperaturewet对象", description="")
public class ZdsTemperaturewet implements Serializable {

    private static final long serialVersionUID=1L;

    private String ldate;

    private String city;

    private Double tmax;

    private String belief1;

    private Double tmin;

    private String belief2;

    private String wet;

    private String belief3;

    private String weather;

    private String txt;

    private Integer id;


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

    public Double getTmax() {
        return tmax;
    }

    public void setTmax(Double tmax) {
        this.tmax = tmax;
    }

    public String getBelief1() {
        return belief1;
    }

    public void setBelief1(String belief1) {
        this.belief1 = belief1;
    }

    public Double getTmin() {
        return tmin;
    }

    public void setTmin(Double tmin) {
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        ", id=" + id +
        "}";
    }
}

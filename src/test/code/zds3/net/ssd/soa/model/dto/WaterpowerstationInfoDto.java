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
 * @since 2021-09-14
 */
@ApiModel(value="WaterpowerstationInfo对象", description="")
public class WaterpowerstationInfoDto implements Serializable{

    private static final long serialVersionUID=1L;

    private Double fid;

    @TableField("StationName")
    private String stationName;

    @TableField("City")
    private String city;

    @TableField("BasinName")
    private String basinName;

    private String y;

    private String x;

    @TableField("GoogleY")
    private String googleY;

    @TableField("GoogleX")
    private String googleX;

    @TableField("stationCode")
    private String stationCode;

    private Integer xh;


    public Double getFid() {
        return fid;
    }

    public void setFid(Double fid) {
        this.fid = fid;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBasinName() {
        return basinName;
    }

    public void setBasinName(String basinName) {
        this.basinName = basinName;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getGoogleY() {
        return googleY;
    }

    public void setGoogleY(String googleY) {
        this.googleY = googleY;
    }

    public String getGoogleX() {
        return googleX;
    }

    public void setGoogleX(String googleX) {
        this.googleX = googleX;
    }

    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    @Override
    public String toString() {
        return "WaterpowerstationInfo{" +
        "fid=" + fid +
        ", stationName=" + stationName +
        ", city=" + city +
        ", basinName=" + basinName +
        ", y=" + y +
        ", x=" + x +
        ", googleY=" + googleY +
        ", googleX=" + googleX +
        ", stationCode=" + stationCode +
        ", xh=" + xh +
        "}";
    }
}

package net.ssd.apiserver.apigather.zds.model.entity;

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
 * @author WeiBoWen
 * @since 2021-03-08
 */
@TableName("waterpowerStation_info")
@ApiModel(value="WaterpowerstationInfo对象", description="")
public class WaterpowerstationInfoDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableField("FID")
    private Float fid;

    @TableField("StationName")
    private String stationname;

    @TableField("City")
    private String city;

    @TableField("BasinName")
    private String basinname;

    @TableField("Y")
    private String y;

    @TableField("X")
    private String x;

    @TableField("GoogleY")
    private String googley;

    @TableField("GoogleX")
    private String googlex;

    @TableField("stationCode")
    private String stationcode;

    private Integer xh;


    public Float getFid() {
        return fid;
    }

    public void setFid(Float fid) {
        this.fid = fid;
    }

    public String getStationname() {
        return stationname;
    }

    public void setStationname(String stationname) {
        this.stationname = stationname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBasinname() {
        return basinname;
    }

    public void setBasinname(String basinname) {
        this.basinname = basinname;
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

    public String getGoogley() {
        return googley;
    }

    public void setGoogley(String googley) {
        this.googley = googley;
    }

    public String getGooglex() {
        return googlex;
    }

    public void setGooglex(String googlex) {
        this.googlex = googlex;
    }

    public String getStationcode() {
        return stationcode;
    }

    public void setStationcode(String stationcode) {
        this.stationcode = stationcode;
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
        ", stationname=" + stationname +
        ", city=" + city +
        ", basinname=" + basinname +
        ", y=" + y +
        ", x=" + x +
        ", googley=" + googley +
        ", googlex=" + googlex +
        ", stationcode=" + stationcode +
        ", xh=" + xh +
        "}";
    }
}

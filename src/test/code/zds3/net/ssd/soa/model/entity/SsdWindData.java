package net.ssd.soa.model.entity;

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
 * @author WeiBoWen
 * @since 2021-09-14
 */
@ApiModel(value="SsdWindData对象", description="")
public class SsdWindData implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("weiDu")
    private String weiDu;

    @TableField("jingDu")
    private String jingDu;

    @TableField("releaseTime")
    private String releaseTime;

    @TableField("stationName")
    private String stationName;

    @TableField("stationId")
    private String stationId;

    private Double uWind;

    private Double vWind;

    @TableField("windDirection")
    private String windDirection;

    @TableField("windSpeed")
    private Double windSpeed;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWeiDu() {
        return weiDu;
    }

    public void setWeiDu(String weiDu) {
        this.weiDu = weiDu;
    }

    public String getJingDu() {
        return jingDu;
    }

    public void setJingDu(String jingDu) {
        this.jingDu = jingDu;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public Double getuWind() {
        return uWind;
    }

    public void setuWind(Double uWind) {
        this.uWind = uWind;
    }

    public Double getvWind() {
        return vWind;
    }

    public void setvWind(Double vWind) {
        this.vWind = vWind;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    @Override
    public String toString() {
        return "SsdWindData{" +
        "id=" + id +
        ", weiDu=" + weiDu +
        ", jingDu=" + jingDu +
        ", releaseTime=" + releaseTime +
        ", stationName=" + stationName +
        ", stationId=" + stationId +
        ", uWind=" + uWind +
        ", vWind=" + vWind +
        ", windDirection=" + windDirection +
        ", windSpeed=" + windSpeed +
        "}";
    }
}

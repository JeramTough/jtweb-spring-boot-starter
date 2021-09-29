package net.ssd.soa.model.entity;

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
 * @author WeiBoWen
 * @since 2021-09-08
 */
@TableName("Ssd_Wind_Data")
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

    private Float uWind;

    private Float vWind;

    @TableField("windDirection")
    private String windDirection;

    @TableField("windSpeed")
    private Float windSpeed;


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

    public Float getuWind() {
        return uWind;
    }

    public void setuWind(Float uWind) {
        this.uWind = uWind;
    }

    public Float getvWind() {
        return vWind;
    }

    public void setvWind(Float vWind) {
        this.vWind = vWind;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public Float getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Float windSpeed) {
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

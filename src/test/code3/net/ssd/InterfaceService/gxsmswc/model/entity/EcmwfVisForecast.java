package net.ssd.InterfaceService.gxsmswc.model.entity;

import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * EC细网格能见度预报
 * </p>
 *
 * @author JeramTough
 * @since 2020-09-16
 */
@ApiModel(value="EcmwfVisForecast对象", description="EC细网格能见度预报")
public class EcmwfVisForecast implements Serializable {

    private static final long serialVersionUID=1L;

    private String lon;

    private String forecastTime;

    private String vis;

    @TableField("validTime")
    private String validTime;

    private Integer id;

    @TableField("saveTime")
    private LocalDateTime saveTime;

    private String lat;


    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getForecastTime() {
        return forecastTime;
    }

    public void setForecastTime(String forecastTime) {
        this.forecastTime = forecastTime;
    }

    public String getVis() {
        return vis;
    }

    public void setVis(String vis) {
        this.vis = vis;
    }

    public String getValidTime() {
        return validTime;
    }

    public void setValidTime(String validTime) {
        this.validTime = validTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(LocalDateTime saveTime) {
        this.saveTime = saveTime;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "EcmwfVisForecast{" +
        "lon=" + lon +
        ", forecastTime=" + forecastTime +
        ", vis=" + vis +
        ", validTime=" + validTime +
        ", id=" + id +
        ", saveTime=" + saveTime +
        ", lat=" + lat +
        "}";
    }
}

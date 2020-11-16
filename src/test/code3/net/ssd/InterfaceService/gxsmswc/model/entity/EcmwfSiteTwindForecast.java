package net.ssd.InterfaceService.gxsmswc.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * EC细网格风预报
 * </p>
 *
 * @author JeramTough
 * @since 2020-09-16
 */
@TableName("ecmwf_site_Twind_forecast")
@ApiModel(value="EcmwfSiteTwindForecast对象", description="EC细网格风预报")
public class EcmwfSiteTwindForecast implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自增长主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "起报时间")
    private String forecastTime;

    @ApiModelProperty(value = "间隔时间")
    @TableField("validTime")
    private String validTime;

    @ApiModelProperty(value = "纬度")
    private String lat;

    @ApiModelProperty(value = "经度")
    private String lon;

    @ApiModelProperty(value = "风速")
    private String wind;

    @ApiModelProperty(value = "入库时间")
    @TableField("saveTime")
    private LocalDateTime saveTime;

    @ApiModelProperty(value = "角度")
    private String angle;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getForecastTime() {
        return forecastTime;
    }

    public void setForecastTime(String forecastTime) {
        this.forecastTime = forecastTime;
    }

    public String getValidTime() {
        return validTime;
    }

    public void setValidTime(String validTime) {
        this.validTime = validTime;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public LocalDateTime getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(LocalDateTime saveTime) {
        this.saveTime = saveTime;
    }

    public String getAngle() {
        return angle;
    }

    public void setAngle(String angle) {
        this.angle = angle;
    }

    @Override
    public String toString() {
        return "EcmwfSiteTwindForecast{" +
        "id=" + id +
        ", forecastTime=" + forecastTime +
        ", validTime=" + validTime +
        ", lat=" + lat +
        ", lon=" + lon +
        ", wind=" + wind +
        ", saveTime=" + saveTime +
        ", angle=" + angle +
        "}";
    }
}

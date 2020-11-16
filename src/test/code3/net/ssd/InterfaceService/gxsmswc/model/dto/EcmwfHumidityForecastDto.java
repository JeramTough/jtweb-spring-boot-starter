package net.ssd.InterfaceService.gxsmswc.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * EC细网格相对湿度预报
 * </p>
 *
 * @author JeramTough
 * @since 2020-09-16
 */
@ApiModel(value="EcmwfHumidityForecast对象", description="EC细网格相对湿度预报")
public class EcmwfHumidityForecastDto implements Serializable{

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

    @ApiModelProperty(value = "相对湿度")
    private String humidity;

    @ApiModelProperty(value = "保存时间")
    @TableField("saveTime")
    private LocalDateTime saveTime;


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

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public LocalDateTime getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(LocalDateTime saveTime) {
        this.saveTime = saveTime;
    }

    @Override
    public String toString() {
        return "EcmwfHumidityForecast{" +
        "id=" + id +
        ", forecastTime=" + forecastTime +
        ", validTime=" + validTime +
        ", lat=" + lat +
        ", lon=" + lon +
        ", humidity=" + humidity +
        ", saveTime=" + saveTime +
        "}";
    }
}

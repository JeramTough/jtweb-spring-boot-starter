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
 * 五天预报
 * </p>
 *
 * @author JeramTough
 * @since 2020-09-16
 */
@ApiModel(value="EnnFiveForecast对象", description="五天预报")
public class EnnFiveForecastDto implements Serializable{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自增长主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "起报时间")
    @TableField("forecastTime")
    private String forecastTime;

    @ApiModelProperty(value = "时期")
    private String priod;

    @ApiModelProperty(value = "位置")
    private String location;

    @ApiModelProperty(value = "天气现象")
    private String weather;

    @ApiModelProperty(value = "风")
    private String wind;

    @ApiModelProperty(value = "最低温")
    @TableField("minTemp")
    private String minTemp;

    @ApiModelProperty(value = "最高温")
    @TableField("maxTemp")
    private String maxTemp;

    @ApiModelProperty(value = "入库时间")
    @TableField("saveTime")
    private LocalDateTime saveTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getForecastTime() {
        return forecastTime;
    }

    public void setForecastTime(String forecastTime) {
        this.forecastTime = forecastTime;
    }

    public String getPriod() {
        return priod;
    }

    public void setPriod(String priod) {
        this.priod = priod;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public String getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(String minTemp) {
        this.minTemp = minTemp;
    }

    public String getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(String maxTemp) {
        this.maxTemp = maxTemp;
    }

    public LocalDateTime getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(LocalDateTime saveTime) {
        this.saveTime = saveTime;
    }

    @Override
    public String toString() {
        return "EnnFiveForecast{" +
        "id=" + id +
        ", forecastTime=" + forecastTime +
        ", priod=" + priod +
        ", location=" + location +
        ", weather=" + weather +
        ", wind=" + wind +
        ", minTemp=" + minTemp +
        ", maxTemp=" + maxTemp +
        ", saveTime=" + saveTime +
        "}";
    }
}

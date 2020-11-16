package net.ssd.InterfaceService.gxsmswc.model.entity;

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
 * @author JeramTough
 * @since 2020-09-16
 */
@ApiModel(value="ScenicCorrect对象", description="")
public class ScenicCorrectDto implements Serializable{

    private static final long serialVersionUID=1L;

    private String weather;

    private String grid;

    private String maxTemp;

    private String elm;

    private String scenicId;

    private String weatherName;

    @TableField("dateTime")
    private String dateTime;

    @TableField("timeRange")
    private String timeRange;

    private String minTemp;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getGrid() {
        return grid;
    }

    public void setGrid(String grid) {
        this.grid = grid;
    }

    public String getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(String maxTemp) {
        this.maxTemp = maxTemp;
    }

    public String getElm() {
        return elm;
    }

    public void setElm(String elm) {
        this.elm = elm;
    }

    public String getScenicId() {
        return scenicId;
    }

    public void setScenicId(String scenicId) {
        this.scenicId = scenicId;
    }

    public String getWeatherName() {
        return weatherName;
    }

    public void setWeatherName(String weatherName) {
        this.weatherName = weatherName;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    public String getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(String minTemp) {
        this.minTemp = minTemp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ScenicCorrect{" +
        "weather=" + weather +
        ", grid=" + grid +
        ", maxTemp=" + maxTemp +
        ", elm=" + elm +
        ", scenicId=" + scenicId +
        ", weatherName=" + weatherName +
        ", dateTime=" + dateTime +
        ", timeRange=" + timeRange +
        ", minTemp=" + minTemp +
        ", id=" + id +
        "}";
    }
}

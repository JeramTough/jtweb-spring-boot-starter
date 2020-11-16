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
 * 
 * </p>
 *
 * @author JeramTough
 * @since 2020-09-16
 */
@ApiModel(value="QtGridHumidityForecast对象", description="")
public class QtGridHumidityForecastDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableField("validTime")
    private String validTime;

    private String val;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("insertTime")
    private LocalDateTime insertTime;

    private String lon;

    private String lat;

    @TableField("dateTime")
    private String dateTime;


    public String getValidTime() {
        return validTime;
    }

    public void setValidTime(String validTime) {
        this.validTime = validTime;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(LocalDateTime insertTime) {
        this.insertTime = insertTime;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "QtGridHumidityForecast{" +
        "validTime=" + validTime +
        ", val=" + val +
        ", id=" + id +
        ", insertTime=" + insertTime +
        ", lon=" + lon +
        ", lat=" + lat +
        ", dateTime=" + dateTime +
        "}";
    }
}

package net.ssd.InterfaceService.gxsmswc.model.entity;

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
@ApiModel(value="GridHumidityForecast对象", description="")
public class GridHumidityForecast implements Serializable {

    private static final long serialVersionUID=1L;

    @TableField("dateTime")
    private String dateTime;

    private String lat;

    private String lon;

    @TableField("insertTime")
    private LocalDateTime insertTime;

    private Long id;

    private String val;

    @TableField("validTime")
    private String validTime;


    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
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

    public LocalDateTime getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(LocalDateTime insertTime) {
        this.insertTime = insertTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public String getValidTime() {
        return validTime;
    }

    public void setValidTime(String validTime) {
        this.validTime = validTime;
    }

    @Override
    public String toString() {
        return "GridHumidityForecast{" +
        "dateTime=" + dateTime +
        ", lat=" + lat +
        ", lon=" + lon +
        ", insertTime=" + insertTime +
        ", id=" + id +
        ", val=" + val +
        ", validTime=" + validTime +
        "}";
    }
}

package net.ssd.InterfaceService.gxsmswc.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
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
@ApiModel(value="QtGridCloudForecast对象", description="")
public class QtGridCloudForecast implements Serializable {

    private static final long serialVersionUID=1L;

    private String val;

    @TableField("validTime")
    private String validTime;

    private String lon;

    @TableField("insertTime")
    private LocalDateTime insertTime;

    @TableField("dateTime")
    private String dateTime;

    private String lat;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;


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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "QtGridCloudForecast{" +
        "val=" + val +
        ", validTime=" + validTime +
        ", lon=" + lon +
        ", insertTime=" + insertTime +
        ", dateTime=" + dateTime +
        ", lat=" + lat +
        ", id=" + id +
        "}";
    }
}

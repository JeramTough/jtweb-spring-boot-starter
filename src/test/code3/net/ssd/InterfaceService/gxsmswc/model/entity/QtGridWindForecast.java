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
@ApiModel(value="QtGridWindForecast对象", description="")
public class QtGridWindForecast implements Serializable {

    private static final long serialVersionUID=1L;

    private String lon;

    private String speed;

    @TableField("dateTime")
    private String dateTime;

    private String lat;

    private String angle;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("validTime")
    private String validTime;

    @TableField("insertTime")
    private LocalDateTime insertTime;


    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
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

    public String getAngle() {
        return angle;
    }

    public void setAngle(String angle) {
        this.angle = angle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValidTime() {
        return validTime;
    }

    public void setValidTime(String validTime) {
        this.validTime = validTime;
    }

    public LocalDateTime getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(LocalDateTime insertTime) {
        this.insertTime = insertTime;
    }

    @Override
    public String toString() {
        return "QtGridWindForecast{" +
        "lon=" + lon +
        ", speed=" + speed +
        ", dateTime=" + dateTime +
        ", lat=" + lat +
        ", angle=" + angle +
        ", id=" + id +
        ", validTime=" + validTime +
        ", insertTime=" + insertTime +
        "}";
    }
}

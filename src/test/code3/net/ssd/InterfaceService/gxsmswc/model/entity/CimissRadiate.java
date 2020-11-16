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
 * CIMISS辐射
 * </p>
 *
 * @author JeramTough
 * @since 2020-09-16
 */
@TableName("cimissRadiate")
@ApiModel(value="CimissRadiate对象", description="CIMISS辐射")
public class CimissRadiate implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自增长主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "站点编号")
    @TableField("stationNum")
    private String stationNum;

    @ApiModelProperty(value = "纬度")
    private String lat;

    @ApiModelProperty(value = "经度")
    private String lon;

    @ApiModelProperty(value = "年")
    private String year;

    @ApiModelProperty(value = "月")
    private String month;

    @ApiModelProperty(value = "日")
    private String day;

    @ApiModelProperty(value = "时")
    private String hour;

    @ApiModelProperty(value = "分")
    private String minute;

    @ApiModelProperty(value = "辐射")
    private String radiate;

    @ApiModelProperty(value = "保存时间")
    @TableField("insertTime")
    private LocalDateTime insertTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStationNum() {
        return stationNum;
    }

    public void setStationNum(String stationNum) {
        this.stationNum = stationNum;
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }

    public String getRadiate() {
        return radiate;
    }

    public void setRadiate(String radiate) {
        this.radiate = radiate;
    }

    public LocalDateTime getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(LocalDateTime insertTime) {
        this.insertTime = insertTime;
    }

    @Override
    public String toString() {
        return "CimissRadiate{" +
        "id=" + id +
        ", stationNum=" + stationNum +
        ", lat=" + lat +
        ", lon=" + lon +
        ", year=" + year +
        ", month=" + month +
        ", day=" + day +
        ", hour=" + hour +
        ", minute=" + minute +
        ", radiate=" + radiate +
        ", insertTime=" + insertTime +
        "}";
    }
}

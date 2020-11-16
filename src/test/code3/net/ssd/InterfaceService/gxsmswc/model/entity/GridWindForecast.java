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
 * 智能网格风预报
 * </p>
 *
 * @author JeramTough
 * @since 2020-09-16
 */
@ApiModel(value="GridWindForecast对象", description="智能网格风预报")
public class GridWindForecast implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自增长主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "入库时间")
    @TableField("insertTime")
    private LocalDateTime insertTime;

    @ApiModelProperty(value = "起报时间")
    @TableField("dateTime")
    private String dateTime;

    @ApiModelProperty(value = "间隔时间")
    @TableField("validTime")
    private String validTime;

    @ApiModelProperty(value = "经度")
    private String lon;

    @ApiModelProperty(value = "纬度")
    private String lat;

    @ApiModelProperty(value = "u风")
    private String windU;

    @ApiModelProperty(value = "v风")
    private String windV;

    @ApiModelProperty(value = "优化查询")
    private String windV;


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

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
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

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getWindU() {
        return windU;
    }

    public void setWindU(String windU) {
        this.windU = windU;
    }

    public String getWindV() {
        return windV;
    }

    public void setWindV(String windV) {
        this.windV = windV;
    }

    public String getWindV() {
        return windV;
    }

    public void setWindV(String windV) {
        this.windV = windV;
    }

    @Override
    public String toString() {
        return "GridWindForecast{" +
        "id=" + id +
        ", insertTime=" + insertTime +
        ", dateTime=" + dateTime +
        ", validTime=" + validTime +
        ", lon=" + lon +
        ", lat=" + lat +
        ", windU=" + windU +
        ", windV=" + windV +
        ", windV=" + windV +
        "}";
    }
}

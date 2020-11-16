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
 * 智能网格能见度预报（区台）
 * </p>
 *
 * @author JeramTough
 * @since 2020-09-16
 */
@ApiModel(value="GridVisForecastQt对象", description="智能网格能见度预报（区台）")
public class GridVisForecastQtDto implements Serializable{

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

    @ApiModelProperty(value = "值")
    private String val;


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

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "GridVisForecastQt{" +
        "id=" + id +
        ", insertTime=" + insertTime +
        ", dateTime=" + dateTime +
        ", validTime=" + validTime +
        ", lon=" + lon +
        ", lat=" + lat +
        ", val=" + val +
        "}";
    }
}

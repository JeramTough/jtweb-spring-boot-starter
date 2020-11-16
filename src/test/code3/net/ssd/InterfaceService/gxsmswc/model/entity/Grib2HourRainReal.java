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
 * 智能网格小时降水实况
 * </p>
 *
 * @author JeramTough
 * @since 2020-09-16
 */
@ApiModel(value="Grib2HourRainReal对象", description="智能网格小时降水实况")
public class Grib2HourRainReal implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自增长主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "日期")
    private String ldate;

    @ApiModelProperty(value = "经度")
    private String lon;

    @ApiModelProperty(value = "纬度")
    private String lat;

    @ApiModelProperty(value = "降水")
    private String rain;

    @ApiModelProperty(value = "入库日期")
    @TableField("saveTime")
    private LocalDateTime saveTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLdate() {
        return ldate;
    }

    public void setLdate(String ldate) {
        this.ldate = ldate;
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

    public String getRain() {
        return rain;
    }

    public void setRain(String rain) {
        this.rain = rain;
    }

    public LocalDateTime getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(LocalDateTime saveTime) {
        this.saveTime = saveTime;
    }

    @Override
    public String toString() {
        return "Grib2HourRainReal{" +
        "id=" + id +
        ", ldate=" + ldate +
        ", lon=" + lon +
        ", lat=" + lat +
        ", rain=" + rain +
        ", saveTime=" + saveTime +
        "}";
    }
}

package net.ssd.InterfaceService.gxsmswc.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="RailwayResultForecast对象", description="")
public class RailwayResultForecastDto implements Serializable{

    private static final long serialVersionUID=1L;

    private String date;

    private String timeRange;

    private String data;

    private String timeType;

    private String updateTime;

    private String element;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTimeType() {
        return timeType;
    }

    public void setTimeType(String timeType) {
        this.timeType = timeType;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "RailwayResultForecast{" +
        "date=" + date +
        ", timeRange=" + timeRange +
        ", data=" + data +
        ", timeType=" + timeType +
        ", updateTime=" + updateTime +
        ", element=" + element +
        ", id=" + id +
        "}";
    }
}

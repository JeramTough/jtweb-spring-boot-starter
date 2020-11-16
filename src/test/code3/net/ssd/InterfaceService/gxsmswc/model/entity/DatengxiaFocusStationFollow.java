package net.ssd.InterfaceService.gxsmswc.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 大藤峡关注点下属站点
 * </p>
 *
 * @author JeramTough
 * @since 2020-09-16
 */
@TableName("daTengXia_focus_station_follow")
@ApiModel(value="DatengxiaFocusStationFollow对象", description="大藤峡关注点下属站点")
public class DatengxiaFocusStationFollow implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自增长主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "到关注站点的距离")
    private String distance;

    @ApiModelProperty(value = "大藤峡关注点表ID")
    @TableField("daTengXiaFocusStationId")
    private Integer daTengXiaFocusStationId;

    @ApiModelProperty(value = "纬度")
    private String latitude;

    @ApiModelProperty(value = "经度")
    private String longitud;

    @ApiModelProperty(value = "站点名称")
    @TableField("stationName")
    private String stationName;

    @ApiModelProperty(value = "站点编号")
    @TableField("stationNum")
    private String stationNum;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public Integer getDaTengXiaFocusStationId() {
        return daTengXiaFocusStationId;
    }

    public void setDaTengXiaFocusStationId(Integer daTengXiaFocusStationId) {
        this.daTengXiaFocusStationId = daTengXiaFocusStationId;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getStationNum() {
        return stationNum;
    }

    public void setStationNum(String stationNum) {
        this.stationNum = stationNum;
    }

    @Override
    public String toString() {
        return "DatengxiaFocusStationFollow{" +
        "id=" + id +
        ", distance=" + distance +
        ", daTengXiaFocusStationId=" + daTengXiaFocusStationId +
        ", latitude=" + latitude +
        ", longitud=" + longitud +
        ", stationName=" + stationName +
        ", stationNum=" + stationNum +
        "}";
    }
}

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
@ApiModel(value="WindEletriIce对象", description="")
public class WindEletriIce implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "起报日期")
    private String dateStart;

    @ApiModelProperty(value = "站号")
    @TableField("stationNum")
    private String stationNum;

    @ApiModelProperty(value = "时效")
    @TableField("validTime")
    private String validTime;

    @ApiModelProperty(value = "值")
    private String value;

    @ApiModelProperty(value = "获取数据文件时是第几行,对应第几种类型")
    private Integer dataLineNum;

    @ApiModelProperty(value = "风电场名称简写，如：JZS")
    private String areaName;

    private LocalDateTime saveTime;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;


    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getStationNum() {
        return stationNum;
    }

    public void setStationNum(String stationNum) {
        this.stationNum = stationNum;
    }

    public String getValidTime() {
        return validTime;
    }

    public void setValidTime(String validTime) {
        this.validTime = validTime;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getDataLineNum() {
        return dataLineNum;
    }

    public void setDataLineNum(Integer dataLineNum) {
        this.dataLineNum = dataLineNum;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public LocalDateTime getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(LocalDateTime saveTime) {
        this.saveTime = saveTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "WindEletriIce{" +
        "dateStart=" + dateStart +
        ", stationNum=" + stationNum +
        ", validTime=" + validTime +
        ", value=" + value +
        ", dataLineNum=" + dataLineNum +
        ", areaName=" + areaName +
        ", saveTime=" + saveTime +
        ", id=" + id +
        "}";
    }
}

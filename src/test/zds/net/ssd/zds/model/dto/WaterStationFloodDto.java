package net.ssd.zds.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
 * @since 2021-04-25
 */
@TableName("Water_Station_Flood")
@ApiModel(value="WaterStationFlood对象", description="")
public class WaterStationFloodDto implements Serializable{

    private static final long serialVersionUID=1L;

    private String bcode;

    @TableField("stationName")
    private String stationname;

    private Double deathLevel;

    private Double normalLevel;

    private Double floodLevel;

    private Double flowLevel;

    private Double desigeLevel;

    private Double checkLevel;

    private Double overLevel;

    @TableField("sortC")
    private String sortc;


    public String getBcode() {
        return bcode;
    }

    public void setBcode(String bcode) {
        this.bcode = bcode;
    }

    public String getStationname() {
        return stationname;
    }

    public void setStationname(String stationname) {
        this.stationname = stationname;
    }

    public Double getDeathLevel() {
        return deathLevel;
    }

    public void setDeathLevel(Double deathLevel) {
        this.deathLevel = deathLevel;
    }

    public Double getNormalLevel() {
        return normalLevel;
    }

    public void setNormalLevel(Double normalLevel) {
        this.normalLevel = normalLevel;
    }

    public Double getFloodLevel() {
        return floodLevel;
    }

    public void setFloodLevel(Double floodLevel) {
        this.floodLevel = floodLevel;
    }

    public Double getFlowLevel() {
        return flowLevel;
    }

    public void setFlowLevel(Double flowLevel) {
        this.flowLevel = flowLevel;
    }

    public Double getDesigeLevel() {
        return desigeLevel;
    }

    public void setDesigeLevel(Double desigeLevel) {
        this.desigeLevel = desigeLevel;
    }

    public Double getCheckLevel() {
        return checkLevel;
    }

    public void setCheckLevel(Double checkLevel) {
        this.checkLevel = checkLevel;
    }

    public Double getOverLevel() {
        return overLevel;
    }

    public void setOverLevel(Double overLevel) {
        this.overLevel = overLevel;
    }

    public String getSortc() {
        return sortc;
    }

    public void setSortc(String sortc) {
        this.sortc = sortc;
    }

    @Override
    public String toString() {
        return "WaterStationFlood{" +
        "bcode=" + bcode +
        ", stationname=" + stationname +
        ", deathLevel=" + deathLevel +
        ", normalLevel=" + normalLevel +
        ", floodLevel=" + floodLevel +
        ", flowLevel=" + flowLevel +
        ", desigeLevel=" + desigeLevel +
        ", checkLevel=" + checkLevel +
        ", overLevel=" + overLevel +
        ", sortc=" + sortc +
        "}";
    }
}

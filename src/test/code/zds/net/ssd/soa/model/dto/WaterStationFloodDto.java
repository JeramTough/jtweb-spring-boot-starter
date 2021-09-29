package net.ssd.soa.model.entity;

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
 * @author WeiBoWen
 * @since 2021-08-24
 */
@TableName("Water_Station_Flood")
@ApiModel(value="WaterStationFlood对象", description="")
public class WaterStationFloodDto implements Serializable{

    private static final long serialVersionUID=1L;

    private String bcode;

    @TableField("stationName")
    private String stationName;

    private Double deathLevel;

    private Double normalLevel;

    private Double floodLevel;

    private Double flowLevel;

    private Double desigeLevel;

    private Double checkLevel;

    private Double overLevel;

    @TableField("sortC")
    private String sortC;


    public String getBcode() {
        return bcode;
    }

    public void setBcode(String bcode) {
        this.bcode = bcode;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
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

    public String getSortC() {
        return sortC;
    }

    public void setSortC(String sortC) {
        this.sortC = sortC;
    }

    @Override
    public String toString() {
        return "WaterStationFlood{" +
        "bcode=" + bcode +
        ", stationName=" + stationName +
        ", deathLevel=" + deathLevel +
        ", normalLevel=" + normalLevel +
        ", floodLevel=" + floodLevel +
        ", flowLevel=" + flowLevel +
        ", desigeLevel=" + desigeLevel +
        ", checkLevel=" + checkLevel +
        ", overLevel=" + overLevel +
        ", sortC=" + sortC +
        "}";
    }
}

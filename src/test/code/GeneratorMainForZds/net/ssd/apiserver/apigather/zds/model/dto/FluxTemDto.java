package net.ssd.apiserver.apigather.zds.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
 * @author WeiBoWen
 * @since 2021-03-08
 */
@TableName("FLUX_TEM")
@ApiModel(value="FluxTem对象", description="")
public class FluxTemDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("Year")
    private String year;

    @TableField("Mon")
    private String mon;

    @TableField("Day")
    private String day;

    @TableField("Station_Id_C")
    private String stationIdC;

    @TableField("TEM")
    private String tem;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getStationIdC() {
        return stationIdC;
    }

    public void setStationIdC(String stationIdC) {
        this.stationIdC = stationIdC;
    }

    public String getTem() {
        return tem;
    }

    public void setTem(String tem) {
        this.tem = tem;
    }

    @Override
    public String toString() {
        return "FluxTem{" +
        "id=" + id +
        ", year=" + year +
        ", mon=" + mon +
        ", day=" + day +
        ", stationIdC=" + stationIdC +
        ", tem=" + tem +
        "}";
    }
}

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
@ApiModel(value="WindEletriInfo对象", description="")
public class WindEletriInfoDto implements Serializable{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "运行编码")
    private String runNum;

    @ApiModelProperty(value = "经度")
    private String lon;

    @ApiModelProperty(value = "纬度")
    private String lat;

    @ApiModelProperty(value = "海拔")
    private String aititude;

    @ApiModelProperty(value = "区域编码")
    private String areaNum;

    @ApiModelProperty(value = "区域简写")
    private String areaName;

    private String exp1;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    public String getRunNum() {
        return runNum;
    }

    public void setRunNum(String runNum) {
        this.runNum = runNum;
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

    public String getAititude() {
        return aititude;
    }

    public void setAititude(String aititude) {
        this.aititude = aititude;
    }

    public String getAreaNum() {
        return areaNum;
    }

    public void setAreaNum(String areaNum) {
        this.areaNum = areaNum;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getExp1() {
        return exp1;
    }

    public void setExp1(String exp1) {
        this.exp1 = exp1;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "WindEletriInfo{" +
        "runNum=" + runNum +
        ", lon=" + lon +
        ", lat=" + lat +
        ", aititude=" + aititude +
        ", areaNum=" + areaNum +
        ", areaName=" + areaName +
        ", exp1=" + exp1 +
        ", id=" + id +
        "}";
    }
}

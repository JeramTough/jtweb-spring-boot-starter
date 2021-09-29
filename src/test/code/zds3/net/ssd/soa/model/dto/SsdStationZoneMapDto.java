package net.ssd.soa.model.entity;

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
 * @author WeiBoWen
 * @since 2021-09-14
 */
@ApiModel(value="SsdStationZoneMap对象", description="")
public class SsdStationZoneMapDto implements Serializable{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "区域代码")
    private String zoneCode;

    @ApiModelProperty(value = "子区域编号")
    private String zoneSubNum;

    @ApiModelProperty(value = "子区域名字")
    private String zoneSubName;

    @ApiModelProperty(value = "区域包含的站点")
    private String stationNums;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getZoneCode() {
        return zoneCode;
    }

    public void setZoneCode(String zoneCode) {
        this.zoneCode = zoneCode;
    }

    public String getZoneSubNum() {
        return zoneSubNum;
    }

    public void setZoneSubNum(String zoneSubNum) {
        this.zoneSubNum = zoneSubNum;
    }

    public String getZoneSubName() {
        return zoneSubName;
    }

    public void setZoneSubName(String zoneSubName) {
        this.zoneSubName = zoneSubName;
    }

    public String getStationNums() {
        return stationNums;
    }

    public void setStationNums(String stationNums) {
        this.stationNums = stationNums;
    }

    @Override
    public String toString() {
        return "SsdStationZoneMap{" +
        "id=" + id +
        ", zoneCode=" + zoneCode +
        ", zoneSubNum=" + zoneSubNum +
        ", zoneSubName=" + zoneSubName +
        ", stationNums=" + stationNums +
        "}";
    }
}

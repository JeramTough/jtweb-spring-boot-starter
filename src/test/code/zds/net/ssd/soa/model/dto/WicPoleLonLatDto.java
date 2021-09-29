package net.ssd.soa.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
 * @since 2021-08-24
 */
@TableName("WIC_POLE_LON_LAT")
@ApiModel(value="WicPoleLonLat对象", description="")
public class WicPoleLonLatDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableId("ID")
    private String iD;

    @ApiModelProperty(value = "线路名称")
    @TableField("LineName")
    private String lineName;

    @TableField("PoleNum")
    private String poleNum;

    @TableField("AdjacentStation")
    private String adjacentStation;

    @TableField("surfaceIceThickness")
    private Float surfaceIceThickness;

    @TableField("Longitude")
    private String longitude;

    @TableField("Latitude")
    private String latitude;


    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getPoleNum() {
        return poleNum;
    }

    public void setPoleNum(String poleNum) {
        this.poleNum = poleNum;
    }

    public String getAdjacentStation() {
        return adjacentStation;
    }

    public void setAdjacentStation(String adjacentStation) {
        this.adjacentStation = adjacentStation;
    }

    public Float getSurfaceIceThickness() {
        return surfaceIceThickness;
    }

    public void setSurfaceIceThickness(Float surfaceIceThickness) {
        this.surfaceIceThickness = surfaceIceThickness;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "WicPoleLonLat{" +
        "iD=" + iD +
        ", lineName=" + lineName +
        ", poleNum=" + poleNum +
        ", adjacentStation=" + adjacentStation +
        ", surfaceIceThickness=" + surfaceIceThickness +
        ", longitude=" + longitude +
        ", latitude=" + latitude +
        "}";
    }
}

package net.ssd.apiserver.apigather.zds.model.entity;

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
 * @since 2021-03-08
 */
@TableName("WIC_POLE_LON_LAT")
@ApiModel(value="WicPoleLonLat对象", description="")
public class WicPoleLonLatDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableId("ID")
    private String id;

    @ApiModelProperty(value = "线路名称")
    @TableField("LineName")
    private String linename;

    @TableField("PoleNum")
    private String polenum;

    @TableField("AdjacentStation")
    private String adjacentstation;

    @TableField("surfaceIceThickness")
    private Float surfaceicethickness;

    @TableField("Longitude")
    private String longitude;

    @TableField("Latitude")
    private String latitude;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLinename() {
        return linename;
    }

    public void setLinename(String linename) {
        this.linename = linename;
    }

    public String getPolenum() {
        return polenum;
    }

    public void setPolenum(String polenum) {
        this.polenum = polenum;
    }

    public String getAdjacentstation() {
        return adjacentstation;
    }

    public void setAdjacentstation(String adjacentstation) {
        this.adjacentstation = adjacentstation;
    }

    public Float getSurfaceicethickness() {
        return surfaceicethickness;
    }

    public void setSurfaceicethickness(Float surfaceicethickness) {
        this.surfaceicethickness = surfaceicethickness;
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
        "id=" + id +
        ", linename=" + linename +
        ", polenum=" + polenum +
        ", adjacentstation=" + adjacentstation +
        ", surfaceicethickness=" + surfaceicethickness +
        ", longitude=" + longitude +
        ", latitude=" + latitude +
        "}";
    }
}

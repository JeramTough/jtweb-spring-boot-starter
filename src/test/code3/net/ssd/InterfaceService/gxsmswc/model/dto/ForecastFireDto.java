package net.ssd.InterfaceService.gxsmswc.model.entity;

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
@ApiModel(value="ForecastFire对象", description="")
public class ForecastFireDto implements Serializable{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "纬度")
    @TableField("Lat")
    private String Lat;

    @ApiModelProperty(value = "经度")
    @TableField("Long")
    private String Long;

    @ApiModelProperty(value = "像元个数")
    @TableField("Pixels")
    private String Pixels;

    @ApiModelProperty(value = "火点像元面积,单位(km2)")
    @TableField("Pixel_Size")
    private String pixelSize;

    @ApiModelProperty(value = "过火面积，单位（hm2）表示公顷")
    @TableField("Burned_Size")
    private String burnedSize;

    @ApiModelProperty(value = "草地")
    @TableField("Grass")
    private String Grass;

    @ApiModelProperty(value = "森林")
    @TableField("Forest")
    private String Forest;

    @ApiModelProperty(value = "其他")
    @TableField("Others")
    private String Others;

    @ApiModelProperty(value = "云边缘")
    @TableField("Cloud_edge")
    private String cloudEdge;

    @ApiModelProperty(value = "行政区域编码")
    @TableField("Administrative_area")
    private String administrativeArea;

    @ApiModelProperty(value = "火灾时间")
    @TableField("FireDate")
    private String FireDate;

    private Long id;


    public String getLat() {
        return Lat;
    }

    public void setLat(String Lat) {
        this.Lat = Lat;
    }

    public String getLong() {
        return Long;
    }

    public void setLong(String Long) {
        this.Long = Long;
    }

    public String getPixels() {
        return Pixels;
    }

    public void setPixels(String Pixels) {
        this.Pixels = Pixels;
    }

    public String getPixelSize() {
        return pixelSize;
    }

    public void setPixelSize(String pixelSize) {
        this.pixelSize = pixelSize;
    }

    public String getBurnedSize() {
        return burnedSize;
    }

    public void setBurnedSize(String burnedSize) {
        this.burnedSize = burnedSize;
    }

    public String getGrass() {
        return Grass;
    }

    public void setGrass(String Grass) {
        this.Grass = Grass;
    }

    public String getForest() {
        return Forest;
    }

    public void setForest(String Forest) {
        this.Forest = Forest;
    }

    public String getOthers() {
        return Others;
    }

    public void setOthers(String Others) {
        this.Others = Others;
    }

    public String getCloudEdge() {
        return cloudEdge;
    }

    public void setCloudEdge(String cloudEdge) {
        this.cloudEdge = cloudEdge;
    }

    public String getAdministrativeArea() {
        return administrativeArea;
    }

    public void setAdministrativeArea(String administrativeArea) {
        this.administrativeArea = administrativeArea;
    }

    public String getFireDate() {
        return FireDate;
    }

    public void setFireDate(String FireDate) {
        this.FireDate = FireDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ForecastFire{" +
        "Lat=" + Lat +
        ", Long=" + Long +
        ", Pixels=" + Pixels +
        ", pixelSize=" + pixelSize +
        ", burnedSize=" + burnedSize +
        ", Grass=" + Grass +
        ", Forest=" + Forest +
        ", Others=" + Others +
        ", cloudEdge=" + cloudEdge +
        ", administrativeArea=" + administrativeArea +
        ", FireDate=" + FireDate +
        ", id=" + id +
        "}";
    }
}

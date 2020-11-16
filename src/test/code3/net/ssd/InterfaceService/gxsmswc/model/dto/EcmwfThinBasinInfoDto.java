package net.ssd.InterfaceService.gxsmswc.model.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * EC细网格流域信息表
 * </p>
 *
 * @author JeramTough
 * @since 2020-09-16
 */
@ApiModel(value="EcmwfThinBasinInfo对象", description="EC细网格流域信息表")
public class EcmwfThinBasinInfoDto implements Serializable{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自增长ID")
    private Long id;

    @ApiModelProperty(value = "流域代码")
    private String basinCode;

    @ApiModelProperty(value = "经度")
    private String longitude;

    @ApiModelProperty(value = "纬度")
    private String latitude;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBasinCode() {
        return basinCode;
    }

    public void setBasinCode(String basinCode) {
        this.basinCode = basinCode;
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
        return "EcmwfThinBasinInfo{" +
        "id=" + id +
        ", basinCode=" + basinCode +
        ", longitude=" + longitude +
        ", latitude=" + latitude +
        "}";
    }
}

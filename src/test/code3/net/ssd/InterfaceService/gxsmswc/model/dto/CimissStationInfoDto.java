package net.ssd.InterfaceService.gxsmswc.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * CIMISS站点信息
 * </p>
 *
 * @author JeramTough
 * @since 2020-09-16
 */
@ApiModel(value="CimissStationInfo对象", description="CIMISS站点信息")
public class CimissStationInfoDto implements Serializable{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自增长主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "区站号(字符)")
    @TableField("Station_Id_C")
    private String stationIdC;

    @ApiModelProperty(value = "区站号(数字)")
    @TableField("Station_Id_d")
    private String stationIdD;

    @ApiModelProperty(value = "站点名")
    @TableField("Station_Name")
    private String stationName;

    @ApiModelProperty(value = "省")
    @TableField("Province")
    private String Province;

    @ApiModelProperty(value = "市")
    @TableField("City")
    private String City;

    @ApiModelProperty(value = "县")
    @TableField("Cnty")
    private String Cnty;

    @ApiModelProperty(value = "行政区代码")
    @TableField("Admin_Code_CHN")
    private String adminCodeChn;

    @ApiModelProperty(value = "经度")
    @TableField("Lon")
    private String Lon;

    @ApiModelProperty(value = "纬度")
    @TableField("Lat")
    private String Lat;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStationIdC() {
        return stationIdC;
    }

    public void setStationIdC(String stationIdC) {
        this.stationIdC = stationIdC;
    }

    public String getStationIdD() {
        return stationIdD;
    }

    public void setStationIdD(String stationIdD) {
        this.stationIdD = stationIdD;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String Province) {
        this.Province = Province;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getCnty() {
        return Cnty;
    }

    public void setCnty(String Cnty) {
        this.Cnty = Cnty;
    }

    public String getAdminCodeChn() {
        return adminCodeChn;
    }

    public void setAdminCodeChn(String adminCodeChn) {
        this.adminCodeChn = adminCodeChn;
    }

    public String getLon() {
        return Lon;
    }

    public void setLon(String Lon) {
        this.Lon = Lon;
    }

    public String getLat() {
        return Lat;
    }

    public void setLat(String Lat) {
        this.Lat = Lat;
    }

    @Override
    public String toString() {
        return "CimissStationInfo{" +
        "id=" + id +
        ", stationIdC=" + stationIdC +
        ", stationIdD=" + stationIdD +
        ", stationName=" + stationName +
        ", Province=" + Province +
        ", City=" + City +
        ", Cnty=" + Cnty +
        ", adminCodeChn=" + adminCodeChn +
        ", Lon=" + Lon +
        ", Lat=" + Lat +
        "}";
    }
}

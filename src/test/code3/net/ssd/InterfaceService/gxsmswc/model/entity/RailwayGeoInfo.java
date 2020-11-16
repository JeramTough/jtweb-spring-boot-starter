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
@ApiModel(value="RailwayGeoInfo对象", description="")
public class RailwayGeoInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自增长ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "线路编号")
    private Integer lineNum;

    @ApiModelProperty(value = "线路代码")
    private String lineCode;

    @ApiModelProperty(value = "线路名称")
    private String lineName;

    @ApiModelProperty(value = "路局编号")
    private String departmentNum;

    @ApiModelProperty(value = "路局代码")
    private String departmentCode;

    @ApiModelProperty(value = "路局名称")
    private String departmentName;

    @ApiModelProperty(value = "地理信息")
    private String geographic;

    @ApiModelProperty(value = "经度")
    private String longitude;

    @ApiModelProperty(value = "纬度")
    private String latitude;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLineNum() {
        return lineNum;
    }

    public void setLineNum(Integer lineNum) {
        this.lineNum = lineNum;
    }

    public String getLineCode() {
        return lineCode;
    }

    public void setLineCode(String lineCode) {
        this.lineCode = lineCode;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getDepartmentNum() {
        return departmentNum;
    }

    public void setDepartmentNum(String departmentNum) {
        this.departmentNum = departmentNum;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getGeographic() {
        return geographic;
    }

    public void setGeographic(String geographic) {
        this.geographic = geographic;
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
        return "RailwayGeoInfo{" +
        "id=" + id +
        ", lineNum=" + lineNum +
        ", lineCode=" + lineCode +
        ", lineName=" + lineName +
        ", departmentNum=" + departmentNum +
        ", departmentCode=" + departmentCode +
        ", departmentName=" + departmentName +
        ", geographic=" + geographic +
        ", longitude=" + longitude +
        ", latitude=" + latitude +
        "}";
    }
}

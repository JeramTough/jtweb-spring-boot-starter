package net.ssd.InterfaceService.gxsmswc.model.entity;

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
 * @author JeramTough
 * @since 2020-09-16
 */
@TableName("Ssd_AWS_Station")
@ApiModel(value="SsdAwsStation对象", description="")
public class SsdAwsStation implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    @TableField("Memo")
    private String Memo;

    @TableField("Latitude")
    private String Latitude;

    @TableField("StationKey")
    private String StationKey;

    @TableField("StationID")
    private Integer StationID;

    @TableField("Exp3")
    private String Exp3;

    @TableField("LinkMan")
    private String LinkMan;

    @TableField("areaNo")
    private String areaNo;

    @TableField("Exp1")
    private String Exp1;

    @TableField("StationNum")
    private String StationNum;

    @TableField("City")
    private String City;

    private String sort;

    @TableField("StationType")
    private Integer StationType;

    @TableField("County")
    private String County;

    @TableField("Exp2")
    private String Exp2;

    @TableField("LinkTelNo")
    private String LinkTelNo;

    @TableField("Hight")
    private String Hight;

    @TableField("Province")
    private String Province;

    @TableField("StationName")
    private String StationName;

    @TableField("Longitude")
    private String Longitude;

    @TableField("Address")
    private String Address;

    private Integer visible;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMemo() {
        return Memo;
    }

    public void setMemo(String Memo) {
        this.Memo = Memo;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String Latitude) {
        this.Latitude = Latitude;
    }

    public String getStationKey() {
        return StationKey;
    }

    public void setStationKey(String StationKey) {
        this.StationKey = StationKey;
    }

    public Integer getStationID() {
        return StationID;
    }

    public void setStationID(Integer StationID) {
        this.StationID = StationID;
    }

    public String getExp3() {
        return Exp3;
    }

    public void setExp3(String Exp3) {
        this.Exp3 = Exp3;
    }

    public String getLinkMan() {
        return LinkMan;
    }

    public void setLinkMan(String LinkMan) {
        this.LinkMan = LinkMan;
    }

    public String getAreaNo() {
        return areaNo;
    }

    public void setAreaNo(String areaNo) {
        this.areaNo = areaNo;
    }

    public String getExp1() {
        return Exp1;
    }

    public void setExp1(String Exp1) {
        this.Exp1 = Exp1;
    }

    public String getStationNum() {
        return StationNum;
    }

    public void setStationNum(String StationNum) {
        this.StationNum = StationNum;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public Integer getStationType() {
        return StationType;
    }

    public void setStationType(Integer StationType) {
        this.StationType = StationType;
    }

    public String getCounty() {
        return County;
    }

    public void setCounty(String County) {
        this.County = County;
    }

    public String getExp2() {
        return Exp2;
    }

    public void setExp2(String Exp2) {
        this.Exp2 = Exp2;
    }

    public String getLinkTelNo() {
        return LinkTelNo;
    }

    public void setLinkTelNo(String LinkTelNo) {
        this.LinkTelNo = LinkTelNo;
    }

    public String getHight() {
        return Hight;
    }

    public void setHight(String Hight) {
        this.Hight = Hight;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String Province) {
        this.Province = Province;
    }

    public String getStationName() {
        return StationName;
    }

    public void setStationName(String StationName) {
        this.StationName = StationName;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String Longitude) {
        this.Longitude = Longitude;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }

    @Override
    public String toString() {
        return "SsdAwsStation{" +
        "id=" + id +
        ", Memo=" + Memo +
        ", Latitude=" + Latitude +
        ", StationKey=" + StationKey +
        ", StationID=" + StationID +
        ", Exp3=" + Exp3 +
        ", LinkMan=" + LinkMan +
        ", areaNo=" + areaNo +
        ", Exp1=" + Exp1 +
        ", StationNum=" + StationNum +
        ", City=" + City +
        ", sort=" + sort +
        ", StationType=" + StationType +
        ", County=" + County +
        ", Exp2=" + Exp2 +
        ", LinkTelNo=" + LinkTelNo +
        ", Hight=" + Hight +
        ", Province=" + Province +
        ", StationName=" + StationName +
        ", Longitude=" + Longitude +
        ", Address=" + Address +
        ", visible=" + visible +
        "}";
    }
}

package com.jeramtough.randl2.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 站点信息表
 * </p>
 *
 * @author JeramTough
 * @since 2021-03-16
 */
@ApiModel(value="SsdStationInfo对象", description="站点信息表")
public class SsdStationInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

  /**
   * 站点编号
   */
    @TableField("StationNum")
    private String stationnum;

  /**
   * 站名
   */
    @TableField("StationName")
    private String stationname;

  /**
   * id
   */
    @TableField("StationID")
    private String stationid;

  /**
   * 站点类型
   */
    @TableField("StationType")
    private String stationtype;

  /**
   * 经度
   */
    @TableField("Longitude")
    private String longitude;

  /**
   * 纬度
   */
    @TableField("Latitude")
    private String latitude;

    @TableField("Hight")
    private String hight;

  /**
   * 省
   */
    @TableField("Province")
    private String province;

  /**
   * 市
   */
    @TableField("City")
    private String city;

  /**
   * 县（区）级
   */
    @TableField("County")
    private String county;

  /**
   * 地址
   */
    @TableField("Address")
    private String address;

    @TableField("LinkMan")
    private String linkman;

    @TableField("LinkTelNo")
    private String linktelno;

    @TableField("Memo")
    private String memo;

  /**
   * 市级编码
   */
    @TableField("Exp1")
    private String exp1;

  /**
   * 县级编码
   */
    @TableField("Exp2")
    private String exp2;

    @TableField("Exp3")
    private String exp3;

    @TableField("areaNo")
    private String areano;

    private String visible;

    @TableField("StationKey")
    private String stationkey;

    private String sort;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStationnum() {
        return stationnum;
    }

    public void setStationnum(String stationnum) {
        this.stationnum = stationnum;
    }

    public String getStationname() {
        return stationname;
    }

    public void setStationname(String stationname) {
        this.stationname = stationname;
    }

    public String getStationid() {
        return stationid;
    }

    public void setStationid(String stationid) {
        this.stationid = stationid;
    }

    public String getStationtype() {
        return stationtype;
    }

    public void setStationtype(String stationtype) {
        this.stationtype = stationtype;
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

    public String getHight() {
        return hight;
    }

    public void setHight(String hight) {
        this.hight = hight;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getLinktelno() {
        return linktelno;
    }

    public void setLinktelno(String linktelno) {
        this.linktelno = linktelno;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getExp1() {
        return exp1;
    }

    public void setExp1(String exp1) {
        this.exp1 = exp1;
    }

    public String getExp2() {
        return exp2;
    }

    public void setExp2(String exp2) {
        this.exp2 = exp2;
    }

    public String getExp3() {
        return exp3;
    }

    public void setExp3(String exp3) {
        this.exp3 = exp3;
    }

    public String getAreano() {
        return areano;
    }

    public void setAreano(String areano) {
        this.areano = areano;
    }

    public String getVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

    public String getStationkey() {
        return stationkey;
    }

    public void setStationkey(String stationkey) {
        this.stationkey = stationkey;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "SsdStationInfo{" +
        "id=" + id +
        ", stationnum=" + stationnum +
        ", stationname=" + stationname +
        ", stationid=" + stationid +
        ", stationtype=" + stationtype +
        ", longitude=" + longitude +
        ", latitude=" + latitude +
        ", hight=" + hight +
        ", province=" + province +
        ", city=" + city +
        ", county=" + county +
        ", address=" + address +
        ", linkman=" + linkman +
        ", linktelno=" + linktelno +
        ", memo=" + memo +
        ", exp1=" + exp1 +
        ", exp2=" + exp2 +
        ", exp3=" + exp3 +
        ", areano=" + areano +
        ", visible=" + visible +
        ", stationkey=" + stationkey +
        ", sort=" + sort +
        "}";
    }
}

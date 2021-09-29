package net.ssd.soa.model.entity;

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
 * @author WeiBoWen
 * @since 2021-09-14
 */
@ApiModel(value="SsdStationInfo对象", description="站点信息表")
public class SsdStationInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Long iD;

  /**
   * 站点编号
   */
    @TableField("StationNum")
    private String stationNum;

  /**
   * 站名
   */
    @TableField("StationName")
    private String stationName;

  /**
   * id
   */
    @TableField("StationID")
    private String stationID;

  /**
   * 站点类型
   */
    @TableField("StationType")
    private String stationType;

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
    private String linkMan;

    @TableField("LinkTelNo")
    private String linkTelNo;

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
    private String areaNo;

    private String visible;

    @TableField("StationKey")
    private String stationKey;

    private String sort;


    public Long getiD() {
        return iD;
    }

    public void setiD(Long iD) {
        this.iD = iD;
    }

    public String getStationNum() {
        return stationNum;
    }

    public void setStationNum(String stationNum) {
        this.stationNum = stationNum;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getStationID() {
        return stationID;
    }

    public void setStationID(String stationID) {
        this.stationID = stationID;
    }

    public String getStationType() {
        return stationType;
    }

    public void setStationType(String stationType) {
        this.stationType = stationType;
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

    public String getLinkMan() {
        return linkMan;
    }

    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan;
    }

    public String getLinkTelNo() {
        return linkTelNo;
    }

    public void setLinkTelNo(String linkTelNo) {
        this.linkTelNo = linkTelNo;
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

    public String getAreaNo() {
        return areaNo;
    }

    public void setAreaNo(String areaNo) {
        this.areaNo = areaNo;
    }

    public String getVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

    public String getStationKey() {
        return stationKey;
    }

    public void setStationKey(String stationKey) {
        this.stationKey = stationKey;
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
        "iD=" + iD +
        ", stationNum=" + stationNum +
        ", stationName=" + stationName +
        ", stationID=" + stationID +
        ", stationType=" + stationType +
        ", longitude=" + longitude +
        ", latitude=" + latitude +
        ", hight=" + hight +
        ", province=" + province +
        ", city=" + city +
        ", county=" + county +
        ", address=" + address +
        ", linkMan=" + linkMan +
        ", linkTelNo=" + linkTelNo +
        ", memo=" + memo +
        ", exp1=" + exp1 +
        ", exp2=" + exp2 +
        ", exp3=" + exp3 +
        ", areaNo=" + areaNo +
        ", visible=" + visible +
        ", stationKey=" + stationKey +
        ", sort=" + sort +
        "}";
    }
}

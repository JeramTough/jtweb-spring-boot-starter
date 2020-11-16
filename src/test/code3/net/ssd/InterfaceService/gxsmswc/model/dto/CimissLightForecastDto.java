package net.ssd.InterfaceService.gxsmswc.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * CIMISS闪电预报
 * </p>
 *
 * @author JeramTough
 * @since 2020-09-16
 */
@ApiModel(value="CimissLightForecast对象", description="CIMISS闪电预报")
public class CimissLightForecastDto implements Serializable{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自增长主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "资料时间")
    @TableField("DateTime")
    private String DateTime;

    @ApiModelProperty(value = "记录标识")
    @TableField("RECORD_ID")
    private String recordId;

    @ApiModelProperty(value = "更新时间")
    @TableField("UPDATE_TIME")
    private String updateTime;

    @ApiModelProperty(value = "资料标识")
    @TableField("DATA_ID")
    private String dataId;

    @ApiModelProperty(value = "更正报标志")
    @TableField("REP_CORR_ID")
    private String repCorrId;

    @ApiModelProperty(value = "区站号(字符)")
    @TableField("Station_Id_C")
    private String stationIdC;

    @ApiModelProperty(value = "区站号(数字)")
    @TableField("Station_Id_d")
    private String stationIdD;

    @ApiModelProperty(value = "纬度")
    @TableField("Lat")
    private String Lat;

    @ApiModelProperty(value = "经度")
    @TableField("Lon")
    private String Lon;

    @ApiModelProperty(value = "采样高度")
    @TableField("Samp_Heigh")
    private String sampHeigh;

    @ApiModelProperty(value = "行政区域代码")
    @TableField("Admin_Code_CHN")
    private String adminCodeChn;

    @ApiModelProperty(value = "年")
    @TableField("Year")
    private String Year;

    @ApiModelProperty(value = "月")
    @TableField("Mon")
    private String Mon;

    @ApiModelProperty(value = "日")
    @TableField("Day")
    private String Day;

    @ApiModelProperty(value = "时")
    @TableField("Hour")
    private String Hour;

    @ApiModelProperty(value = "分")
    @TableField("Min")
    private String Min;

    @ApiModelProperty(value = "秒")
    @TableField("Second")
    private String Second;

    @ApiModelProperty(value = "毫秒")
    @TableField("MSecond")
    private String MSecond;

    @ApiModelProperty(value = "省")
    @TableField("Lit_Prov")
    private String litProv;

    @ApiModelProperty(value = "市")
    @TableField("Lit_City")
    private String litCity;

    @ApiModelProperty(value = "县")
    @TableField("Lit_Cnty")
    private String litCnty;

    @ApiModelProperty(value = "乡镇")
    @TableField("Lit_Town")
    private String litTown;

    @ApiModelProperty(value = "村")
    @TableField("Lit_Vlg")
    private String litVlg;

    @ApiModelProperty(value = "采样高度")
    @TableField("Lit_Current")
    private String litCurrent;

    @ApiModelProperty(value = "回击最大陡度")
    @TableField("MARS_3")
    private String mars3;

    @ApiModelProperty(value = "定位误差")
    @TableField("Pois_Err")
    private String poisErr;

    @ApiModelProperty(value = "定位方式")
    @TableField("Pois_Type")
    private String poisType;

    @ApiModelProperty(value = "三维闪电定位标志位")
    @TableField("LILFLAG")
    private String lilflag;

    @ApiModelProperty(value = "闪电定位仪编号")
    @TableField("LILCODE")
    private String lilcode;

    @ApiModelProperty(value = "云/地闪类型")
    @TableField("LILType")
    private String LILType;

    @ApiModelProperty(value = "收到时间")
    @TableField("RYMDHM")
    private String rymdhm;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String DateTime) {
        this.DateTime = DateTime;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public String getRepCorrId() {
        return repCorrId;
    }

    public void setRepCorrId(String repCorrId) {
        this.repCorrId = repCorrId;
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

    public String getLat() {
        return Lat;
    }

    public void setLat(String Lat) {
        this.Lat = Lat;
    }

    public String getLon() {
        return Lon;
    }

    public void setLon(String Lon) {
        this.Lon = Lon;
    }

    public String getSampHeigh() {
        return sampHeigh;
    }

    public void setSampHeigh(String sampHeigh) {
        this.sampHeigh = sampHeigh;
    }

    public String getAdminCodeChn() {
        return adminCodeChn;
    }

    public void setAdminCodeChn(String adminCodeChn) {
        this.adminCodeChn = adminCodeChn;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    public String getMon() {
        return Mon;
    }

    public void setMon(String Mon) {
        this.Mon = Mon;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String Day) {
        this.Day = Day;
    }

    public String getHour() {
        return Hour;
    }

    public void setHour(String Hour) {
        this.Hour = Hour;
    }

    public String getMin() {
        return Min;
    }

    public void setMin(String Min) {
        this.Min = Min;
    }

    public String getSecond() {
        return Second;
    }

    public void setSecond(String Second) {
        this.Second = Second;
    }

    public String getMSecond() {
        return MSecond;
    }

    public void setMSecond(String MSecond) {
        this.MSecond = MSecond;
    }

    public String getLitProv() {
        return litProv;
    }

    public void setLitProv(String litProv) {
        this.litProv = litProv;
    }

    public String getLitCity() {
        return litCity;
    }

    public void setLitCity(String litCity) {
        this.litCity = litCity;
    }

    public String getLitCnty() {
        return litCnty;
    }

    public void setLitCnty(String litCnty) {
        this.litCnty = litCnty;
    }

    public String getLitTown() {
        return litTown;
    }

    public void setLitTown(String litTown) {
        this.litTown = litTown;
    }

    public String getLitVlg() {
        return litVlg;
    }

    public void setLitVlg(String litVlg) {
        this.litVlg = litVlg;
    }

    public String getLitCurrent() {
        return litCurrent;
    }

    public void setLitCurrent(String litCurrent) {
        this.litCurrent = litCurrent;
    }

    public String getMars3() {
        return mars3;
    }

    public void setMars3(String mars3) {
        this.mars3 = mars3;
    }

    public String getPoisErr() {
        return poisErr;
    }

    public void setPoisErr(String poisErr) {
        this.poisErr = poisErr;
    }

    public String getPoisType() {
        return poisType;
    }

    public void setPoisType(String poisType) {
        this.poisType = poisType;
    }

    public String getLilflag() {
        return lilflag;
    }

    public void setLilflag(String lilflag) {
        this.lilflag = lilflag;
    }

    public String getLilcode() {
        return lilcode;
    }

    public void setLilcode(String lilcode) {
        this.lilcode = lilcode;
    }

    public String getLILType() {
        return LILType;
    }

    public void setLILType(String LILType) {
        this.LILType = LILType;
    }

    public String getRymdhm() {
        return rymdhm;
    }

    public void setRymdhm(String rymdhm) {
        this.rymdhm = rymdhm;
    }

    @Override
    public String toString() {
        return "CimissLightForecast{" +
        "id=" + id +
        ", DateTime=" + DateTime +
        ", recordId=" + recordId +
        ", updateTime=" + updateTime +
        ", dataId=" + dataId +
        ", repCorrId=" + repCorrId +
        ", stationIdC=" + stationIdC +
        ", stationIdD=" + stationIdD +
        ", Lat=" + Lat +
        ", Lon=" + Lon +
        ", sampHeigh=" + sampHeigh +
        ", adminCodeChn=" + adminCodeChn +
        ", Year=" + Year +
        ", Mon=" + Mon +
        ", Day=" + Day +
        ", Hour=" + Hour +
        ", Min=" + Min +
        ", Second=" + Second +
        ", MSecond=" + MSecond +
        ", litProv=" + litProv +
        ", litCity=" + litCity +
        ", litCnty=" + litCnty +
        ", litTown=" + litTown +
        ", litVlg=" + litVlg +
        ", litCurrent=" + litCurrent +
        ", mars3=" + mars3 +
        ", poisErr=" + poisErr +
        ", poisType=" + poisType +
        ", lilflag=" + lilflag +
        ", lilcode=" + lilcode +
        ", LILType=" + LILType +
        ", rymdhm=" + rymdhm +
        "}";
    }
}

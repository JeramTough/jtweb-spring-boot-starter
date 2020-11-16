package net.ssd.InterfaceService.gxsmswc.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
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
@TableName("Ssd_Cimiss_Hour_Data")
@ApiModel(value="SsdCimissHourData对象", description="")
public class SsdCimissHourDataDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableField("SynTime")
    private LocalDateTime SynTime;

    @TableField("ID")
    private Long id;

    @TableField("Alti")
    private String Alti;

    @TableField("FRS_2ed_Top")
    private String frs2edTop;

    @TableField("Win_D_Avg_10mi")
    private String winDAvg10mi;

    @TableField("InstantWindV")
    private String InstantWindV;

    @TableField("CLO_Fome1")
    private String cloFome1;

    @TableField("CLO_Fome7")
    private String cloFome7;

    @TableField("EVP_Big")
    private String evpBig;

    @TableField("GST_15cm")
    private String gst15cm;

    @TableField("Temp")
    private String Temp;

    @TableField("LGST")
    private String lgst;

    @TableField("MaxTemp_24h")
    private String maxtemp24h;

    @TableField("CLO_Fome_Mid")
    private String cloFomeMid;

    @TableField("MaxWindV")
    private String MaxWindV;

    @TableField("StationName")
    private String StationName;

    @TableField("ObserTime")
    private String ObserTime;

    @TableField("ExMaxWindTime")
    private String ExMaxWindTime;

    @TableField("Snow_PRS")
    private String snowPrs;

    @TableField("CLO_Fome4")
    private String cloFome4;

    @TableField("PRS_Max_OTime")
    private String prsMaxOtime;

    @TableField("GST_Min")
    private String gstMin;

    @TableField("GST_80cm")
    private String gst80cm;

    @TableField("CLO_Cov_Low")
    private String cloCovLow;

    @TableField("MinTemp")
    private String MinTemp;

    @TableField("RelHum")
    private String RelHum;

    @TableField("LGST_Min")
    private String lgstMin;

    @TableField("VIS_Hor_1mi")
    private String visHor1mi;

    @TableField("WEP_Past2")
    private String wepPast2;

    @TableField("CLO_Fome_Low")
    private String cloFomeLow;

    @TableField("MaxWindD")
    private String MaxWindD;

    @TableField("GST")
    private String gst;

    @TableField("ObserDate")
    private String ObserDate;

    @TableField("ExMaxWindV")
    private String ExMaxWindV;

    @TableField("CLO_Fome3")
    private String cloFome3;

    @TableField("GST_40cm")
    private String gst40cm;

    @TableField("PRS_Change_3h")
    private String prsChange3h;

    @TableField("MaxTempTime")
    private String MaxTempTime;

    @TableField("PRE_3h")
    private String pre3h;

    @TableField("LGST_Max_OTime")
    private String lgstMaxOtime;

    @TableField("VIS_Min_OTime")
    private String visMinOtime;

    @TableField("DPT")
    private String dpt;

    @TableField("Lon")
    private String Lon;

    @TableField("WEP_Now")
    private String wepNow;

    @TableField("InstantWindD")
    private String InstantWindD;

    @TableField("ExMaxWindV_6h")
    private String exmaxwindv6h;

    @TableField("DataType")
    private Integer DataType;

    @TableField("WIN_S_Sensor_Height")
    private String winSSensorHeight;

    @TableField("PRE_24h")
    private String pre24h;

    @TableField("CLO_Fome6")
    private String cloFome6;

    @TableField("GST_320cm")
    private String gst320cm;

    @TableField("MinRelHumTime")
    private String MinRelHumTime;

    @TableField("TempChange_24h")
    private String tempchange24h;

    @TableField("Lat")
    private String Lat;

    @TableField("CLO_Fome_Hign")
    private String cloFomeHign;

    @TableField("ExMaxWindD_6h")
    private String exmaxwindd6h;

    @TableField("StationNum_C")
    private String stationnumC;

    @TableField("Snow_Depth")
    private String snowDepth;

    @TableField("PRS_Max")
    private String prsMax;

    @TableField("PRE_12h")
    private String pre12h;

    @TableField("Win_S_Avg_2mi")
    private String winSAvg2mi;

    @TableField("GST_Max_OTime")
    private String gstMaxOtime;

    @TableField("CLO_Cov")
    private String cloCov;

    @TableField("MinRelHum")
    private String MinRelHum;

    @TableField("LGST_Min_OTime")
    private String lgstMinOtime;

    @TableField("MinTemp_24h")
    private String mintemp24h;

    @TableField("PRS_Sensor_Alti")
    private String prsSensorAlti;

    @TableField("ExMaxWindV_12h")
    private String exmaxwindv12h;

    @TableField("WEP_Past1")
    private String wepPast1;

    @TableField("FRS_1st_bot")
    private String frs1stBot;

    @TableField("ExMaxWindD")
    private String ExMaxWindD;

    @TableField("PRE")
    private String pre;

    @TableField("CLO_Fome8")
    private String cloFome8;

    @TableField("PRS_Sea")
    private String prsSea;

    @TableField("GST_10cm")
    private String gst10cm;

    @TableField("PRE_1h")
    private String pre1h;

    @TableField("LGST_Max")
    private String lgstMax;

    @TableField("CLO_Height_LoM")
    private String cloHeightLom;

    @TableField("PRS_Min_OTime")
    private String prsMinOtime;

    @TableField("VIS_Min")
    private String visMin;

    @TableField("ExMaxWindD_12h")
    private String exmaxwindd12h;

    @TableField("WEP_Past_CYC")
    private String wepPastCyc;

    @TableField("FRS_1st_Top")
    private String frs1stTop;

    @TableField("MaxWindTime")
    private String MaxWindTime;

    @TableField("StationType")
    private Integer StationType;

    @TableField("PRS")
    private String prs;

    @TableField("PRS_Min")
    private String prsMin;

    @TableField("GST_Min_OTime")
    private String gstMinOtime;

    @TableField("PRE_Arti_Enc_CYC")
    private String preArtiEncCyc;

    @TableField("CLO_Fome5")
    private String cloFome5;

    @TableField("GST_160cm")
    private String gst160cm;

    @TableField("VAP")
    private String vap;

    @TableField("CLO_Cov_LM")
    private String cloCovLm;

    @TableField("MinTempTime")
    private String MinTempTime;

    @TableField("VIS_Hor_10mi")
    private String visHor10mi;

    @TableField("SCO")
    private String sco;

    @TableField("SynFlag")
    private String SynFlag;

    @TableField("FRS_2ed_bot")
    private String frs2edBot;

    @TableField("StationNum")
    private String StationNum;

    @TableField("GST_Max")
    private String gstMax;

    @TableField("Win_S_Avg_10mi")
    private String winSAvg10mi;

    @TableField("PRS_Change_24h")
    private String prsChange24h;

    @TableField("PRE_6h")
    private String pre6h;

    @TableField("Win_D_Avg_2mi")
    private String winDAvg2mi;

    @TableField("CLO_Fome2")
    private String cloFome2;

    @TableField("GST_20cm")
    private String gst20cm;

    @TableField("MaxTemp")
    private String MaxTemp;

    @TableField("VIS")
    private String vis;


    public LocalDateTime getSynTime() {
        return SynTime;
    }

    public void setSynTime(LocalDateTime SynTime) {
        this.SynTime = SynTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlti() {
        return Alti;
    }

    public void setAlti(String Alti) {
        this.Alti = Alti;
    }

    public String getFrs2edTop() {
        return frs2edTop;
    }

    public void setFrs2edTop(String frs2edTop) {
        this.frs2edTop = frs2edTop;
    }

    public String getWinDAvg10mi() {
        return winDAvg10mi;
    }

    public void setWinDAvg10mi(String winDAvg10mi) {
        this.winDAvg10mi = winDAvg10mi;
    }

    public String getInstantWindV() {
        return InstantWindV;
    }

    public void setInstantWindV(String InstantWindV) {
        this.InstantWindV = InstantWindV;
    }

    public String getCloFome1() {
        return cloFome1;
    }

    public void setCloFome1(String cloFome1) {
        this.cloFome1 = cloFome1;
    }

    public String getCloFome7() {
        return cloFome7;
    }

    public void setCloFome7(String cloFome7) {
        this.cloFome7 = cloFome7;
    }

    public String getEvpBig() {
        return evpBig;
    }

    public void setEvpBig(String evpBig) {
        this.evpBig = evpBig;
    }

    public String getGst15cm() {
        return gst15cm;
    }

    public void setGst15cm(String gst15cm) {
        this.gst15cm = gst15cm;
    }

    public String getTemp() {
        return Temp;
    }

    public void setTemp(String Temp) {
        this.Temp = Temp;
    }

    public String getLgst() {
        return lgst;
    }

    public void setLgst(String lgst) {
        this.lgst = lgst;
    }

    public String getMaxtemp24h() {
        return maxtemp24h;
    }

    public void setMaxtemp24h(String maxtemp24h) {
        this.maxtemp24h = maxtemp24h;
    }

    public String getCloFomeMid() {
        return cloFomeMid;
    }

    public void setCloFomeMid(String cloFomeMid) {
        this.cloFomeMid = cloFomeMid;
    }

    public String getMaxWindV() {
        return MaxWindV;
    }

    public void setMaxWindV(String MaxWindV) {
        this.MaxWindV = MaxWindV;
    }

    public String getStationName() {
        return StationName;
    }

    public void setStationName(String StationName) {
        this.StationName = StationName;
    }

    public String getObserTime() {
        return ObserTime;
    }

    public void setObserTime(String ObserTime) {
        this.ObserTime = ObserTime;
    }

    public String getExMaxWindTime() {
        return ExMaxWindTime;
    }

    public void setExMaxWindTime(String ExMaxWindTime) {
        this.ExMaxWindTime = ExMaxWindTime;
    }

    public String getSnowPrs() {
        return snowPrs;
    }

    public void setSnowPrs(String snowPrs) {
        this.snowPrs = snowPrs;
    }

    public String getCloFome4() {
        return cloFome4;
    }

    public void setCloFome4(String cloFome4) {
        this.cloFome4 = cloFome4;
    }

    public String getPrsMaxOtime() {
        return prsMaxOtime;
    }

    public void setPrsMaxOtime(String prsMaxOtime) {
        this.prsMaxOtime = prsMaxOtime;
    }

    public String getGstMin() {
        return gstMin;
    }

    public void setGstMin(String gstMin) {
        this.gstMin = gstMin;
    }

    public String getGst80cm() {
        return gst80cm;
    }

    public void setGst80cm(String gst80cm) {
        this.gst80cm = gst80cm;
    }

    public String getCloCovLow() {
        return cloCovLow;
    }

    public void setCloCovLow(String cloCovLow) {
        this.cloCovLow = cloCovLow;
    }

    public String getMinTemp() {
        return MinTemp;
    }

    public void setMinTemp(String MinTemp) {
        this.MinTemp = MinTemp;
    }

    public String getRelHum() {
        return RelHum;
    }

    public void setRelHum(String RelHum) {
        this.RelHum = RelHum;
    }

    public String getLgstMin() {
        return lgstMin;
    }

    public void setLgstMin(String lgstMin) {
        this.lgstMin = lgstMin;
    }

    public String getVisHor1mi() {
        return visHor1mi;
    }

    public void setVisHor1mi(String visHor1mi) {
        this.visHor1mi = visHor1mi;
    }

    public String getWepPast2() {
        return wepPast2;
    }

    public void setWepPast2(String wepPast2) {
        this.wepPast2 = wepPast2;
    }

    public String getCloFomeLow() {
        return cloFomeLow;
    }

    public void setCloFomeLow(String cloFomeLow) {
        this.cloFomeLow = cloFomeLow;
    }

    public String getMaxWindD() {
        return MaxWindD;
    }

    public void setMaxWindD(String MaxWindD) {
        this.MaxWindD = MaxWindD;
    }

    public String getGst() {
        return gst;
    }

    public void setGst(String gst) {
        this.gst = gst;
    }

    public String getObserDate() {
        return ObserDate;
    }

    public void setObserDate(String ObserDate) {
        this.ObserDate = ObserDate;
    }

    public String getExMaxWindV() {
        return ExMaxWindV;
    }

    public void setExMaxWindV(String ExMaxWindV) {
        this.ExMaxWindV = ExMaxWindV;
    }

    public String getCloFome3() {
        return cloFome3;
    }

    public void setCloFome3(String cloFome3) {
        this.cloFome3 = cloFome3;
    }

    public String getGst40cm() {
        return gst40cm;
    }

    public void setGst40cm(String gst40cm) {
        this.gst40cm = gst40cm;
    }

    public String getPrsChange3h() {
        return prsChange3h;
    }

    public void setPrsChange3h(String prsChange3h) {
        this.prsChange3h = prsChange3h;
    }

    public String getMaxTempTime() {
        return MaxTempTime;
    }

    public void setMaxTempTime(String MaxTempTime) {
        this.MaxTempTime = MaxTempTime;
    }

    public String getPre3h() {
        return pre3h;
    }

    public void setPre3h(String pre3h) {
        this.pre3h = pre3h;
    }

    public String getLgstMaxOtime() {
        return lgstMaxOtime;
    }

    public void setLgstMaxOtime(String lgstMaxOtime) {
        this.lgstMaxOtime = lgstMaxOtime;
    }

    public String getVisMinOtime() {
        return visMinOtime;
    }

    public void setVisMinOtime(String visMinOtime) {
        this.visMinOtime = visMinOtime;
    }

    public String getDpt() {
        return dpt;
    }

    public void setDpt(String dpt) {
        this.dpt = dpt;
    }

    public String getLon() {
        return Lon;
    }

    public void setLon(String Lon) {
        this.Lon = Lon;
    }

    public String getWepNow() {
        return wepNow;
    }

    public void setWepNow(String wepNow) {
        this.wepNow = wepNow;
    }

    public String getInstantWindD() {
        return InstantWindD;
    }

    public void setInstantWindD(String InstantWindD) {
        this.InstantWindD = InstantWindD;
    }

    public String getExmaxwindv6h() {
        return exmaxwindv6h;
    }

    public void setExmaxwindv6h(String exmaxwindv6h) {
        this.exmaxwindv6h = exmaxwindv6h;
    }

    public Integer getDataType() {
        return DataType;
    }

    public void setDataType(Integer DataType) {
        this.DataType = DataType;
    }

    public String getWinSSensorHeight() {
        return winSSensorHeight;
    }

    public void setWinSSensorHeight(String winSSensorHeight) {
        this.winSSensorHeight = winSSensorHeight;
    }

    public String getPre24h() {
        return pre24h;
    }

    public void setPre24h(String pre24h) {
        this.pre24h = pre24h;
    }

    public String getCloFome6() {
        return cloFome6;
    }

    public void setCloFome6(String cloFome6) {
        this.cloFome6 = cloFome6;
    }

    public String getGst320cm() {
        return gst320cm;
    }

    public void setGst320cm(String gst320cm) {
        this.gst320cm = gst320cm;
    }

    public String getMinRelHumTime() {
        return MinRelHumTime;
    }

    public void setMinRelHumTime(String MinRelHumTime) {
        this.MinRelHumTime = MinRelHumTime;
    }

    public String getTempchange24h() {
        return tempchange24h;
    }

    public void setTempchange24h(String tempchange24h) {
        this.tempchange24h = tempchange24h;
    }

    public String getLat() {
        return Lat;
    }

    public void setLat(String Lat) {
        this.Lat = Lat;
    }

    public String getCloFomeHign() {
        return cloFomeHign;
    }

    public void setCloFomeHign(String cloFomeHign) {
        this.cloFomeHign = cloFomeHign;
    }

    public String getExmaxwindd6h() {
        return exmaxwindd6h;
    }

    public void setExmaxwindd6h(String exmaxwindd6h) {
        this.exmaxwindd6h = exmaxwindd6h;
    }

    public String getStationnumC() {
        return stationnumC;
    }

    public void setStationnumC(String stationnumC) {
        this.stationnumC = stationnumC;
    }

    public String getSnowDepth() {
        return snowDepth;
    }

    public void setSnowDepth(String snowDepth) {
        this.snowDepth = snowDepth;
    }

    public String getPrsMax() {
        return prsMax;
    }

    public void setPrsMax(String prsMax) {
        this.prsMax = prsMax;
    }

    public String getPre12h() {
        return pre12h;
    }

    public void setPre12h(String pre12h) {
        this.pre12h = pre12h;
    }

    public String getWinSAvg2mi() {
        return winSAvg2mi;
    }

    public void setWinSAvg2mi(String winSAvg2mi) {
        this.winSAvg2mi = winSAvg2mi;
    }

    public String getGstMaxOtime() {
        return gstMaxOtime;
    }

    public void setGstMaxOtime(String gstMaxOtime) {
        this.gstMaxOtime = gstMaxOtime;
    }

    public String getCloCov() {
        return cloCov;
    }

    public void setCloCov(String cloCov) {
        this.cloCov = cloCov;
    }

    public String getMinRelHum() {
        return MinRelHum;
    }

    public void setMinRelHum(String MinRelHum) {
        this.MinRelHum = MinRelHum;
    }

    public String getLgstMinOtime() {
        return lgstMinOtime;
    }

    public void setLgstMinOtime(String lgstMinOtime) {
        this.lgstMinOtime = lgstMinOtime;
    }

    public String getMintemp24h() {
        return mintemp24h;
    }

    public void setMintemp24h(String mintemp24h) {
        this.mintemp24h = mintemp24h;
    }

    public String getPrsSensorAlti() {
        return prsSensorAlti;
    }

    public void setPrsSensorAlti(String prsSensorAlti) {
        this.prsSensorAlti = prsSensorAlti;
    }

    public String getExmaxwindv12h() {
        return exmaxwindv12h;
    }

    public void setExmaxwindv12h(String exmaxwindv12h) {
        this.exmaxwindv12h = exmaxwindv12h;
    }

    public String getWepPast1() {
        return wepPast1;
    }

    public void setWepPast1(String wepPast1) {
        this.wepPast1 = wepPast1;
    }

    public String getFrs1stBot() {
        return frs1stBot;
    }

    public void setFrs1stBot(String frs1stBot) {
        this.frs1stBot = frs1stBot;
    }

    public String getExMaxWindD() {
        return ExMaxWindD;
    }

    public void setExMaxWindD(String ExMaxWindD) {
        this.ExMaxWindD = ExMaxWindD;
    }

    public String getPre() {
        return pre;
    }

    public void setPre(String pre) {
        this.pre = pre;
    }

    public String getCloFome8() {
        return cloFome8;
    }

    public void setCloFome8(String cloFome8) {
        this.cloFome8 = cloFome8;
    }

    public String getPrsSea() {
        return prsSea;
    }

    public void setPrsSea(String prsSea) {
        this.prsSea = prsSea;
    }

    public String getGst10cm() {
        return gst10cm;
    }

    public void setGst10cm(String gst10cm) {
        this.gst10cm = gst10cm;
    }

    public String getPre1h() {
        return pre1h;
    }

    public void setPre1h(String pre1h) {
        this.pre1h = pre1h;
    }

    public String getLgstMax() {
        return lgstMax;
    }

    public void setLgstMax(String lgstMax) {
        this.lgstMax = lgstMax;
    }

    public String getCloHeightLom() {
        return cloHeightLom;
    }

    public void setCloHeightLom(String cloHeightLom) {
        this.cloHeightLom = cloHeightLom;
    }

    public String getPrsMinOtime() {
        return prsMinOtime;
    }

    public void setPrsMinOtime(String prsMinOtime) {
        this.prsMinOtime = prsMinOtime;
    }

    public String getVisMin() {
        return visMin;
    }

    public void setVisMin(String visMin) {
        this.visMin = visMin;
    }

    public String getExmaxwindd12h() {
        return exmaxwindd12h;
    }

    public void setExmaxwindd12h(String exmaxwindd12h) {
        this.exmaxwindd12h = exmaxwindd12h;
    }

    public String getWepPastCyc() {
        return wepPastCyc;
    }

    public void setWepPastCyc(String wepPastCyc) {
        this.wepPastCyc = wepPastCyc;
    }

    public String getFrs1stTop() {
        return frs1stTop;
    }

    public void setFrs1stTop(String frs1stTop) {
        this.frs1stTop = frs1stTop;
    }

    public String getMaxWindTime() {
        return MaxWindTime;
    }

    public void setMaxWindTime(String MaxWindTime) {
        this.MaxWindTime = MaxWindTime;
    }

    public Integer getStationType() {
        return StationType;
    }

    public void setStationType(Integer StationType) {
        this.StationType = StationType;
    }

    public String getPrs() {
        return prs;
    }

    public void setPrs(String prs) {
        this.prs = prs;
    }

    public String getPrsMin() {
        return prsMin;
    }

    public void setPrsMin(String prsMin) {
        this.prsMin = prsMin;
    }

    public String getGstMinOtime() {
        return gstMinOtime;
    }

    public void setGstMinOtime(String gstMinOtime) {
        this.gstMinOtime = gstMinOtime;
    }

    public String getPreArtiEncCyc() {
        return preArtiEncCyc;
    }

    public void setPreArtiEncCyc(String preArtiEncCyc) {
        this.preArtiEncCyc = preArtiEncCyc;
    }

    public String getCloFome5() {
        return cloFome5;
    }

    public void setCloFome5(String cloFome5) {
        this.cloFome5 = cloFome5;
    }

    public String getGst160cm() {
        return gst160cm;
    }

    public void setGst160cm(String gst160cm) {
        this.gst160cm = gst160cm;
    }

    public String getVap() {
        return vap;
    }

    public void setVap(String vap) {
        this.vap = vap;
    }

    public String getCloCovLm() {
        return cloCovLm;
    }

    public void setCloCovLm(String cloCovLm) {
        this.cloCovLm = cloCovLm;
    }

    public String getMinTempTime() {
        return MinTempTime;
    }

    public void setMinTempTime(String MinTempTime) {
        this.MinTempTime = MinTempTime;
    }

    public String getVisHor10mi() {
        return visHor10mi;
    }

    public void setVisHor10mi(String visHor10mi) {
        this.visHor10mi = visHor10mi;
    }

    public String getSco() {
        return sco;
    }

    public void setSco(String sco) {
        this.sco = sco;
    }

    public String getSynFlag() {
        return SynFlag;
    }

    public void setSynFlag(String SynFlag) {
        this.SynFlag = SynFlag;
    }

    public String getFrs2edBot() {
        return frs2edBot;
    }

    public void setFrs2edBot(String frs2edBot) {
        this.frs2edBot = frs2edBot;
    }

    public String getStationNum() {
        return StationNum;
    }

    public void setStationNum(String StationNum) {
        this.StationNum = StationNum;
    }

    public String getGstMax() {
        return gstMax;
    }

    public void setGstMax(String gstMax) {
        this.gstMax = gstMax;
    }

    public String getWinSAvg10mi() {
        return winSAvg10mi;
    }

    public void setWinSAvg10mi(String winSAvg10mi) {
        this.winSAvg10mi = winSAvg10mi;
    }

    public String getPrsChange24h() {
        return prsChange24h;
    }

    public void setPrsChange24h(String prsChange24h) {
        this.prsChange24h = prsChange24h;
    }

    public String getPre6h() {
        return pre6h;
    }

    public void setPre6h(String pre6h) {
        this.pre6h = pre6h;
    }

    public String getWinDAvg2mi() {
        return winDAvg2mi;
    }

    public void setWinDAvg2mi(String winDAvg2mi) {
        this.winDAvg2mi = winDAvg2mi;
    }

    public String getCloFome2() {
        return cloFome2;
    }

    public void setCloFome2(String cloFome2) {
        this.cloFome2 = cloFome2;
    }

    public String getGst20cm() {
        return gst20cm;
    }

    public void setGst20cm(String gst20cm) {
        this.gst20cm = gst20cm;
    }

    public String getMaxTemp() {
        return MaxTemp;
    }

    public void setMaxTemp(String MaxTemp) {
        this.MaxTemp = MaxTemp;
    }

    public String getVis() {
        return vis;
    }

    public void setVis(String vis) {
        this.vis = vis;
    }

    @Override
    public String toString() {
        return "SsdCimissHourData{" +
        "SynTime=" + SynTime +
        ", id=" + id +
        ", Alti=" + Alti +
        ", frs2edTop=" + frs2edTop +
        ", winDAvg10mi=" + winDAvg10mi +
        ", InstantWindV=" + InstantWindV +
        ", cloFome1=" + cloFome1 +
        ", cloFome7=" + cloFome7 +
        ", evpBig=" + evpBig +
        ", gst15cm=" + gst15cm +
        ", Temp=" + Temp +
        ", lgst=" + lgst +
        ", maxtemp24h=" + maxtemp24h +
        ", cloFomeMid=" + cloFomeMid +
        ", MaxWindV=" + MaxWindV +
        ", StationName=" + StationName +
        ", ObserTime=" + ObserTime +
        ", ExMaxWindTime=" + ExMaxWindTime +
        ", snowPrs=" + snowPrs +
        ", cloFome4=" + cloFome4 +
        ", prsMaxOtime=" + prsMaxOtime +
        ", gstMin=" + gstMin +
        ", gst80cm=" + gst80cm +
        ", cloCovLow=" + cloCovLow +
        ", MinTemp=" + MinTemp +
        ", RelHum=" + RelHum +
        ", lgstMin=" + lgstMin +
        ", visHor1mi=" + visHor1mi +
        ", wepPast2=" + wepPast2 +
        ", cloFomeLow=" + cloFomeLow +
        ", MaxWindD=" + MaxWindD +
        ", gst=" + gst +
        ", ObserDate=" + ObserDate +
        ", ExMaxWindV=" + ExMaxWindV +
        ", cloFome3=" + cloFome3 +
        ", gst40cm=" + gst40cm +
        ", prsChange3h=" + prsChange3h +
        ", MaxTempTime=" + MaxTempTime +
        ", pre3h=" + pre3h +
        ", lgstMaxOtime=" + lgstMaxOtime +
        ", visMinOtime=" + visMinOtime +
        ", dpt=" + dpt +
        ", Lon=" + Lon +
        ", wepNow=" + wepNow +
        ", InstantWindD=" + InstantWindD +
        ", exmaxwindv6h=" + exmaxwindv6h +
        ", DataType=" + DataType +
        ", winSSensorHeight=" + winSSensorHeight +
        ", pre24h=" + pre24h +
        ", cloFome6=" + cloFome6 +
        ", gst320cm=" + gst320cm +
        ", MinRelHumTime=" + MinRelHumTime +
        ", tempchange24h=" + tempchange24h +
        ", Lat=" + Lat +
        ", cloFomeHign=" + cloFomeHign +
        ", exmaxwindd6h=" + exmaxwindd6h +
        ", stationnumC=" + stationnumC +
        ", snowDepth=" + snowDepth +
        ", prsMax=" + prsMax +
        ", pre12h=" + pre12h +
        ", winSAvg2mi=" + winSAvg2mi +
        ", gstMaxOtime=" + gstMaxOtime +
        ", cloCov=" + cloCov +
        ", MinRelHum=" + MinRelHum +
        ", lgstMinOtime=" + lgstMinOtime +
        ", mintemp24h=" + mintemp24h +
        ", prsSensorAlti=" + prsSensorAlti +
        ", exmaxwindv12h=" + exmaxwindv12h +
        ", wepPast1=" + wepPast1 +
        ", frs1stBot=" + frs1stBot +
        ", ExMaxWindD=" + ExMaxWindD +
        ", pre=" + pre +
        ", cloFome8=" + cloFome8 +
        ", prsSea=" + prsSea +
        ", gst10cm=" + gst10cm +
        ", pre1h=" + pre1h +
        ", lgstMax=" + lgstMax +
        ", cloHeightLom=" + cloHeightLom +
        ", prsMinOtime=" + prsMinOtime +
        ", visMin=" + visMin +
        ", exmaxwindd12h=" + exmaxwindd12h +
        ", wepPastCyc=" + wepPastCyc +
        ", frs1stTop=" + frs1stTop +
        ", MaxWindTime=" + MaxWindTime +
        ", StationType=" + StationType +
        ", prs=" + prs +
        ", prsMin=" + prsMin +
        ", gstMinOtime=" + gstMinOtime +
        ", preArtiEncCyc=" + preArtiEncCyc +
        ", cloFome5=" + cloFome5 +
        ", gst160cm=" + gst160cm +
        ", vap=" + vap +
        ", cloCovLm=" + cloCovLm +
        ", MinTempTime=" + MinTempTime +
        ", visHor10mi=" + visHor10mi +
        ", sco=" + sco +
        ", SynFlag=" + SynFlag +
        ", frs2edBot=" + frs2edBot +
        ", StationNum=" + StationNum +
        ", gstMax=" + gstMax +
        ", winSAvg10mi=" + winSAvg10mi +
        ", prsChange24h=" + prsChange24h +
        ", pre6h=" + pre6h +
        ", winDAvg2mi=" + winDAvg2mi +
        ", cloFome2=" + cloFome2 +
        ", gst20cm=" + gst20cm +
        ", MaxTemp=" + MaxTemp +
        ", vis=" + vis +
        "}";
    }
}

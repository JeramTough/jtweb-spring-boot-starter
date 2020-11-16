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
 * 小时实况数据
 * </p>
 *
 * @author JeramTough
 * @since 2020-09-16
 */
@TableName("HourRealData")
@ApiModel(value="HourRealData对象", description="小时实况数据")
public class HourRealData implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "标识")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "站号（字符）")
    @TableField("stationNum")
    private String stationNum;

    @ApiModelProperty(value = "站名")
    @TableField("stationName")
    private String stationName;

    @ApiModelProperty(value = "站类型")
    @TableField("stationType")
    private String stationType;

    @ApiModelProperty(value = "纬度")
    private String lat;

    @ApiModelProperty(value = "经度")
    private String lon;

    @ApiModelProperty(value = "观测时间")
    @TableField("obserDateSection")
    private String obserDateSection;

    @ApiModelProperty(value = "行政区域代码")
    @TableField("areaCode")
    private String areaCode;

    @ApiModelProperty(value = "气压")
    @TableField("PRS")
    private String prs;

    @ApiModelProperty(value = "海平面气压")
    @TableField("PRS_Sea")
    private String prsSea;

    @ApiModelProperty(value = "3小时变压")
    @TableField("PRS_Change_3h")
    private String prsChange3h;

    @ApiModelProperty(value = "24小时变压")
    @TableField("PRS_Change_24h")
    private String prsChange24h;

    @ApiModelProperty(value = "最高气压")
    @TableField("PRS_Max")
    private String prsMax;

    @ApiModelProperty(value = "最高气压出现时间")
    @TableField("PRS_Max_OTime")
    private String prsMaxOtime;

    @ApiModelProperty(value = "最低气压	")
    @TableField("PRS_Min")
    private String prsMin;

    @ApiModelProperty(value = "最低气压出现时间")
    @TableField("PRS_Min_OTime")
    private String prsMinOtime;

    @ApiModelProperty(value = "温度/气温")
    @TableField("TEM")
    private String tem;

    @ApiModelProperty(value = "最高气温")
    @TableField("TEM_Max")
    private String temMax;

    @ApiModelProperty(value = "最高气温出现时间")
    @TableField("TEM_Max_OTime")
    private String temMaxOtime;

    @ApiModelProperty(value = "最低气温")
    @TableField("TEM_Min")
    private String temMin;

    @ApiModelProperty(value = "最低气温出现时间")
    @TableField("TEM_Min_OTime")
    private String temMinOtime;

    @ApiModelProperty(value = "过去24小时变温")
    @TableField("TEM_CHANGE_24h")
    private String temChange24h;

    @ApiModelProperty(value = "过去24小时最高气温")
    @TableField("TEM_Max_24h")
    private String temMax24h;

    @ApiModelProperty(value = "过去24小时最低气温")
    @TableField("TEM_Min_24h")
    private String temMin24h;

    @ApiModelProperty(value = "露点温度")
    @TableField("DPT")
    private String dpt;

    @ApiModelProperty(value = "相对湿度")
    @TableField("RHU")
    private String rhu;

    @ApiModelProperty(value = "最小相对湿度")
    @TableField("RHU_Min")
    private String rhuMin;

    @ApiModelProperty(value = "最小相对湿度出现时间")
    @TableField("RHU_Min_OTIME")
    private String rhuMinOtime;

    @ApiModelProperty(value = "水汽压")
    @TableField("VAP")
    private String vap;

    @ApiModelProperty(value = "过去1小时降水量")
    @TableField("PRE_1h")
    private String pre1h;

    @ApiModelProperty(value = "过去3小时降水量")
    @TableField("PRE_3h")
    private String pre3h;

    @ApiModelProperty(value = "过去6小时降水量")
    @TableField("PRE_6h")
    private String pre6h;

    @ApiModelProperty(value = "过去12小时降水量")
    @TableField("PRE_12h")
    private String pre12h;

    @ApiModelProperty(value = "过去24小时降水量")
    @TableField("PRE_24h")
    private String pre24h;

    @ApiModelProperty(value = "人工加密观测降水量描述周期")
    @TableField("PRE_Arti_Enc_CYC")
    private String preArtiEncCyc;

    @ApiModelProperty(value = "降水量")
    @TableField("PRE")
    private String pre;

    @ApiModelProperty(value = "蒸发(大型)")
    @TableField("EVP_Big")
    private String evpBig;

    @ApiModelProperty(value = "2分钟平均风向")
    @TableField("WIN_D_Avg_2mi")
    private String winDAvg2mi;

    @ApiModelProperty(value = "2分钟平均风速")
    @TableField("WIN_S_Avg_2mi")
    private String winSAvg2mi;

    @ApiModelProperty(value = "10分钟平均风向")
    @TableField("WIN_D_Avg_10mi")
    private String winDAvg10mi;

    @ApiModelProperty(value = "10分钟平均风速")
    @TableField("WIN_S_Avg_10mi")
    private String winSAvg10mi;

    @ApiModelProperty(value = "最大风速的风向")
    @TableField("WIN_D_S_Max")
    private String winDSMax;

    @ApiModelProperty(value = "最大风速")
    @TableField("WIN_S_Max")
    private String winSMax;

    @ApiModelProperty(value = "最大风速出现时间")
    @TableField("WIN_S_Max_OTime")
    private String winSMaxOtime;

    @ApiModelProperty(value = "瞬时风向")
    @TableField("WIN_D_INST")
    private String winDInst;

    @ApiModelProperty(value = "瞬时风速")
    @TableField("WIN_S_INST")
    private String winSInst;

    @ApiModelProperty(value = "极大风速的风向")
    @TableField("WIN_D_INST_Max")
    private String winDInstMax;

    @ApiModelProperty(value = "极大风速")
    @TableField("WIN_S_INST_Max")
    private String winSInstMax;

    @ApiModelProperty(value = "极大风速出现时间")
    @TableField("WIN_S_INST_Max_OTime")
    private String winSInstMaxOtime;

    @ApiModelProperty(value = "过去6小时极大瞬时风向")
    @TableField("WIN_D_Inst_Max_6h")
    private String winDInstMax6h;

    @ApiModelProperty(value = "过去6小时极大瞬时风速")
    @TableField("WIN_S_Inst_Max_6h")
    private String winSInstMax6h;

    @ApiModelProperty(value = "过去12小时极大瞬时风向")
    @TableField("WIN_D_Inst_Max_12h")
    private String winDInstMax12h;

    @ApiModelProperty(value = "过去12小时极大瞬时风速")
    @TableField("WIN_S_Inst_Max_12h")
    private String winSInstMax12h;

    @ApiModelProperty(value = "地面温度")
    @TableField("GST")
    private String gst;

    @ApiModelProperty(value = "最高地面温度")
    @TableField("GST_Max")
    private String gstMax;

    @ApiModelProperty(value = "最高地面温度出现时间")
    @TableField("GST_Max_Otime")
    private String gstMaxOtime;

    @ApiModelProperty(value = "最低地面温度")
    @TableField("GST_Min")
    private String gstMin;

    @ApiModelProperty(value = "最低地面温度出现时间")
    @TableField("GST_Min_OTime")
    private String gstMinOtime;

    @ApiModelProperty(value = "过去12小时地面最低温度")
    @TableField("GST_Min_12h")
    private String gstMin12h;

    @ApiModelProperty(value = "5cm地温")
    @TableField("GST_5cm")
    private String gst5cm;

    @ApiModelProperty(value = "10cm地温")
    @TableField("GST_10cm")
    private String gst10cm;

    @ApiModelProperty(value = "15cm地温")
    @TableField("GST_15cm")
    private String gst15cm;

    @ApiModelProperty(value = "20cm地温")
    @TableField("GST_20cm")
    private String gst20cm;

    @ApiModelProperty(value = "40cm地温")
    @TableField("GST_40Cm")
    private String gst40cm;

    @ApiModelProperty(value = "80cm地温")
    @TableField("GST_80cm")
    private String gst80cm;

    @ApiModelProperty(value = "160cm地温")
    @TableField("GST_160cm")
    private String gst160cm;

    @ApiModelProperty(value = "320cm地温")
    @TableField("GST_320cm")
    private String gst320cm;

    @ApiModelProperty(value = "草面(雪面)温度")
    @TableField("LGST")
    private String lgst;

    @ApiModelProperty(value = "草面(雪面)最高温度")
    @TableField("LGST_Max")
    private String lgstMax;

    @ApiModelProperty(value = "草面(雪面)最高温度出现时间")
    @TableField("LGST_Max_OTime")
    private String lgstMaxOtime;

    @ApiModelProperty(value = "草面(雪面)最低温度")
    @TableField("LGST_Min")
    private String lgstMin;

    @ApiModelProperty(value = "草面(雪面)最低温度出现时间")
    @TableField("LGST_Min_OTime")
    private String lgstMinOtime;

    @ApiModelProperty(value = "1分钟平均水平能见度")
    @TableField("VIS_HOR_1MI")
    private String visHor1mi;

    @ApiModelProperty(value = "10分钟平均水平能见度")
    @TableField("VIS_HOR_10MI")
    private String visHor10mi;

    @ApiModelProperty(value = "最小水平能见度")
    @TableField("VIS_Min")
    private String visMin;

    @ApiModelProperty(value = "最小水平能见度出现时间")
    @TableField("VIS_Min_OTime")
    private String visMinOtime;

    @ApiModelProperty(value = "水平能见度(人工)")
    @TableField("VIS")
    private String vis;

    @ApiModelProperty(value = "总云量")
    @TableField("CLO_Cov")
    private String cloCov;

    @ApiModelProperty(value = "低云量")
    @TableField("CLO_Cov_Low")
    private String cloCovLow;

    @ApiModelProperty(value = "云量(低云或中云)")
    @TableField("CLO_COV_LM")
    private String cloCovLm;

    @ApiModelProperty(value = "云底高度")
    @TableField("CLO_Height_LoM")
    private String cloHeightLom;

    @ApiModelProperty(value = "云状1")
    @TableField("CLO_FOME_1")
    private String cloFome1;

    @ApiModelProperty(value = "云状2")
    @TableField("CLO_Fome_2")
    private String cloFome2;

    @ApiModelProperty(value = "云状3")
    @TableField("CLO_Fome_3")
    private String cloFome3;

    @ApiModelProperty(value = "云状4")
    @TableField("CLO_Fome_4")
    private String cloFome4;

    @ApiModelProperty(value = "云状5")
    @TableField("CLO_FOME_5")
    private String cloFome5;

    @ApiModelProperty(value = "云状6")
    @TableField("CLO_FOME_6")
    private String cloFome6;

    @ApiModelProperty(value = "云状7")
    @TableField("CLO_FOME_7")
    private String cloFome7;

    @ApiModelProperty(value = "云状8")
    @TableField("CLO_Fome_8")
    private String cloFome8;

    @ApiModelProperty(value = "低云状")
    @TableField("CLO_Fome_Low")
    private String cloFomeLow;

    @ApiModelProperty(value = "中云状")
    @TableField("CLO_FOME_MID")
    private String cloFomeMid;

    @ApiModelProperty(value = "高云状")
    @TableField("CLO_Fome_High")
    private String cloFomeHigh;

    @ApiModelProperty(value = "现在天气")
    @TableField("WEP_Now")
    private String wepNow;

    @ApiModelProperty(value = "过去天气描述事件周期")
    @TableField("WEP_Past_CYC")
    private String wepPastCyc;

    @ApiModelProperty(value = "过去天气1")
    @TableField("WEP_Past_1")
    private String wepPast1;

    @ApiModelProperty(value = "过去天气2")
    @TableField("WEP_Past_2")
    private String wepPast2;

    @ApiModelProperty(value = "地面状态")
    @TableField("SCO")
    private String sco;

    @ApiModelProperty(value = "积雪深度")
    @TableField("Snow_Depth")
    private String snowDepth;

    @ApiModelProperty(value = "雪压")
    @TableField("Snow_PRS")
    private String snowPrs;

    @ApiModelProperty(value = "第一冻土层上界值")
    @TableField("FRS_1st_Top")
    private String frs1stTop;

    @ApiModelProperty(value = "第一冻土层下界值")
    @TableField("FRS_1st_Bot")
    private String frs1stBot;

    @ApiModelProperty(value = "第二冻土层上界值")
    @TableField("FRS_2nd_Top")
    private String frs2ndTop;

    @ApiModelProperty(value = "第二冻土层下界值")
    @TableField("FRS_2nd_Bot")
    private String frs2ndBot;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getStationType() {
        return stationType;
    }

    public void setStationType(String stationType) {
        this.stationType = stationType;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getObserDateSection() {
        return obserDateSection;
    }

    public void setObserDateSection(String obserDateSection) {
        this.obserDateSection = obserDateSection;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getPrs() {
        return prs;
    }

    public void setPrs(String prs) {
        this.prs = prs;
    }

    public String getPrsSea() {
        return prsSea;
    }

    public void setPrsSea(String prsSea) {
        this.prsSea = prsSea;
    }

    public String getPrsChange3h() {
        return prsChange3h;
    }

    public void setPrsChange3h(String prsChange3h) {
        this.prsChange3h = prsChange3h;
    }

    public String getPrsChange24h() {
        return prsChange24h;
    }

    public void setPrsChange24h(String prsChange24h) {
        this.prsChange24h = prsChange24h;
    }

    public String getPrsMax() {
        return prsMax;
    }

    public void setPrsMax(String prsMax) {
        this.prsMax = prsMax;
    }

    public String getPrsMaxOtime() {
        return prsMaxOtime;
    }

    public void setPrsMaxOtime(String prsMaxOtime) {
        this.prsMaxOtime = prsMaxOtime;
    }

    public String getPrsMin() {
        return prsMin;
    }

    public void setPrsMin(String prsMin) {
        this.prsMin = prsMin;
    }

    public String getPrsMinOtime() {
        return prsMinOtime;
    }

    public void setPrsMinOtime(String prsMinOtime) {
        this.prsMinOtime = prsMinOtime;
    }

    public String getTem() {
        return tem;
    }

    public void setTem(String tem) {
        this.tem = tem;
    }

    public String getTemMax() {
        return temMax;
    }

    public void setTemMax(String temMax) {
        this.temMax = temMax;
    }

    public String getTemMaxOtime() {
        return temMaxOtime;
    }

    public void setTemMaxOtime(String temMaxOtime) {
        this.temMaxOtime = temMaxOtime;
    }

    public String getTemMin() {
        return temMin;
    }

    public void setTemMin(String temMin) {
        this.temMin = temMin;
    }

    public String getTemMinOtime() {
        return temMinOtime;
    }

    public void setTemMinOtime(String temMinOtime) {
        this.temMinOtime = temMinOtime;
    }

    public String getTemChange24h() {
        return temChange24h;
    }

    public void setTemChange24h(String temChange24h) {
        this.temChange24h = temChange24h;
    }

    public String getTemMax24h() {
        return temMax24h;
    }

    public void setTemMax24h(String temMax24h) {
        this.temMax24h = temMax24h;
    }

    public String getTemMin24h() {
        return temMin24h;
    }

    public void setTemMin24h(String temMin24h) {
        this.temMin24h = temMin24h;
    }

    public String getDpt() {
        return dpt;
    }

    public void setDpt(String dpt) {
        this.dpt = dpt;
    }

    public String getRhu() {
        return rhu;
    }

    public void setRhu(String rhu) {
        this.rhu = rhu;
    }

    public String getRhuMin() {
        return rhuMin;
    }

    public void setRhuMin(String rhuMin) {
        this.rhuMin = rhuMin;
    }

    public String getRhuMinOtime() {
        return rhuMinOtime;
    }

    public void setRhuMinOtime(String rhuMinOtime) {
        this.rhuMinOtime = rhuMinOtime;
    }

    public String getVap() {
        return vap;
    }

    public void setVap(String vap) {
        this.vap = vap;
    }

    public String getPre1h() {
        return pre1h;
    }

    public void setPre1h(String pre1h) {
        this.pre1h = pre1h;
    }

    public String getPre3h() {
        return pre3h;
    }

    public void setPre3h(String pre3h) {
        this.pre3h = pre3h;
    }

    public String getPre6h() {
        return pre6h;
    }

    public void setPre6h(String pre6h) {
        this.pre6h = pre6h;
    }

    public String getPre12h() {
        return pre12h;
    }

    public void setPre12h(String pre12h) {
        this.pre12h = pre12h;
    }

    public String getPre24h() {
        return pre24h;
    }

    public void setPre24h(String pre24h) {
        this.pre24h = pre24h;
    }

    public String getPreArtiEncCyc() {
        return preArtiEncCyc;
    }

    public void setPreArtiEncCyc(String preArtiEncCyc) {
        this.preArtiEncCyc = preArtiEncCyc;
    }

    public String getPre() {
        return pre;
    }

    public void setPre(String pre) {
        this.pre = pre;
    }

    public String getEvpBig() {
        return evpBig;
    }

    public void setEvpBig(String evpBig) {
        this.evpBig = evpBig;
    }

    public String getWinDAvg2mi() {
        return winDAvg2mi;
    }

    public void setWinDAvg2mi(String winDAvg2mi) {
        this.winDAvg2mi = winDAvg2mi;
    }

    public String getWinSAvg2mi() {
        return winSAvg2mi;
    }

    public void setWinSAvg2mi(String winSAvg2mi) {
        this.winSAvg2mi = winSAvg2mi;
    }

    public String getWinDAvg10mi() {
        return winDAvg10mi;
    }

    public void setWinDAvg10mi(String winDAvg10mi) {
        this.winDAvg10mi = winDAvg10mi;
    }

    public String getWinSAvg10mi() {
        return winSAvg10mi;
    }

    public void setWinSAvg10mi(String winSAvg10mi) {
        this.winSAvg10mi = winSAvg10mi;
    }

    public String getWinDSMax() {
        return winDSMax;
    }

    public void setWinDSMax(String winDSMax) {
        this.winDSMax = winDSMax;
    }

    public String getWinSMax() {
        return winSMax;
    }

    public void setWinSMax(String winSMax) {
        this.winSMax = winSMax;
    }

    public String getWinSMaxOtime() {
        return winSMaxOtime;
    }

    public void setWinSMaxOtime(String winSMaxOtime) {
        this.winSMaxOtime = winSMaxOtime;
    }

    public String getWinDInst() {
        return winDInst;
    }

    public void setWinDInst(String winDInst) {
        this.winDInst = winDInst;
    }

    public String getWinSInst() {
        return winSInst;
    }

    public void setWinSInst(String winSInst) {
        this.winSInst = winSInst;
    }

    public String getWinDInstMax() {
        return winDInstMax;
    }

    public void setWinDInstMax(String winDInstMax) {
        this.winDInstMax = winDInstMax;
    }

    public String getWinSInstMax() {
        return winSInstMax;
    }

    public void setWinSInstMax(String winSInstMax) {
        this.winSInstMax = winSInstMax;
    }

    public String getWinSInstMaxOtime() {
        return winSInstMaxOtime;
    }

    public void setWinSInstMaxOtime(String winSInstMaxOtime) {
        this.winSInstMaxOtime = winSInstMaxOtime;
    }

    public String getWinDInstMax6h() {
        return winDInstMax6h;
    }

    public void setWinDInstMax6h(String winDInstMax6h) {
        this.winDInstMax6h = winDInstMax6h;
    }

    public String getWinSInstMax6h() {
        return winSInstMax6h;
    }

    public void setWinSInstMax6h(String winSInstMax6h) {
        this.winSInstMax6h = winSInstMax6h;
    }

    public String getWinDInstMax12h() {
        return winDInstMax12h;
    }

    public void setWinDInstMax12h(String winDInstMax12h) {
        this.winDInstMax12h = winDInstMax12h;
    }

    public String getWinSInstMax12h() {
        return winSInstMax12h;
    }

    public void setWinSInstMax12h(String winSInstMax12h) {
        this.winSInstMax12h = winSInstMax12h;
    }

    public String getGst() {
        return gst;
    }

    public void setGst(String gst) {
        this.gst = gst;
    }

    public String getGstMax() {
        return gstMax;
    }

    public void setGstMax(String gstMax) {
        this.gstMax = gstMax;
    }

    public String getGstMaxOtime() {
        return gstMaxOtime;
    }

    public void setGstMaxOtime(String gstMaxOtime) {
        this.gstMaxOtime = gstMaxOtime;
    }

    public String getGstMin() {
        return gstMin;
    }

    public void setGstMin(String gstMin) {
        this.gstMin = gstMin;
    }

    public String getGstMinOtime() {
        return gstMinOtime;
    }

    public void setGstMinOtime(String gstMinOtime) {
        this.gstMinOtime = gstMinOtime;
    }

    public String getGstMin12h() {
        return gstMin12h;
    }

    public void setGstMin12h(String gstMin12h) {
        this.gstMin12h = gstMin12h;
    }

    public String getGst5cm() {
        return gst5cm;
    }

    public void setGst5cm(String gst5cm) {
        this.gst5cm = gst5cm;
    }

    public String getGst10cm() {
        return gst10cm;
    }

    public void setGst10cm(String gst10cm) {
        this.gst10cm = gst10cm;
    }

    public String getGst15cm() {
        return gst15cm;
    }

    public void setGst15cm(String gst15cm) {
        this.gst15cm = gst15cm;
    }

    public String getGst20cm() {
        return gst20cm;
    }

    public void setGst20cm(String gst20cm) {
        this.gst20cm = gst20cm;
    }

    public String getGst40cm() {
        return gst40cm;
    }

    public void setGst40cm(String gst40cm) {
        this.gst40cm = gst40cm;
    }

    public String getGst80cm() {
        return gst80cm;
    }

    public void setGst80cm(String gst80cm) {
        this.gst80cm = gst80cm;
    }

    public String getGst160cm() {
        return gst160cm;
    }

    public void setGst160cm(String gst160cm) {
        this.gst160cm = gst160cm;
    }

    public String getGst320cm() {
        return gst320cm;
    }

    public void setGst320cm(String gst320cm) {
        this.gst320cm = gst320cm;
    }

    public String getLgst() {
        return lgst;
    }

    public void setLgst(String lgst) {
        this.lgst = lgst;
    }

    public String getLgstMax() {
        return lgstMax;
    }

    public void setLgstMax(String lgstMax) {
        this.lgstMax = lgstMax;
    }

    public String getLgstMaxOtime() {
        return lgstMaxOtime;
    }

    public void setLgstMaxOtime(String lgstMaxOtime) {
        this.lgstMaxOtime = lgstMaxOtime;
    }

    public String getLgstMin() {
        return lgstMin;
    }

    public void setLgstMin(String lgstMin) {
        this.lgstMin = lgstMin;
    }

    public String getLgstMinOtime() {
        return lgstMinOtime;
    }

    public void setLgstMinOtime(String lgstMinOtime) {
        this.lgstMinOtime = lgstMinOtime;
    }

    public String getVisHor1mi() {
        return visHor1mi;
    }

    public void setVisHor1mi(String visHor1mi) {
        this.visHor1mi = visHor1mi;
    }

    public String getVisHor10mi() {
        return visHor10mi;
    }

    public void setVisHor10mi(String visHor10mi) {
        this.visHor10mi = visHor10mi;
    }

    public String getVisMin() {
        return visMin;
    }

    public void setVisMin(String visMin) {
        this.visMin = visMin;
    }

    public String getVisMinOtime() {
        return visMinOtime;
    }

    public void setVisMinOtime(String visMinOtime) {
        this.visMinOtime = visMinOtime;
    }

    public String getVis() {
        return vis;
    }

    public void setVis(String vis) {
        this.vis = vis;
    }

    public String getCloCov() {
        return cloCov;
    }

    public void setCloCov(String cloCov) {
        this.cloCov = cloCov;
    }

    public String getCloCovLow() {
        return cloCovLow;
    }

    public void setCloCovLow(String cloCovLow) {
        this.cloCovLow = cloCovLow;
    }

    public String getCloCovLm() {
        return cloCovLm;
    }

    public void setCloCovLm(String cloCovLm) {
        this.cloCovLm = cloCovLm;
    }

    public String getCloHeightLom() {
        return cloHeightLom;
    }

    public void setCloHeightLom(String cloHeightLom) {
        this.cloHeightLom = cloHeightLom;
    }

    public String getCloFome1() {
        return cloFome1;
    }

    public void setCloFome1(String cloFome1) {
        this.cloFome1 = cloFome1;
    }

    public String getCloFome2() {
        return cloFome2;
    }

    public void setCloFome2(String cloFome2) {
        this.cloFome2 = cloFome2;
    }

    public String getCloFome3() {
        return cloFome3;
    }

    public void setCloFome3(String cloFome3) {
        this.cloFome3 = cloFome3;
    }

    public String getCloFome4() {
        return cloFome4;
    }

    public void setCloFome4(String cloFome4) {
        this.cloFome4 = cloFome4;
    }

    public String getCloFome5() {
        return cloFome5;
    }

    public void setCloFome5(String cloFome5) {
        this.cloFome5 = cloFome5;
    }

    public String getCloFome6() {
        return cloFome6;
    }

    public void setCloFome6(String cloFome6) {
        this.cloFome6 = cloFome6;
    }

    public String getCloFome7() {
        return cloFome7;
    }

    public void setCloFome7(String cloFome7) {
        this.cloFome7 = cloFome7;
    }

    public String getCloFome8() {
        return cloFome8;
    }

    public void setCloFome8(String cloFome8) {
        this.cloFome8 = cloFome8;
    }

    public String getCloFomeLow() {
        return cloFomeLow;
    }

    public void setCloFomeLow(String cloFomeLow) {
        this.cloFomeLow = cloFomeLow;
    }

    public String getCloFomeMid() {
        return cloFomeMid;
    }

    public void setCloFomeMid(String cloFomeMid) {
        this.cloFomeMid = cloFomeMid;
    }

    public String getCloFomeHigh() {
        return cloFomeHigh;
    }

    public void setCloFomeHigh(String cloFomeHigh) {
        this.cloFomeHigh = cloFomeHigh;
    }

    public String getWepNow() {
        return wepNow;
    }

    public void setWepNow(String wepNow) {
        this.wepNow = wepNow;
    }

    public String getWepPastCyc() {
        return wepPastCyc;
    }

    public void setWepPastCyc(String wepPastCyc) {
        this.wepPastCyc = wepPastCyc;
    }

    public String getWepPast1() {
        return wepPast1;
    }

    public void setWepPast1(String wepPast1) {
        this.wepPast1 = wepPast1;
    }

    public String getWepPast2() {
        return wepPast2;
    }

    public void setWepPast2(String wepPast2) {
        this.wepPast2 = wepPast2;
    }

    public String getSco() {
        return sco;
    }

    public void setSco(String sco) {
        this.sco = sco;
    }

    public String getSnowDepth() {
        return snowDepth;
    }

    public void setSnowDepth(String snowDepth) {
        this.snowDepth = snowDepth;
    }

    public String getSnowPrs() {
        return snowPrs;
    }

    public void setSnowPrs(String snowPrs) {
        this.snowPrs = snowPrs;
    }

    public String getFrs1stTop() {
        return frs1stTop;
    }

    public void setFrs1stTop(String frs1stTop) {
        this.frs1stTop = frs1stTop;
    }

    public String getFrs1stBot() {
        return frs1stBot;
    }

    public void setFrs1stBot(String frs1stBot) {
        this.frs1stBot = frs1stBot;
    }

    public String getFrs2ndTop() {
        return frs2ndTop;
    }

    public void setFrs2ndTop(String frs2ndTop) {
        this.frs2ndTop = frs2ndTop;
    }

    public String getFrs2ndBot() {
        return frs2ndBot;
    }

    public void setFrs2ndBot(String frs2ndBot) {
        this.frs2ndBot = frs2ndBot;
    }

    @Override
    public String toString() {
        return "HourRealData{" +
        "id=" + id +
        ", stationNum=" + stationNum +
        ", stationName=" + stationName +
        ", stationType=" + stationType +
        ", lat=" + lat +
        ", lon=" + lon +
        ", obserDateSection=" + obserDateSection +
        ", areaCode=" + areaCode +
        ", prs=" + prs +
        ", prsSea=" + prsSea +
        ", prsChange3h=" + prsChange3h +
        ", prsChange24h=" + prsChange24h +
        ", prsMax=" + prsMax +
        ", prsMaxOtime=" + prsMaxOtime +
        ", prsMin=" + prsMin +
        ", prsMinOtime=" + prsMinOtime +
        ", tem=" + tem +
        ", temMax=" + temMax +
        ", temMaxOtime=" + temMaxOtime +
        ", temMin=" + temMin +
        ", temMinOtime=" + temMinOtime +
        ", temChange24h=" + temChange24h +
        ", temMax24h=" + temMax24h +
        ", temMin24h=" + temMin24h +
        ", dpt=" + dpt +
        ", rhu=" + rhu +
        ", rhuMin=" + rhuMin +
        ", rhuMinOtime=" + rhuMinOtime +
        ", vap=" + vap +
        ", pre1h=" + pre1h +
        ", pre3h=" + pre3h +
        ", pre6h=" + pre6h +
        ", pre12h=" + pre12h +
        ", pre24h=" + pre24h +
        ", preArtiEncCyc=" + preArtiEncCyc +
        ", pre=" + pre +
        ", evpBig=" + evpBig +
        ", winDAvg2mi=" + winDAvg2mi +
        ", winSAvg2mi=" + winSAvg2mi +
        ", winDAvg10mi=" + winDAvg10mi +
        ", winSAvg10mi=" + winSAvg10mi +
        ", winDSMax=" + winDSMax +
        ", winSMax=" + winSMax +
        ", winSMaxOtime=" + winSMaxOtime +
        ", winDInst=" + winDInst +
        ", winSInst=" + winSInst +
        ", winDInstMax=" + winDInstMax +
        ", winSInstMax=" + winSInstMax +
        ", winSInstMaxOtime=" + winSInstMaxOtime +
        ", winDInstMax6h=" + winDInstMax6h +
        ", winSInstMax6h=" + winSInstMax6h +
        ", winDInstMax12h=" + winDInstMax12h +
        ", winSInstMax12h=" + winSInstMax12h +
        ", gst=" + gst +
        ", gstMax=" + gstMax +
        ", gstMaxOtime=" + gstMaxOtime +
        ", gstMin=" + gstMin +
        ", gstMinOtime=" + gstMinOtime +
        ", gstMin12h=" + gstMin12h +
        ", gst5cm=" + gst5cm +
        ", gst10cm=" + gst10cm +
        ", gst15cm=" + gst15cm +
        ", gst20cm=" + gst20cm +
        ", gst40cm=" + gst40cm +
        ", gst80cm=" + gst80cm +
        ", gst160cm=" + gst160cm +
        ", gst320cm=" + gst320cm +
        ", lgst=" + lgst +
        ", lgstMax=" + lgstMax +
        ", lgstMaxOtime=" + lgstMaxOtime +
        ", lgstMin=" + lgstMin +
        ", lgstMinOtime=" + lgstMinOtime +
        ", visHor1mi=" + visHor1mi +
        ", visHor10mi=" + visHor10mi +
        ", visMin=" + visMin +
        ", visMinOtime=" + visMinOtime +
        ", vis=" + vis +
        ", cloCov=" + cloCov +
        ", cloCovLow=" + cloCovLow +
        ", cloCovLm=" + cloCovLm +
        ", cloHeightLom=" + cloHeightLom +
        ", cloFome1=" + cloFome1 +
        ", cloFome2=" + cloFome2 +
        ", cloFome3=" + cloFome3 +
        ", cloFome4=" + cloFome4 +
        ", cloFome5=" + cloFome5 +
        ", cloFome6=" + cloFome6 +
        ", cloFome7=" + cloFome7 +
        ", cloFome8=" + cloFome8 +
        ", cloFomeLow=" + cloFomeLow +
        ", cloFomeMid=" + cloFomeMid +
        ", cloFomeHigh=" + cloFomeHigh +
        ", wepNow=" + wepNow +
        ", wepPastCyc=" + wepPastCyc +
        ", wepPast1=" + wepPast1 +
        ", wepPast2=" + wepPast2 +
        ", sco=" + sco +
        ", snowDepth=" + snowDepth +
        ", snowPrs=" + snowPrs +
        ", frs1stTop=" + frs1stTop +
        ", frs1stBot=" + frs1stBot +
        ", frs2ndTop=" + frs2ndTop +
        ", frs2ndBot=" + frs2ndBot +
        "}";
    }
}

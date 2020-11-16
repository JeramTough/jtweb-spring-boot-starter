package net.ssd.InterfaceService.gxsmswc.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 日预报数据
 * </p>
 *
 * @author JeramTough
 * @since 2020-09-16
 */
@ApiModel(value="ForecastDay对象", description="日预报数据")
public class ForecastDay implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自增长主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "地区名称")
    private String name;

    @ApiModelProperty(value = "经度")
    private Float lon;

    @ApiModelProperty(value = "纬度")
    private Float lat;

    @ApiModelProperty(value = "判断是否是流域还是非流域(普通用户还是专业客户)")
    private String rangetype;

    @ApiModelProperty(value = "所属县/小流域")
    private String belongxian;

    @ApiModelProperty(value = "所属市/大流域")
    private String belongcity;

    @ApiModelProperty(value = "时间")
    private LocalDateTime timemake;

    @ApiModelProperty(value = "发布时间")
    private LocalDateTime timeupload;

    @ApiModelProperty(value = "24小时降水（第1天）")
    private Float pre24;

    @ApiModelProperty(value = "48小时降水（第2天）")
    private Float pre48;

    @ApiModelProperty(value = "72小时降水（第3天）")
    private Float pre72;

    @ApiModelProperty(value = "96小时降水（第4天）")
    private Float pre96;

    @ApiModelProperty(value = "120小时降水（第5天）")
    private Float pre120;

    @ApiModelProperty(value = "144小时降水（第6天）")
    private Float pre144;

    @ApiModelProperty(value = "168小时降水（第7天）")
    private Float pre168;

    @ApiModelProperty(value = "192小时降水（第8天）")
    private Float pre192;

    @ApiModelProperty(value = "216小时降水（第9天）")
    private Float pre216;

    @ApiModelProperty(value = "降水日数预报")
    private Integer jsrs;

    @ApiModelProperty(value = "高温日数预报")
    private Integer gwrs;

    @ApiModelProperty(value = "积温")
    private Float jw;

    @ApiModelProperty(value = "3小时降水（00时刻）")
    private Float pre300;

    @ApiModelProperty(value = "3小时降水（03时刻）")
    private Float pre303;

    @ApiModelProperty(value = "3小时降水（06时刻）")
    private Float pre306;

    @ApiModelProperty(value = "3小时降水（09时刻）")
    private Float pre309;

    @ApiModelProperty(value = "3小时降水（12时刻）")
    private Float pre312;

    @ApiModelProperty(value = "3小时降水（15时刻）")
    private Float pre315;

    @ApiModelProperty(value = "3小时降水（18时刻）")
    private Float pre318;

    @ApiModelProperty(value = "3小时降水（21时刻）")
    private Float pre321;

    @ApiModelProperty(value = "3小时降水（00时刻）")
    private Float pre324;

    @ApiModelProperty(value = "3小时降水（03时刻）")
    private Float pre327;

    @ApiModelProperty(value = "3小时降水（06时刻）")
    private Float pre330;

    @ApiModelProperty(value = "3小时降水（09时刻）")
    private Float pre333;

    @ApiModelProperty(value = "3小时降水（12时刻）")
    private Float pre336;

    @ApiModelProperty(value = "3小时降水（15时刻）")
    private Float pre339;

    @ApiModelProperty(value = "3小时降水（18时刻）")
    private Float pre342;

    @ApiModelProperty(value = "3小时降水（21时刻）")
    private Float pre345;

    @ApiModelProperty(value = "3小时降水（00时刻）")
    private Float pre348;

    @ApiModelProperty(value = "3小时降水（03时刻）")
    private Float pre351;

    @ApiModelProperty(value = "3小时降水（06时刻）")
    private Float pre354;

    @ApiModelProperty(value = "3小时降水（09时刻）")
    private Float pre357;

    @ApiModelProperty(value = "3小时降水（12时刻）")
    private Float pre360;

    @ApiModelProperty(value = "3小时降水（15时刻）")
    private Float pre363;

    @ApiModelProperty(value = "3小时降水（18时刻）")
    private Float pre366;

    @ApiModelProperty(value = "3小时降水（21时刻）")
    private Float pre369;

    @ApiModelProperty(value = "3小时降水（00时刻）")
    private Float pre372;

    @ApiModelProperty(value = "3小时降水（03时刻）")
    private Float pre375;

    @ApiModelProperty(value = "3小时降水（06时刻）")
    private Float pre378;

    @ApiModelProperty(value = "3小时降水（09时刻）")
    private Float pre381;

    @ApiModelProperty(value = "3小时降水（12时刻）")
    private Float pre384;

    @ApiModelProperty(value = "3小时降水（15时刻）")
    private Float pre387;

    @ApiModelProperty(value = "3小时降水（18时刻）")
    private Float pre390;

    @ApiModelProperty(value = "3小时降水（21时刻）")
    private Float pre393;

    @ApiModelProperty(value = "3小时降水（00时刻）")
    private Float pre396;

    @ApiModelProperty(value = "3小时降水（03时刻）")
    private Float pre399;

    @ApiModelProperty(value = "3小时降水（06时刻）")
    private Float pre3102;

    @ApiModelProperty(value = "3小时降水（09时刻）")
    private Float pre3105;

    @ApiModelProperty(value = "3小时降水（12时刻）")
    private Float pre3108;

    @ApiModelProperty(value = "3小时降水（15时刻）")
    private Float pre3111;

    @ApiModelProperty(value = "3小时降水（18时刻）")
    private Float pre3114;

    @ApiModelProperty(value = "3小时降水（21时刻）")
    private Float pre3117;

    @ApiModelProperty(value = "3小时降水（18时刻）")
    private Float pre3120;

    @ApiModelProperty(value = "3小时降水（21时刻）")
    private Float pre3123;

    @ApiModelProperty(value = "3小时降水（00时刻）")
    private Float pre3126;

    @ApiModelProperty(value = "3小时降水（03时刻）")
    private Float pre3129;

    @ApiModelProperty(value = "3小时降水（06时刻）")
    private Float pre3132;

    @ApiModelProperty(value = "3小时降水（09时刻）")
    private Float pre3135;

    @ApiModelProperty(value = "3小时降水（12时刻）")
    private Float pre3138;

    @ApiModelProperty(value = "3小时降水（15时刻）")
    private Float pre3141;

    @ApiModelProperty(value = "3小时降水（18时刻）")
    private Float pre3144;

    @ApiModelProperty(value = "3小时降水（21时刻）")
    private Float pre3147;

    @ApiModelProperty(value = "3小时降水（12时刻）")
    private Float pre3150;

    @ApiModelProperty(value = "3小时降水（15时刻）")
    private Float pre3153;

    @ApiModelProperty(value = "3小时降水（18时刻）")
    private Float pre3156;

    @ApiModelProperty(value = "3小时降水（21时刻）")
    private Float pre3159;

    @ApiModelProperty(value = "3小时降水（18时刻）")
    private Float pre3162;

    @ApiModelProperty(value = "3小时降水（21时刻）")
    private Float pre3165;

    @ApiModelProperty(value = "3小时降水（00时刻）")
    private Float pre3168;

    @ApiModelProperty(value = "3小时降水（03时刻）")
    private Float pre3171;

    @ApiModelProperty(value = "3小时降水（06时刻）")
    private Float pre3174;

    @ApiModelProperty(value = "3小时降水（09时刻）")
    private Float pre3177;

    @ApiModelProperty(value = "3小时降水（12时刻）")
    private Float pre3180;

    @ApiModelProperty(value = "3小时降水（15时刻）")
    private Float pre3183;

    @ApiModelProperty(value = "3小时降水（18时刻）")
    private Float pre3186;

    @ApiModelProperty(value = "3小时降水（21时刻）")
    private Float pre3189;

    @ApiModelProperty(value = "3小时降水（18时刻）")
    private Float pre3192;

    @ApiModelProperty(value = "3小时降水（21时刻）")
    private Float pre3195;

    @ApiModelProperty(value = "3小时降水（00时刻）")
    private Float pre3198;

    @ApiModelProperty(value = "3小时降水（03时刻）")
    private Float pre3201;

    @ApiModelProperty(value = "3小时降水（06时刻）")
    private Float pre3204;

    @ApiModelProperty(value = "3小时降水（09时刻）")
    private Float pre3207;

    @ApiModelProperty(value = "3小时降水（12时刻）")
    private Float pre3210;

    @ApiModelProperty(value = "3小时降水（15时刻）")
    private Float pre3213;

    @ApiModelProperty(value = "6小时降水（00时刻）")
    private Float pre600;

    @ApiModelProperty(value = "6小时降水（06时刻）")
    private Float pre606;

    @ApiModelProperty(value = "6小时降水（12时刻）")
    private Float pre612;

    @ApiModelProperty(value = "6小时降水（18时刻）")
    private Float pre618;

    @ApiModelProperty(value = "6小时降水（00时刻）")
    private Float pre624;

    @ApiModelProperty(value = "6小时降水（06时刻）")
    private Float pre630;

    @ApiModelProperty(value = "6小时降水（12时刻）")
    private Float pre636;

    @ApiModelProperty(value = "6小时降水（18时刻）")
    private Float pre642;

    @ApiModelProperty(value = "6小时降水（00时刻）")
    private Float pre648;

    @ApiModelProperty(value = "6小时降水（06时刻）")
    private Float pre654;

    @ApiModelProperty(value = "6小时降水（12时刻）")
    private Float pre660;

    @ApiModelProperty(value = "6小时降水（18时刻）")
    private Float pre666;

    @ApiModelProperty(value = "6小时降水（00时刻）")
    private Float pre672;

    @ApiModelProperty(value = "6小时降水（06时刻）")
    private Float pre678;

    @ApiModelProperty(value = "6小时降水（12时刻）")
    private Float pre684;

    @ApiModelProperty(value = "6小时降水（18时刻）")
    private Float pre690;

    @ApiModelProperty(value = "6小时降水（00时刻）")
    private Float pre696;

    @ApiModelProperty(value = "6小时降水（06时刻）")
    private Float pre6102;

    @ApiModelProperty(value = "6小时降水（12时刻）")
    private Float pre6108;

    @ApiModelProperty(value = "6小时降水（18时刻）")
    private Float pre6114;

    @ApiModelProperty(value = "6小时降水（00时刻）")
    private Float pre6120;

    @ApiModelProperty(value = "6小时降水（06时刻）")
    private Float pre6126;

    @ApiModelProperty(value = "6小时降水（12时刻）")
    private Float pre6132;

    @ApiModelProperty(value = "6小时降水（18时刻）")
    private Float pre6138;

    @ApiModelProperty(value = "6小时降水（00时刻）")
    private Float pre6144;

    @ApiModelProperty(value = "6小时降水（06时刻）")
    private Float pre6150;

    @ApiModelProperty(value = "6小时降水（12时刻）")
    private Float pre6156;

    @ApiModelProperty(value = "6小时降水（18时刻）")
    private Float pre6162;

    @ApiModelProperty(value = "6小时降水（00时刻）")
    private Float pre6168;

    @ApiModelProperty(value = "6小时降水（06时刻）")
    private Float pre6174;

    @ApiModelProperty(value = "6小时降水（12时刻）")
    private Float pre6180;

    @ApiModelProperty(value = "6小时降水（18时刻）")
    private Float pre6186;

    @ApiModelProperty(value = "6小时降水（00时刻）")
    private Float pre6192;

    @ApiModelProperty(value = "6小时降水（06时刻）")
    private Float pre6198;

    @ApiModelProperty(value = "6小时降水（12时刻）")
    private Float pre6204;

    @ApiModelProperty(value = "6小时降水（18时刻）")
    private Float pre6210;

    @ApiModelProperty(value = "12小时降水（00时刻）")
    private Float pre1200;

    @ApiModelProperty(value = "12小时降水（12时刻）")
    private Float pre1212;

    @ApiModelProperty(value = "12小时降水（00时刻）")
    private Float pre1224;

    @ApiModelProperty(value = "12小时降水（12时刻）")
    private Float pre1236;

    @ApiModelProperty(value = "12小时降水（00时刻）")
    private Float pre1248;

    @ApiModelProperty(value = "12小时降水（12时刻）")
    private Float pre1260;

    @ApiModelProperty(value = "12小时降水（00时刻）")
    private Float pre1272;

    @ApiModelProperty(value = "12小时降水（12时刻）")
    private Float pre1284;

    @ApiModelProperty(value = "12小时降水（00时刻）")
    private Float pre1296;

    @ApiModelProperty(value = "12小时降水（12时刻）")
    private Float pre12108;

    @ApiModelProperty(value = "12小时降水（00时刻）")
    private Float pre12120;

    @ApiModelProperty(value = "12小时降水（12时刻）")
    private Float pre12132;

    @ApiModelProperty(value = "12小时降水（00时刻）")
    private Float pre12144;

    @ApiModelProperty(value = "12小时降水（12时刻）")
    private Float pre12156;

    @ApiModelProperty(value = "12小时降水（00时刻）")
    private Float pre12168;

    @ApiModelProperty(value = "12小时降水（12时刻）")
    private Float pre12180;

    @ApiModelProperty(value = "12小时降水（00时刻）")
    private Float pre12192;

    @ApiModelProperty(value = "12小时降水（12时刻）")
    private Float pre12204;

    @ApiModelProperty(value = "24小时日最大气温")
    private Float temmax24;

    @ApiModelProperty(value = "48小时日最大气温")
    private Float temmax48;

    @ApiModelProperty(value = "72小时日最大气温")
    private Float temmax72;

    @ApiModelProperty(value = "96小时日最大气温")
    private Float temmax96;

    @ApiModelProperty(value = "120小时日最大气温")
    private Float temmax120;

    @ApiModelProperty(value = "144小时日最大气温")
    private Float temmax144;

    @ApiModelProperty(value = "168小时日最大气温")
    private Float temmax168;

    @ApiModelProperty(value = "24小时日最小气温")
    private Float temmin24;

    @ApiModelProperty(value = "48小时日最小气温")
    private Float temmin48;

    @ApiModelProperty(value = "72小时日最小气温")
    private Float temmin72;

    @ApiModelProperty(value = "96小时日最小气温")
    private Float temmin96;

    @ApiModelProperty(value = "120小时日最小气温")
    private Float temmin120;

    @ApiModelProperty(value = "144小时日最小气温")
    private Float temmin144;

    @ApiModelProperty(value = "168小时日最小气温")
    private Float temmin168;

    @ApiModelProperty(value = "24小时最大相对湿度")
    private Float rhumax24;

    @ApiModelProperty(value = "48小时最大相对湿度")
    private Float rhumax48;

    @ApiModelProperty(value = "72小时最大相对湿度")
    private Float rhumax72;

    @ApiModelProperty(value = "96小时最大相对湿度")
    private Float rhumax96;

    @ApiModelProperty(value = "120小时最大相对湿度")
    private Float rhumax120;

    @ApiModelProperty(value = "144小时最大相对湿度")
    private Float rhumax144;

    @ApiModelProperty(value = "168小时最大相对湿度")
    private Float rhumax168;

    @ApiModelProperty(value = "24小时最小相对湿度")
    private Float rhumin24;

    @ApiModelProperty(value = "48小时最小相对湿度")
    private Float rhumin48;

    @ApiModelProperty(value = "72小时最小相对湿度")
    private Float rhumin72;

    @ApiModelProperty(value = "96小时最小相对湿度")
    private Float rhumin96;

    @ApiModelProperty(value = "120小时最小相对湿度")
    private Float rhumin120;

    @ApiModelProperty(value = "144小时最小相对湿度")
    private Float rhumin144;

    @ApiModelProperty(value = "168小时最小相对湿度")
    private Float rhumin168;

    @ApiModelProperty(value = "24小时日照实数")
    private Float ssh24;

    @ApiModelProperty(value = "48小时日照实数")
    private Float ssh48;

    @ApiModelProperty(value = "72小时日照实数")
    private Float ssh72;

    @ApiModelProperty(value = "96小时日照实数")
    private Float ssh96;

    @ApiModelProperty(value = "120小时日照实数")
    private Float ssh120;

    @ApiModelProperty(value = "144小时日照实数")
    private Float ssh144;

    @ApiModelProperty(value = "168小时日照实数")
    private Float ssh168;

    @ApiModelProperty(value = "192小时日照实数")
    private Float ssh192;

    @ApiModelProperty(value = "216小时日照实数")
    private Float ssh216;

    @ApiModelProperty(value = "凝冻指数")
    private Float jsxt24;

    @ApiModelProperty(value = "凝冻指数")
    private Float ndzs24;

    @ApiModelProperty(value = "火险指数")
    private Float hxzs24;

    @ApiModelProperty(value = "今天夜间天气")
    private String tq00;

    @ApiModelProperty(value = "今天夜间雨量")
    private Float yl00;

    @ApiModelProperty(value = "明天白天天气")
    private String tq01;

    @ApiModelProperty(value = "明天白天雨量")
    private Float yl01;

    @ApiModelProperty(value = "今天夜间到明天白天天气(第1天)")
    private String onetq;

    @ApiModelProperty(value = "今天夜间到明天白天雨量(第1天)")
    private Float oneyl;

    @ApiModelProperty(value = "风速风向")
    private String onewin;

    @ApiModelProperty(value = "第二天天气")
    private String twotq;

    @ApiModelProperty(value = "第二天雨量")
    private Float twoyl;

    @ApiModelProperty(value = "第二天气温")
    private String twotem;

    @ApiModelProperty(value = "第二天特殊天气")
    private String twospe;

    @ApiModelProperty(value = "第二天风速风向")
    private String twowin;

    @ApiModelProperty(value = "第3天天气")
    private String threetq;

    @ApiModelProperty(value = "第3天雨量")
    private Float threeyl;

    @ApiModelProperty(value = "第3天气温")
    private String threetem;

    @ApiModelProperty(value = "第3天特殊天气")
    private String threespe;

    @ApiModelProperty(value = "第3天风速风向")
    private String threewin;

    @ApiModelProperty(value = "第4天天气")
    private String fourtq;

    @ApiModelProperty(value = "第4天雨量")
    private Float fouryl;

    @ApiModelProperty(value = "第4天气温")
    private String fourtem;

    @ApiModelProperty(value = "第4天特殊天气")
    private String fourspe;

    @ApiModelProperty(value = "第4天风速风向")
    private String fourwin;

    @ApiModelProperty(value = "第5天天气")
    private String fivetq;

    @ApiModelProperty(value = "第5天雨量")
    private Float fiveyl;

    @ApiModelProperty(value = "第5天气温")
    private String fivetem;

    @ApiModelProperty(value = "第5天特殊天气")
    private String fivespe;

    @ApiModelProperty(value = "第5天风速风向")
    private String fivewin;

    @ApiModelProperty(value = "第6天天气")
    private String sixtq;

    @ApiModelProperty(value = "第6天雨量")
    private Float sixyl;

    @ApiModelProperty(value = "第6天气温")
    private String sixtem;

    @ApiModelProperty(value = "第6天特殊天气")
    private String sixspe;

    @ApiModelProperty(value = "第6天风速风向")
    private String sixwin;

    @ApiModelProperty(value = "第7天天气")
    private String seventq;

    @ApiModelProperty(value = "第7天雨量")
    private Float sevenyl;

    @ApiModelProperty(value = "第7天气温")
    private String seventem;

    @ApiModelProperty(value = "第7天特殊天气")
    private String sevenspe;

    @ApiModelProperty(value = "第7天风速风向")
    private String sevenwin;

    @ApiModelProperty(value = "灾害天气大风")
    private String zhfeng24;

    @ApiModelProperty(value = "灾害天气大风")
    private String zhfeng48;

    @ApiModelProperty(value = "灾害天气大风")
    private String zhfeng72;

    @ApiModelProperty(value = "灾害天气_闪电")
    private String zhdian24;

    @ApiModelProperty(value = "灾害天气_闪电")
    private String zhdian48;

    @ApiModelProperty(value = "灾害天气_闪电")
    private String zhdian72;

    @ApiModelProperty(value = "灾害天气_大雾")
    private String zhwu24;

    @ApiModelProperty(value = "灾害天气_大雾")
    private String zhwu48;

    @ApiModelProperty(value = "灾害天气_大雾")
    private String zhwu72;

    @ApiModelProperty(value = "灾害天气_冰雹")
    private String zhbing24;

    @ApiModelProperty(value = "灾害天气_冰雹")
    private String zhbing48;

    @ApiModelProperty(value = "灾害天气_冰雹")
    private String zhbing72;

    @ApiModelProperty(value = "灾害天气_短时强降水")
    private String zhqjs24;

    @ApiModelProperty(value = "灾害天气_短时强降水")
    private String zhqjs48;

    @ApiModelProperty(value = "灾害天气_短时强降水")
    private String zhqjs72;

    @ApiModelProperty(value = "灾害天气_积雪")
    private String zhxue24;

    @ApiModelProperty(value = "灾害天气_积雪")
    private String zhxue48;

    @ApiModelProperty(value = "灾害天气_积雪")
    private String zhxue72;

    @ApiModelProperty(value = "灾害天气_强降温")
    private String zhqjw24;

    @ApiModelProperty(value = "灾害天气_强降温")
    private String zhqjw48;

    @ApiModelProperty(value = "灾害天气_强降温")
    private String zhqjw72;

    @ApiModelProperty(value = "灾害天气_凝冻")
    private String zhnd24;

    @ApiModelProperty(value = "灾害天气_凝冻")
    private String zhnd48;

    @ApiModelProperty(value = "灾害天气_凝冻")
    private String zhnd72;

    @ApiModelProperty(value = "灾害天气_霜")
    private String zhshuang24;

    @ApiModelProperty(value = "灾害天气_霜")
    private String zhshuang48;

    @ApiModelProperty(value = "灾害天气_霜")
    private String zhshuang72;

    private Float ndzs168;

    private Float ndzs96;

    private Float jsxt48;

    private Float jsxt120;

    private String onetem;

    private Float hxzs144;

    private Float jsxt72;

    private Float jsxt144;

    private String onespe;

    private Float hxzs72;

    private Float ndzs48;

    private Float hxzs96;

    private Float ndzs120;

    private Float hxzs168;

    private Float jsxt96;

    private Float hxzs48;

    private Float ndzs72;

    private Float hxzs120;

    private Float ndzs144;

    private Float jsxt168;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getLon() {
        return lon;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public String getRangetype() {
        return rangetype;
    }

    public void setRangetype(String rangetype) {
        this.rangetype = rangetype;
    }

    public String getBelongxian() {
        return belongxian;
    }

    public void setBelongxian(String belongxian) {
        this.belongxian = belongxian;
    }

    public String getBelongcity() {
        return belongcity;
    }

    public void setBelongcity(String belongcity) {
        this.belongcity = belongcity;
    }

    public LocalDateTime getTimemake() {
        return timemake;
    }

    public void setTimemake(LocalDateTime timemake) {
        this.timemake = timemake;
    }

    public LocalDateTime getTimeupload() {
        return timeupload;
    }

    public void setTimeupload(LocalDateTime timeupload) {
        this.timeupload = timeupload;
    }

    public Float getPre24() {
        return pre24;
    }

    public void setPre24(Float pre24) {
        this.pre24 = pre24;
    }

    public Float getPre48() {
        return pre48;
    }

    public void setPre48(Float pre48) {
        this.pre48 = pre48;
    }

    public Float getPre72() {
        return pre72;
    }

    public void setPre72(Float pre72) {
        this.pre72 = pre72;
    }

    public Float getPre96() {
        return pre96;
    }

    public void setPre96(Float pre96) {
        this.pre96 = pre96;
    }

    public Float getPre120() {
        return pre120;
    }

    public void setPre120(Float pre120) {
        this.pre120 = pre120;
    }

    public Float getPre144() {
        return pre144;
    }

    public void setPre144(Float pre144) {
        this.pre144 = pre144;
    }

    public Float getPre168() {
        return pre168;
    }

    public void setPre168(Float pre168) {
        this.pre168 = pre168;
    }

    public Float getPre192() {
        return pre192;
    }

    public void setPre192(Float pre192) {
        this.pre192 = pre192;
    }

    public Float getPre216() {
        return pre216;
    }

    public void setPre216(Float pre216) {
        this.pre216 = pre216;
    }

    public Integer getJsrs() {
        return jsrs;
    }

    public void setJsrs(Integer jsrs) {
        this.jsrs = jsrs;
    }

    public Integer getGwrs() {
        return gwrs;
    }

    public void setGwrs(Integer gwrs) {
        this.gwrs = gwrs;
    }

    public Float getJw() {
        return jw;
    }

    public void setJw(Float jw) {
        this.jw = jw;
    }

    public Float getPre300() {
        return pre300;
    }

    public void setPre300(Float pre300) {
        this.pre300 = pre300;
    }

    public Float getPre303() {
        return pre303;
    }

    public void setPre303(Float pre303) {
        this.pre303 = pre303;
    }

    public Float getPre306() {
        return pre306;
    }

    public void setPre306(Float pre306) {
        this.pre306 = pre306;
    }

    public Float getPre309() {
        return pre309;
    }

    public void setPre309(Float pre309) {
        this.pre309 = pre309;
    }

    public Float getPre312() {
        return pre312;
    }

    public void setPre312(Float pre312) {
        this.pre312 = pre312;
    }

    public Float getPre315() {
        return pre315;
    }

    public void setPre315(Float pre315) {
        this.pre315 = pre315;
    }

    public Float getPre318() {
        return pre318;
    }

    public void setPre318(Float pre318) {
        this.pre318 = pre318;
    }

    public Float getPre321() {
        return pre321;
    }

    public void setPre321(Float pre321) {
        this.pre321 = pre321;
    }

    public Float getPre324() {
        return pre324;
    }

    public void setPre324(Float pre324) {
        this.pre324 = pre324;
    }

    public Float getPre327() {
        return pre327;
    }

    public void setPre327(Float pre327) {
        this.pre327 = pre327;
    }

    public Float getPre330() {
        return pre330;
    }

    public void setPre330(Float pre330) {
        this.pre330 = pre330;
    }

    public Float getPre333() {
        return pre333;
    }

    public void setPre333(Float pre333) {
        this.pre333 = pre333;
    }

    public Float getPre336() {
        return pre336;
    }

    public void setPre336(Float pre336) {
        this.pre336 = pre336;
    }

    public Float getPre339() {
        return pre339;
    }

    public void setPre339(Float pre339) {
        this.pre339 = pre339;
    }

    public Float getPre342() {
        return pre342;
    }

    public void setPre342(Float pre342) {
        this.pre342 = pre342;
    }

    public Float getPre345() {
        return pre345;
    }

    public void setPre345(Float pre345) {
        this.pre345 = pre345;
    }

    public Float getPre348() {
        return pre348;
    }

    public void setPre348(Float pre348) {
        this.pre348 = pre348;
    }

    public Float getPre351() {
        return pre351;
    }

    public void setPre351(Float pre351) {
        this.pre351 = pre351;
    }

    public Float getPre354() {
        return pre354;
    }

    public void setPre354(Float pre354) {
        this.pre354 = pre354;
    }

    public Float getPre357() {
        return pre357;
    }

    public void setPre357(Float pre357) {
        this.pre357 = pre357;
    }

    public Float getPre360() {
        return pre360;
    }

    public void setPre360(Float pre360) {
        this.pre360 = pre360;
    }

    public Float getPre363() {
        return pre363;
    }

    public void setPre363(Float pre363) {
        this.pre363 = pre363;
    }

    public Float getPre366() {
        return pre366;
    }

    public void setPre366(Float pre366) {
        this.pre366 = pre366;
    }

    public Float getPre369() {
        return pre369;
    }

    public void setPre369(Float pre369) {
        this.pre369 = pre369;
    }

    public Float getPre372() {
        return pre372;
    }

    public void setPre372(Float pre372) {
        this.pre372 = pre372;
    }

    public Float getPre375() {
        return pre375;
    }

    public void setPre375(Float pre375) {
        this.pre375 = pre375;
    }

    public Float getPre378() {
        return pre378;
    }

    public void setPre378(Float pre378) {
        this.pre378 = pre378;
    }

    public Float getPre381() {
        return pre381;
    }

    public void setPre381(Float pre381) {
        this.pre381 = pre381;
    }

    public Float getPre384() {
        return pre384;
    }

    public void setPre384(Float pre384) {
        this.pre384 = pre384;
    }

    public Float getPre387() {
        return pre387;
    }

    public void setPre387(Float pre387) {
        this.pre387 = pre387;
    }

    public Float getPre390() {
        return pre390;
    }

    public void setPre390(Float pre390) {
        this.pre390 = pre390;
    }

    public Float getPre393() {
        return pre393;
    }

    public void setPre393(Float pre393) {
        this.pre393 = pre393;
    }

    public Float getPre396() {
        return pre396;
    }

    public void setPre396(Float pre396) {
        this.pre396 = pre396;
    }

    public Float getPre399() {
        return pre399;
    }

    public void setPre399(Float pre399) {
        this.pre399 = pre399;
    }

    public Float getPre3102() {
        return pre3102;
    }

    public void setPre3102(Float pre3102) {
        this.pre3102 = pre3102;
    }

    public Float getPre3105() {
        return pre3105;
    }

    public void setPre3105(Float pre3105) {
        this.pre3105 = pre3105;
    }

    public Float getPre3108() {
        return pre3108;
    }

    public void setPre3108(Float pre3108) {
        this.pre3108 = pre3108;
    }

    public Float getPre3111() {
        return pre3111;
    }

    public void setPre3111(Float pre3111) {
        this.pre3111 = pre3111;
    }

    public Float getPre3114() {
        return pre3114;
    }

    public void setPre3114(Float pre3114) {
        this.pre3114 = pre3114;
    }

    public Float getPre3117() {
        return pre3117;
    }

    public void setPre3117(Float pre3117) {
        this.pre3117 = pre3117;
    }

    public Float getPre3120() {
        return pre3120;
    }

    public void setPre3120(Float pre3120) {
        this.pre3120 = pre3120;
    }

    public Float getPre3123() {
        return pre3123;
    }

    public void setPre3123(Float pre3123) {
        this.pre3123 = pre3123;
    }

    public Float getPre3126() {
        return pre3126;
    }

    public void setPre3126(Float pre3126) {
        this.pre3126 = pre3126;
    }

    public Float getPre3129() {
        return pre3129;
    }

    public void setPre3129(Float pre3129) {
        this.pre3129 = pre3129;
    }

    public Float getPre3132() {
        return pre3132;
    }

    public void setPre3132(Float pre3132) {
        this.pre3132 = pre3132;
    }

    public Float getPre3135() {
        return pre3135;
    }

    public void setPre3135(Float pre3135) {
        this.pre3135 = pre3135;
    }

    public Float getPre3138() {
        return pre3138;
    }

    public void setPre3138(Float pre3138) {
        this.pre3138 = pre3138;
    }

    public Float getPre3141() {
        return pre3141;
    }

    public void setPre3141(Float pre3141) {
        this.pre3141 = pre3141;
    }

    public Float getPre3144() {
        return pre3144;
    }

    public void setPre3144(Float pre3144) {
        this.pre3144 = pre3144;
    }

    public Float getPre3147() {
        return pre3147;
    }

    public void setPre3147(Float pre3147) {
        this.pre3147 = pre3147;
    }

    public Float getPre3150() {
        return pre3150;
    }

    public void setPre3150(Float pre3150) {
        this.pre3150 = pre3150;
    }

    public Float getPre3153() {
        return pre3153;
    }

    public void setPre3153(Float pre3153) {
        this.pre3153 = pre3153;
    }

    public Float getPre3156() {
        return pre3156;
    }

    public void setPre3156(Float pre3156) {
        this.pre3156 = pre3156;
    }

    public Float getPre3159() {
        return pre3159;
    }

    public void setPre3159(Float pre3159) {
        this.pre3159 = pre3159;
    }

    public Float getPre3162() {
        return pre3162;
    }

    public void setPre3162(Float pre3162) {
        this.pre3162 = pre3162;
    }

    public Float getPre3165() {
        return pre3165;
    }

    public void setPre3165(Float pre3165) {
        this.pre3165 = pre3165;
    }

    public Float getPre3168() {
        return pre3168;
    }

    public void setPre3168(Float pre3168) {
        this.pre3168 = pre3168;
    }

    public Float getPre3171() {
        return pre3171;
    }

    public void setPre3171(Float pre3171) {
        this.pre3171 = pre3171;
    }

    public Float getPre3174() {
        return pre3174;
    }

    public void setPre3174(Float pre3174) {
        this.pre3174 = pre3174;
    }

    public Float getPre3177() {
        return pre3177;
    }

    public void setPre3177(Float pre3177) {
        this.pre3177 = pre3177;
    }

    public Float getPre3180() {
        return pre3180;
    }

    public void setPre3180(Float pre3180) {
        this.pre3180 = pre3180;
    }

    public Float getPre3183() {
        return pre3183;
    }

    public void setPre3183(Float pre3183) {
        this.pre3183 = pre3183;
    }

    public Float getPre3186() {
        return pre3186;
    }

    public void setPre3186(Float pre3186) {
        this.pre3186 = pre3186;
    }

    public Float getPre3189() {
        return pre3189;
    }

    public void setPre3189(Float pre3189) {
        this.pre3189 = pre3189;
    }

    public Float getPre3192() {
        return pre3192;
    }

    public void setPre3192(Float pre3192) {
        this.pre3192 = pre3192;
    }

    public Float getPre3195() {
        return pre3195;
    }

    public void setPre3195(Float pre3195) {
        this.pre3195 = pre3195;
    }

    public Float getPre3198() {
        return pre3198;
    }

    public void setPre3198(Float pre3198) {
        this.pre3198 = pre3198;
    }

    public Float getPre3201() {
        return pre3201;
    }

    public void setPre3201(Float pre3201) {
        this.pre3201 = pre3201;
    }

    public Float getPre3204() {
        return pre3204;
    }

    public void setPre3204(Float pre3204) {
        this.pre3204 = pre3204;
    }

    public Float getPre3207() {
        return pre3207;
    }

    public void setPre3207(Float pre3207) {
        this.pre3207 = pre3207;
    }

    public Float getPre3210() {
        return pre3210;
    }

    public void setPre3210(Float pre3210) {
        this.pre3210 = pre3210;
    }

    public Float getPre3213() {
        return pre3213;
    }

    public void setPre3213(Float pre3213) {
        this.pre3213 = pre3213;
    }

    public Float getPre600() {
        return pre600;
    }

    public void setPre600(Float pre600) {
        this.pre600 = pre600;
    }

    public Float getPre606() {
        return pre606;
    }

    public void setPre606(Float pre606) {
        this.pre606 = pre606;
    }

    public Float getPre612() {
        return pre612;
    }

    public void setPre612(Float pre612) {
        this.pre612 = pre612;
    }

    public Float getPre618() {
        return pre618;
    }

    public void setPre618(Float pre618) {
        this.pre618 = pre618;
    }

    public Float getPre624() {
        return pre624;
    }

    public void setPre624(Float pre624) {
        this.pre624 = pre624;
    }

    public Float getPre630() {
        return pre630;
    }

    public void setPre630(Float pre630) {
        this.pre630 = pre630;
    }

    public Float getPre636() {
        return pre636;
    }

    public void setPre636(Float pre636) {
        this.pre636 = pre636;
    }

    public Float getPre642() {
        return pre642;
    }

    public void setPre642(Float pre642) {
        this.pre642 = pre642;
    }

    public Float getPre648() {
        return pre648;
    }

    public void setPre648(Float pre648) {
        this.pre648 = pre648;
    }

    public Float getPre654() {
        return pre654;
    }

    public void setPre654(Float pre654) {
        this.pre654 = pre654;
    }

    public Float getPre660() {
        return pre660;
    }

    public void setPre660(Float pre660) {
        this.pre660 = pre660;
    }

    public Float getPre666() {
        return pre666;
    }

    public void setPre666(Float pre666) {
        this.pre666 = pre666;
    }

    public Float getPre672() {
        return pre672;
    }

    public void setPre672(Float pre672) {
        this.pre672 = pre672;
    }

    public Float getPre678() {
        return pre678;
    }

    public void setPre678(Float pre678) {
        this.pre678 = pre678;
    }

    public Float getPre684() {
        return pre684;
    }

    public void setPre684(Float pre684) {
        this.pre684 = pre684;
    }

    public Float getPre690() {
        return pre690;
    }

    public void setPre690(Float pre690) {
        this.pre690 = pre690;
    }

    public Float getPre696() {
        return pre696;
    }

    public void setPre696(Float pre696) {
        this.pre696 = pre696;
    }

    public Float getPre6102() {
        return pre6102;
    }

    public void setPre6102(Float pre6102) {
        this.pre6102 = pre6102;
    }

    public Float getPre6108() {
        return pre6108;
    }

    public void setPre6108(Float pre6108) {
        this.pre6108 = pre6108;
    }

    public Float getPre6114() {
        return pre6114;
    }

    public void setPre6114(Float pre6114) {
        this.pre6114 = pre6114;
    }

    public Float getPre6120() {
        return pre6120;
    }

    public void setPre6120(Float pre6120) {
        this.pre6120 = pre6120;
    }

    public Float getPre6126() {
        return pre6126;
    }

    public void setPre6126(Float pre6126) {
        this.pre6126 = pre6126;
    }

    public Float getPre6132() {
        return pre6132;
    }

    public void setPre6132(Float pre6132) {
        this.pre6132 = pre6132;
    }

    public Float getPre6138() {
        return pre6138;
    }

    public void setPre6138(Float pre6138) {
        this.pre6138 = pre6138;
    }

    public Float getPre6144() {
        return pre6144;
    }

    public void setPre6144(Float pre6144) {
        this.pre6144 = pre6144;
    }

    public Float getPre6150() {
        return pre6150;
    }

    public void setPre6150(Float pre6150) {
        this.pre6150 = pre6150;
    }

    public Float getPre6156() {
        return pre6156;
    }

    public void setPre6156(Float pre6156) {
        this.pre6156 = pre6156;
    }

    public Float getPre6162() {
        return pre6162;
    }

    public void setPre6162(Float pre6162) {
        this.pre6162 = pre6162;
    }

    public Float getPre6168() {
        return pre6168;
    }

    public void setPre6168(Float pre6168) {
        this.pre6168 = pre6168;
    }

    public Float getPre6174() {
        return pre6174;
    }

    public void setPre6174(Float pre6174) {
        this.pre6174 = pre6174;
    }

    public Float getPre6180() {
        return pre6180;
    }

    public void setPre6180(Float pre6180) {
        this.pre6180 = pre6180;
    }

    public Float getPre6186() {
        return pre6186;
    }

    public void setPre6186(Float pre6186) {
        this.pre6186 = pre6186;
    }

    public Float getPre6192() {
        return pre6192;
    }

    public void setPre6192(Float pre6192) {
        this.pre6192 = pre6192;
    }

    public Float getPre6198() {
        return pre6198;
    }

    public void setPre6198(Float pre6198) {
        this.pre6198 = pre6198;
    }

    public Float getPre6204() {
        return pre6204;
    }

    public void setPre6204(Float pre6204) {
        this.pre6204 = pre6204;
    }

    public Float getPre6210() {
        return pre6210;
    }

    public void setPre6210(Float pre6210) {
        this.pre6210 = pre6210;
    }

    public Float getPre1200() {
        return pre1200;
    }

    public void setPre1200(Float pre1200) {
        this.pre1200 = pre1200;
    }

    public Float getPre1212() {
        return pre1212;
    }

    public void setPre1212(Float pre1212) {
        this.pre1212 = pre1212;
    }

    public Float getPre1224() {
        return pre1224;
    }

    public void setPre1224(Float pre1224) {
        this.pre1224 = pre1224;
    }

    public Float getPre1236() {
        return pre1236;
    }

    public void setPre1236(Float pre1236) {
        this.pre1236 = pre1236;
    }

    public Float getPre1248() {
        return pre1248;
    }

    public void setPre1248(Float pre1248) {
        this.pre1248 = pre1248;
    }

    public Float getPre1260() {
        return pre1260;
    }

    public void setPre1260(Float pre1260) {
        this.pre1260 = pre1260;
    }

    public Float getPre1272() {
        return pre1272;
    }

    public void setPre1272(Float pre1272) {
        this.pre1272 = pre1272;
    }

    public Float getPre1284() {
        return pre1284;
    }

    public void setPre1284(Float pre1284) {
        this.pre1284 = pre1284;
    }

    public Float getPre1296() {
        return pre1296;
    }

    public void setPre1296(Float pre1296) {
        this.pre1296 = pre1296;
    }

    public Float getPre12108() {
        return pre12108;
    }

    public void setPre12108(Float pre12108) {
        this.pre12108 = pre12108;
    }

    public Float getPre12120() {
        return pre12120;
    }

    public void setPre12120(Float pre12120) {
        this.pre12120 = pre12120;
    }

    public Float getPre12132() {
        return pre12132;
    }

    public void setPre12132(Float pre12132) {
        this.pre12132 = pre12132;
    }

    public Float getPre12144() {
        return pre12144;
    }

    public void setPre12144(Float pre12144) {
        this.pre12144 = pre12144;
    }

    public Float getPre12156() {
        return pre12156;
    }

    public void setPre12156(Float pre12156) {
        this.pre12156 = pre12156;
    }

    public Float getPre12168() {
        return pre12168;
    }

    public void setPre12168(Float pre12168) {
        this.pre12168 = pre12168;
    }

    public Float getPre12180() {
        return pre12180;
    }

    public void setPre12180(Float pre12180) {
        this.pre12180 = pre12180;
    }

    public Float getPre12192() {
        return pre12192;
    }

    public void setPre12192(Float pre12192) {
        this.pre12192 = pre12192;
    }

    public Float getPre12204() {
        return pre12204;
    }

    public void setPre12204(Float pre12204) {
        this.pre12204 = pre12204;
    }

    public Float getTemmax24() {
        return temmax24;
    }

    public void setTemmax24(Float temmax24) {
        this.temmax24 = temmax24;
    }

    public Float getTemmax48() {
        return temmax48;
    }

    public void setTemmax48(Float temmax48) {
        this.temmax48 = temmax48;
    }

    public Float getTemmax72() {
        return temmax72;
    }

    public void setTemmax72(Float temmax72) {
        this.temmax72 = temmax72;
    }

    public Float getTemmax96() {
        return temmax96;
    }

    public void setTemmax96(Float temmax96) {
        this.temmax96 = temmax96;
    }

    public Float getTemmax120() {
        return temmax120;
    }

    public void setTemmax120(Float temmax120) {
        this.temmax120 = temmax120;
    }

    public Float getTemmax144() {
        return temmax144;
    }

    public void setTemmax144(Float temmax144) {
        this.temmax144 = temmax144;
    }

    public Float getTemmax168() {
        return temmax168;
    }

    public void setTemmax168(Float temmax168) {
        this.temmax168 = temmax168;
    }

    public Float getTemmin24() {
        return temmin24;
    }

    public void setTemmin24(Float temmin24) {
        this.temmin24 = temmin24;
    }

    public Float getTemmin48() {
        return temmin48;
    }

    public void setTemmin48(Float temmin48) {
        this.temmin48 = temmin48;
    }

    public Float getTemmin72() {
        return temmin72;
    }

    public void setTemmin72(Float temmin72) {
        this.temmin72 = temmin72;
    }

    public Float getTemmin96() {
        return temmin96;
    }

    public void setTemmin96(Float temmin96) {
        this.temmin96 = temmin96;
    }

    public Float getTemmin120() {
        return temmin120;
    }

    public void setTemmin120(Float temmin120) {
        this.temmin120 = temmin120;
    }

    public Float getTemmin144() {
        return temmin144;
    }

    public void setTemmin144(Float temmin144) {
        this.temmin144 = temmin144;
    }

    public Float getTemmin168() {
        return temmin168;
    }

    public void setTemmin168(Float temmin168) {
        this.temmin168 = temmin168;
    }

    public Float getRhumax24() {
        return rhumax24;
    }

    public void setRhumax24(Float rhumax24) {
        this.rhumax24 = rhumax24;
    }

    public Float getRhumax48() {
        return rhumax48;
    }

    public void setRhumax48(Float rhumax48) {
        this.rhumax48 = rhumax48;
    }

    public Float getRhumax72() {
        return rhumax72;
    }

    public void setRhumax72(Float rhumax72) {
        this.rhumax72 = rhumax72;
    }

    public Float getRhumax96() {
        return rhumax96;
    }

    public void setRhumax96(Float rhumax96) {
        this.rhumax96 = rhumax96;
    }

    public Float getRhumax120() {
        return rhumax120;
    }

    public void setRhumax120(Float rhumax120) {
        this.rhumax120 = rhumax120;
    }

    public Float getRhumax144() {
        return rhumax144;
    }

    public void setRhumax144(Float rhumax144) {
        this.rhumax144 = rhumax144;
    }

    public Float getRhumax168() {
        return rhumax168;
    }

    public void setRhumax168(Float rhumax168) {
        this.rhumax168 = rhumax168;
    }

    public Float getRhumin24() {
        return rhumin24;
    }

    public void setRhumin24(Float rhumin24) {
        this.rhumin24 = rhumin24;
    }

    public Float getRhumin48() {
        return rhumin48;
    }

    public void setRhumin48(Float rhumin48) {
        this.rhumin48 = rhumin48;
    }

    public Float getRhumin72() {
        return rhumin72;
    }

    public void setRhumin72(Float rhumin72) {
        this.rhumin72 = rhumin72;
    }

    public Float getRhumin96() {
        return rhumin96;
    }

    public void setRhumin96(Float rhumin96) {
        this.rhumin96 = rhumin96;
    }

    public Float getRhumin120() {
        return rhumin120;
    }

    public void setRhumin120(Float rhumin120) {
        this.rhumin120 = rhumin120;
    }

    public Float getRhumin144() {
        return rhumin144;
    }

    public void setRhumin144(Float rhumin144) {
        this.rhumin144 = rhumin144;
    }

    public Float getRhumin168() {
        return rhumin168;
    }

    public void setRhumin168(Float rhumin168) {
        this.rhumin168 = rhumin168;
    }

    public Float getSsh24() {
        return ssh24;
    }

    public void setSsh24(Float ssh24) {
        this.ssh24 = ssh24;
    }

    public Float getSsh48() {
        return ssh48;
    }

    public void setSsh48(Float ssh48) {
        this.ssh48 = ssh48;
    }

    public Float getSsh72() {
        return ssh72;
    }

    public void setSsh72(Float ssh72) {
        this.ssh72 = ssh72;
    }

    public Float getSsh96() {
        return ssh96;
    }

    public void setSsh96(Float ssh96) {
        this.ssh96 = ssh96;
    }

    public Float getSsh120() {
        return ssh120;
    }

    public void setSsh120(Float ssh120) {
        this.ssh120 = ssh120;
    }

    public Float getSsh144() {
        return ssh144;
    }

    public void setSsh144(Float ssh144) {
        this.ssh144 = ssh144;
    }

    public Float getSsh168() {
        return ssh168;
    }

    public void setSsh168(Float ssh168) {
        this.ssh168 = ssh168;
    }

    public Float getSsh192() {
        return ssh192;
    }

    public void setSsh192(Float ssh192) {
        this.ssh192 = ssh192;
    }

    public Float getSsh216() {
        return ssh216;
    }

    public void setSsh216(Float ssh216) {
        this.ssh216 = ssh216;
    }

    public Float getJsxt24() {
        return jsxt24;
    }

    public void setJsxt24(Float jsxt24) {
        this.jsxt24 = jsxt24;
    }

    public Float getNdzs24() {
        return ndzs24;
    }

    public void setNdzs24(Float ndzs24) {
        this.ndzs24 = ndzs24;
    }

    public Float getHxzs24() {
        return hxzs24;
    }

    public void setHxzs24(Float hxzs24) {
        this.hxzs24 = hxzs24;
    }

    public String getTq00() {
        return tq00;
    }

    public void setTq00(String tq00) {
        this.tq00 = tq00;
    }

    public Float getYl00() {
        return yl00;
    }

    public void setYl00(Float yl00) {
        this.yl00 = yl00;
    }

    public String getTq01() {
        return tq01;
    }

    public void setTq01(String tq01) {
        this.tq01 = tq01;
    }

    public Float getYl01() {
        return yl01;
    }

    public void setYl01(Float yl01) {
        this.yl01 = yl01;
    }

    public String getOnetq() {
        return onetq;
    }

    public void setOnetq(String onetq) {
        this.onetq = onetq;
    }

    public Float getOneyl() {
        return oneyl;
    }

    public void setOneyl(Float oneyl) {
        this.oneyl = oneyl;
    }

    public String getOnewin() {
        return onewin;
    }

    public void setOnewin(String onewin) {
        this.onewin = onewin;
    }

    public String getTwotq() {
        return twotq;
    }

    public void setTwotq(String twotq) {
        this.twotq = twotq;
    }

    public Float getTwoyl() {
        return twoyl;
    }

    public void setTwoyl(Float twoyl) {
        this.twoyl = twoyl;
    }

    public String getTwotem() {
        return twotem;
    }

    public void setTwotem(String twotem) {
        this.twotem = twotem;
    }

    public String getTwospe() {
        return twospe;
    }

    public void setTwospe(String twospe) {
        this.twospe = twospe;
    }

    public String getTwowin() {
        return twowin;
    }

    public void setTwowin(String twowin) {
        this.twowin = twowin;
    }

    public String getThreetq() {
        return threetq;
    }

    public void setThreetq(String threetq) {
        this.threetq = threetq;
    }

    public Float getThreeyl() {
        return threeyl;
    }

    public void setThreeyl(Float threeyl) {
        this.threeyl = threeyl;
    }

    public String getThreetem() {
        return threetem;
    }

    public void setThreetem(String threetem) {
        this.threetem = threetem;
    }

    public String getThreespe() {
        return threespe;
    }

    public void setThreespe(String threespe) {
        this.threespe = threespe;
    }

    public String getThreewin() {
        return threewin;
    }

    public void setThreewin(String threewin) {
        this.threewin = threewin;
    }

    public String getFourtq() {
        return fourtq;
    }

    public void setFourtq(String fourtq) {
        this.fourtq = fourtq;
    }

    public Float getFouryl() {
        return fouryl;
    }

    public void setFouryl(Float fouryl) {
        this.fouryl = fouryl;
    }

    public String getFourtem() {
        return fourtem;
    }

    public void setFourtem(String fourtem) {
        this.fourtem = fourtem;
    }

    public String getFourspe() {
        return fourspe;
    }

    public void setFourspe(String fourspe) {
        this.fourspe = fourspe;
    }

    public String getFourwin() {
        return fourwin;
    }

    public void setFourwin(String fourwin) {
        this.fourwin = fourwin;
    }

    public String getFivetq() {
        return fivetq;
    }

    public void setFivetq(String fivetq) {
        this.fivetq = fivetq;
    }

    public Float getFiveyl() {
        return fiveyl;
    }

    public void setFiveyl(Float fiveyl) {
        this.fiveyl = fiveyl;
    }

    public String getFivetem() {
        return fivetem;
    }

    public void setFivetem(String fivetem) {
        this.fivetem = fivetem;
    }

    public String getFivespe() {
        return fivespe;
    }

    public void setFivespe(String fivespe) {
        this.fivespe = fivespe;
    }

    public String getFivewin() {
        return fivewin;
    }

    public void setFivewin(String fivewin) {
        this.fivewin = fivewin;
    }

    public String getSixtq() {
        return sixtq;
    }

    public void setSixtq(String sixtq) {
        this.sixtq = sixtq;
    }

    public Float getSixyl() {
        return sixyl;
    }

    public void setSixyl(Float sixyl) {
        this.sixyl = sixyl;
    }

    public String getSixtem() {
        return sixtem;
    }

    public void setSixtem(String sixtem) {
        this.sixtem = sixtem;
    }

    public String getSixspe() {
        return sixspe;
    }

    public void setSixspe(String sixspe) {
        this.sixspe = sixspe;
    }

    public String getSixwin() {
        return sixwin;
    }

    public void setSixwin(String sixwin) {
        this.sixwin = sixwin;
    }

    public String getSeventq() {
        return seventq;
    }

    public void setSeventq(String seventq) {
        this.seventq = seventq;
    }

    public Float getSevenyl() {
        return sevenyl;
    }

    public void setSevenyl(Float sevenyl) {
        this.sevenyl = sevenyl;
    }

    public String getSeventem() {
        return seventem;
    }

    public void setSeventem(String seventem) {
        this.seventem = seventem;
    }

    public String getSevenspe() {
        return sevenspe;
    }

    public void setSevenspe(String sevenspe) {
        this.sevenspe = sevenspe;
    }

    public String getSevenwin() {
        return sevenwin;
    }

    public void setSevenwin(String sevenwin) {
        this.sevenwin = sevenwin;
    }

    public String getZhfeng24() {
        return zhfeng24;
    }

    public void setZhfeng24(String zhfeng24) {
        this.zhfeng24 = zhfeng24;
    }

    public String getZhfeng48() {
        return zhfeng48;
    }

    public void setZhfeng48(String zhfeng48) {
        this.zhfeng48 = zhfeng48;
    }

    public String getZhfeng72() {
        return zhfeng72;
    }

    public void setZhfeng72(String zhfeng72) {
        this.zhfeng72 = zhfeng72;
    }

    public String getZhdian24() {
        return zhdian24;
    }

    public void setZhdian24(String zhdian24) {
        this.zhdian24 = zhdian24;
    }

    public String getZhdian48() {
        return zhdian48;
    }

    public void setZhdian48(String zhdian48) {
        this.zhdian48 = zhdian48;
    }

    public String getZhdian72() {
        return zhdian72;
    }

    public void setZhdian72(String zhdian72) {
        this.zhdian72 = zhdian72;
    }

    public String getZhwu24() {
        return zhwu24;
    }

    public void setZhwu24(String zhwu24) {
        this.zhwu24 = zhwu24;
    }

    public String getZhwu48() {
        return zhwu48;
    }

    public void setZhwu48(String zhwu48) {
        this.zhwu48 = zhwu48;
    }

    public String getZhwu72() {
        return zhwu72;
    }

    public void setZhwu72(String zhwu72) {
        this.zhwu72 = zhwu72;
    }

    public String getZhbing24() {
        return zhbing24;
    }

    public void setZhbing24(String zhbing24) {
        this.zhbing24 = zhbing24;
    }

    public String getZhbing48() {
        return zhbing48;
    }

    public void setZhbing48(String zhbing48) {
        this.zhbing48 = zhbing48;
    }

    public String getZhbing72() {
        return zhbing72;
    }

    public void setZhbing72(String zhbing72) {
        this.zhbing72 = zhbing72;
    }

    public String getZhqjs24() {
        return zhqjs24;
    }

    public void setZhqjs24(String zhqjs24) {
        this.zhqjs24 = zhqjs24;
    }

    public String getZhqjs48() {
        return zhqjs48;
    }

    public void setZhqjs48(String zhqjs48) {
        this.zhqjs48 = zhqjs48;
    }

    public String getZhqjs72() {
        return zhqjs72;
    }

    public void setZhqjs72(String zhqjs72) {
        this.zhqjs72 = zhqjs72;
    }

    public String getZhxue24() {
        return zhxue24;
    }

    public void setZhxue24(String zhxue24) {
        this.zhxue24 = zhxue24;
    }

    public String getZhxue48() {
        return zhxue48;
    }

    public void setZhxue48(String zhxue48) {
        this.zhxue48 = zhxue48;
    }

    public String getZhxue72() {
        return zhxue72;
    }

    public void setZhxue72(String zhxue72) {
        this.zhxue72 = zhxue72;
    }

    public String getZhqjw24() {
        return zhqjw24;
    }

    public void setZhqjw24(String zhqjw24) {
        this.zhqjw24 = zhqjw24;
    }

    public String getZhqjw48() {
        return zhqjw48;
    }

    public void setZhqjw48(String zhqjw48) {
        this.zhqjw48 = zhqjw48;
    }

    public String getZhqjw72() {
        return zhqjw72;
    }

    public void setZhqjw72(String zhqjw72) {
        this.zhqjw72 = zhqjw72;
    }

    public String getZhnd24() {
        return zhnd24;
    }

    public void setZhnd24(String zhnd24) {
        this.zhnd24 = zhnd24;
    }

    public String getZhnd48() {
        return zhnd48;
    }

    public void setZhnd48(String zhnd48) {
        this.zhnd48 = zhnd48;
    }

    public String getZhnd72() {
        return zhnd72;
    }

    public void setZhnd72(String zhnd72) {
        this.zhnd72 = zhnd72;
    }

    public String getZhshuang24() {
        return zhshuang24;
    }

    public void setZhshuang24(String zhshuang24) {
        this.zhshuang24 = zhshuang24;
    }

    public String getZhshuang48() {
        return zhshuang48;
    }

    public void setZhshuang48(String zhshuang48) {
        this.zhshuang48 = zhshuang48;
    }

    public String getZhshuang72() {
        return zhshuang72;
    }

    public void setZhshuang72(String zhshuang72) {
        this.zhshuang72 = zhshuang72;
    }

    public Float getNdzs168() {
        return ndzs168;
    }

    public void setNdzs168(Float ndzs168) {
        this.ndzs168 = ndzs168;
    }

    public Float getNdzs96() {
        return ndzs96;
    }

    public void setNdzs96(Float ndzs96) {
        this.ndzs96 = ndzs96;
    }

    public Float getJsxt48() {
        return jsxt48;
    }

    public void setJsxt48(Float jsxt48) {
        this.jsxt48 = jsxt48;
    }

    public Float getJsxt120() {
        return jsxt120;
    }

    public void setJsxt120(Float jsxt120) {
        this.jsxt120 = jsxt120;
    }

    public String getOnetem() {
        return onetem;
    }

    public void setOnetem(String onetem) {
        this.onetem = onetem;
    }

    public Float getHxzs144() {
        return hxzs144;
    }

    public void setHxzs144(Float hxzs144) {
        this.hxzs144 = hxzs144;
    }

    public Float getJsxt72() {
        return jsxt72;
    }

    public void setJsxt72(Float jsxt72) {
        this.jsxt72 = jsxt72;
    }

    public Float getJsxt144() {
        return jsxt144;
    }

    public void setJsxt144(Float jsxt144) {
        this.jsxt144 = jsxt144;
    }

    public String getOnespe() {
        return onespe;
    }

    public void setOnespe(String onespe) {
        this.onespe = onespe;
    }

    public Float getHxzs72() {
        return hxzs72;
    }

    public void setHxzs72(Float hxzs72) {
        this.hxzs72 = hxzs72;
    }

    public Float getNdzs48() {
        return ndzs48;
    }

    public void setNdzs48(Float ndzs48) {
        this.ndzs48 = ndzs48;
    }

    public Float getHxzs96() {
        return hxzs96;
    }

    public void setHxzs96(Float hxzs96) {
        this.hxzs96 = hxzs96;
    }

    public Float getNdzs120() {
        return ndzs120;
    }

    public void setNdzs120(Float ndzs120) {
        this.ndzs120 = ndzs120;
    }

    public Float getHxzs168() {
        return hxzs168;
    }

    public void setHxzs168(Float hxzs168) {
        this.hxzs168 = hxzs168;
    }

    public Float getJsxt96() {
        return jsxt96;
    }

    public void setJsxt96(Float jsxt96) {
        this.jsxt96 = jsxt96;
    }

    public Float getHxzs48() {
        return hxzs48;
    }

    public void setHxzs48(Float hxzs48) {
        this.hxzs48 = hxzs48;
    }

    public Float getNdzs72() {
        return ndzs72;
    }

    public void setNdzs72(Float ndzs72) {
        this.ndzs72 = ndzs72;
    }

    public Float getHxzs120() {
        return hxzs120;
    }

    public void setHxzs120(Float hxzs120) {
        this.hxzs120 = hxzs120;
    }

    public Float getNdzs144() {
        return ndzs144;
    }

    public void setNdzs144(Float ndzs144) {
        this.ndzs144 = ndzs144;
    }

    public Float getJsxt168() {
        return jsxt168;
    }

    public void setJsxt168(Float jsxt168) {
        this.jsxt168 = jsxt168;
    }

    @Override
    public String toString() {
        return "ForecastDay{" +
        "id=" + id +
        ", name=" + name +
        ", lon=" + lon +
        ", lat=" + lat +
        ", rangetype=" + rangetype +
        ", belongxian=" + belongxian +
        ", belongcity=" + belongcity +
        ", timemake=" + timemake +
        ", timeupload=" + timeupload +
        ", pre24=" + pre24 +
        ", pre48=" + pre48 +
        ", pre72=" + pre72 +
        ", pre96=" + pre96 +
        ", pre120=" + pre120 +
        ", pre144=" + pre144 +
        ", pre168=" + pre168 +
        ", pre192=" + pre192 +
        ", pre216=" + pre216 +
        ", jsrs=" + jsrs +
        ", gwrs=" + gwrs +
        ", jw=" + jw +
        ", pre300=" + pre300 +
        ", pre303=" + pre303 +
        ", pre306=" + pre306 +
        ", pre309=" + pre309 +
        ", pre312=" + pre312 +
        ", pre315=" + pre315 +
        ", pre318=" + pre318 +
        ", pre321=" + pre321 +
        ", pre324=" + pre324 +
        ", pre327=" + pre327 +
        ", pre330=" + pre330 +
        ", pre333=" + pre333 +
        ", pre336=" + pre336 +
        ", pre339=" + pre339 +
        ", pre342=" + pre342 +
        ", pre345=" + pre345 +
        ", pre348=" + pre348 +
        ", pre351=" + pre351 +
        ", pre354=" + pre354 +
        ", pre357=" + pre357 +
        ", pre360=" + pre360 +
        ", pre363=" + pre363 +
        ", pre366=" + pre366 +
        ", pre369=" + pre369 +
        ", pre372=" + pre372 +
        ", pre375=" + pre375 +
        ", pre378=" + pre378 +
        ", pre381=" + pre381 +
        ", pre384=" + pre384 +
        ", pre387=" + pre387 +
        ", pre390=" + pre390 +
        ", pre393=" + pre393 +
        ", pre396=" + pre396 +
        ", pre399=" + pre399 +
        ", pre3102=" + pre3102 +
        ", pre3105=" + pre3105 +
        ", pre3108=" + pre3108 +
        ", pre3111=" + pre3111 +
        ", pre3114=" + pre3114 +
        ", pre3117=" + pre3117 +
        ", pre3120=" + pre3120 +
        ", pre3123=" + pre3123 +
        ", pre3126=" + pre3126 +
        ", pre3129=" + pre3129 +
        ", pre3132=" + pre3132 +
        ", pre3135=" + pre3135 +
        ", pre3138=" + pre3138 +
        ", pre3141=" + pre3141 +
        ", pre3144=" + pre3144 +
        ", pre3147=" + pre3147 +
        ", pre3150=" + pre3150 +
        ", pre3153=" + pre3153 +
        ", pre3156=" + pre3156 +
        ", pre3159=" + pre3159 +
        ", pre3162=" + pre3162 +
        ", pre3165=" + pre3165 +
        ", pre3168=" + pre3168 +
        ", pre3171=" + pre3171 +
        ", pre3174=" + pre3174 +
        ", pre3177=" + pre3177 +
        ", pre3180=" + pre3180 +
        ", pre3183=" + pre3183 +
        ", pre3186=" + pre3186 +
        ", pre3189=" + pre3189 +
        ", pre3192=" + pre3192 +
        ", pre3195=" + pre3195 +
        ", pre3198=" + pre3198 +
        ", pre3201=" + pre3201 +
        ", pre3204=" + pre3204 +
        ", pre3207=" + pre3207 +
        ", pre3210=" + pre3210 +
        ", pre3213=" + pre3213 +
        ", pre600=" + pre600 +
        ", pre606=" + pre606 +
        ", pre612=" + pre612 +
        ", pre618=" + pre618 +
        ", pre624=" + pre624 +
        ", pre630=" + pre630 +
        ", pre636=" + pre636 +
        ", pre642=" + pre642 +
        ", pre648=" + pre648 +
        ", pre654=" + pre654 +
        ", pre660=" + pre660 +
        ", pre666=" + pre666 +
        ", pre672=" + pre672 +
        ", pre678=" + pre678 +
        ", pre684=" + pre684 +
        ", pre690=" + pre690 +
        ", pre696=" + pre696 +
        ", pre6102=" + pre6102 +
        ", pre6108=" + pre6108 +
        ", pre6114=" + pre6114 +
        ", pre6120=" + pre6120 +
        ", pre6126=" + pre6126 +
        ", pre6132=" + pre6132 +
        ", pre6138=" + pre6138 +
        ", pre6144=" + pre6144 +
        ", pre6150=" + pre6150 +
        ", pre6156=" + pre6156 +
        ", pre6162=" + pre6162 +
        ", pre6168=" + pre6168 +
        ", pre6174=" + pre6174 +
        ", pre6180=" + pre6180 +
        ", pre6186=" + pre6186 +
        ", pre6192=" + pre6192 +
        ", pre6198=" + pre6198 +
        ", pre6204=" + pre6204 +
        ", pre6210=" + pre6210 +
        ", pre1200=" + pre1200 +
        ", pre1212=" + pre1212 +
        ", pre1224=" + pre1224 +
        ", pre1236=" + pre1236 +
        ", pre1248=" + pre1248 +
        ", pre1260=" + pre1260 +
        ", pre1272=" + pre1272 +
        ", pre1284=" + pre1284 +
        ", pre1296=" + pre1296 +
        ", pre12108=" + pre12108 +
        ", pre12120=" + pre12120 +
        ", pre12132=" + pre12132 +
        ", pre12144=" + pre12144 +
        ", pre12156=" + pre12156 +
        ", pre12168=" + pre12168 +
        ", pre12180=" + pre12180 +
        ", pre12192=" + pre12192 +
        ", pre12204=" + pre12204 +
        ", temmax24=" + temmax24 +
        ", temmax48=" + temmax48 +
        ", temmax72=" + temmax72 +
        ", temmax96=" + temmax96 +
        ", temmax120=" + temmax120 +
        ", temmax144=" + temmax144 +
        ", temmax168=" + temmax168 +
        ", temmin24=" + temmin24 +
        ", temmin48=" + temmin48 +
        ", temmin72=" + temmin72 +
        ", temmin96=" + temmin96 +
        ", temmin120=" + temmin120 +
        ", temmin144=" + temmin144 +
        ", temmin168=" + temmin168 +
        ", rhumax24=" + rhumax24 +
        ", rhumax48=" + rhumax48 +
        ", rhumax72=" + rhumax72 +
        ", rhumax96=" + rhumax96 +
        ", rhumax120=" + rhumax120 +
        ", rhumax144=" + rhumax144 +
        ", rhumax168=" + rhumax168 +
        ", rhumin24=" + rhumin24 +
        ", rhumin48=" + rhumin48 +
        ", rhumin72=" + rhumin72 +
        ", rhumin96=" + rhumin96 +
        ", rhumin120=" + rhumin120 +
        ", rhumin144=" + rhumin144 +
        ", rhumin168=" + rhumin168 +
        ", ssh24=" + ssh24 +
        ", ssh48=" + ssh48 +
        ", ssh72=" + ssh72 +
        ", ssh96=" + ssh96 +
        ", ssh120=" + ssh120 +
        ", ssh144=" + ssh144 +
        ", ssh168=" + ssh168 +
        ", ssh192=" + ssh192 +
        ", ssh216=" + ssh216 +
        ", jsxt24=" + jsxt24 +
        ", ndzs24=" + ndzs24 +
        ", hxzs24=" + hxzs24 +
        ", tq00=" + tq00 +
        ", yl00=" + yl00 +
        ", tq01=" + tq01 +
        ", yl01=" + yl01 +
        ", onetq=" + onetq +
        ", oneyl=" + oneyl +
        ", onewin=" + onewin +
        ", twotq=" + twotq +
        ", twoyl=" + twoyl +
        ", twotem=" + twotem +
        ", twospe=" + twospe +
        ", twowin=" + twowin +
        ", threetq=" + threetq +
        ", threeyl=" + threeyl +
        ", threetem=" + threetem +
        ", threespe=" + threespe +
        ", threewin=" + threewin +
        ", fourtq=" + fourtq +
        ", fouryl=" + fouryl +
        ", fourtem=" + fourtem +
        ", fourspe=" + fourspe +
        ", fourwin=" + fourwin +
        ", fivetq=" + fivetq +
        ", fiveyl=" + fiveyl +
        ", fivetem=" + fivetem +
        ", fivespe=" + fivespe +
        ", fivewin=" + fivewin +
        ", sixtq=" + sixtq +
        ", sixyl=" + sixyl +
        ", sixtem=" + sixtem +
        ", sixspe=" + sixspe +
        ", sixwin=" + sixwin +
        ", seventq=" + seventq +
        ", sevenyl=" + sevenyl +
        ", seventem=" + seventem +
        ", sevenspe=" + sevenspe +
        ", sevenwin=" + sevenwin +
        ", zhfeng24=" + zhfeng24 +
        ", zhfeng48=" + zhfeng48 +
        ", zhfeng72=" + zhfeng72 +
        ", zhdian24=" + zhdian24 +
        ", zhdian48=" + zhdian48 +
        ", zhdian72=" + zhdian72 +
        ", zhwu24=" + zhwu24 +
        ", zhwu48=" + zhwu48 +
        ", zhwu72=" + zhwu72 +
        ", zhbing24=" + zhbing24 +
        ", zhbing48=" + zhbing48 +
        ", zhbing72=" + zhbing72 +
        ", zhqjs24=" + zhqjs24 +
        ", zhqjs48=" + zhqjs48 +
        ", zhqjs72=" + zhqjs72 +
        ", zhxue24=" + zhxue24 +
        ", zhxue48=" + zhxue48 +
        ", zhxue72=" + zhxue72 +
        ", zhqjw24=" + zhqjw24 +
        ", zhqjw48=" + zhqjw48 +
        ", zhqjw72=" + zhqjw72 +
        ", zhnd24=" + zhnd24 +
        ", zhnd48=" + zhnd48 +
        ", zhnd72=" + zhnd72 +
        ", zhshuang24=" + zhshuang24 +
        ", zhshuang48=" + zhshuang48 +
        ", zhshuang72=" + zhshuang72 +
        ", ndzs168=" + ndzs168 +
        ", ndzs96=" + ndzs96 +
        ", jsxt48=" + jsxt48 +
        ", jsxt120=" + jsxt120 +
        ", onetem=" + onetem +
        ", hxzs144=" + hxzs144 +
        ", jsxt72=" + jsxt72 +
        ", jsxt144=" + jsxt144 +
        ", onespe=" + onespe +
        ", hxzs72=" + hxzs72 +
        ", ndzs48=" + ndzs48 +
        ", hxzs96=" + hxzs96 +
        ", ndzs120=" + ndzs120 +
        ", hxzs168=" + hxzs168 +
        ", jsxt96=" + jsxt96 +
        ", hxzs48=" + hxzs48 +
        ", ndzs72=" + ndzs72 +
        ", hxzs120=" + hxzs120 +
        ", ndzs144=" + ndzs144 +
        ", jsxt168=" + jsxt168 +
        "}";
    }
}

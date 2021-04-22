package net.ssd.apiserver.apigather.zds.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * @author WeiBoWen
 * @since 2021-03-08
 */
@TableName("tabAWSTimeData")
@ApiModel(value="Tabawstimedata对象", description="")
public class TabawstimedataDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableId("StationNum")
    private String stationnum;

    @TableField("ObservTimes")
    private String observtimes;

    @TableField("Locat")
    private String locat;

    @TableField("Latitude")
    private String latitude;

    @TableField("Longitude")
    private String longitude;

    @TableField("FieldElevation")
    private String fieldelevation;

    @TableField("BaroElevation")
    private String baroelevation;

    @TableField("QCFlag")
    private String qcflag;

    @TableField("ModifyFlag")
    private String modifyflag;

    @TableField("InsertTime")
    private String inserttime;

    @TableField("StationPress")
    private String stationpress;

    @TableField("SeaLevelPress")
    private String sealevelpress;

    @TableField("PresseChange3Hour")
    private String pressechange3hour;

    @TableField("PresseChange24Hour")
    private String pressechange24hour;

    @TableField("MaxPSta")
    private String maxpsta;

    @TableField("TimeMaxPSta")
    private String timemaxpsta;

    @TableField("MinPSta")
    private String minpsta;

    @TableField("TimeMinPSta")
    private String timeminpsta;

    @TableField("DryBulTemp")
    private String drybultemp;

    @TableField("MaxTemp")
    private String maxtemp;

    @TableField("TimeMaxTemp")
    private String timemaxtemp;

    @TableField("MinTemp")
    private String mintemp;

    @TableField("TimeMinTemp")
    private String timemintemp;

    @TableField("TempChange24Hour")
    private String tempchange24hour;

    @TableField("MaxTemp24Hour")
    private String maxtemp24hour;

    @TableField("MinTemp24Hour")
    private String mintemp24hour;

    @TableField("DewTemp")
    private String dewtemp;

    @TableField("RelHumidity")
    private String relhumidity;

    @TableField("MinRelHumidity")
    private String minrelhumidity;

    @TableField("TimeMinRelH")
    private String timeminrelh;

    @TableField("VapourPress")
    private String vapourpress;

    @TableField("Precipitation")
    private String precipitation;

    @TableField("Precipitation3Hour")
    private String precipitation3hour;

    @TableField("Precipitation6Hour")
    private String precipitation6hour;

    @TableField("Precipitation12Hour")
    private String precipitation12hour;

    @TableField("Precipitation24Hour")
    private String precipitation24hour;

    @TableField("DensifyObsvTimePeriod")
    private String densifyobsvtimeperiod;

    @TableField("DensifyObsvPrec")
    private String densifyobsvprec;

    @TableField("EvagaugeAmount")
    private String evagaugeamount;

    @TableField("WindDirect")
    private String winddirect;

    @TableField("WindVelocity")
    private String windvelocity;

    @TableField("WindDirect10")
    private String winddirect10;

    @TableField("WindVelocity10")
    private String windvelocity10;

    @TableField("MaxWindD")
    private String maxwindd;

    @TableField("MaxWindV")
    private String maxwindv;

    @TableField("TimeMaxWind")
    private String timemaxwind;

    @TableField("InstantWindD")
    private String instantwindd;

    @TableField("InstantWindV")
    private String instantwindv;

    @TableField("ExMaxWindD")
    private String exmaxwindd;

    @TableField("ExMaxWindV")
    private String exmaxwindv;

    @TableField("TimeExMaxWind")
    private String timeexmaxwind;

    @TableField("ExMaxWindD6Hour")
    private String exmaxwindd6hour;

    @TableField("ExMaxWindV6Hour")
    private String exmaxwindv6hour;

    @TableField("ExMaxWindD12Hour")
    private String exmaxwindd12hour;

    @TableField("ExMaxWindV12Hour")
    private String exmaxwindv12hour;

    @TableField("SurfaceTemp")
    private String surfacetemp;

    @TableField("SurfaceMaxTemp")
    private String surfacemaxtemp;

    @TableField("TimeSurMaxTemp")
    private String timesurmaxtemp;

    @TableField("SurfaceMinTemp")
    private String surfacemintemp;

    @TableField("TimeSurMinTemp")
    private String timesurmintemp;

    @TableField("SurfaceMinTemp12Hour")
    private String surfacemintemp12hour;

    @TableField("Temp5cm")
    private String temp5cm;

    @TableField("Temp10cm")
    private String temp10cm;

    @TableField("Temp15cm")
    private String temp15cm;

    @TableField("Temp20cm")
    private String temp20cm;

    @TableField("Temp40cm")
    private String temp40cm;

    @TableField("Temp80cm")
    private String temp80cm;

    @TableField("Temp160cm")
    private String temp160cm;

    @TableField("Temp320cm")
    private String temp320cm;

    @TableField("GlassSurfaceTemp")
    private String glasssurfacetemp;

    @TableField("MaxGlassSurfTemp")
    private String maxglasssurftemp;

    @TableField("TimeMaxGlassSurfTemp")
    private String timemaxglasssurftemp;

    @TableField("MinGlassSurfTemp")
    private String minglasssurftemp;

    @TableField("TimeMinGlassSurfTemp")
    private String timeminglasssurftemp;

    @TableField("AwsVisibility")
    private String awsvisibility;

    @TableField("AwsVisibility10")
    private String awsvisibility10;

    @TableField("MinAwsVisibility")
    private String minawsvisibility;

    @TableField("TimeMinAwsVisibility")
    private String timeminawsvisibility;

    @TableField("Visibility")
    private String visibility;

    @TableField("CloudAmount")
    private String cloudamount;

    @TableField("LowCloudAmount")
    private String lowcloudamount;

    @TableField("ReportCloudAmount")
    private String reportcloudamount;

    @TableField("CloudHigh")
    private String cloudhigh;

    @TableField("CloudShape")
    private String cloudshape;

    @TableField("CloudShapeCode")
    private String cloudshapecode;

    @TableField("CurrentWeatherCode")
    private String currentweathercode;

    @TableField("PastWeatherPeriod")
    private String pastweatherperiod;

    @TableField("PastWeatherCode1")
    private String pastweathercode1;

    @TableField("PastWeatherCode2")
    private String pastweathercode2;

    @TableField("SurfaceState")
    private String surfacestate;

    @TableField("SnowDepth")
    private String snowdepth;

    @TableField("SnowPress")
    private String snowpress;

    @TableField("MaxFrozenSoil1TH")
    private String maxfrozensoil1th;

    @TableField("MinFrozenSoil1TH")
    private String minfrozensoil1th;

    @TableField("MaxFrozenSoil2TH")
    private String maxfrozensoil2th;

    @TableField("MinFrozenSoil2TH")
    private String minfrozensoil2th;

    @TableField("TornadoDistCode")
    private String tornadodistcode;

    @TableField("TornadoAligCode")
    private String tornadoaligcode;

    @TableField("IcingLineR")
    private String icingliner;

    @TableField("MaxHailR")
    private String maxhailr;

    @TableField("PrecipitationAmount")
    private String precipitationamount;

    @TableField("WeatherPhenomenon")
    private String weatherphenomenon;

    @TableField("StationQC")
    private String stationqc;

    @TableField("ProvinceQC")
    private String provinceqc;

    @TableField("CountryQC")
    private String countryqc;

    @TableField("FellRain")
    private String fellrain;

    @TableField("ObservDate")
    private LocalDateTime observdate;


    public String getStationnum() {
        return stationnum;
    }

    public void setStationnum(String stationnum) {
        this.stationnum = stationnum;
    }

    public String getObservtimes() {
        return observtimes;
    }

    public void setObservtimes(String observtimes) {
        this.observtimes = observtimes;
    }

    public String getLocat() {
        return locat;
    }

    public void setLocat(String locat) {
        this.locat = locat;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getFieldelevation() {
        return fieldelevation;
    }

    public void setFieldelevation(String fieldelevation) {
        this.fieldelevation = fieldelevation;
    }

    public String getBaroelevation() {
        return baroelevation;
    }

    public void setBaroelevation(String baroelevation) {
        this.baroelevation = baroelevation;
    }

    public String getQcflag() {
        return qcflag;
    }

    public void setQcflag(String qcflag) {
        this.qcflag = qcflag;
    }

    public String getModifyflag() {
        return modifyflag;
    }

    public void setModifyflag(String modifyflag) {
        this.modifyflag = modifyflag;
    }

    public String getInserttime() {
        return inserttime;
    }

    public void setInserttime(String inserttime) {
        this.inserttime = inserttime;
    }

    public String getStationpress() {
        return stationpress;
    }

    public void setStationpress(String stationpress) {
        this.stationpress = stationpress;
    }

    public String getSealevelpress() {
        return sealevelpress;
    }

    public void setSealevelpress(String sealevelpress) {
        this.sealevelpress = sealevelpress;
    }

    public String getPressechange3hour() {
        return pressechange3hour;
    }

    public void setPressechange3hour(String pressechange3hour) {
        this.pressechange3hour = pressechange3hour;
    }

    public String getPressechange24hour() {
        return pressechange24hour;
    }

    public void setPressechange24hour(String pressechange24hour) {
        this.pressechange24hour = pressechange24hour;
    }

    public String getMaxpsta() {
        return maxpsta;
    }

    public void setMaxpsta(String maxpsta) {
        this.maxpsta = maxpsta;
    }

    public String getTimemaxpsta() {
        return timemaxpsta;
    }

    public void setTimemaxpsta(String timemaxpsta) {
        this.timemaxpsta = timemaxpsta;
    }

    public String getMinpsta() {
        return minpsta;
    }

    public void setMinpsta(String minpsta) {
        this.minpsta = minpsta;
    }

    public String getTimeminpsta() {
        return timeminpsta;
    }

    public void setTimeminpsta(String timeminpsta) {
        this.timeminpsta = timeminpsta;
    }

    public String getDrybultemp() {
        return drybultemp;
    }

    public void setDrybultemp(String drybultemp) {
        this.drybultemp = drybultemp;
    }

    public String getMaxtemp() {
        return maxtemp;
    }

    public void setMaxtemp(String maxtemp) {
        this.maxtemp = maxtemp;
    }

    public String getTimemaxtemp() {
        return timemaxtemp;
    }

    public void setTimemaxtemp(String timemaxtemp) {
        this.timemaxtemp = timemaxtemp;
    }

    public String getMintemp() {
        return mintemp;
    }

    public void setMintemp(String mintemp) {
        this.mintemp = mintemp;
    }

    public String getTimemintemp() {
        return timemintemp;
    }

    public void setTimemintemp(String timemintemp) {
        this.timemintemp = timemintemp;
    }

    public String getTempchange24hour() {
        return tempchange24hour;
    }

    public void setTempchange24hour(String tempchange24hour) {
        this.tempchange24hour = tempchange24hour;
    }

    public String getMaxtemp24hour() {
        return maxtemp24hour;
    }

    public void setMaxtemp24hour(String maxtemp24hour) {
        this.maxtemp24hour = maxtemp24hour;
    }

    public String getMintemp24hour() {
        return mintemp24hour;
    }

    public void setMintemp24hour(String mintemp24hour) {
        this.mintemp24hour = mintemp24hour;
    }

    public String getDewtemp() {
        return dewtemp;
    }

    public void setDewtemp(String dewtemp) {
        this.dewtemp = dewtemp;
    }

    public String getRelhumidity() {
        return relhumidity;
    }

    public void setRelhumidity(String relhumidity) {
        this.relhumidity = relhumidity;
    }

    public String getMinrelhumidity() {
        return minrelhumidity;
    }

    public void setMinrelhumidity(String minrelhumidity) {
        this.minrelhumidity = minrelhumidity;
    }

    public String getTimeminrelh() {
        return timeminrelh;
    }

    public void setTimeminrelh(String timeminrelh) {
        this.timeminrelh = timeminrelh;
    }

    public String getVapourpress() {
        return vapourpress;
    }

    public void setVapourpress(String vapourpress) {
        this.vapourpress = vapourpress;
    }

    public String getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(String precipitation) {
        this.precipitation = precipitation;
    }

    public String getPrecipitation3hour() {
        return precipitation3hour;
    }

    public void setPrecipitation3hour(String precipitation3hour) {
        this.precipitation3hour = precipitation3hour;
    }

    public String getPrecipitation6hour() {
        return precipitation6hour;
    }

    public void setPrecipitation6hour(String precipitation6hour) {
        this.precipitation6hour = precipitation6hour;
    }

    public String getPrecipitation12hour() {
        return precipitation12hour;
    }

    public void setPrecipitation12hour(String precipitation12hour) {
        this.precipitation12hour = precipitation12hour;
    }

    public String getPrecipitation24hour() {
        return precipitation24hour;
    }

    public void setPrecipitation24hour(String precipitation24hour) {
        this.precipitation24hour = precipitation24hour;
    }

    public String getDensifyobsvtimeperiod() {
        return densifyobsvtimeperiod;
    }

    public void setDensifyobsvtimeperiod(String densifyobsvtimeperiod) {
        this.densifyobsvtimeperiod = densifyobsvtimeperiod;
    }

    public String getDensifyobsvprec() {
        return densifyobsvprec;
    }

    public void setDensifyobsvprec(String densifyobsvprec) {
        this.densifyobsvprec = densifyobsvprec;
    }

    public String getEvagaugeamount() {
        return evagaugeamount;
    }

    public void setEvagaugeamount(String evagaugeamount) {
        this.evagaugeamount = evagaugeamount;
    }

    public String getWinddirect() {
        return winddirect;
    }

    public void setWinddirect(String winddirect) {
        this.winddirect = winddirect;
    }

    public String getWindvelocity() {
        return windvelocity;
    }

    public void setWindvelocity(String windvelocity) {
        this.windvelocity = windvelocity;
    }

    public String getWinddirect10() {
        return winddirect10;
    }

    public void setWinddirect10(String winddirect10) {
        this.winddirect10 = winddirect10;
    }

    public String getWindvelocity10() {
        return windvelocity10;
    }

    public void setWindvelocity10(String windvelocity10) {
        this.windvelocity10 = windvelocity10;
    }

    public String getMaxwindd() {
        return maxwindd;
    }

    public void setMaxwindd(String maxwindd) {
        this.maxwindd = maxwindd;
    }

    public String getMaxwindv() {
        return maxwindv;
    }

    public void setMaxwindv(String maxwindv) {
        this.maxwindv = maxwindv;
    }

    public String getTimemaxwind() {
        return timemaxwind;
    }

    public void setTimemaxwind(String timemaxwind) {
        this.timemaxwind = timemaxwind;
    }

    public String getInstantwindd() {
        return instantwindd;
    }

    public void setInstantwindd(String instantwindd) {
        this.instantwindd = instantwindd;
    }

    public String getInstantwindv() {
        return instantwindv;
    }

    public void setInstantwindv(String instantwindv) {
        this.instantwindv = instantwindv;
    }

    public String getExmaxwindd() {
        return exmaxwindd;
    }

    public void setExmaxwindd(String exmaxwindd) {
        this.exmaxwindd = exmaxwindd;
    }

    public String getExmaxwindv() {
        return exmaxwindv;
    }

    public void setExmaxwindv(String exmaxwindv) {
        this.exmaxwindv = exmaxwindv;
    }

    public String getTimeexmaxwind() {
        return timeexmaxwind;
    }

    public void setTimeexmaxwind(String timeexmaxwind) {
        this.timeexmaxwind = timeexmaxwind;
    }

    public String getExmaxwindd6hour() {
        return exmaxwindd6hour;
    }

    public void setExmaxwindd6hour(String exmaxwindd6hour) {
        this.exmaxwindd6hour = exmaxwindd6hour;
    }

    public String getExmaxwindv6hour() {
        return exmaxwindv6hour;
    }

    public void setExmaxwindv6hour(String exmaxwindv6hour) {
        this.exmaxwindv6hour = exmaxwindv6hour;
    }

    public String getExmaxwindd12hour() {
        return exmaxwindd12hour;
    }

    public void setExmaxwindd12hour(String exmaxwindd12hour) {
        this.exmaxwindd12hour = exmaxwindd12hour;
    }

    public String getExmaxwindv12hour() {
        return exmaxwindv12hour;
    }

    public void setExmaxwindv12hour(String exmaxwindv12hour) {
        this.exmaxwindv12hour = exmaxwindv12hour;
    }

    public String getSurfacetemp() {
        return surfacetemp;
    }

    public void setSurfacetemp(String surfacetemp) {
        this.surfacetemp = surfacetemp;
    }

    public String getSurfacemaxtemp() {
        return surfacemaxtemp;
    }

    public void setSurfacemaxtemp(String surfacemaxtemp) {
        this.surfacemaxtemp = surfacemaxtemp;
    }

    public String getTimesurmaxtemp() {
        return timesurmaxtemp;
    }

    public void setTimesurmaxtemp(String timesurmaxtemp) {
        this.timesurmaxtemp = timesurmaxtemp;
    }

    public String getSurfacemintemp() {
        return surfacemintemp;
    }

    public void setSurfacemintemp(String surfacemintemp) {
        this.surfacemintemp = surfacemintemp;
    }

    public String getTimesurmintemp() {
        return timesurmintemp;
    }

    public void setTimesurmintemp(String timesurmintemp) {
        this.timesurmintemp = timesurmintemp;
    }

    public String getSurfacemintemp12hour() {
        return surfacemintemp12hour;
    }

    public void setSurfacemintemp12hour(String surfacemintemp12hour) {
        this.surfacemintemp12hour = surfacemintemp12hour;
    }

    public String getTemp5cm() {
        return temp5cm;
    }

    public void setTemp5cm(String temp5cm) {
        this.temp5cm = temp5cm;
    }

    public String getTemp10cm() {
        return temp10cm;
    }

    public void setTemp10cm(String temp10cm) {
        this.temp10cm = temp10cm;
    }

    public String getTemp15cm() {
        return temp15cm;
    }

    public void setTemp15cm(String temp15cm) {
        this.temp15cm = temp15cm;
    }

    public String getTemp20cm() {
        return temp20cm;
    }

    public void setTemp20cm(String temp20cm) {
        this.temp20cm = temp20cm;
    }

    public String getTemp40cm() {
        return temp40cm;
    }

    public void setTemp40cm(String temp40cm) {
        this.temp40cm = temp40cm;
    }

    public String getTemp80cm() {
        return temp80cm;
    }

    public void setTemp80cm(String temp80cm) {
        this.temp80cm = temp80cm;
    }

    public String getTemp160cm() {
        return temp160cm;
    }

    public void setTemp160cm(String temp160cm) {
        this.temp160cm = temp160cm;
    }

    public String getTemp320cm() {
        return temp320cm;
    }

    public void setTemp320cm(String temp320cm) {
        this.temp320cm = temp320cm;
    }

    public String getGlasssurfacetemp() {
        return glasssurfacetemp;
    }

    public void setGlasssurfacetemp(String glasssurfacetemp) {
        this.glasssurfacetemp = glasssurfacetemp;
    }

    public String getMaxglasssurftemp() {
        return maxglasssurftemp;
    }

    public void setMaxglasssurftemp(String maxglasssurftemp) {
        this.maxglasssurftemp = maxglasssurftemp;
    }

    public String getTimemaxglasssurftemp() {
        return timemaxglasssurftemp;
    }

    public void setTimemaxglasssurftemp(String timemaxglasssurftemp) {
        this.timemaxglasssurftemp = timemaxglasssurftemp;
    }

    public String getMinglasssurftemp() {
        return minglasssurftemp;
    }

    public void setMinglasssurftemp(String minglasssurftemp) {
        this.minglasssurftemp = minglasssurftemp;
    }

    public String getTimeminglasssurftemp() {
        return timeminglasssurftemp;
    }

    public void setTimeminglasssurftemp(String timeminglasssurftemp) {
        this.timeminglasssurftemp = timeminglasssurftemp;
    }

    public String getAwsvisibility() {
        return awsvisibility;
    }

    public void setAwsvisibility(String awsvisibility) {
        this.awsvisibility = awsvisibility;
    }

    public String getAwsvisibility10() {
        return awsvisibility10;
    }

    public void setAwsvisibility10(String awsvisibility10) {
        this.awsvisibility10 = awsvisibility10;
    }

    public String getMinawsvisibility() {
        return minawsvisibility;
    }

    public void setMinawsvisibility(String minawsvisibility) {
        this.minawsvisibility = minawsvisibility;
    }

    public String getTimeminawsvisibility() {
        return timeminawsvisibility;
    }

    public void setTimeminawsvisibility(String timeminawsvisibility) {
        this.timeminawsvisibility = timeminawsvisibility;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getCloudamount() {
        return cloudamount;
    }

    public void setCloudamount(String cloudamount) {
        this.cloudamount = cloudamount;
    }

    public String getLowcloudamount() {
        return lowcloudamount;
    }

    public void setLowcloudamount(String lowcloudamount) {
        this.lowcloudamount = lowcloudamount;
    }

    public String getReportcloudamount() {
        return reportcloudamount;
    }

    public void setReportcloudamount(String reportcloudamount) {
        this.reportcloudamount = reportcloudamount;
    }

    public String getCloudhigh() {
        return cloudhigh;
    }

    public void setCloudhigh(String cloudhigh) {
        this.cloudhigh = cloudhigh;
    }

    public String getCloudshape() {
        return cloudshape;
    }

    public void setCloudshape(String cloudshape) {
        this.cloudshape = cloudshape;
    }

    public String getCloudshapecode() {
        return cloudshapecode;
    }

    public void setCloudshapecode(String cloudshapecode) {
        this.cloudshapecode = cloudshapecode;
    }

    public String getCurrentweathercode() {
        return currentweathercode;
    }

    public void setCurrentweathercode(String currentweathercode) {
        this.currentweathercode = currentweathercode;
    }

    public String getPastweatherperiod() {
        return pastweatherperiod;
    }

    public void setPastweatherperiod(String pastweatherperiod) {
        this.pastweatherperiod = pastweatherperiod;
    }

    public String getPastweathercode1() {
        return pastweathercode1;
    }

    public void setPastweathercode1(String pastweathercode1) {
        this.pastweathercode1 = pastweathercode1;
    }

    public String getPastweathercode2() {
        return pastweathercode2;
    }

    public void setPastweathercode2(String pastweathercode2) {
        this.pastweathercode2 = pastweathercode2;
    }

    public String getSurfacestate() {
        return surfacestate;
    }

    public void setSurfacestate(String surfacestate) {
        this.surfacestate = surfacestate;
    }

    public String getSnowdepth() {
        return snowdepth;
    }

    public void setSnowdepth(String snowdepth) {
        this.snowdepth = snowdepth;
    }

    public String getSnowpress() {
        return snowpress;
    }

    public void setSnowpress(String snowpress) {
        this.snowpress = snowpress;
    }

    public String getMaxfrozensoil1th() {
        return maxfrozensoil1th;
    }

    public void setMaxfrozensoil1th(String maxfrozensoil1th) {
        this.maxfrozensoil1th = maxfrozensoil1th;
    }

    public String getMinfrozensoil1th() {
        return minfrozensoil1th;
    }

    public void setMinfrozensoil1th(String minfrozensoil1th) {
        this.minfrozensoil1th = minfrozensoil1th;
    }

    public String getMaxfrozensoil2th() {
        return maxfrozensoil2th;
    }

    public void setMaxfrozensoil2th(String maxfrozensoil2th) {
        this.maxfrozensoil2th = maxfrozensoil2th;
    }

    public String getMinfrozensoil2th() {
        return minfrozensoil2th;
    }

    public void setMinfrozensoil2th(String minfrozensoil2th) {
        this.minfrozensoil2th = minfrozensoil2th;
    }

    public String getTornadodistcode() {
        return tornadodistcode;
    }

    public void setTornadodistcode(String tornadodistcode) {
        this.tornadodistcode = tornadodistcode;
    }

    public String getTornadoaligcode() {
        return tornadoaligcode;
    }

    public void setTornadoaligcode(String tornadoaligcode) {
        this.tornadoaligcode = tornadoaligcode;
    }

    public String getIcingliner() {
        return icingliner;
    }

    public void setIcingliner(String icingliner) {
        this.icingliner = icingliner;
    }

    public String getMaxhailr() {
        return maxhailr;
    }

    public void setMaxhailr(String maxhailr) {
        this.maxhailr = maxhailr;
    }

    public String getPrecipitationamount() {
        return precipitationamount;
    }

    public void setPrecipitationamount(String precipitationamount) {
        this.precipitationamount = precipitationamount;
    }

    public String getWeatherphenomenon() {
        return weatherphenomenon;
    }

    public void setWeatherphenomenon(String weatherphenomenon) {
        this.weatherphenomenon = weatherphenomenon;
    }

    public String getStationqc() {
        return stationqc;
    }

    public void setStationqc(String stationqc) {
        this.stationqc = stationqc;
    }

    public String getProvinceqc() {
        return provinceqc;
    }

    public void setProvinceqc(String provinceqc) {
        this.provinceqc = provinceqc;
    }

    public String getCountryqc() {
        return countryqc;
    }

    public void setCountryqc(String countryqc) {
        this.countryqc = countryqc;
    }

    public String getFellrain() {
        return fellrain;
    }

    public void setFellrain(String fellrain) {
        this.fellrain = fellrain;
    }

    public LocalDateTime getObservdate() {
        return observdate;
    }

    public void setObservdate(LocalDateTime observdate) {
        this.observdate = observdate;
    }

    @Override
    public String toString() {
        return "Tabawstimedata{" +
        "stationnum=" + stationnum +
        ", observtimes=" + observtimes +
        ", locat=" + locat +
        ", latitude=" + latitude +
        ", longitude=" + longitude +
        ", fieldelevation=" + fieldelevation +
        ", baroelevation=" + baroelevation +
        ", qcflag=" + qcflag +
        ", modifyflag=" + modifyflag +
        ", inserttime=" + inserttime +
        ", stationpress=" + stationpress +
        ", sealevelpress=" + sealevelpress +
        ", pressechange3hour=" + pressechange3hour +
        ", pressechange24hour=" + pressechange24hour +
        ", maxpsta=" + maxpsta +
        ", timemaxpsta=" + timemaxpsta +
        ", minpsta=" + minpsta +
        ", timeminpsta=" + timeminpsta +
        ", drybultemp=" + drybultemp +
        ", maxtemp=" + maxtemp +
        ", timemaxtemp=" + timemaxtemp +
        ", mintemp=" + mintemp +
        ", timemintemp=" + timemintemp +
        ", tempchange24hour=" + tempchange24hour +
        ", maxtemp24hour=" + maxtemp24hour +
        ", mintemp24hour=" + mintemp24hour +
        ", dewtemp=" + dewtemp +
        ", relhumidity=" + relhumidity +
        ", minrelhumidity=" + minrelhumidity +
        ", timeminrelh=" + timeminrelh +
        ", vapourpress=" + vapourpress +
        ", precipitation=" + precipitation +
        ", precipitation3hour=" + precipitation3hour +
        ", precipitation6hour=" + precipitation6hour +
        ", precipitation12hour=" + precipitation12hour +
        ", precipitation24hour=" + precipitation24hour +
        ", densifyobsvtimeperiod=" + densifyobsvtimeperiod +
        ", densifyobsvprec=" + densifyobsvprec +
        ", evagaugeamount=" + evagaugeamount +
        ", winddirect=" + winddirect +
        ", windvelocity=" + windvelocity +
        ", winddirect10=" + winddirect10 +
        ", windvelocity10=" + windvelocity10 +
        ", maxwindd=" + maxwindd +
        ", maxwindv=" + maxwindv +
        ", timemaxwind=" + timemaxwind +
        ", instantwindd=" + instantwindd +
        ", instantwindv=" + instantwindv +
        ", exmaxwindd=" + exmaxwindd +
        ", exmaxwindv=" + exmaxwindv +
        ", timeexmaxwind=" + timeexmaxwind +
        ", exmaxwindd6hour=" + exmaxwindd6hour +
        ", exmaxwindv6hour=" + exmaxwindv6hour +
        ", exmaxwindd12hour=" + exmaxwindd12hour +
        ", exmaxwindv12hour=" + exmaxwindv12hour +
        ", surfacetemp=" + surfacetemp +
        ", surfacemaxtemp=" + surfacemaxtemp +
        ", timesurmaxtemp=" + timesurmaxtemp +
        ", surfacemintemp=" + surfacemintemp +
        ", timesurmintemp=" + timesurmintemp +
        ", surfacemintemp12hour=" + surfacemintemp12hour +
        ", temp5cm=" + temp5cm +
        ", temp10cm=" + temp10cm +
        ", temp15cm=" + temp15cm +
        ", temp20cm=" + temp20cm +
        ", temp40cm=" + temp40cm +
        ", temp80cm=" + temp80cm +
        ", temp160cm=" + temp160cm +
        ", temp320cm=" + temp320cm +
        ", glasssurfacetemp=" + glasssurfacetemp +
        ", maxglasssurftemp=" + maxglasssurftemp +
        ", timemaxglasssurftemp=" + timemaxglasssurftemp +
        ", minglasssurftemp=" + minglasssurftemp +
        ", timeminglasssurftemp=" + timeminglasssurftemp +
        ", awsvisibility=" + awsvisibility +
        ", awsvisibility10=" + awsvisibility10 +
        ", minawsvisibility=" + minawsvisibility +
        ", timeminawsvisibility=" + timeminawsvisibility +
        ", visibility=" + visibility +
        ", cloudamount=" + cloudamount +
        ", lowcloudamount=" + lowcloudamount +
        ", reportcloudamount=" + reportcloudamount +
        ", cloudhigh=" + cloudhigh +
        ", cloudshape=" + cloudshape +
        ", cloudshapecode=" + cloudshapecode +
        ", currentweathercode=" + currentweathercode +
        ", pastweatherperiod=" + pastweatherperiod +
        ", pastweathercode1=" + pastweathercode1 +
        ", pastweathercode2=" + pastweathercode2 +
        ", surfacestate=" + surfacestate +
        ", snowdepth=" + snowdepth +
        ", snowpress=" + snowpress +
        ", maxfrozensoil1th=" + maxfrozensoil1th +
        ", minfrozensoil1th=" + minfrozensoil1th +
        ", maxfrozensoil2th=" + maxfrozensoil2th +
        ", minfrozensoil2th=" + minfrozensoil2th +
        ", tornadodistcode=" + tornadodistcode +
        ", tornadoaligcode=" + tornadoaligcode +
        ", icingliner=" + icingliner +
        ", maxhailr=" + maxhailr +
        ", precipitationamount=" + precipitationamount +
        ", weatherphenomenon=" + weatherphenomenon +
        ", stationqc=" + stationqc +
        ", provinceqc=" + provinceqc +
        ", countryqc=" + countryqc +
        ", fellrain=" + fellrain +
        ", observdate=" + observdate +
        "}";
    }
}

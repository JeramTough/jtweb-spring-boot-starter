package net.ssd.soa.model.entity;

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
 * @since 2021-09-08
 */
@TableName("tabAWSTimeData")
@ApiModel(value="Tabawstimedata对象", description="")
public class Tabawstimedata implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId("StationNum")
    private String stationNum;

    @TableField("ObservTimes")
    private String observTimes;

    @TableField("Locat")
    private String locat;

    @TableField("Latitude")
    private String latitude;

    @TableField("Longitude")
    private String longitude;

    @TableField("FieldElevation")
    private String fieldElevation;

    @TableField("BaroElevation")
    private String baroElevation;

    @TableField("QCFlag")
    private String qCFlag;

    @TableField("ModifyFlag")
    private String modifyFlag;

    @TableField("InsertTime")
    private String insertTime;

    @TableField("StationPress")
    private String stationPress;

    @TableField("SeaLevelPress")
    private String seaLevelPress;

    @TableField("PresseChange3Hour")
    private String presseChange3Hour;

    @TableField("PresseChange24Hour")
    private String presseChange24Hour;

    @TableField("MaxPSta")
    private String maxPSta;

    @TableField("TimeMaxPSta")
    private String timeMaxPSta;

    @TableField("MinPSta")
    private String minPSta;

    @TableField("TimeMinPSta")
    private String timeMinPSta;

    @TableField("DryBulTemp")
    private String dryBulTemp;

    @TableField("MaxTemp")
    private String maxTemp;

    @TableField("TimeMaxTemp")
    private String timeMaxTemp;

    @TableField("MinTemp")
    private String minTemp;

    @TableField("TimeMinTemp")
    private String timeMinTemp;

    @TableField("TempChange24Hour")
    private String tempChange24Hour;

    @TableField("MaxTemp24Hour")
    private String maxTemp24Hour;

    @TableField("MinTemp24Hour")
    private String minTemp24Hour;

    @TableField("DewTemp")
    private String dewTemp;

    @TableField("RelHumidity")
    private String relHumidity;

    @TableField("MinRelHumidity")
    private String minRelHumidity;

    @TableField("TimeMinRelH")
    private String timeMinRelH;

    @TableField("VapourPress")
    private String vapourPress;

    @TableField("Precipitation")
    private String precipitation;

    @TableField("Precipitation3Hour")
    private String precipitation3Hour;

    @TableField("Precipitation6Hour")
    private String precipitation6Hour;

    @TableField("Precipitation12Hour")
    private String precipitation12Hour;

    @TableField("Precipitation24Hour")
    private String precipitation24Hour;

    @TableField("DensifyObsvTimePeriod")
    private String densifyObsvTimePeriod;

    @TableField("DensifyObsvPrec")
    private String densifyObsvPrec;

    @TableField("EvagaugeAmount")
    private String evagaugeAmount;

    @TableField("WindDirect")
    private String windDirect;

    @TableField("WindVelocity")
    private String windVelocity;

    @TableField("WindDirect10")
    private String windDirect10;

    @TableField("WindVelocity10")
    private String windVelocity10;

    @TableField("MaxWindD")
    private String maxWindD;

    @TableField("MaxWindV")
    private String maxWindV;

    @TableField("TimeMaxWind")
    private String timeMaxWind;

    @TableField("InstantWindD")
    private String instantWindD;

    @TableField("InstantWindV")
    private String instantWindV;

    @TableField("ExMaxWindD")
    private String exMaxWindD;

    @TableField("ExMaxWindV")
    private String exMaxWindV;

    @TableField("TimeExMaxWind")
    private String timeExMaxWind;

    @TableField("ExMaxWindD6Hour")
    private String exMaxWindD6Hour;

    @TableField("ExMaxWindV6Hour")
    private String exMaxWindV6Hour;

    @TableField("ExMaxWindD12Hour")
    private String exMaxWindD12Hour;

    @TableField("ExMaxWindV12Hour")
    private String exMaxWindV12Hour;

    @TableField("SurfaceTemp")
    private String surfaceTemp;

    @TableField("SurfaceMaxTemp")
    private String surfaceMaxTemp;

    @TableField("TimeSurMaxTemp")
    private String timeSurMaxTemp;

    @TableField("SurfaceMinTemp")
    private String surfaceMinTemp;

    @TableField("TimeSurMinTemp")
    private String timeSurMinTemp;

    @TableField("SurfaceMinTemp12Hour")
    private String surfaceMinTemp12Hour;

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
    private String glassSurfaceTemp;

    @TableField("MaxGlassSurfTemp")
    private String maxGlassSurfTemp;

    @TableField("TimeMaxGlassSurfTemp")
    private String timeMaxGlassSurfTemp;

    @TableField("MinGlassSurfTemp")
    private String minGlassSurfTemp;

    @TableField("TimeMinGlassSurfTemp")
    private String timeMinGlassSurfTemp;

    @TableField("AwsVisibility")
    private String awsVisibility;

    @TableField("AwsVisibility10")
    private String awsVisibility10;

    @TableField("MinAwsVisibility")
    private String minAwsVisibility;

    @TableField("TimeMinAwsVisibility")
    private String timeMinAwsVisibility;

    @TableField("Visibility")
    private String visibility;

    @TableField("CloudAmount")
    private String cloudAmount;

    @TableField("LowCloudAmount")
    private String lowCloudAmount;

    @TableField("ReportCloudAmount")
    private String reportCloudAmount;

    @TableField("CloudHigh")
    private String cloudHigh;

    @TableField("CloudShape")
    private String cloudShape;

    @TableField("CloudShapeCode")
    private String cloudShapeCode;

    @TableField("CurrentWeatherCode")
    private String currentWeatherCode;

    @TableField("PastWeatherPeriod")
    private String pastWeatherPeriod;

    @TableField("PastWeatherCode1")
    private String pastWeatherCode1;

    @TableField("PastWeatherCode2")
    private String pastWeatherCode2;

    @TableField("SurfaceState")
    private String surfaceState;

    @TableField("SnowDepth")
    private String snowDepth;

    @TableField("SnowPress")
    private String snowPress;

    @TableField("MaxFrozenSoil1TH")
    private String maxFrozenSoil1TH;

    @TableField("MinFrozenSoil1TH")
    private String minFrozenSoil1TH;

    @TableField("MaxFrozenSoil2TH")
    private String maxFrozenSoil2TH;

    @TableField("MinFrozenSoil2TH")
    private String minFrozenSoil2TH;

    @TableField("TornadoDistCode")
    private String tornadoDistCode;

    @TableField("TornadoAligCode")
    private String tornadoAligCode;

    @TableField("IcingLineR")
    private String icingLineR;

    @TableField("MaxHailR")
    private String maxHailR;

    @TableField("PrecipitationAmount")
    private String precipitationAmount;

    @TableField("WeatherPhenomenon")
    private String weatherPhenomenon;

    @TableField("StationQC")
    private String stationQC;

    @TableField("ProvinceQC")
    private String provinceQC;

    @TableField("CountryQC")
    private String countryQC;

    @TableField("FellRain")
    private String fellRain;

    @TableField("ObservDate")
    private LocalDateTime observDate;

    @TableField("ID")
    private Integer iD;


    public String getStationNum() {
        return stationNum;
    }

    public void setStationNum(String stationNum) {
        this.stationNum = stationNum;
    }

    public String getObservTimes() {
        return observTimes;
    }

    public void setObservTimes(String observTimes) {
        this.observTimes = observTimes;
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

    public String getFieldElevation() {
        return fieldElevation;
    }

    public void setFieldElevation(String fieldElevation) {
        this.fieldElevation = fieldElevation;
    }

    public String getBaroElevation() {
        return baroElevation;
    }

    public void setBaroElevation(String baroElevation) {
        this.baroElevation = baroElevation;
    }

    public String getqCFlag() {
        return qCFlag;
    }

    public void setqCFlag(String qCFlag) {
        this.qCFlag = qCFlag;
    }

    public String getModifyFlag() {
        return modifyFlag;
    }

    public void setModifyFlag(String modifyFlag) {
        this.modifyFlag = modifyFlag;
    }

    public String getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(String insertTime) {
        this.insertTime = insertTime;
    }

    public String getStationPress() {
        return stationPress;
    }

    public void setStationPress(String stationPress) {
        this.stationPress = stationPress;
    }

    public String getSeaLevelPress() {
        return seaLevelPress;
    }

    public void setSeaLevelPress(String seaLevelPress) {
        this.seaLevelPress = seaLevelPress;
    }

    public String getPresseChange3Hour() {
        return presseChange3Hour;
    }

    public void setPresseChange3Hour(String presseChange3Hour) {
        this.presseChange3Hour = presseChange3Hour;
    }

    public String getPresseChange24Hour() {
        return presseChange24Hour;
    }

    public void setPresseChange24Hour(String presseChange24Hour) {
        this.presseChange24Hour = presseChange24Hour;
    }

    public String getMaxPSta() {
        return maxPSta;
    }

    public void setMaxPSta(String maxPSta) {
        this.maxPSta = maxPSta;
    }

    public String getTimeMaxPSta() {
        return timeMaxPSta;
    }

    public void setTimeMaxPSta(String timeMaxPSta) {
        this.timeMaxPSta = timeMaxPSta;
    }

    public String getMinPSta() {
        return minPSta;
    }

    public void setMinPSta(String minPSta) {
        this.minPSta = minPSta;
    }

    public String getTimeMinPSta() {
        return timeMinPSta;
    }

    public void setTimeMinPSta(String timeMinPSta) {
        this.timeMinPSta = timeMinPSta;
    }

    public String getDryBulTemp() {
        return dryBulTemp;
    }

    public void setDryBulTemp(String dryBulTemp) {
        this.dryBulTemp = dryBulTemp;
    }

    public String getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(String maxTemp) {
        this.maxTemp = maxTemp;
    }

    public String getTimeMaxTemp() {
        return timeMaxTemp;
    }

    public void setTimeMaxTemp(String timeMaxTemp) {
        this.timeMaxTemp = timeMaxTemp;
    }

    public String getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(String minTemp) {
        this.minTemp = minTemp;
    }

    public String getTimeMinTemp() {
        return timeMinTemp;
    }

    public void setTimeMinTemp(String timeMinTemp) {
        this.timeMinTemp = timeMinTemp;
    }

    public String getTempChange24Hour() {
        return tempChange24Hour;
    }

    public void setTempChange24Hour(String tempChange24Hour) {
        this.tempChange24Hour = tempChange24Hour;
    }

    public String getMaxTemp24Hour() {
        return maxTemp24Hour;
    }

    public void setMaxTemp24Hour(String maxTemp24Hour) {
        this.maxTemp24Hour = maxTemp24Hour;
    }

    public String getMinTemp24Hour() {
        return minTemp24Hour;
    }

    public void setMinTemp24Hour(String minTemp24Hour) {
        this.minTemp24Hour = minTemp24Hour;
    }

    public String getDewTemp() {
        return dewTemp;
    }

    public void setDewTemp(String dewTemp) {
        this.dewTemp = dewTemp;
    }

    public String getRelHumidity() {
        return relHumidity;
    }

    public void setRelHumidity(String relHumidity) {
        this.relHumidity = relHumidity;
    }

    public String getMinRelHumidity() {
        return minRelHumidity;
    }

    public void setMinRelHumidity(String minRelHumidity) {
        this.minRelHumidity = minRelHumidity;
    }

    public String getTimeMinRelH() {
        return timeMinRelH;
    }

    public void setTimeMinRelH(String timeMinRelH) {
        this.timeMinRelH = timeMinRelH;
    }

    public String getVapourPress() {
        return vapourPress;
    }

    public void setVapourPress(String vapourPress) {
        this.vapourPress = vapourPress;
    }

    public String getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(String precipitation) {
        this.precipitation = precipitation;
    }

    public String getPrecipitation3Hour() {
        return precipitation3Hour;
    }

    public void setPrecipitation3Hour(String precipitation3Hour) {
        this.precipitation3Hour = precipitation3Hour;
    }

    public String getPrecipitation6Hour() {
        return precipitation6Hour;
    }

    public void setPrecipitation6Hour(String precipitation6Hour) {
        this.precipitation6Hour = precipitation6Hour;
    }

    public String getPrecipitation12Hour() {
        return precipitation12Hour;
    }

    public void setPrecipitation12Hour(String precipitation12Hour) {
        this.precipitation12Hour = precipitation12Hour;
    }

    public String getPrecipitation24Hour() {
        return precipitation24Hour;
    }

    public void setPrecipitation24Hour(String precipitation24Hour) {
        this.precipitation24Hour = precipitation24Hour;
    }

    public String getDensifyObsvTimePeriod() {
        return densifyObsvTimePeriod;
    }

    public void setDensifyObsvTimePeriod(String densifyObsvTimePeriod) {
        this.densifyObsvTimePeriod = densifyObsvTimePeriod;
    }

    public String getDensifyObsvPrec() {
        return densifyObsvPrec;
    }

    public void setDensifyObsvPrec(String densifyObsvPrec) {
        this.densifyObsvPrec = densifyObsvPrec;
    }

    public String getEvagaugeAmount() {
        return evagaugeAmount;
    }

    public void setEvagaugeAmount(String evagaugeAmount) {
        this.evagaugeAmount = evagaugeAmount;
    }

    public String getWindDirect() {
        return windDirect;
    }

    public void setWindDirect(String windDirect) {
        this.windDirect = windDirect;
    }

    public String getWindVelocity() {
        return windVelocity;
    }

    public void setWindVelocity(String windVelocity) {
        this.windVelocity = windVelocity;
    }

    public String getWindDirect10() {
        return windDirect10;
    }

    public void setWindDirect10(String windDirect10) {
        this.windDirect10 = windDirect10;
    }

    public String getWindVelocity10() {
        return windVelocity10;
    }

    public void setWindVelocity10(String windVelocity10) {
        this.windVelocity10 = windVelocity10;
    }

    public String getMaxWindD() {
        return maxWindD;
    }

    public void setMaxWindD(String maxWindD) {
        this.maxWindD = maxWindD;
    }

    public String getMaxWindV() {
        return maxWindV;
    }

    public void setMaxWindV(String maxWindV) {
        this.maxWindV = maxWindV;
    }

    public String getTimeMaxWind() {
        return timeMaxWind;
    }

    public void setTimeMaxWind(String timeMaxWind) {
        this.timeMaxWind = timeMaxWind;
    }

    public String getInstantWindD() {
        return instantWindD;
    }

    public void setInstantWindD(String instantWindD) {
        this.instantWindD = instantWindD;
    }

    public String getInstantWindV() {
        return instantWindV;
    }

    public void setInstantWindV(String instantWindV) {
        this.instantWindV = instantWindV;
    }

    public String getExMaxWindD() {
        return exMaxWindD;
    }

    public void setExMaxWindD(String exMaxWindD) {
        this.exMaxWindD = exMaxWindD;
    }

    public String getExMaxWindV() {
        return exMaxWindV;
    }

    public void setExMaxWindV(String exMaxWindV) {
        this.exMaxWindV = exMaxWindV;
    }

    public String getTimeExMaxWind() {
        return timeExMaxWind;
    }

    public void setTimeExMaxWind(String timeExMaxWind) {
        this.timeExMaxWind = timeExMaxWind;
    }

    public String getExMaxWindD6Hour() {
        return exMaxWindD6Hour;
    }

    public void setExMaxWindD6Hour(String exMaxWindD6Hour) {
        this.exMaxWindD6Hour = exMaxWindD6Hour;
    }

    public String getExMaxWindV6Hour() {
        return exMaxWindV6Hour;
    }

    public void setExMaxWindV6Hour(String exMaxWindV6Hour) {
        this.exMaxWindV6Hour = exMaxWindV6Hour;
    }

    public String getExMaxWindD12Hour() {
        return exMaxWindD12Hour;
    }

    public void setExMaxWindD12Hour(String exMaxWindD12Hour) {
        this.exMaxWindD12Hour = exMaxWindD12Hour;
    }

    public String getExMaxWindV12Hour() {
        return exMaxWindV12Hour;
    }

    public void setExMaxWindV12Hour(String exMaxWindV12Hour) {
        this.exMaxWindV12Hour = exMaxWindV12Hour;
    }

    public String getSurfaceTemp() {
        return surfaceTemp;
    }

    public void setSurfaceTemp(String surfaceTemp) {
        this.surfaceTemp = surfaceTemp;
    }

    public String getSurfaceMaxTemp() {
        return surfaceMaxTemp;
    }

    public void setSurfaceMaxTemp(String surfaceMaxTemp) {
        this.surfaceMaxTemp = surfaceMaxTemp;
    }

    public String getTimeSurMaxTemp() {
        return timeSurMaxTemp;
    }

    public void setTimeSurMaxTemp(String timeSurMaxTemp) {
        this.timeSurMaxTemp = timeSurMaxTemp;
    }

    public String getSurfaceMinTemp() {
        return surfaceMinTemp;
    }

    public void setSurfaceMinTemp(String surfaceMinTemp) {
        this.surfaceMinTemp = surfaceMinTemp;
    }

    public String getTimeSurMinTemp() {
        return timeSurMinTemp;
    }

    public void setTimeSurMinTemp(String timeSurMinTemp) {
        this.timeSurMinTemp = timeSurMinTemp;
    }

    public String getSurfaceMinTemp12Hour() {
        return surfaceMinTemp12Hour;
    }

    public void setSurfaceMinTemp12Hour(String surfaceMinTemp12Hour) {
        this.surfaceMinTemp12Hour = surfaceMinTemp12Hour;
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

    public String getGlassSurfaceTemp() {
        return glassSurfaceTemp;
    }

    public void setGlassSurfaceTemp(String glassSurfaceTemp) {
        this.glassSurfaceTemp = glassSurfaceTemp;
    }

    public String getMaxGlassSurfTemp() {
        return maxGlassSurfTemp;
    }

    public void setMaxGlassSurfTemp(String maxGlassSurfTemp) {
        this.maxGlassSurfTemp = maxGlassSurfTemp;
    }

    public String getTimeMaxGlassSurfTemp() {
        return timeMaxGlassSurfTemp;
    }

    public void setTimeMaxGlassSurfTemp(String timeMaxGlassSurfTemp) {
        this.timeMaxGlassSurfTemp = timeMaxGlassSurfTemp;
    }

    public String getMinGlassSurfTemp() {
        return minGlassSurfTemp;
    }

    public void setMinGlassSurfTemp(String minGlassSurfTemp) {
        this.minGlassSurfTemp = minGlassSurfTemp;
    }

    public String getTimeMinGlassSurfTemp() {
        return timeMinGlassSurfTemp;
    }

    public void setTimeMinGlassSurfTemp(String timeMinGlassSurfTemp) {
        this.timeMinGlassSurfTemp = timeMinGlassSurfTemp;
    }

    public String getAwsVisibility() {
        return awsVisibility;
    }

    public void setAwsVisibility(String awsVisibility) {
        this.awsVisibility = awsVisibility;
    }

    public String getAwsVisibility10() {
        return awsVisibility10;
    }

    public void setAwsVisibility10(String awsVisibility10) {
        this.awsVisibility10 = awsVisibility10;
    }

    public String getMinAwsVisibility() {
        return minAwsVisibility;
    }

    public void setMinAwsVisibility(String minAwsVisibility) {
        this.minAwsVisibility = minAwsVisibility;
    }

    public String getTimeMinAwsVisibility() {
        return timeMinAwsVisibility;
    }

    public void setTimeMinAwsVisibility(String timeMinAwsVisibility) {
        this.timeMinAwsVisibility = timeMinAwsVisibility;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getCloudAmount() {
        return cloudAmount;
    }

    public void setCloudAmount(String cloudAmount) {
        this.cloudAmount = cloudAmount;
    }

    public String getLowCloudAmount() {
        return lowCloudAmount;
    }

    public void setLowCloudAmount(String lowCloudAmount) {
        this.lowCloudAmount = lowCloudAmount;
    }

    public String getReportCloudAmount() {
        return reportCloudAmount;
    }

    public void setReportCloudAmount(String reportCloudAmount) {
        this.reportCloudAmount = reportCloudAmount;
    }

    public String getCloudHigh() {
        return cloudHigh;
    }

    public void setCloudHigh(String cloudHigh) {
        this.cloudHigh = cloudHigh;
    }

    public String getCloudShape() {
        return cloudShape;
    }

    public void setCloudShape(String cloudShape) {
        this.cloudShape = cloudShape;
    }

    public String getCloudShapeCode() {
        return cloudShapeCode;
    }

    public void setCloudShapeCode(String cloudShapeCode) {
        this.cloudShapeCode = cloudShapeCode;
    }

    public String getCurrentWeatherCode() {
        return currentWeatherCode;
    }

    public void setCurrentWeatherCode(String currentWeatherCode) {
        this.currentWeatherCode = currentWeatherCode;
    }

    public String getPastWeatherPeriod() {
        return pastWeatherPeriod;
    }

    public void setPastWeatherPeriod(String pastWeatherPeriod) {
        this.pastWeatherPeriod = pastWeatherPeriod;
    }

    public String getPastWeatherCode1() {
        return pastWeatherCode1;
    }

    public void setPastWeatherCode1(String pastWeatherCode1) {
        this.pastWeatherCode1 = pastWeatherCode1;
    }

    public String getPastWeatherCode2() {
        return pastWeatherCode2;
    }

    public void setPastWeatherCode2(String pastWeatherCode2) {
        this.pastWeatherCode2 = pastWeatherCode2;
    }

    public String getSurfaceState() {
        return surfaceState;
    }

    public void setSurfaceState(String surfaceState) {
        this.surfaceState = surfaceState;
    }

    public String getSnowDepth() {
        return snowDepth;
    }

    public void setSnowDepth(String snowDepth) {
        this.snowDepth = snowDepth;
    }

    public String getSnowPress() {
        return snowPress;
    }

    public void setSnowPress(String snowPress) {
        this.snowPress = snowPress;
    }

    public String getMaxFrozenSoil1TH() {
        return maxFrozenSoil1TH;
    }

    public void setMaxFrozenSoil1TH(String maxFrozenSoil1TH) {
        this.maxFrozenSoil1TH = maxFrozenSoil1TH;
    }

    public String getMinFrozenSoil1TH() {
        return minFrozenSoil1TH;
    }

    public void setMinFrozenSoil1TH(String minFrozenSoil1TH) {
        this.minFrozenSoil1TH = minFrozenSoil1TH;
    }

    public String getMaxFrozenSoil2TH() {
        return maxFrozenSoil2TH;
    }

    public void setMaxFrozenSoil2TH(String maxFrozenSoil2TH) {
        this.maxFrozenSoil2TH = maxFrozenSoil2TH;
    }

    public String getMinFrozenSoil2TH() {
        return minFrozenSoil2TH;
    }

    public void setMinFrozenSoil2TH(String minFrozenSoil2TH) {
        this.minFrozenSoil2TH = minFrozenSoil2TH;
    }

    public String getTornadoDistCode() {
        return tornadoDistCode;
    }

    public void setTornadoDistCode(String tornadoDistCode) {
        this.tornadoDistCode = tornadoDistCode;
    }

    public String getTornadoAligCode() {
        return tornadoAligCode;
    }

    public void setTornadoAligCode(String tornadoAligCode) {
        this.tornadoAligCode = tornadoAligCode;
    }

    public String getIcingLineR() {
        return icingLineR;
    }

    public void setIcingLineR(String icingLineR) {
        this.icingLineR = icingLineR;
    }

    public String getMaxHailR() {
        return maxHailR;
    }

    public void setMaxHailR(String maxHailR) {
        this.maxHailR = maxHailR;
    }

    public String getPrecipitationAmount() {
        return precipitationAmount;
    }

    public void setPrecipitationAmount(String precipitationAmount) {
        this.precipitationAmount = precipitationAmount;
    }

    public String getWeatherPhenomenon() {
        return weatherPhenomenon;
    }

    public void setWeatherPhenomenon(String weatherPhenomenon) {
        this.weatherPhenomenon = weatherPhenomenon;
    }

    public String getStationQC() {
        return stationQC;
    }

    public void setStationQC(String stationQC) {
        this.stationQC = stationQC;
    }

    public String getProvinceQC() {
        return provinceQC;
    }

    public void setProvinceQC(String provinceQC) {
        this.provinceQC = provinceQC;
    }

    public String getCountryQC() {
        return countryQC;
    }

    public void setCountryQC(String countryQC) {
        this.countryQC = countryQC;
    }

    public String getFellRain() {
        return fellRain;
    }

    public void setFellRain(String fellRain) {
        this.fellRain = fellRain;
    }

    public LocalDateTime getObservDate() {
        return observDate;
    }

    public void setObservDate(LocalDateTime observDate) {
        this.observDate = observDate;
    }

    public Integer getiD() {
        return iD;
    }

    public void setiD(Integer iD) {
        this.iD = iD;
    }

    @Override
    public String toString() {
        return "Tabawstimedata{" +
        "stationNum=" + stationNum +
        ", observTimes=" + observTimes +
        ", locat=" + locat +
        ", latitude=" + latitude +
        ", longitude=" + longitude +
        ", fieldElevation=" + fieldElevation +
        ", baroElevation=" + baroElevation +
        ", qCFlag=" + qCFlag +
        ", modifyFlag=" + modifyFlag +
        ", insertTime=" + insertTime +
        ", stationPress=" + stationPress +
        ", seaLevelPress=" + seaLevelPress +
        ", presseChange3Hour=" + presseChange3Hour +
        ", presseChange24Hour=" + presseChange24Hour +
        ", maxPSta=" + maxPSta +
        ", timeMaxPSta=" + timeMaxPSta +
        ", minPSta=" + minPSta +
        ", timeMinPSta=" + timeMinPSta +
        ", dryBulTemp=" + dryBulTemp +
        ", maxTemp=" + maxTemp +
        ", timeMaxTemp=" + timeMaxTemp +
        ", minTemp=" + minTemp +
        ", timeMinTemp=" + timeMinTemp +
        ", tempChange24Hour=" + tempChange24Hour +
        ", maxTemp24Hour=" + maxTemp24Hour +
        ", minTemp24Hour=" + minTemp24Hour +
        ", dewTemp=" + dewTemp +
        ", relHumidity=" + relHumidity +
        ", minRelHumidity=" + minRelHumidity +
        ", timeMinRelH=" + timeMinRelH +
        ", vapourPress=" + vapourPress +
        ", precipitation=" + precipitation +
        ", precipitation3Hour=" + precipitation3Hour +
        ", precipitation6Hour=" + precipitation6Hour +
        ", precipitation12Hour=" + precipitation12Hour +
        ", precipitation24Hour=" + precipitation24Hour +
        ", densifyObsvTimePeriod=" + densifyObsvTimePeriod +
        ", densifyObsvPrec=" + densifyObsvPrec +
        ", evagaugeAmount=" + evagaugeAmount +
        ", windDirect=" + windDirect +
        ", windVelocity=" + windVelocity +
        ", windDirect10=" + windDirect10 +
        ", windVelocity10=" + windVelocity10 +
        ", maxWindD=" + maxWindD +
        ", maxWindV=" + maxWindV +
        ", timeMaxWind=" + timeMaxWind +
        ", instantWindD=" + instantWindD +
        ", instantWindV=" + instantWindV +
        ", exMaxWindD=" + exMaxWindD +
        ", exMaxWindV=" + exMaxWindV +
        ", timeExMaxWind=" + timeExMaxWind +
        ", exMaxWindD6Hour=" + exMaxWindD6Hour +
        ", exMaxWindV6Hour=" + exMaxWindV6Hour +
        ", exMaxWindD12Hour=" + exMaxWindD12Hour +
        ", exMaxWindV12Hour=" + exMaxWindV12Hour +
        ", surfaceTemp=" + surfaceTemp +
        ", surfaceMaxTemp=" + surfaceMaxTemp +
        ", timeSurMaxTemp=" + timeSurMaxTemp +
        ", surfaceMinTemp=" + surfaceMinTemp +
        ", timeSurMinTemp=" + timeSurMinTemp +
        ", surfaceMinTemp12Hour=" + surfaceMinTemp12Hour +
        ", temp5cm=" + temp5cm +
        ", temp10cm=" + temp10cm +
        ", temp15cm=" + temp15cm +
        ", temp20cm=" + temp20cm +
        ", temp40cm=" + temp40cm +
        ", temp80cm=" + temp80cm +
        ", temp160cm=" + temp160cm +
        ", temp320cm=" + temp320cm +
        ", glassSurfaceTemp=" + glassSurfaceTemp +
        ", maxGlassSurfTemp=" + maxGlassSurfTemp +
        ", timeMaxGlassSurfTemp=" + timeMaxGlassSurfTemp +
        ", minGlassSurfTemp=" + minGlassSurfTemp +
        ", timeMinGlassSurfTemp=" + timeMinGlassSurfTemp +
        ", awsVisibility=" + awsVisibility +
        ", awsVisibility10=" + awsVisibility10 +
        ", minAwsVisibility=" + minAwsVisibility +
        ", timeMinAwsVisibility=" + timeMinAwsVisibility +
        ", visibility=" + visibility +
        ", cloudAmount=" + cloudAmount +
        ", lowCloudAmount=" + lowCloudAmount +
        ", reportCloudAmount=" + reportCloudAmount +
        ", cloudHigh=" + cloudHigh +
        ", cloudShape=" + cloudShape +
        ", cloudShapeCode=" + cloudShapeCode +
        ", currentWeatherCode=" + currentWeatherCode +
        ", pastWeatherPeriod=" + pastWeatherPeriod +
        ", pastWeatherCode1=" + pastWeatherCode1 +
        ", pastWeatherCode2=" + pastWeatherCode2 +
        ", surfaceState=" + surfaceState +
        ", snowDepth=" + snowDepth +
        ", snowPress=" + snowPress +
        ", maxFrozenSoil1TH=" + maxFrozenSoil1TH +
        ", minFrozenSoil1TH=" + minFrozenSoil1TH +
        ", maxFrozenSoil2TH=" + maxFrozenSoil2TH +
        ", minFrozenSoil2TH=" + minFrozenSoil2TH +
        ", tornadoDistCode=" + tornadoDistCode +
        ", tornadoAligCode=" + tornadoAligCode +
        ", icingLineR=" + icingLineR +
        ", maxHailR=" + maxHailR +
        ", precipitationAmount=" + precipitationAmount +
        ", weatherPhenomenon=" + weatherPhenomenon +
        ", stationQC=" + stationQC +
        ", provinceQC=" + provinceQC +
        ", countryQC=" + countryQC +
        ", fellRain=" + fellRain +
        ", observDate=" + observDate +
        ", iD=" + iD +
        "}";
    }
}

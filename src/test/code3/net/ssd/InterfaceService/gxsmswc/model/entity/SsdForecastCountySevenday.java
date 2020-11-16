package net.ssd.InterfaceService.gxsmswc.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
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
@ApiModel(value="SsdForecastCountySevenday对象", description="")
public class SsdForecastCountySevenday implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "区域代码")
    private String areaCode;

    @ApiModelProperty(value = "市县名称")
    private String cityName;

    @ApiModelProperty(value = "风向风速")
    private String wind;

    @ApiModelProperty(value = "天气情况")
    private String weather;

    @ApiModelProperty(value = "预报时间")
    private String obserDate;

    @ApiModelProperty(value = "预报时段:08、10、20三种时段的预报")
    private String obserTime;

    @ApiModelProperty(value = "最高温度")
    private Float maxTemp;

    @ApiModelProperty(value = "最低温度")
    private Float minTemp;

    @ApiModelProperty(value = "入库时间")
    private LocalDateTime creatTime;

    @ApiModelProperty(value = "预报时次")
    private String forecastTimes;

    @ApiModelProperty(value = "文件名")
    private String fileName;

    @ApiModelProperty(value = "id 匹配同步过来的数据，不是主键")
    private Long id;

    @ApiModelProperty(value = "fid 为主见  ")
    @TableId(value = "fid", type = IdType.AUTO)
    private Long fid;


    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getObserDate() {
        return obserDate;
    }

    public void setObserDate(String obserDate) {
        this.obserDate = obserDate;
    }

    public String getObserTime() {
        return obserTime;
    }

    public void setObserTime(String obserTime) {
        this.obserTime = obserTime;
    }

    public Float getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(Float maxTemp) {
        this.maxTemp = maxTemp;
    }

    public Float getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(Float minTemp) {
        this.minTemp = minTemp;
    }

    public LocalDateTime getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(LocalDateTime creatTime) {
        this.creatTime = creatTime;
    }

    public String getForecastTimes() {
        return forecastTimes;
    }

    public void setForecastTimes(String forecastTimes) {
        this.forecastTimes = forecastTimes;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    @Override
    public String toString() {
        return "SsdForecastCountySevenday{" +
        "areaCode=" + areaCode +
        ", cityName=" + cityName +
        ", wind=" + wind +
        ", weather=" + weather +
        ", obserDate=" + obserDate +
        ", obserTime=" + obserTime +
        ", maxTemp=" + maxTemp +
        ", minTemp=" + minTemp +
        ", creatTime=" + creatTime +
        ", forecastTimes=" + forecastTimes +
        ", fileName=" + fileName +
        ", id=" + id +
        ", fid=" + fid +
        "}";
    }
}

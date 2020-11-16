package net.ssd.InterfaceService.gxsmswc.model.entity;

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
@ApiModel(value="ShortForecast3day对象", description="")
public class ShortForecast3day implements Serializable {

    private static final long serialVersionUID=1L;

    @TableField("maxTemp_twoday")
    private String maxtempTwoday;

    private String mark;

    @TableField("minTemp_threeday")
    private String mintempThreeday;

    private String cityName;

    private String area;

    private String type;

    private String weatherTwoday;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String title;

    private String windOneday;

    @TableField("todayDate")
    private String todayDate;

    private String windThreeday;

    private String weatherOneday;

    @TableField("minTemp_twoday")
    private String mintempTwoday;

    @TableField("maxTemp_oneday")
    private String maxtempOneday;

    private Integer sort;

    @TableField("maxTemp_threeday")
    private String maxtempThreeday;

    @TableField("minTemp_oneday")
    private String mintempOneday;

    @TableField("lastInsertTime")
    private String lastInsertTime;

    private String weatherThreeday;

    private String windTwoday;


    public String getMaxtempTwoday() {
        return maxtempTwoday;
    }

    public void setMaxtempTwoday(String maxtempTwoday) {
        this.maxtempTwoday = maxtempTwoday;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMintempThreeday() {
        return mintempThreeday;
    }

    public void setMintempThreeday(String mintempThreeday) {
        this.mintempThreeday = mintempThreeday;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWeatherTwoday() {
        return weatherTwoday;
    }

    public void setWeatherTwoday(String weatherTwoday) {
        this.weatherTwoday = weatherTwoday;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWindOneday() {
        return windOneday;
    }

    public void setWindOneday(String windOneday) {
        this.windOneday = windOneday;
    }

    public String getTodayDate() {
        return todayDate;
    }

    public void setTodayDate(String todayDate) {
        this.todayDate = todayDate;
    }

    public String getWindThreeday() {
        return windThreeday;
    }

    public void setWindThreeday(String windThreeday) {
        this.windThreeday = windThreeday;
    }

    public String getWeatherOneday() {
        return weatherOneday;
    }

    public void setWeatherOneday(String weatherOneday) {
        this.weatherOneday = weatherOneday;
    }

    public String getMintempTwoday() {
        return mintempTwoday;
    }

    public void setMintempTwoday(String mintempTwoday) {
        this.mintempTwoday = mintempTwoday;
    }

    public String getMaxtempOneday() {
        return maxtempOneday;
    }

    public void setMaxtempOneday(String maxtempOneday) {
        this.maxtempOneday = maxtempOneday;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getMaxtempThreeday() {
        return maxtempThreeday;
    }

    public void setMaxtempThreeday(String maxtempThreeday) {
        this.maxtempThreeday = maxtempThreeday;
    }

    public String getMintempOneday() {
        return mintempOneday;
    }

    public void setMintempOneday(String mintempOneday) {
        this.mintempOneday = mintempOneday;
    }

    public String getLastInsertTime() {
        return lastInsertTime;
    }

    public void setLastInsertTime(String lastInsertTime) {
        this.lastInsertTime = lastInsertTime;
    }

    public String getWeatherThreeday() {
        return weatherThreeday;
    }

    public void setWeatherThreeday(String weatherThreeday) {
        this.weatherThreeday = weatherThreeday;
    }

    public String getWindTwoday() {
        return windTwoday;
    }

    public void setWindTwoday(String windTwoday) {
        this.windTwoday = windTwoday;
    }

    @Override
    public String toString() {
        return "ShortForecast3day{" +
        "maxtempTwoday=" + maxtempTwoday +
        ", mark=" + mark +
        ", mintempThreeday=" + mintempThreeday +
        ", cityName=" + cityName +
        ", area=" + area +
        ", type=" + type +
        ", weatherTwoday=" + weatherTwoday +
        ", id=" + id +
        ", title=" + title +
        ", windOneday=" + windOneday +
        ", todayDate=" + todayDate +
        ", windThreeday=" + windThreeday +
        ", weatherOneday=" + weatherOneday +
        ", mintempTwoday=" + mintempTwoday +
        ", maxtempOneday=" + maxtempOneday +
        ", sort=" + sort +
        ", maxtempThreeday=" + maxtempThreeday +
        ", mintempOneday=" + mintempOneday +
        ", lastInsertTime=" + lastInsertTime +
        ", weatherThreeday=" + weatherThreeday +
        ", windTwoday=" + windTwoday +
        "}";
    }
}

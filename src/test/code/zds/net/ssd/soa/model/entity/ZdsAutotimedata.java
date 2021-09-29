package net.ssd.soa.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("zds_autoTimeData")
@ApiModel(value="ZdsAutotimedata对象", description="")
public class ZdsAutotimedata implements Serializable {

    private static final long serialVersionUID=1L;

    @TableField("Id")
    private String id;

    @TableField("Ltime")
    private String ltime;

    @TableField("Wind")
    private Integer wind;

    @TableField("Rain")
    private Integer rain;

    @TableField("HourRain")
    private Integer hourRain;

    @TableField("DryBulTemp")
    private Integer dryBulTemp;

    @TableField("MaxTemp")
    private Integer maxTemp;

    @TableField("MinTemp")
    private Integer minTemp;

    @TableField("RelHumidity")
    private Integer relHumidity;

    @TableField("FH")
    private Integer fH;

    @TableField("WindDirect")
    private Integer windDirect;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLtime() {
        return ltime;
    }

    public void setLtime(String ltime) {
        this.ltime = ltime;
    }

    public Integer getWind() {
        return wind;
    }

    public void setWind(Integer wind) {
        this.wind = wind;
    }

    public Integer getRain() {
        return rain;
    }

    public void setRain(Integer rain) {
        this.rain = rain;
    }

    public Integer getHourRain() {
        return hourRain;
    }

    public void setHourRain(Integer hourRain) {
        this.hourRain = hourRain;
    }

    public Integer getDryBulTemp() {
        return dryBulTemp;
    }

    public void setDryBulTemp(Integer dryBulTemp) {
        this.dryBulTemp = dryBulTemp;
    }

    public Integer getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(Integer maxTemp) {
        this.maxTemp = maxTemp;
    }

    public Integer getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(Integer minTemp) {
        this.minTemp = minTemp;
    }

    public Integer getRelHumidity() {
        return relHumidity;
    }

    public void setRelHumidity(Integer relHumidity) {
        this.relHumidity = relHumidity;
    }

    public Integer getfH() {
        return fH;
    }

    public void setfH(Integer fH) {
        this.fH = fH;
    }

    public Integer getWindDirect() {
        return windDirect;
    }

    public void setWindDirect(Integer windDirect) {
        this.windDirect = windDirect;
    }

    @Override
    public String toString() {
        return "ZdsAutotimedata{" +
        "id=" + id +
        ", ltime=" + ltime +
        ", wind=" + wind +
        ", rain=" + rain +
        ", hourRain=" + hourRain +
        ", dryBulTemp=" + dryBulTemp +
        ", maxTemp=" + maxTemp +
        ", minTemp=" + minTemp +
        ", relHumidity=" + relHumidity +
        ", fH=" + fH +
        ", windDirect=" + windDirect +
        "}";
    }
}

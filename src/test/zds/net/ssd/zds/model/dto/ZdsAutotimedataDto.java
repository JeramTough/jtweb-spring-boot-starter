package net.ssd.zds.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
 * @since 2021-04-25
 */
@TableName("zds_autoTimeData")
@ApiModel(value="ZdsAutotimedata对象", description="")
public class ZdsAutotimedataDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableId("Id")
    private String id;

    @TableField("Ltime")
    private String ltime;

    @TableField("Wind")
    private Integer wind;

    @TableField("Rain")
    private Integer rain;

    @TableField("HourRain")
    private Integer hourrain;

    @TableField("DryBulTemp")
    private Integer drybultemp;

    @TableField("MaxTemp")
    private Integer maxtemp;

    @TableField("MinTemp")
    private Integer mintemp;

    @TableField("RelHumidity")
    private Integer relhumidity;

    @TableField("FH")
    private Integer fh;

    @TableField("WindDirect")
    private Integer winddirect;


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

    public Integer getHourrain() {
        return hourrain;
    }

    public void setHourrain(Integer hourrain) {
        this.hourrain = hourrain;
    }

    public Integer getDrybultemp() {
        return drybultemp;
    }

    public void setDrybultemp(Integer drybultemp) {
        this.drybultemp = drybultemp;
    }

    public Integer getMaxtemp() {
        return maxtemp;
    }

    public void setMaxtemp(Integer maxtemp) {
        this.maxtemp = maxtemp;
    }

    public Integer getMintemp() {
        return mintemp;
    }

    public void setMintemp(Integer mintemp) {
        this.mintemp = mintemp;
    }

    public Integer getRelhumidity() {
        return relhumidity;
    }

    public void setRelhumidity(Integer relhumidity) {
        this.relhumidity = relhumidity;
    }

    public Integer getFh() {
        return fh;
    }

    public void setFh(Integer fh) {
        this.fh = fh;
    }

    public Integer getWinddirect() {
        return winddirect;
    }

    public void setWinddirect(Integer winddirect) {
        this.winddirect = winddirect;
    }

    @Override
    public String toString() {
        return "ZdsAutotimedata{" +
        "id=" + id +
        ", ltime=" + ltime +
        ", wind=" + wind +
        ", rain=" + rain +
        ", hourrain=" + hourrain +
        ", drybultemp=" + drybultemp +
        ", maxtemp=" + maxtemp +
        ", mintemp=" + mintemp +
        ", relhumidity=" + relhumidity +
        ", fh=" + fh +
        ", winddirect=" + winddirect +
        "}";
    }
}

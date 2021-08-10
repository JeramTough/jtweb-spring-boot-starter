package net.ssd.zds.model.entity;

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
@ApiModel(value="BasinRain6Forecast对象", description="")
public class BasinRain6ForecastDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableField("Ldate")
    private String ldate;

    @TableField("BasinId")
    private String basinid;

    private Integer rain;

    private Integer hail;

    private Integer thunderstorm;

    @TableField("strongConvection")
    private Integer strongconvection;

    private Integer thunder;


    public String getLdate() {
        return ldate;
    }

    public void setLdate(String ldate) {
        this.ldate = ldate;
    }

    public String getBasinid() {
        return basinid;
    }

    public void setBasinid(String basinid) {
        this.basinid = basinid;
    }

    public Integer getRain() {
        return rain;
    }

    public void setRain(Integer rain) {
        this.rain = rain;
    }

    public Integer getHail() {
        return hail;
    }

    public void setHail(Integer hail) {
        this.hail = hail;
    }

    public Integer getThunderstorm() {
        return thunderstorm;
    }

    public void setThunderstorm(Integer thunderstorm) {
        this.thunderstorm = thunderstorm;
    }

    public Integer getStrongconvection() {
        return strongconvection;
    }

    public void setStrongconvection(Integer strongconvection) {
        this.strongconvection = strongconvection;
    }

    public Integer getThunder() {
        return thunder;
    }

    public void setThunder(Integer thunder) {
        this.thunder = thunder;
    }

    @Override
    public String toString() {
        return "BasinRain6Forecast{" +
        "ldate=" + ldate +
        ", basinid=" + basinid +
        ", rain=" + rain +
        ", hail=" + hail +
        ", thunderstorm=" + thunderstorm +
        ", strongconvection=" + strongconvection +
        ", thunder=" + thunder +
        "}";
    }
}

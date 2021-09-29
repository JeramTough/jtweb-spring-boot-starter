package net.ssd.soa.model.entity;

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
@ApiModel(value="BasinRain6Forecast对象", description="")
public class BasinRain6Forecast implements Serializable {

    private static final long serialVersionUID=1L;

    @TableField("Ldate")
    private String ldate;

    @TableField("BasinId")
    private String basinId;

    private Integer rain;

    private Integer hail;

    private Integer thunderstorm;

    @TableField("strongConvection")
    private Integer strongConvection;

    private Integer thunder;


    public String getLdate() {
        return ldate;
    }

    public void setLdate(String ldate) {
        this.ldate = ldate;
    }

    public String getBasinId() {
        return basinId;
    }

    public void setBasinId(String basinId) {
        this.basinId = basinId;
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

    public Integer getStrongConvection() {
        return strongConvection;
    }

    public void setStrongConvection(Integer strongConvection) {
        this.strongConvection = strongConvection;
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
        ", basinId=" + basinId +
        ", rain=" + rain +
        ", hail=" + hail +
        ", thunderstorm=" + thunderstorm +
        ", strongConvection=" + strongConvection +
        ", thunder=" + thunder +
        "}";
    }
}

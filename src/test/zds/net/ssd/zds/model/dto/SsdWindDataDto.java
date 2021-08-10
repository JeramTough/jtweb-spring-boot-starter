package net.ssd.zds.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
 * @since 2021-04-25
 */
@TableName("Ssd_Wind_Data")
@ApiModel(value="SsdWindData对象", description="")
public class SsdWindDataDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("weiDu")
    private String weidu;

    @TableField("jingDu")
    private String jingdu;

    @TableField("releaseTime")
    private String releasetime;

    @TableField("stationName")
    private String stationname;

    @TableField("stationId")
    private String stationid;

    private Float uWind;

    private Float vWind;

    @TableField("windDirection")
    private String winddirection;

    @TableField("windSpeed")
    private Float windspeed;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWeidu() {
        return weidu;
    }

    public void setWeidu(String weidu) {
        this.weidu = weidu;
    }

    public String getJingdu() {
        return jingdu;
    }

    public void setJingdu(String jingdu) {
        this.jingdu = jingdu;
    }

    public String getReleasetime() {
        return releasetime;
    }

    public void setReleasetime(String releasetime) {
        this.releasetime = releasetime;
    }

    public String getStationname() {
        return stationname;
    }

    public void setStationname(String stationname) {
        this.stationname = stationname;
    }

    public String getStationid() {
        return stationid;
    }

    public void setStationid(String stationid) {
        this.stationid = stationid;
    }

    public Float getuWind() {
        return uWind;
    }

    public void setuWind(Float uWind) {
        this.uWind = uWind;
    }

    public Float getvWind() {
        return vWind;
    }

    public void setvWind(Float vWind) {
        this.vWind = vWind;
    }

    public String getWinddirection() {
        return winddirection;
    }

    public void setWinddirection(String winddirection) {
        this.winddirection = winddirection;
    }

    public Float getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(Float windspeed) {
        this.windspeed = windspeed;
    }

    @Override
    public String toString() {
        return "SsdWindData{" +
        "id=" + id +
        ", weidu=" + weidu +
        ", jingdu=" + jingdu +
        ", releasetime=" + releasetime +
        ", stationname=" + stationname +
        ", stationid=" + stationid +
        ", uWind=" + uWind +
        ", vWind=" + vWind +
        ", winddirection=" + winddirection +
        ", windspeed=" + windspeed +
        "}";
    }
}

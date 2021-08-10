package net.ssd.zds.model.entity;

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
@ApiModel(value="City14JxhForecast对象", description="")
public class City14JxhForecastDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableId("Station")
    private String station;

    @TableField("Ltime")
    private String ltime;

    @TableField("Ltype")
    private Integer ltype;

    @TableField("Ldate")
    private String ldate;

    @TableField("Temp")
    private Integer temp;

    @TableField("Rain")
    private Integer rain;

    @TableField("U")
    private Integer u;

    @TableField("V")
    private Integer v;


    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getLtime() {
        return ltime;
    }

    public void setLtime(String ltime) {
        this.ltime = ltime;
    }

    public Integer getLtype() {
        return ltype;
    }

    public void setLtype(Integer ltype) {
        this.ltype = ltype;
    }

    public String getLdate() {
        return ldate;
    }

    public void setLdate(String ldate) {
        this.ldate = ldate;
    }

    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    public Integer getRain() {
        return rain;
    }

    public void setRain(Integer rain) {
        this.rain = rain;
    }

    public Integer getU() {
        return u;
    }

    public void setU(Integer u) {
        this.u = u;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "City14JxhForecast{" +
        "station=" + station +
        ", ltime=" + ltime +
        ", ltype=" + ltype +
        ", ldate=" + ldate +
        ", temp=" + temp +
        ", rain=" + rain +
        ", u=" + u +
        ", v=" + v +
        "}";
    }
}

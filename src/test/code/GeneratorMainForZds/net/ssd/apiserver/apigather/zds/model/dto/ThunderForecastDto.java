package net.ssd.apiserver.apigather.zds.model.entity;

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
 * @author WeiBoWen
 * @since 2021-03-08
 */
@TableName("Thunder_forecast")
@ApiModel(value="ThunderForecast对象", description="")
public class ThunderForecastDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableId("LDATE")
    private String ldate;

    @TableField("LTIME")
    private String ltime;

    @TableField("BasinId")
    private String basinid;

    @TableField("Reliability")
    private Integer reliability;


    public String getLdate() {
        return ldate;
    }

    public void setLdate(String ldate) {
        this.ldate = ldate;
    }

    public String getLtime() {
        return ltime;
    }

    public void setLtime(String ltime) {
        this.ltime = ltime;
    }

    public String getBasinid() {
        return basinid;
    }

    public void setBasinid(String basinid) {
        this.basinid = basinid;
    }

    public Integer getReliability() {
        return reliability;
    }

    public void setReliability(Integer reliability) {
        this.reliability = reliability;
    }

    @Override
    public String toString() {
        return "ThunderForecast{" +
        "ldate=" + ldate +
        ", ltime=" + ltime +
        ", basinid=" + basinid +
        ", reliability=" + reliability +
        "}";
    }
}

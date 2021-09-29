package net.ssd.soa.model.entity;

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
 * @since 2021-09-08
 */
@TableName("Thunder_forecast")
@ApiModel(value="ThunderForecast对象", description="")
public class ThunderForecastDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableId("LDATE")
    private String lDATE;

    @TableField("LTIME")
    private String lTIME;

    @TableField("BasinId")
    private String basinId;

    @TableField("Reliability")
    private Integer reliability;

    @TableField("ID")
    private Integer iD;


    public String getlDATE() {
        return lDATE;
    }

    public void setlDATE(String lDATE) {
        this.lDATE = lDATE;
    }

    public String getlTIME() {
        return lTIME;
    }

    public void setlTIME(String lTIME) {
        this.lTIME = lTIME;
    }

    public String getBasinId() {
        return basinId;
    }

    public void setBasinId(String basinId) {
        this.basinId = basinId;
    }

    public Integer getReliability() {
        return reliability;
    }

    public void setReliability(Integer reliability) {
        this.reliability = reliability;
    }

    public Integer getiD() {
        return iD;
    }

    public void setiD(Integer iD) {
        this.iD = iD;
    }

    @Override
    public String toString() {
        return "ThunderForecast{" +
        "lDATE=" + lDATE +
        ", lTIME=" + lTIME +
        ", basinId=" + basinId +
        ", reliability=" + reliability +
        ", iD=" + iD +
        "}";
    }
}

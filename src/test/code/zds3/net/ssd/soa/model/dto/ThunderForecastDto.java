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
 * @since 2021-09-14
 */
@ApiModel(value="ThunderForecast对象", description="")
public class ThunderForecastDto implements Serializable{

    private static final long serialVersionUID=1L;

    private String ldate;

    private String ltime;

    @TableField("BasinId")
    private String basinId;

    @TableField("Reliability")
    private Integer reliability;

    private Integer id;


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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ThunderForecast{" +
        "ldate=" + ldate +
        ", ltime=" + ltime +
        ", basinId=" + basinId +
        ", reliability=" + reliability +
        ", id=" + id +
        "}";
    }
}

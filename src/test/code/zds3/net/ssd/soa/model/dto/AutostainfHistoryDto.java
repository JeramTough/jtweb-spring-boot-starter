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
@ApiModel(value="AutostainfHistory对象", description="")
public class AutostainfHistoryDto implements Serializable{

    private static final long serialVersionUID=1L;

    private Integer id;

    @TableField("BasinId")
    private String basinId;

    @TableField("countyName")
    private String countyName;

    private String staJingdu;

    private String staWeidu;

    private String staStation;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBasinId() {
        return basinId;
    }

    public void setBasinId(String basinId) {
        this.basinId = basinId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getStaJingdu() {
        return staJingdu;
    }

    public void setStaJingdu(String staJingdu) {
        this.staJingdu = staJingdu;
    }

    public String getStaWeidu() {
        return staWeidu;
    }

    public void setStaWeidu(String staWeidu) {
        this.staWeidu = staWeidu;
    }

    public String getStaStation() {
        return staStation;
    }

    public void setStaStation(String staStation) {
        this.staStation = staStation;
    }

    @Override
    public String toString() {
        return "AutostainfHistory{" +
        "id=" + id +
        ", basinId=" + basinId +
        ", countyName=" + countyName +
        ", staJingdu=" + staJingdu +
        ", staWeidu=" + staWeidu +
        ", staStation=" + staStation +
        "}";
    }
}

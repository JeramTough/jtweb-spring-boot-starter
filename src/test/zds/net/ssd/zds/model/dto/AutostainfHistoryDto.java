package net.ssd.zds.model.entity;

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
 * @author JeramTough
 * @since 2021-04-25
 */
@TableName("AutoStaInf_History")
@ApiModel(value="AutostainfHistory对象", description="")
public class AutostainfHistoryDto implements Serializable{

    private static final long serialVersionUID=1L;

    private Integer id;

    @TableField("BasinId")
    private String basinid;

    @TableField("countyName")
    private String countyname;

    private String staJingdu;

    private String staWeidu;

    private String staStation;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBasinid() {
        return basinid;
    }

    public void setBasinid(String basinid) {
        this.basinid = basinid;
    }

    public String getCountyname() {
        return countyname;
    }

    public void setCountyname(String countyname) {
        this.countyname = countyname;
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
        ", basinid=" + basinid +
        ", countyname=" + countyname +
        ", staJingdu=" + staJingdu +
        ", staWeidu=" + staWeidu +
        ", staStation=" + staStation +
        "}";
    }
}

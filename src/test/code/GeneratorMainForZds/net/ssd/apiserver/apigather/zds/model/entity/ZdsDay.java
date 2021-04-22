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
@TableName("ZDS_DAY")
@ApiModel(value="ZdsDay对象", description="")
public class ZdsDay implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId("LDATE")
    private String ldate;

    @TableField("LTIME")
    private String ltime;

    @TableField("AREA")
    private String area;

    @TableField("RAIN24")
    private String rain24;

    @TableField("BELIEF24")
    private String belief24;

    @TableField("RAIN48")
    private String rain48;

    @TableField("BELIEF48")
    private String belief48;

    @TableField("REMARK")
    private String remark;


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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getRain24() {
        return rain24;
    }

    public void setRain24(String rain24) {
        this.rain24 = rain24;
    }

    public String getBelief24() {
        return belief24;
    }

    public void setBelief24(String belief24) {
        this.belief24 = belief24;
    }

    public String getRain48() {
        return rain48;
    }

    public void setRain48(String rain48) {
        this.rain48 = rain48;
    }

    public String getBelief48() {
        return belief48;
    }

    public void setBelief48(String belief48) {
        this.belief48 = belief48;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "ZdsDay{" +
        "ldate=" + ldate +
        ", ltime=" + ltime +
        ", area=" + area +
        ", rain24=" + rain24 +
        ", belief24=" + belief24 +
        ", rain48=" + rain48 +
        ", belief48=" + belief48 +
        ", remark=" + remark +
        "}";
    }
}

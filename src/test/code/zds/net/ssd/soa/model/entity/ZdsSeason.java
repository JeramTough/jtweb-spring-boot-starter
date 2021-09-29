package net.ssd.soa.model.entity;

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
 * @author WeiBoWen
 * @since 2021-09-08
 */
@TableName("ZDS_SEASON")
@ApiModel(value="ZdsSeason对象", description="")
public class ZdsSeason implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer iD;

    @TableField("LDATE")
    private String lDATE;

    @TableField("LTIME")
    private String lTIME;

    @TableField("DAT")
    private String dAT;

    @TableField("Ltype")
    private Integer ltype;


    public Integer getiD() {
        return iD;
    }

    public void setiD(Integer iD) {
        this.iD = iD;
    }

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

    public String getdAT() {
        return dAT;
    }

    public void setdAT(String dAT) {
        this.dAT = dAT;
    }

    public Integer getLtype() {
        return ltype;
    }

    public void setLtype(Integer ltype) {
        this.ltype = ltype;
    }

    @Override
    public String toString() {
        return "ZdsSeason{" +
        "iD=" + iD +
        ", lDATE=" + lDATE +
        ", lTIME=" + lTIME +
        ", dAT=" + dAT +
        ", ltype=" + ltype +
        "}";
    }
}

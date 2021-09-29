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
@TableName("zds_FloodSeason")
@ApiModel(value="ZdsFloodseason对象", description="")
public class ZdsFloodseasonDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer iD;

    @TableField("LDATE")
    private String lDATE;

    @TableField("LTIME")
    private String lTIME;

    @TableField("DAT")
    private String dAT;

    @TableField("PIC")
    private byte[] pIC;

    @TableField("HTML")
    private String hTML;

    @TableField("LType")
    private Integer lType;


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

    public byte[] getpIC() {
        return pIC;
    }

    public void setpIC(byte[] pIC) {
        this.pIC = pIC;
    }

    public String gethTML() {
        return hTML;
    }

    public void sethTML(String hTML) {
        this.hTML = hTML;
    }

    public Integer getlType() {
        return lType;
    }

    public void setlType(Integer lType) {
        this.lType = lType;
    }

    @Override
    public String toString() {
        return "ZdsFloodseason{" +
        "iD=" + iD +
        ", lDATE=" + lDATE +
        ", lTIME=" + lTIME +
        ", dAT=" + dAT +
        ", pIC=" + pIC +
        ", hTML=" + hTML +
        ", lType=" + lType +
        "}";
    }
}

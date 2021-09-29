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
@TableName("ZDS_IMPORTANTREPORT")
@ApiModel(value="ZdsImportantreport对象", description="")
public class ZdsImportantreportDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer iD;

    @TableField("LDATE")
    private String lDATE;

    @TableField("LTIME")
    private String lTIME;

    @TableField("TITLE")
    private String tITLE;

    @TableField("DAT")
    private String dAT;

    @TableField("PIC1")
    private byte[] pIC1;

    @TableField("PIC2")
    private byte[] pIC2;

    @TableField("FNAME")
    private String fNAME;

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

    public String gettITLE() {
        return tITLE;
    }

    public void settITLE(String tITLE) {
        this.tITLE = tITLE;
    }

    public String getdAT() {
        return dAT;
    }

    public void setdAT(String dAT) {
        this.dAT = dAT;
    }

    public byte[] getpIC1() {
        return pIC1;
    }

    public void setpIC1(byte[] pIC1) {
        this.pIC1 = pIC1;
    }

    public byte[] getpIC2() {
        return pIC2;
    }

    public void setpIC2(byte[] pIC2) {
        this.pIC2 = pIC2;
    }

    public String getfNAME() {
        return fNAME;
    }

    public void setfNAME(String fNAME) {
        this.fNAME = fNAME;
    }

    public Integer getlType() {
        return lType;
    }

    public void setlType(Integer lType) {
        this.lType = lType;
    }

    @Override
    public String toString() {
        return "ZdsImportantreport{" +
        "iD=" + iD +
        ", lDATE=" + lDATE +
        ", lTIME=" + lTIME +
        ", tITLE=" + tITLE +
        ", dAT=" + dAT +
        ", pIC1=" + pIC1 +
        ", pIC2=" + pIC2 +
        ", fNAME=" + fNAME +
        ", lType=" + lType +
        "}";
    }
}

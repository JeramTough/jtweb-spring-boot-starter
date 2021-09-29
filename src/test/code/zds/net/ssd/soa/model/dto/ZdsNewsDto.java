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
 * @since 2021-08-24
 */
@TableName("ZDS_NEWS")
@ApiModel(value="ZdsNews对象", description="")
public class ZdsNewsDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableId("LDATE")
    private String lDATE;

    @TableField("LTIME")
    private String lTIME;

    @TableField("TITLE")
    private String tITLE;

    @TableField("CONTENT")
    private String cONTENT;

    @TableField("PIC1")
    private byte[] pIC1;

    @TableField("PIC2")
    private byte[] pIC2;


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

    public String getcONTENT() {
        return cONTENT;
    }

    public void setcONTENT(String cONTENT) {
        this.cONTENT = cONTENT;
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

    @Override
    public String toString() {
        return "ZdsNews{" +
        "lDATE=" + lDATE +
        ", lTIME=" + lTIME +
        ", tITLE=" + tITLE +
        ", cONTENT=" + cONTENT +
        ", pIC1=" + pIC1 +
        ", pIC2=" + pIC2 +
        "}";
    }
}

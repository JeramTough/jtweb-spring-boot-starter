package com.icloudmap.newerp.model.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 微信用户人员表
 * </p>
 *
 * @author WeiBoWen
 * @since 2021-11-24
 */
@TableName("WX_USER")
@ApiModel(value="WxUser对象", description="微信用户人员表")
public class WxUserDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableField("NAME")
    private String nAME;

    @TableId("USERID")
    private String uSERID;

    @TableField("DEPT")
    private String dEPT;

    @TableField("SEX")
    private String sEX;

    @TableField("TEL")
    private String tEL;

    @TableField("EMAIL")
    private String eMAIL;

    @TableField("ISVALID")
    private BigDecimal iSVALID;


    public String getnAME() {
        return nAME;
    }

    public void setnAME(String nAME) {
        this.nAME = nAME;
    }

    public String getuSERID() {
        return uSERID;
    }

    public void setuSERID(String uSERID) {
        this.uSERID = uSERID;
    }

    public String getdEPT() {
        return dEPT;
    }

    public void setdEPT(String dEPT) {
        this.dEPT = dEPT;
    }

    public String getsEX() {
        return sEX;
    }

    public void setsEX(String sEX) {
        this.sEX = sEX;
    }

    public String gettEL() {
        return tEL;
    }

    public void settEL(String tEL) {
        this.tEL = tEL;
    }

    public String geteMAIL() {
        return eMAIL;
    }

    public void seteMAIL(String eMAIL) {
        this.eMAIL = eMAIL;
    }

    public BigDecimal getiSVALID() {
        return iSVALID;
    }

    public void setiSVALID(BigDecimal iSVALID) {
        this.iSVALID = iSVALID;
    }

    @Override
    public String toString() {
        return "WxUser{" +
        "nAME=" + nAME +
        ", uSERID=" + uSERID +
        ", dEPT=" + dEPT +
        ", sEX=" + sEX +
        ", tEL=" + tEL +
        ", eMAIL=" + eMAIL +
        ", iSVALID=" + iSVALID +
        "}";
    }
}

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
@TableName("ZDS_DAY")
@ApiModel(value="ZdsDay对象", description="")
public class ZdsDay implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId("LDATE")
    private String lDATE;

    @TableField("LTIME")
    private String lTIME;

    @TableField("AREA")
    private String aREA;

    @TableField("RAIN24")
    private String rAIN24;

    @TableField("BELIEF24")
    private String bELIEF24;

    @TableField("RAIN48")
    private String rAIN48;

    @TableField("BELIEF48")
    private String bELIEF48;

    @TableField("REMARK")
    private String rEMARK;


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

    public String getaREA() {
        return aREA;
    }

    public void setaREA(String aREA) {
        this.aREA = aREA;
    }

    public String getrAIN24() {
        return rAIN24;
    }

    public void setrAIN24(String rAIN24) {
        this.rAIN24 = rAIN24;
    }

    public String getbELIEF24() {
        return bELIEF24;
    }

    public void setbELIEF24(String bELIEF24) {
        this.bELIEF24 = bELIEF24;
    }

    public String getrAIN48() {
        return rAIN48;
    }

    public void setrAIN48(String rAIN48) {
        this.rAIN48 = rAIN48;
    }

    public String getbELIEF48() {
        return bELIEF48;
    }

    public void setbELIEF48(String bELIEF48) {
        this.bELIEF48 = bELIEF48;
    }

    public String getrEMARK() {
        return rEMARK;
    }

    public void setrEMARK(String rEMARK) {
        this.rEMARK = rEMARK;
    }

    @Override
    public String toString() {
        return "ZdsDay{" +
        "lDATE=" + lDATE +
        ", lTIME=" + lTIME +
        ", aREA=" + aREA +
        ", rAIN24=" + rAIN24 +
        ", bELIEF24=" + bELIEF24 +
        ", rAIN48=" + rAIN48 +
        ", bELIEF48=" + bELIEF48 +
        ", rEMARK=" + rEMARK +
        "}";
    }
}

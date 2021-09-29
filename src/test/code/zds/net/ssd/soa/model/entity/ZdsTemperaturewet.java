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
 * @since 2021-09-08
 */
@TableName("ZDS_TEMPERATUREWET")
@ApiModel(value="ZdsTemperaturewet对象", description="")
public class ZdsTemperaturewet implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId("LDATE")
    private String lDATE;

    @TableField("CITY")
    private String cITY;

    @TableField("TMAX")
    private Float tMAX;

    @TableField("BELIEF1")
    private String bELIEF1;

    @TableField("TMIN")
    private Float tMIN;

    @TableField("BELIEF2")
    private String bELIEF2;

    @TableField("WET")
    private String wET;

    @TableField("BELIEF3")
    private String bELIEF3;

    @TableField("WEATHER")
    private String wEATHER;

    private String txt;

    @TableField("ID")
    private Integer iD;


    public String getlDATE() {
        return lDATE;
    }

    public void setlDATE(String lDATE) {
        this.lDATE = lDATE;
    }

    public String getcITY() {
        return cITY;
    }

    public void setcITY(String cITY) {
        this.cITY = cITY;
    }

    public Float gettMAX() {
        return tMAX;
    }

    public void settMAX(Float tMAX) {
        this.tMAX = tMAX;
    }

    public String getbELIEF1() {
        return bELIEF1;
    }

    public void setbELIEF1(String bELIEF1) {
        this.bELIEF1 = bELIEF1;
    }

    public Float gettMIN() {
        return tMIN;
    }

    public void settMIN(Float tMIN) {
        this.tMIN = tMIN;
    }

    public String getbELIEF2() {
        return bELIEF2;
    }

    public void setbELIEF2(String bELIEF2) {
        this.bELIEF2 = bELIEF2;
    }

    public String getwET() {
        return wET;
    }

    public void setwET(String wET) {
        this.wET = wET;
    }

    public String getbELIEF3() {
        return bELIEF3;
    }

    public void setbELIEF3(String bELIEF3) {
        this.bELIEF3 = bELIEF3;
    }

    public String getwEATHER() {
        return wEATHER;
    }

    public void setwEATHER(String wEATHER) {
        this.wEATHER = wEATHER;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public Integer getiD() {
        return iD;
    }

    public void setiD(Integer iD) {
        this.iD = iD;
    }

    @Override
    public String toString() {
        return "ZdsTemperaturewet{" +
        "lDATE=" + lDATE +
        ", cITY=" + cITY +
        ", tMAX=" + tMAX +
        ", bELIEF1=" + bELIEF1 +
        ", tMIN=" + tMIN +
        ", bELIEF2=" + bELIEF2 +
        ", wET=" + wET +
        ", bELIEF3=" + bELIEF3 +
        ", wEATHER=" + wEATHER +
        ", txt=" + txt +
        ", iD=" + iD +
        "}";
    }
}

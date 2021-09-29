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
@TableName("RainModify_1Hour_Forecast")
@ApiModel(value="Rainmodify1hourForecast对象", description="")
public class Rainmodify1hourForecast implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId("Ldate")
    private String ldate;

    @TableField("Ltime")
    private String ltime;

    @TableField("B1")
    private Integer b1;

    @TableField("B2")
    private Integer b2;

    @TableField("B3")
    private Integer b3;

    @TableField("B4")
    private Integer b4;

    @TableField("B5")
    private Integer b5;

    @TableField("B6")
    private Integer b6;

    @TableField("B7")
    private Integer b7;

    @TableField("B8")
    private Integer b8;

    @TableField("B9")
    private Integer b9;

    @TableField("B10")
    private Integer b10;

    @TableField("B11")
    private Integer b11;

    @TableField("B12")
    private Integer b12;

    @TableField("B13")
    private Integer b13;

    @TableField("B14")
    private Integer b14;

    @TableField("B15")
    private Integer b15;

    @TableField("B16")
    private Integer b16;

    @TableField("B17")
    private Integer b17;

    @TableField("B18")
    private Integer b18;

    @TableField("B19")
    private Integer b19;

    @TableField("B20")
    private Integer b20;

    @TableField("B21")
    private Integer b21;

    @TableField("B22")
    private Integer b22;

    @TableField("B23")
    private Integer b23;

    @TableField("B24")
    private Integer b24;

    @TableField("B25")
    private Integer b25;


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

    public Integer getb1() {
        return b1;
    }

    public void setb1(Integer b1) {
        this.b1 = b1;
    }

    public Integer getb2() {
        return b2;
    }

    public void setb2(Integer b2) {
        this.b2 = b2;
    }

    public Integer getb3() {
        return b3;
    }

    public void setb3(Integer b3) {
        this.b3 = b3;
    }

    public Integer getb4() {
        return b4;
    }

    public void setb4(Integer b4) {
        this.b4 = b4;
    }

    public Integer getb5() {
        return b5;
    }

    public void setb5(Integer b5) {
        this.b5 = b5;
    }

    public Integer getb6() {
        return b6;
    }

    public void setb6(Integer b6) {
        this.b6 = b6;
    }

    public Integer getb7() {
        return b7;
    }

    public void setb7(Integer b7) {
        this.b7 = b7;
    }

    public Integer getb8() {
        return b8;
    }

    public void setb8(Integer b8) {
        this.b8 = b8;
    }

    public Integer getb9() {
        return b9;
    }

    public void setb9(Integer b9) {
        this.b9 = b9;
    }

    public Integer getb10() {
        return b10;
    }

    public void setb10(Integer b10) {
        this.b10 = b10;
    }

    public Integer getb11() {
        return b11;
    }

    public void setb11(Integer b11) {
        this.b11 = b11;
    }

    public Integer getb12() {
        return b12;
    }

    public void setb12(Integer b12) {
        this.b12 = b12;
    }

    public Integer getb13() {
        return b13;
    }

    public void setb13(Integer b13) {
        this.b13 = b13;
    }

    public Integer getb14() {
        return b14;
    }

    public void setb14(Integer b14) {
        this.b14 = b14;
    }

    public Integer getb15() {
        return b15;
    }

    public void setb15(Integer b15) {
        this.b15 = b15;
    }

    public Integer getb16() {
        return b16;
    }

    public void setb16(Integer b16) {
        this.b16 = b16;
    }

    public Integer getb17() {
        return b17;
    }

    public void setb17(Integer b17) {
        this.b17 = b17;
    }

    public Integer getb18() {
        return b18;
    }

    public void setb18(Integer b18) {
        this.b18 = b18;
    }

    public Integer getb19() {
        return b19;
    }

    public void setb19(Integer b19) {
        this.b19 = b19;
    }

    public Integer getb20() {
        return b20;
    }

    public void setb20(Integer b20) {
        this.b20 = b20;
    }

    public Integer getb21() {
        return b21;
    }

    public void setb21(Integer b21) {
        this.b21 = b21;
    }

    public Integer getb22() {
        return b22;
    }

    public void setb22(Integer b22) {
        this.b22 = b22;
    }

    public Integer getb23() {
        return b23;
    }

    public void setb23(Integer b23) {
        this.b23 = b23;
    }

    public Integer getb24() {
        return b24;
    }

    public void setb24(Integer b24) {
        this.b24 = b24;
    }

    public Integer getb25() {
        return b25;
    }

    public void setb25(Integer b25) {
        this.b25 = b25;
    }

    @Override
    public String toString() {
        return "Rainmodify1hourForecast{" +
        "ldate=" + ldate +
        ", ltime=" + ltime +
        ", b1=" + b1 +
        ", b2=" + b2 +
        ", b3=" + b3 +
        ", b4=" + b4 +
        ", b5=" + b5 +
        ", b6=" + b6 +
        ", b7=" + b7 +
        ", b8=" + b8 +
        ", b9=" + b9 +
        ", b10=" + b10 +
        ", b11=" + b11 +
        ", b12=" + b12 +
        ", b13=" + b13 +
        ", b14=" + b14 +
        ", b15=" + b15 +
        ", b16=" + b16 +
        ", b17=" + b17 +
        ", b18=" + b18 +
        ", b19=" + b19 +
        ", b20=" + b20 +
        ", b21=" + b21 +
        ", b22=" + b22 +
        ", b23=" + b23 +
        ", b24=" + b24 +
        ", b25=" + b25 +
        "}";
    }
}

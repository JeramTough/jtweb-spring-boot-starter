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
@TableName("WaterLevel_1Hour_real")
@ApiModel(value="Waterlevel1hourReal对象", description="")
public class Waterlevel1hourRealDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableId("Ldate")
    private String ldate;

    @TableField("B1")
    private Double b1;

    @TableField("B2")
    private Double b2;

    @TableField("B3")
    private Double b3;

    @TableField("B4")
    private Double b4;

    @TableField("B5")
    private Double b5;

    @TableField("B6")
    private Double b6;

    @TableField("B7")
    private Double b7;

    @TableField("B8")
    private Double b8;

    @TableField("B9")
    private Double b9;

    @TableField("B10")
    private Double b10;

    @TableField("B11")
    private Double b11;

    @TableField("B12")
    private Double b12;

    @TableField("B13")
    private Double b13;

    @TableField("B14")
    private Double b14;

    @TableField("B15")
    private Double b15;

    @TableField("B16")
    private Double b16;

    @TableField("B17")
    private Double b17;

    @TableField("B18")
    private Double b18;

    @TableField("B19")
    private Double b19;

    @TableField("B20")
    private Double b20;

    @TableField("B21")
    private Double b21;

    @TableField("B22")
    private Double b22;

    @TableField("B23")
    private Double b23;

    @TableField("B24")
    private Double b24;

    @TableField("B25")
    private Double b25;


    public String getLdate() {
        return ldate;
    }

    public void setLdate(String ldate) {
        this.ldate = ldate;
    }

    public Double getb1() {
        return b1;
    }

    public void setb1(Double b1) {
        this.b1 = b1;
    }

    public Double getb2() {
        return b2;
    }

    public void setb2(Double b2) {
        this.b2 = b2;
    }

    public Double getb3() {
        return b3;
    }

    public void setb3(Double b3) {
        this.b3 = b3;
    }

    public Double getb4() {
        return b4;
    }

    public void setb4(Double b4) {
        this.b4 = b4;
    }

    public Double getb5() {
        return b5;
    }

    public void setb5(Double b5) {
        this.b5 = b5;
    }

    public Double getb6() {
        return b6;
    }

    public void setb6(Double b6) {
        this.b6 = b6;
    }

    public Double getb7() {
        return b7;
    }

    public void setb7(Double b7) {
        this.b7 = b7;
    }

    public Double getb8() {
        return b8;
    }

    public void setb8(Double b8) {
        this.b8 = b8;
    }

    public Double getb9() {
        return b9;
    }

    public void setb9(Double b9) {
        this.b9 = b9;
    }

    public Double getb10() {
        return b10;
    }

    public void setb10(Double b10) {
        this.b10 = b10;
    }

    public Double getb11() {
        return b11;
    }

    public void setb11(Double b11) {
        this.b11 = b11;
    }

    public Double getb12() {
        return b12;
    }

    public void setb12(Double b12) {
        this.b12 = b12;
    }

    public Double getb13() {
        return b13;
    }

    public void setb13(Double b13) {
        this.b13 = b13;
    }

    public Double getb14() {
        return b14;
    }

    public void setb14(Double b14) {
        this.b14 = b14;
    }

    public Double getb15() {
        return b15;
    }

    public void setb15(Double b15) {
        this.b15 = b15;
    }

    public Double getb16() {
        return b16;
    }

    public void setb16(Double b16) {
        this.b16 = b16;
    }

    public Double getb17() {
        return b17;
    }

    public void setb17(Double b17) {
        this.b17 = b17;
    }

    public Double getb18() {
        return b18;
    }

    public void setb18(Double b18) {
        this.b18 = b18;
    }

    public Double getb19() {
        return b19;
    }

    public void setb19(Double b19) {
        this.b19 = b19;
    }

    public Double getb20() {
        return b20;
    }

    public void setb20(Double b20) {
        this.b20 = b20;
    }

    public Double getb21() {
        return b21;
    }

    public void setb21(Double b21) {
        this.b21 = b21;
    }

    public Double getb22() {
        return b22;
    }

    public void setb22(Double b22) {
        this.b22 = b22;
    }

    public Double getb23() {
        return b23;
    }

    public void setb23(Double b23) {
        this.b23 = b23;
    }

    public Double getb24() {
        return b24;
    }

    public void setb24(Double b24) {
        this.b24 = b24;
    }

    public Double getb25() {
        return b25;
    }

    public void setb25(Double b25) {
        this.b25 = b25;
    }

    @Override
    public String toString() {
        return "Waterlevel1hourReal{" +
        "ldate=" + ldate +
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

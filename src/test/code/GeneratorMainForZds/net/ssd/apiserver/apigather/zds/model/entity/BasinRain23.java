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
@TableName("Basin_rain23")
@ApiModel(value="BasinRain23对象", description="")
public class BasinRain23 implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId("lDate")
    private String ldate;

    @TableField("A1")
    private Integer a1;

    @TableField("A2")
    private Integer a2;

    @TableField("A3")
    private Integer a3;

    @TableField("A4")
    private Integer a4;

    @TableField("A5")
    private Integer a5;

    @TableField("A6")
    private Integer a6;

    @TableField("A7")
    private Integer a7;

    @TableField("A8")
    private Integer a8;

    @TableField("A9")
    private Integer a9;

    @TableField("A10")
    private Integer a10;

    @TableField("A11")
    private Integer a11;

    @TableField("A12")
    private Integer a12;

    @TableField("A13")
    private Integer a13;

    @TableField("A14")
    private Integer a14;

    @TableField("A15")
    private Integer a15;

    @TableField("A16")
    private Integer a16;

    @TableField("A17")
    private Integer a17;

    @TableField("A18")
    private Integer a18;

    @TableField("A19")
    private Integer a19;

    @TableField("A20")
    private Integer a20;

    @TableField("A21")
    private Integer a21;

    @TableField("A22")
    private Integer a22;

    @TableField("A23")
    private Integer a23;

    @TableField("A24")
    private Integer a24;


    public String getLdate() {
        return ldate;
    }

    public void setLdate(String ldate) {
        this.ldate = ldate;
    }

    public Integer geta1() {
        return a1;
    }

    public void seta1(Integer a1) {
        this.a1 = a1;
    }

    public Integer geta2() {
        return a2;
    }

    public void seta2(Integer a2) {
        this.a2 = a2;
    }

    public Integer geta3() {
        return a3;
    }

    public void seta3(Integer a3) {
        this.a3 = a3;
    }

    public Integer geta4() {
        return a4;
    }

    public void seta4(Integer a4) {
        this.a4 = a4;
    }

    public Integer geta5() {
        return a5;
    }

    public void seta5(Integer a5) {
        this.a5 = a5;
    }

    public Integer geta6() {
        return a6;
    }

    public void seta6(Integer a6) {
        this.a6 = a6;
    }

    public Integer geta7() {
        return a7;
    }

    public void seta7(Integer a7) {
        this.a7 = a7;
    }

    public Integer geta8() {
        return a8;
    }

    public void seta8(Integer a8) {
        this.a8 = a8;
    }

    public Integer geta9() {
        return a9;
    }

    public void seta9(Integer a9) {
        this.a9 = a9;
    }

    public Integer geta10() {
        return a10;
    }

    public void seta10(Integer a10) {
        this.a10 = a10;
    }

    public Integer geta11() {
        return a11;
    }

    public void seta11(Integer a11) {
        this.a11 = a11;
    }

    public Integer geta12() {
        return a12;
    }

    public void seta12(Integer a12) {
        this.a12 = a12;
    }

    public Integer geta13() {
        return a13;
    }

    public void seta13(Integer a13) {
        this.a13 = a13;
    }

    public Integer geta14() {
        return a14;
    }

    public void seta14(Integer a14) {
        this.a14 = a14;
    }

    public Integer geta15() {
        return a15;
    }

    public void seta15(Integer a15) {
        this.a15 = a15;
    }

    public Integer geta16() {
        return a16;
    }

    public void seta16(Integer a16) {
        this.a16 = a16;
    }

    public Integer geta17() {
        return a17;
    }

    public void seta17(Integer a17) {
        this.a17 = a17;
    }

    public Integer geta18() {
        return a18;
    }

    public void seta18(Integer a18) {
        this.a18 = a18;
    }

    public Integer geta19() {
        return a19;
    }

    public void seta19(Integer a19) {
        this.a19 = a19;
    }

    public Integer geta20() {
        return a20;
    }

    public void seta20(Integer a20) {
        this.a20 = a20;
    }

    public Integer geta21() {
        return a21;
    }

    public void seta21(Integer a21) {
        this.a21 = a21;
    }

    public Integer geta22() {
        return a22;
    }

    public void seta22(Integer a22) {
        this.a22 = a22;
    }

    public Integer geta23() {
        return a23;
    }

    public void seta23(Integer a23) {
        this.a23 = a23;
    }

    public Integer geta24() {
        return a24;
    }

    public void seta24(Integer a24) {
        this.a24 = a24;
    }

    @Override
    public String toString() {
        return "BasinRain23{" +
        "ldate=" + ldate +
        ", a1=" + a1 +
        ", a2=" + a2 +
        ", a3=" + a3 +
        ", a4=" + a4 +
        ", a5=" + a5 +
        ", a6=" + a6 +
        ", a7=" + a7 +
        ", a8=" + a8 +
        ", a9=" + a9 +
        ", a10=" + a10 +
        ", a11=" + a11 +
        ", a12=" + a12 +
        ", a13=" + a13 +
        ", a14=" + a14 +
        ", a15=" + a15 +
        ", a16=" + a16 +
        ", a17=" + a17 +
        ", a18=" + a18 +
        ", a19=" + a19 +
        ", a20=" + a20 +
        ", a21=" + a21 +
        ", a22=" + a22 +
        ", a23=" + a23 +
        ", a24=" + a24 +
        "}";
    }
}

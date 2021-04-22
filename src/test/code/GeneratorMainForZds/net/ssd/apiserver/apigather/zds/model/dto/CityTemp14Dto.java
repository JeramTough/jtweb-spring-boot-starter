package net.ssd.apiserver.apigather.zds.model.entity;

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
@ApiModel(value="CityTemp14对象", description="")
public class CityTemp14Dto implements Serializable{

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

    @Override
    public String toString() {
        return "CityTemp14{" +
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
        "}";
    }
}

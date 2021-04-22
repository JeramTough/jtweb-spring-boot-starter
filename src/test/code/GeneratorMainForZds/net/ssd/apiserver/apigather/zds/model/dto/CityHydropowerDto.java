package net.ssd.apiserver.apigather.zds.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("city_Hydropower")
@ApiModel(value="CityHydropower对象", description="")
public class CityHydropowerDto implements Serializable{

    private static final long serialVersionUID=1L;

    private String ldate;

    private Integer a1;

    private Integer a2;

    private Integer a3;

    private Integer a4;

    private Integer a5;

    private Integer a6;

    private Integer a7;

    private Integer a8;

    private Integer a9;

    private Integer a10;

    private Integer a11;

    private Integer a12;

    private Integer a13;

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
        return "CityHydropower{" +
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

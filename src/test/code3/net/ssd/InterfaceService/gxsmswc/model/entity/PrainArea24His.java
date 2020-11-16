package net.ssd.InterfaceService.gxsmswc.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author JeramTough
 * @since 2020-09-16
 */
@ApiModel(value="PrainArea24His对象", description="")
public class PrainArea24His implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "数据类型：forecast预报数据；anomaly距平值数据（%）")
    private String dataType;

    @ApiModelProperty(value = "产品预报的日期：旬（2019061）、月（201906）、季（20192）、年（2019）")
    private String proDate;

    @ApiModelProperty(value = "产品类型：旬（decad）、月（month）、季（quarter）、年（year）")
    private String proType;

    @ApiModelProperty(value = "制作时间")
    private LocalDateTime makeTime;

    private String a12;

    private String a6;

    private String a3;

    private String a20;

    private String a9;

    private String a23;

    private String a14;

    private String a8;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String a17;

    private String a5;

    private String a11;

    private String a16;

    private String a10;

    private String a22;

    private String a13;

    private String a19;

    private String a2;

    private String a18;

    private String a4;

    private String a24;

    private String a1;

    private String a15;

    private String a7;

    private String a21;


    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getProDate() {
        return proDate;
    }

    public void setProDate(String proDate) {
        this.proDate = proDate;
    }

    public String getProType() {
        return proType;
    }

    public void setProType(String proType) {
        this.proType = proType;
    }

    public LocalDateTime getMakeTime() {
        return makeTime;
    }

    public void setMakeTime(LocalDateTime makeTime) {
        this.makeTime = makeTime;
    }

    public String getA12() {
        return a12;
    }

    public void setA12(String a12) {
        this.a12 = a12;
    }

    public String getA6() {
        return a6;
    }

    public void setA6(String a6) {
        this.a6 = a6;
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    public String getA20() {
        return a20;
    }

    public void setA20(String a20) {
        this.a20 = a20;
    }

    public String getA9() {
        return a9;
    }

    public void setA9(String a9) {
        this.a9 = a9;
    }

    public String getA23() {
        return a23;
    }

    public void setA23(String a23) {
        this.a23 = a23;
    }

    public String getA14() {
        return a14;
    }

    public void setA14(String a14) {
        this.a14 = a14;
    }

    public String getA8() {
        return a8;
    }

    public void setA8(String a8) {
        this.a8 = a8;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getA17() {
        return a17;
    }

    public void setA17(String a17) {
        this.a17 = a17;
    }

    public String getA5() {
        return a5;
    }

    public void setA5(String a5) {
        this.a5 = a5;
    }

    public String getA11() {
        return a11;
    }

    public void setA11(String a11) {
        this.a11 = a11;
    }

    public String getA16() {
        return a16;
    }

    public void setA16(String a16) {
        this.a16 = a16;
    }

    public String getA10() {
        return a10;
    }

    public void setA10(String a10) {
        this.a10 = a10;
    }

    public String getA22() {
        return a22;
    }

    public void setA22(String a22) {
        this.a22 = a22;
    }

    public String getA13() {
        return a13;
    }

    public void setA13(String a13) {
        this.a13 = a13;
    }

    public String getA19() {
        return a19;
    }

    public void setA19(String a19) {
        this.a19 = a19;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public String getA18() {
        return a18;
    }

    public void setA18(String a18) {
        this.a18 = a18;
    }

    public String getA4() {
        return a4;
    }

    public void setA4(String a4) {
        this.a4 = a4;
    }

    public String getA24() {
        return a24;
    }

    public void setA24(String a24) {
        this.a24 = a24;
    }

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public String getA15() {
        return a15;
    }

    public void setA15(String a15) {
        this.a15 = a15;
    }

    public String getA7() {
        return a7;
    }

    public void setA7(String a7) {
        this.a7 = a7;
    }

    public String getA21() {
        return a21;
    }

    public void setA21(String a21) {
        this.a21 = a21;
    }

    @Override
    public String toString() {
        return "PrainArea24His{" +
        "dataType=" + dataType +
        ", proDate=" + proDate +
        ", proType=" + proType +
        ", makeTime=" + makeTime +
        ", a12=" + a12 +
        ", a6=" + a6 +
        ", a3=" + a3 +
        ", a20=" + a20 +
        ", a9=" + a9 +
        ", a23=" + a23 +
        ", a14=" + a14 +
        ", a8=" + a8 +
        ", id=" + id +
        ", a17=" + a17 +
        ", a5=" + a5 +
        ", a11=" + a11 +
        ", a16=" + a16 +
        ", a10=" + a10 +
        ", a22=" + a22 +
        ", a13=" + a13 +
        ", a19=" + a19 +
        ", a2=" + a2 +
        ", a18=" + a18 +
        ", a4=" + a4 +
        ", a24=" + a24 +
        ", a1=" + a1 +
        ", a15=" + a15 +
        ", a7=" + a7 +
        ", a21=" + a21 +
        "}";
    }
}

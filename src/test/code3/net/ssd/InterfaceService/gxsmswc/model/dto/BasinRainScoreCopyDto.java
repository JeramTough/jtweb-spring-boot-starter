package net.ssd.InterfaceService.gxsmswc.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
 * @author JeramTough
 * @since 2020-09-16
 */
@ApiModel(value="BasinRainScoreCopy对象", description="")
public class BasinRainScoreCopyDto implements Serializable{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "月份（yyyy-MM）")
    private String month;

    @ApiModelProperty(value = "数据类型：（08、20）")
    private String ltime;

    @ApiModelProperty(value = "预报数据类型（24、48、72、96、120）")
    private String ltype;

    @ApiModelProperty(value = "分数类型：S1（一般性面雨量分数），S2（大雨以上面雨量分数）")
    private String stype;

    @TableField("A42")
    private Float a42;

    @TableField("A48")
    private Float a48;

    @TableField("A82")
    private Float a82;

    @TableField("A34")
    private Float a34;

    @TableField("A88")
    private Float a88;

    @TableField("A8")
    private Float a8;

    @TableField("A51")
    private Float a51;

    @TableField("A2")
    private Float a2;

    @TableField("A28")
    private Float a28;

    @TableField("A22")
    private Float a22;

    @TableField("A71")
    private Float a71;

    @TableField("A65")
    private Float a65;

    @TableField("A85")
    private Float a85;

    @TableField("A45")
    private Float a45;

    @TableField("A91")
    private Float a91;

    @TableField("A54")
    private Float a54;

    @TableField("A31")
    private Float a31;

    @TableField("A74")
    private Float a74;

    @TableField("A5")
    private Float a5;

    @TableField("A25")
    private Float a25;

    @TableField("A11")
    private Float a11;

    @TableField("A62")
    private Float a62;

    @TableField("A68")
    private Float a68;

    @TableField("A46")
    private Float a46;

    @TableField("A86")
    private Float a86;

    @TableField("A40")
    private Float a40;

    @TableField("A6")
    private Float a6;

    @TableField("A57")
    private Float a57;

    @TableField("A26")
    private Float a26;

    @TableField("A77")
    private Float a77;

    @TableField("A63")
    private Float a63;

    @TableField("A69")
    private Float a69;

    @TableField("A14")
    private Float a14;

    @TableField("A66")
    private Float a66;

    @TableField("A43")
    private Float a43;

    @TableField("A20")
    private Float a20;

    @TableField("A37")
    private Float a37;

    @TableField("A49")
    private Float a49;

    @TableField("A83")
    private Float a83;

    @TableField("A89")
    private Float a89;

    @TableField("A80")
    private Float a80;

    @TableField("A29")
    private Float a29;

    @TableField("A3")
    private Float a3;

    @TableField("A60")
    private Float a60;

    @TableField("A23")
    private Float a23;

    @TableField("A17")
    private Float a17;

    @TableField("A44")
    private Float a44;

    @TableField("A21")
    private Float a21;

    @TableField("A84")
    private Float a84;

    @TableField("A38")
    private Float a38;

    @TableField("A55")
    private Float a55;

    @TableField("A32")
    private Float a32;

    @TableField("A75")
    private Float a75;

    @TableField("A81")
    private Float a81;

    @TableField("A12")
    private Float a12;

    @TableField("A24")
    private Float a24;

    @TableField("A61")
    private Float a61;

    @TableField("A18")
    private Float a18;

    @TableField("A1")
    private Float a1;

    @TableField("A35")
    private Float a35;

    @TableField("A41")
    private Float a41;

    @TableField("A78")
    private Float a78;

    @TableField("A9")
    private Float a9;

    @TableField("A52")
    private Float a52;

    @TableField("A72")
    private Float a72;

    @TableField("A58")
    private Float a58;

    @TableField("A15")
    private Float a15;

    @TableField("A64")
    private Float a64;

    @TableField("A19")
    private Float a19;

    @TableField("A90")
    private Float a90;

    @TableField("A67")
    private Float a67;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("A36")
    private Float a36;

    @TableField("A30")
    private Float a30;

    @TableField("A79")
    private Float a79;

    @TableField("A4")
    private Float a4;

    @TableField("A53")
    private Float a53;

    @TableField("A73")
    private Float a73;

    @TableField("A59")
    private Float a59;

    @TableField("A10")
    private Float a10;

    @TableField("A16")
    private Float a16;

    @TableField("A47")
    private Float a47;

    @TableField("A87")
    private Float a87;

    @TableField("A39")
    private Float a39;

    @TableField("A7")
    private Float a7;

    @TableField("A56")
    private Float a56;

    @TableField("A33")
    private Float a33;

    @TableField("A50")
    private Float a50;

    @TableField("A27")
    private Float a27;

    @TableField("A76")
    private Float a76;

    @TableField("A13")
    private Float a13;

    @TableField("A70")
    private Float a70;


    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getLtime() {
        return ltime;
    }

    public void setLtime(String ltime) {
        this.ltime = ltime;
    }

    public String getLtype() {
        return ltype;
    }

    public void setLtype(String ltype) {
        this.ltype = ltype;
    }

    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype;
    }

    public Float getA42() {
        return a42;
    }

    public void setA42(Float a42) {
        this.a42 = a42;
    }

    public Float getA48() {
        return a48;
    }

    public void setA48(Float a48) {
        this.a48 = a48;
    }

    public Float getA82() {
        return a82;
    }

    public void setA82(Float a82) {
        this.a82 = a82;
    }

    public Float getA34() {
        return a34;
    }

    public void setA34(Float a34) {
        this.a34 = a34;
    }

    public Float getA88() {
        return a88;
    }

    public void setA88(Float a88) {
        this.a88 = a88;
    }

    public Float getA8() {
        return a8;
    }

    public void setA8(Float a8) {
        this.a8 = a8;
    }

    public Float getA51() {
        return a51;
    }

    public void setA51(Float a51) {
        this.a51 = a51;
    }

    public Float getA2() {
        return a2;
    }

    public void setA2(Float a2) {
        this.a2 = a2;
    }

    public Float getA28() {
        return a28;
    }

    public void setA28(Float a28) {
        this.a28 = a28;
    }

    public Float getA22() {
        return a22;
    }

    public void setA22(Float a22) {
        this.a22 = a22;
    }

    public Float getA71() {
        return a71;
    }

    public void setA71(Float a71) {
        this.a71 = a71;
    }

    public Float getA65() {
        return a65;
    }

    public void setA65(Float a65) {
        this.a65 = a65;
    }

    public Float getA85() {
        return a85;
    }

    public void setA85(Float a85) {
        this.a85 = a85;
    }

    public Float getA45() {
        return a45;
    }

    public void setA45(Float a45) {
        this.a45 = a45;
    }

    public Float getA91() {
        return a91;
    }

    public void setA91(Float a91) {
        this.a91 = a91;
    }

    public Float getA54() {
        return a54;
    }

    public void setA54(Float a54) {
        this.a54 = a54;
    }

    public Float getA31() {
        return a31;
    }

    public void setA31(Float a31) {
        this.a31 = a31;
    }

    public Float getA74() {
        return a74;
    }

    public void setA74(Float a74) {
        this.a74 = a74;
    }

    public Float getA5() {
        return a5;
    }

    public void setA5(Float a5) {
        this.a5 = a5;
    }

    public Float getA25() {
        return a25;
    }

    public void setA25(Float a25) {
        this.a25 = a25;
    }

    public Float getA11() {
        return a11;
    }

    public void setA11(Float a11) {
        this.a11 = a11;
    }

    public Float getA62() {
        return a62;
    }

    public void setA62(Float a62) {
        this.a62 = a62;
    }

    public Float getA68() {
        return a68;
    }

    public void setA68(Float a68) {
        this.a68 = a68;
    }

    public Float getA46() {
        return a46;
    }

    public void setA46(Float a46) {
        this.a46 = a46;
    }

    public Float getA86() {
        return a86;
    }

    public void setA86(Float a86) {
        this.a86 = a86;
    }

    public Float getA40() {
        return a40;
    }

    public void setA40(Float a40) {
        this.a40 = a40;
    }

    public Float getA6() {
        return a6;
    }

    public void setA6(Float a6) {
        this.a6 = a6;
    }

    public Float getA57() {
        return a57;
    }

    public void setA57(Float a57) {
        this.a57 = a57;
    }

    public Float getA26() {
        return a26;
    }

    public void setA26(Float a26) {
        this.a26 = a26;
    }

    public Float getA77() {
        return a77;
    }

    public void setA77(Float a77) {
        this.a77 = a77;
    }

    public Float getA63() {
        return a63;
    }

    public void setA63(Float a63) {
        this.a63 = a63;
    }

    public Float getA69() {
        return a69;
    }

    public void setA69(Float a69) {
        this.a69 = a69;
    }

    public Float getA14() {
        return a14;
    }

    public void setA14(Float a14) {
        this.a14 = a14;
    }

    public Float getA66() {
        return a66;
    }

    public void setA66(Float a66) {
        this.a66 = a66;
    }

    public Float getA43() {
        return a43;
    }

    public void setA43(Float a43) {
        this.a43 = a43;
    }

    public Float getA20() {
        return a20;
    }

    public void setA20(Float a20) {
        this.a20 = a20;
    }

    public Float getA37() {
        return a37;
    }

    public void setA37(Float a37) {
        this.a37 = a37;
    }

    public Float getA49() {
        return a49;
    }

    public void setA49(Float a49) {
        this.a49 = a49;
    }

    public Float getA83() {
        return a83;
    }

    public void setA83(Float a83) {
        this.a83 = a83;
    }

    public Float getA89() {
        return a89;
    }

    public void setA89(Float a89) {
        this.a89 = a89;
    }

    public Float getA80() {
        return a80;
    }

    public void setA80(Float a80) {
        this.a80 = a80;
    }

    public Float getA29() {
        return a29;
    }

    public void setA29(Float a29) {
        this.a29 = a29;
    }

    public Float getA3() {
        return a3;
    }

    public void setA3(Float a3) {
        this.a3 = a3;
    }

    public Float getA60() {
        return a60;
    }

    public void setA60(Float a60) {
        this.a60 = a60;
    }

    public Float getA23() {
        return a23;
    }

    public void setA23(Float a23) {
        this.a23 = a23;
    }

    public Float getA17() {
        return a17;
    }

    public void setA17(Float a17) {
        this.a17 = a17;
    }

    public Float getA44() {
        return a44;
    }

    public void setA44(Float a44) {
        this.a44 = a44;
    }

    public Float getA21() {
        return a21;
    }

    public void setA21(Float a21) {
        this.a21 = a21;
    }

    public Float getA84() {
        return a84;
    }

    public void setA84(Float a84) {
        this.a84 = a84;
    }

    public Float getA38() {
        return a38;
    }

    public void setA38(Float a38) {
        this.a38 = a38;
    }

    public Float getA55() {
        return a55;
    }

    public void setA55(Float a55) {
        this.a55 = a55;
    }

    public Float getA32() {
        return a32;
    }

    public void setA32(Float a32) {
        this.a32 = a32;
    }

    public Float getA75() {
        return a75;
    }

    public void setA75(Float a75) {
        this.a75 = a75;
    }

    public Float getA81() {
        return a81;
    }

    public void setA81(Float a81) {
        this.a81 = a81;
    }

    public Float getA12() {
        return a12;
    }

    public void setA12(Float a12) {
        this.a12 = a12;
    }

    public Float getA24() {
        return a24;
    }

    public void setA24(Float a24) {
        this.a24 = a24;
    }

    public Float getA61() {
        return a61;
    }

    public void setA61(Float a61) {
        this.a61 = a61;
    }

    public Float getA18() {
        return a18;
    }

    public void setA18(Float a18) {
        this.a18 = a18;
    }

    public Float getA1() {
        return a1;
    }

    public void setA1(Float a1) {
        this.a1 = a1;
    }

    public Float getA35() {
        return a35;
    }

    public void setA35(Float a35) {
        this.a35 = a35;
    }

    public Float getA41() {
        return a41;
    }

    public void setA41(Float a41) {
        this.a41 = a41;
    }

    public Float getA78() {
        return a78;
    }

    public void setA78(Float a78) {
        this.a78 = a78;
    }

    public Float getA9() {
        return a9;
    }

    public void setA9(Float a9) {
        this.a9 = a9;
    }

    public Float getA52() {
        return a52;
    }

    public void setA52(Float a52) {
        this.a52 = a52;
    }

    public Float getA72() {
        return a72;
    }

    public void setA72(Float a72) {
        this.a72 = a72;
    }

    public Float getA58() {
        return a58;
    }

    public void setA58(Float a58) {
        this.a58 = a58;
    }

    public Float getA15() {
        return a15;
    }

    public void setA15(Float a15) {
        this.a15 = a15;
    }

    public Float getA64() {
        return a64;
    }

    public void setA64(Float a64) {
        this.a64 = a64;
    }

    public Float getA19() {
        return a19;
    }

    public void setA19(Float a19) {
        this.a19 = a19;
    }

    public Float getA90() {
        return a90;
    }

    public void setA90(Float a90) {
        this.a90 = a90;
    }

    public Float getA67() {
        return a67;
    }

    public void setA67(Float a67) {
        this.a67 = a67;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getA36() {
        return a36;
    }

    public void setA36(Float a36) {
        this.a36 = a36;
    }

    public Float getA30() {
        return a30;
    }

    public void setA30(Float a30) {
        this.a30 = a30;
    }

    public Float getA79() {
        return a79;
    }

    public void setA79(Float a79) {
        this.a79 = a79;
    }

    public Float getA4() {
        return a4;
    }

    public void setA4(Float a4) {
        this.a4 = a4;
    }

    public Float getA53() {
        return a53;
    }

    public void setA53(Float a53) {
        this.a53 = a53;
    }

    public Float getA73() {
        return a73;
    }

    public void setA73(Float a73) {
        this.a73 = a73;
    }

    public Float getA59() {
        return a59;
    }

    public void setA59(Float a59) {
        this.a59 = a59;
    }

    public Float getA10() {
        return a10;
    }

    public void setA10(Float a10) {
        this.a10 = a10;
    }

    public Float getA16() {
        return a16;
    }

    public void setA16(Float a16) {
        this.a16 = a16;
    }

    public Float getA47() {
        return a47;
    }

    public void setA47(Float a47) {
        this.a47 = a47;
    }

    public Float getA87() {
        return a87;
    }

    public void setA87(Float a87) {
        this.a87 = a87;
    }

    public Float getA39() {
        return a39;
    }

    public void setA39(Float a39) {
        this.a39 = a39;
    }

    public Float getA7() {
        return a7;
    }

    public void setA7(Float a7) {
        this.a7 = a7;
    }

    public Float getA56() {
        return a56;
    }

    public void setA56(Float a56) {
        this.a56 = a56;
    }

    public Float getA33() {
        return a33;
    }

    public void setA33(Float a33) {
        this.a33 = a33;
    }

    public Float getA50() {
        return a50;
    }

    public void setA50(Float a50) {
        this.a50 = a50;
    }

    public Float getA27() {
        return a27;
    }

    public void setA27(Float a27) {
        this.a27 = a27;
    }

    public Float getA76() {
        return a76;
    }

    public void setA76(Float a76) {
        this.a76 = a76;
    }

    public Float getA13() {
        return a13;
    }

    public void setA13(Float a13) {
        this.a13 = a13;
    }

    public Float getA70() {
        return a70;
    }

    public void setA70(Float a70) {
        this.a70 = a70;
    }

    @Override
    public String toString() {
        return "BasinRainScoreCopy{" +
        "month=" + month +
        ", ltime=" + ltime +
        ", ltype=" + ltype +
        ", stype=" + stype +
        ", a42=" + a42 +
        ", a48=" + a48 +
        ", a82=" + a82 +
        ", a34=" + a34 +
        ", a88=" + a88 +
        ", a8=" + a8 +
        ", a51=" + a51 +
        ", a2=" + a2 +
        ", a28=" + a28 +
        ", a22=" + a22 +
        ", a71=" + a71 +
        ", a65=" + a65 +
        ", a85=" + a85 +
        ", a45=" + a45 +
        ", a91=" + a91 +
        ", a54=" + a54 +
        ", a31=" + a31 +
        ", a74=" + a74 +
        ", a5=" + a5 +
        ", a25=" + a25 +
        ", a11=" + a11 +
        ", a62=" + a62 +
        ", a68=" + a68 +
        ", a46=" + a46 +
        ", a86=" + a86 +
        ", a40=" + a40 +
        ", a6=" + a6 +
        ", a57=" + a57 +
        ", a26=" + a26 +
        ", a77=" + a77 +
        ", a63=" + a63 +
        ", a69=" + a69 +
        ", a14=" + a14 +
        ", a66=" + a66 +
        ", a43=" + a43 +
        ", a20=" + a20 +
        ", a37=" + a37 +
        ", a49=" + a49 +
        ", a83=" + a83 +
        ", a89=" + a89 +
        ", a80=" + a80 +
        ", a29=" + a29 +
        ", a3=" + a3 +
        ", a60=" + a60 +
        ", a23=" + a23 +
        ", a17=" + a17 +
        ", a44=" + a44 +
        ", a21=" + a21 +
        ", a84=" + a84 +
        ", a38=" + a38 +
        ", a55=" + a55 +
        ", a32=" + a32 +
        ", a75=" + a75 +
        ", a81=" + a81 +
        ", a12=" + a12 +
        ", a24=" + a24 +
        ", a61=" + a61 +
        ", a18=" + a18 +
        ", a1=" + a1 +
        ", a35=" + a35 +
        ", a41=" + a41 +
        ", a78=" + a78 +
        ", a9=" + a9 +
        ", a52=" + a52 +
        ", a72=" + a72 +
        ", a58=" + a58 +
        ", a15=" + a15 +
        ", a64=" + a64 +
        ", a19=" + a19 +
        ", a90=" + a90 +
        ", a67=" + a67 +
        ", id=" + id +
        ", a36=" + a36 +
        ", a30=" + a30 +
        ", a79=" + a79 +
        ", a4=" + a4 +
        ", a53=" + a53 +
        ", a73=" + a73 +
        ", a59=" + a59 +
        ", a10=" + a10 +
        ", a16=" + a16 +
        ", a47=" + a47 +
        ", a87=" + a87 +
        ", a39=" + a39 +
        ", a7=" + a7 +
        ", a56=" + a56 +
        ", a33=" + a33 +
        ", a50=" + a50 +
        ", a27=" + a27 +
        ", a76=" + a76 +
        ", a13=" + a13 +
        ", a70=" + a70 +
        "}";
    }
}

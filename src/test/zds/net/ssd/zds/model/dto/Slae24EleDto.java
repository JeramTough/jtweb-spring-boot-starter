package net.ssd.zds.model.entity;

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
 * @author JeramTough
 * @since 2021-04-25
 */
@TableName("SLAE24_ELE")
@ApiModel(value="Slae24Ele对象", description="")
public class Slae24EleDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableId("LDATE")
    private String ldate;

    @TableField("LTIME")
    private String ltime;

    @TableField("V59431")
    private Double v59431;

    @TableField("V57859")
    private Double v57859;

    @TableField("V57960")
    private Double v57960;

    @TableField("V57942")
    private Double v57942;

    @TableField("V57956")
    private Double v57956;

    @TableField("V57954")
    private Double v57954;

    @TableField("V57957")
    private Double v57957;

    @TableField("V57955")
    private Double v57955;

    @TableField("V57964")
    private Double v57964;

    @TableField("V57949")
    private Double v57949;

    @TableField("V59051")
    private Double v59051;

    @TableField("V59052")
    private Double v59052;

    @TableField("V59055")
    private Double v59055;

    @TableField("V59053")
    private Double v59053;

    @TableField("V59061")
    private Double v59061;

    @TableField("V59064")
    private Double v59064;

    @TableField("V59065")
    private Double v59065;

    @TableField("V59059")
    private Double v59059;

    @TableField("V59058")
    private Double v59058;

    @TableField("V59265")
    private Double v59265;

    @TableField("V59266")
    private Double v59266;

    @TableField("V59256")
    private Double v59256;

    @TableField("V59454")
    private Double v59454;

    @TableField("V57941")
    private Double v57941;

    @TableField("V57947")
    private Double v57947;

    @TableField("V57948")
    private Double v57948;

    @TableField("V59045")
    private Double v59045;

    @TableField("V59041")
    private Double v59041;

    @TableField("V59046")
    private Double v59046;

    @TableField("V59047")
    private Double v59047;

    @TableField("V59038")
    private Double v59038;

    @TableField("V59242")
    private Double v59242;

    @TableField("V59241")
    private Double v59241;

    @TableField("V59246")
    private Double v59246;

    @TableField("V59057")
    private Double v59057;

    @TableField("V59255")
    private Double v59255;

    @TableField("V59254")
    private Double v59254;

    @TableField("V59249")
    private Double v59249;

    @TableField("V59452")
    private Double v59452;

    @TableField("V59451")
    private Double v59451;

    @TableField("V59453")
    private Double v59453;

    @TableField("V59457")
    private Double v59457;

    @TableField("V59449")
    private Double v59449;

    @TableField("V59230")
    private Double v59230;

    @TableField("V59235")
    private Double v59235;

    @TableField("V59237")
    private Double v59237;

    @TableField("V59238")
    private Double v59238;

    @TableField("V59441")
    private Double v59441;

    @TableField("V59435")
    private Double v59435;

    @TableField("V59229")
    private Double v59229;

    @TableField("V59227")
    private Double v59227;

    @TableField("V59421")
    private Double v59421;

    @TableField("V59426")
    private Double v59426;

    @TableField("V59425")
    private Double v59425;

    @TableField("V59427")
    private Double v59427;

    @TableField("V59417")
    private Double v59417;

    @TableField("V59419")
    private Double v59419;

    @TableField("V59446")
    private Double v59446;

    @TableField("V59448")
    private Double v59448;

    @TableField("V59640")
    private Double v59640;

    @TableField("V59644")
    private Double v59644;

    @TableField("V59647")
    private Double v59647;

    @TableField("V59632")
    private Double v59632;

    @TableField("V59626")
    private Double v59626;

    @TableField("V59429")
    private Double v59429;

    @TableField("V59631")
    private Double v59631;

    @TableField("V59635")
    private Double v59635;

    @TableField("V59033")
    private Double v59033;

    @TableField("V59034")
    private Double v59034;

    @TableField("V59037")
    private Double v59037;

    @TableField("V59031")
    private Double v59031;

    @TableField("V59023")
    private Double v59023;

    @TableField("V59022")
    private Double v59022;

    @TableField("V57927")
    private Double v57927;

    @TableField("V59021")
    private Double v59021;

    @TableField("V59025")
    private Double v59025;

    @TableField("V59027")
    private Double v59027;

    @TableField("V59015")
    private Double v59015;

    @TableField("V59012")
    private Double v59012;

    @TableField("V59017")
    private Double v59017;

    @TableField("V59001")
    private Double v59001;

    @TableField("V59004")
    private Double v59004;

    @TableField("V59211")
    private Double v59211;

    @TableField("V59213")
    private Double v59213;

    @TableField("V59224")
    private Double v59224;

    @TableField("V59228")
    private Double v59228;

    @TableField("V59215")
    private Double v59215;

    @TableField("V59218")
    private Double v59218;

    @TableField("V59209")
    private Double v59209;

    @TableField("V59432")
    private Double v59432;


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

    public Double getv59431() {
        return v59431;
    }

    public void setv59431(Double v59431) {
        this.v59431 = v59431;
    }

    public Double getv57859() {
        return v57859;
    }

    public void setv57859(Double v57859) {
        this.v57859 = v57859;
    }

    public Double getv57960() {
        return v57960;
    }

    public void setv57960(Double v57960) {
        this.v57960 = v57960;
    }

    public Double getv57942() {
        return v57942;
    }

    public void setv57942(Double v57942) {
        this.v57942 = v57942;
    }

    public Double getv57956() {
        return v57956;
    }

    public void setv57956(Double v57956) {
        this.v57956 = v57956;
    }

    public Double getv57954() {
        return v57954;
    }

    public void setv57954(Double v57954) {
        this.v57954 = v57954;
    }

    public Double getv57957() {
        return v57957;
    }

    public void setv57957(Double v57957) {
        this.v57957 = v57957;
    }

    public Double getv57955() {
        return v57955;
    }

    public void setv57955(Double v57955) {
        this.v57955 = v57955;
    }

    public Double getv57964() {
        return v57964;
    }

    public void setv57964(Double v57964) {
        this.v57964 = v57964;
    }

    public Double getv57949() {
        return v57949;
    }

    public void setv57949(Double v57949) {
        this.v57949 = v57949;
    }

    public Double getv59051() {
        return v59051;
    }

    public void setv59051(Double v59051) {
        this.v59051 = v59051;
    }

    public Double getv59052() {
        return v59052;
    }

    public void setv59052(Double v59052) {
        this.v59052 = v59052;
    }

    public Double getv59055() {
        return v59055;
    }

    public void setv59055(Double v59055) {
        this.v59055 = v59055;
    }

    public Double getv59053() {
        return v59053;
    }

    public void setv59053(Double v59053) {
        this.v59053 = v59053;
    }

    public Double getv59061() {
        return v59061;
    }

    public void setv59061(Double v59061) {
        this.v59061 = v59061;
    }

    public Double getv59064() {
        return v59064;
    }

    public void setv59064(Double v59064) {
        this.v59064 = v59064;
    }

    public Double getv59065() {
        return v59065;
    }

    public void setv59065(Double v59065) {
        this.v59065 = v59065;
    }

    public Double getv59059() {
        return v59059;
    }

    public void setv59059(Double v59059) {
        this.v59059 = v59059;
    }

    public Double getv59058() {
        return v59058;
    }

    public void setv59058(Double v59058) {
        this.v59058 = v59058;
    }

    public Double getv59265() {
        return v59265;
    }

    public void setv59265(Double v59265) {
        this.v59265 = v59265;
    }

    public Double getv59266() {
        return v59266;
    }

    public void setv59266(Double v59266) {
        this.v59266 = v59266;
    }

    public Double getv59256() {
        return v59256;
    }

    public void setv59256(Double v59256) {
        this.v59256 = v59256;
    }

    public Double getv59454() {
        return v59454;
    }

    public void setv59454(Double v59454) {
        this.v59454 = v59454;
    }

    public Double getv57941() {
        return v57941;
    }

    public void setv57941(Double v57941) {
        this.v57941 = v57941;
    }

    public Double getv57947() {
        return v57947;
    }

    public void setv57947(Double v57947) {
        this.v57947 = v57947;
    }

    public Double getv57948() {
        return v57948;
    }

    public void setv57948(Double v57948) {
        this.v57948 = v57948;
    }

    public Double getv59045() {
        return v59045;
    }

    public void setv59045(Double v59045) {
        this.v59045 = v59045;
    }

    public Double getv59041() {
        return v59041;
    }

    public void setv59041(Double v59041) {
        this.v59041 = v59041;
    }

    public Double getv59046() {
        return v59046;
    }

    public void setv59046(Double v59046) {
        this.v59046 = v59046;
    }

    public Double getv59047() {
        return v59047;
    }

    public void setv59047(Double v59047) {
        this.v59047 = v59047;
    }

    public Double getv59038() {
        return v59038;
    }

    public void setv59038(Double v59038) {
        this.v59038 = v59038;
    }

    public Double getv59242() {
        return v59242;
    }

    public void setv59242(Double v59242) {
        this.v59242 = v59242;
    }

    public Double getv59241() {
        return v59241;
    }

    public void setv59241(Double v59241) {
        this.v59241 = v59241;
    }

    public Double getv59246() {
        return v59246;
    }

    public void setv59246(Double v59246) {
        this.v59246 = v59246;
    }

    public Double getv59057() {
        return v59057;
    }

    public void setv59057(Double v59057) {
        this.v59057 = v59057;
    }

    public Double getv59255() {
        return v59255;
    }

    public void setv59255(Double v59255) {
        this.v59255 = v59255;
    }

    public Double getv59254() {
        return v59254;
    }

    public void setv59254(Double v59254) {
        this.v59254 = v59254;
    }

    public Double getv59249() {
        return v59249;
    }

    public void setv59249(Double v59249) {
        this.v59249 = v59249;
    }

    public Double getv59452() {
        return v59452;
    }

    public void setv59452(Double v59452) {
        this.v59452 = v59452;
    }

    public Double getv59451() {
        return v59451;
    }

    public void setv59451(Double v59451) {
        this.v59451 = v59451;
    }

    public Double getv59453() {
        return v59453;
    }

    public void setv59453(Double v59453) {
        this.v59453 = v59453;
    }

    public Double getv59457() {
        return v59457;
    }

    public void setv59457(Double v59457) {
        this.v59457 = v59457;
    }

    public Double getv59449() {
        return v59449;
    }

    public void setv59449(Double v59449) {
        this.v59449 = v59449;
    }

    public Double getv59230() {
        return v59230;
    }

    public void setv59230(Double v59230) {
        this.v59230 = v59230;
    }

    public Double getv59235() {
        return v59235;
    }

    public void setv59235(Double v59235) {
        this.v59235 = v59235;
    }

    public Double getv59237() {
        return v59237;
    }

    public void setv59237(Double v59237) {
        this.v59237 = v59237;
    }

    public Double getv59238() {
        return v59238;
    }

    public void setv59238(Double v59238) {
        this.v59238 = v59238;
    }

    public Double getv59441() {
        return v59441;
    }

    public void setv59441(Double v59441) {
        this.v59441 = v59441;
    }

    public Double getv59435() {
        return v59435;
    }

    public void setv59435(Double v59435) {
        this.v59435 = v59435;
    }

    public Double getv59229() {
        return v59229;
    }

    public void setv59229(Double v59229) {
        this.v59229 = v59229;
    }

    public Double getv59227() {
        return v59227;
    }

    public void setv59227(Double v59227) {
        this.v59227 = v59227;
    }

    public Double getv59421() {
        return v59421;
    }

    public void setv59421(Double v59421) {
        this.v59421 = v59421;
    }

    public Double getv59426() {
        return v59426;
    }

    public void setv59426(Double v59426) {
        this.v59426 = v59426;
    }

    public Double getv59425() {
        return v59425;
    }

    public void setv59425(Double v59425) {
        this.v59425 = v59425;
    }

    public Double getv59427() {
        return v59427;
    }

    public void setv59427(Double v59427) {
        this.v59427 = v59427;
    }

    public Double getv59417() {
        return v59417;
    }

    public void setv59417(Double v59417) {
        this.v59417 = v59417;
    }

    public Double getv59419() {
        return v59419;
    }

    public void setv59419(Double v59419) {
        this.v59419 = v59419;
    }

    public Double getv59446() {
        return v59446;
    }

    public void setv59446(Double v59446) {
        this.v59446 = v59446;
    }

    public Double getv59448() {
        return v59448;
    }

    public void setv59448(Double v59448) {
        this.v59448 = v59448;
    }

    public Double getv59640() {
        return v59640;
    }

    public void setv59640(Double v59640) {
        this.v59640 = v59640;
    }

    public Double getv59644() {
        return v59644;
    }

    public void setv59644(Double v59644) {
        this.v59644 = v59644;
    }

    public Double getv59647() {
        return v59647;
    }

    public void setv59647(Double v59647) {
        this.v59647 = v59647;
    }

    public Double getv59632() {
        return v59632;
    }

    public void setv59632(Double v59632) {
        this.v59632 = v59632;
    }

    public Double getv59626() {
        return v59626;
    }

    public void setv59626(Double v59626) {
        this.v59626 = v59626;
    }

    public Double getv59429() {
        return v59429;
    }

    public void setv59429(Double v59429) {
        this.v59429 = v59429;
    }

    public Double getv59631() {
        return v59631;
    }

    public void setv59631(Double v59631) {
        this.v59631 = v59631;
    }

    public Double getv59635() {
        return v59635;
    }

    public void setv59635(Double v59635) {
        this.v59635 = v59635;
    }

    public Double getv59033() {
        return v59033;
    }

    public void setv59033(Double v59033) {
        this.v59033 = v59033;
    }

    public Double getv59034() {
        return v59034;
    }

    public void setv59034(Double v59034) {
        this.v59034 = v59034;
    }

    public Double getv59037() {
        return v59037;
    }

    public void setv59037(Double v59037) {
        this.v59037 = v59037;
    }

    public Double getv59031() {
        return v59031;
    }

    public void setv59031(Double v59031) {
        this.v59031 = v59031;
    }

    public Double getv59023() {
        return v59023;
    }

    public void setv59023(Double v59023) {
        this.v59023 = v59023;
    }

    public Double getv59022() {
        return v59022;
    }

    public void setv59022(Double v59022) {
        this.v59022 = v59022;
    }

    public Double getv57927() {
        return v57927;
    }

    public void setv57927(Double v57927) {
        this.v57927 = v57927;
    }

    public Double getv59021() {
        return v59021;
    }

    public void setv59021(Double v59021) {
        this.v59021 = v59021;
    }

    public Double getv59025() {
        return v59025;
    }

    public void setv59025(Double v59025) {
        this.v59025 = v59025;
    }

    public Double getv59027() {
        return v59027;
    }

    public void setv59027(Double v59027) {
        this.v59027 = v59027;
    }

    public Double getv59015() {
        return v59015;
    }

    public void setv59015(Double v59015) {
        this.v59015 = v59015;
    }

    public Double getv59012() {
        return v59012;
    }

    public void setv59012(Double v59012) {
        this.v59012 = v59012;
    }

    public Double getv59017() {
        return v59017;
    }

    public void setv59017(Double v59017) {
        this.v59017 = v59017;
    }

    public Double getv59001() {
        return v59001;
    }

    public void setv59001(Double v59001) {
        this.v59001 = v59001;
    }

    public Double getv59004() {
        return v59004;
    }

    public void setv59004(Double v59004) {
        this.v59004 = v59004;
    }

    public Double getv59211() {
        return v59211;
    }

    public void setv59211(Double v59211) {
        this.v59211 = v59211;
    }

    public Double getv59213() {
        return v59213;
    }

    public void setv59213(Double v59213) {
        this.v59213 = v59213;
    }

    public Double getv59224() {
        return v59224;
    }

    public void setv59224(Double v59224) {
        this.v59224 = v59224;
    }

    public Double getv59228() {
        return v59228;
    }

    public void setv59228(Double v59228) {
        this.v59228 = v59228;
    }

    public Double getv59215() {
        return v59215;
    }

    public void setv59215(Double v59215) {
        this.v59215 = v59215;
    }

    public Double getv59218() {
        return v59218;
    }

    public void setv59218(Double v59218) {
        this.v59218 = v59218;
    }

    public Double getv59209() {
        return v59209;
    }

    public void setv59209(Double v59209) {
        this.v59209 = v59209;
    }

    public Double getv59432() {
        return v59432;
    }

    public void setv59432(Double v59432) {
        this.v59432 = v59432;
    }

    @Override
    public String toString() {
        return "Slae24Ele{" +
        "ldate=" + ldate +
        ", ltime=" + ltime +
        ", v59431=" + v59431 +
        ", v57859=" + v57859 +
        ", v57960=" + v57960 +
        ", v57942=" + v57942 +
        ", v57956=" + v57956 +
        ", v57954=" + v57954 +
        ", v57957=" + v57957 +
        ", v57955=" + v57955 +
        ", v57964=" + v57964 +
        ", v57949=" + v57949 +
        ", v59051=" + v59051 +
        ", v59052=" + v59052 +
        ", v59055=" + v59055 +
        ", v59053=" + v59053 +
        ", v59061=" + v59061 +
        ", v59064=" + v59064 +
        ", v59065=" + v59065 +
        ", v59059=" + v59059 +
        ", v59058=" + v59058 +
        ", v59265=" + v59265 +
        ", v59266=" + v59266 +
        ", v59256=" + v59256 +
        ", v59454=" + v59454 +
        ", v57941=" + v57941 +
        ", v57947=" + v57947 +
        ", v57948=" + v57948 +
        ", v59045=" + v59045 +
        ", v59041=" + v59041 +
        ", v59046=" + v59046 +
        ", v59047=" + v59047 +
        ", v59038=" + v59038 +
        ", v59242=" + v59242 +
        ", v59241=" + v59241 +
        ", v59246=" + v59246 +
        ", v59057=" + v59057 +
        ", v59255=" + v59255 +
        ", v59254=" + v59254 +
        ", v59249=" + v59249 +
        ", v59452=" + v59452 +
        ", v59451=" + v59451 +
        ", v59453=" + v59453 +
        ", v59457=" + v59457 +
        ", v59449=" + v59449 +
        ", v59230=" + v59230 +
        ", v59235=" + v59235 +
        ", v59237=" + v59237 +
        ", v59238=" + v59238 +
        ", v59441=" + v59441 +
        ", v59435=" + v59435 +
        ", v59229=" + v59229 +
        ", v59227=" + v59227 +
        ", v59421=" + v59421 +
        ", v59426=" + v59426 +
        ", v59425=" + v59425 +
        ", v59427=" + v59427 +
        ", v59417=" + v59417 +
        ", v59419=" + v59419 +
        ", v59446=" + v59446 +
        ", v59448=" + v59448 +
        ", v59640=" + v59640 +
        ", v59644=" + v59644 +
        ", v59647=" + v59647 +
        ", v59632=" + v59632 +
        ", v59626=" + v59626 +
        ", v59429=" + v59429 +
        ", v59631=" + v59631 +
        ", v59635=" + v59635 +
        ", v59033=" + v59033 +
        ", v59034=" + v59034 +
        ", v59037=" + v59037 +
        ", v59031=" + v59031 +
        ", v59023=" + v59023 +
        ", v59022=" + v59022 +
        ", v57927=" + v57927 +
        ", v59021=" + v59021 +
        ", v59025=" + v59025 +
        ", v59027=" + v59027 +
        ", v59015=" + v59015 +
        ", v59012=" + v59012 +
        ", v59017=" + v59017 +
        ", v59001=" + v59001 +
        ", v59004=" + v59004 +
        ", v59211=" + v59211 +
        ", v59213=" + v59213 +
        ", v59224=" + v59224 +
        ", v59228=" + v59228 +
        ", v59215=" + v59215 +
        ", v59218=" + v59218 +
        ", v59209=" + v59209 +
        ", v59432=" + v59432 +
        "}";
    }
}

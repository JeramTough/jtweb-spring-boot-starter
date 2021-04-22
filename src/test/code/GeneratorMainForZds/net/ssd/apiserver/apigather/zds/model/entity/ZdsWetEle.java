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
@TableName("ZDS_WET_ELE")
@ApiModel(value="ZdsWetEle对象", description="")
public class ZdsWetEle implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId("LDATE")
    private String ldate;

    @TableField("V59431")
    private String v59431;

    @TableField("V57859")
    private String v57859;

    @TableField("V57960")
    private String v57960;

    @TableField("V57942")
    private String v57942;

    @TableField("V57956")
    private String v57956;

    @TableField("V57954")
    private String v57954;

    @TableField("V57957")
    private String v57957;

    @TableField("V57955")
    private String v57955;

    @TableField("V57964")
    private String v57964;

    @TableField("V57949")
    private String v57949;

    @TableField("V59051")
    private String v59051;

    @TableField("V59052")
    private String v59052;

    @TableField("V59055")
    private String v59055;

    @TableField("V59053")
    private String v59053;

    @TableField("V59061")
    private String v59061;

    @TableField("V59064")
    private String v59064;

    @TableField("V59065")
    private String v59065;

    @TableField("V59059")
    private String v59059;

    @TableField("V59058")
    private String v59058;

    @TableField("V59265")
    private String v59265;

    @TableField("V59266")
    private String v59266;

    @TableField("V59256")
    private String v59256;

    @TableField("V59454")
    private String v59454;

    @TableField("V57941")
    private String v57941;

    @TableField("V57947")
    private String v57947;

    @TableField("V57948")
    private String v57948;

    @TableField("V59045")
    private String v59045;

    @TableField("V59041")
    private String v59041;

    @TableField("V59046")
    private String v59046;

    @TableField("V59047")
    private String v59047;

    @TableField("V59038")
    private String v59038;

    @TableField("V59242")
    private String v59242;

    @TableField("V59241")
    private String v59241;

    @TableField("V59246")
    private String v59246;

    @TableField("V59057")
    private String v59057;

    @TableField("V59255")
    private String v59255;

    @TableField("V59254")
    private String v59254;

    @TableField("V59249")
    private String v59249;

    @TableField("V59452")
    private String v59452;

    @TableField("V59451")
    private String v59451;

    @TableField("V59453")
    private String v59453;

    @TableField("V59457")
    private String v59457;

    @TableField("V59449")
    private String v59449;

    @TableField("V59230")
    private String v59230;

    @TableField("V59235")
    private String v59235;

    @TableField("V59237")
    private String v59237;

    @TableField("V59238")
    private String v59238;

    @TableField("V59441")
    private String v59441;

    @TableField("V59435")
    private String v59435;

    @TableField("V59229")
    private String v59229;

    @TableField("V59227")
    private String v59227;

    @TableField("V59421")
    private String v59421;

    @TableField("V59426")
    private String v59426;

    @TableField("V59425")
    private String v59425;

    @TableField("V59427")
    private String v59427;

    @TableField("V59417")
    private String v59417;

    @TableField("V59419")
    private String v59419;

    @TableField("V59446")
    private String v59446;

    @TableField("V59448")
    private String v59448;

    @TableField("V59640")
    private String v59640;

    @TableField("V59644")
    private String v59644;

    @TableField("V59647")
    private String v59647;

    @TableField("V59632")
    private String v59632;

    @TableField("V59626")
    private String v59626;

    @TableField("V59429")
    private String v59429;

    @TableField("V59631")
    private String v59631;

    @TableField("V59635")
    private String v59635;

    @TableField("V59033")
    private String v59033;

    @TableField("V59034")
    private String v59034;

    @TableField("V59037")
    private String v59037;

    @TableField("V59031")
    private String v59031;

    @TableField("V59023")
    private String v59023;

    @TableField("V59022")
    private String v59022;

    @TableField("V57927")
    private String v57927;

    @TableField("V59021")
    private String v59021;

    @TableField("V59025")
    private String v59025;

    @TableField("V59027")
    private String v59027;

    @TableField("V59015")
    private String v59015;

    @TableField("V59012")
    private String v59012;

    @TableField("V59017")
    private String v59017;

    @TableField("V59001")
    private String v59001;

    @TableField("V59004")
    private String v59004;

    @TableField("V59211")
    private String v59211;

    @TableField("V59213")
    private String v59213;

    @TableField("V59224")
    private String v59224;

    @TableField("V59228")
    private String v59228;

    @TableField("V59215")
    private String v59215;

    @TableField("V59218")
    private String v59218;

    @TableField("V59209")
    private String v59209;

    @TableField("V59432")
    private String v59432;


    public String getLdate() {
        return ldate;
    }

    public void setLdate(String ldate) {
        this.ldate = ldate;
    }

    public String getv59431() {
        return v59431;
    }

    public void setv59431(String v59431) {
        this.v59431 = v59431;
    }

    public String getv57859() {
        return v57859;
    }

    public void setv57859(String v57859) {
        this.v57859 = v57859;
    }

    public String getv57960() {
        return v57960;
    }

    public void setv57960(String v57960) {
        this.v57960 = v57960;
    }

    public String getv57942() {
        return v57942;
    }

    public void setv57942(String v57942) {
        this.v57942 = v57942;
    }

    public String getv57956() {
        return v57956;
    }

    public void setv57956(String v57956) {
        this.v57956 = v57956;
    }

    public String getv57954() {
        return v57954;
    }

    public void setv57954(String v57954) {
        this.v57954 = v57954;
    }

    public String getv57957() {
        return v57957;
    }

    public void setv57957(String v57957) {
        this.v57957 = v57957;
    }

    public String getv57955() {
        return v57955;
    }

    public void setv57955(String v57955) {
        this.v57955 = v57955;
    }

    public String getv57964() {
        return v57964;
    }

    public void setv57964(String v57964) {
        this.v57964 = v57964;
    }

    public String getv57949() {
        return v57949;
    }

    public void setv57949(String v57949) {
        this.v57949 = v57949;
    }

    public String getv59051() {
        return v59051;
    }

    public void setv59051(String v59051) {
        this.v59051 = v59051;
    }

    public String getv59052() {
        return v59052;
    }

    public void setv59052(String v59052) {
        this.v59052 = v59052;
    }

    public String getv59055() {
        return v59055;
    }

    public void setv59055(String v59055) {
        this.v59055 = v59055;
    }

    public String getv59053() {
        return v59053;
    }

    public void setv59053(String v59053) {
        this.v59053 = v59053;
    }

    public String getv59061() {
        return v59061;
    }

    public void setv59061(String v59061) {
        this.v59061 = v59061;
    }

    public String getv59064() {
        return v59064;
    }

    public void setv59064(String v59064) {
        this.v59064 = v59064;
    }

    public String getv59065() {
        return v59065;
    }

    public void setv59065(String v59065) {
        this.v59065 = v59065;
    }

    public String getv59059() {
        return v59059;
    }

    public void setv59059(String v59059) {
        this.v59059 = v59059;
    }

    public String getv59058() {
        return v59058;
    }

    public void setv59058(String v59058) {
        this.v59058 = v59058;
    }

    public String getv59265() {
        return v59265;
    }

    public void setv59265(String v59265) {
        this.v59265 = v59265;
    }

    public String getv59266() {
        return v59266;
    }

    public void setv59266(String v59266) {
        this.v59266 = v59266;
    }

    public String getv59256() {
        return v59256;
    }

    public void setv59256(String v59256) {
        this.v59256 = v59256;
    }

    public String getv59454() {
        return v59454;
    }

    public void setv59454(String v59454) {
        this.v59454 = v59454;
    }

    public String getv57941() {
        return v57941;
    }

    public void setv57941(String v57941) {
        this.v57941 = v57941;
    }

    public String getv57947() {
        return v57947;
    }

    public void setv57947(String v57947) {
        this.v57947 = v57947;
    }

    public String getv57948() {
        return v57948;
    }

    public void setv57948(String v57948) {
        this.v57948 = v57948;
    }

    public String getv59045() {
        return v59045;
    }

    public void setv59045(String v59045) {
        this.v59045 = v59045;
    }

    public String getv59041() {
        return v59041;
    }

    public void setv59041(String v59041) {
        this.v59041 = v59041;
    }

    public String getv59046() {
        return v59046;
    }

    public void setv59046(String v59046) {
        this.v59046 = v59046;
    }

    public String getv59047() {
        return v59047;
    }

    public void setv59047(String v59047) {
        this.v59047 = v59047;
    }

    public String getv59038() {
        return v59038;
    }

    public void setv59038(String v59038) {
        this.v59038 = v59038;
    }

    public String getv59242() {
        return v59242;
    }

    public void setv59242(String v59242) {
        this.v59242 = v59242;
    }

    public String getv59241() {
        return v59241;
    }

    public void setv59241(String v59241) {
        this.v59241 = v59241;
    }

    public String getv59246() {
        return v59246;
    }

    public void setv59246(String v59246) {
        this.v59246 = v59246;
    }

    public String getv59057() {
        return v59057;
    }

    public void setv59057(String v59057) {
        this.v59057 = v59057;
    }

    public String getv59255() {
        return v59255;
    }

    public void setv59255(String v59255) {
        this.v59255 = v59255;
    }

    public String getv59254() {
        return v59254;
    }

    public void setv59254(String v59254) {
        this.v59254 = v59254;
    }

    public String getv59249() {
        return v59249;
    }

    public void setv59249(String v59249) {
        this.v59249 = v59249;
    }

    public String getv59452() {
        return v59452;
    }

    public void setv59452(String v59452) {
        this.v59452 = v59452;
    }

    public String getv59451() {
        return v59451;
    }

    public void setv59451(String v59451) {
        this.v59451 = v59451;
    }

    public String getv59453() {
        return v59453;
    }

    public void setv59453(String v59453) {
        this.v59453 = v59453;
    }

    public String getv59457() {
        return v59457;
    }

    public void setv59457(String v59457) {
        this.v59457 = v59457;
    }

    public String getv59449() {
        return v59449;
    }

    public void setv59449(String v59449) {
        this.v59449 = v59449;
    }

    public String getv59230() {
        return v59230;
    }

    public void setv59230(String v59230) {
        this.v59230 = v59230;
    }

    public String getv59235() {
        return v59235;
    }

    public void setv59235(String v59235) {
        this.v59235 = v59235;
    }

    public String getv59237() {
        return v59237;
    }

    public void setv59237(String v59237) {
        this.v59237 = v59237;
    }

    public String getv59238() {
        return v59238;
    }

    public void setv59238(String v59238) {
        this.v59238 = v59238;
    }

    public String getv59441() {
        return v59441;
    }

    public void setv59441(String v59441) {
        this.v59441 = v59441;
    }

    public String getv59435() {
        return v59435;
    }

    public void setv59435(String v59435) {
        this.v59435 = v59435;
    }

    public String getv59229() {
        return v59229;
    }

    public void setv59229(String v59229) {
        this.v59229 = v59229;
    }

    public String getv59227() {
        return v59227;
    }

    public void setv59227(String v59227) {
        this.v59227 = v59227;
    }

    public String getv59421() {
        return v59421;
    }

    public void setv59421(String v59421) {
        this.v59421 = v59421;
    }

    public String getv59426() {
        return v59426;
    }

    public void setv59426(String v59426) {
        this.v59426 = v59426;
    }

    public String getv59425() {
        return v59425;
    }

    public void setv59425(String v59425) {
        this.v59425 = v59425;
    }

    public String getv59427() {
        return v59427;
    }

    public void setv59427(String v59427) {
        this.v59427 = v59427;
    }

    public String getv59417() {
        return v59417;
    }

    public void setv59417(String v59417) {
        this.v59417 = v59417;
    }

    public String getv59419() {
        return v59419;
    }

    public void setv59419(String v59419) {
        this.v59419 = v59419;
    }

    public String getv59446() {
        return v59446;
    }

    public void setv59446(String v59446) {
        this.v59446 = v59446;
    }

    public String getv59448() {
        return v59448;
    }

    public void setv59448(String v59448) {
        this.v59448 = v59448;
    }

    public String getv59640() {
        return v59640;
    }

    public void setv59640(String v59640) {
        this.v59640 = v59640;
    }

    public String getv59644() {
        return v59644;
    }

    public void setv59644(String v59644) {
        this.v59644 = v59644;
    }

    public String getv59647() {
        return v59647;
    }

    public void setv59647(String v59647) {
        this.v59647 = v59647;
    }

    public String getv59632() {
        return v59632;
    }

    public void setv59632(String v59632) {
        this.v59632 = v59632;
    }

    public String getv59626() {
        return v59626;
    }

    public void setv59626(String v59626) {
        this.v59626 = v59626;
    }

    public String getv59429() {
        return v59429;
    }

    public void setv59429(String v59429) {
        this.v59429 = v59429;
    }

    public String getv59631() {
        return v59631;
    }

    public void setv59631(String v59631) {
        this.v59631 = v59631;
    }

    public String getv59635() {
        return v59635;
    }

    public void setv59635(String v59635) {
        this.v59635 = v59635;
    }

    public String getv59033() {
        return v59033;
    }

    public void setv59033(String v59033) {
        this.v59033 = v59033;
    }

    public String getv59034() {
        return v59034;
    }

    public void setv59034(String v59034) {
        this.v59034 = v59034;
    }

    public String getv59037() {
        return v59037;
    }

    public void setv59037(String v59037) {
        this.v59037 = v59037;
    }

    public String getv59031() {
        return v59031;
    }

    public void setv59031(String v59031) {
        this.v59031 = v59031;
    }

    public String getv59023() {
        return v59023;
    }

    public void setv59023(String v59023) {
        this.v59023 = v59023;
    }

    public String getv59022() {
        return v59022;
    }

    public void setv59022(String v59022) {
        this.v59022 = v59022;
    }

    public String getv57927() {
        return v57927;
    }

    public void setv57927(String v57927) {
        this.v57927 = v57927;
    }

    public String getv59021() {
        return v59021;
    }

    public void setv59021(String v59021) {
        this.v59021 = v59021;
    }

    public String getv59025() {
        return v59025;
    }

    public void setv59025(String v59025) {
        this.v59025 = v59025;
    }

    public String getv59027() {
        return v59027;
    }

    public void setv59027(String v59027) {
        this.v59027 = v59027;
    }

    public String getv59015() {
        return v59015;
    }

    public void setv59015(String v59015) {
        this.v59015 = v59015;
    }

    public String getv59012() {
        return v59012;
    }

    public void setv59012(String v59012) {
        this.v59012 = v59012;
    }

    public String getv59017() {
        return v59017;
    }

    public void setv59017(String v59017) {
        this.v59017 = v59017;
    }

    public String getv59001() {
        return v59001;
    }

    public void setv59001(String v59001) {
        this.v59001 = v59001;
    }

    public String getv59004() {
        return v59004;
    }

    public void setv59004(String v59004) {
        this.v59004 = v59004;
    }

    public String getv59211() {
        return v59211;
    }

    public void setv59211(String v59211) {
        this.v59211 = v59211;
    }

    public String getv59213() {
        return v59213;
    }

    public void setv59213(String v59213) {
        this.v59213 = v59213;
    }

    public String getv59224() {
        return v59224;
    }

    public void setv59224(String v59224) {
        this.v59224 = v59224;
    }

    public String getv59228() {
        return v59228;
    }

    public void setv59228(String v59228) {
        this.v59228 = v59228;
    }

    public String getv59215() {
        return v59215;
    }

    public void setv59215(String v59215) {
        this.v59215 = v59215;
    }

    public String getv59218() {
        return v59218;
    }

    public void setv59218(String v59218) {
        this.v59218 = v59218;
    }

    public String getv59209() {
        return v59209;
    }

    public void setv59209(String v59209) {
        this.v59209 = v59209;
    }

    public String getv59432() {
        return v59432;
    }

    public void setv59432(String v59432) {
        this.v59432 = v59432;
    }

    @Override
    public String toString() {
        return "ZdsWetEle{" +
        "ldate=" + ldate +
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

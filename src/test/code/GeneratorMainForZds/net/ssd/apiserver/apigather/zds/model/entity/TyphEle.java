package net.ssd.apiserver.apigather.zds.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
 * @author WeiBoWen
 * @since 2021-03-08
 */
@TableName("TYPH_ELE")
@ApiModel(value="TyphEle对象", description="")
public class TyphEle implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @TableField("CCCC")
    private String cccc;

    @TableField("LDATE")
    private String ldate;

    @TableField("LTIME")
    private String ltime;

    @TableField("TYNAME")
    private String tyname;

    @TableField("VCHIBH")
    private String vchibh;

    @TableField("VINTBH")
    private String vintbh;

    @TableField("V30")
    private Double v30;

    @TableField("V50")
    private Double v50;

    @TableField("V0001")
    private Double v0001;

    @TableField("V0002")
    private Double v0002;

    @TableField("V0003")
    private Double v0003;

    @TableField("V0004")
    private Double v0004;

    @TableField("V2401")
    private Double v2401;

    @TableField("V2402")
    private Double v2402;

    @TableField("V2403")
    private Double v2403;

    @TableField("V2404")
    private Double v2404;

    @TableField("V4801")
    private Double v4801;

    @TableField("V4802")
    private Double v4802;

    @TableField("V4803")
    private Double v4803;

    @TableField("V4804")
    private Double v4804;

    @TableField("L7")
    private Double l7;

    @TableField("L10")
    private Double l10;

    private String grade;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCccc() {
        return cccc;
    }

    public void setCccc(String cccc) {
        this.cccc = cccc;
    }

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

    public String getTyname() {
        return tyname;
    }

    public void setTyname(String tyname) {
        this.tyname = tyname;
    }

    public String getVchibh() {
        return vchibh;
    }

    public void setVchibh(String vchibh) {
        this.vchibh = vchibh;
    }

    public String getVintbh() {
        return vintbh;
    }

    public void setVintbh(String vintbh) {
        this.vintbh = vintbh;
    }

    public Double getv30() {
        return v30;
    }

    public void setv30(Double v30) {
        this.v30 = v30;
    }

    public Double getv50() {
        return v50;
    }

    public void setv50(Double v50) {
        this.v50 = v50;
    }

    public Double getv0001() {
        return v0001;
    }

    public void setv0001(Double v0001) {
        this.v0001 = v0001;
    }

    public Double getv0002() {
        return v0002;
    }

    public void setv0002(Double v0002) {
        this.v0002 = v0002;
    }

    public Double getv0003() {
        return v0003;
    }

    public void setv0003(Double v0003) {
        this.v0003 = v0003;
    }

    public Double getv0004() {
        return v0004;
    }

    public void setv0004(Double v0004) {
        this.v0004 = v0004;
    }

    public Double getv2401() {
        return v2401;
    }

    public void setv2401(Double v2401) {
        this.v2401 = v2401;
    }

    public Double getv2402() {
        return v2402;
    }

    public void setv2402(Double v2402) {
        this.v2402 = v2402;
    }

    public Double getv2403() {
        return v2403;
    }

    public void setv2403(Double v2403) {
        this.v2403 = v2403;
    }

    public Double getv2404() {
        return v2404;
    }

    public void setv2404(Double v2404) {
        this.v2404 = v2404;
    }

    public Double getv4801() {
        return v4801;
    }

    public void setv4801(Double v4801) {
        this.v4801 = v4801;
    }

    public Double getv4802() {
        return v4802;
    }

    public void setv4802(Double v4802) {
        this.v4802 = v4802;
    }

    public Double getv4803() {
        return v4803;
    }

    public void setv4803(Double v4803) {
        this.v4803 = v4803;
    }

    public Double getv4804() {
        return v4804;
    }

    public void setv4804(Double v4804) {
        this.v4804 = v4804;
    }

    public Double getl7() {
        return l7;
    }

    public void setl7(Double l7) {
        this.l7 = l7;
    }

    public Double getl10() {
        return l10;
    }

    public void setl10(Double l10) {
        this.l10 = l10;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "TyphEle{" +
        "id=" + id +
        ", cccc=" + cccc +
        ", ldate=" + ldate +
        ", ltime=" + ltime +
        ", tyname=" + tyname +
        ", vchibh=" + vchibh +
        ", vintbh=" + vintbh +
        ", v30=" + v30 +
        ", v50=" + v50 +
        ", v0001=" + v0001 +
        ", v0002=" + v0002 +
        ", v0003=" + v0003 +
        ", v0004=" + v0004 +
        ", v2401=" + v2401 +
        ", v2402=" + v2402 +
        ", v2403=" + v2403 +
        ", v2404=" + v2404 +
        ", v4801=" + v4801 +
        ", v4802=" + v4802 +
        ", v4803=" + v4803 +
        ", v4804=" + v4804 +
        ", l7=" + l7 +
        ", l10=" + l10 +
        ", grade=" + grade +
        "}";
    }
}

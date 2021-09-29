package net.ssd.soa.model.entity;

import java.math.BigDecimal;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author WeiBoWen
 * @since 2021-09-14
 */
@ApiModel(value="TyphEle对象", description="")
public class TyphEle implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    private String cccc;

    private String ldate;

    private String ltime;

    private String tyname;

    private String vchibh;

    private String vintbh;

    private BigDecimal v30;

    private BigDecimal v50;

    private BigDecimal v0001;

    private BigDecimal v0002;

    private BigDecimal v0003;

    private BigDecimal v0004;

    private BigDecimal v2401;

    private BigDecimal v2402;

    private BigDecimal v2403;

    private BigDecimal v2404;

    private BigDecimal v4801;

    private BigDecimal v4802;

    private BigDecimal v4803;

    private BigDecimal v4804;

    private BigDecimal l7;

    private BigDecimal l10;

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

    public BigDecimal getv30() {
        return v30;
    }

    public void setv30(BigDecimal v30) {
        this.v30 = v30;
    }

    public BigDecimal getv50() {
        return v50;
    }

    public void setv50(BigDecimal v50) {
        this.v50 = v50;
    }

    public BigDecimal getv0001() {
        return v0001;
    }

    public void setv0001(BigDecimal v0001) {
        this.v0001 = v0001;
    }

    public BigDecimal getv0002() {
        return v0002;
    }

    public void setv0002(BigDecimal v0002) {
        this.v0002 = v0002;
    }

    public BigDecimal getv0003() {
        return v0003;
    }

    public void setv0003(BigDecimal v0003) {
        this.v0003 = v0003;
    }

    public BigDecimal getv0004() {
        return v0004;
    }

    public void setv0004(BigDecimal v0004) {
        this.v0004 = v0004;
    }

    public BigDecimal getv2401() {
        return v2401;
    }

    public void setv2401(BigDecimal v2401) {
        this.v2401 = v2401;
    }

    public BigDecimal getv2402() {
        return v2402;
    }

    public void setv2402(BigDecimal v2402) {
        this.v2402 = v2402;
    }

    public BigDecimal getv2403() {
        return v2403;
    }

    public void setv2403(BigDecimal v2403) {
        this.v2403 = v2403;
    }

    public BigDecimal getv2404() {
        return v2404;
    }

    public void setv2404(BigDecimal v2404) {
        this.v2404 = v2404;
    }

    public BigDecimal getv4801() {
        return v4801;
    }

    public void setv4801(BigDecimal v4801) {
        this.v4801 = v4801;
    }

    public BigDecimal getv4802() {
        return v4802;
    }

    public void setv4802(BigDecimal v4802) {
        this.v4802 = v4802;
    }

    public BigDecimal getv4803() {
        return v4803;
    }

    public void setv4803(BigDecimal v4803) {
        this.v4803 = v4803;
    }

    public BigDecimal getv4804() {
        return v4804;
    }

    public void setv4804(BigDecimal v4804) {
        this.v4804 = v4804;
    }

    public BigDecimal getl7() {
        return l7;
    }

    public void setl7(BigDecimal l7) {
        this.l7 = l7;
    }

    public BigDecimal getl10() {
        return l10;
    }

    public void setl10(BigDecimal l10) {
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

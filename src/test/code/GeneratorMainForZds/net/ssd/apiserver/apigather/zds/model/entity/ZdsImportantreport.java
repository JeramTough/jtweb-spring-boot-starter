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
@TableName("ZDS_IMPORTANTREPORT")
@ApiModel(value="ZdsImportantreport对象", description="")
public class ZdsImportantreport implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @TableField("LDATE")
    private String ldate;

    @TableField("LTIME")
    private String ltime;

    @TableField("TITLE")
    private String title;

    @TableField("DAT")
    private String dat;

    @TableField("PIC1")
    private byte[] pic1;

    @TableField("PIC2")
    private byte[] pic2;

    @TableField("FNAME")
    private String fname;

    @TableField("LType")
    private Integer ltype;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDat() {
        return dat;
    }

    public void setDat(String dat) {
        this.dat = dat;
    }

    public byte[] getPic1() {
        return pic1;
    }

    public void setPic1(byte[] pic1) {
        this.pic1 = pic1;
    }

    public byte[] getPic2() {
        return pic2;
    }

    public void setPic2(byte[] pic2) {
        this.pic2 = pic2;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public Integer getLtype() {
        return ltype;
    }

    public void setLtype(Integer ltype) {
        this.ltype = ltype;
    }

    @Override
    public String toString() {
        return "ZdsImportantreport{" +
        "id=" + id +
        ", ldate=" + ldate +
        ", ltime=" + ltime +
        ", title=" + title +
        ", dat=" + dat +
        ", pic1=" + pic1 +
        ", pic2=" + pic2 +
        ", fname=" + fname +
        ", ltype=" + ltype +
        "}";
    }
}

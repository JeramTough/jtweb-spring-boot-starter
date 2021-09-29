package net.ssd.soa.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.sql.Blob;
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
 * @since 2021-09-14
 */
@ApiModel(value="ZdsImportantreport对象", description="")
public class ZdsImportantreportDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String ldate;

    private String ltime;

    private String title;

    private String dat;

    private Blob pic1;

    private Blob pic2;

    private String fname;

    @TableField("LType")
    private Integer lType;


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

    public Blob getPic1() {
        return pic1;
    }

    public void setPic1(Blob pic1) {
        this.pic1 = pic1;
    }

    public Blob getPic2() {
        return pic2;
    }

    public void setPic2(Blob pic2) {
        this.pic2 = pic2;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public Integer getlType() {
        return lType;
    }

    public void setlType(Integer lType) {
        this.lType = lType;
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
        ", lType=" + lType +
        "}";
    }
}

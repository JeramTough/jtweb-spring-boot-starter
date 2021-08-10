package net.ssd.zds.model.entity;

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
@ApiModel(value="HtmlPdf对象", description="")
public class HtmlPdf implements Serializable {

    private static final long serialVersionUID=1L;

    @TableField("ID")
    private Integer id;

    @TableField("PID")
    private String pid;

    @TableField("LDate")
    private String ldate;

    @TableField("LTime")
    private String ltime;

    @TableField("PAddress")
    private String paddress;

    @TableField("LType")
    private Integer ltype;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
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

    public String getPaddress() {
        return paddress;
    }

    public void setPaddress(String paddress) {
        this.paddress = paddress;
    }

    public Integer getLtype() {
        return ltype;
    }

    public void setLtype(Integer ltype) {
        this.ltype = ltype;
    }

    @Override
    public String toString() {
        return "HtmlPdf{" +
        "id=" + id +
        ", pid=" + pid +
        ", ldate=" + ldate +
        ", ltime=" + ltime +
        ", paddress=" + paddress +
        ", ltype=" + ltype +
        "}";
    }
}

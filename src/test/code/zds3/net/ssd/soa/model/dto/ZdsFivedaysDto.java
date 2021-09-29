package net.ssd.soa.model.entity;

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
@ApiModel(value="ZdsFivedays对象", description="")
public class ZdsFivedaysDto implements Serializable{

    private static final long serialVersionUID=1L;

    private Integer id;

    private String ldate;

    private String ltime;

    @TableField("LType")
    private Integer lType;

    private String dat;


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

    public Integer getlType() {
        return lType;
    }

    public void setlType(Integer lType) {
        this.lType = lType;
    }

    public String getDat() {
        return dat;
    }

    public void setDat(String dat) {
        this.dat = dat;
    }

    @Override
    public String toString() {
        return "ZdsFivedays{" +
        "id=" + id +
        ", ldate=" + ldate +
        ", ltime=" + ltime +
        ", lType=" + lType +
        ", dat=" + dat +
        "}";
    }
}

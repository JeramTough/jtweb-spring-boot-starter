package net.ssd.InterfaceService.gxsmswc.model.entity;

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
 * @author JeramTough
 * @since 2020-09-16
 */
@TableName("ZDS_FIVEDAYS")
@ApiModel(value="ZdsFivedays对象", description="")
public class ZdsFivedaysDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableField("LTIME")
    private String ltime;

    @TableField("DAT")
    private String dat;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @TableField("LDATE")
    private String ldate;

    @TableField("LType")
    private Integer LType;


    public String getLtime() {
        return ltime;
    }

    public void setLtime(String ltime) {
        this.ltime = ltime;
    }

    public String getDat() {
        return dat;
    }

    public void setDat(String dat) {
        this.dat = dat;
    }

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

    public Integer getLType() {
        return LType;
    }

    public void setLType(Integer LType) {
        this.LType = LType;
    }

    @Override
    public String toString() {
        return "ZdsFivedays{" +
        "ltime=" + ltime +
        ", dat=" + dat +
        ", id=" + id +
        ", ldate=" + ldate +
        ", LType=" + LType +
        "}";
    }
}

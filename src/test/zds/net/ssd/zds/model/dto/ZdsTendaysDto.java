package net.ssd.zds.model.entity;

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
 * @since 2021-04-25
 */
@TableName("ZDS_TENDAYS")
@ApiModel(value="ZdsTendays对象", description="")
public class ZdsTendaysDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @TableField("LDATE")
    private String ldate;

    @TableField("LTIME")
    private String ltime;

    @TableField("DAT")
    private String dat;

    @TableField("PIC")
    private byte[] pic;

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

    public String getDat() {
        return dat;
    }

    public void setDat(String dat) {
        this.dat = dat;
    }

    public byte[] getPic() {
        return pic;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }

    public Integer getLtype() {
        return ltype;
    }

    public void setLtype(Integer ltype) {
        this.ltype = ltype;
    }

    @Override
    public String toString() {
        return "ZdsTendays{" +
        "id=" + id +
        ", ldate=" + ldate +
        ", ltime=" + ltime +
        ", dat=" + dat +
        ", pic=" + pic +
        ", ltype=" + ltype +
        "}";
    }
}

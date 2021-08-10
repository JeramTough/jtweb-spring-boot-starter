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
@TableName("ZDS_FIVEDAYS_GX")
@ApiModel(value="ZdsFivedaysGx对象", description="")
public class ZdsFivedaysGxDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableId("LDATE")
    private String ldate;

    @TableField("LTIME")
    private String ltime;

    @TableField("DAT")
    private String dat;


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

    @Override
    public String toString() {
        return "ZdsFivedaysGx{" +
        "ldate=" + ldate +
        ", ltime=" + ltime +
        ", dat=" + dat +
        "}";
    }
}

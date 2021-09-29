package net.ssd.soa.model.entity;

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
 * @since 2021-09-08
 */
@ApiModel(value="ZdsForecastValuation对象", description="")
public class ZdsForecastValuation implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId("LDATE")
    private String lDATE;

    @TableField("LTIME")
    private String lTIME;

    @TableField("DAT")
    private String dAT;

    @TableField("LTYPE")
    private String lTYPE;


    public String getlDATE() {
        return lDATE;
    }

    public void setlDATE(String lDATE) {
        this.lDATE = lDATE;
    }

    public String getlTIME() {
        return lTIME;
    }

    public void setlTIME(String lTIME) {
        this.lTIME = lTIME;
    }

    public String getdAT() {
        return dAT;
    }

    public void setdAT(String dAT) {
        this.dAT = dAT;
    }

    public String getlTYPE() {
        return lTYPE;
    }

    public void setlTYPE(String lTYPE) {
        this.lTYPE = lTYPE;
    }

    @Override
    public String toString() {
        return "ZdsForecastValuation{" +
        "lDATE=" + lDATE +
        ", lTIME=" + lTIME +
        ", dAT=" + dAT +
        ", lTYPE=" + lTYPE +
        "}";
    }
}

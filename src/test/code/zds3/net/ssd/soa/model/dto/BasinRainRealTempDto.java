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
@ApiModel(value="BasinRainRealTemp对象", description="")
public class BasinRainRealTempDto implements Serializable{

    private static final long serialVersionUID=1L;

    private String rCol;

    private Integer a1;

    private Integer a2;

    private Float rVal;

    @TableField("lDate")
    private String lDate;


    public String getrCol() {
        return rCol;
    }

    public void setrCol(String rCol) {
        this.rCol = rCol;
    }

    public Integer geta1() {
        return a1;
    }

    public void seta1(Integer a1) {
        this.a1 = a1;
    }

    public Integer geta2() {
        return a2;
    }

    public void seta2(Integer a2) {
        this.a2 = a2;
    }

    public Float getrVal() {
        return rVal;
    }

    public void setrVal(Float rVal) {
        this.rVal = rVal;
    }

    public String getlDate() {
        return lDate;
    }

    public void setlDate(String lDate) {
        this.lDate = lDate;
    }

    @Override
    public String toString() {
        return "BasinRainRealTemp{" +
        "rCol=" + rCol +
        ", a1=" + a1 +
        ", a2=" + a2 +
        ", rVal=" + rVal +
        ", lDate=" + lDate +
        "}";
    }
}

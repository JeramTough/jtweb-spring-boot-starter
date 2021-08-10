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
@ApiModel(value="ZdsCounty对象", description="")
public class ZdsCountyDto implements Serializable{

    private static final long serialVersionUID=1L;

    private String ldate;

    private String ltime;

    private String dat;

    private byte[] pic;

    @TableField("LTYPE")
    private String ltype;


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

    public String getLtype() {
        return ltype;
    }

    public void setLtype(String ltype) {
        this.ltype = ltype;
    }

    @Override
    public String toString() {
        return "ZdsCounty{" +
        "ldate=" + ldate +
        ", ltime=" + ltime +
        ", dat=" + dat +
        ", pic=" + pic +
        ", ltype=" + ltype +
        "}";
    }
}

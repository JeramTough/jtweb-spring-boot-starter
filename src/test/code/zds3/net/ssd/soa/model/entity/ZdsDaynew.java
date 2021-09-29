package net.ssd.soa.model.entity;

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
@ApiModel(value="ZdsDaynew对象", description="")
public class ZdsDaynew implements Serializable {

    private static final long serialVersionUID=1L;

    private String ldate;

    private String ltime;

    private String ltype;

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

    public String getLtype() {
        return ltype;
    }

    public void setLtype(String ltype) {
        this.ltype = ltype;
    }

    public String getDat() {
        return dat;
    }

    public void setDat(String dat) {
        this.dat = dat;
    }

    @Override
    public String toString() {
        return "ZdsDaynew{" +
        "ldate=" + ldate +
        ", ltime=" + ltime +
        ", ltype=" + ltype +
        ", dat=" + dat +
        "}";
    }
}

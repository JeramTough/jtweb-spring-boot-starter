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
@ApiModel(value="ZdsForecastValuation对象", description="")
public class ZdsForecastValuationDto implements Serializable{

    private static final long serialVersionUID=1L;

    private String ldate;

    private String ltime;

    private String dat;

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

    public String getLtype() {
        return ltype;
    }

    public void setLtype(String ltype) {
        this.ltype = ltype;
    }

    @Override
    public String toString() {
        return "ZdsForecastValuation{" +
        "ldate=" + ldate +
        ", ltime=" + ltime +
        ", dat=" + dat +
        ", ltype=" + ltype +
        "}";
    }
}

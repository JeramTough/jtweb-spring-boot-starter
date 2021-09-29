package net.ssd.soa.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("Typhoonpath")
@ApiModel(value="Typhoonpath对象", description="")
public class Typhoonpath implements Serializable {

    private static final long serialVersionUID=1L;

    @TableField("TYPHOON_ID")
    private String typhoonId;

    @TableField("TYPHOON_CODE")
    private String typhoonCode;

    @TableField("TYPHOON_NAME")
    private String typhoonName;

    @TableField("LATITUDE")
    private String lATITUDE;

    @TableField("LONGITUDE")
    private String lONGITUDE;

    @TableField("PRESSURE")
    private String pRESSURE;

    @TableField("MAXSPEED")
    private String mAXSPEED;

    @TableField("ORDERS")
    private String oRDERS;

    @TableField("DATE_TIME")
    private String dateTime;


    public String getTyphoonId() {
        return typhoonId;
    }

    public void setTyphoonId(String typhoonId) {
        this.typhoonId = typhoonId;
    }

    public String getTyphoonCode() {
        return typhoonCode;
    }

    public void setTyphoonCode(String typhoonCode) {
        this.typhoonCode = typhoonCode;
    }

    public String getTyphoonName() {
        return typhoonName;
    }

    public void setTyphoonName(String typhoonName) {
        this.typhoonName = typhoonName;
    }

    public String getlATITUDE() {
        return lATITUDE;
    }

    public void setlATITUDE(String lATITUDE) {
        this.lATITUDE = lATITUDE;
    }

    public String getlONGITUDE() {
        return lONGITUDE;
    }

    public void setlONGITUDE(String lONGITUDE) {
        this.lONGITUDE = lONGITUDE;
    }

    public String getpRESSURE() {
        return pRESSURE;
    }

    public void setpRESSURE(String pRESSURE) {
        this.pRESSURE = pRESSURE;
    }

    public String getmAXSPEED() {
        return mAXSPEED;
    }

    public void setmAXSPEED(String mAXSPEED) {
        this.mAXSPEED = mAXSPEED;
    }

    public String getoRDERS() {
        return oRDERS;
    }

    public void setoRDERS(String oRDERS) {
        this.oRDERS = oRDERS;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Typhoonpath{" +
        "typhoonId=" + typhoonId +
        ", typhoonCode=" + typhoonCode +
        ", typhoonName=" + typhoonName +
        ", lATITUDE=" + lATITUDE +
        ", lONGITUDE=" + lONGITUDE +
        ", pRESSURE=" + pRESSURE +
        ", mAXSPEED=" + mAXSPEED +
        ", oRDERS=" + oRDERS +
        ", dateTime=" + dateTime +
        "}";
    }
}

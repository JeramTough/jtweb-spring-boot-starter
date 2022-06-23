package com.icloudmap.newerp.model.entity;

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
 * @since 2021-11-24
 */
@TableName("YW_V_考勤数据")
@ApiModel(value="YwV考勤数据对象", description="")
public class YwV考勤数据Dto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableField("NAME")
    private String nAME;

    @TableField("GROUPNAME")
    private String gROUPNAME;

    @TableField("CHECKIN_TYPE")
    private String checkinType;

    @TableField("EXCEPTION_TYPE")
    private String exceptionType;

    @TableField("REALTIME")
    private String rEALTIME;

    @TableField("LOCATION")
    private String lOCATION;

    @TableField("NOTES")
    private String nOTES;


    public String getnAME() {
        return nAME;
    }

    public void setnAME(String nAME) {
        this.nAME = nAME;
    }

    public String getgROUPNAME() {
        return gROUPNAME;
    }

    public void setgROUPNAME(String gROUPNAME) {
        this.gROUPNAME = gROUPNAME;
    }

    public String getCheckinType() {
        return checkinType;
    }

    public void setCheckinType(String checkinType) {
        this.checkinType = checkinType;
    }

    public String getExceptionType() {
        return exceptionType;
    }

    public void setExceptionType(String exceptionType) {
        this.exceptionType = exceptionType;
    }

    public String getrEALTIME() {
        return rEALTIME;
    }

    public void setrEALTIME(String rEALTIME) {
        this.rEALTIME = rEALTIME;
    }

    public String getlOCATION() {
        return lOCATION;
    }

    public void setlOCATION(String lOCATION) {
        this.lOCATION = lOCATION;
    }

    public String getnOTES() {
        return nOTES;
    }

    public void setnOTES(String nOTES) {
        this.nOTES = nOTES;
    }

    @Override
    public String toString() {
        return "YwV考勤数据{" +
        "nAME=" + nAME +
        ", gROUPNAME=" + gROUPNAME +
        ", checkinType=" + checkinType +
        ", exceptionType=" + exceptionType +
        ", rEALTIME=" + rEALTIME +
        ", lOCATION=" + lOCATION +
        ", nOTES=" + nOTES +
        "}";
    }
}

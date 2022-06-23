package com.icloudmap.newerp.model.entity;

import java.math.BigDecimal;
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
@TableName("WX_CHECKIN")
@ApiModel(value = "WxCheckin对象", description = "")
public class WxCheckin implements Serializable{

private static final long serialVersionUID=1L;

    @TableField("USERID")
        private String uSERID;

    @TableField("NAME")
        private String nAME;

    @TableField("GROUPNAME")
        private String gROUPNAME;

    @TableField("CHECKIN_TYPE")
        private String checkinType;

    @TableField("EXCEPTION_TYPE")
        private String exceptionType;

    @TableField("CHECKIN_TIME")
        private BigDecimal checkinTime;

    @TableField("LOCATION_TITLE")
        private String locationTitle;

    @TableField("LOCATION_DETAIL")
        private String locationDetail;

    @TableField("WIFINAME")
        private String wIFINAME;

    @TableField("NOTES")
        private String nOTES;

    @TableField("WIFIMAC")
        private String wIFIMAC;

    @TableField("MEDIAIDS")
        private String mEDIAIDS;

    @TableField("REALTIME")
        private String rEALTIME;


    public String getuSERID(){
            return uSERID;
            }

        public void setuSERID(String uSERID) {
            this.uSERID = uSERID;
            }

    public String getnAME(){
            return nAME;
            }

        public void setnAME(String nAME) {
            this.nAME = nAME;
            }

    public String getgROUPNAME(){
            return gROUPNAME;
            }

        public void setgROUPNAME(String gROUPNAME) {
            this.gROUPNAME = gROUPNAME;
            }

    public String getCheckinType(){
            return checkinType;
            }

        public void setCheckinType(String checkinType) {
            this.checkinType = checkinType;
            }

    public String getExceptionType(){
            return exceptionType;
            }

        public void setExceptionType(String exceptionType) {
            this.exceptionType = exceptionType;
            }

    public BigDecimal getCheckinTime(){
            return checkinTime;
            }

        public void setCheckinTime(BigDecimal checkinTime) {
            this.checkinTime = checkinTime;
            }

    public String getLocationTitle(){
            return locationTitle;
            }

        public void setLocationTitle(String locationTitle) {
            this.locationTitle = locationTitle;
            }

    public String getLocationDetail(){
            return locationDetail;
            }

        public void setLocationDetail(String locationDetail) {
            this.locationDetail = locationDetail;
            }

    public String getwIFINAME(){
            return wIFINAME;
            }

        public void setwIFINAME(String wIFINAME) {
            this.wIFINAME = wIFINAME;
            }

    public String getnOTES(){
            return nOTES;
            }

        public void setnOTES(String nOTES) {
            this.nOTES = nOTES;
            }

    public String getwIFIMAC(){
            return wIFIMAC;
            }

        public void setwIFIMAC(String wIFIMAC) {
            this.wIFIMAC = wIFIMAC;
            }

    public String getmEDIAIDS(){
            return mEDIAIDS;
            }

        public void setmEDIAIDS(String mEDIAIDS) {
            this.mEDIAIDS = mEDIAIDS;
            }

    public String getrEALTIME(){
            return rEALTIME;
            }

        public void setrEALTIME(String rEALTIME) {
            this.rEALTIME = rEALTIME;
            }
    
@Override
public String toString() {
        return "WxCheckin{" +
                "uSERID=" + uSERID +
                ", nAME=" + nAME +
                ", gROUPNAME=" + gROUPNAME +
                ", checkinType=" + checkinType +
                ", exceptionType=" + exceptionType +
                ", checkinTime=" + checkinTime +
                ", locationTitle=" + locationTitle +
                ", locationDetail=" + locationDetail +
                ", wIFINAME=" + wIFINAME +
                ", nOTES=" + nOTES +
                ", wIFIMAC=" + wIFIMAC +
                ", mEDIAIDS=" + mEDIAIDS +
                ", rEALTIME=" + rEALTIME +
        "}";
        }
        }

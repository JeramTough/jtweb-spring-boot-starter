package net.ssd.InterfaceService.gxsmswc.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 大藤峡警告信息
 * </p>
 *
 * @author JeramTough
 * @since 2020-09-16
 */
@TableName("daTengXia_alarm_message")
@ApiModel(value="DatengxiaAlarmMessage对象", description="大藤峡警告信息")
public class DatengxiaAlarmMessageDto implements Serializable{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "报警日期")
    @TableField("alarmDate")
    private String alarmDate;

    @ApiModelProperty(value = "报警站点名称")
    @TableField("alarmSite")
    private String alarmSite;

    @ApiModelProperty(value = "报警站点编号")
    @TableField("alarmSiteCode")
    private String alarmSiteCode;

    @ApiModelProperty(value = "报警信息")
    @TableField("alarmInfo")
    private String alarmInfo;

    @ApiModelProperty(value = "报警类型 rain:降水、temp:气温、wind:大风")
    @TableField("alarmType")
    private String alarmType;

    @ApiModelProperty(value = "sRead:是否已读(0:未读、1:已读)")
    @TableField("isRead")
    private Integer isRead;

    @ApiModelProperty(value = "状态：1有效，0无效")
    private Integer status;

    @ApiModelProperty(value = "预警阀值类型")
    @TableField("alarmThresholdType")
    private String alarmThresholdType;

    @ApiModelProperty(value = "距离关注点的距离（公里）")
    private String distance;

    @ApiModelProperty(value = "经度")
    private String latitude;

    @ApiModelProperty(value = "纬度")
    private String longitude;

    @ApiModelProperty(value = "其关注点站点编码")
    @TableField("focusStationCode")
    private String focusStationCode;

    @ApiModelProperty(value = "数据插入时间")
    @TableField("createTime")
    private String createTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAlarmDate() {
        return alarmDate;
    }

    public void setAlarmDate(String alarmDate) {
        this.alarmDate = alarmDate;
    }

    public String getAlarmSite() {
        return alarmSite;
    }

    public void setAlarmSite(String alarmSite) {
        this.alarmSite = alarmSite;
    }

    public String getAlarmSiteCode() {
        return alarmSiteCode;
    }

    public void setAlarmSiteCode(String alarmSiteCode) {
        this.alarmSiteCode = alarmSiteCode;
    }

    public String getAlarmInfo() {
        return alarmInfo;
    }

    public void setAlarmInfo(String alarmInfo) {
        this.alarmInfo = alarmInfo;
    }

    public String getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(String alarmType) {
        this.alarmType = alarmType;
    }

    public Integer getIsRead() {
        return isRead;
    }

    public void setIsRead(Integer isRead) {
        this.isRead = isRead;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAlarmThresholdType() {
        return alarmThresholdType;
    }

    public void setAlarmThresholdType(String alarmThresholdType) {
        this.alarmThresholdType = alarmThresholdType;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getFocusStationCode() {
        return focusStationCode;
    }

    public void setFocusStationCode(String focusStationCode) {
        this.focusStationCode = focusStationCode;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "DatengxiaAlarmMessage{" +
        "id=" + id +
        ", alarmDate=" + alarmDate +
        ", alarmSite=" + alarmSite +
        ", alarmSiteCode=" + alarmSiteCode +
        ", alarmInfo=" + alarmInfo +
        ", alarmType=" + alarmType +
        ", isRead=" + isRead +
        ", status=" + status +
        ", alarmThresholdType=" + alarmThresholdType +
        ", distance=" + distance +
        ", latitude=" + latitude +
        ", longitude=" + longitude +
        ", focusStationCode=" + focusStationCode +
        ", createTime=" + createTime +
        "}";
    }
}

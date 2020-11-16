package net.ssd.InterfaceService.gxsmswc.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 大藤峡关注点
 * </p>
 *
 * @author JeramTough
 * @since 2020-09-16
 */
@TableName("daTengXia_focus_station")
@ApiModel(value="DatengxiaFocusStation对象", description="大藤峡关注点")
public class DatengxiaFocusStation implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自增长主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "代码")
    private String code;

    @ApiModelProperty(value = "创建时间")
    @TableField("createTime")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "第一警告圈范围")
    @TableField("firstAlarmRangeKM")
    private String firstAlarmRangeKM;

    @ApiModelProperty(value = "纬度")
    private Float latitude;

    @ApiModelProperty(value = "经度")
    private Float longitude;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "100分钟降水")
    private String pre100min;

    @ApiModelProperty(value = "105分钟降水")
    private String pre105min;

    @ApiModelProperty(value = "10分钟降水")
    private String pre10min;

    @ApiModelProperty(value = "110分钟降水")
    private String pre110min;

    @ApiModelProperty(value = "115分钟降水")
    private String pre115min;

    @ApiModelProperty(value = "15分钟降水")
    private String pre15min;

    @ApiModelProperty(value = "1小时降水")
    private String pre1h;

    @ApiModelProperty(value = "20分钟降水")
    private String pre20min;

    @ApiModelProperty(value = "25分钟降水")
    private String pre25min;

    @ApiModelProperty(value = "2小时降水")
    private String pre2h;

    @ApiModelProperty(value = "30分钟降水")
    private String pre30min;

    @ApiModelProperty(value = "35分钟降水")
    private String pre35min;

    @ApiModelProperty(value = "40分钟降水")
    private String pre40min;

    @ApiModelProperty(value = "45分钟降水")
    private String pre45min;

    @ApiModelProperty(value = "50分钟降水")
    private String pre50min;

    @ApiModelProperty(value = "55分钟降水")
    private String pre55min;

    @ApiModelProperty(value = "5分钟降水")
    private String pre5min;

    @ApiModelProperty(value = "65分钟降水")
    private String pre65min;

    @ApiModelProperty(value = "70分钟降水")
    private String pre70min;

    @ApiModelProperty(value = "75分钟降水")
    private String pre75min;

    @ApiModelProperty(value = "80分钟降水")
    private String pre80min;

    @ApiModelProperty(value = "85分钟降水")
    private String pre85min;

    @ApiModelProperty(value = "90分钟降水")
    private String pre90min;

    @ApiModelProperty(value = "95分钟降水")
    private String pre95min;

    @ApiModelProperty(value = "第二警告圈范围")
    @TableField("secondaryAlarmRangeKM")
    private String secondaryAlarmRangeKM;

    @ApiModelProperty(value = "状态：1有效0无效")
    private Integer status;

    @ApiModelProperty(value = "气温")
    private String temp;

    @ApiModelProperty(value = "第三警告圈范围")
    @TableField("thirdAlarmRangeKM")
    private String thirdAlarmRangeKM;

    @ApiModelProperty(value = "风")
    private String wind;

    @ApiModelProperty(value = "默认警告圈范围")
    @TableField("defaultAlarmRangeKM")
    private String defaultAlarmRangeKM;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getFirstAlarmRangeKM() {
        return firstAlarmRangeKM;
    }

    public void setFirstAlarmRangeKM(String firstAlarmRangeKM) {
        this.firstAlarmRangeKM = firstAlarmRangeKM;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPre100min() {
        return pre100min;
    }

    public void setPre100min(String pre100min) {
        this.pre100min = pre100min;
    }

    public String getPre105min() {
        return pre105min;
    }

    public void setPre105min(String pre105min) {
        this.pre105min = pre105min;
    }

    public String getPre10min() {
        return pre10min;
    }

    public void setPre10min(String pre10min) {
        this.pre10min = pre10min;
    }

    public String getPre110min() {
        return pre110min;
    }

    public void setPre110min(String pre110min) {
        this.pre110min = pre110min;
    }

    public String getPre115min() {
        return pre115min;
    }

    public void setPre115min(String pre115min) {
        this.pre115min = pre115min;
    }

    public String getPre15min() {
        return pre15min;
    }

    public void setPre15min(String pre15min) {
        this.pre15min = pre15min;
    }

    public String getPre1h() {
        return pre1h;
    }

    public void setPre1h(String pre1h) {
        this.pre1h = pre1h;
    }

    public String getPre20min() {
        return pre20min;
    }

    public void setPre20min(String pre20min) {
        this.pre20min = pre20min;
    }

    public String getPre25min() {
        return pre25min;
    }

    public void setPre25min(String pre25min) {
        this.pre25min = pre25min;
    }

    public String getPre2h() {
        return pre2h;
    }

    public void setPre2h(String pre2h) {
        this.pre2h = pre2h;
    }

    public String getPre30min() {
        return pre30min;
    }

    public void setPre30min(String pre30min) {
        this.pre30min = pre30min;
    }

    public String getPre35min() {
        return pre35min;
    }

    public void setPre35min(String pre35min) {
        this.pre35min = pre35min;
    }

    public String getPre40min() {
        return pre40min;
    }

    public void setPre40min(String pre40min) {
        this.pre40min = pre40min;
    }

    public String getPre45min() {
        return pre45min;
    }

    public void setPre45min(String pre45min) {
        this.pre45min = pre45min;
    }

    public String getPre50min() {
        return pre50min;
    }

    public void setPre50min(String pre50min) {
        this.pre50min = pre50min;
    }

    public String getPre55min() {
        return pre55min;
    }

    public void setPre55min(String pre55min) {
        this.pre55min = pre55min;
    }

    public String getPre5min() {
        return pre5min;
    }

    public void setPre5min(String pre5min) {
        this.pre5min = pre5min;
    }

    public String getPre65min() {
        return pre65min;
    }

    public void setPre65min(String pre65min) {
        this.pre65min = pre65min;
    }

    public String getPre70min() {
        return pre70min;
    }

    public void setPre70min(String pre70min) {
        this.pre70min = pre70min;
    }

    public String getPre75min() {
        return pre75min;
    }

    public void setPre75min(String pre75min) {
        this.pre75min = pre75min;
    }

    public String getPre80min() {
        return pre80min;
    }

    public void setPre80min(String pre80min) {
        this.pre80min = pre80min;
    }

    public String getPre85min() {
        return pre85min;
    }

    public void setPre85min(String pre85min) {
        this.pre85min = pre85min;
    }

    public String getPre90min() {
        return pre90min;
    }

    public void setPre90min(String pre90min) {
        this.pre90min = pre90min;
    }

    public String getPre95min() {
        return pre95min;
    }

    public void setPre95min(String pre95min) {
        this.pre95min = pre95min;
    }

    public String getSecondaryAlarmRangeKM() {
        return secondaryAlarmRangeKM;
    }

    public void setSecondaryAlarmRangeKM(String secondaryAlarmRangeKM) {
        this.secondaryAlarmRangeKM = secondaryAlarmRangeKM;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getThirdAlarmRangeKM() {
        return thirdAlarmRangeKM;
    }

    public void setThirdAlarmRangeKM(String thirdAlarmRangeKM) {
        this.thirdAlarmRangeKM = thirdAlarmRangeKM;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public String getDefaultAlarmRangeKM() {
        return defaultAlarmRangeKM;
    }

    public void setDefaultAlarmRangeKM(String defaultAlarmRangeKM) {
        this.defaultAlarmRangeKM = defaultAlarmRangeKM;
    }

    @Override
    public String toString() {
        return "DatengxiaFocusStation{" +
        "id=" + id +
        ", code=" + code +
        ", createTime=" + createTime +
        ", firstAlarmRangeKM=" + firstAlarmRangeKM +
        ", latitude=" + latitude +
        ", longitude=" + longitude +
        ", name=" + name +
        ", pre100min=" + pre100min +
        ", pre105min=" + pre105min +
        ", pre10min=" + pre10min +
        ", pre110min=" + pre110min +
        ", pre115min=" + pre115min +
        ", pre15min=" + pre15min +
        ", pre1h=" + pre1h +
        ", pre20min=" + pre20min +
        ", pre25min=" + pre25min +
        ", pre2h=" + pre2h +
        ", pre30min=" + pre30min +
        ", pre35min=" + pre35min +
        ", pre40min=" + pre40min +
        ", pre45min=" + pre45min +
        ", pre50min=" + pre50min +
        ", pre55min=" + pre55min +
        ", pre5min=" + pre5min +
        ", pre65min=" + pre65min +
        ", pre70min=" + pre70min +
        ", pre75min=" + pre75min +
        ", pre80min=" + pre80min +
        ", pre85min=" + pre85min +
        ", pre90min=" + pre90min +
        ", pre95min=" + pre95min +
        ", secondaryAlarmRangeKM=" + secondaryAlarmRangeKM +
        ", status=" + status +
        ", temp=" + temp +
        ", thirdAlarmRangeKM=" + thirdAlarmRangeKM +
        ", wind=" + wind +
        ", defaultAlarmRangeKM=" + defaultAlarmRangeKM +
        "}";
    }
}

package net.ssd.zds.model.entity;

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
 * @author JeramTough
 * @since 2021-04-25
 */
@TableName("Typhoonpath")
@ApiModel(value="Typhoonpath对象", description="")
public class TyphoonpathDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableField("TYPHOON_ID")
    private String typhoonId;

    @TableField("TYPHOON_CODE")
    private String typhoonCode;

    @TableField("TYPHOON_NAME")
    private String typhoonName;

    @TableField("LATITUDE")
    private String latitude;

    @TableField("LONGITUDE")
    private String longitude;

    @TableField("PRESSURE")
    private String pressure;

    @TableField("MAXSPEED")
    private String maxspeed;

    @TableField("ORDERS")
    private String orders;

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

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(String maxspeed) {
        this.maxspeed = maxspeed;
    }

    public String getOrders() {
        return orders;
    }

    public void setOrders(String orders) {
        this.orders = orders;
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
        ", latitude=" + latitude +
        ", longitude=" + longitude +
        ", pressure=" + pressure +
        ", maxspeed=" + maxspeed +
        ", orders=" + orders +
        ", dateTime=" + dateTime +
        "}";
    }
}

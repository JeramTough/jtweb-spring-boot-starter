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
@ApiModel(value="Typhoonpath对象", description="")
public class Typhoonpath implements Serializable {

    private static final long serialVersionUID=1L;

    private String typhoonId;

    private String typhoonCode;

    private String typhoonName;

    private String latitude;

    private String longitude;

    private String pressure;

    private String maxspeed;

    private String orders;

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

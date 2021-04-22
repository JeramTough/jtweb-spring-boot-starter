package net.ssd.apiserver.apigather.zds.model.entity;

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
 * @since 2021-03-08
 */
@ApiModel(value="Typhoonlocation对象", description="")
public class Typhoonlocation implements Serializable {

    private static final long serialVersionUID=1L;

    @TableField("ID")
    private String id;

    @TableField("TYPHOON_ID")
    private String typhoonId;

    @TableField("STATION_NAME")
    private String stationName;

    @TableField("DATE_TIME")
    private String dateTime;

    @TableField("LATITUDE")
    private String latitude;

    @TableField("LONGITUDE")
    private String longitude;

    @TableField("TYPHOON_GRADE")
    private String typhoonGrade;

    @TableField("PRESSURE")
    private String pressure;

    @TableField("WIND_POWER")
    private String windPower;

    @TableField("RADIUS_7")
    private String radius7;

    @TableField("RADIUS_10")
    private String radius10;

    @TableField("MOVE_SPEED")
    private String moveSpeed;

    @TableField("MOVE_D")
    private String moveD;

    @TableField("TYPHOON_NAME")
    private String typhoonName;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTyphoonId() {
        return typhoonId;
    }

    public void setTyphoonId(String typhoonId) {
        this.typhoonId = typhoonId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
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

    public String getTyphoonGrade() {
        return typhoonGrade;
    }

    public void setTyphoonGrade(String typhoonGrade) {
        this.typhoonGrade = typhoonGrade;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getWindPower() {
        return windPower;
    }

    public void setWindPower(String windPower) {
        this.windPower = windPower;
    }

    public String getRadius7() {
        return radius7;
    }

    public void setRadius7(String radius7) {
        this.radius7 = radius7;
    }

    public String getRadius10() {
        return radius10;
    }

    public void setRadius10(String radius10) {
        this.radius10 = radius10;
    }

    public String getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(String moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public String getMoveD() {
        return moveD;
    }

    public void setMoveD(String moveD) {
        this.moveD = moveD;
    }

    public String getTyphoonName() {
        return typhoonName;
    }

    public void setTyphoonName(String typhoonName) {
        this.typhoonName = typhoonName;
    }

    @Override
    public String toString() {
        return "Typhoonlocation{" +
        "id=" + id +
        ", typhoonId=" + typhoonId +
        ", stationName=" + stationName +
        ", dateTime=" + dateTime +
        ", latitude=" + latitude +
        ", longitude=" + longitude +
        ", typhoonGrade=" + typhoonGrade +
        ", pressure=" + pressure +
        ", windPower=" + windPower +
        ", radius7=" + radius7 +
        ", radius10=" + radius10 +
        ", moveSpeed=" + moveSpeed +
        ", moveD=" + moveD +
        ", typhoonName=" + typhoonName +
        "}";
    }
}

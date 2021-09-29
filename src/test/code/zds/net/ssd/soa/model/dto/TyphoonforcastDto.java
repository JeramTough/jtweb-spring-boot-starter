package net.ssd.soa.model.entity;

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
@ApiModel(value="Typhoonforcast对象", description="")
public class TyphoonforcastDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableField("TYPHOON_ID")
    private String typhoonId;

    @TableField("STATION_CODE")
    private String stationCode;

    @TableField("CURRENT_TIME")
    private String currentTime;

    @TableField("PREDICT_TIME")
    private String predictTime;

    @TableField("LONGITUDE")
    private String lONGITUDE;

    @TableField("LATITUDE")
    private String lATITUDE;

    @TableField("PRESSURE")
    private String pRESSURE;

    @TableField("WIND_POWER")
    private String windPower;

    @TableField("RADIUS_7")
    private String radius7;

    @TableField("RADIUS_10")
    private String radius10;

    @TableField("MOVE_SPEED")
    private String moveSpeed;

    @TableField("MOVE_DIRECTION")
    private String moveDirection;

    @TableField("AFFECT_AFFECT")
    private String affectAffect;

    @TableField("ID")
    private Integer iD;


    public String getTyphoonId() {
        return typhoonId;
    }

    public void setTyphoonId(String typhoonId) {
        this.typhoonId = typhoonId;
    }

    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    public String getPredictTime() {
        return predictTime;
    }

    public void setPredictTime(String predictTime) {
        this.predictTime = predictTime;
    }

    public String getlONGITUDE() {
        return lONGITUDE;
    }

    public void setlONGITUDE(String lONGITUDE) {
        this.lONGITUDE = lONGITUDE;
    }

    public String getlATITUDE() {
        return lATITUDE;
    }

    public void setlATITUDE(String lATITUDE) {
        this.lATITUDE = lATITUDE;
    }

    public String getpRESSURE() {
        return pRESSURE;
    }

    public void setpRESSURE(String pRESSURE) {
        this.pRESSURE = pRESSURE;
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

    public String getMoveDirection() {
        return moveDirection;
    }

    public void setMoveDirection(String moveDirection) {
        this.moveDirection = moveDirection;
    }

    public String getAffectAffect() {
        return affectAffect;
    }

    public void setAffectAffect(String affectAffect) {
        this.affectAffect = affectAffect;
    }

    public Integer getiD() {
        return iD;
    }

    public void setiD(Integer iD) {
        this.iD = iD;
    }

    @Override
    public String toString() {
        return "Typhoonforcast{" +
        "typhoonId=" + typhoonId +
        ", stationCode=" + stationCode +
        ", currentTime=" + currentTime +
        ", predictTime=" + predictTime +
        ", lONGITUDE=" + lONGITUDE +
        ", lATITUDE=" + lATITUDE +
        ", pRESSURE=" + pRESSURE +
        ", windPower=" + windPower +
        ", radius7=" + radius7 +
        ", radius10=" + radius10 +
        ", moveSpeed=" + moveSpeed +
        ", moveDirection=" + moveDirection +
        ", affectAffect=" + affectAffect +
        ", iD=" + iD +
        "}";
    }
}

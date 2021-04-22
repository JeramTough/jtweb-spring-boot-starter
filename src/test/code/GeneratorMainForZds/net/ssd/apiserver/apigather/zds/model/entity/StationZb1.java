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
@ApiModel(value="StationZb1对象", description="")
public class StationZb1 implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer staId;

    private String staJingdu;

    private String staWeidu;

    private String staZone;

    private String staBelong;

    private String staShiqu;

    private String staXiang;

    private String staName;

    @TableField("sta_N")
    private String staN;

    private String allname;

    private String sim;

    private String commType;

    private Boolean staOk;

    private String staDate;

    private String staType;

    private Boolean staType3;

    private Boolean strAuto;

    private Boolean staType1;

    private String priName;

    private String staHeight;

    private String position;

    private Boolean cityreal;

    private Boolean countyrain;


    public Integer getStaId() {
        return staId;
    }

    public void setStaId(Integer staId) {
        this.staId = staId;
    }

    public String getStaJingdu() {
        return staJingdu;
    }

    public void setStaJingdu(String staJingdu) {
        this.staJingdu = staJingdu;
    }

    public String getStaWeidu() {
        return staWeidu;
    }

    public void setStaWeidu(String staWeidu) {
        this.staWeidu = staWeidu;
    }

    public String getStaZone() {
        return staZone;
    }

    public void setStaZone(String staZone) {
        this.staZone = staZone;
    }

    public String getStaBelong() {
        return staBelong;
    }

    public void setStaBelong(String staBelong) {
        this.staBelong = staBelong;
    }

    public String getStaShiqu() {
        return staShiqu;
    }

    public void setStaShiqu(String staShiqu) {
        this.staShiqu = staShiqu;
    }

    public String getStaXiang() {
        return staXiang;
    }

    public void setStaXiang(String staXiang) {
        this.staXiang = staXiang;
    }

    public String getStaName() {
        return staName;
    }

    public void setStaName(String staName) {
        this.staName = staName;
    }

    public String getStaN() {
        return staN;
    }

    public void setStaN(String staN) {
        this.staN = staN;
    }

    public String getAllname() {
        return allname;
    }

    public void setAllname(String allname) {
        this.allname = allname;
    }

    public String getSim() {
        return sim;
    }

    public void setSim(String sim) {
        this.sim = sim;
    }

    public String getCommType() {
        return commType;
    }

    public void setCommType(String commType) {
        this.commType = commType;
    }

    public Boolean getStaOk() {
        return staOk;
    }

    public void setStaOk(Boolean staOk) {
        this.staOk = staOk;
    }

    public String getStaDate() {
        return staDate;
    }

    public void setStaDate(String staDate) {
        this.staDate = staDate;
    }

    public String getStaType() {
        return staType;
    }

    public void setStaType(String staType) {
        this.staType = staType;
    }

    public Boolean getStaType3() {
        return staType3;
    }

    public void setStaType3(Boolean staType3) {
        this.staType3 = staType3;
    }

    public Boolean getStrAuto() {
        return strAuto;
    }

    public void setStrAuto(Boolean strAuto) {
        this.strAuto = strAuto;
    }

    public Boolean getStaType1() {
        return staType1;
    }

    public void setStaType1(Boolean staType1) {
        this.staType1 = staType1;
    }

    public String getPriName() {
        return priName;
    }

    public void setPriName(String priName) {
        this.priName = priName;
    }

    public String getStaHeight() {
        return staHeight;
    }

    public void setStaHeight(String staHeight) {
        this.staHeight = staHeight;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Boolean getCityreal() {
        return cityreal;
    }

    public void setCityreal(Boolean cityreal) {
        this.cityreal = cityreal;
    }

    public Boolean getCountyrain() {
        return countyrain;
    }

    public void setCountyrain(Boolean countyrain) {
        this.countyrain = countyrain;
    }

    @Override
    public String toString() {
        return "StationZb1{" +
        "staId=" + staId +
        ", staJingdu=" + staJingdu +
        ", staWeidu=" + staWeidu +
        ", staZone=" + staZone +
        ", staBelong=" + staBelong +
        ", staShiqu=" + staShiqu +
        ", staXiang=" + staXiang +
        ", staName=" + staName +
        ", staN=" + staN +
        ", allname=" + allname +
        ", sim=" + sim +
        ", commType=" + commType +
        ", staOk=" + staOk +
        ", staDate=" + staDate +
        ", staType=" + staType +
        ", staType3=" + staType3 +
        ", strAuto=" + strAuto +
        ", staType1=" + staType1 +
        ", priName=" + priName +
        ", staHeight=" + staHeight +
        ", position=" + position +
        ", cityreal=" + cityreal +
        ", countyrain=" + countyrain +
        "}";
    }
}

package net.ssd.apiserver.apigather.zds.model.entity;

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
@ApiModel(value="HydropowerBasin对象", description="")
public class HydropowerBasinDto implements Serializable{

    private static final long serialVersionUID=1L;

    private String basinId;

    private Float hpId;

    private String zdsId;

    private String hpName;

    private Float basinArea;


    public String getBasinId() {
        return basinId;
    }

    public void setBasinId(String basinId) {
        this.basinId = basinId;
    }

    public Float getHpId() {
        return hpId;
    }

    public void setHpId(Float hpId) {
        this.hpId = hpId;
    }

    public String getZdsId() {
        return zdsId;
    }

    public void setZdsId(String zdsId) {
        this.zdsId = zdsId;
    }

    public String getHpName() {
        return hpName;
    }

    public void setHpName(String hpName) {
        this.hpName = hpName;
    }

    public Float getBasinArea() {
        return basinArea;
    }

    public void setBasinArea(Float basinArea) {
        this.basinArea = basinArea;
    }

    @Override
    public String toString() {
        return "HydropowerBasin{" +
        "basinId=" + basinId +
        ", hpId=" + hpId +
        ", zdsId=" + zdsId +
        ", hpName=" + hpName +
        ", basinArea=" + basinArea +
        "}";
    }
}

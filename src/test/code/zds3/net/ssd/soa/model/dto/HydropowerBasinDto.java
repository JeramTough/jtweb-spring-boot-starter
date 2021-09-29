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
@ApiModel(value="HydropowerBasin对象", description="")
public class HydropowerBasinDto implements Serializable{

    private static final long serialVersionUID=1L;

    private String basinId;

    private Double hpId;

    private String zdsId;

    private String hpName;

    private Double basinArea;


    public String getBasinId() {
        return basinId;
    }

    public void setBasinId(String basinId) {
        this.basinId = basinId;
    }

    public Double getHpId() {
        return hpId;
    }

    public void setHpId(Double hpId) {
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

    public Double getBasinArea() {
        return basinArea;
    }

    public void setBasinArea(Double basinArea) {
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

package net.ssd.soa.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("zds_Lightning")
@ApiModel(value="ZdsLightning对象", description="")
public class ZdsLightningDto implements Serializable{

    private static final long serialVersionUID=1L;

    private String id;

    private String ldate;

    private String lon;

    private String lat;

    private String litCurrent;

    private String mars;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLdate() {
        return ldate;
    }

    public void setLdate(String ldate) {
        this.ldate = ldate;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLitCurrent() {
        return litCurrent;
    }

    public void setLitCurrent(String litCurrent) {
        this.litCurrent = litCurrent;
    }

    public String getMars() {
        return mars;
    }

    public void setMars(String mars) {
        this.mars = mars;
    }

    @Override
    public String toString() {
        return "ZdsLightning{" +
        "id=" + id +
        ", ldate=" + ldate +
        ", lon=" + lon +
        ", lat=" + lat +
        ", litCurrent=" + litCurrent +
        ", mars=" + mars +
        "}";
    }
}

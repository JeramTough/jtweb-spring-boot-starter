package net.ssd.InterfaceService.gxsmswc.model.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author JeramTough
 * @since 2020-09-16
 */
@ApiModel(value="WindElectricTest对象", description="")
public class WindElectricTestDto implements Serializable{

    private static final long serialVersionUID=1L;

    private String lon;

    private String lat;


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

    @Override
    public String toString() {
        return "WindElectricTest{" +
        "lon=" + lon +
        ", lat=" + lat +
        "}";
    }
}

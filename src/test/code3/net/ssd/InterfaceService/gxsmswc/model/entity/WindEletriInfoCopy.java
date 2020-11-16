package net.ssd.InterfaceService.gxsmswc.model.entity;

import java.time.LocalDateTime;
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
 * @since 2020-09-16
 */
@ApiModel(value="WindEletriInfoCopy对象", description="")
public class WindEletriInfoCopy implements Serializable {

    private static final long serialVersionUID=1L;

    private Float id;

    private Float height;

    @TableField("saveTime")
    private LocalDateTime saveTime;

    private Float lon;

    private Float name;

    private Float lat;


    public Float getId() {
        return id;
    }

    public void setId(Float id) {
        this.id = id;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public LocalDateTime getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(LocalDateTime saveTime) {
        this.saveTime = saveTime;
    }

    public Float getLon() {
        return lon;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }

    public Float getName() {
        return name;
    }

    public void setName(Float name) {
        this.name = name;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "WindEletriInfoCopy{" +
        "id=" + id +
        ", height=" + height +
        ", saveTime=" + saveTime +
        ", lon=" + lon +
        ", name=" + name +
        ", lat=" + lat +
        "}";
    }
}

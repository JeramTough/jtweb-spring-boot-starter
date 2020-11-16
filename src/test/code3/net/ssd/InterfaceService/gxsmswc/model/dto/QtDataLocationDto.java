package net.ssd.InterfaceService.gxsmswc.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="QtDataLocation对象", description="")
public class QtDataLocationDto implements Serializable{

    private static final long serialVersionUID=1L;

    private String lat;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String project;

    private String lon;


    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    @Override
    public String toString() {
        return "QtDataLocation{" +
        "lat=" + lat +
        ", id=" + id +
        ", project=" + project +
        ", lon=" + lon +
        "}";
    }
}

package net.ssd.soa.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("CityStaInf")
@ApiModel(value="Citystainf对象", description="")
public class CitystainfDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableId("Id")
    private Integer id;

    @TableField("BasinId")
    private String basinId;

    @TableField("CityName")
    private String cityName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBasinId() {
        return basinId;
    }

    public void setBasinId(String basinId) {
        this.basinId = basinId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "Citystainf{" +
        "id=" + id +
        ", basinId=" + basinId +
        ", cityName=" + cityName +
        "}";
    }
}

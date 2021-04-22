package net.ssd.apiserver.apigather.zds.model.entity;

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
 * @since 2021-03-08
 */
@TableName("CityStaInf")
@ApiModel(value="Citystainf对象", description="")
public class CitystainfDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableId("Id")
    private Integer id;

    @TableField("BasinId")
    private String basinid;

    @TableField("CityName")
    private String cityname;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBasinid() {
        return basinid;
    }

    public void setBasinid(String basinid) {
        this.basinid = basinid;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    @Override
    public String toString() {
        return "Citystainf{" +
        "id=" + id +
        ", basinid=" + basinid +
        ", cityname=" + cityname +
        "}";
    }
}

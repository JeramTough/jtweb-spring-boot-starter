package net.ssd.zds.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
 * @since 2021-04-25
 */
@TableName("AutoStaInf")
@ApiModel(value="Autostainf对象", description="")
public class Autostainf implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    @TableField("BasinId")
    private String basinid;

    @TableField("countyName")
    private String countyname;


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

    public String getCountyname() {
        return countyname;
    }

    public void setCountyname(String countyname) {
        this.countyname = countyname;
    }

    @Override
    public String toString() {
        return "Autostainf{" +
        "id=" + id +
        ", basinid=" + basinid +
        ", countyname=" + countyname +
        "}";
    }
}

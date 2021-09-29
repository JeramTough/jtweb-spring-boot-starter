package net.ssd.soa.model.entity;

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
 * @author WeiBoWen
 * @since 2021-09-08
 */
@TableName("AutoStaInf")
@ApiModel(value="Autostainf对象", description="")
public class Autostainf implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    @TableField("BasinId")
    private String basinId;

    @TableField("countyName")
    private String countyName;


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

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    @Override
    public String toString() {
        return "Autostainf{" +
        "id=" + id +
        ", basinId=" + basinId +
        ", countyName=" + countyName +
        "}";
    }
}

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
@TableName("BasinStaInf")
@ApiModel(value="Basinstainf对象", description="")
public class Basinstainf implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    @TableField("BasinId")
    private String basinId;

    @TableField("BasinName")
    private String basinName;

    @TableField("Area")
    private String area;

    private String zdsId;

    private Integer idNew;

    private Integer idNew2;

    private Integer idNew3;


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

    public String getBasinName() {
        return basinName;
    }

    public void setBasinName(String basinName) {
        this.basinName = basinName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getZdsId() {
        return zdsId;
    }

    public void setZdsId(String zdsId) {
        this.zdsId = zdsId;
    }

    public Integer getIdNew() {
        return idNew;
    }

    public void setIdNew(Integer idNew) {
        this.idNew = idNew;
    }

    public Integer getIdNew2() {
        return idNew2;
    }

    public void setIdNew2(Integer idNew2) {
        this.idNew2 = idNew2;
    }

    public Integer getIdNew3() {
        return idNew3;
    }

    public void setIdNew3(Integer idNew3) {
        this.idNew3 = idNew3;
    }

    @Override
    public String toString() {
        return "Basinstainf{" +
        "id=" + id +
        ", basinId=" + basinId +
        ", basinName=" + basinName +
        ", area=" + area +
        ", zdsId=" + zdsId +
        ", idNew=" + idNew +
        ", idNew2=" + idNew2 +
        ", idNew3=" + idNew3 +
        "}";
    }
}

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
@TableName("BasinStaInf")
@ApiModel(value="Basinstainf对象", description="")
public class Basinstainf implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    @TableField("BasinId")
    private String basinid;

    @TableField("BasinName")
    private String basinname;

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

    public String getBasinid() {
        return basinid;
    }

    public void setBasinid(String basinid) {
        this.basinid = basinid;
    }

    public String getBasinname() {
        return basinname;
    }

    public void setBasinname(String basinname) {
        this.basinname = basinname;
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
        ", basinid=" + basinid +
        ", basinname=" + basinname +
        ", area=" + area +
        ", zdsId=" + zdsId +
        ", idNew=" + idNew +
        ", idNew2=" + idNew2 +
        ", idNew3=" + idNew3 +
        "}";
    }
}

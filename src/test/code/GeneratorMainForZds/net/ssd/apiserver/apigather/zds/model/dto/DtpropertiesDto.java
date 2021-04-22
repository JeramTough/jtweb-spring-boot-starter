package net.ssd.apiserver.apigather.zds.model.entity;

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
 * @author WeiBoWen
 * @since 2021-03-08
 */
@ApiModel(value="Dtproperties对象", description="")
public class DtpropertiesDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer objectid;

    private String property;

    private String value;

    private String uvalue;

    private byte[] lvalue;

    private Integer version;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getObjectid() {
        return objectid;
    }

    public void setObjectid(Integer objectid) {
        this.objectid = objectid;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUvalue() {
        return uvalue;
    }

    public void setUvalue(String uvalue) {
        this.uvalue = uvalue;
    }

    public byte[] getLvalue() {
        return lvalue;
    }

    public void setLvalue(byte[] lvalue) {
        this.lvalue = lvalue;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Dtproperties{" +
        "id=" + id +
        ", objectid=" + objectid +
        ", property=" + property +
        ", value=" + value +
        ", uvalue=" + uvalue +
        ", lvalue=" + lvalue +
        ", version=" + version +
        "}";
    }
}

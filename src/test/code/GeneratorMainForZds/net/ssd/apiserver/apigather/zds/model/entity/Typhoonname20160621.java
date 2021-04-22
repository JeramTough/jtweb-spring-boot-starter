package net.ssd.apiserver.apigather.zds.model.entity;

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
 * @since 2021-03-08
 */
@TableName("TyphoonName20160621")
@ApiModel(value="Typhoonname20160621对象", description="")
public class Typhoonname20160621 implements Serializable {

    private static final long serialVersionUID=1L;

    @TableField("Ename")
    private String ename;

    @TableField("Cname")
    private String cname;

    @TableField("Country")
    private String country;

    private String content;


    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Typhoonname20160621{" +
        "ename=" + ename +
        ", cname=" + cname +
        ", country=" + country +
        ", content=" + content +
        "}";
    }
}

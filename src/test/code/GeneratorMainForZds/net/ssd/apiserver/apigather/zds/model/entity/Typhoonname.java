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
@TableName("TYPHOONNAME")
@ApiModel(value="Typhoonname对象", description="")
public class Typhoonname implements Serializable {

    private static final long serialVersionUID=1L;

    @TableField("ID")
    private String id;

    @TableField("TITLE_EN")
    private String titleEn;

    @TableField("TITLE_CN")
    private String titleCn;

    @TableField("TITLE_TW")
    private String titleTw;

    @TableField("PROVENANCE")
    private String provenance;

    @TableField("SIGNIFICATION")
    private String signification;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitleEn() {
        return titleEn;
    }

    public void setTitleEn(String titleEn) {
        this.titleEn = titleEn;
    }

    public String getTitleCn() {
        return titleCn;
    }

    public void setTitleCn(String titleCn) {
        this.titleCn = titleCn;
    }

    public String getTitleTw() {
        return titleTw;
    }

    public void setTitleTw(String titleTw) {
        this.titleTw = titleTw;
    }

    public String getProvenance() {
        return provenance;
    }

    public void setProvenance(String provenance) {
        this.provenance = provenance;
    }

    public String getSignification() {
        return signification;
    }

    public void setSignification(String signification) {
        this.signification = signification;
    }

    @Override
    public String toString() {
        return "Typhoonname{" +
        "id=" + id +
        ", titleEn=" + titleEn +
        ", titleCn=" + titleCn +
        ", titleTw=" + titleTw +
        ", provenance=" + provenance +
        ", signification=" + signification +
        "}";
    }
}

package net.ssd.soa.model.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author WeiBoWen
 * @since 2021-09-14
 */
@ApiModel(value="Typhoonname对象", description="")
public class Typhoonname implements Serializable {

    private static final long serialVersionUID=1L;

    private String id;

    private String titleEn;

    private String titleCn;

    private String titleTw;

    private String provenance;

    private String signification;

    private Integer newId;


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

    public Integer getNewId() {
        return newId;
    }

    public void setNewId(Integer newId) {
        this.newId = newId;
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
        ", newId=" + newId +
        "}";
    }
}

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
@TableName("TYPHOONNAME")
@ApiModel(value="Typhoonname对象", description="")
public class TyphoonnameDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableField("ID")
    private String iD;

    @TableField("TITLE_EN")
    private String titleEn;

    @TableField("TITLE_CN")
    private String titleCn;

    @TableField("TITLE_TW")
    private String titleTw;

    @TableField("PROVENANCE")
    private String pROVENANCE;

    @TableField("SIGNIFICATION")
    private String sIGNIFICATION;

    @TableField("NEW_ID")
    private Integer newId;


    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
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

    public String getpROVENANCE() {
        return pROVENANCE;
    }

    public void setpROVENANCE(String pROVENANCE) {
        this.pROVENANCE = pROVENANCE;
    }

    public String getsIGNIFICATION() {
        return sIGNIFICATION;
    }

    public void setsIGNIFICATION(String sIGNIFICATION) {
        this.sIGNIFICATION = sIGNIFICATION;
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
        "iD=" + iD +
        ", titleEn=" + titleEn +
        ", titleCn=" + titleCn +
        ", titleTw=" + titleTw +
        ", pROVENANCE=" + pROVENANCE +
        ", sIGNIFICATION=" + sIGNIFICATION +
        ", newId=" + newId +
        "}";
    }
}

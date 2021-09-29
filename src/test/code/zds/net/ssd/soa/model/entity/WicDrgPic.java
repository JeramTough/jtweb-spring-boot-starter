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
@TableName("WIC_DRG_PIC")
@ApiModel(value="WicDrgPic对象", description="")
public class WicDrgPic implements Serializable {

    private static final long serialVersionUID=1L;

    private String id;

    @TableField("imgName")
    private String imgName;

    @TableField("imgPath")
    private String imgPath;

    @TableField("createDate")
    private String createDate;

    @TableField("timeLen")
    private String timeLen;

    private String times;

    @TableField("foreastContent")
    private String foreastContent;

    @TableField("stationContent")
    private String stationContent;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getTimeLen() {
        return timeLen;
    }

    public void setTimeLen(String timeLen) {
        this.timeLen = timeLen;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public String getForeastContent() {
        return foreastContent;
    }

    public void setForeastContent(String foreastContent) {
        this.foreastContent = foreastContent;
    }

    public String getStationContent() {
        return stationContent;
    }

    public void setStationContent(String stationContent) {
        this.stationContent = stationContent;
    }

    @Override
    public String toString() {
        return "WicDrgPic{" +
        "id=" + id +
        ", imgName=" + imgName +
        ", imgPath=" + imgPath +
        ", createDate=" + createDate +
        ", timeLen=" + timeLen +
        ", times=" + times +
        ", foreastContent=" + foreastContent +
        ", stationContent=" + stationContent +
        "}";
    }
}

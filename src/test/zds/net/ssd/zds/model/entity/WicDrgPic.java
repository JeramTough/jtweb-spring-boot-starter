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
@TableName("WIC_DRG_PIC")
@ApiModel(value="WicDrgPic对象", description="")
public class WicDrgPic implements Serializable {

    private static final long serialVersionUID=1L;

    private String id;

    @TableField("imgName")
    private String imgname;

    @TableField("imgPath")
    private String imgpath;

    @TableField("createDate")
    private String createdate;

    @TableField("timeLen")
    private String timelen;

    private String times;

    @TableField("foreastContent")
    private String foreastcontent;

    @TableField("stationContent")
    private String stationcontent;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImgname() {
        return imgname;
    }

    public void setImgname(String imgname) {
        this.imgname = imgname;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getTimelen() {
        return timelen;
    }

    public void setTimelen(String timelen) {
        this.timelen = timelen;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public String getForeastcontent() {
        return foreastcontent;
    }

    public void setForeastcontent(String foreastcontent) {
        this.foreastcontent = foreastcontent;
    }

    public String getStationcontent() {
        return stationcontent;
    }

    public void setStationcontent(String stationcontent) {
        this.stationcontent = stationcontent;
    }

    @Override
    public String toString() {
        return "WicDrgPic{" +
        "id=" + id +
        ", imgname=" + imgname +
        ", imgpath=" + imgpath +
        ", createdate=" + createdate +
        ", timelen=" + timelen +
        ", times=" + times +
        ", foreastcontent=" + foreastcontent +
        ", stationcontent=" + stationcontent +
        "}";
    }
}

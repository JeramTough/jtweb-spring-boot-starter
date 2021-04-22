package net.ssd.apiserver.apigather.zds.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("ZDS_NEWS")
@ApiModel(value="ZdsNews对象", description="")
public class ZdsNews implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId("LDATE")
    private String ldate;

    @TableField("LTIME")
    private String ltime;

    @TableField("TITLE")
    private String title;

    @TableField("CONTENT")
    private String content;

    @TableField("PIC1")
    private byte[] pic1;

    @TableField("PIC2")
    private byte[] pic2;


    public String getLdate() {
        return ldate;
    }

    public void setLdate(String ldate) {
        this.ldate = ldate;
    }

    public String getLtime() {
        return ltime;
    }

    public void setLtime(String ltime) {
        this.ltime = ltime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public byte[] getPic1() {
        return pic1;
    }

    public void setPic1(byte[] pic1) {
        this.pic1 = pic1;
    }

    public byte[] getPic2() {
        return pic2;
    }

    public void setPic2(byte[] pic2) {
        this.pic2 = pic2;
    }

    @Override
    public String toString() {
        return "ZdsNews{" +
        "ldate=" + ldate +
        ", ltime=" + ltime +
        ", title=" + title +
        ", content=" + content +
        ", pic1=" + pic1 +
        ", pic2=" + pic2 +
        "}";
    }
}

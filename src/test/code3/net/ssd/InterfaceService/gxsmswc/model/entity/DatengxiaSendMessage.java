package net.ssd.InterfaceService.gxsmswc.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
 * @author JeramTough
 * @since 2020-09-16
 */
@TableName("daTengXia_send_message")
@ApiModel(value="DatengxiaSendMessage对象", description="")
public class DatengxiaSendMessage implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "短信内容")
    private String content;

    @ApiModelProperty(value = "日期")
    private String date;

    @ApiModelProperty(value = "保存时间")
    @TableField("saveTime")
    private String saveTime;

    @ApiModelProperty(value = "发送状态，0是未发生，1是已发送")
    private String sendStatus;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(String saveTime) {
        this.saveTime = saveTime;
    }

    public String getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(String sendStatus) {
        this.sendStatus = sendStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DatengxiaSendMessage{" +
        "content=" + content +
        ", date=" + date +
        ", saveTime=" + saveTime +
        ", sendStatus=" + sendStatus +
        ", id=" + id +
        "}";
    }
}

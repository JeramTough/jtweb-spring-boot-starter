package net.ssd.InterfaceService.gxsmswc.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="ProductPublishSendinfo对象", description="")
public class ProductPublishSendinfoDto implements Serializable{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "任务ID（表product_publish_his）")
    private String phTaskid;

    @ApiModelProperty(value = "服务用户的名称")
    private String userName;

    @ApiModelProperty(value = "服务用户的账号")
    private String userAccunt;

    @ApiModelProperty(value = "发送状态：0待发送；1发送中；2发送成功；-1发送失败")
    private Integer sendStatus;

    @ApiModelProperty(value = "发送时间")
    private LocalDateTime sendTime;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;


    public String getPhTaskid() {
        return phTaskid;
    }

    public void setPhTaskid(String phTaskid) {
        this.phTaskid = phTaskid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAccunt() {
        return userAccunt;
    }

    public void setUserAccunt(String userAccunt) {
        this.userAccunt = userAccunt;
    }

    public Integer getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
    }

    public LocalDateTime getSendTime() {
        return sendTime;
    }

    public void setSendTime(LocalDateTime sendTime) {
        this.sendTime = sendTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ProductPublishSendinfo{" +
        "phTaskid=" + phTaskid +
        ", userName=" + userName +
        ", userAccunt=" + userAccunt +
        ", sendStatus=" + sendStatus +
        ", sendTime=" + sendTime +
        ", id=" + id +
        "}";
    }
}

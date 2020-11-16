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
@ApiModel(value="ProductPublishHis对象", description="")
public class ProductPublishHisDto implements Serializable{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "任务ID")
    private String phTaskid;

    @ApiModelProperty(value = "产品的ID（表product_info）")
    private String productId;

    @ApiModelProperty(value = "发送的内容")
    private String phContent;

    @ApiModelProperty(value = "发送时间")
    private LocalDateTime sendTime;

    @ApiModelProperty(value = "发送的人数")
    private Integer sendUserNum;

    @ApiModelProperty(value = "类型：（email、notes、ftp、sms）")
    private String sendType;

    @ApiModelProperty(value = "发送状态：0待发送；1发送中；2发送成功；-1发送失败")
    private Integer sendStatus;

    @ApiModelProperty(value = "发布人账号")
    private String pubUserNo;

    @ApiModelProperty(value = "发布人名称")
    private String pubUserName;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;


    public String getPhTaskid() {
        return phTaskid;
    }

    public void setPhTaskid(String phTaskid) {
        this.phTaskid = phTaskid;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getPhContent() {
        return phContent;
    }

    public void setPhContent(String phContent) {
        this.phContent = phContent;
    }

    public LocalDateTime getSendTime() {
        return sendTime;
    }

    public void setSendTime(LocalDateTime sendTime) {
        this.sendTime = sendTime;
    }

    public Integer getSendUserNum() {
        return sendUserNum;
    }

    public void setSendUserNum(Integer sendUserNum) {
        this.sendUserNum = sendUserNum;
    }

    public String getSendType() {
        return sendType;
    }

    public void setSendType(String sendType) {
        this.sendType = sendType;
    }

    public Integer getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
    }

    public String getPubUserNo() {
        return pubUserNo;
    }

    public void setPubUserNo(String pubUserNo) {
        this.pubUserNo = pubUserNo;
    }

    public String getPubUserName() {
        return pubUserName;
    }

    public void setPubUserName(String pubUserName) {
        this.pubUserName = pubUserName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ProductPublishHis{" +
        "phTaskid=" + phTaskid +
        ", productId=" + productId +
        ", phContent=" + phContent +
        ", sendTime=" + sendTime +
        ", sendUserNum=" + sendUserNum +
        ", sendType=" + sendType +
        ", sendStatus=" + sendStatus +
        ", pubUserNo=" + pubUserNo +
        ", pubUserName=" + pubUserName +
        ", id=" + id +
        "}";
    }
}

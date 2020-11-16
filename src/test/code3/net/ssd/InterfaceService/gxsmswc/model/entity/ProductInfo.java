package net.ssd.InterfaceService.gxsmswc.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
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
@ApiModel(value="ProductInfo对象", description="")
public class ProductInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "产品编号")
    private String productId;

    @ApiModelProperty(value = "产品名称")
    private String productName;

    @ApiModelProperty(value = "产品文件名称")
    private String productFileName;

    @ApiModelProperty(value = "产品文件路径")
    private String productFilePath;

    @ApiModelProperty(value = "文档内容：txt文档发送短信的内容才用存")
    private String productContent;

    @ApiModelProperty(value = "模板ID")
    private String templateId;

    @ApiModelProperty(value = "产品要素：如温度、降水")
    private String productFeature;

    @ApiModelProperty(value = "文档日期：如要制作哪一天的预报文档")
    private LocalDate productDate;

    @ApiModelProperty(value = "文档创建时间")
    private LocalDateTime productCreateTime;

    @ApiModelProperty(value = "是否删除：-1删除；0未删除")
    private Integer productDel;

    @ApiModelProperty(value = "制作人账号")
    private String userNo;

    @ApiModelProperty(value = "制作人名称")
    private String userName;

    @ApiModelProperty(value = "产品发布状态：0未发布；1已发布。")
    private Integer productPublish;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductFileName() {
        return productFileName;
    }

    public void setProductFileName(String productFileName) {
        this.productFileName = productFileName;
    }

    public String getProductFilePath() {
        return productFilePath;
    }

    public void setProductFilePath(String productFilePath) {
        this.productFilePath = productFilePath;
    }

    public String getProductContent() {
        return productContent;
    }

    public void setProductContent(String productContent) {
        this.productContent = productContent;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getProductFeature() {
        return productFeature;
    }

    public void setProductFeature(String productFeature) {
        this.productFeature = productFeature;
    }

    public LocalDate getProductDate() {
        return productDate;
    }

    public void setProductDate(LocalDate productDate) {
        this.productDate = productDate;
    }

    public LocalDateTime getProductCreateTime() {
        return productCreateTime;
    }

    public void setProductCreateTime(LocalDateTime productCreateTime) {
        this.productCreateTime = productCreateTime;
    }

    public Integer getProductDel() {
        return productDel;
    }

    public void setProductDel(Integer productDel) {
        this.productDel = productDel;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getProductPublish() {
        return productPublish;
    }

    public void setProductPublish(Integer productPublish) {
        this.productPublish = productPublish;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ProductInfo{" +
        "productId=" + productId +
        ", productName=" + productName +
        ", productFileName=" + productFileName +
        ", productFilePath=" + productFilePath +
        ", productContent=" + productContent +
        ", templateId=" + templateId +
        ", productFeature=" + productFeature +
        ", productDate=" + productDate +
        ", productCreateTime=" + productCreateTime +
        ", productDel=" + productDel +
        ", userNo=" + userNo +
        ", userName=" + userName +
        ", productPublish=" + productPublish +
        ", id=" + id +
        "}";
    }
}

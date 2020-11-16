package net.ssd.InterfaceService.gxsmswc.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
@ApiModel(value="ProductShowImg对象", description="")
public class ProductShowImg implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "图片名称")
    private String imgName;

    @ApiModelProperty(value = "格点资料类型")
    private String productType;

    @ApiModelProperty(value = "气象要素类型")
    private String productTitle;

    @ApiModelProperty(value = "图片日期")
    private String imgDate;

    @ApiModelProperty(value = "图片时次：08；20")
    private String imgTimes;

    @ApiModelProperty(value = "预报时效：24；48")
    private String forecastTimes;

    @ApiModelProperty(value = "图片路径")
    private String imgPath;

    @ApiModelProperty(value = "创建时间")
    private String createTime;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String mark;


    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getImgDate() {
        return imgDate;
    }

    public void setImgDate(String imgDate) {
        this.imgDate = imgDate;
    }

    public String getImgTimes() {
        return imgTimes;
    }

    public void setImgTimes(String imgTimes) {
        this.imgTimes = imgTimes;
    }

    public String getForecastTimes() {
        return forecastTimes;
    }

    public void setForecastTimes(String forecastTimes) {
        this.forecastTimes = forecastTimes;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "ProductShowImg{" +
        "imgName=" + imgName +
        ", productType=" + productType +
        ", productTitle=" + productTitle +
        ", imgDate=" + imgDate +
        ", imgTimes=" + imgTimes +
        ", forecastTimes=" + forecastTimes +
        ", imgPath=" + imgPath +
        ", createTime=" + createTime +
        ", id=" + id +
        ", mark=" + mark +
        "}";
    }
}

package net.ssd.InterfaceService.gxsmswc.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalTime;
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
@ApiModel(value="ProductType对象", description="")
public class ProductTypeDto implements Serializable{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自增长ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "类型：1短期；2中长期")
    private Integer tyType;

    @ApiModelProperty(value = "类型名称")
    private String tyName;

    @ApiModelProperty(value = "产品文件标识码")
    private String tyCode;

    @ApiModelProperty(value = "编辑URL")
    private String tyEditUrl;

    @ApiModelProperty(value = "后缀")
    private String tySuffix;

    @ApiModelProperty(value = "图标")
    private String icon;

    @ApiModelProperty(value = "备注")
    private String tyRemark;

    @ApiModelProperty(value = "编号")
    private String tyNo;

    @ApiModelProperty(value = "制作产品链接")
    private String tyCreateUrl;

    @ApiModelProperty(value = "截止时间")
    private LocalTime tyEndTime;

    @ApiModelProperty(value = "排班类型：0早班，1中班，2晚班")
    private Integer tySchedulingType;

    @ApiModelProperty(value = "发布方式")
    private String tySendway;

    @ApiModelProperty(value = "网站URL")
    private String tyWebsiteUrl;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTyType() {
        return tyType;
    }

    public void setTyType(Integer tyType) {
        this.tyType = tyType;
    }

    public String getTyName() {
        return tyName;
    }

    public void setTyName(String tyName) {
        this.tyName = tyName;
    }

    public String getTyCode() {
        return tyCode;
    }

    public void setTyCode(String tyCode) {
        this.tyCode = tyCode;
    }

    public String getTyEditUrl() {
        return tyEditUrl;
    }

    public void setTyEditUrl(String tyEditUrl) {
        this.tyEditUrl = tyEditUrl;
    }

    public String getTySuffix() {
        return tySuffix;
    }

    public void setTySuffix(String tySuffix) {
        this.tySuffix = tySuffix;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTyRemark() {
        return tyRemark;
    }

    public void setTyRemark(String tyRemark) {
        this.tyRemark = tyRemark;
    }

    public String getTyNo() {
        return tyNo;
    }

    public void setTyNo(String tyNo) {
        this.tyNo = tyNo;
    }

    public String getTyCreateUrl() {
        return tyCreateUrl;
    }

    public void setTyCreateUrl(String tyCreateUrl) {
        this.tyCreateUrl = tyCreateUrl;
    }

    public LocalTime getTyEndTime() {
        return tyEndTime;
    }

    public void setTyEndTime(LocalTime tyEndTime) {
        this.tyEndTime = tyEndTime;
    }

    public Integer getTySchedulingType() {
        return tySchedulingType;
    }

    public void setTySchedulingType(Integer tySchedulingType) {
        this.tySchedulingType = tySchedulingType;
    }

    public String getTySendway() {
        return tySendway;
    }

    public void setTySendway(String tySendway) {
        this.tySendway = tySendway;
    }

    public String getTyWebsiteUrl() {
        return tyWebsiteUrl;
    }

    public void setTyWebsiteUrl(String tyWebsiteUrl) {
        this.tyWebsiteUrl = tyWebsiteUrl;
    }

    @Override
    public String toString() {
        return "ProductType{" +
        "id=" + id +
        ", tyType=" + tyType +
        ", tyName=" + tyName +
        ", tyCode=" + tyCode +
        ", tyEditUrl=" + tyEditUrl +
        ", tySuffix=" + tySuffix +
        ", icon=" + icon +
        ", tyRemark=" + tyRemark +
        ", tyNo=" + tyNo +
        ", tyCreateUrl=" + tyCreateUrl +
        ", tyEndTime=" + tyEndTime +
        ", tySchedulingType=" + tySchedulingType +
        ", tySendway=" + tySendway +
        ", tyWebsiteUrl=" + tyWebsiteUrl +
        "}";
    }
}

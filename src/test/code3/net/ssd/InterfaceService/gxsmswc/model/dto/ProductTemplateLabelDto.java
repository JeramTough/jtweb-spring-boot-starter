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
@ApiModel(value="ProductTemplateLabel对象", description="")
public class ProductTemplateLabelDto implements Serializable{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "标签名称")
    private String labName;

    @ApiModelProperty(value = "标签编码")
    private String labCode;

    @ApiModelProperty(value = "标签值")
    private String labValue;

    @ApiModelProperty(value = "标签类型：0系统自动生成（如：时间，制作人等）；1取lab_value字段值。")
    private Integer labType;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String labSign;


    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public String getLabCode() {
        return labCode;
    }

    public void setLabCode(String labCode) {
        this.labCode = labCode;
    }

    public String getLabValue() {
        return labValue;
    }

    public void setLabValue(String labValue) {
        this.labValue = labValue;
    }

    public Integer getLabType() {
        return labType;
    }

    public void setLabType(Integer labType) {
        this.labType = labType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabSign() {
        return labSign;
    }

    public void setLabSign(String labSign) {
        this.labSign = labSign;
    }

    @Override
    public String toString() {
        return "ProductTemplateLabel{" +
        "labName=" + labName +
        ", labCode=" + labCode +
        ", labValue=" + labValue +
        ", labType=" + labType +
        ", id=" + id +
        ", labSign=" + labSign +
        "}";
    }
}

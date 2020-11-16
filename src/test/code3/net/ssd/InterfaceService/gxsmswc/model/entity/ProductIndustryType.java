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
@ApiModel(value="ProductIndustryType对象", description="")
public class ProductIndustryType implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自增长ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "产品行业ID（product_industry）")
    private String inId;

    @ApiModelProperty(value = "产品类型ID（product_type）")
    private String tyId;

    @ApiModelProperty(value = "0不显示；1显示")
    private Integer isShow;

    @ApiModelProperty(value = "排序")
    private Integer sort;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInId() {
        return inId;
    }

    public void setInId(String inId) {
        this.inId = inId;
    }

    public String getTyId() {
        return tyId;
    }

    public void setTyId(String tyId) {
        this.tyId = tyId;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "ProductIndustryType{" +
        "id=" + id +
        ", inId=" + inId +
        ", tyId=" + tyId +
        ", isShow=" + isShow +
        ", sort=" + sort +
        "}";
    }
}

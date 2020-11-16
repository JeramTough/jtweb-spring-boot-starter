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
@ApiModel(value="ProductIndustry对象", description="")
public class ProductIndustry implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "行业名称")
    private String inName;

    @ApiModelProperty(value = "图标")
    private String icon;

    @ApiModelProperty(value = "状态：0已删除，1有效")
    private Integer status;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer sort;

    private String url;

    private String roleId;


    public String getInName() {
        return inName;
    }

    public void setInName(String inName) {
        this.inName = inName;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "ProductIndustry{" +
        "inName=" + inName +
        ", icon=" + icon +
        ", status=" + status +
        ", id=" + id +
        ", sort=" + sort +
        ", url=" + url +
        ", roleId=" + roleId +
        "}";
    }
}

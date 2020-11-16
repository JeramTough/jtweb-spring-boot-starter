package com.jeramtough.randl2.model.entity;

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
@ApiModel(value="MenuRolePermission对象", description="")
public class MenuRolePermissionDto implements Serializable{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键id")
    @TableId(value = "fid", type = IdType.AUTO)
    private Long fid;

    @ApiModelProperty(value = "菜单Id")
    private Long menuId;

    @ApiModelProperty(value = "角色id")
    private Long roleId;


    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "MenuRolePermission{" +
        "fid=" + fid +
        ", menuId=" + menuId +
        ", roleId=" + roleId +
        "}";
    }
}

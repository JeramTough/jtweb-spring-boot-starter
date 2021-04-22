package com.jeramtough.test.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author JeramTough
 * @since 2021-04-18
 */
@ApiModel(value="RandlModule对象", description="")
public class RandlModuleDto implements Serializable{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "fid", type = IdType.AUTO)
    private Long fid;

    @ApiModelProperty(value = "菜单中文名")
    private String name;

    @ApiModelProperty(value = "菜单描述")
    private String description;

    @ApiModelProperty(value = "菜单路径")
    private String path;

    @ApiModelProperty(value = "层级")
    private Integer level;

    @ApiModelProperty(value = "排序")
    private Integer moduleOrder;

    @ApiModelProperty(value = "菜单图标 默认为斜杠")
    private String icon;

    @ApiModelProperty(value = "上级菜单Id")
    private Long parentId;

    @ApiModelProperty(value = "是否可用")
    private Integer isAble;

    private Long appId;

    private LocalDateTime createTime;


    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getModuleOrder() {
        return moduleOrder;
    }

    public void setModuleOrder(Integer moduleOrder) {
        this.moduleOrder = moduleOrder;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Integer getIsAble() {
        return isAble;
    }

    public void setIsAble(Integer isAble) {
        this.isAble = isAble;
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "RandlModule{" +
        "fid=" + fid +
        ", name=" + name +
        ", description=" + description +
        ", path=" + path +
        ", level=" + level +
        ", moduleOrder=" + moduleOrder +
        ", icon=" + icon +
        ", parentId=" + parentId +
        ", isAble=" + isAble +
        ", appId=" + appId +
        ", createTime=" + createTime +
        "}";
    }
}

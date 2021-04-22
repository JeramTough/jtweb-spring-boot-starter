package com.jeramtough.studentmanager.model.entity;

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
 * @author WeiJieHui
 * @since 2021-03-07
 */
@ApiModel(value="SmModule对象", description="")
public class SmModule implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "fid", type = IdType.AUTO)
    private Long fid;

    private String name;

    private String roleIds;

  /**
   * 学生、管理员、教师
   */
    private String belong;

    private String parentName;


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

    public String getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds;
    }

    public String getBelong() {
        return belong;
    }

    public void setBelong(String belong) {
        this.belong = belong;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return "SmModule{" +
        "fid=" + fid +
        ", name=" + name +
        ", roleIds=" + roleIds +
        ", belong=" + belong +
        ", parentName=" + parentName +
        "}";
    }
}

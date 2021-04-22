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
@ApiModel(value="SmRole对象", description="")
public class SmRole implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "fid", type = IdType.AUTO)
    private Long fid;

    private String name;

    private String type;


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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SmRole{" +
        "fid=" + fid +
        ", name=" + name +
        ", type=" + type +
        "}";
    }
}

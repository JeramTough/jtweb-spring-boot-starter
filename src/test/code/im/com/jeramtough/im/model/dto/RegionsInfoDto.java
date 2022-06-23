package com.jeramtough.im.model.entity;

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
 * @author WeiBoWen
 * @since 2021-10-22
 */
@ApiModel(value="RegionsInfo对象", description="")
public class RegionsInfoDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableId(value = "fid", type = IdType.AUTO)
    private Long fid;

    @ApiModelProperty(value = "行政区域名")
    private String regionsName;

    @ApiModelProperty(value = "行政区域编码")
    private String regionsCode;


    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public String getRegionsName() {
        return regionsName;
    }

    public void setRegionsName(String regionsName) {
        this.regionsName = regionsName;
    }

    public String getRegionsCode() {
        return regionsCode;
    }

    public void setRegionsCode(String regionsCode) {
        this.regionsCode = regionsCode;
    }

    @Override
    public String toString() {
        return "RegionsInfo{" +
        "fid=" + fid +
        ", regionsName=" + regionsName +
        ", regionsCode=" + regionsCode +
        "}";
    }
}

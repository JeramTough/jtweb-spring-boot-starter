package com.icloudmap.newerp.model.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author WeiBoWen
 * @since 2021-11-24
 */
@TableName("BS_预算设置")
@ApiModel(value="Bs预算设置对象", description="")
public class Bs预算设置Dto implements Serializable{

    private static final long serialVersionUID=1L;

    private String 预算设置编号;

    private String 角色编号;

    private BigDecimal 成本阀值;

    private String 备注;

    @ApiModelProperty(value = "行政区域")
    @TableField("AREACODE")
    private String aREACODE;


    public String get预算设置编号() {
        return 预算设置编号;
    }

    public void set预算设置编号(String 预算设置编号) {
        this.预算设置编号 = 预算设置编号;
    }

    public String get角色编号() {
        return 角色编号;
    }

    public void set角色编号(String 角色编号) {
        this.角色编号 = 角色编号;
    }

    public BigDecimal get成本阀值() {
        return 成本阀值;
    }

    public void set成本阀值(BigDecimal 成本阀值) {
        this.成本阀值 = 成本阀值;
    }

    public String get备注() {
        return 备注;
    }

    public void set备注(String 备注) {
        this.备注 = 备注;
    }

    public String getaREACODE() {
        return aREACODE;
    }

    public void setaREACODE(String aREACODE) {
        this.aREACODE = aREACODE;
    }

    @Override
    public String toString() {
        return "Bs预算设置{" +
        "预算设置编号=" + 预算设置编号 +
        ", 角色编号=" + 角色编号 +
        ", 成本阀值=" + 成本阀值 +
        ", 备注=" + 备注 +
        ", aREACODE=" + aREACODE +
        "}";
    }
}

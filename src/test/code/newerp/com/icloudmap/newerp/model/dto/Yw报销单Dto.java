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
@TableName("YW_报销单")
@ApiModel(value="Yw报销单对象", description="")
public class Yw报销单Dto implements Serializable{

    private static final long serialVersionUID=1L;

    private String 报销单号;

    private String 报销类型;

    private String 报销人编号;

    private String 报销人;

    private String 报销时间;

    private BigDecimal 总金额;

    private String 报销状态;

    private String 备注;

    private String 归属项目编号;

    private String 开户银行;

    private String 收款人账号;

    private String 创建人;

    private String 创建时间;

    private String 流程实例编号;

    @ApiModelProperty(value = "行政区域")
    @TableField("AREACODE")
    private String aREACODE;

    private String 报销类型编号;

    private String 报销状态编码;

    private String 创建人编号;

    private BigDecimal 项目已花费;

    private BigDecimal 票据总数;

    private String 项目归属地;

    private String 支付账户;

    private String 支付账户编号;

    private String 确认人;

    private String 确认人编号;

    private String 确认时间;


    public String get报销单号() {
        return 报销单号;
    }

    public void set报销单号(String 报销单号) {
        this.报销单号 = 报销单号;
    }

    public String get报销类型() {
        return 报销类型;
    }

    public void set报销类型(String 报销类型) {
        this.报销类型 = 报销类型;
    }

    public String get报销人编号() {
        return 报销人编号;
    }

    public void set报销人编号(String 报销人编号) {
        this.报销人编号 = 报销人编号;
    }

    public String get报销人() {
        return 报销人;
    }

    public void set报销人(String 报销人) {
        this.报销人 = 报销人;
    }

    public String get报销时间() {
        return 报销时间;
    }

    public void set报销时间(String 报销时间) {
        this.报销时间 = 报销时间;
    }

    public BigDecimal get总金额() {
        return 总金额;
    }

    public void set总金额(BigDecimal 总金额) {
        this.总金额 = 总金额;
    }

    public String get报销状态() {
        return 报销状态;
    }

    public void set报销状态(String 报销状态) {
        this.报销状态 = 报销状态;
    }

    public String get备注() {
        return 备注;
    }

    public void set备注(String 备注) {
        this.备注 = 备注;
    }

    public String get归属项目编号() {
        return 归属项目编号;
    }

    public void set归属项目编号(String 归属项目编号) {
        this.归属项目编号 = 归属项目编号;
    }

    public String get开户银行() {
        return 开户银行;
    }

    public void set开户银行(String 开户银行) {
        this.开户银行 = 开户银行;
    }

    public String get收款人账号() {
        return 收款人账号;
    }

    public void set收款人账号(String 收款人账号) {
        this.收款人账号 = 收款人账号;
    }

    public String get创建人() {
        return 创建人;
    }

    public void set创建人(String 创建人) {
        this.创建人 = 创建人;
    }

    public String get创建时间() {
        return 创建时间;
    }

    public void set创建时间(String 创建时间) {
        this.创建时间 = 创建时间;
    }

    public String get流程实例编号() {
        return 流程实例编号;
    }

    public void set流程实例编号(String 流程实例编号) {
        this.流程实例编号 = 流程实例编号;
    }

    public String getaREACODE() {
        return aREACODE;
    }

    public void setaREACODE(String aREACODE) {
        this.aREACODE = aREACODE;
    }

    public String get报销类型编号() {
        return 报销类型编号;
    }

    public void set报销类型编号(String 报销类型编号) {
        this.报销类型编号 = 报销类型编号;
    }

    public String get报销状态编码() {
        return 报销状态编码;
    }

    public void set报销状态编码(String 报销状态编码) {
        this.报销状态编码 = 报销状态编码;
    }

    public String get创建人编号() {
        return 创建人编号;
    }

    public void set创建人编号(String 创建人编号) {
        this.创建人编号 = 创建人编号;
    }

    public BigDecimal get项目已花费() {
        return 项目已花费;
    }

    public void set项目已花费(BigDecimal 项目已花费) {
        this.项目已花费 = 项目已花费;
    }

    public BigDecimal get票据总数() {
        return 票据总数;
    }

    public void set票据总数(BigDecimal 票据总数) {
        this.票据总数 = 票据总数;
    }

    public String get项目归属地() {
        return 项目归属地;
    }

    public void set项目归属地(String 项目归属地) {
        this.项目归属地 = 项目归属地;
    }

    public String get支付账户() {
        return 支付账户;
    }

    public void set支付账户(String 支付账户) {
        this.支付账户 = 支付账户;
    }

    public String get支付账户编号() {
        return 支付账户编号;
    }

    public void set支付账户编号(String 支付账户编号) {
        this.支付账户编号 = 支付账户编号;
    }

    public String get确认人() {
        return 确认人;
    }

    public void set确认人(String 确认人) {
        this.确认人 = 确认人;
    }

    public String get确认人编号() {
        return 确认人编号;
    }

    public void set确认人编号(String 确认人编号) {
        this.确认人编号 = 确认人编号;
    }

    public String get确认时间() {
        return 确认时间;
    }

    public void set确认时间(String 确认时间) {
        this.确认时间 = 确认时间;
    }

    @Override
    public String toString() {
        return "Yw报销单{" +
        "报销单号=" + 报销单号 +
        ", 报销类型=" + 报销类型 +
        ", 报销人编号=" + 报销人编号 +
        ", 报销人=" + 报销人 +
        ", 报销时间=" + 报销时间 +
        ", 总金额=" + 总金额 +
        ", 报销状态=" + 报销状态 +
        ", 备注=" + 备注 +
        ", 归属项目编号=" + 归属项目编号 +
        ", 开户银行=" + 开户银行 +
        ", 收款人账号=" + 收款人账号 +
        ", 创建人=" + 创建人 +
        ", 创建时间=" + 创建时间 +
        ", 流程实例编号=" + 流程实例编号 +
        ", aREACODE=" + aREACODE +
        ", 报销类型编号=" + 报销类型编号 +
        ", 报销状态编码=" + 报销状态编码 +
        ", 创建人编号=" + 创建人编号 +
        ", 项目已花费=" + 项目已花费 +
        ", 票据总数=" + 票据总数 +
        ", 项目归属地=" + 项目归属地 +
        ", 支付账户=" + 支付账户 +
        ", 支付账户编号=" + 支付账户编号 +
        ", 确认人=" + 确认人 +
        ", 确认人编号=" + 确认人编号 +
        ", 确认时间=" + 确认时间 +
        "}";
    }
}

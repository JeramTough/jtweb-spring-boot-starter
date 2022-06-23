package com.icloudmap.newerp.model.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("YW_还款单")
@ApiModel(value="Yw还款单对象", description="")
public class Yw还款单Dto implements Serializable{

    private static final long serialVersionUID=1L;

    private String 还款单号;

    private String 账户编号;

    private String 办件编号;

    private String 还款方式;

    private String 还款方式编码;

    private String 还款日期;

    private BigDecimal 金额;

    private String 还款账户名称;

    private String 还款开户行;

    private String 还款账号;

    private String 责任人编号;

    private String 责任人名称;

    @ApiModelProperty(value = "0:未完成还款，1：已完成还款")
    private Integer 状态;

    private String 创建人;

    private String 创建时间;

    private String 创建人编号;

    private String 修改人;

    private String 修改时间;

    private String 修改人编号;

    private String 备注;

    private String 借款编号;

    private String 报销单号;

    private String 账户名称;

    private String 编号;

    private String 确认人;

    private String 确认人编号;

    private String 确认时间;


    public String get还款单号() {
        return 还款单号;
    }

    public void set还款单号(String 还款单号) {
        this.还款单号 = 还款单号;
    }

    public String get账户编号() {
        return 账户编号;
    }

    public void set账户编号(String 账户编号) {
        this.账户编号 = 账户编号;
    }

    public String get办件编号() {
        return 办件编号;
    }

    public void set办件编号(String 办件编号) {
        this.办件编号 = 办件编号;
    }

    public String get还款方式() {
        return 还款方式;
    }

    public void set还款方式(String 还款方式) {
        this.还款方式 = 还款方式;
    }

    public String get还款方式编码() {
        return 还款方式编码;
    }

    public void set还款方式编码(String 还款方式编码) {
        this.还款方式编码 = 还款方式编码;
    }

    public String get还款日期() {
        return 还款日期;
    }

    public void set还款日期(String 还款日期) {
        this.还款日期 = 还款日期;
    }

    public BigDecimal get金额() {
        return 金额;
    }

    public void set金额(BigDecimal 金额) {
        this.金额 = 金额;
    }

    public String get还款账户名称() {
        return 还款账户名称;
    }

    public void set还款账户名称(String 还款账户名称) {
        this.还款账户名称 = 还款账户名称;
    }

    public String get还款开户行() {
        return 还款开户行;
    }

    public void set还款开户行(String 还款开户行) {
        this.还款开户行 = 还款开户行;
    }

    public String get还款账号() {
        return 还款账号;
    }

    public void set还款账号(String 还款账号) {
        this.还款账号 = 还款账号;
    }

    public String get责任人编号() {
        return 责任人编号;
    }

    public void set责任人编号(String 责任人编号) {
        this.责任人编号 = 责任人编号;
    }

    public String get责任人名称() {
        return 责任人名称;
    }

    public void set责任人名称(String 责任人名称) {
        this.责任人名称 = 责任人名称;
    }

    public Integer get状态() {
        return 状态;
    }

    public void set状态(Integer 状态) {
        this.状态 = 状态;
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

    public String get创建人编号() {
        return 创建人编号;
    }

    public void set创建人编号(String 创建人编号) {
        this.创建人编号 = 创建人编号;
    }

    public String get修改人() {
        return 修改人;
    }

    public void set修改人(String 修改人) {
        this.修改人 = 修改人;
    }

    public String get修改时间() {
        return 修改时间;
    }

    public void set修改时间(String 修改时间) {
        this.修改时间 = 修改时间;
    }

    public String get修改人编号() {
        return 修改人编号;
    }

    public void set修改人编号(String 修改人编号) {
        this.修改人编号 = 修改人编号;
    }

    public String get备注() {
        return 备注;
    }

    public void set备注(String 备注) {
        this.备注 = 备注;
    }

    public String get借款编号() {
        return 借款编号;
    }

    public void set借款编号(String 借款编号) {
        this.借款编号 = 借款编号;
    }

    public String get报销单号() {
        return 报销单号;
    }

    public void set报销单号(String 报销单号) {
        this.报销单号 = 报销单号;
    }

    public String get账户名称() {
        return 账户名称;
    }

    public void set账户名称(String 账户名称) {
        this.账户名称 = 账户名称;
    }

    public String get编号() {
        return 编号;
    }

    public void set编号(String 编号) {
        this.编号 = 编号;
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
        return "Yw还款单{" +
        "还款单号=" + 还款单号 +
        ", 账户编号=" + 账户编号 +
        ", 办件编号=" + 办件编号 +
        ", 还款方式=" + 还款方式 +
        ", 还款方式编码=" + 还款方式编码 +
        ", 还款日期=" + 还款日期 +
        ", 金额=" + 金额 +
        ", 还款账户名称=" + 还款账户名称 +
        ", 还款开户行=" + 还款开户行 +
        ", 还款账号=" + 还款账号 +
        ", 责任人编号=" + 责任人编号 +
        ", 责任人名称=" + 责任人名称 +
        ", 状态=" + 状态 +
        ", 创建人=" + 创建人 +
        ", 创建时间=" + 创建时间 +
        ", 创建人编号=" + 创建人编号 +
        ", 修改人=" + 修改人 +
        ", 修改时间=" + 修改时间 +
        ", 修改人编号=" + 修改人编号 +
        ", 备注=" + 备注 +
        ", 借款编号=" + 借款编号 +
        ", 报销单号=" + 报销单号 +
        ", 账户名称=" + 账户名称 +
        ", 编号=" + 编号 +
        ", 确认人=" + 确认人 +
        ", 确认人编号=" + 确认人编号 +
        ", 确认时间=" + 确认时间 +
        "}";
    }
}

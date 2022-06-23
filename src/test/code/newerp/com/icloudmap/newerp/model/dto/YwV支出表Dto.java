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
@TableName("YW_V_支出表")
@ApiModel(value="YwV支出表对象", description="")
public class YwV支出表Dto implements Serializable{

    private static final long serialVersionUID=1L;

    private String 编号;

    private String 办件编号;

    private String 账户编号;

    private String 项目编号;

    private String 收款方名称;

    private String 开户行;

    private String 开票项目名称;

    private String 费用类型;

    private String 费用类型编号;

    private String 发票编号;

    private Long 发票张数;

    private BigDecimal 金额;

    private String 付款日期;

    private String 责任人编号;

    private String 责任人名称;

    private Integer 状态;

    private String 备注;

    private String 创建人;

    private String 创建时间;

    private String 创建人编号;

    private String 修改人;

    private String 修改时间;

    private String 修改人编号;

    private BigDecimal 发票金额;

    private String 收款方账号;

    private String 借款单信息;

    private String 支出单号;

    private String 收款方编号;

    private BigDecimal 实付金额;

    private BigDecimal 还款金额;

    private String 费用大类;

    private String 费用大类编号;

    private String 报销类型;

    private String 报销类型编号;

    private String 项目名称;


    public String get编号() {
        return 编号;
    }

    public void set编号(String 编号) {
        this.编号 = 编号;
    }

    public String get办件编号() {
        return 办件编号;
    }

    public void set办件编号(String 办件编号) {
        this.办件编号 = 办件编号;
    }

    public String get账户编号() {
        return 账户编号;
    }

    public void set账户编号(String 账户编号) {
        this.账户编号 = 账户编号;
    }

    public String get项目编号() {
        return 项目编号;
    }

    public void set项目编号(String 项目编号) {
        this.项目编号 = 项目编号;
    }

    public String get收款方名称() {
        return 收款方名称;
    }

    public void set收款方名称(String 收款方名称) {
        this.收款方名称 = 收款方名称;
    }

    public String get开户行() {
        return 开户行;
    }

    public void set开户行(String 开户行) {
        this.开户行 = 开户行;
    }

    public String get开票项目名称() {
        return 开票项目名称;
    }

    public void set开票项目名称(String 开票项目名称) {
        this.开票项目名称 = 开票项目名称;
    }

    public String get费用类型() {
        return 费用类型;
    }

    public void set费用类型(String 费用类型) {
        this.费用类型 = 费用类型;
    }

    public String get费用类型编号() {
        return 费用类型编号;
    }

    public void set费用类型编号(String 费用类型编号) {
        this.费用类型编号 = 费用类型编号;
    }

    public String get发票编号() {
        return 发票编号;
    }

    public void set发票编号(String 发票编号) {
        this.发票编号 = 发票编号;
    }

    public Long get发票张数() {
        return 发票张数;
    }

    public void set发票张数(Long 发票张数) {
        this.发票张数 = 发票张数;
    }

    public BigDecimal get金额() {
        return 金额;
    }

    public void set金额(BigDecimal 金额) {
        this.金额 = 金额;
    }

    public String get付款日期() {
        return 付款日期;
    }

    public void set付款日期(String 付款日期) {
        this.付款日期 = 付款日期;
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

    public String get备注() {
        return 备注;
    }

    public void set备注(String 备注) {
        this.备注 = 备注;
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

    public BigDecimal get发票金额() {
        return 发票金额;
    }

    public void set发票金额(BigDecimal 发票金额) {
        this.发票金额 = 发票金额;
    }

    public String get收款方账号() {
        return 收款方账号;
    }

    public void set收款方账号(String 收款方账号) {
        this.收款方账号 = 收款方账号;
    }

    public String get借款单信息() {
        return 借款单信息;
    }

    public void set借款单信息(String 借款单信息) {
        this.借款单信息 = 借款单信息;
    }

    public String get支出单号() {
        return 支出单号;
    }

    public void set支出单号(String 支出单号) {
        this.支出单号 = 支出单号;
    }

    public String get收款方编号() {
        return 收款方编号;
    }

    public void set收款方编号(String 收款方编号) {
        this.收款方编号 = 收款方编号;
    }

    public BigDecimal get实付金额() {
        return 实付金额;
    }

    public void set实付金额(BigDecimal 实付金额) {
        this.实付金额 = 实付金额;
    }

    public BigDecimal get还款金额() {
        return 还款金额;
    }

    public void set还款金额(BigDecimal 还款金额) {
        this.还款金额 = 还款金额;
    }

    public String get费用大类() {
        return 费用大类;
    }

    public void set费用大类(String 费用大类) {
        this.费用大类 = 费用大类;
    }

    public String get费用大类编号() {
        return 费用大类编号;
    }

    public void set费用大类编号(String 费用大类编号) {
        this.费用大类编号 = 费用大类编号;
    }

    public String get报销类型() {
        return 报销类型;
    }

    public void set报销类型(String 报销类型) {
        this.报销类型 = 报销类型;
    }

    public String get报销类型编号() {
        return 报销类型编号;
    }

    public void set报销类型编号(String 报销类型编号) {
        this.报销类型编号 = 报销类型编号;
    }

    public String get项目名称() {
        return 项目名称;
    }

    public void set项目名称(String 项目名称) {
        this.项目名称 = 项目名称;
    }

    @Override
    public String toString() {
        return "YwV支出表{" +
        "编号=" + 编号 +
        ", 办件编号=" + 办件编号 +
        ", 账户编号=" + 账户编号 +
        ", 项目编号=" + 项目编号 +
        ", 收款方名称=" + 收款方名称 +
        ", 开户行=" + 开户行 +
        ", 开票项目名称=" + 开票项目名称 +
        ", 费用类型=" + 费用类型 +
        ", 费用类型编号=" + 费用类型编号 +
        ", 发票编号=" + 发票编号 +
        ", 发票张数=" + 发票张数 +
        ", 金额=" + 金额 +
        ", 付款日期=" + 付款日期 +
        ", 责任人编号=" + 责任人编号 +
        ", 责任人名称=" + 责任人名称 +
        ", 状态=" + 状态 +
        ", 备注=" + 备注 +
        ", 创建人=" + 创建人 +
        ", 创建时间=" + 创建时间 +
        ", 创建人编号=" + 创建人编号 +
        ", 修改人=" + 修改人 +
        ", 修改时间=" + 修改时间 +
        ", 修改人编号=" + 修改人编号 +
        ", 发票金额=" + 发票金额 +
        ", 收款方账号=" + 收款方账号 +
        ", 借款单信息=" + 借款单信息 +
        ", 支出单号=" + 支出单号 +
        ", 收款方编号=" + 收款方编号 +
        ", 实付金额=" + 实付金额 +
        ", 还款金额=" + 还款金额 +
        ", 费用大类=" + 费用大类 +
        ", 费用大类编号=" + 费用大类编号 +
        ", 报销类型=" + 报销类型 +
        ", 报销类型编号=" + 报销类型编号 +
        ", 项目名称=" + 项目名称 +
        "}";
    }
}

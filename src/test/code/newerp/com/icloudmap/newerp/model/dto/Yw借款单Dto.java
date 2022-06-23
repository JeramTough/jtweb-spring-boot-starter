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
@TableName("YW_借款单")
@ApiModel(value="Yw借款单对象", description="")
public class Yw借款单Dto implements Serializable{

    private static final long serialVersionUID=1L;

    private String 借款编号;

    private String 责任人所在部门;

    private String 借款人姓名;

    private String 借款日期;

    private String 借款用途;

    private BigDecimal 金额;

    private String 还款时间;

    private BigDecimal 还款金额;

    private String 创建时间;

    private String 创建人;

    private String 创建人编号;

    private String 责任人;

    private String 借款人账号;

    private String 开户行;

    private String 借款说明;

    private String 账户编号;

    private String 账户名称;

    private BigDecimal 剩余金额;

    private String 流程实例编号;

    @TableField("AREACODE")
    private String aREACODE;

    private String 借款状态编号;

    private String 借款状态;

    private String 编号;

    @ApiModelProperty(value = "0：未打款，1：已打款")
    private BigDecimal 状态;

    private String 责任人编号;

    private String 确认人;

    private String 确认人编号;

    private String 确认时间;


    public String get借款编号() {
        return 借款编号;
    }

    public void set借款编号(String 借款编号) {
        this.借款编号 = 借款编号;
    }

    public String get责任人所在部门() {
        return 责任人所在部门;
    }

    public void set责任人所在部门(String 责任人所在部门) {
        this.责任人所在部门 = 责任人所在部门;
    }

    public String get借款人姓名() {
        return 借款人姓名;
    }

    public void set借款人姓名(String 借款人姓名) {
        this.借款人姓名 = 借款人姓名;
    }

    public String get借款日期() {
        return 借款日期;
    }

    public void set借款日期(String 借款日期) {
        this.借款日期 = 借款日期;
    }

    public String get借款用途() {
        return 借款用途;
    }

    public void set借款用途(String 借款用途) {
        this.借款用途 = 借款用途;
    }

    public BigDecimal get金额() {
        return 金额;
    }

    public void set金额(BigDecimal 金额) {
        this.金额 = 金额;
    }

    public String get还款时间() {
        return 还款时间;
    }

    public void set还款时间(String 还款时间) {
        this.还款时间 = 还款时间;
    }

    public BigDecimal get还款金额() {
        return 还款金额;
    }

    public void set还款金额(BigDecimal 还款金额) {
        this.还款金额 = 还款金额;
    }

    public String get创建时间() {
        return 创建时间;
    }

    public void set创建时间(String 创建时间) {
        this.创建时间 = 创建时间;
    }

    public String get创建人() {
        return 创建人;
    }

    public void set创建人(String 创建人) {
        this.创建人 = 创建人;
    }

    public String get创建人编号() {
        return 创建人编号;
    }

    public void set创建人编号(String 创建人编号) {
        this.创建人编号 = 创建人编号;
    }

    public String get责任人() {
        return 责任人;
    }

    public void set责任人(String 责任人) {
        this.责任人 = 责任人;
    }

    public String get借款人账号() {
        return 借款人账号;
    }

    public void set借款人账号(String 借款人账号) {
        this.借款人账号 = 借款人账号;
    }

    public String get开户行() {
        return 开户行;
    }

    public void set开户行(String 开户行) {
        this.开户行 = 开户行;
    }

    public String get借款说明() {
        return 借款说明;
    }

    public void set借款说明(String 借款说明) {
        this.借款说明 = 借款说明;
    }

    public String get账户编号() {
        return 账户编号;
    }

    public void set账户编号(String 账户编号) {
        this.账户编号 = 账户编号;
    }

    public String get账户名称() {
        return 账户名称;
    }

    public void set账户名称(String 账户名称) {
        this.账户名称 = 账户名称;
    }

    public BigDecimal get剩余金额() {
        return 剩余金额;
    }

    public void set剩余金额(BigDecimal 剩余金额) {
        this.剩余金额 = 剩余金额;
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

    public String get借款状态编号() {
        return 借款状态编号;
    }

    public void set借款状态编号(String 借款状态编号) {
        this.借款状态编号 = 借款状态编号;
    }

    public String get借款状态() {
        return 借款状态;
    }

    public void set借款状态(String 借款状态) {
        this.借款状态 = 借款状态;
    }

    public String get编号() {
        return 编号;
    }

    public void set编号(String 编号) {
        this.编号 = 编号;
    }

    public BigDecimal get状态() {
        return 状态;
    }

    public void set状态(BigDecimal 状态) {
        this.状态 = 状态;
    }

    public String get责任人编号() {
        return 责任人编号;
    }

    public void set责任人编号(String 责任人编号) {
        this.责任人编号 = 责任人编号;
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
        return "Yw借款单{" +
        "借款编号=" + 借款编号 +
        ", 责任人所在部门=" + 责任人所在部门 +
        ", 借款人姓名=" + 借款人姓名 +
        ", 借款日期=" + 借款日期 +
        ", 借款用途=" + 借款用途 +
        ", 金额=" + 金额 +
        ", 还款时间=" + 还款时间 +
        ", 还款金额=" + 还款金额 +
        ", 创建时间=" + 创建时间 +
        ", 创建人=" + 创建人 +
        ", 创建人编号=" + 创建人编号 +
        ", 责任人=" + 责任人 +
        ", 借款人账号=" + 借款人账号 +
        ", 开户行=" + 开户行 +
        ", 借款说明=" + 借款说明 +
        ", 账户编号=" + 账户编号 +
        ", 账户名称=" + 账户名称 +
        ", 剩余金额=" + 剩余金额 +
        ", 流程实例编号=" + 流程实例编号 +
        ", aREACODE=" + aREACODE +
        ", 借款状态编号=" + 借款状态编号 +
        ", 借款状态=" + 借款状态 +
        ", 编号=" + 编号 +
        ", 状态=" + 状态 +
        ", 责任人编号=" + 责任人编号 +
        ", 确认人=" + 确认人 +
        ", 确认人编号=" + 确认人编号 +
        ", 确认时间=" + 确认时间 +
        "}";
    }
}

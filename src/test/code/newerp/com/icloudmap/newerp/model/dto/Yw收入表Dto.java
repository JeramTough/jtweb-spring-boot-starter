package com.icloudmap.newerp.model.entity;

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
@TableName("YW_收入表")
@ApiModel(value="Yw收入表对象", description="")
public class Yw收入表Dto implements Serializable{

    private static final long serialVersionUID=1L;

    private String 收入编号;

    private String 账户编号;

    private String 项目编号;

    private String 付款方名称;

    private String 付款方代码;

    private String 开票日期;

    private String 开票项目名称;

    private String 费用类型;

    private String 费用类型编号;

    private Float 金额;

    private String 发票编号;

    private Long 发票张数;

    private Float 回款金额;

    private String 回款日期;

    private String 责任人编号;

    private String 责任人名称;

    @ApiModelProperty(value = "0:未完成回款，1：已完成回款")
    private Integer 状态;

    private String 创建人;

    private String 创建时间;

    private String 创建人编号;

    private String 修改人;

    private String 修改时间;

    private String 修改人编号;

    private String 备注;

    private String 编号;

    private String 办件编号;

    private String 确认人;

    private String 确认人编号;

    private String 确认时间;

    private String 流程实例编号;


    public String get收入编号() {
        return 收入编号;
    }

    public void set收入编号(String 收入编号) {
        this.收入编号 = 收入编号;
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

    public String get付款方名称() {
        return 付款方名称;
    }

    public void set付款方名称(String 付款方名称) {
        this.付款方名称 = 付款方名称;
    }

    public String get付款方代码() {
        return 付款方代码;
    }

    public void set付款方代码(String 付款方代码) {
        this.付款方代码 = 付款方代码;
    }

    public String get开票日期() {
        return 开票日期;
    }

    public void set开票日期(String 开票日期) {
        this.开票日期 = 开票日期;
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

    public Float get金额() {
        return 金额;
    }

    public void set金额(Float 金额) {
        this.金额 = 金额;
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

    public Float get回款金额() {
        return 回款金额;
    }

    public void set回款金额(Float 回款金额) {
        this.回款金额 = 回款金额;
    }

    public String get回款日期() {
        return 回款日期;
    }

    public void set回款日期(String 回款日期) {
        this.回款日期 = 回款日期;
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

    public String get流程实例编号() {
        return 流程实例编号;
    }

    public void set流程实例编号(String 流程实例编号) {
        this.流程实例编号 = 流程实例编号;
    }

    @Override
    public String toString() {
        return "Yw收入表{" +
        "收入编号=" + 收入编号 +
        ", 账户编号=" + 账户编号 +
        ", 项目编号=" + 项目编号 +
        ", 付款方名称=" + 付款方名称 +
        ", 付款方代码=" + 付款方代码 +
        ", 开票日期=" + 开票日期 +
        ", 开票项目名称=" + 开票项目名称 +
        ", 费用类型=" + 费用类型 +
        ", 费用类型编号=" + 费用类型编号 +
        ", 金额=" + 金额 +
        ", 发票编号=" + 发票编号 +
        ", 发票张数=" + 发票张数 +
        ", 回款金额=" + 回款金额 +
        ", 回款日期=" + 回款日期 +
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
        ", 编号=" + 编号 +
        ", 办件编号=" + 办件编号 +
        ", 确认人=" + 确认人 +
        ", 确认人编号=" + 确认人编号 +
        ", 确认时间=" + 确认时间 +
        ", 流程实例编号=" + 流程实例编号 +
        "}";
    }
}

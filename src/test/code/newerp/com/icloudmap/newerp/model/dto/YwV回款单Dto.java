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
@TableName("YW_V_回款单")
@ApiModel(value="YwV回款单对象", description="")
public class YwV回款单Dto implements Serializable{

    private static final long serialVersionUID=1L;

    private String 回款编号;

    private String 回款类型;

    private String 回款类型编号;

    private String 项目编号;

    private BigDecimal 回款金额;

    private String 到款日期;

    private String 户名;

    private String 户名编号;

    private String 收款账号;

    private String 备注;

    private String 创建人;

    private String 创建人编号;

    private String 创建时间;

    private String 商务经理;

    private String 项目名称;

    private BigDecimal 合同金额;

    private BigDecimal 应收金额;

    private String 客户名称;

    private String 客户编号;


    public String get回款编号() {
        return 回款编号;
    }

    public void set回款编号(String 回款编号) {
        this.回款编号 = 回款编号;
    }

    public String get回款类型() {
        return 回款类型;
    }

    public void set回款类型(String 回款类型) {
        this.回款类型 = 回款类型;
    }

    public String get回款类型编号() {
        return 回款类型编号;
    }

    public void set回款类型编号(String 回款类型编号) {
        this.回款类型编号 = 回款类型编号;
    }

    public String get项目编号() {
        return 项目编号;
    }

    public void set项目编号(String 项目编号) {
        this.项目编号 = 项目编号;
    }

    public BigDecimal get回款金额() {
        return 回款金额;
    }

    public void set回款金额(BigDecimal 回款金额) {
        this.回款金额 = 回款金额;
    }

    public String get到款日期() {
        return 到款日期;
    }

    public void set到款日期(String 到款日期) {
        this.到款日期 = 到款日期;
    }

    public String get户名() {
        return 户名;
    }

    public void set户名(String 户名) {
        this.户名 = 户名;
    }

    public String get户名编号() {
        return 户名编号;
    }

    public void set户名编号(String 户名编号) {
        this.户名编号 = 户名编号;
    }

    public String get收款账号() {
        return 收款账号;
    }

    public void set收款账号(String 收款账号) {
        this.收款账号 = 收款账号;
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

    public String get创建人编号() {
        return 创建人编号;
    }

    public void set创建人编号(String 创建人编号) {
        this.创建人编号 = 创建人编号;
    }

    public String get创建时间() {
        return 创建时间;
    }

    public void set创建时间(String 创建时间) {
        this.创建时间 = 创建时间;
    }

    public String get商务经理() {
        return 商务经理;
    }

    public void set商务经理(String 商务经理) {
        this.商务经理 = 商务经理;
    }

    public String get项目名称() {
        return 项目名称;
    }

    public void set项目名称(String 项目名称) {
        this.项目名称 = 项目名称;
    }

    public BigDecimal get合同金额() {
        return 合同金额;
    }

    public void set合同金额(BigDecimal 合同金额) {
        this.合同金额 = 合同金额;
    }

    public BigDecimal get应收金额() {
        return 应收金额;
    }

    public void set应收金额(BigDecimal 应收金额) {
        this.应收金额 = 应收金额;
    }

    public String get客户名称() {
        return 客户名称;
    }

    public void set客户名称(String 客户名称) {
        this.客户名称 = 客户名称;
    }

    public String get客户编号() {
        return 客户编号;
    }

    public void set客户编号(String 客户编号) {
        this.客户编号 = 客户编号;
    }

    @Override
    public String toString() {
        return "YwV回款单{" +
        "回款编号=" + 回款编号 +
        ", 回款类型=" + 回款类型 +
        ", 回款类型编号=" + 回款类型编号 +
        ", 项目编号=" + 项目编号 +
        ", 回款金额=" + 回款金额 +
        ", 到款日期=" + 到款日期 +
        ", 户名=" + 户名 +
        ", 户名编号=" + 户名编号 +
        ", 收款账号=" + 收款账号 +
        ", 备注=" + 备注 +
        ", 创建人=" + 创建人 +
        ", 创建人编号=" + 创建人编号 +
        ", 创建时间=" + 创建时间 +
        ", 商务经理=" + 商务经理 +
        ", 项目名称=" + 项目名称 +
        ", 合同金额=" + 合同金额 +
        ", 应收金额=" + 应收金额 +
        ", 客户名称=" + 客户名称 +
        ", 客户编号=" + 客户编号 +
        "}";
    }
}

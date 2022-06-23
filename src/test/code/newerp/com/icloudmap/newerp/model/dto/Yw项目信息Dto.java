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
@TableName("YW_项目信息")
@ApiModel(value="Yw项目信息对象", description="")
public class Yw项目信息Dto implements Serializable{

    private static final long serialVersionUID=1L;

    private String 项目编号;

    private String 项目名称;

    private String 商务经理;

    private String 项目经理;

    private String 签约时间;

    private BigDecimal 预计金额;

    private BigDecimal 合同金额;

    private BigDecimal 应收金额;

    private BigDecimal 累计花销;

    private BigDecimal 开票金额;

    private String 归档状态;

    private String 项目类型;

    private String 项目状态;

    private BigDecimal 成本阀值;

    private String 商务经理编号;

    private String 项目经理编号;

    private String 项目状态编号;

    private String 备注;

    private String 创建人;

    private String 创建时间;

    private String 项目类型编号;

    @ApiModelProperty(value = "行政区域")
    @TableField("AREACODE")
    private String aREACODE;

    private String 客户名称;

    private String 客户编号;

    private String 账户编号;

    private String 账户名称;

    private String 开发工作描述;

    private BigDecimal 开发完成量;

    private String 实施工作描述;

    private BigDecimal 实施完成量;

    private BigDecimal 总完成量;

    private String 验收时间;

    private String 验收情况描述;

    private String 商务描述;

    private String 创建人编号;

    private String 项目归属地;


    public String get项目编号() {
        return 项目编号;
    }

    public void set项目编号(String 项目编号) {
        this.项目编号 = 项目编号;
    }

    public String get项目名称() {
        return 项目名称;
    }

    public void set项目名称(String 项目名称) {
        this.项目名称 = 项目名称;
    }

    public String get商务经理() {
        return 商务经理;
    }

    public void set商务经理(String 商务经理) {
        this.商务经理 = 商务经理;
    }

    public String get项目经理() {
        return 项目经理;
    }

    public void set项目经理(String 项目经理) {
        this.项目经理 = 项目经理;
    }

    public String get签约时间() {
        return 签约时间;
    }

    public void set签约时间(String 签约时间) {
        this.签约时间 = 签约时间;
    }

    public BigDecimal get预计金额() {
        return 预计金额;
    }

    public void set预计金额(BigDecimal 预计金额) {
        this.预计金额 = 预计金额;
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

    public BigDecimal get累计花销() {
        return 累计花销;
    }

    public void set累计花销(BigDecimal 累计花销) {
        this.累计花销 = 累计花销;
    }

    public BigDecimal get开票金额() {
        return 开票金额;
    }

    public void set开票金额(BigDecimal 开票金额) {
        this.开票金额 = 开票金额;
    }

    public String get归档状态() {
        return 归档状态;
    }

    public void set归档状态(String 归档状态) {
        this.归档状态 = 归档状态;
    }

    public String get项目类型() {
        return 项目类型;
    }

    public void set项目类型(String 项目类型) {
        this.项目类型 = 项目类型;
    }

    public String get项目状态() {
        return 项目状态;
    }

    public void set项目状态(String 项目状态) {
        this.项目状态 = 项目状态;
    }

    public BigDecimal get成本阀值() {
        return 成本阀值;
    }

    public void set成本阀值(BigDecimal 成本阀值) {
        this.成本阀值 = 成本阀值;
    }

    public String get商务经理编号() {
        return 商务经理编号;
    }

    public void set商务经理编号(String 商务经理编号) {
        this.商务经理编号 = 商务经理编号;
    }

    public String get项目经理编号() {
        return 项目经理编号;
    }

    public void set项目经理编号(String 项目经理编号) {
        this.项目经理编号 = 项目经理编号;
    }

    public String get项目状态编号() {
        return 项目状态编号;
    }

    public void set项目状态编号(String 项目状态编号) {
        this.项目状态编号 = 项目状态编号;
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

    public String get项目类型编号() {
        return 项目类型编号;
    }

    public void set项目类型编号(String 项目类型编号) {
        this.项目类型编号 = 项目类型编号;
    }

    public String getaREACODE() {
        return aREACODE;
    }

    public void setaREACODE(String aREACODE) {
        this.aREACODE = aREACODE;
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

    public String get开发工作描述() {
        return 开发工作描述;
    }

    public void set开发工作描述(String 开发工作描述) {
        this.开发工作描述 = 开发工作描述;
    }

    public BigDecimal get开发完成量() {
        return 开发完成量;
    }

    public void set开发完成量(BigDecimal 开发完成量) {
        this.开发完成量 = 开发完成量;
    }

    public String get实施工作描述() {
        return 实施工作描述;
    }

    public void set实施工作描述(String 实施工作描述) {
        this.实施工作描述 = 实施工作描述;
    }

    public BigDecimal get实施完成量() {
        return 实施完成量;
    }

    public void set实施完成量(BigDecimal 实施完成量) {
        this.实施完成量 = 实施完成量;
    }

    public BigDecimal get总完成量() {
        return 总完成量;
    }

    public void set总完成量(BigDecimal 总完成量) {
        this.总完成量 = 总完成量;
    }

    public String get验收时间() {
        return 验收时间;
    }

    public void set验收时间(String 验收时间) {
        this.验收时间 = 验收时间;
    }

    public String get验收情况描述() {
        return 验收情况描述;
    }

    public void set验收情况描述(String 验收情况描述) {
        this.验收情况描述 = 验收情况描述;
    }

    public String get商务描述() {
        return 商务描述;
    }

    public void set商务描述(String 商务描述) {
        this.商务描述 = 商务描述;
    }

    public String get创建人编号() {
        return 创建人编号;
    }

    public void set创建人编号(String 创建人编号) {
        this.创建人编号 = 创建人编号;
    }

    public String get项目归属地() {
        return 项目归属地;
    }

    public void set项目归属地(String 项目归属地) {
        this.项目归属地 = 项目归属地;
    }

    @Override
    public String toString() {
        return "Yw项目信息{" +
        "项目编号=" + 项目编号 +
        ", 项目名称=" + 项目名称 +
        ", 商务经理=" + 商务经理 +
        ", 项目经理=" + 项目经理 +
        ", 签约时间=" + 签约时间 +
        ", 预计金额=" + 预计金额 +
        ", 合同金额=" + 合同金额 +
        ", 应收金额=" + 应收金额 +
        ", 累计花销=" + 累计花销 +
        ", 开票金额=" + 开票金额 +
        ", 归档状态=" + 归档状态 +
        ", 项目类型=" + 项目类型 +
        ", 项目状态=" + 项目状态 +
        ", 成本阀值=" + 成本阀值 +
        ", 商务经理编号=" + 商务经理编号 +
        ", 项目经理编号=" + 项目经理编号 +
        ", 项目状态编号=" + 项目状态编号 +
        ", 备注=" + 备注 +
        ", 创建人=" + 创建人 +
        ", 创建时间=" + 创建时间 +
        ", 项目类型编号=" + 项目类型编号 +
        ", aREACODE=" + aREACODE +
        ", 客户名称=" + 客户名称 +
        ", 客户编号=" + 客户编号 +
        ", 账户编号=" + 账户编号 +
        ", 账户名称=" + 账户名称 +
        ", 开发工作描述=" + 开发工作描述 +
        ", 开发完成量=" + 开发完成量 +
        ", 实施工作描述=" + 实施工作描述 +
        ", 实施完成量=" + 实施完成量 +
        ", 总完成量=" + 总完成量 +
        ", 验收时间=" + 验收时间 +
        ", 验收情况描述=" + 验收情况描述 +
        ", 商务描述=" + 商务描述 +
        ", 创建人编号=" + 创建人编号 +
        ", 项目归属地=" + 项目归属地 +
        "}";
    }
}

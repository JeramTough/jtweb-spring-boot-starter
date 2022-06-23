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
@TableName("YW_V_项目信息")
@ApiModel(value = "YwV项目信息对象", description = "")
public class YwV项目信息 implements Serializable{

private static final long serialVersionUID=1L;

    @TableField("项目编号")
        private String 项目编号;

    @TableField("项目归属地")
        private String 项目归属地;

    @TableField("项目名称")
        private String 项目名称;

    @TableField("商务经理")
        private String 商务经理;

    @TableField("项目经理")
        private String 项目经理;

    @TableField("签约时间")
        private String 签约时间;

    @TableField("预计金额")
        private BigDecimal 预计金额;

    @TableField("合同金额")
        private BigDecimal 合同金额;

    @TableField("应收金额")
        private BigDecimal 应收金额;

    @TableField("累计花销")
        private BigDecimal 累计花销;

    @TableField("开票金额")
        private BigDecimal 开票金额;

    @TableField("归档状态")
        private String 归档状态;

    @TableField("项目类型")
        private String 项目类型;

    @TableField("项目状态")
        private String 项目状态;

    @TableField("成本阀值")
        private BigDecimal 成本阀值;

    @TableField("商务经理编号")
        private String 商务经理编号;

    @TableField("项目经理编号")
        private String 项目经理编号;

    @TableField("项目状态编号")
        private String 项目状态编号;

    @TableField("备注")
        private String 备注;

    @TableField("创建人")
        private String 创建人;

    @TableField("创建时间")
        private String 创建时间;

    @TableField("项目类型编号")
        private String 项目类型编号;

    @TableField("AREACODE")
        private String aREACODE;

    @TableField("客户名称")
        private String 客户名称;

    @TableField("客户编号")
        private String 客户编号;

    @TableField("账户编号")
        private String 账户编号;

    @TableField("账户名称")
        private String 账户名称;

    @TableField("开发工作描述")
        private String 开发工作描述;

    @TableField("开发完成量")
        private BigDecimal 开发完成量;

    @TableField("实施工作描述")
        private String 实施工作描述;

    @TableField("实施完成量")
        private BigDecimal 实施完成量;

    @TableField("总完成量")
        private BigDecimal 总完成量;

    @TableField("验收时间")
        private String 验收时间;

    @TableField("验收情况描述")
        private String 验收情况描述;

    @TableField("商务描述")
        private String 商务描述;

    @TableField("创建人编号")
        private String 创建人编号;

    @TableField("回款金额")
        private BigDecimal 回款金额;

    @TableField("开户行")
        private String 开户行;

    @TableField("账号")
        private String 账号;

    @TableField("社会统一信用代码")
        private String 社会统一信用代码;

    @TableField("联系地址")
        private String 联系地址;

    @TableField("办公电话")
        private String 办公电话;

    @TableField("邮政编码")
        private String 邮政编码;

    @TableField("联系电话")
        private String 联系电话;


    public String get项目编号(){
            return 项目编号;
            }

        public void set项目编号(String 项目编号) {
            this.项目编号 = 项目编号;
            }

    public String get项目归属地(){
            return 项目归属地;
            }

        public void set项目归属地(String 项目归属地) {
            this.项目归属地 = 项目归属地;
            }

    public String get项目名称(){
            return 项目名称;
            }

        public void set项目名称(String 项目名称) {
            this.项目名称 = 项目名称;
            }

    public String get商务经理(){
            return 商务经理;
            }

        public void set商务经理(String 商务经理) {
            this.商务经理 = 商务经理;
            }

    public String get项目经理(){
            return 项目经理;
            }

        public void set项目经理(String 项目经理) {
            this.项目经理 = 项目经理;
            }

    public String get签约时间(){
            return 签约时间;
            }

        public void set签约时间(String 签约时间) {
            this.签约时间 = 签约时间;
            }

    public BigDecimal get预计金额(){
            return 预计金额;
            }

        public void set预计金额(BigDecimal 预计金额) {
            this.预计金额 = 预计金额;
            }

    public BigDecimal get合同金额(){
            return 合同金额;
            }

        public void set合同金额(BigDecimal 合同金额) {
            this.合同金额 = 合同金额;
            }

    public BigDecimal get应收金额(){
            return 应收金额;
            }

        public void set应收金额(BigDecimal 应收金额) {
            this.应收金额 = 应收金额;
            }

    public BigDecimal get累计花销(){
            return 累计花销;
            }

        public void set累计花销(BigDecimal 累计花销) {
            this.累计花销 = 累计花销;
            }

    public BigDecimal get开票金额(){
            return 开票金额;
            }

        public void set开票金额(BigDecimal 开票金额) {
            this.开票金额 = 开票金额;
            }

    public String get归档状态(){
            return 归档状态;
            }

        public void set归档状态(String 归档状态) {
            this.归档状态 = 归档状态;
            }

    public String get项目类型(){
            return 项目类型;
            }

        public void set项目类型(String 项目类型) {
            this.项目类型 = 项目类型;
            }

    public String get项目状态(){
            return 项目状态;
            }

        public void set项目状态(String 项目状态) {
            this.项目状态 = 项目状态;
            }

    public BigDecimal get成本阀值(){
            return 成本阀值;
            }

        public void set成本阀值(BigDecimal 成本阀值) {
            this.成本阀值 = 成本阀值;
            }

    public String get商务经理编号(){
            return 商务经理编号;
            }

        public void set商务经理编号(String 商务经理编号) {
            this.商务经理编号 = 商务经理编号;
            }

    public String get项目经理编号(){
            return 项目经理编号;
            }

        public void set项目经理编号(String 项目经理编号) {
            this.项目经理编号 = 项目经理编号;
            }

    public String get项目状态编号(){
            return 项目状态编号;
            }

        public void set项目状态编号(String 项目状态编号) {
            this.项目状态编号 = 项目状态编号;
            }

    public String get备注(){
            return 备注;
            }

        public void set备注(String 备注) {
            this.备注 = 备注;
            }

    public String get创建人(){
            return 创建人;
            }

        public void set创建人(String 创建人) {
            this.创建人 = 创建人;
            }

    public String get创建时间(){
            return 创建时间;
            }

        public void set创建时间(String 创建时间) {
            this.创建时间 = 创建时间;
            }

    public String get项目类型编号(){
            return 项目类型编号;
            }

        public void set项目类型编号(String 项目类型编号) {
            this.项目类型编号 = 项目类型编号;
            }

    public String getaREACODE(){
            return aREACODE;
            }

        public void setaREACODE(String aREACODE) {
            this.aREACODE = aREACODE;
            }

    public String get客户名称(){
            return 客户名称;
            }

        public void set客户名称(String 客户名称) {
            this.客户名称 = 客户名称;
            }

    public String get客户编号(){
            return 客户编号;
            }

        public void set客户编号(String 客户编号) {
            this.客户编号 = 客户编号;
            }

    public String get账户编号(){
            return 账户编号;
            }

        public void set账户编号(String 账户编号) {
            this.账户编号 = 账户编号;
            }

    public String get账户名称(){
            return 账户名称;
            }

        public void set账户名称(String 账户名称) {
            this.账户名称 = 账户名称;
            }

    public String get开发工作描述(){
            return 开发工作描述;
            }

        public void set开发工作描述(String 开发工作描述) {
            this.开发工作描述 = 开发工作描述;
            }

    public BigDecimal get开发完成量(){
            return 开发完成量;
            }

        public void set开发完成量(BigDecimal 开发完成量) {
            this.开发完成量 = 开发完成量;
            }

    public String get实施工作描述(){
            return 实施工作描述;
            }

        public void set实施工作描述(String 实施工作描述) {
            this.实施工作描述 = 实施工作描述;
            }

    public BigDecimal get实施完成量(){
            return 实施完成量;
            }

        public void set实施完成量(BigDecimal 实施完成量) {
            this.实施完成量 = 实施完成量;
            }

    public BigDecimal get总完成量(){
            return 总完成量;
            }

        public void set总完成量(BigDecimal 总完成量) {
            this.总完成量 = 总完成量;
            }

    public String get验收时间(){
            return 验收时间;
            }

        public void set验收时间(String 验收时间) {
            this.验收时间 = 验收时间;
            }

    public String get验收情况描述(){
            return 验收情况描述;
            }

        public void set验收情况描述(String 验收情况描述) {
            this.验收情况描述 = 验收情况描述;
            }

    public String get商务描述(){
            return 商务描述;
            }

        public void set商务描述(String 商务描述) {
            this.商务描述 = 商务描述;
            }

    public String get创建人编号(){
            return 创建人编号;
            }

        public void set创建人编号(String 创建人编号) {
            this.创建人编号 = 创建人编号;
            }

    public BigDecimal get回款金额(){
            return 回款金额;
            }

        public void set回款金额(BigDecimal 回款金额) {
            this.回款金额 = 回款金额;
            }

    public String get开户行(){
            return 开户行;
            }

        public void set开户行(String 开户行) {
            this.开户行 = 开户行;
            }

    public String get账号(){
            return 账号;
            }

        public void set账号(String 账号) {
            this.账号 = 账号;
            }

    public String get社会统一信用代码(){
            return 社会统一信用代码;
            }

        public void set社会统一信用代码(String 社会统一信用代码) {
            this.社会统一信用代码 = 社会统一信用代码;
            }

    public String get联系地址(){
            return 联系地址;
            }

        public void set联系地址(String 联系地址) {
            this.联系地址 = 联系地址;
            }

    public String get办公电话(){
            return 办公电话;
            }

        public void set办公电话(String 办公电话) {
            this.办公电话 = 办公电话;
            }

    public String get邮政编码(){
            return 邮政编码;
            }

        public void set邮政编码(String 邮政编码) {
            this.邮政编码 = 邮政编码;
            }

    public String get联系电话(){
            return 联系电话;
            }

        public void set联系电话(String 联系电话) {
            this.联系电话 = 联系电话;
            }
    
@Override
public String toString() {
        return "YwV项目信息{" +
                "项目编号=" + 项目编号 +
                ", 项目归属地=" + 项目归属地 +
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
                ", 回款金额=" + 回款金额 +
                ", 开户行=" + 开户行 +
                ", 账号=" + 账号 +
                ", 社会统一信用代码=" + 社会统一信用代码 +
                ", 联系地址=" + 联系地址 +
                ", 办公电话=" + 办公电话 +
                ", 邮政编码=" + 邮政编码 +
                ", 联系电话=" + 联系电话 +
        "}";
        }
        }

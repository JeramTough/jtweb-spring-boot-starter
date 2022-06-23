package com.icloudmap.newerp.model.entity;

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
@TableName("YW_V_报销单")
@ApiModel(value="YwV报销单对象", description="")
public class YwV报销单Dto implements Serializable{

    private static final long serialVersionUID=1L;

    private String 报销单号;

    private String 支付账户;

    private String 支付账户编号;

    private String 报销类型;

    private String 报销人编号;

    private String 报销人;

    private String 报销时间;

    private String 总金额;

    private String 票据总数;

    private String 报销状态;

    private String 备注;

    private String 归属项目编号;

    private String 项目归属地;

    private String 开户银行;

    private String 收款人账号;

    private String 创建人;

    private String 创建时间;

    private String 流程实例编号;

    @TableField("AREACODE")
    private String aREACODE;

    private String 报销类型编号;

    private String 报销状态编码;

    private String 创建人编号;

    private String 项目已花费;

    private String 项目名称;

    private String 商务经理;

    private String 项目经理;

    private String 签约时间;

    private String 预计金额;

    private String 合同金额;

    private String 累计花销;

    private String 项目类型;

    private String 项目状态;

    private String 成本阀值;

    @TableField("NODENAME")
    private String nODENAME;

    private String 报销金额合计;

    @TableField("STAFFCODE")
    private String sTAFFCODE;

    @TableField("STAFFNAME")
    private String sTAFFNAME;

    @TableField("DEPTCODE")
    private String dEPTCODE;

    @TableField("DEPTNAME")
    private String dEPTNAME;


    public String get报销单号() {
        return 报销单号;
    }

    public void set报销单号(String 报销单号) {
        this.报销单号 = 报销单号;
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

    public String get总金额() {
        return 总金额;
    }

    public void set总金额(String 总金额) {
        this.总金额 = 总金额;
    }

    public String get票据总数() {
        return 票据总数;
    }

    public void set票据总数(String 票据总数) {
        this.票据总数 = 票据总数;
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

    public String get项目归属地() {
        return 项目归属地;
    }

    public void set项目归属地(String 项目归属地) {
        this.项目归属地 = 项目归属地;
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

    public String get项目已花费() {
        return 项目已花费;
    }

    public void set项目已花费(String 项目已花费) {
        this.项目已花费 = 项目已花费;
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

    public String get预计金额() {
        return 预计金额;
    }

    public void set预计金额(String 预计金额) {
        this.预计金额 = 预计金额;
    }

    public String get合同金额() {
        return 合同金额;
    }

    public void set合同金额(String 合同金额) {
        this.合同金额 = 合同金额;
    }

    public String get累计花销() {
        return 累计花销;
    }

    public void set累计花销(String 累计花销) {
        this.累计花销 = 累计花销;
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

    public String get成本阀值() {
        return 成本阀值;
    }

    public void set成本阀值(String 成本阀值) {
        this.成本阀值 = 成本阀值;
    }

    public String getnODENAME() {
        return nODENAME;
    }

    public void setnODENAME(String nODENAME) {
        this.nODENAME = nODENAME;
    }

    public String get报销金额合计() {
        return 报销金额合计;
    }

    public void set报销金额合计(String 报销金额合计) {
        this.报销金额合计 = 报销金额合计;
    }

    public String getsTAFFCODE() {
        return sTAFFCODE;
    }

    public void setsTAFFCODE(String sTAFFCODE) {
        this.sTAFFCODE = sTAFFCODE;
    }

    public String getsTAFFNAME() {
        return sTAFFNAME;
    }

    public void setsTAFFNAME(String sTAFFNAME) {
        this.sTAFFNAME = sTAFFNAME;
    }

    public String getdEPTCODE() {
        return dEPTCODE;
    }

    public void setdEPTCODE(String dEPTCODE) {
        this.dEPTCODE = dEPTCODE;
    }

    public String getdEPTNAME() {
        return dEPTNAME;
    }

    public void setdEPTNAME(String dEPTNAME) {
        this.dEPTNAME = dEPTNAME;
    }

    @Override
    public String toString() {
        return "YwV报销单{" +
        "报销单号=" + 报销单号 +
        ", 支付账户=" + 支付账户 +
        ", 支付账户编号=" + 支付账户编号 +
        ", 报销类型=" + 报销类型 +
        ", 报销人编号=" + 报销人编号 +
        ", 报销人=" + 报销人 +
        ", 报销时间=" + 报销时间 +
        ", 总金额=" + 总金额 +
        ", 票据总数=" + 票据总数 +
        ", 报销状态=" + 报销状态 +
        ", 备注=" + 备注 +
        ", 归属项目编号=" + 归属项目编号 +
        ", 项目归属地=" + 项目归属地 +
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
        ", 项目名称=" + 项目名称 +
        ", 商务经理=" + 商务经理 +
        ", 项目经理=" + 项目经理 +
        ", 签约时间=" + 签约时间 +
        ", 预计金额=" + 预计金额 +
        ", 合同金额=" + 合同金额 +
        ", 累计花销=" + 累计花销 +
        ", 项目类型=" + 项目类型 +
        ", 项目状态=" + 项目状态 +
        ", 成本阀值=" + 成本阀值 +
        ", nODENAME=" + nODENAME +
        ", 报销金额合计=" + 报销金额合计 +
        ", sTAFFCODE=" + sTAFFCODE +
        ", sTAFFNAME=" + sTAFFNAME +
        ", dEPTCODE=" + dEPTCODE +
        ", dEPTNAME=" + dEPTNAME +
        "}";
    }
}

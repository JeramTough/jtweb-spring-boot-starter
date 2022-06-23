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
@TableName("YW_报销单明细")
@ApiModel(value = "Yw报销单明细对象", description = "")
public class Yw报销单明细 implements Serializable{

private static final long serialVersionUID=1L;

                        private String 明细编号;

    @TableField("报销单号")
        private String 报销单号;

    @TableField("费用大类编号")
        private String 费用大类编号;

    @TableField("费用大类")
        private String 费用大类;

    @TableField("费用小类编号")
        private String 费用小类编号;

    @TableField("费用小类")
        private String 费用小类;

    @TableField("报销金额")
        private BigDecimal 报销金额;

    @TableField("时间")
        private String 时间;

    @TableField("备注")
        private String 备注;

    @TableField("可报金额")
        private BigDecimal 可报金额;

        @ApiModelProperty(value = "行政区域")
    @TableField("AREACODE")
        private String aREACODE;

    @TableField("创建人")
        private String 创建人;

    @TableField("创建时间")
        private String 创建时间;

    @TableField("创建人编号")
        private String 创建人编号;

    @TableField("结束时间")
        private String 结束时间;

    @TableField("票据张数")
        private BigDecimal 票据张数;


    public String get明细编号(){
            return 明细编号;
            }

        public void set明细编号(String 明细编号) {
            this.明细编号 = 明细编号;
            }

    public String get报销单号(){
            return 报销单号;
            }

        public void set报销单号(String 报销单号) {
            this.报销单号 = 报销单号;
            }

    public String get费用大类编号(){
            return 费用大类编号;
            }

        public void set费用大类编号(String 费用大类编号) {
            this.费用大类编号 = 费用大类编号;
            }

    public String get费用大类(){
            return 费用大类;
            }

        public void set费用大类(String 费用大类) {
            this.费用大类 = 费用大类;
            }

    public String get费用小类编号(){
            return 费用小类编号;
            }

        public void set费用小类编号(String 费用小类编号) {
            this.费用小类编号 = 费用小类编号;
            }

    public String get费用小类(){
            return 费用小类;
            }

        public void set费用小类(String 费用小类) {
            this.费用小类 = 费用小类;
            }

    public BigDecimal get报销金额(){
            return 报销金额;
            }

        public void set报销金额(BigDecimal 报销金额) {
            this.报销金额 = 报销金额;
            }

    public String get时间(){
            return 时间;
            }

        public void set时间(String 时间) {
            this.时间 = 时间;
            }

    public String get备注(){
            return 备注;
            }

        public void set备注(String 备注) {
            this.备注 = 备注;
            }

    public BigDecimal get可报金额(){
            return 可报金额;
            }

        public void set可报金额(BigDecimal 可报金额) {
            this.可报金额 = 可报金额;
            }

    public String getaREACODE(){
            return aREACODE;
            }

        public void setaREACODE(String aREACODE) {
            this.aREACODE = aREACODE;
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

    public String get创建人编号(){
            return 创建人编号;
            }

        public void set创建人编号(String 创建人编号) {
            this.创建人编号 = 创建人编号;
            }

    public String get结束时间(){
            return 结束时间;
            }

        public void set结束时间(String 结束时间) {
            this.结束时间 = 结束时间;
            }

    public BigDecimal get票据张数(){
            return 票据张数;
            }

        public void set票据张数(BigDecimal 票据张数) {
            this.票据张数 = 票据张数;
            }
    
@Override
public String toString() {
        return "Yw报销单明细{" +
                "明细编号=" + 明细编号 +
                ", 报销单号=" + 报销单号 +
                ", 费用大类编号=" + 费用大类编号 +
                ", 费用大类=" + 费用大类 +
                ", 费用小类编号=" + 费用小类编号 +
                ", 费用小类=" + 费用小类 +
                ", 报销金额=" + 报销金额 +
                ", 时间=" + 时间 +
                ", 备注=" + 备注 +
                ", 可报金额=" + 可报金额 +
                ", aREACODE=" + aREACODE +
                ", 创建人=" + 创建人 +
                ", 创建时间=" + 创建时间 +
                ", 创建人编号=" + 创建人编号 +
                ", 结束时间=" + 结束时间 +
                ", 票据张数=" + 票据张数 +
        "}";
        }
        }

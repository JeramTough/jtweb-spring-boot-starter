package com.icloudmap.newerp.model.entity;

import java.math.BigDecimal;
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
@ApiModel(value = "开票明细表对象", description = "")
public class 开票明细表 implements Serializable{

private static final long serialVersionUID=1L;

                        private String 明细编号;

    @TableField("开票编号")
        private String 开票编号;

    @TableField("明细名称")
        private String 明细名称;

    @TableField("规格型号")
        private String 规格型号;

    @TableField("单位")
        private String 单位;

    @TableField("数量")
        private BigDecimal 数量;

    @TableField("单价")
        private BigDecimal 单价;

    @TableField("金额")
        private BigDecimal 金额;

    @TableField("税率")
        private BigDecimal 税率;

    @TableField("税率编号")
        private String 税率编号;

    @TableField("税额")
        private BigDecimal 税额;

    @TableField("创建人")
        private String 创建人;

    @TableField("创建时间")
        private String 创建时间;

    @TableField("创建人编号")
        private String 创建人编号;

    @TableField("修改人")
        private String 修改人;

    @TableField("修改时间")
        private String 修改时间;

    @TableField("修改人编号")
        private String 修改人编号;


    public String get明细编号(){
            return 明细编号;
            }

        public void set明细编号(String 明细编号) {
            this.明细编号 = 明细编号;
            }

    public String get开票编号(){
            return 开票编号;
            }

        public void set开票编号(String 开票编号) {
            this.开票编号 = 开票编号;
            }

    public String get明细名称(){
            return 明细名称;
            }

        public void set明细名称(String 明细名称) {
            this.明细名称 = 明细名称;
            }

    public String get规格型号(){
            return 规格型号;
            }

        public void set规格型号(String 规格型号) {
            this.规格型号 = 规格型号;
            }

    public String get单位(){
            return 单位;
            }

        public void set单位(String 单位) {
            this.单位 = 单位;
            }

    public BigDecimal get数量(){
            return 数量;
            }

        public void set数量(BigDecimal 数量) {
            this.数量 = 数量;
            }

    public BigDecimal get单价(){
            return 单价;
            }

        public void set单价(BigDecimal 单价) {
            this.单价 = 单价;
            }

    public BigDecimal get金额(){
            return 金额;
            }

        public void set金额(BigDecimal 金额) {
            this.金额 = 金额;
            }

    public BigDecimal get税率(){
            return 税率;
            }

        public void set税率(BigDecimal 税率) {
            this.税率 = 税率;
            }

    public String get税率编号(){
            return 税率编号;
            }

        public void set税率编号(String 税率编号) {
            this.税率编号 = 税率编号;
            }

    public BigDecimal get税额(){
            return 税额;
            }

        public void set税额(BigDecimal 税额) {
            this.税额 = 税额;
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

    public String get修改人(){
            return 修改人;
            }

        public void set修改人(String 修改人) {
            this.修改人 = 修改人;
            }

    public String get修改时间(){
            return 修改时间;
            }

        public void set修改时间(String 修改时间) {
            this.修改时间 = 修改时间;
            }

    public String get修改人编号(){
            return 修改人编号;
            }

        public void set修改人编号(String 修改人编号) {
            this.修改人编号 = 修改人编号;
            }
    
@Override
public String toString() {
        return "开票明细表{" +
                "明细编号=" + 明细编号 +
                ", 开票编号=" + 开票编号 +
                ", 明细名称=" + 明细名称 +
                ", 规格型号=" + 规格型号 +
                ", 单位=" + 单位 +
                ", 数量=" + 数量 +
                ", 单价=" + 单价 +
                ", 金额=" + 金额 +
                ", 税率=" + 税率 +
                ", 税率编号=" + 税率编号 +
                ", 税额=" + 税额 +
                ", 创建人=" + 创建人 +
                ", 创建时间=" + 创建时间 +
                ", 创建人编号=" + 创建人编号 +
                ", 修改人=" + 修改人 +
                ", 修改时间=" + 修改时间 +
                ", 修改人编号=" + 修改人编号 +
        "}";
        }
        }

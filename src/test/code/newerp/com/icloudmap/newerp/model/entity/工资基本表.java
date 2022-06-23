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
@ApiModel(value = "工资基本表对象", description = "")
public class 工资基本表 implements Serializable{

private static final long serialVersionUID=1L;

                        private String 编号;

    @TableField("项目编号")
        private String 项目编号;

    @TableField("年")
        private String 年;

    @TableField("月")
        private String 月;

    @TableField("总支出")
        private BigDecimal 总支出;

    @TableField("实发工资")
        private BigDecimal 实发工资;

    @TableField("五险")
        private BigDecimal 五险;

    @TableField("公积金")
        private BigDecimal 公积金;

    @TableField("时间")
        private String 时间;

    @TableField("创建人工号")
        private String 创建人工号;

    @TableField("公户支出")
        private BigDecimal 公户支出;

    @TableField("个户支出")
        private BigDecimal 个户支出;

    @TableField("状态")
        private String 状态;

    @TableField("公户编号")
        private String 公户编号;

    @TableField("公户名称")
        private String 公户名称;

    @TableField("个户编号")
        private String 个户编号;

    @TableField("个户名称")
        private String 个户名称;

    @TableField("工会筹备金")
        private BigDecimal 工会筹备金;

    @TableField("办件编号")
        private String 办件编号;


    public String get编号(){
            return 编号;
            }

        public void set编号(String 编号) {
            this.编号 = 编号;
            }

    public String get项目编号(){
            return 项目编号;
            }

        public void set项目编号(String 项目编号) {
            this.项目编号 = 项目编号;
            }

    public String get年(){
            return 年;
            }

        public void set年(String 年) {
            this.年 = 年;
            }

    public String get月(){
            return 月;
            }

        public void set月(String 月) {
            this.月 = 月;
            }

    public BigDecimal get总支出(){
            return 总支出;
            }

        public void set总支出(BigDecimal 总支出) {
            this.总支出 = 总支出;
            }

    public BigDecimal get实发工资(){
            return 实发工资;
            }

        public void set实发工资(BigDecimal 实发工资) {
            this.实发工资 = 实发工资;
            }

    public BigDecimal get五险(){
            return 五险;
            }

        public void set五险(BigDecimal 五险) {
            this.五险 = 五险;
            }

    public BigDecimal get公积金(){
            return 公积金;
            }

        public void set公积金(BigDecimal 公积金) {
            this.公积金 = 公积金;
            }

    public String get时间(){
            return 时间;
            }

        public void set时间(String 时间) {
            this.时间 = 时间;
            }

    public String get创建人工号(){
            return 创建人工号;
            }

        public void set创建人工号(String 创建人工号) {
            this.创建人工号 = 创建人工号;
            }

    public BigDecimal get公户支出(){
            return 公户支出;
            }

        public void set公户支出(BigDecimal 公户支出) {
            this.公户支出 = 公户支出;
            }

    public BigDecimal get个户支出(){
            return 个户支出;
            }

        public void set个户支出(BigDecimal 个户支出) {
            this.个户支出 = 个户支出;
            }

    public String get状态(){
            return 状态;
            }

        public void set状态(String 状态) {
            this.状态 = 状态;
            }

    public String get公户编号(){
            return 公户编号;
            }

        public void set公户编号(String 公户编号) {
            this.公户编号 = 公户编号;
            }

    public String get公户名称(){
            return 公户名称;
            }

        public void set公户名称(String 公户名称) {
            this.公户名称 = 公户名称;
            }

    public String get个户编号(){
            return 个户编号;
            }

        public void set个户编号(String 个户编号) {
            this.个户编号 = 个户编号;
            }

    public String get个户名称(){
            return 个户名称;
            }

        public void set个户名称(String 个户名称) {
            this.个户名称 = 个户名称;
            }

    public BigDecimal get工会筹备金(){
            return 工会筹备金;
            }

        public void set工会筹备金(BigDecimal 工会筹备金) {
            this.工会筹备金 = 工会筹备金;
            }

    public String get办件编号(){
            return 办件编号;
            }

        public void set办件编号(String 办件编号) {
            this.办件编号 = 办件编号;
            }
    
@Override
public String toString() {
        return "工资基本表{" +
                "编号=" + 编号 +
                ", 项目编号=" + 项目编号 +
                ", 年=" + 年 +
                ", 月=" + 月 +
                ", 总支出=" + 总支出 +
                ", 实发工资=" + 实发工资 +
                ", 五险=" + 五险 +
                ", 公积金=" + 公积金 +
                ", 时间=" + 时间 +
                ", 创建人工号=" + 创建人工号 +
                ", 公户支出=" + 公户支出 +
                ", 个户支出=" + 个户支出 +
                ", 状态=" + 状态 +
                ", 公户编号=" + 公户编号 +
                ", 公户名称=" + 公户名称 +
                ", 个户编号=" + 个户编号 +
                ", 个户名称=" + 个户名称 +
                ", 工会筹备金=" + 工会筹备金 +
                ", 办件编号=" + 办件编号 +
        "}";
        }
        }

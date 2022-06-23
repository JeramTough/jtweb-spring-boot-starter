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
@ApiModel(value = "工资明细表对象", description = "")
public class 工资明细表 implements Serializable{

private static final long serialVersionUID=1L;

                        private String 编号;

    @TableField("工资表编号")
        private String 工资表编号;

    @TableField("序号")
        private BigDecimal 序号;

    @TableField("部门")
        private String 部门;

    @TableField("姓名")
        private String 姓名;

    @TableField("身份证号")
        private String 身份证号;

    @TableField("银行账号")
        private String 银行账号;

    @TableField("开户行")
        private String 开户行;

    @TableField("基本工资")
        private BigDecimal 基本工资;

    @TableField("考核天数")
        private BigDecimal 考核天数;

    @TableField("病事假天数")
        private BigDecimal 病事假天数;

    @TableField("缺勤天数")
        private BigDecimal 缺勤天数;

    @TableField("婚丧天数")
        private BigDecimal 婚丧天数;

    @TableField("出勤天数")
        private BigDecimal 出勤天数;

    @TableField("应发工资")
        private BigDecimal 应发工资;

    @TableField("应扣天数")
        private BigDecimal 应扣天数;

    @TableField("应扣金额")
        private BigDecimal 应扣金额;

    @TableField("代扣五险")
        private BigDecimal 代扣五险;

    @TableField("代扣公积金")
        private BigDecimal 代扣公积金;

    @TableField("代扣个税")
        private BigDecimal 代扣个税;

    @TableField("实发工资")
        private BigDecimal 实发工资;

    @TableField("公司付五险")
        private BigDecimal 公司付五险;

    @TableField("公司付公积金")
        private BigDecimal 公司付公积金;

    @TableField("总支出")
        private BigDecimal 总支出;

    @TableField("社保缴纳地点")
        private String 社保缴纳地点;

    @TableField("备注")
        private String 备注;

    @TableField("公户付金额")
        private BigDecimal 公户付金额;

    @TableField("个户付金额")
        private BigDecimal 个户付金额;

    @TableField("工会筹备金")
        private BigDecimal 工会筹备金;

    @TableField("其它")
        private BigDecimal 其它;

    @TableField("用户编号")
        private String 用户编号;


    public String get编号(){
            return 编号;
            }

        public void set编号(String 编号) {
            this.编号 = 编号;
            }

    public String get工资表编号(){
            return 工资表编号;
            }

        public void set工资表编号(String 工资表编号) {
            this.工资表编号 = 工资表编号;
            }

    public BigDecimal get序号(){
            return 序号;
            }

        public void set序号(BigDecimal 序号) {
            this.序号 = 序号;
            }

    public String get部门(){
            return 部门;
            }

        public void set部门(String 部门) {
            this.部门 = 部门;
            }

    public String get姓名(){
            return 姓名;
            }

        public void set姓名(String 姓名) {
            this.姓名 = 姓名;
            }

    public String get身份证号(){
            return 身份证号;
            }

        public void set身份证号(String 身份证号) {
            this.身份证号 = 身份证号;
            }

    public String get银行账号(){
            return 银行账号;
            }

        public void set银行账号(String 银行账号) {
            this.银行账号 = 银行账号;
            }

    public String get开户行(){
            return 开户行;
            }

        public void set开户行(String 开户行) {
            this.开户行 = 开户行;
            }

    public BigDecimal get基本工资(){
            return 基本工资;
            }

        public void set基本工资(BigDecimal 基本工资) {
            this.基本工资 = 基本工资;
            }

    public BigDecimal get考核天数(){
            return 考核天数;
            }

        public void set考核天数(BigDecimal 考核天数) {
            this.考核天数 = 考核天数;
            }

    public BigDecimal get病事假天数(){
            return 病事假天数;
            }

        public void set病事假天数(BigDecimal 病事假天数) {
            this.病事假天数 = 病事假天数;
            }

    public BigDecimal get缺勤天数(){
            return 缺勤天数;
            }

        public void set缺勤天数(BigDecimal 缺勤天数) {
            this.缺勤天数 = 缺勤天数;
            }

    public BigDecimal get婚丧天数(){
            return 婚丧天数;
            }

        public void set婚丧天数(BigDecimal 婚丧天数) {
            this.婚丧天数 = 婚丧天数;
            }

    public BigDecimal get出勤天数(){
            return 出勤天数;
            }

        public void set出勤天数(BigDecimal 出勤天数) {
            this.出勤天数 = 出勤天数;
            }

    public BigDecimal get应发工资(){
            return 应发工资;
            }

        public void set应发工资(BigDecimal 应发工资) {
            this.应发工资 = 应发工资;
            }

    public BigDecimal get应扣天数(){
            return 应扣天数;
            }

        public void set应扣天数(BigDecimal 应扣天数) {
            this.应扣天数 = 应扣天数;
            }

    public BigDecimal get应扣金额(){
            return 应扣金额;
            }

        public void set应扣金额(BigDecimal 应扣金额) {
            this.应扣金额 = 应扣金额;
            }

    public BigDecimal get代扣五险(){
            return 代扣五险;
            }

        public void set代扣五险(BigDecimal 代扣五险) {
            this.代扣五险 = 代扣五险;
            }

    public BigDecimal get代扣公积金(){
            return 代扣公积金;
            }

        public void set代扣公积金(BigDecimal 代扣公积金) {
            this.代扣公积金 = 代扣公积金;
            }

    public BigDecimal get代扣个税(){
            return 代扣个税;
            }

        public void set代扣个税(BigDecimal 代扣个税) {
            this.代扣个税 = 代扣个税;
            }

    public BigDecimal get实发工资(){
            return 实发工资;
            }

        public void set实发工资(BigDecimal 实发工资) {
            this.实发工资 = 实发工资;
            }

    public BigDecimal get公司付五险(){
            return 公司付五险;
            }

        public void set公司付五险(BigDecimal 公司付五险) {
            this.公司付五险 = 公司付五险;
            }

    public BigDecimal get公司付公积金(){
            return 公司付公积金;
            }

        public void set公司付公积金(BigDecimal 公司付公积金) {
            this.公司付公积金 = 公司付公积金;
            }

    public BigDecimal get总支出(){
            return 总支出;
            }

        public void set总支出(BigDecimal 总支出) {
            this.总支出 = 总支出;
            }

    public String get社保缴纳地点(){
            return 社保缴纳地点;
            }

        public void set社保缴纳地点(String 社保缴纳地点) {
            this.社保缴纳地点 = 社保缴纳地点;
            }

    public String get备注(){
            return 备注;
            }

        public void set备注(String 备注) {
            this.备注 = 备注;
            }

    public BigDecimal get公户付金额(){
            return 公户付金额;
            }

        public void set公户付金额(BigDecimal 公户付金额) {
            this.公户付金额 = 公户付金额;
            }

    public BigDecimal get个户付金额(){
            return 个户付金额;
            }

        public void set个户付金额(BigDecimal 个户付金额) {
            this.个户付金额 = 个户付金额;
            }

    public BigDecimal get工会筹备金(){
            return 工会筹备金;
            }

        public void set工会筹备金(BigDecimal 工会筹备金) {
            this.工会筹备金 = 工会筹备金;
            }

    public BigDecimal get其它(){
            return 其它;
            }

        public void set其它(BigDecimal 其它) {
            this.其它 = 其它;
            }

    public String get用户编号(){
            return 用户编号;
            }

        public void set用户编号(String 用户编号) {
            this.用户编号 = 用户编号;
            }
    
@Override
public String toString() {
        return "工资明细表{" +
                "编号=" + 编号 +
                ", 工资表编号=" + 工资表编号 +
                ", 序号=" + 序号 +
                ", 部门=" + 部门 +
                ", 姓名=" + 姓名 +
                ", 身份证号=" + 身份证号 +
                ", 银行账号=" + 银行账号 +
                ", 开户行=" + 开户行 +
                ", 基本工资=" + 基本工资 +
                ", 考核天数=" + 考核天数 +
                ", 病事假天数=" + 病事假天数 +
                ", 缺勤天数=" + 缺勤天数 +
                ", 婚丧天数=" + 婚丧天数 +
                ", 出勤天数=" + 出勤天数 +
                ", 应发工资=" + 应发工资 +
                ", 应扣天数=" + 应扣天数 +
                ", 应扣金额=" + 应扣金额 +
                ", 代扣五险=" + 代扣五险 +
                ", 代扣公积金=" + 代扣公积金 +
                ", 代扣个税=" + 代扣个税 +
                ", 实发工资=" + 实发工资 +
                ", 公司付五险=" + 公司付五险 +
                ", 公司付公积金=" + 公司付公积金 +
                ", 总支出=" + 总支出 +
                ", 社保缴纳地点=" + 社保缴纳地点 +
                ", 备注=" + 备注 +
                ", 公户付金额=" + 公户付金额 +
                ", 个户付金额=" + 个户付金额 +
                ", 工会筹备金=" + 工会筹备金 +
                ", 其它=" + 其它 +
                ", 用户编号=" + 用户编号 +
        "}";
        }
        }

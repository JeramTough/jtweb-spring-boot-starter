package com.icloudmap.newerp.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
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
@TableName("YW_审批意见")
@ApiModel(value = "Yw审批意见对象", description = "")
public class Yw审批意见 implements Serializable{

private static final long serialVersionUID=1L;

                        private String 编号;

    @TableField("项目编号")
        private String 项目编号;

    @TableField("部门编号")
        private String 部门编号;

    @TableField("部门名称")
        private String 部门名称;

    @TableField("员工编号")
        private String 员工编号;

    @TableField("员工名称")
        private String 员工名称;

    @TableField("栏目类型")
        private String 栏目类型;

    @TableField("栏目名称")
        private String 栏目名称;

    @TableField("时间")
        private String 时间;

    @TableField("意见内容")
        private String 意见内容;

    @TableField("加密内容")
        private String 加密内容;

    @TableField("签名")
        private String 签名;

    @TableField("创建时间")
        private LocalDateTime 创建时间;


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

    public String get部门编号(){
            return 部门编号;
            }

        public void set部门编号(String 部门编号) {
            this.部门编号 = 部门编号;
            }

    public String get部门名称(){
            return 部门名称;
            }

        public void set部门名称(String 部门名称) {
            this.部门名称 = 部门名称;
            }

    public String get员工编号(){
            return 员工编号;
            }

        public void set员工编号(String 员工编号) {
            this.员工编号 = 员工编号;
            }

    public String get员工名称(){
            return 员工名称;
            }

        public void set员工名称(String 员工名称) {
            this.员工名称 = 员工名称;
            }

    public String get栏目类型(){
            return 栏目类型;
            }

        public void set栏目类型(String 栏目类型) {
            this.栏目类型 = 栏目类型;
            }

    public String get栏目名称(){
            return 栏目名称;
            }

        public void set栏目名称(String 栏目名称) {
            this.栏目名称 = 栏目名称;
            }

    public String get时间(){
            return 时间;
            }

        public void set时间(String 时间) {
            this.时间 = 时间;
            }

    public String get意见内容(){
            return 意见内容;
            }

        public void set意见内容(String 意见内容) {
            this.意见内容 = 意见内容;
            }

    public String get加密内容(){
            return 加密内容;
            }

        public void set加密内容(String 加密内容) {
            this.加密内容 = 加密内容;
            }

    public String get签名(){
            return 签名;
            }

        public void set签名(String 签名) {
            this.签名 = 签名;
            }

    public LocalDateTime get创建时间(){
            return 创建时间;
            }

        public void set创建时间(LocalDateTime 创建时间) {
            this.创建时间 = 创建时间;
            }
    
@Override
public String toString() {
        return "Yw审批意见{" +
                "编号=" + 编号 +
                ", 项目编号=" + 项目编号 +
                ", 部门编号=" + 部门编号 +
                ", 部门名称=" + 部门名称 +
                ", 员工编号=" + 员工编号 +
                ", 员工名称=" + 员工名称 +
                ", 栏目类型=" + 栏目类型 +
                ", 栏目名称=" + 栏目名称 +
                ", 时间=" + 时间 +
                ", 意见内容=" + 意见内容 +
                ", 加密内容=" + 加密内容 +
                ", 签名=" + 签名 +
                ", 创建时间=" + 创建时间 +
        "}";
        }
        }

package com.icloudmap.newerp.model.entity;

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
@ApiModel(value = "意见表对象", description = "")
public class 意见表 implements Serializable{

private static final long serialVersionUID=1L;

                        private String 意见编号;

    @TableField("任务编号")
        private String 任务编号;

    @TableField("任务类型")
        private String 任务类型;

    @TableField("创建人")
        private String 创建人;

    @TableField("创建时间")
        private String 创建时间;

    @TableField("修改时间")
        private String 修改时间;

    @TableField("意见内容")
        private String 意见内容;

    @TableField("创建人编号")
        private String 创建人编号;

    @TableField("创建人部门")
        private String 创建人部门;

    @TableField("创建人部门编号")
        private String 创建人部门编号;


    public String get意见编号(){
            return 意见编号;
            }

        public void set意见编号(String 意见编号) {
            this.意见编号 = 意见编号;
            }

    public String get任务编号(){
            return 任务编号;
            }

        public void set任务编号(String 任务编号) {
            this.任务编号 = 任务编号;
            }

    public String get任务类型(){
            return 任务类型;
            }

        public void set任务类型(String 任务类型) {
            this.任务类型 = 任务类型;
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

    public String get修改时间(){
            return 修改时间;
            }

        public void set修改时间(String 修改时间) {
            this.修改时间 = 修改时间;
            }

    public String get意见内容(){
            return 意见内容;
            }

        public void set意见内容(String 意见内容) {
            this.意见内容 = 意见内容;
            }

    public String get创建人编号(){
            return 创建人编号;
            }

        public void set创建人编号(String 创建人编号) {
            this.创建人编号 = 创建人编号;
            }

    public String get创建人部门(){
            return 创建人部门;
            }

        public void set创建人部门(String 创建人部门) {
            this.创建人部门 = 创建人部门;
            }

    public String get创建人部门编号(){
            return 创建人部门编号;
            }

        public void set创建人部门编号(String 创建人部门编号) {
            this.创建人部门编号 = 创建人部门编号;
            }
    
@Override
public String toString() {
        return "意见表{" +
                "意见编号=" + 意见编号 +
                ", 任务编号=" + 任务编号 +
                ", 任务类型=" + 任务类型 +
                ", 创建人=" + 创建人 +
                ", 创建时间=" + 创建时间 +
                ", 修改时间=" + 修改时间 +
                ", 意见内容=" + 意见内容 +
                ", 创建人编号=" + 创建人编号 +
                ", 创建人部门=" + 创建人部门 +
                ", 创建人部门编号=" + 创建人部门编号 +
        "}";
        }
        }

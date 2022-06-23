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
@TableName("BS_V_报销科目")
@ApiModel(value="BsV报销科目对象", description="")
public class BsV报销科目Dto implements Serializable{

    private static final long serialVersionUID=1L;

    private String 科目编号;

    private String 科目名称;

    private Long 科目级别;

    private String 上级科目;

    private Long 科目序号;

    private String 备注;

    @TableField("AREACODE")
    private String aREACODE;

    private String 上级科目名称;


    public String get科目编号() {
        return 科目编号;
    }

    public void set科目编号(String 科目编号) {
        this.科目编号 = 科目编号;
    }

    public String get科目名称() {
        return 科目名称;
    }

    public void set科目名称(String 科目名称) {
        this.科目名称 = 科目名称;
    }

    public Long get科目级别() {
        return 科目级别;
    }

    public void set科目级别(Long 科目级别) {
        this.科目级别 = 科目级别;
    }

    public String get上级科目() {
        return 上级科目;
    }

    public void set上级科目(String 上级科目) {
        this.上级科目 = 上级科目;
    }

    public Long get科目序号() {
        return 科目序号;
    }

    public void set科目序号(Long 科目序号) {
        this.科目序号 = 科目序号;
    }

    public String get备注() {
        return 备注;
    }

    public void set备注(String 备注) {
        this.备注 = 备注;
    }

    public String getaREACODE() {
        return aREACODE;
    }

    public void setaREACODE(String aREACODE) {
        this.aREACODE = aREACODE;
    }

    public String get上级科目名称() {
        return 上级科目名称;
    }

    public void set上级科目名称(String 上级科目名称) {
        this.上级科目名称 = 上级科目名称;
    }

    @Override
    public String toString() {
        return "BsV报销科目{" +
        "科目编号=" + 科目编号 +
        ", 科目名称=" + 科目名称 +
        ", 科目级别=" + 科目级别 +
        ", 上级科目=" + 上级科目 +
        ", 科目序号=" + 科目序号 +
        ", 备注=" + 备注 +
        ", aREACODE=" + aREACODE +
        ", 上级科目名称=" + 上级科目名称 +
        "}";
    }
}

package com.icloudmap.newerp.model.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("BS_账户信息")
@ApiModel(value="Bs账户信息对象", description="")
public class Bs账户信息Dto implements Serializable{

    private static final long serialVersionUID=1L;

    private String 账户编号;

    private String 账户名称;

    private String 账号;

    private String 开户行;

    private String 备注;

    private String 创建人;

    private String 创建时间;

    private String 创建人编号;

    private String 修改人;

    private String 修改时间;

    private String 修改人编号;

    private Integer 启用状态;

    private String 账户类型;

    private String 账户类型代码;

    private BigDecimal 统计类型;


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

    public String get账号() {
        return 账号;
    }

    public void set账号(String 账号) {
        this.账号 = 账号;
    }

    public String get开户行() {
        return 开户行;
    }

    public void set开户行(String 开户行) {
        this.开户行 = 开户行;
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

    public String get创建人编号() {
        return 创建人编号;
    }

    public void set创建人编号(String 创建人编号) {
        this.创建人编号 = 创建人编号;
    }

    public String get修改人() {
        return 修改人;
    }

    public void set修改人(String 修改人) {
        this.修改人 = 修改人;
    }

    public String get修改时间() {
        return 修改时间;
    }

    public void set修改时间(String 修改时间) {
        this.修改时间 = 修改时间;
    }

    public String get修改人编号() {
        return 修改人编号;
    }

    public void set修改人编号(String 修改人编号) {
        this.修改人编号 = 修改人编号;
    }

    public Integer get启用状态() {
        return 启用状态;
    }

    public void set启用状态(Integer 启用状态) {
        this.启用状态 = 启用状态;
    }

    public String get账户类型() {
        return 账户类型;
    }

    public void set账户类型(String 账户类型) {
        this.账户类型 = 账户类型;
    }

    public String get账户类型代码() {
        return 账户类型代码;
    }

    public void set账户类型代码(String 账户类型代码) {
        this.账户类型代码 = 账户类型代码;
    }

    public BigDecimal get统计类型() {
        return 统计类型;
    }

    public void set统计类型(BigDecimal 统计类型) {
        this.统计类型 = 统计类型;
    }

    @Override
    public String toString() {
        return "Bs账户信息{" +
        "账户编号=" + 账户编号 +
        ", 账户名称=" + 账户名称 +
        ", 账号=" + 账号 +
        ", 开户行=" + 开户行 +
        ", 备注=" + 备注 +
        ", 创建人=" + 创建人 +
        ", 创建时间=" + 创建时间 +
        ", 创建人编号=" + 创建人编号 +
        ", 修改人=" + 修改人 +
        ", 修改时间=" + 修改时间 +
        ", 修改人编号=" + 修改人编号 +
        ", 启用状态=" + 启用状态 +
        ", 账户类型=" + 账户类型 +
        ", 账户类型代码=" + 账户类型代码 +
        ", 统计类型=" + 统计类型 +
        "}";
    }
}

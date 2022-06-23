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
@TableName("BS_客户信息")
@ApiModel(value="Bs客户信息对象", description="")
public class Bs客户信息Dto implements Serializable{

    private static final long serialVersionUID=1L;

    private String 客户名称;

    @ApiModelProperty(value = "拼音码")
    @TableField("PYM")
    private String pYM;

    @ApiModelProperty(value = "五笔码")
    @TableField("WBM")
    private String wBM;

    private String 联系电话;

    private String 联系地址;

    private String 省份;

    private String 负责人;

    private String 负责人手机号码;

    private String 备注;

    private String 创建时间;

    private String 创建人;

    private String 创建人编号;

    private String 客户编号;

    private String 开户行;

    private String 账号;

    private String 社会统一信用代码;

    private String 办公电话;

    private String 邮政编码;

    private String 法人代表;


    public String get客户名称() {
        return 客户名称;
    }

    public void set客户名称(String 客户名称) {
        this.客户名称 = 客户名称;
    }

    public String getpYM() {
        return pYM;
    }

    public void setpYM(String pYM) {
        this.pYM = pYM;
    }

    public String getwBM() {
        return wBM;
    }

    public void setwBM(String wBM) {
        this.wBM = wBM;
    }

    public String get联系电话() {
        return 联系电话;
    }

    public void set联系电话(String 联系电话) {
        this.联系电话 = 联系电话;
    }

    public String get联系地址() {
        return 联系地址;
    }

    public void set联系地址(String 联系地址) {
        this.联系地址 = 联系地址;
    }

    public String get省份() {
        return 省份;
    }

    public void set省份(String 省份) {
        this.省份 = 省份;
    }

    public String get负责人() {
        return 负责人;
    }

    public void set负责人(String 负责人) {
        this.负责人 = 负责人;
    }

    public String get负责人手机号码() {
        return 负责人手机号码;
    }

    public void set负责人手机号码(String 负责人手机号码) {
        this.负责人手机号码 = 负责人手机号码;
    }

    public String get备注() {
        return 备注;
    }

    public void set备注(String 备注) {
        this.备注 = 备注;
    }

    public String get创建时间() {
        return 创建时间;
    }

    public void set创建时间(String 创建时间) {
        this.创建时间 = 创建时间;
    }

    public String get创建人() {
        return 创建人;
    }

    public void set创建人(String 创建人) {
        this.创建人 = 创建人;
    }

    public String get创建人编号() {
        return 创建人编号;
    }

    public void set创建人编号(String 创建人编号) {
        this.创建人编号 = 创建人编号;
    }

    public String get客户编号() {
        return 客户编号;
    }

    public void set客户编号(String 客户编号) {
        this.客户编号 = 客户编号;
    }

    public String get开户行() {
        return 开户行;
    }

    public void set开户行(String 开户行) {
        this.开户行 = 开户行;
    }

    public String get账号() {
        return 账号;
    }

    public void set账号(String 账号) {
        this.账号 = 账号;
    }

    public String get社会统一信用代码() {
        return 社会统一信用代码;
    }

    public void set社会统一信用代码(String 社会统一信用代码) {
        this.社会统一信用代码 = 社会统一信用代码;
    }

    public String get办公电话() {
        return 办公电话;
    }

    public void set办公电话(String 办公电话) {
        this.办公电话 = 办公电话;
    }

    public String get邮政编码() {
        return 邮政编码;
    }

    public void set邮政编码(String 邮政编码) {
        this.邮政编码 = 邮政编码;
    }

    public String get法人代表() {
        return 法人代表;
    }

    public void set法人代表(String 法人代表) {
        this.法人代表 = 法人代表;
    }

    @Override
    public String toString() {
        return "Bs客户信息{" +
        "客户名称=" + 客户名称 +
        ", pYM=" + pYM +
        ", wBM=" + wBM +
        ", 联系电话=" + 联系电话 +
        ", 联系地址=" + 联系地址 +
        ", 省份=" + 省份 +
        ", 负责人=" + 负责人 +
        ", 负责人手机号码=" + 负责人手机号码 +
        ", 备注=" + 备注 +
        ", 创建时间=" + 创建时间 +
        ", 创建人=" + 创建人 +
        ", 创建人编号=" + 创建人编号 +
        ", 客户编号=" + 客户编号 +
        ", 开户行=" + 开户行 +
        ", 账号=" + 账号 +
        ", 社会统一信用代码=" + 社会统一信用代码 +
        ", 办公电话=" + 办公电话 +
        ", 邮政编码=" + 邮政编码 +
        ", 法人代表=" + 法人代表 +
        "}";
    }
}

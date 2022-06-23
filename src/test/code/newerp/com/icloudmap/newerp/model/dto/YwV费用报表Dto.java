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
@TableName("YW_V_费用报表")
@ApiModel(value="YwV费用报表对象", description="")
public class YwV费用报表Dto implements Serializable{

    private static final long serialVersionUID=1L;

    private String 报销单号;

    private String 归属项目;

    private String 报销类型;

    private String 报销人;

    private String 报销时间;

    private String 区域;

    private String 费用类别;

    private String 费用明细;

    private BigDecimal 费用;

    private String 备注;


    public String get报销单号() {
        return 报销单号;
    }

    public void set报销单号(String 报销单号) {
        this.报销单号 = 报销单号;
    }

    public String get归属项目() {
        return 归属项目;
    }

    public void set归属项目(String 归属项目) {
        this.归属项目 = 归属项目;
    }

    public String get报销类型() {
        return 报销类型;
    }

    public void set报销类型(String 报销类型) {
        this.报销类型 = 报销类型;
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

    public String get区域() {
        return 区域;
    }

    public void set区域(String 区域) {
        this.区域 = 区域;
    }

    public String get费用类别() {
        return 费用类别;
    }

    public void set费用类别(String 费用类别) {
        this.费用类别 = 费用类别;
    }

    public String get费用明细() {
        return 费用明细;
    }

    public void set费用明细(String 费用明细) {
        this.费用明细 = 费用明细;
    }

    public BigDecimal get费用() {
        return 费用;
    }

    public void set费用(BigDecimal 费用) {
        this.费用 = 费用;
    }

    public String get备注() {
        return 备注;
    }

    public void set备注(String 备注) {
        this.备注 = 备注;
    }

    @Override
    public String toString() {
        return "YwV费用报表{" +
        "报销单号=" + 报销单号 +
        ", 归属项目=" + 归属项目 +
        ", 报销类型=" + 报销类型 +
        ", 报销人=" + 报销人 +
        ", 报销时间=" + 报销时间 +
        ", 区域=" + 区域 +
        ", 费用类别=" + 费用类别 +
        ", 费用明细=" + 费用明细 +
        ", 费用=" + 费用 +
        ", 备注=" + 备注 +
        "}";
    }
}

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
@TableName("YW_回款单")
@ApiModel(value="Yw回款单对象", description="")
public class Yw回款单Dto implements Serializable{

    private static final long serialVersionUID=1L;

    private String 回款编号;

    private String 回款类型;

    private String 回款类型编号;

    private String 项目编号;

    private String 回款单位;

    private String 回款单位编号;

    private BigDecimal 回款金额;

    private String 到款日期;

    private String 户名;

    private String 户名编号;

    private String 收款账号;

    private String 备注;

    private String 创建人;

    private String 创建人编号;

    private String 创建时间;


    public String get回款编号() {
        return 回款编号;
    }

    public void set回款编号(String 回款编号) {
        this.回款编号 = 回款编号;
    }

    public String get回款类型() {
        return 回款类型;
    }

    public void set回款类型(String 回款类型) {
        this.回款类型 = 回款类型;
    }

    public String get回款类型编号() {
        return 回款类型编号;
    }

    public void set回款类型编号(String 回款类型编号) {
        this.回款类型编号 = 回款类型编号;
    }

    public String get项目编号() {
        return 项目编号;
    }

    public void set项目编号(String 项目编号) {
        this.项目编号 = 项目编号;
    }

    public String get回款单位() {
        return 回款单位;
    }

    public void set回款单位(String 回款单位) {
        this.回款单位 = 回款单位;
    }

    public String get回款单位编号() {
        return 回款单位编号;
    }

    public void set回款单位编号(String 回款单位编号) {
        this.回款单位编号 = 回款单位编号;
    }

    public BigDecimal get回款金额() {
        return 回款金额;
    }

    public void set回款金额(BigDecimal 回款金额) {
        this.回款金额 = 回款金额;
    }

    public String get到款日期() {
        return 到款日期;
    }

    public void set到款日期(String 到款日期) {
        this.到款日期 = 到款日期;
    }

    public String get户名() {
        return 户名;
    }

    public void set户名(String 户名) {
        this.户名 = 户名;
    }

    public String get户名编号() {
        return 户名编号;
    }

    public void set户名编号(String 户名编号) {
        this.户名编号 = 户名编号;
    }

    public String get收款账号() {
        return 收款账号;
    }

    public void set收款账号(String 收款账号) {
        this.收款账号 = 收款账号;
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

    public String get创建人编号() {
        return 创建人编号;
    }

    public void set创建人编号(String 创建人编号) {
        this.创建人编号 = 创建人编号;
    }

    public String get创建时间() {
        return 创建时间;
    }

    public void set创建时间(String 创建时间) {
        this.创建时间 = 创建时间;
    }

    @Override
    public String toString() {
        return "Yw回款单{" +
        "回款编号=" + 回款编号 +
        ", 回款类型=" + 回款类型 +
        ", 回款类型编号=" + 回款类型编号 +
        ", 项目编号=" + 项目编号 +
        ", 回款单位=" + 回款单位 +
        ", 回款单位编号=" + 回款单位编号 +
        ", 回款金额=" + 回款金额 +
        ", 到款日期=" + 到款日期 +
        ", 户名=" + 户名 +
        ", 户名编号=" + 户名编号 +
        ", 收款账号=" + 收款账号 +
        ", 备注=" + 备注 +
        ", 创建人=" + 创建人 +
        ", 创建人编号=" + 创建人编号 +
        ", 创建时间=" + 创建时间 +
        "}";
    }
}

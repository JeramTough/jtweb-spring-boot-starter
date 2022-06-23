package com.icloudmap.newerp.model.entity;

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
@TableName("YW_合同信息")
@ApiModel(value="Yw合同信息对象", description="")
public class Yw合同信息Dto implements Serializable{

    private static final long serialVersionUID=1L;

    private String 编号;

    private String 签订日期;

    private String 合同类型;

    private String 合同类型编号;

    private String 备注;

    private String 创建人;

    private String 创建人编号;

    private String 创建时间;

    private String 项目编号;

    private String 合同名称;

    private String 办件编号;

    @ApiModelProperty(value = "系统公司类型账户编号")
    private String 签约乙方编号;

    private String 签约乙方名称;

    private String 合同编号;

    private String 修改人;

    private String 修改时间;

    private String 修改人编号;


    public String get编号() {
        return 编号;
    }

    public void set编号(String 编号) {
        this.编号 = 编号;
    }

    public String get签订日期() {
        return 签订日期;
    }

    public void set签订日期(String 签订日期) {
        this.签订日期 = 签订日期;
    }

    public String get合同类型() {
        return 合同类型;
    }

    public void set合同类型(String 合同类型) {
        this.合同类型 = 合同类型;
    }

    public String get合同类型编号() {
        return 合同类型编号;
    }

    public void set合同类型编号(String 合同类型编号) {
        this.合同类型编号 = 合同类型编号;
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

    public String get项目编号() {
        return 项目编号;
    }

    public void set项目编号(String 项目编号) {
        this.项目编号 = 项目编号;
    }

    public String get合同名称() {
        return 合同名称;
    }

    public void set合同名称(String 合同名称) {
        this.合同名称 = 合同名称;
    }

    public String get办件编号() {
        return 办件编号;
    }

    public void set办件编号(String 办件编号) {
        this.办件编号 = 办件编号;
    }

    public String get签约乙方编号() {
        return 签约乙方编号;
    }

    public void set签约乙方编号(String 签约乙方编号) {
        this.签约乙方编号 = 签约乙方编号;
    }

    public String get签约乙方名称() {
        return 签约乙方名称;
    }

    public void set签约乙方名称(String 签约乙方名称) {
        this.签约乙方名称 = 签约乙方名称;
    }

    public String get合同编号() {
        return 合同编号;
    }

    public void set合同编号(String 合同编号) {
        this.合同编号 = 合同编号;
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

    @Override
    public String toString() {
        return "Yw合同信息{" +
        "编号=" + 编号 +
        ", 签订日期=" + 签订日期 +
        ", 合同类型=" + 合同类型 +
        ", 合同类型编号=" + 合同类型编号 +
        ", 备注=" + 备注 +
        ", 创建人=" + 创建人 +
        ", 创建人编号=" + 创建人编号 +
        ", 创建时间=" + 创建时间 +
        ", 项目编号=" + 项目编号 +
        ", 合同名称=" + 合同名称 +
        ", 办件编号=" + 办件编号 +
        ", 签约乙方编号=" + 签约乙方编号 +
        ", 签约乙方名称=" + 签约乙方名称 +
        ", 合同编号=" + 合同编号 +
        ", 修改人=" + 修改人 +
        ", 修改时间=" + 修改时间 +
        ", 修改人编号=" + 修改人编号 +
        "}";
    }
}

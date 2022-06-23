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
@ApiModel(value="商务费用表对象", description="")
public class 商务费用表Dto implements Serializable{

    private static final long serialVersionUID=1L;

    private String 商务编号;

    private String 项目编号;

    private String 项目名称;

    private String 是否已付;

    private String 创建时间;

    private String 修改时间;

    private String 创建人;

    private String 创建人编号;

    private String 修改人;

    private String 修改人编号;

    private String 预计时间;


    public String get商务编号() {
        return 商务编号;
    }

    public void set商务编号(String 商务编号) {
        this.商务编号 = 商务编号;
    }

    public String get项目编号() {
        return 项目编号;
    }

    public void set项目编号(String 项目编号) {
        this.项目编号 = 项目编号;
    }

    public String get项目名称() {
        return 项目名称;
    }

    public void set项目名称(String 项目名称) {
        this.项目名称 = 项目名称;
    }

    public String get是否已付() {
        return 是否已付;
    }

    public void set是否已付(String 是否已付) {
        this.是否已付 = 是否已付;
    }

    public String get创建时间() {
        return 创建时间;
    }

    public void set创建时间(String 创建时间) {
        this.创建时间 = 创建时间;
    }

    public String get修改时间() {
        return 修改时间;
    }

    public void set修改时间(String 修改时间) {
        this.修改时间 = 修改时间;
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

    public String get修改人() {
        return 修改人;
    }

    public void set修改人(String 修改人) {
        this.修改人 = 修改人;
    }

    public String get修改人编号() {
        return 修改人编号;
    }

    public void set修改人编号(String 修改人编号) {
        this.修改人编号 = 修改人编号;
    }

    public String get预计时间() {
        return 预计时间;
    }

    public void set预计时间(String 预计时间) {
        this.预计时间 = 预计时间;
    }

    @Override
    public String toString() {
        return "商务费用表{" +
        "商务编号=" + 商务编号 +
        ", 项目编号=" + 项目编号 +
        ", 项目名称=" + 项目名称 +
        ", 是否已付=" + 是否已付 +
        ", 创建时间=" + 创建时间 +
        ", 修改时间=" + 修改时间 +
        ", 创建人=" + 创建人 +
        ", 创建人编号=" + 创建人编号 +
        ", 修改人=" + 修改人 +
        ", 修改人编号=" + 修改人编号 +
        ", 预计时间=" + 预计时间 +
        "}";
    }
}

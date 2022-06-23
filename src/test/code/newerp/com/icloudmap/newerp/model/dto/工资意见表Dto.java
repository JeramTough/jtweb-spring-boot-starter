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
@ApiModel(value="工资意见表对象", description="")
public class 工资意见表Dto implements Serializable{

    private static final long serialVersionUID=1L;

    private String 编号;

    private String 工资表编号;

    private String 时间;

    private String 员工代码;

    private String 员工名称;

    private String 意见;


    public String get编号() {
        return 编号;
    }

    public void set编号(String 编号) {
        this.编号 = 编号;
    }

    public String get工资表编号() {
        return 工资表编号;
    }

    public void set工资表编号(String 工资表编号) {
        this.工资表编号 = 工资表编号;
    }

    public String get时间() {
        return 时间;
    }

    public void set时间(String 时间) {
        this.时间 = 时间;
    }

    public String get员工代码() {
        return 员工代码;
    }

    public void set员工代码(String 员工代码) {
        this.员工代码 = 员工代码;
    }

    public String get员工名称() {
        return 员工名称;
    }

    public void set员工名称(String 员工名称) {
        this.员工名称 = 员工名称;
    }

    public String get意见() {
        return 意见;
    }

    public void set意见(String 意见) {
        this.意见 = 意见;
    }

    @Override
    public String toString() {
        return "工资意见表{" +
        "编号=" + 编号 +
        ", 工资表编号=" + 工资表编号 +
        ", 时间=" + 时间 +
        ", 员工代码=" + 员工代码 +
        ", 员工名称=" + 员工名称 +
        ", 意见=" + 意见 +
        "}";
    }
}

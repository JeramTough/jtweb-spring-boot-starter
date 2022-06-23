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
@TableName("YW_报销单意见")
@ApiModel(value="Yw报销单意见对象", description="")
public class Yw报销单意见Dto implements Serializable{

    private static final long serialVersionUID=1L;

    private String 意见编号;

    private String 报销单号;

    private String 意见内容;

    private String 创建人;

    private String 创建时间;

    private String 创建人编号;

    private String 创建人部门;


    public String get意见编号() {
        return 意见编号;
    }

    public void set意见编号(String 意见编号) {
        this.意见编号 = 意见编号;
    }

    public String get报销单号() {
        return 报销单号;
    }

    public void set报销单号(String 报销单号) {
        this.报销单号 = 报销单号;
    }

    public String get意见内容() {
        return 意见内容;
    }

    public void set意见内容(String 意见内容) {
        this.意见内容 = 意见内容;
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

    public String get创建人部门() {
        return 创建人部门;
    }

    public void set创建人部门(String 创建人部门) {
        this.创建人部门 = 创建人部门;
    }

    @Override
    public String toString() {
        return "Yw报销单意见{" +
        "意见编号=" + 意见编号 +
        ", 报销单号=" + 报销单号 +
        ", 意见内容=" + 意见内容 +
        ", 创建人=" + 创建人 +
        ", 创建时间=" + 创建时间 +
        ", 创建人编号=" + 创建人编号 +
        ", 创建人部门=" + 创建人部门 +
        "}";
    }
}

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
@TableName("YW_附件信息")
@ApiModel(value="Yw附件信息对象", description="")
public class Yw附件信息Dto implements Serializable{

    private static final long serialVersionUID=1L;

    private String 附件编号;

    private String 文件名;

    private String 文件类型;

    private String 上传人;

    private String 上传人编号;

    private String 上传时间;

    private String 项目编号;

    private String 表名;

    private String 表主键;

    @ApiModelProperty(value = "预留")
    private String 文件路径;

    private String 文件类别;

    @ApiModelProperty(value = "行政区")
    @TableField("AREACODE")
    private String aREACODE;

    private String 文件大小;


    public String get附件编号() {
        return 附件编号;
    }

    public void set附件编号(String 附件编号) {
        this.附件编号 = 附件编号;
    }

    public String get文件名() {
        return 文件名;
    }

    public void set文件名(String 文件名) {
        this.文件名 = 文件名;
    }

    public String get文件类型() {
        return 文件类型;
    }

    public void set文件类型(String 文件类型) {
        this.文件类型 = 文件类型;
    }

    public String get上传人() {
        return 上传人;
    }

    public void set上传人(String 上传人) {
        this.上传人 = 上传人;
    }

    public String get上传人编号() {
        return 上传人编号;
    }

    public void set上传人编号(String 上传人编号) {
        this.上传人编号 = 上传人编号;
    }

    public String get上传时间() {
        return 上传时间;
    }

    public void set上传时间(String 上传时间) {
        this.上传时间 = 上传时间;
    }

    public String get项目编号() {
        return 项目编号;
    }

    public void set项目编号(String 项目编号) {
        this.项目编号 = 项目编号;
    }

    public String get表名() {
        return 表名;
    }

    public void set表名(String 表名) {
        this.表名 = 表名;
    }

    public String get表主键() {
        return 表主键;
    }

    public void set表主键(String 表主键) {
        this.表主键 = 表主键;
    }

    public String get文件路径() {
        return 文件路径;
    }

    public void set文件路径(String 文件路径) {
        this.文件路径 = 文件路径;
    }

    public String get文件类别() {
        return 文件类别;
    }

    public void set文件类别(String 文件类别) {
        this.文件类别 = 文件类别;
    }

    public String getaREACODE() {
        return aREACODE;
    }

    public void setaREACODE(String aREACODE) {
        this.aREACODE = aREACODE;
    }

    public String get文件大小() {
        return 文件大小;
    }

    public void set文件大小(String 文件大小) {
        this.文件大小 = 文件大小;
    }

    @Override
    public String toString() {
        return "Yw附件信息{" +
        "附件编号=" + 附件编号 +
        ", 文件名=" + 文件名 +
        ", 文件类型=" + 文件类型 +
        ", 上传人=" + 上传人 +
        ", 上传人编号=" + 上传人编号 +
        ", 上传时间=" + 上传时间 +
        ", 项目编号=" + 项目编号 +
        ", 表名=" + 表名 +
        ", 表主键=" + 表主键 +
        ", 文件路径=" + 文件路径 +
        ", 文件类别=" + 文件类别 +
        ", aREACODE=" + aREACODE +
        ", 文件大小=" + 文件大小 +
        "}";
    }
}

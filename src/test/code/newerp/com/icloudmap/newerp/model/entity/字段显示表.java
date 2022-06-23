package com.icloudmap.newerp.model.entity;

import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value = "字段显示表对象", description = "")
public class 字段显示表 implements Serializable{

private static final long serialVersionUID=1L;

        @ApiModelProperty(value = "主键")
                @TableId("ID")
                private Long iD;

        @ApiModelProperty(value = "字段所属表名")
    @TableField("TABLE_NAME")
        private String tableName;

        @ApiModelProperty(value = "字段")
    @TableField("FIELD")
        private String fIELD;

        @ApiModelProperty(value = "字段名称")
    @TableField("FIELD_NAME")
        private String fieldName;

        @ApiModelProperty(value = "是否显示，1显示")
    @TableField("VALID")
        private Integer vALID;

        @ApiModelProperty(value = "备注")
    @TableField("REMARK")
        private String rEMARK;

        @ApiModelProperty(value = "排序序号")
    @TableField("ORDERNO")
        private Integer oRDERNO;


    public Long getiD(){
            return iD;
            }

        public void setiD(Long iD) {
            this.iD = iD;
            }

    public String getTableName(){
            return tableName;
            }

        public void setTableName(String tableName) {
            this.tableName = tableName;
            }

    public String getfIELD(){
            return fIELD;
            }

        public void setfIELD(String fIELD) {
            this.fIELD = fIELD;
            }

    public String getFieldName(){
            return fieldName;
            }

        public void setFieldName(String fieldName) {
            this.fieldName = fieldName;
            }

    public Integer getvALID(){
            return vALID;
            }

        public void setvALID(Integer vALID) {
            this.vALID = vALID;
            }

    public String getrEMARK(){
            return rEMARK;
            }

        public void setrEMARK(String rEMARK) {
            this.rEMARK = rEMARK;
            }

    public Integer getoRDERNO(){
            return oRDERNO;
            }

        public void setoRDERNO(Integer oRDERNO) {
            this.oRDERNO = oRDERNO;
            }
    
@Override
public String toString() {
        return "字段显示表{" +
                "iD=" + iD +
                ", tableName=" + tableName +
                ", fIELD=" + fIELD +
                ", fieldName=" + fieldName +
                ", vALID=" + vALID +
                ", rEMARK=" + rEMARK +
                ", oRDERNO=" + oRDERNO +
        "}";
        }
        }

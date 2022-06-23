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
@TableName("YW_附件内容")
@ApiModel(value = "Yw附件内容对象", description = "")
public class Yw附件内容 implements Serializable{

private static final long serialVersionUID=1L;

                        private String 附件编号;

    @TableField("文件内容")
        private String 文件内容;


    public String get附件编号(){
            return 附件编号;
            }

        public void set附件编号(String 附件编号) {
            this.附件编号 = 附件编号;
            }

    public String get文件内容(){
            return 文件内容;
            }

        public void set文件内容(String 文件内容) {
            this.文件内容 = 文件内容;
            }
    
@Override
public String toString() {
        return "Yw附件内容{" +
                "附件编号=" + 附件编号 +
                ", 文件内容=" + 文件内容 +
        "}";
        }
        }

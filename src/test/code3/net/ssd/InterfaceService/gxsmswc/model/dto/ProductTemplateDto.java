package net.ssd.InterfaceService.gxsmswc.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author JeramTough
 * @since 2020-09-16
 */
@ApiModel(value="ProductTemplate对象", description="")
public class ProductTemplateDto implements Serializable{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "模板名称")
    private String temName;

    @ApiModelProperty(value = "模板文档名")
    private String temFileName;

    @ApiModelProperty(value = "模板路径")
    private String temPath;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime temCreatetime;

    @ApiModelProperty(value = "产品菜单ID（product_type）")
    private String tyId;

    @ApiModelProperty(value = "模板编号ID")
    private String temId;

    @ApiModelProperty(value = "模板后缀名：docx，txt 目前只有这两种")
    private String temSuffix;

    @ApiModelProperty(value = "-1删除；0不删除")
    private Integer temDel;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    public String getTemName() {
        return temName;
    }

    public void setTemName(String temName) {
        this.temName = temName;
    }

    public String getTemFileName() {
        return temFileName;
    }

    public void setTemFileName(String temFileName) {
        this.temFileName = temFileName;
    }

    public String getTemPath() {
        return temPath;
    }

    public void setTemPath(String temPath) {
        this.temPath = temPath;
    }

    public LocalDateTime getTemCreatetime() {
        return temCreatetime;
    }

    public void setTemCreatetime(LocalDateTime temCreatetime) {
        this.temCreatetime = temCreatetime;
    }

    public String getTyId() {
        return tyId;
    }

    public void setTyId(String tyId) {
        this.tyId = tyId;
    }

    public String getTemId() {
        return temId;
    }

    public void setTemId(String temId) {
        this.temId = temId;
    }

    public String getTemSuffix() {
        return temSuffix;
    }

    public void setTemSuffix(String temSuffix) {
        this.temSuffix = temSuffix;
    }

    public Integer getTemDel() {
        return temDel;
    }

    public void setTemDel(Integer temDel) {
        this.temDel = temDel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ProductTemplate{" +
        "temName=" + temName +
        ", temFileName=" + temFileName +
        ", temPath=" + temPath +
        ", temCreatetime=" + temCreatetime +
        ", tyId=" + tyId +
        ", temId=" + temId +
        ", temSuffix=" + temSuffix +
        ", temDel=" + temDel +
        ", id=" + id +
        "}";
    }
}

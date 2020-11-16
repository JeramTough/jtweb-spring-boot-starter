package net.ssd.InterfaceService.gxsmswc.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
@ApiModel(value="ServiceOrg对象", description="")
public class ServiceOrgDto implements Serializable{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "服务用户的部门名称")
    private String orgName;

    @ApiModelProperty(value = "类型：1短信；2邮件。")
    private Integer orgType;

    private Integer orgNum;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public Integer getOrgType() {
        return orgType;
    }

    public void setOrgType(Integer orgType) {
        this.orgType = orgType;
    }

    public Integer getOrgNum() {
        return orgNum;
    }

    public void setOrgNum(Integer orgNum) {
        this.orgNum = orgNum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ServiceOrg{" +
        "orgName=" + orgName +
        ", orgType=" + orgType +
        ", orgNum=" + orgNum +
        ", id=" + id +
        "}";
    }
}

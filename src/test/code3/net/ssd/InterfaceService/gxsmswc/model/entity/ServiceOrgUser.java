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
@ApiModel(value="ServiceOrgUser对象", description="")
public class ServiceOrgUser implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "服务用户的部门ID（service_org）")
    private String orgId;

    @ApiModelProperty(value = "服务用户ID（service_user）")
    private String userId;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ServiceOrgUser{" +
        "orgId=" + orgId +
        ", userId=" + userId +
        ", id=" + id +
        "}";
    }
}

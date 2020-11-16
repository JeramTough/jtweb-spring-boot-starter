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
@ApiModel(value="ServiceUserCopy对象", description="")
public class ServiceUserCopyDto implements Serializable{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "服务用户名称")
    private String userName;

    @ApiModelProperty(value = "服务用户手机号")
    private String userTel;

    @ApiModelProperty(value = "服务用户邮件")
    private String userEmail;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ServiceUserCopy{" +
        "userName=" + userName +
        ", userTel=" + userTel +
        ", userEmail=" + userEmail +
        ", id=" + id +
        "}";
    }
}

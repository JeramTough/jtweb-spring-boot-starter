package net.ssd.zds.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author JeramTough
 * @since 2021-04-25
 */
@TableName("APP_user_20180504")
@ApiModel(value="AppUser20180504对象", description="")
public class AppUser20180504Dto implements Serializable{

    private static final long serialVersionUID=1L;

    private Integer id;

    private String danwei;

    private String username;

    private String phone;

    @ApiModelProperty(value = "状态：0正常，其他不正常")
    private Integer status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDanwei() {
        return danwei;
    }

    public void setDanwei(String danwei) {
        this.danwei = danwei;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AppUser20180504{" +
        "id=" + id +
        ", danwei=" + danwei +
        ", username=" + username +
        ", phone=" + phone +
        ", status=" + status +
        "}";
    }
}

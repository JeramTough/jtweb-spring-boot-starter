package net.ssd.apiserver.apigather.zds.model.entity;

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
 * @since 2021-03-08
 */
@TableName("APP_user")
@ApiModel(value="AppUser对象", description="")
public class AppUserDto implements Serializable{

    private static final long serialVersionUID=1L;

    private Integer id;

    private String danwei;

    private String username;

    private String phone;

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
        return "AppUser{" +
        "id=" + id +
        ", danwei=" + danwei +
        ", username=" + username +
        ", phone=" + phone +
        ", status=" + status +
        "}";
    }
}

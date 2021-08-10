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
@TableName("APP_user_20180505")
@ApiModel(value="AppUser20180505对象", description="")
public class AppUser20180505Dto implements Serializable{

    private static final long serialVersionUID=1L;

    private Float id;

    private String danwei;

    private String username;

    private Float phone;

    private Float status;


    public Float getId() {
        return id;
    }

    public void setId(Float id) {
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

    public Float getPhone() {
        return phone;
    }

    public void setPhone(Float phone) {
        this.phone = phone;
    }

    public Float getStatus() {
        return status;
    }

    public void setStatus(Float status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AppUser20180505{" +
        "id=" + id +
        ", danwei=" + danwei +
        ", username=" + username +
        ", phone=" + phone +
        ", status=" + status +
        "}";
    }
}

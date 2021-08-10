package net.ssd.zds.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
@ApiModel(value="AppUserLog对象", description="")
public class AppUserLog implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

  /**
   * 手机号码
   */
    private String phone;

  /**
   * ticket
   */
    private String ticket;

  /**
   * 验证码
   */
    private String checkCode;

  /**
   * 验证码有效时间
   */
    private Long activeMillis;

  /**
   * 最后登录时间
   */
    private LocalDateTime lastLoginTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    public Long getActiveMillis() {
        return activeMillis;
    }

    public void setActiveMillis(Long activeMillis) {
        this.activeMillis = activeMillis;
    }

    public LocalDateTime getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(LocalDateTime lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    @Override
    public String toString() {
        return "AppUserLog{" +
        "id=" + id +
        ", phone=" + phone +
        ", ticket=" + ticket +
        ", checkCode=" + checkCode +
        ", activeMillis=" + activeMillis +
        ", lastLoginTime=" + lastLoginTime +
        "}";
    }
}

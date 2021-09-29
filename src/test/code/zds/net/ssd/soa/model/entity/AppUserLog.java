package net.ssd.soa.model.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author WeiBoWen
 * @since 2021-09-08
 */
@ApiModel(value="AppUserLog对象", description="")
public class AppUserLog implements Serializable {

    private static final long serialVersionUID=1L;

    private Long id;

    private String phone;

    private String ticket;

    private String checkCode;

    private Long activeMillis;

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

package com.jeramtough.test.dto;

import javax.validation.constraints.NotNull;

/**
 * Created on 2019/7/31 15:24
 * by @author WeiBoWen
 */
public class LoginDTO {

    @NotNull(message = "{'code':555,'placeholders':['account','账号','不能为空']}")
    private String account;

    @NotNull(message = "{'code':555,'placeholders':['password','密码','不能为空']}")
    private String password;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

package com.jeramtough.demo.dto;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created on 2019/7/25 17:09
 * by @author WeiBoWen
 */
public class Who {

    @NotNull(message = "name must not is null")
    @ApiModelProperty(value = "名字", notes = "你的名字")
    private String name;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date date;

    private LocalDateTime birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Who{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", birthday=" + birthday +
                '}';
    }
}

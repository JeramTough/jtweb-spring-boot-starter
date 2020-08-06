package com.jeramtough.jtweb.component.apiresponse.bean;

import java.util.List;

/**
 * Created on 2019/7/31 15:30
 * by @author WeiBoWen
 */
public class FailureReason {

    private int code;
    private List<String> placeholders;

    public FailureReason(int code, List<String> placeholders) {
        this.code = code;
        this.placeholders = placeholders;
    }

    public FailureReason() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<String> getPlaceholders() {
        return placeholders;
    }

    public void setPlaceholders(List<String> placeholders) {
        this.placeholders = placeholders;
    }
}

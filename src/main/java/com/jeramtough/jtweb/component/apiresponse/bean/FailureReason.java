package com.jeramtough.jtweb.component.apiresponse.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created on 2019/7/31 15:30
 * by @author WeiBoWen
 */
public class FailureReason implements Serializable {

    private static final long serialVersionUID = -5777670984051395103L;

    private int code;
    private List<String> placeholders;
    private Exception exception;

    public FailureReason(int code) {
        this.code = code;
    }

    public FailureReason(int code, List<String> placeholders) {
        this.code = code;
        this.placeholders = placeholders;
    }

    public FailureReason(int code, Exception exception) {
        this.code = code;
        this.exception = exception;
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

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }
}

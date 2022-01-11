package com.jeramtough.jtweb.component.apiresponse.exception;


import com.jeramtough.jtweb.component.apiresponse.error.ErrorCode;

import java.io.Serializable;

/**
 * <pre>
 * Created on 2020/9/21 15:38
 * by @author WeiBoWen
 * </pre>
 */
public class ApiException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = -3093613766660679588L;

    private ErrorCode errorCode;

    private Integer customErrorCode;

    private String message;

    public ApiException() {
    }

    public ApiException(Integer customErrorCode, String message) {
        this.customErrorCode = customErrorCode;
        this.message = message;
    }

    public ApiException(ErrorCode errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCustomErrorCode() {
        return customErrorCode;
    }

    public void setCustomErrorCode(Integer customErrorCode) {
        this.customErrorCode = customErrorCode;
    }
}

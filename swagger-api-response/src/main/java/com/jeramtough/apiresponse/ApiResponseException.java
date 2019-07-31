package com.jeramtough.apiresponse;

/**
 * Created on 2019/7/29 15:09
 * by @author WeiBoWen
 */
public class ApiResponseException extends RuntimeException {

    private Integer code;

    public ApiResponseException(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}

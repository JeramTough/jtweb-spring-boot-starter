package com.jeramtough.jtweb.component.apiresponse.exception;

import com.jeramtough.jtweb.component.apiresponse.bean.FailureReason;

import javax.validation.constraints.NotNull;

/**
 * Created on 2019/7/29 15:09
 * by @author WeiBoWen
 */
public class ApiResponseException extends RuntimeException {

    private FailureReason failureReason;

    public ApiResponseException(Integer code) {
        this(new FailureReason(code, null));
    }

    public ApiResponseException(Integer code, String... placeholders) {
        this(new FailureReason(code, placeholders));
    }

    public ApiResponseException(FailureReason failureReason) {
        super("The API response code is " + failureReason.getCode());

        this.failureReason = failureReason;
        if (failureReason.getPlaceholders() == null) {
            failureReason.setPlaceholders(new String[]{});
        }
    }


    public Integer getCode() {
        return failureReason.getCode();
    }

    public @NotNull FailureReason getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(FailureReason failureReason) {
        this.failureReason = failureReason;
    }
}

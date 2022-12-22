package com.jeramtough.jtweb.component.apiresponse.exception;

import com.jeramtough.jtweb.component.apiresponse.bean.FailureReason;

import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created on 2019/7/29 15:09
 * by @author WeiBoWen
 */
public class ApiResponseException extends RuntimeException implements Serializable {

    private FailureReason failureReason;

    public ApiResponseException(Integer code) {
        this(new FailureReason(code));
    }

    public ApiResponseException(Integer code, Exception exception) {
        this(new FailureReason(code, exception));
    }

    public ApiResponseException(Integer code, String... placeholders) {
        this(new FailureReason(code, Arrays.asList(placeholders)));
    }

    public ApiResponseException(String code) {
        this(new FailureReason(Integer.parseInt(code)));
    }

    public ApiResponseException(String code, Exception exception) {
        this(new FailureReason(Integer.parseInt(code), exception));
    }

    public ApiResponseException(String code, String... placeholders) {
        this(new FailureReason(Integer.parseInt(code), Arrays.asList(placeholders)));
    }

    public ApiResponseException(FailureReason failureReason) {
        super("The API response code is " + failureReason.getCode());

        this.failureReason = failureReason;
        if (failureReason.getPlaceholders() == null) {
            failureReason.setPlaceholders(new ArrayList<>());
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

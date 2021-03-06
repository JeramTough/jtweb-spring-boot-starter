package com.jeramtough.jtweb.component.apiresponse.bean;

import java.io.Serializable;

/**
 * Created on 2019/7/26 11:26
 * by @author WeiBoWen
 */
public class CommonApiResponse<T> implements Serializable {

    private static final long serialVersionUID = -4471070654995612511L;

    private Boolean isSuccessful;

    private Integer statusCode;

    private Long timestamp;

    private T responseBody;

    private String message;

    public CommonApiResponse() {
    }

    public CommonApiResponse(Integer statusCode, T responseBody) {
        this.statusCode = statusCode;
        this.responseBody = responseBody;
    }


    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public T getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(T responseBody) {
        this.responseBody = responseBody;
    }

    public Boolean getIsSuccessful() {
        return isSuccessful;
    }

    public Boolean isSuccessful() {
        return isSuccessful;
    }

    public void setSuccessful(Boolean isSuccessful) {
        this.isSuccessful = isSuccessful;
    }


    public void setIsSuccessful(Boolean isSuccessful) {
        this.isSuccessful = isSuccessful;
    }


    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "CommonApiResponse{" +
                "isSuccessful=" + isSuccessful +
                ", statusCode=" + statusCode +
                ", timestamp=" + timestamp +
                ", responseBody=" + responseBody +
                '}';
    }


}

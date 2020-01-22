package com.jeramtough.jtweb.component.apiresponse.bean;

/**
 * Created on 2019/7/26 11:26
 * by @author WeiBoWen
 */
public class RestfulApiResponse {

    private Boolean isSuccessful;

    private Integer statusCode;

    private Object responseBody;

    public RestfulApiResponse() {
    }

    public RestfulApiResponse(Integer statusCode, Object responseBody) {
        this.statusCode = statusCode;
        this.responseBody = responseBody;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public Object getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(Object responseBody) {
        this.responseBody = responseBody;
    }

    public Boolean getIsSuccessful() {
        return isSuccessful;
    }

    public void setSuccessful(Boolean successful) {
        isSuccessful = successful;
    }


    public void setIsSuccessful(Boolean successful) {
        isSuccessful = successful;
    }

    @Override
    public String toString() {
        return "RestfulApiResponse{" +
                "isSuccessful=" + isSuccessful +
                ", statusCode=" + statusCode +
                ", responseBody=" + responseBody +
                '}';
    }
}

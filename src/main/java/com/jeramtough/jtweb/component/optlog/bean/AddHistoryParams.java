package com.jeramtough.jtweb.component.optlog.bean;


import com.alibaba.fastjson2.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

/**
 * @CreateTime : 2020-09-25 09:06
 * @Description : 添加日志表实体参数
 */
public class AddHistoryParams implements Serializable {

    private static final long serialVersionUID = 1L;

    private String ip;

    private String createTime;

    private String args;

    @JsonIgnore
    @JSONField(serialize = false)
    private transient Object[] argsForObject;

    private String requestMethod;

    private String response;

    @JsonIgnore
    @JSONField(serialize = false)
    private transient  Object respForObject;

    private InterfaceDetail interfaceDetail;

    /**
     * 接口是否顺利执行完
     */
    private Boolean isCompleted;

    private String expandInfo;

    private String requestUrl;

    /**
     * 不一定有值，只有出异常时才不为空
     */
    @JsonIgnore
    @JSONField(serialize = false)
    private transient Exception exception;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getArgs() {
        return args;
    }

    public void setArgs(String args) {
        this.args = args;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @JsonIgnore
    public Object[] getArgsForObject() {
        return argsForObject;
    }

    @JsonIgnore
    public void setArgsForObject(Object[] argsForObject) {
        this.argsForObject = argsForObject;
    }

    @JsonIgnore
    public Object getRespForObject() {
        return respForObject;
    }

    @JsonIgnore
    public void setRespForObject(Object respForObject) {
        this.respForObject = respForObject;
    }

    public InterfaceDetail getInterfaceDetail() {
        return interfaceDetail;
    }

    public void setInterfaceDetail(InterfaceDetail interfaceDetail) {
        this.interfaceDetail = interfaceDetail;
    }

    public Boolean getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(Boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public String getExpandInfo() {
        return expandInfo;
    }

    public void setExpandInfo(String expandInfo) {
        this.expandInfo = expandInfo;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }
}

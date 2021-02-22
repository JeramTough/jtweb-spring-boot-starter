package com.jeramtough.jtweb.component.optlog.bean;


import java.io.Serializable;

/**
 * @CreateTime : 2020-09-25 09:06
 * @Description : 添加日志表实体参数
 */
public class AddHistoryParams implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long userId;

    private String ip;

    private String createTime;

    private String args;

    private Object[] argsForObject;

    private String requestMethod;

    private String response;

    private Object respForObject;

    private InterfaceDetail interfaceDetail;

    /**
     * 接口是否顺利执行完
     */
    private Boolean isCompleted;

    private String expandInfo;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

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

    public Object[] getArgsForObject() {
        return argsForObject;
    }

    public void setArgsForObject(Object[] argsForObject) {
        this.argsForObject = argsForObject;
    }

    public Object getRespForObject() {
        return respForObject;
    }

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
}

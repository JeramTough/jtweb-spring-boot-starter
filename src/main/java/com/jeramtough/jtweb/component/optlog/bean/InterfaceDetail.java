package com.jeramtough.jtweb.component.optlog.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Arrays;

/**
 * <pre>
 * Created on 2021/2/22 8:59
 * by @author WeiBoWen
 * </pre>
 */
public class InterfaceDetail implements Serializable {

    private static final long serialVersionUID = -5626263215619595688L;

    private String longJavaMethodName;

    private String shortJavaMethodName;

    private ApiTypeEnum apiTypeEnum;

    @JsonIgnore
    @JSONField(serialize = false)
    private transient Boolean isIgnoreMethod;

    @JsonIgnore
    @JSONField(serialize = false)
    private transient Boolean isIgnoreArgs;

    @JsonIgnore
    @JSONField(serialize = false)
    private transient Boolean isIgnoreResponse;

    private String apiDescription;

    private String apiModuleTag;

    private String[] methodArgsClasses;

    InterfaceDetail() {
    }

    public String getLongJavaMethodName() {
        return longJavaMethodName;
    }

    public void setLongJavaMethodName(String longJavaMethodName) {
        this.longJavaMethodName = longJavaMethodName;
    }

    public String getShortJavaMethodName() {
        return shortJavaMethodName;
    }

    public void setShortJavaMethodName(String shortJavaMethodName) {
        this.shortJavaMethodName = shortJavaMethodName;
    }

    public ApiTypeEnum getApiTypeEnum() {
        return apiTypeEnum;
    }

    public void setApiTypeEnum(ApiTypeEnum apiTypeEnum) {
        this.apiTypeEnum = apiTypeEnum;
    }

    public Boolean getIgnoreMethod() {
        return isIgnoreMethod;
    }

    public Boolean getIsIgnoreMethod() {
        return isIgnoreMethod;
    }

    public void setIgnoreMethod(Boolean isIgnoreMethod) {
        this.isIgnoreMethod = isIgnoreMethod;
    }

    public void setIsIgnoreMethod(Boolean isIgnoreMethod) {
        this.isIgnoreMethod = isIgnoreMethod;
    }


    public Boolean getIgnoreArgs() {
        return isIgnoreArgs;
    }

    public Boolean getIsIgnoreArgs() {
        return isIgnoreArgs;
    }

    public void setIgnoreArgs(Boolean ignoreArgs) {
        isIgnoreArgs = ignoreArgs;
    }

    public void setIsIgnoreArgs(Boolean ignoreArgs) {
        isIgnoreArgs = ignoreArgs;
    }


    @JsonIgnore
    public Boolean getIgnoreResponse() {
        return isIgnoreResponse;
    }

    public void setIgnoreResponse(Boolean ignoreResponse) {
        isIgnoreResponse = ignoreResponse;
    }

    public String getApiDescription() {
        return apiDescription;
    }

    public void setApiDescription(String apiDescription) {
        this.apiDescription = apiDescription;
    }

    public String getApiModuleTag() {
        return apiModuleTag;
    }

    public void setApiModuleTag(String apiModuleTag) {
        this.apiModuleTag = apiModuleTag;
    }

    public String[] getMethodArgsClasses() {
        return methodArgsClasses;
    }

    public void setMethodArgsClasses(String[] methodArgsClasses) {
        this.methodArgsClasses = methodArgsClasses;
    }

    @Override
    public String toString() {
        return "InterfaceDetail{" +
                "longJavaMethodName='" + longJavaMethodName + '\'' +
                ", shortJavaMethodName='" + shortJavaMethodName + '\'' +
                ", apiTypeEnum=" + apiTypeEnum +
                ", isIgnoreMethod=" + isIgnoreMethod +
                ", isIgnoreArgs=" + isIgnoreArgs +
                ", isIgnoreResponse=" + isIgnoreResponse +
                ", apiDescription='" + apiDescription + '\'' +
                ", apiModuleTag='" + apiModuleTag + '\'' +
                ", methodArgsClasses=" + Arrays.toString(methodArgsClasses) +
                '}';
    }
}

package com.jeramtough.randl2.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.sql.Blob;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author JeramTough
 * @since 2021-02-22
 */
@ApiModel(value="RandlOperationLog对象", description="")
public class RandlOperationLog implements Serializable {

    private static final long serialVersionUID=1L;

  /**
   * 主键
   */
    @TableId(value = "fid", type = IdType.AUTO)
    private Long fid;

  /**
   * 操作机ip地址
   */
    private String ip;

  /**
   * 管理员id
   */
    private Long adminId;

  /**
   * 管理员名字
   */
    private String adminName;

  /**
   * 接口名
   */
    private String apiName;

  /**
   * 接口描述
   */
    private String apiDescription;

  /**
   * 日志记录创建时间
   */
    private LocalDateTime createTime;

  /**
   * API模块
   */
    private String apiModule;

  /**
   * 执行是否完成，0:未完成，1:完成
   */
    private Boolean result;

  /**
   * 请求url
   */
    private String requestUrl;

  /**
   * java方法
   */
    private String javaMethod;

  /**
   * 请求参数
   */
    private Blob requestArgs;

  /**
   * 相应内容
   */
    private Blob responseBody;


    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public String getApiDescription() {
        return apiDescription;
    }

    public void setApiDescription(String apiDescription) {
        this.apiDescription = apiDescription;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getApiModule() {
        return apiModule;
    }

    public void setApiModule(String apiModule) {
        this.apiModule = apiModule;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getJavaMethod() {
        return javaMethod;
    }

    public void setJavaMethod(String javaMethod) {
        this.javaMethod = javaMethod;
    }

    public Blob getRequestArgs() {
        return requestArgs;
    }

    public void setRequestArgs(Blob requestArgs) {
        this.requestArgs = requestArgs;
    }

    public Blob getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(Blob responseBody) {
        this.responseBody = responseBody;
    }

    @Override
    public String toString() {
        return "RandlOperationLog{" +
        "fid=" + fid +
        ", ip=" + ip +
        ", adminId=" + adminId +
        ", adminName=" + adminName +
        ", apiName=" + apiName +
        ", apiDescription=" + apiDescription +
        ", createTime=" + createTime +
        ", apiModule=" + apiModule +
        ", result=" + result +
        ", requestUrl=" + requestUrl +
        ", javaMethod=" + javaMethod +
        ", requestArgs=" + requestArgs +
        ", responseBody=" + responseBody +
        "}";
    }
}

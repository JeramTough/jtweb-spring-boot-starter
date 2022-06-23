package com.jeramtough.jtweb.component.filesaver.config.upload.oss;

/**
 * <pre>
 * Created on 2022/3/27 上午3:35
 * by @author WeiBoWen
 * </pre>
 */
public interface OssSettingAdapter {

    /**
     * yourEndpoint填写Bucket所在地域对应的Endpoint。以华东1（杭州）为例，Endpoint填写为https://oss-cn-hangzhou.aliyuncs.com。
     * String endpoint = "yourEndpoint";
     */
    String getEndpoint();

    String getBucketName();

    String getAccessKeyBase64();

    String getSecretBase64();

    String getOssPath();

    Boolean getAfterDelete();
}

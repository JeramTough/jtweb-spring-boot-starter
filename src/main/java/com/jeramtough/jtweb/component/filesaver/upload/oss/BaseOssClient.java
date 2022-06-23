package com.jeramtough.jtweb.component.filesaver.upload.oss;

import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.symmetric.AES;
import com.jeramtough.jtweb.component.filesaver.config.upload.oss.OssSettingAdapter;

/**
 * <pre>
 * Created on 2022/3/27 上午2:58
 * by @author WeiBoWen
 * </pre>
 */
public abstract class BaseOssClient implements OssClient {

    private static final String AES_KEY="jeramtough123456";

    private final OssSettingAdapter settingAdapter;
    private final String accessKey;
    private final String getSecret;

    public BaseOssClient(OssSettingAdapter settingAdapter) {
        this.settingAdapter = settingAdapter;

        AES aes = SecureUtil.aes(AES_KEY.getBytes());
        accessKey = aes.decryptStr(settingAdapter.getAccessKeyBase64());
        getSecret = aes.decryptStr(settingAdapter.getSecretBase64());
    }

    public OssSettingAdapter getSettingAdapter() {
        return settingAdapter;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public String getGetSecret() {
        return getSecret;
    }
}

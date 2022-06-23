package com.jeramtough.jtweb.component.filesaver.upload.named;

import com.jeramtough.jtweb.component.filesaver.config.upload.UploadFileSaveConfigAdapter;

/**
 * <pre>
 * Created on 2022/3/27 上午5:10
 * by @author WeiBoWen
 * </pre>
 */
public class DefaultUploadFileNamed extends BaseUploadFileNamed {

    public DefaultUploadFileNamed(
            UploadFileSaveConfigAdapter uploadFileSaveConfigAdapter) {
        super(uploadFileSaveConfigAdapter);
    }

    @Override
    public String getPrefix() {
        return "file";
    }
}

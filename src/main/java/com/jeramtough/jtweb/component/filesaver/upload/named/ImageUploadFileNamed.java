package com.jeramtough.jtweb.component.filesaver.upload.named;

import com.jeramtough.jtweb.component.filesaver.config.upload.UploadFileSaveConfigAdapter;

/**
 * <pre>
 * Created on 2021/12/3 下午4:56
 * by @author WeiBoWen
 * </pre>
 */
public class ImageUploadFileNamed extends BaseUploadFileNamed {

    public ImageUploadFileNamed(UploadFileSaveConfigAdapter uploadFileSaveConfigAdapter) {
        super(uploadFileSaveConfigAdapter);
    }

    @Override
    public String getPrefix() {
        return "image";
    }

}

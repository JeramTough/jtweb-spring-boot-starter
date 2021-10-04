package com.jeramtough.jtweb.component.filesaver.config.upload;

/**
 * <pre>
 * Created on 2021/9/15 上午9:31
 * by @author WeiBoWen
 * </pre>
 */
public interface ImageUploadFileSaveConfigAdapter extends UploadFileSaveConfigAdaper {

    int getResetWidth();

    int getResetHeight();

    String getSaveExtname();
}

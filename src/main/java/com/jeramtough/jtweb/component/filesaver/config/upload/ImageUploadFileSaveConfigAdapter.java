package com.jeramtough.jtweb.component.filesaver.config.upload;

/**
 * <pre>
 * Created on 2021/9/15 上午9:31
 * by @author WeiBoWen
 * </pre>
 */
public interface ImageUploadFileSaveConfigAdapter extends UploadFileSaveConfigAdapter {

    int getResetWidth();

    int getResetHeight();

    String getSaveExtname();

    /**
     * 如果重置大小都设置为0，就必须设置缩放比例，最大为100
     */
    int getScale();
}

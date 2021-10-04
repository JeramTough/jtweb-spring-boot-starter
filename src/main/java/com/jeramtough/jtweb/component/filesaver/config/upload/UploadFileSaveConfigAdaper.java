package com.jeramtough.jtweb.component.filesaver.config.upload;

import com.jeramtough.jtweb.component.filesaver.config.FileSaveConfigAdapter;

/**
 * <pre>
 * Created on 2021/10/2 下午11:09
 * by @author WeiBoWen
 * </pre>
 */
public interface UploadFileSaveConfigAdaper extends FileSaveConfigAdapter {

    int getMaxSize();

    String getType();
}

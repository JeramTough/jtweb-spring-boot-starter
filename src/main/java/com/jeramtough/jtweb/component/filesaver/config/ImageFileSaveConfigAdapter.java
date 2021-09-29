package com.jeramtough.jtweb.component.filesaver.config;

/**
 * <pre>
 * Created on 2021/9/15 上午9:31
 * by @author WeiBoWen
 * </pre>
 */
public interface ImageFileSaveConfigAdapter extends FileSaveConfigAdapter {

    int getResetWidth();

    int getResetHeight();

    String getSaveExtname();
}

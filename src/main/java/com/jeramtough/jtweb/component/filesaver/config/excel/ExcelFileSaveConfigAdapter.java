package com.jeramtough.jtweb.component.filesaver.config.excel;

import com.jeramtough.jtweb.component.filesaver.config.FileSaveConfigAdapter;

import java.util.Map;

/**
 * <pre>
 * Created on 2021/10/2 下午11:51
 * by @author WeiBoWen
 * </pre>
 */
public interface ExcelFileSaveConfigAdapter extends FileSaveConfigAdapter {

    Map<String, String> getKeyMap();

    String getFileName();

    String getTitle();

    String getEmptyValue();
}

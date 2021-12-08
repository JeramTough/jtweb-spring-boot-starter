package com.jeramtough.jtweb.component.filesaver.config.upload;

import com.jeramtough.jtweb.component.filesaver.config.FileSaveConfigAdapter;

/**
 * <pre>
 * Created on 2021/10/2 下午11:09
 * by @author WeiBoWen
 * </pre>
 */
public interface UploadFileSaveConfigAdapter extends FileSaveConfigAdapter {

    Boolean allowRemoveUndeterminedOnScheme();

    /**
     * 返回定时任务的时间周期
     *
     * @return 单位秒
     */
    Long getRemoveUndeterminedPeriod();

    int getMaxSize();

    String getType();
}

package com.jeramtough.jtweb.component.optlog.channel;


import com.jeramtough.jtweb.component.optlog.bean.AddHistoryParams;

/**
 * <pre>
 * Created on 2020/12/25 16:00
 * by @author WeiBoWen
 * </pre>
 */
public interface LogChannel {

    void saveLog(AddHistoryParams params);

}

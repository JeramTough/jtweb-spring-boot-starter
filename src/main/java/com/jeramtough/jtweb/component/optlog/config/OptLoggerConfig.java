package com.jeramtough.jtweb.component.optlog.config;

import com.jeramtough.jtweb.component.optlog.channel.LogChannel;
import com.jeramtough.jtweb.component.optlog.filter.OptLogFilter;

import javax.servlet.http.HttpServletRequest;

/**
 * <pre>
 * Created on 2020/12/25 15:20
 * by @author WeiBoWen
 * </pre>
 */
public interface OptLoggerConfig {

    /**
     * 得到拓展信息，每次日志记录都会获取
     */
    String getExpandInfo();

    /**
     * 是否开启日志记录
     */
    Boolean isAble();


    /**
     * 日志保存渠道，比如 HttpLogChannel
     */
    LogChannel[] logChanels();

    OptLogFilter[] optLogFilters();


}

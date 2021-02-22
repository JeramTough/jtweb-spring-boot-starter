package com.jeramtough.jtweb.component.optlog.config;

import com.jeramtough.jtweb.component.optlog.channel.LogChannel;

import javax.servlet.http.HttpServletRequest;

/**
 * <pre>
 * Created on 2020/12/25 15:20
 * by @author WeiBoWen
 * </pre>
 */
public interface OptLoggerConfig {

    /**
     * 能提供UserId就提供，不能提供就返回null
     */
    Long getUserId(HttpServletRequest request);

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

}

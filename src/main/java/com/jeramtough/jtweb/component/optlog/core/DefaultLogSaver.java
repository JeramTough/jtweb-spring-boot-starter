package com.jeramtough.jtweb.component.optlog.core;

import com.alibaba.fastjson.JSON;
import com.jeramtough.jtlog.with.WithLogger;
import com.jeramtough.jtweb.component.optlog.bean.AddHistoryParams;
import com.jeramtough.jtweb.component.optlog.channel.LogChannel;
import com.jeramtough.jtweb.component.optlog.config.OptLoggerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/**
 * <pre>
 * Created on 2020/12/26 9:19
 * by @author WeiBoWen
 * </pre>
 */
@Component("defaultLogSaver")
public class DefaultLogSaver implements LogSaver, WithLogger {


    private final OptLoggerConfig loggerConfig;

    private final ExecutorService executorService;

    @Autowired
    public DefaultLogSaver(OptLoggerConfig loggerConfig) {
        this.loggerConfig = loggerConfig;
        executorService = new ThreadPoolExecutor(0, Integer.MAX_VALUE,
                60L, TimeUnit.SECONDS,
                new SynchronousQueue<>(), (ThreadFactory) Thread::new);
    }


    @Override
    public void save(final AddHistoryParams params) {
        //先通过过滤器过滤
        if (loggerConfig.optLogFilters() != null) {
            boolean isFilter = Arrays.asList(loggerConfig.optLogFilters())
                                     .parallelStream()
                                     .anyMatch(optLogFilter -> !optLogFilter.filter(params));
            if (isFilter) {
                return;
            }
        }

        //再往渠道里发消息

        if (loggerConfig.logChanels() != null) {
            for (final LogChannel logChannel : loggerConfig.logChanels()) {
                executorService.submit(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            getLogger().verbose("准备进入日志记录渠道【" + logChannel.getClass().getSimpleName() + "】");

                            String respStr;
                            if (params != null) {
                                try {
                                    if (params.getRespForObject() != null) {

                                        if (params.getRespForObject() instanceof Serializable) {
                                            respStr = JSON.toJSONString(params.getRespForObject());
                                            params.setResponse(respStr);
                                        }
                                    }
                                }
                                catch (Exception ignored) {

                                }
                            }

                            List<String> argsList = new ArrayList<>();
                            if (params != null) {
                                try {
                                    if (params.getArgsForObject() != null) {
                                        for (Object arg : params.getArgsForObject()) {
                                            //如果响应结果可以序列化的话，才赋值这个字段用于保存
                                            if (arg instanceof Serializable) {
                                                argsList.add(JSON.toJSONString(arg));
                                            }
                                            else {
                                                argsList.add("\"NotSerializable\"");
                                            }
                                        }
                                        params.setArgs(appendByComma(argsList));
                                    }
                                }
                                catch (Exception ignored) {

                                }
                            }

                            logChannel.saveLog(params);
                        }
                        catch (Exception e) {
                            String message = e.getClass().getSimpleName() + e.getMessage();
                            getLogger().error("日志记录出现某些问题导致失败！：" + message);
                            e.printStackTrace();
                        }
                    }
                });
            }
        }
    }

    //******************

    public static String appendByComma(List<String> strList) {
        if (strList.size() == 0) {
            return null;
        }

        StringBuilder result = new StringBuilder();
        for (String s : strList) {
            if (s != null) {
                result.append(s).append(",");
            }
        }
        String str = result.toString();
        if (str.length() > 0) {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

}

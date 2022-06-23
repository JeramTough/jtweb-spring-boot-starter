package com.jeramtough.jtweb.component.filesaver.upload.path;

import cn.hutool.core.date.LocalDateTimeUtil;

import java.io.File;
import java.time.LocalDateTime;
import java.util.Map;

/**
 * <pre>
 * Created on 2022/3/19 上午1:30
 * by @author WeiBoWen
 * </pre>
 */
public class YmdPathStrategy implements PathStrategy {
    @Override
    public String getPath(Map<String, Object> params) {
        LocalDateTime nowTime = LocalDateTime.now();
        String year = LocalDateTimeUtil.format(nowTime, "yyyy");
        String month = LocalDateTimeUtil.format(nowTime, "MM");
        String day = LocalDateTimeUtil.format(nowTime, "dd");

        String path = File.separator + year
                + File.separator + month + File.separator + day + File.separator;
        return path;
    }
}

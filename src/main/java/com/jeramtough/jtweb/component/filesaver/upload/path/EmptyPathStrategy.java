package com.jeramtough.jtweb.component.filesaver.upload.path;

import java.util.Map;

/**
 * <pre>
 * Created on 2022/3/19 上午1:32
 * by @author WeiBoWen
 * </pre>
 */
public class EmptyPathStrategy implements PathStrategy {
    @Override
    public String getPath(Map<String, Object> params) {
        return "";
    }
}

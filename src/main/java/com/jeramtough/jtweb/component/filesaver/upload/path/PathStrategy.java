package com.jeramtough.jtweb.component.filesaver.upload.path;

import java.util.Map;

/**
 * <pre>
 * Created on 2022/3/19 上午1:29
 * by @author WeiBoWen
 * </pre>
 */
public interface PathStrategy {


    String getPath(Map<String, Object> params);

}

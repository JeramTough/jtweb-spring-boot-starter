package com.jeramtough.jtweb.component.http;

import cn.hutool.core.io.IoUtil;
import cn.hutool.core.io.file.FileNameUtil;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;

import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <pre>
 * Created on 2021/9/29 上午10:56
 * by @author WeiBoWen
 * </pre>
 */
public class HttpContentTypeHandler {

    private static volatile HttpContentTypeHandler instance;

    private final Map<String, String> contentTypeMap;

    public HttpContentTypeHandler(
            Map<String, String> contentTypeMap) {
        this.contentTypeMap = contentTypeMap;
    }


    public static HttpContentTypeHandler getInstance() {
        if (instance == null) {
            synchronized (HttpContentTypeHandler.class) {
                if (instance == null) {
                    Map<String, String> contentTypeMap = new HashMap<>(350);
                    InputStream inputStream =
                            HttpContentTypeHandler.class.getClassLoader().getResourceAsStream(
                                    "content-type.json");

                    Objects.requireNonNull(inputStream);

                    String json = IoUtil.read(inputStream, "UTF-8");
                    JSONObject jsonObject = JSON.parseObject(json);
                    jsonObject.forEach((s, o) -> {
                        contentTypeMap.put(s, o.toString());
                    });

                    instance = new HttpContentTypeHandler(contentTypeMap);
                }
            }
        }

        return instance;
    }

    public String getContentType(String fileExtName) {
        if (contentTypeMap.containsKey(fileExtName)) {
            return contentTypeMap.get(fileExtName);
        }
        else {
            return contentTypeMap.get("*");
        }
    }

    public String getContentType(File file) {
        String extName = FileNameUtil.extName(file);
        return getContentType(extName);
    }


}

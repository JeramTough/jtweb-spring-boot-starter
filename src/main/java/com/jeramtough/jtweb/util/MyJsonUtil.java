package com.jeramtough.jtweb.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;

/**
 * <pre>
 * Created on 2021/9/30 下午11:50
 * by @author WeiBoWen
 * </pre>
 */
public class MyJsonUtil {

    public static JSONObject toJsonObject(Object o) {
        if (!(o instanceof Serializable)) {
            throw new IllegalStateException("只能转换Serializable");
        }
        String json = JSON.toJSONString(o);
        JSONObject jsonObject = JSON.parseObject(json);
        return jsonObject;
    }

}

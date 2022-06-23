package com.jeramtough.jtweb.component.location.tencent.api;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jeramtough.jtcomponent.http.URLBuilder;
import com.jeramtough.jtweb.component.location.tencent.setting.TencentLocationSettingAdapter;

/**
 * <pre>
 * Created on 2021/10/12 上午11:48
 * by @author WeiBoWen
 * </pre>
 */
public class TencentLocationApi {

    private final TencentLocationSettingAdapter tencentLocationSettingAdapter;

    public TencentLocationApi(
            TencentLocationSettingAdapter tencentLocationSettingAdapter) {
        this.tencentLocationSettingAdapter = tencentLocationSettingAdapter;
    }

    public JSONObject getLocationByLonLat(String lat, String lon) throws
            Exception {
        URLBuilder urlBuilder = new URLBuilder(tencentLocationSettingAdapter.getUrl());
        urlBuilder.appendParam("location", lat + "," + lon);
        urlBuilder.appendParam("get_poi", "1");
        urlBuilder.appendParam("key", tencentLocationSettingAdapter.getKey());

        try {
            String response = HttpUtil.get(urlBuilder.build());
            JSONObject jsonObject = JSON.parseObject(response);
            return jsonObject;
        }
        catch (Exception e) {
            throw e;
        }
    }

}

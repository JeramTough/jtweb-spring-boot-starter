package com.jeramtough.jtweb.component.location.tencent;

import com.alibaba.fastjson2.JSONObject;
import com.jeramtough.jtweb.component.location.tencent.api.TencentLocationApi;
import com.jeramtough.jtweb.component.location.tencent.setting.TencentLocationSettingAdapter;

/**
 * <pre>
 * Created on 2021/10/12 上午11:47
 * by @author WeiBoWen
 * </pre>
 */
public class LatLonAddressSeeker {

    private final TencentLocationSettingAdapter tencentLocationSettingAdapter;

    public LatLonAddressSeeker(
            TencentLocationSettingAdapter tencentLocationSettingAdapter) {
        this.tencentLocationSettingAdapter = tencentLocationSettingAdapter;
    }

    public JSONObject getAddress(String lat, String lon) throws Exception {
        TencentLocationApi tencentLocationApi =
                new TencentLocationApi(tencentLocationSettingAdapter);
        JSONObject jsonObject = tencentLocationApi.getLocationByLonLat(lat, lon);
        if (jsonObject.getInteger("status") == 0) {
            return jsonObject;
        }
        else {
            String message = jsonObject.getString("message");
            IllegalStateException illegalStateException = new IllegalStateException(
                    "根据经纬度获取地址失败！" + message);
            throw illegalStateException;
        }
    }

}

package com.jeramtough.jtweb.component.location.apater;

import com.alibaba.fastjson2.JSONObject;
import com.jeramtough.jtweb.component.location.bean.JtLocation;

/**
 * <pre>
 * Created on 2021/10/12 上午11:56
 * by @author WeiBoWen
 * </pre>
 */
public class TencentApiLocationAdapter implements LocationAdapter {

    private final JSONObject jsonObject;

    public TencentApiLocationAdapter(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    @Override
    public JtLocation getJtLocation() {
        JtLocation jtLocation = new JtLocation();
        JSONObject result = jsonObject.getJSONObject("result");
        jtLocation.setAddress(result.getString("address"));
        jtLocation.setLat(result.getJSONObject("location").getString("lat"));
        jtLocation.setLon(result.getJSONObject("location").getString("lng"));
        return jtLocation;
    }
}

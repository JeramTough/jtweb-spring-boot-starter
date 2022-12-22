package com.jeramtough.jtweb.component.location;

import com.alibaba.fastjson2.JSONObject;
import com.jeramtough.jtweb.component.location.apater.ChunZhenLocationAdapter;
import com.jeramtough.jtweb.component.location.apater.TencentApiLocationAdapter;
import com.jeramtough.jtweb.component.location.bean.JtLocation;
import com.jeramtough.jtweb.component.location.chunzhen.IpAddressSeeker;
import com.jeramtough.jtweb.component.location.chunzhen.IpLocation;
import com.jeramtough.jtweb.component.location.chunzhen.setting.ChunZhenLocationSettingAdapter;
import com.jeramtough.jtweb.component.location.tencent.LatLonAddressSeeker;
import com.jeramtough.jtweb.component.location.tencent.setting.TencentLocationSettingAdapter;

/**
 * <pre>
 * Created on 2021/10/12 上午11:39
 * by @author WeiBoWen
 * </pre>
 */
public class DefaultLocationGating implements LocationGating {


    private final LatLonAddressSeeker latLonAddressSeeker;
    private final IpAddressSeeker ipAddressSeeker;

    public DefaultLocationGating(
            ChunZhenLocationSettingAdapter chunZhenLocationSettingAdapter,
            TencentLocationSettingAdapter tencentLocationSettingAdapter) {

        latLonAddressSeeker = new LatLonAddressSeeker(tencentLocationSettingAdapter);
        ipAddressSeeker = new IpAddressSeeker(
                chunZhenLocationSettingAdapter.getQqwryDatFilePath());
    }

    @Override
    public JtLocation getLocationByLatLon(String lat, String lon) throws Exception {
        JSONObject response = latLonAddressSeeker.getAddress(lat, lon);
        return new TencentApiLocationAdapter(response).getJtLocation();
    }

    @Override
    public JtLocation getLocationByIpAddress(String ipAddress) {
        IpLocation ipLocation = ipAddressSeeker.getIPLocation(ipAddress);
        return new ChunZhenLocationAdapter(ipLocation).getJtLocation();
    }
}

package com.jeramtough.jtweb.component.location;

import com.jeramtough.jtweb.component.location.bean.JtLocation;

/**
 * <pre>
 * Created on 2021/10/12 上午11:38
 * by @author WeiBoWen
 * </pre>
 */
public interface LocationGating {

    JtLocation getLocationByLatLon(String lat, String lon) throws Exception;

    JtLocation getLocationByIpAddress(String ipAddress);
}

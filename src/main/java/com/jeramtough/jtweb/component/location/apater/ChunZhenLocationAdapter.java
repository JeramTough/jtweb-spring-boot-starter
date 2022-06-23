package com.jeramtough.jtweb.component.location.apater;

import com.jeramtough.jtweb.component.location.bean.JtLocation;
import com.jeramtough.jtweb.component.location.chunzhen.IpLocation;

/**
 * <pre>
 * Created on 2021/10/12 上午11:24
 * by @author WeiBoWen
 * </pre>
 */
public class ChunZhenLocationAdapter implements LocationAdapter {

    private final IpLocation ipLocation;

    public ChunZhenLocationAdapter(
            IpLocation ipLocation) {
        this.ipLocation = ipLocation;
    }

    @Override
    public JtLocation getJtLocation() {
        JtLocation jtLocation = new JtLocation();
        jtLocation.setIpAddress(ipLocation.getIp());
        jtLocation.setAddress(ipLocation.getCountry());
        return jtLocation;
    }
}

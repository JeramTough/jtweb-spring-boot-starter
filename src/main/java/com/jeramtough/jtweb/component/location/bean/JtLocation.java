package com.jeramtough.jtweb.component.location.bean;

import java.io.Serializable;

/**
 * <pre>
 * Created on 2021/10/12 上午11:19
 * by @author WeiBoWen
 * </pre>
 */
public class JtLocation implements Serializable {

    private static final long serialVersionUID = -2031340063007225810L;

    private String lat;
    private String lon;
    private String address;
    private String ipAddress;

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "JtLocation{" +
                "lat='" + lat + '\'' +
                ", lon='" + lon + '\'' +
                ", address='" + address + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                '}';
    }
}

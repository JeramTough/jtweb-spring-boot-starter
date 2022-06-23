package com.jeramtough.jtweb.component.location.chunzhen;

/**
 * <pre>
 * Created on 2021/10/12 上午9:49
 * by @author WeiBoWen
 * </pre>
 */
public class IpLocation {
    /**
     * 国家
     */
    private String country;
    /**
     * 区域 - 省份 + 城市
     */
    private String area;

    private String ip;

    public IpLocation() {
        country = area = "";
    }

    public synchronized IpLocation getCopy() {
        IpLocation ret = new IpLocation();
        ret.country = country;
        ret.area = area;
        return ret;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        String city = "";
        if(country != null){
            String[] array = country.split("省");
            if(array != null && array.length > 1){
                city =  array[1];
            } else {
                city = country;
            }
            if(city.length() > 3){
                city.replace("内蒙古", "");
            }
        }
        return city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        //如果为局域网，纯真IP地址库的地区会显示CZ88.NET,这里把它去掉
        if("CZ88.NET".equals(area.trim())){
            this.area="本机或本网络";
        }else{
            this.area = area;
        }
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
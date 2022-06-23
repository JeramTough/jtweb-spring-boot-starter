package com.jeramtough.location;

import com.jeramtough.jtlog.facade.L;
import com.jeramtough.jtweb.component.location.DefaultLocationGating;
import com.jeramtough.jtweb.component.location.LocationGating;
import com.jeramtough.jtweb.component.location.bean.JtLocation;
import com.jeramtough.jtweb.component.location.chunzhen.setting.ChunZhenLocationSettingAdapter;
import com.jeramtough.jtweb.component.location.tencent.setting.TencentLocationSettingAdapter;
import org.junit.Test;

/**
 * <pre>
 * Created on 2021/10/18 下午3:08
 * by @author WeiBoWen
 * </pre>
 */
public class LocationTest {

    @Test
    public void test1() {
        LocationGating locationGating = new DefaultLocationGating(
                new ChunZhenLocationSettingAdapter() {
                    @Override
                    public String getQqwryDatFilePath() {
                        return "/developer/Codes/IdeaCodes/spring-boot-starter-jtweb2/Doc/chunzhen/qqwry.dat";
                    }
                }, new TencentLocationSettingAdapter() {
            @Override
            public String getUrl() {
                return null;
            }

            @Override
            public String getKey() {
                return null;
            }
        });

        JtLocation jtLocation=locationGating.getLocationByIpAddress("106.127.234.29");
        L.debug(jtLocation.toString());
    }

}

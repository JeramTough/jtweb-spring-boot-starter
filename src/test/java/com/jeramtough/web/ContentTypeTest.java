package com.jeramtough.web;

import cn.hutool.core.io.IoUtil;
import cn.hutool.core.io.LineHandler;
import com.alibaba.fastjson2.JSON;
import com.jeramtough.jtcomponent.utils.StringUtil;
import com.jeramtough.jtlog.facade.L;
import com.jeramtough.jtweb.component.http.HttpContentTypeHandler;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * <pre>
 * Created on 2021/9/29 上午10:38
 * by @author WeiBoWen
 * </pre>
 */
public class ContentTypeTest {

    @Test
    public void test1() {
        File file = new File("/home/jeramtough/Temp/pom.txt");
        Map<String, String> map = new TreeMap<String, String>(
                new Comparator<String>() {
                    public int compare(String obj1, String obj2) {
                        // 升序排序
                        return obj1.compareTo(obj2);
                    }
                });

        try {
            IoUtil.readLines(new FileInputStream(file), StandardCharsets.UTF_8,
                    new LineHandler() {

                        @Override
                        public void handle(String line) {
                            L.debug(line);
                            List<String> a = StringUtil.splitByComma(line);
                            map.put(a.get(0).replace(".", ""), a.get(1));
                            map.put(a.get(2).replace(".", ""), a.get(3));

                        }
                    });
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            IoUtil.write(
                    new FileOutputStream("/developer/Codes/IdeaCodes/spring-boot-starter" +
                            "-jtweb2/src/main/resources/content-type.json"), "UTF-8", true,
                    JSON.toJSONString(map));
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        L.arrive();
    }

    @Test
    public void test2() {
        String a = HttpContentTypeHandler.getInstance().getContentType("jpg");
        L.debug(a);
    }

}

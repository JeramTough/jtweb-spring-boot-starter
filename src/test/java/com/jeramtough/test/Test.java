package com.jeramtough.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jeramtough.jtlog.facade.L;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * <pre>
 * Created on 2020/1/30 22:56
 * by @author JeramTough
 * </pre>
 */
public class Test {

    @org.junit.jupiter.api.Test
    public void test2() {

        try {
            String json=FileUtils.readFileToString(new File("E:\\Codes\\IdeaCodes\\spring-boot-starter-jtweb2" +
                    "\\src" +
                    "\\test\\code\\test.json"),"UTF-8");
            JSONObject jsonObject=JSON.parseObject(json);
            JSONArray jsonArray=jsonObject.getJSONArray("data");
            for (int i=0;i<jsonArray.size();i++){
                JSONObject data=jsonArray.getJSONObject(i);
                L.debugs(data.getString("Station_Name"),data.getString("TEM_Min"));

                if (data.getString("TEM_Min").equals("0.0")||data.getString("TEM_Min").equals("0")){
                    L.arrive();
                }

            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}

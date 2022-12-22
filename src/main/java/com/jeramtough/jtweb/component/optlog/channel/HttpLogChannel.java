package com.jeramtough.jtweb.component.optlog.channel;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.jeramtough.jtlog.with.WithLogger;
import com.jeramtough.jtweb.component.optlog.bean.AddHistoryParams;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;

/**
 * <pre>
 * Created on 2020/12/26 10:56
 * by @author WeiBoWen
 * </pre>
 */
public class HttpLogChannel implements LogChannel, WithLogger {


    private String bsmLogApi;
    private RestTemplate restTemplate;

    public HttpLogChannel(String bsmLogApi) {
        this.bsmLogApi = bsmLogApi;
        restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().set(1, new StringHttpMessageConverter(StandardCharsets.UTF_8));
    }

    @Override
    public void saveLog(AddHistoryParams params) {
        String responseStr = restTemplate.postForObject(bsmLogApi, params, String.class);
        if (responseStr != null) {
            JSONObject response = JSON.parseObject(responseStr);
            if (response.getBoolean("isSuccessful")) {
                getLogger().info("保存日志成功！");
            }
            else {
                String message = "";
                if (response.getString("responseBody") != null) {
                    message = response.getString("responseBody");
                }
                getLogger().error("保存日志失败," + message);
            }
        }
    }
}

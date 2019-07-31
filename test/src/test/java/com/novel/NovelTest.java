package com.novel;

import com.alibaba.fastjson.JSON;
import com.jeramtough.jtlog.annotation.LogConfiguration;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created on 2019/6/26 16:34
 * by @author WeiBoWen
 */
@LogConfiguration(maxLengthOfRow = 20)
public class NovelTest {

    @Test
    public void test() {
       /* String url = "https://www.biquge.info/26_26516/11938050.html";
        NovelClient novelClient = new NovelClient();
        String novel = novelClient.open(url);
        L.debug(novel);*/

        Recode recode = new Recode();
        recode.setCurrentUrl("");
        String jsonStr = JSON.toJSONString(recode, true);
        try {
            IOUtils.write(jsonStr,new FileOutputStream(new File("./recode.json")));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }


}


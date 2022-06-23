package com.jeramtough.yuebao;

import cn.hutool.core.io.IoUtil;
import cn.hutool.core.io.LineHandler;
import com.jeramtough.jtlog.facade.L;
import org.junit.Test;
import org.springframework.util.StringUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * <pre>
 * Created on 2021/9/30 上午11:06
 * by @author WeiBoWen
 * </pre>
 */
public class TxtTest {

    @Test
    public void test1() throws FileNotFoundException, UnsupportedEncodingException {
        String path = "/home/jeramtough/桌面/周报/10/10月报.txt";
        String path2 = "/home/jeramtough/桌面/周报/10/10月报_out.txt";
        String text = IoUtil.read(new FileInputStream(path), StandardCharsets.UTF_8);
        for (int i = 1; i < 100; i++) {
            text = text.replace(i + "、", "");
        }

        final int[] index = {0};
        final String[] text2 = {""};
        IoUtil.readLines(new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8)),
                StandardCharsets.UTF_8, new LineHandler() {
                    @Override
                    public void handle(String line) {
                        if (StringUtils.hasText(line)){
                            line=line.trim();
                            if (line.startsWith("@")){
                                index[0] =0;
                                text2[0] = text2[0] +"\n\n"+line+"\n";
                            }
                            else{
                                index[0]++;
                                text2[0] = text2[0] +index[0]+"、"+line+"\n";
                            }
                        }
                    }
                });

        L.debug(text2[0]);
        IoUtil.write(new FileOutputStream(path2), StandardCharsets.UTF_8, true, text2[0]);
    }

}

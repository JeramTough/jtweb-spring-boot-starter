package springtest;

import cn.hutool.core.io.IoUtil;
import cn.hutool.core.io.LineHandler;
import com.jeramtough.jtlog.facade.L;
import org.junit.Test;
import org.springframework.util.StringUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/**
 * <pre>
 * Created on 2021/12/31 下午3:32
 * by @author WeiBoWen
 * </pre>
 */
public class YueBaoTest {


    @Test
    public void test1() throws FileNotFoundException, UnsupportedEncodingException {
        String path = "/home/jeramtough/桌面/Work/YTZZ/日周月报/2022/01/月报.txt";
        String path2 = "/home/jeramtough/桌面/Work/YTZZ/日周月报/2022/01/月报_out.txt";
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
                        if (StringUtils.hasText(line)) {
                            line = line.trim();
                            if (line.startsWith("@")) {
                                index[0] = 0;
                                text2[0] = text2[0] + "\n\n" + line + "\n";
                            }
                            else {
                                index[0]++;
                                String line2=line;
                                String lastChar=line2.charAt(line2.length()-1)+"";
                                List<String> endChars= Arrays.asList(";","；","。",".");
                                if (endChars.contains(lastChar)){
                                    line2=line2.substring(0,line.length()-1);
                                }
                                line2=line2+"。";

                                text2[0] = text2[0] + index[0] + "、" + line2 + "\n";
                            }
                        }
                    }
                });

        L.debug(text2[0]);
        IoUtil.write(new FileOutputStream(path2), StandardCharsets.UTF_8, true, text2[0]);
    }

}




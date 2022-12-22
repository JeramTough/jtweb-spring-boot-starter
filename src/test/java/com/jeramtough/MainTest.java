package com.jeramtough;

import cn.hutool.core.io.IoUtil;
import com.jeramtough.jtlog.facade.L;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 * <pre>
 * Created on 2022/12/13 上午10:03
 * by @author WeiBoWen
 * </pre>
 */
public class MainTest {

    @Test
    public void test2() throws FileNotFoundException {
        File file = new File("/home/jeramtough/Temp/temp.txt");
        ArrayList<String> lines = IoUtil.readLines(new FileInputStream(file),
                StandardCharsets.UTF_8,
                new ArrayList<>());
        String template = "update CMS.static_template set content = replace(content,'%s','#') " +
                "where 1 = 1;\n";
        StringBuilder stringBuffer = new StringBuilder();
        for (String line : lines) {
            stringBuffer.append(String.format(template, line));
        }
        L.debug(stringBuffer.toString());
        IoUtil.write(new FileOutputStream("/home/jeramtough/Temp/temp2.txt"), true,
                stringBuffer.toString().getBytes(StandardCharsets.UTF_8));
    }
}

package com.jeramtough.jtweb.component.filesaver.directory;

import cn.hutool.core.date.LocalDateTimeUtil;
import com.jeramtough.jtcomponent.io.Directory;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * <pre>
 * Created on 2021/12/3 下午2:47
 * by @author WeiBoWen
 * </pre>
 */
public class TimeFormatDirectory {

    private final String path;

    public TimeFormatDirectory(String rootPath) {
        LocalDateTime nowTime = LocalDateTime.now();
        String year = LocalDateTimeUtil.format(nowTime, "yyyy");
        String month = LocalDateTimeUtil.format(nowTime, "MM");
        String day = LocalDateTimeUtil.format(nowTime, "dd");

        path = rootPath + File.separator + year
                + File.separator + month + File.separator + day + File.separator;
    }

    public Directory get() throws IOException {
        File dir = new File(path);
        if (!dir.exists()) {
            boolean isOk = dir.mkdirs();
            if (!isOk) {
                throw new IOException("创建文件夹失败:" + dir.getAbsolutePath());
            }
        }
        return new Directory(path,true);
    }
}

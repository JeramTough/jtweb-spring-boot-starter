package com.jeramtough.jtweb.component.filereader.filter;

import cn.hutool.core.date.DateUtil;
import com.jeramtough.jtcomponent.io.Directory;
import com.jeramtough.jtlog.with.WithLogger;

import java.io.File;
import java.nio.file.NoSuchFileException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <pre>
 * Created on 2021/2/7 14:09
 * by @author WeiBoWen
 * </pre>
 */
public class DateTimeFilter implements FileFilter, WithLogger {

    private Date date;
    private final String[] timeFormats;
    private Integer offsetHour;

    public DateTimeFilter(Date date, String... timeFormats) {
        this.date = date;
        this.timeFormats = timeFormats;
    }

    public String[] getTimeFormats() {
        return timeFormats;
    }

    public Integer getOffsetHour() {
        return offsetHour;
    }

    public void setOffsetHour(Integer offsetHour) {
        this.offsetHour = offsetHour;
    }

    @Override
    public File[] filter(Directory directory) throws
            NoSuchFileException {

        if (offsetHour != null && offsetHour != 0) {
            date = DateUtil.offsetHour(date, offsetHour);
        }

        List<String> pathValueList = new ArrayList<>();
        for (String timeFormat : timeFormats) {
            pathValueList.add(DateUtil.format(date, timeFormat));
        }

        StringBuilder path = new StringBuilder(directory.getAbsolutePath());
        for (String timePath : pathValueList) {
            path.append(File.separator).append(timePath);
        }

        File file = new File(path.toString());
        if (!file.exists()) {
            throw new NoSuchFileException(file.getAbsolutePath());
        }
        return file.listFiles();
    }
}

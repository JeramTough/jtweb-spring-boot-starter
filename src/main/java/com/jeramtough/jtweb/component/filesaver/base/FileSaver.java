package com.jeramtough.jtweb.component.filesaver.base;

import com.jeramtough.jtcomponent.exception.UndoneException;
import com.jeramtough.jtlog.with.WithLogger;
import com.jeramtough.jtweb.component.filesaver.exception.IllegalFileTypeException;
import com.jeramtough.jtweb.component.filesaver.exception.MaxSizeLimitException;
import com.jeramtough.jtweb.component.filesaver.exception.SaveFileException;

import java.io.File;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * <pre>
 * Created on 2021/10/2 下午11:02
 * by @author WeiBoWen
 * </pre>
 */
public interface FileSaver<T> extends WithLogger {

    File save(T t) throws IOException, SaveFileException,
            MaxSizeLimitException,
            IllegalFileTypeException;

    File save(T t, Map<String,Object> params) throws IOException, SaveFileException,
            MaxSizeLimitException,
            IllegalFileTypeException;

    File save(T t, long delay, TimeUnit unit) throws IOException,
            SaveFileException, MaxSizeLimitException,
            IllegalFileTypeException;

    File save(T t, Map<String,Object> params,long delay, TimeUnit unit) throws IOException,
            SaveFileException, MaxSizeLimitException,
            IllegalFileTypeException;

    String getRelativePath(File productFile);

    File read(String relativePath) throws NoSuchFileException, UndoneException;

    /**
     * 当没有找到图片，并且默认图片也没有，就会抛出异常
     */
    File readAndDefault(String relativePath) throws NoSuchFileException, UndoneException;

    void delete(String relativePath) throws NoSuchFileException;


}

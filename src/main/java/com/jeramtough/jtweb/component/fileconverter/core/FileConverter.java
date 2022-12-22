package com.jeramtough.jtweb.component.fileconverter.core;

import com.jeramtough.jtweb.component.fileconverter.bean.FileType;
import com.jeramtough.jtweb.component.fileconverter.exception.FailedConvertException;
import com.jeramtough.jtweb.component.fileconverter.exception.UnsupportedConvertException;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * <pre>
 *     文件转换器
 * Created on 2021/2/24 14:40
 * by @author WeiBoWen
 * </pre>
 */
public interface FileConverter {

    /**
     * 转换成为的目标类型
     */
    FileType targetType();

    /**
     * 转换，转换在和源文件在同一件目录下，不返回null
     *
     * @param tag 根据这个标识判断是否需要重新转换，可以传比如时间标记
     *
     * @throws UnsupportedConvertException 不支持的转换类型异常
     * @throws FileNotFoundException 源文件没有发现
     * @throws FailedConvertException 转化失败异常
     */
    File convert(File beConvertedFile,String tag) throws UnsupportedConvertException, FileNotFoundException,
            FailedConvertException;
}

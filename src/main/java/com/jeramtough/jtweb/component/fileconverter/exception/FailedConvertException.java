package com.jeramtough.jtweb.component.fileconverter.exception;

import java.io.File;

/**
 * <pre>
 *     转换异常失败异常
 * Created on 2021/2/24 15:03
 * by @author WeiBoWen
 * </pre>
 */
public class FailedConvertException extends Exception {

    public FailedConvertException(File file, File targetFile, Exception e) {
        super("文件[" + file.getAbsolutePath() + "]" + "转换为[" + targetFile.getAbsolutePath() + "]失败。\n" + e.getMessage());
    }
}

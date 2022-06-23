package com.jeramtough.jtweb.component.filesaver.exception;

/**
 * <pre>
 * Created on 2021/9/15 上午9:39
 * by @author WeiBoWen
 * </pre>
 */
public class ReNameFileException extends RuntimeException {

    public ReNameFileException(String fileName) {
        super("改名文件失败:" + fileName);
    }
}

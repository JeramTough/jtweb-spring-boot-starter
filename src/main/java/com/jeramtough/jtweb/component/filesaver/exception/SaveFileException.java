package com.jeramtough.jtweb.component.filesaver.exception;

/**
 * <pre>
 * Created on 2021/9/15 上午9:39
 * by @author WeiBoWen
 * </pre>
 */
public class SaveFileException extends Exception {

    public SaveFileException(String fileName) {
        super("保存文件失败:" + fileName);
    }
}

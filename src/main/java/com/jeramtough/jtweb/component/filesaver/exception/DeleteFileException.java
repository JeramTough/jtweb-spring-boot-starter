package com.jeramtough.jtweb.component.filesaver.exception;

/**
 * <pre>
 * Created on 2021/9/15 上午9:39
 * by @author WeiBoWen
 * </pre>
 */
public class DeleteFileException extends RuntimeException {

    public DeleteFileException(String fileName) {
        super("删除文件失败:" + fileName);
    }
}

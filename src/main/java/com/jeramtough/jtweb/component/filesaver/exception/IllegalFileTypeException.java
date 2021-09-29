package com.jeramtough.jtweb.component.filesaver.exception;

/**
 * <pre>
 * Created on 2021/9/15 上午9:41
 * by @author WeiBoWen
 * </pre>
 */
public class IllegalFileTypeException extends Exception {

    public IllegalFileTypeException(String fileName) {
        super("上传图片类型不合规！" + fileName);
    }
}

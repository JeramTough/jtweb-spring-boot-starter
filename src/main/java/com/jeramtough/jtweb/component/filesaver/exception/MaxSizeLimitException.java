package com.jeramtough.jtweb.component.filesaver.exception;

/**
 * <pre>
 * Created on 2021/9/15 上午9:39
 * by @author WeiBoWen
 * </pre>
 */
public class MaxSizeLimitException extends Exception {

    public MaxSizeLimitException(String fileName) {
        super("文件大小操作允许上传的最大限制:" + fileName);
    }
}

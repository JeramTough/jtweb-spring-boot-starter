package com.jeramtough.jtweb.exception;

/**
 * <pre>
 * Created on 2020/10/13 0:34
 * by @author WeiBoWen
 * </pre>
 */
public class CodeNotRegiserException extends IllegalStateException {

    public CodeNotRegiserException(int code) {
        super("错误码["+code+"]未在Swagger注册过！");
    }
}

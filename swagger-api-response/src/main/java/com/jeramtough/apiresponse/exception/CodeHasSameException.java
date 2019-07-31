package com.jeramtough.apiresponse.exception;

/**
 * Created on 2019/7/31 15:05
 * by @author WeiBoWen
 */
public class CodeHasSameException extends RuntimeException {

    public CodeHasSameException(Integer code) {
        super("The code["+code+"] already exists the same");
    }
}

package com.jeramtough.jtweb.exception;

/**
 * <pre>
 * Created on 2020-08-04 01:28
 * by @author JeramTough
 * </pre>
 */
public class NotRegisteredException extends RuntimeException {

    private static final long serialVersionUID = -426163894025091626L;

    public NotRegisteredException(Integer errorCode) {
        super("This ErrorCode[" + errorCode + "] isn't registered");
    }
}

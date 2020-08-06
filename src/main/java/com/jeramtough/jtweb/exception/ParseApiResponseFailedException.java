package com.jeramtough.jtweb.exception;

/**
 * <pre>
 * Created on 2020-08-04 20:29
 * by @author JeramTough
 * </pre>
 */
public class ParseApiResponseFailedException extends RuntimeException {

    public ParseApiResponseFailedException(String fieldName) {
        super("parsing the " + fieldName + " field failed");
    }
}

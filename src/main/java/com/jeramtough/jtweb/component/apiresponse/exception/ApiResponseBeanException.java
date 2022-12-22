package com.jeramtough.jtweb.component.apiresponse.exception;

import com.jeramtough.jtweb.component.apiresponse.bean.FailureReason;

import java.io.Serializable;
import java.util.Arrays;

/**
 * <pre>
 * Created on 2020/10/13 0:27
 * by @author WeiBoWen
 * </pre>
 */
public class ApiResponseBeanException extends ApiResponseException implements Serializable {

    private String fieldName;

    public ApiResponseBeanException(FailureReason failureReason, String fieldName) {
        super(failureReason);
        this.fieldName = fieldName;
    }

    public ApiResponseBeanException(int code, String fieldName, String... placeholders) {
        super(new FailureReason(code, Arrays.asList(placeholders)));
        this.fieldName = fieldName;
    }

    public ApiResponseBeanException(String code, String fieldName, String... placeholders) {
        super(new FailureReason(Integer.parseInt(code), Arrays.asList(placeholders)));
        this.fieldName = fieldName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
}

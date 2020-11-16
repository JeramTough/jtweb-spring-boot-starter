package com.jeramtough.test;

import com.jeramtough.jtweb.component.validation.constraints.NotBlankButNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.lang.ref.PhantomReference;

/**
 * <pre>
 * Created on 2020/10/12 22:19
 * by @author WeiBoWen
 * </pre>
 */
public class MyParams {

    private String a;

    private String b;

    @NotBlankButNull(payload = {ErrorU.CODE_2.class}, isSetNullAuto = true)
    private String c;

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
}

package com.jeramtough.test;

import com.jeramtough.jtweb.component.validation.BeanValidator;
import org.junit.jupiter.api.Test;

/**
 * <pre>
 * Created on 2020/10/12 22:19
 * by @author WeiBoWen
 * </pre>
 */
public class BeanValidatorTest {

    @Test
    public void test2() {
        MyParams params = new MyParams();
        params.setA("");
        params.setC("             ");
        BeanValidator.verifyParams(params);
    }
}

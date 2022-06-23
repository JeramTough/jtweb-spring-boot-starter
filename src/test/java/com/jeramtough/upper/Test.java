package com.jeramtough.upper;

import com.jeramtough.jtlog.facade.L;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * <pre>
 * Created on 2021/9/30 下午2:56
 * by @author WeiBoWen
 * </pre>
 */
public class Test {

    @org.junit.Test
    public void test1(){
        String a=" provincial,\n" +
                "    city,\n" +
                "    county,\n" +
                "    school,\n" +
                "    classNumber";

        L.debug(a.toUpperCase());

    }

    @org.junit.Test
    public void test2(){
        Class clazz=TestBean.class;
        try {
            Constructor constructor=clazz.getConstructor();
            Object o=constructor.newInstance();
            L.arrive();
        }
        catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        catch (InstantiationException e) {
            e.printStackTrace();
        }
        catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

}

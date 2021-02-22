package com.jeramtough.jtweb.component.apiresponse.error;

/**
 * <pre>
 * Created on 2020/6/10 22:49
 * by @author JeramTough
 * </pre>
 */
public enum ErrorCode {

    /**
     * 代表一切OK
     */
    SUCCESS(0),

    /**
     * 一级错误宏观码
     * 代表错误来源于当前系统，往往是业务逻辑出错，或程序健壮性差等问题；
     */
    S(10000),

    /**
     * 一级错误宏观码
     * 代表用户的错误行为
     */
    U(20000),

    /**
     * 一级错误宏观码
     * 代表错误来源于第三方服务
     */
    T(30000);

    private int prefix;

    ErrorCode(int prefix) {
        this.prefix = prefix;
    }

    public int get() {
        return prefix;
    }

    public int number() {
        return prefix;
    }

}

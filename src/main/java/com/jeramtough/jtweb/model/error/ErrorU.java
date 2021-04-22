package com.jeramtough.jtweb.model.error;

import javax.validation.Payload;

/**
 * <pre>
 * api接口错误响应码配置类
 * 用户行为错误响应码前缀
 * 前缀必须符合{@link ErrorCodePrefix}要求
 * </pre>
 *
 * <pre>
 * Created on 2020/6/11 2:19
 * by @author JeramTough
 * </pre>
 */
public class ErrorU {

    //上边为公用错误码

    public static final class CODE_1 implements Payload {
        public static final int C = 20001;
        public static final String M = "【系统公共错误码】[%t]传参异常! 参数不能为空null";
    }

    public static final class CODE_2 implements Payload {
        public static final int C = 20002;
        public static final String M = "【系统公共错误码】[%t]传参异常! 参数不能为空白字符串‘’";
    }

    public static final class CODE_3 implements Payload {
        public static final int C = 20003;
        public static final String M = "【系统公共错误码】[%t]传参异常! 参数不能为空null或者空白字符串‘’";
    }

    /**
     * 手机、邮箱等格式
     */
    public static final class CODE_4 implements Payload {
        public static final int C = 20004;
        public static final String M = "【系统公共错误码】[%t]传参格式不正确! 应为[%s]";
    }

    public static final class CODE_5 implements Payload {
        public static final int C = 20005;
        public static final String M = "【系统公共错误码】token头不存在或者格式不正确";
    }

    public static final class CODE_6 implements Payload {
        public static final int C = 20006;
        public static final String M = "【系统公共错误码】token验证失败！[%s]";
    }

    public static final class CODE_7 implements Payload {
        public static final int C = 20007;
        public static final String M = "【系统公共错误码】[%t]传参范围错误，应为[%s]！";
    }

    /**
     * 类似于密码规则违背，验证码1-6未数字规则违背
     */
    public static final class CODE_8 implements Payload {
        public static final int C = 20008;
        public static final String M = "【系统公共错误码】[%t]传参违背规则，应为[%s]！";
    }

    public static final class CODE_9 implements Payload {
        public static final int C = 20009;
        public static final String M = "【系统公共错误码】执行失败，用户请求的 [%s]目标资源不存在！";
    }

    public static final class CODE_10 implements Payload {
        public static final int C = 20010;
        public static final String M = "【系统公共错误码】执行失败，用户请求的[%t]对应的[%s]目标资源不存在！";
    }

    public static final class CODE_11 implements Payload {
        public static final int C = 20011;
        public static final String M = "【系统公共错误码】执行失败，该 [%s]目标资源以存在，请换一个！";
    }

    public static final class CODE_12 implements Payload {
        public static final int C = 20012;
        public static final String M = "【系统公共错误码】执行失败，用户请求[%t]对应的[%s]目标资源以存在，请换一个！";
    }

    public static final class CODE_13 implements Payload {
        public static final int C = 20013;
        public static final String M = "【系统公共错误码】执行失败，系统不存在该id对应的用户！";
    }

    //****************************************************

}

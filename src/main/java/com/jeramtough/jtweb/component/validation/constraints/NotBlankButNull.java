package com.jeramtough.jtweb.component.validation.constraints;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <pre>
 *     允许为空，但是不能为全是空白字符
 *
 * Created on 2020/10/13 1:05
 * by @author WeiBoWen
 * </pre>
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NotBlankButNullConstraintValidator.class)
public @interface NotBlankButNull {

    String message() default "允许为空，但是不能为全是空白字符";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    /**
     * 当字段为空白字符时，自动设置为null
     */
    boolean isSetNullAuto() default false;

}

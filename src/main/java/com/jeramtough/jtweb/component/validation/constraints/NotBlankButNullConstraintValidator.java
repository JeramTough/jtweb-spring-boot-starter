package com.jeramtough.jtweb.component.validation.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <pre>
 * Created on 2020/10/13 1:07
 * by @author WeiBoWen
 * </pre>
 */
public class NotBlankButNullConstraintValidator implements ConstraintValidator<NotBlankButNull, String> {

    private final Pattern pattern = Pattern.compile("^[\\s]*$");


    @Override
    public boolean isValid(String field, ConstraintValidatorContext constraintValidatorContext) {
        if (field == null) {
            return true;
        }
        else {
            Matcher matcher = pattern.matcher(field);
            return !matcher.find();
        }
    }
}

package com.jeramtough.jtweb.component.apiresponse;

import com.alibaba.fastjson.JSON;
import com.jeramtough.jtweb.component.apiresponse.bean.FailureReason;
import com.jeramtough.jtweb.component.apiresponse.exception.ApiResponseException;
import com.jeramtough.jtweb.exception.ParseApiResponseFailedException;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * Created on 2019/7/31 14:55
 * by @author WeiBoWen
 */
public class BeanValidator {

    public static void verifyDto(Object checkedDTO) {
        //表单数据合法性校验
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Object>> constraintViolations =
                validator.validate(checkedDTO);
        for (ConstraintViolation<Object> constraintViolation : constraintViolations) {
            String fieldName = constraintViolation.getPropertyPath().toString();
            //拿到数据校验信息
            String failedMessage = constraintViolation.getMessage();

            FailureReason failureReason;
            if (com.jeramtough.jtcomponent.utils.ValidationUtil.isNumber(failedMessage)) {
                failureReason = new FailureReason(Integer.parseInt(failedMessage),
                        Arrays.asList(fieldName));
                throw new ApiResponseException(failureReason);
            }
            else {
                try {
                    failureReason = JSON.parseObject(
                            failedMessage,
                            FailureReason.class);
                    List<String> newPlaceholders = new ArrayList<>();
                    newPlaceholders.add(fieldName);
                    if (failureReason.getPlaceholders() != null) {
                        newPlaceholders.addAll(failureReason.getPlaceholders());
                    }
                    failureReason.setPlaceholders(newPlaceholders);
                }
                catch (Exception e) {
                    throw new ParseApiResponseFailedException(fieldName);
                }

                throw new ApiResponseException(failureReason);
            }
        }
    }


    public static void verifyDtoList(List<?> checkedDTOList) {
        for (int i = 0; i < checkedDTOList.size(); i++) {
            verifyDto(checkedDTOList.get(i));
        }
    }

}

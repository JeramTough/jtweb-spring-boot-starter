package com.jeramtough.jtweb.component.apiresponse;

import com.alibaba.fastjson.JSON;
import com.jeramtough.jtweb.component.apiresponse.bean.FailureReason;
import com.jeramtough.jtweb.component.apiresponse.exception.ApiResponseException;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
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
            //拿到数据校验信息
            String failedMessage = constraintViolation.getMessage();
            if (com.jeramtough.jtcomponent.utils.ValidationUtil.isNumber(failedMessage)) {
                throw new ApiResponseException(Integer.parseInt(failedMessage));
            }
            else {
                FailureReason failureReason = JSON.parseObject(
                        constraintViolation.getMessage(),
                        FailureReason.class);
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

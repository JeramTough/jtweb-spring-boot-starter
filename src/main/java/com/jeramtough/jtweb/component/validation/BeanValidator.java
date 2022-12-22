package com.jeramtough.jtweb.component.validation;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.jeramtough.jtweb.component.apiresponse.bean.FailureReason;
import com.jeramtough.jtweb.component.apiresponse.error.ErrorCode;
import com.jeramtough.jtweb.component.apiresponse.exception.ApiException;
import com.jeramtough.jtweb.component.apiresponse.exception.ApiResponseBeanException;
import com.jeramtough.jtweb.component.validation.constraints.NotBlankButNull;

import jakarta.validation.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created on 2019/7/31 14:55
 * by @author WeiBoWen
 */
public class BeanValidator {

    public static void verifyParams(Object checkedObject) {
        //表单数据合法性校验
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Object>> constraintViolations =
                validator.validate(checkedObject);
        for (ConstraintViolation<Object> constraintViolation : constraintViolations) {
            //被检验的参数
            String fieldName = constraintViolation.getPropertyPath().toString();

            //拿到数据校验信息
            String failedMessage = constraintViolation.getMessage();
            //拿到校验的注释
            Annotation validatorAnnotation = constraintViolation.getConstraintDescriptor().getAnnotation();

            //是否自动设置为null
            if (validatorAnnotation instanceof NotBlankButNull) {
                NotBlankButNull notBlankButNull = (NotBlankButNull) validatorAnnotation;
                if (notBlankButNull.isSetNullAuto()) {
                    Field field = null;
                    Class<?> superclass;

                    //循环遍历父类里的成员变量
                    superclass = checkedObject.getClass();
                    while (superclass != null) {
                        try {
                            Class<?> checkClass = superclass;
                            superclass = checkClass.getSuperclass();
                            field = checkClass.getDeclaredField(fieldName);
                            break;
                        }
                        catch (NoSuchFieldException ignored) {
                        }
                    }

                    if (field != null) {
                        field.setAccessible(true);
                        try {
                            field.set(checkedObject, null);
                        }
                        catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                        continue;
                    }
                }
            }

            Class<? extends Payload> codeClass = null;
            //拿到ErrorU.Code的信息
            for (Class<? extends Payload> clazz : constraintViolation.getConstraintDescriptor().getPayload()) {
                try {
                    if (clazz.getField("C") != null) {
                        codeClass = clazz;
                    }
                }
                catch (NoSuchFieldException e) {
                }
            }

            if (codeClass == null) {
                //抛出普通的ApiException
                failedMessage = String.format("%s传参校验失败！%s", fieldName,
                        failedMessage == null ? "" : failedMessage);
                throw new ApiException(ErrorCode.U, failedMessage);
            }

            try {
                Field cField = codeClass.getField("C");
                Field mField = codeClass.getField("M");
                if (Modifier.isStatic(cField.getModifiers()) &&
                        Modifier.isStatic(mField.getModifiers())) {
                    int code = codeClass.getField("C").getInt(codeClass);
//                    String message=codeClass.getField("M").get(codeClass).toString();

                    List<String> placeholders = new ArrayList<>();
                    try {
                        JSONArray jsonArray = JSON.parseArray(failedMessage);
                        for (int i = 0; i < jsonArray.size(); i++) {
                            placeholders.add(jsonArray.getString(i));
                        }
                    }
                    catch (JSONException e) {
                        placeholders.add(failedMessage);
                    }

                    FailureReason failureReason = new FailureReason(code, placeholders);
                    throw new ApiResponseBeanException(failureReason, fieldName);
                }
                else {
                    throw new IllegalStateException("被校验的返回码Payload类的C参数和M参数必须是静态修饰符");
                }

            }
            catch (NoSuchFieldException ignored) {
            }
            catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }


    public static void verifyParamsList(List<?> checkedDTOList) {
        for (int i = 0; i < checkedDTOList.size(); i++) {
            verifyParams(checkedDTOList.get(i));
        }
    }

}

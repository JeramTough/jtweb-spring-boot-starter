package com.jeramtough.jtweb.component.validation;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.jeramtough.jtweb.component.apiresponse.bean.FailureReason;
import com.jeramtough.jtweb.component.apiresponse.exception.ApiResponseBeanException;
import com.jeramtough.jtweb.component.validation.constraints.NotBlankButNull;
import org.apache.commons.lang3.ClassUtils;

import javax.validation.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
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
            Annotation validatorAnnotation=constraintViolation.getConstraintDescriptor().getAnnotation();

            //是否自动设置为null
            if (validatorAnnotation instanceof NotBlankButNull){
                NotBlankButNull notBlankButNull= (NotBlankButNull) validatorAnnotation;
                if (notBlankButNull.isSetNullAuto()){
                    try {
                        Field field= checkedObject.getClass().getDeclaredField(fieldName);
                        field.setAccessible(true);
                        field.set(checkedObject,null);
                        continue;
                    }
                    catch (NoSuchFieldException | IllegalAccessException e) {
                        e.printStackTrace();
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
                throw new IllegalStateException("被校验的参数没有Payload.Error.C 注释属性");
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

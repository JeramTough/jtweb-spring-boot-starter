package com.jeramtough.jtweb.component.apiresponse;

import com.jeramtough.jtlog.annotation.LogConfiguration;
import com.jeramtough.jtlog.level.LogLevel;
import com.jeramtough.jtlog.with.WithLogger;
import com.jeramtough.jtweb.model.error.ErrorCodePrefix;
import io.swagger.annotations.ApiResponses;

import javax.validation.constraints.NotNull;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created on 2019/7/29 14:52
 * by @author WeiBoWen
 */
@LogConfiguration(wrapCount = 0, minVisibleLevel = LogLevel.INFO)
public class ApiResponsesAnnotationHandler implements WithLogger {
    private static final ApiResponsesAnnotationHandler OUR_INSTANCE = new ApiResponsesAnnotationHandler();

    public static final int DEFAULT_FAILED_CODE = ErrorCodePrefix.S.get();
    public static final int DEFAULT_SUCCESSFUL_CODE = ErrorCodePrefix.SUCCESS.get();

    public static final String DEFAULT_FAILED_MESSAGE = "The System has happened unexpected " +
            "error, " +
            "please contact the administrator.\n 系统发生不可预测的错误，请联系专门的系统管理人员";

    private final Map<Integer, String> failedResponseMessageMap;

    public static ApiResponsesAnnotationHandler getInstance() {
        return OUR_INSTANCE;
    }

    private ApiResponsesAnnotationHandler() {
        failedResponseMessageMap = new HashMap<>(20);

        failedResponseMessageMap.put(DEFAULT_FAILED_CODE, DEFAULT_FAILED_MESSAGE);
    }

    public void parsingApiResponseAnnotations(Class<?> clazz) {

        if (clazz.getSuperclass() != null) {
            parsingApiResponseAnnotations(clazz.getSuperclass());
        }

        getLogger().info("Parsing the controller[" + clazz.getSimpleName() + "]");

        ApiResponses baseApiResponsesAnnotation = clazz.getAnnotation(ApiResponses.class);

        parseApiResponsesAnnotation(baseApiResponsesAnnotation);

        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            ApiResponses apiResponsesAnnotation = method.getAnnotation(ApiResponses.class);
            parseApiResponsesAnnotation(apiResponsesAnnotation);
        }

        getLogger().info("Parsing the controller[" + clazz.getSimpleName() + "] completely!");
    }

    public @NotNull String getFailedMessage(int code) {
        return Objects.requireNonNull(failedResponseMessageMap.get(code));
    }


    //*******************************

    private void parseApiResponsesAnnotation(ApiResponses apiResponsesAnnotation) {
        if (apiResponsesAnnotation != null) {
            for (io.swagger.annotations.ApiResponse apiResponseAnnotation :
                    apiResponsesAnnotation.value()) {
                this.addFailedResponse(apiResponseAnnotation.code(),
                        apiResponseAnnotation.message());

            }
        }
    }


    private void addFailedResponse(int code, String failedMessage) {
        if (!failedResponseMessageMap.containsKey(code)) {
            failedResponseMessageMap.put(code, failedMessage);
            getLogger().debug(
                    "The code【" + code + "】 map failed message[" + failedMessage + "]");
        }
    }
}

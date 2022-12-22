package com.jeramtough.jtweb.util;

import com.jeramtough.jtlog.jtlogger.Logger;
import com.jeramtough.jtlog.jtlogger.LoggerManager;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.lang.NonNull;

/**
 * <pre>
 * Created on 2022/9/22 下午5:33
 * by @author WeiBoWen
 * </pre>
 */
public class SpringIocUtil implements ApplicationContextAware {

    private static final Logger logger = LoggerManager.getLogger(SpringIocUtil.class);

    private static ApplicationContext context;

    public SpringIocUtil() {
    }

    @Override
    public void setApplicationContext(@NonNull ApplicationContext context) throws
            BeansException {
        SpringIocUtil.context = context;
    }

    public static <T> T getBean(Class<T> clazz) {
        return clazz == null ? null : context.getBean(clazz);
    }

    public static <T> T getBean(String beanId) {
        return beanId == null ? null : (T) context.getBean(beanId);
    }

    public static <T> T getBean(String beanName, Class<T> clazz) {
        if (null != beanName && !"".equals(beanName.trim())) {
            return clazz == null ? null : context.getBean(beanName, clazz);
        }
        else {
            return null;
        }
    }

    public static ApplicationContext getContext() {
        return context == null ? null : context;
    }

    public static void publishEvent(ApplicationEvent event) {
        if (context != null) {
            try {
                context.publishEvent(event);
            }
            catch (Exception exception) {
                logger.error(exception.getMessage());
            }

        }
    }

}

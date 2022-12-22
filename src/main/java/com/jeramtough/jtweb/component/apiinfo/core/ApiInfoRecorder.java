package com.jeramtough.jtweb.component.apiinfo.core;

import cn.hutool.core.lang.Filter;
import cn.hutool.core.util.ReflectUtil;
import com.jeramtough.jtweb.component.apiinfo.annotation.RegApi;
import com.jeramtough.jtweb.component.apiinfo.bean.ApiInfo;
import com.jeramtough.jtweb.component.apiinfo.facotry.ApiInfoFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * <pre>
 * Created on 2022/12/22 上午9:26
 * by @author WeiBoWen
 * </pre>
 */
@Component
public class ApiInfoRecorder {

    private static volatile ApiInfoRecorder apiInfoRecorder;

    private final Set<ApiInfo> apiInfos = new HashSet<>();


    public static ApiInfoRecorder getInstance() {
        if (apiInfoRecorder == null) {
            synchronized (ApiInfoRecorder.class) {
                if (apiInfoRecorder == null) {
                    apiInfoRecorder = new ApiInfoRecorder();
                }
            }
        }
        return apiInfoRecorder;
    }

    private ApiInfoRecorder() {
    }

    /* public void init() {
        Long defaultAppId = appSetting.getDefaultUserAppId();
        randlApiMapper.delete(
                new QueryWrapper<RandlApi>().lambda()
                                            .eq(RandlApi::getAppId,
                                                    defaultAppId));
    }*/

    public void registerApiInfo(Class<?> controllerClass) {
        Objects.requireNonNull(controllerClass);

        //获取需要注册系统的api方法
        Method[] methods = ReflectUtil.getMethods(controllerClass, new Filter<Method>() {
            @Override
            public boolean accept(Method method) {
                return method.getDeclaredAnnotation(RegApi.class) != null;
            }
        });


        for (Method method : methods) {
            apiInfos.add(ApiInfoFactory.getApiInfo(controllerClass, method));
        }

        if (controllerClass.getPermittedSubclasses() != null) {
            for (Class<?> permittedSubclass : controllerClass.getPermittedSubclasses()) {
                this.registerApiInfo(permittedSubclass);
            }
        }
    }


    public Set<ApiInfo> getApiInfos() {
        return apiInfos;
    }
}

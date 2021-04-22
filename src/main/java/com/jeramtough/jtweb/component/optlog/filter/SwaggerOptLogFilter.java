package com.jeramtough.jtweb.component.optlog.filter;


import com.jeramtough.jtweb.component.optlog.bean.AddHistoryParams;

/**
 * <pre>
 * Created on 2021/4/22 16:23
 * by @author WeiBoWen
 * </pre>
 */
public class SwaggerOptLogFilter implements OptLogFilter {
    @Override
    public boolean filter(AddHistoryParams params) {
        if (params.getInterfaceDetail().getLongJavaMethodName().contains("springfox.documentation" +
                ".swagger.web.ApiResourceController")) {
            return false;
        }
        return true;
    }
}

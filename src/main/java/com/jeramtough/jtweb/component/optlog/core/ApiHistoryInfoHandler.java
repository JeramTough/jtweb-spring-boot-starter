package com.jeramtough.jtweb.component.optlog.core;

import com.jeramtough.jtweb.component.optlog.bean.AddHistoryParams;
import com.jeramtough.jtweb.component.optlog.bean.InterfaceDetail;
import com.jeramtough.jtweb.component.optlog.config.OptLoggerConfig;
import com.jeramtough.jtweb.util.IpAddrUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * <pre>
 * Created on 2020/11/12 9:14
 * by @author WeiBoWen
 * </pre>
 */
@Lazy
@Component
@Scope("prototype")
public class ApiHistoryInfoHandler {

    private HttpServletRequest httpServletRequest;
    private final HttpSession httpSession;
    private final OptLoggerConfig loggerConfig;

    @Autowired
    public ApiHistoryInfoHandler(HttpSession httpSession,
                                 OptLoggerConfig loggerConfig) {
        this.httpSession = httpSession;
        this.loggerConfig = loggerConfig;
    }

    @Autowired
    public void setHttpServletRequest(HttpServletRequest httpServletRequest) {
        this.httpServletRequest = httpServletRequest;
    }


    public AddHistoryParams newAddHistoryParams(InterfaceDetail interfaceDetail, Object[] args, Object resp,
                                                boolean isCompleted) {
        return this.newAddHistoryParams(interfaceDetail, args, resp, isCompleted, null);
    }

    public AddHistoryParams newAddHistoryParams(InterfaceDetail interfaceDetail, Object[] args,
                                                Throwable throwable) {
        try {
            Exception exception = (Exception) throwable;
            return this.newAddHistoryParams(interfaceDetail, args, null, false, exception);
        }
        catch (Exception e) {
            String failMessage = throwable.getMessage();
            return this.newAddHistoryParams(interfaceDetail, args, failMessage, false, null);
        }
    }

    public AddHistoryParams newAddHistoryParams(InterfaceDetail interfaceDetail, Object[] args, Object resp,
                                                boolean isCompleted, Exception exception) {
        AddHistoryParams params = new AddHistoryParams();

        if (!interfaceDetail.getIgnoreResponse()) {
            params.setRespForObject(resp);
        }

        if (!interfaceDetail.getIgnoreArgs()) {
            params.setArgsForObject(args);
        }

        if (httpServletRequest != null) {
            try {
                String requestMethod = httpServletRequest.getMethod();
                params.setRequestMethod(requestMethod);
            }
            catch (Exception ignored) {
            }

            try {
                String requestUrl = httpServletRequest.getRequestURL().toString();
                params.setRequestUrl(requestUrl);
            }
            catch (Exception ignored) {
            }

            try {
                params.setIp(IpAddrUtil.getIpAddr(httpServletRequest));
            }
            catch (Exception ignored) {
            }
        }

        params.setIsCompleted(isCompleted);

        if (exception != null) {
            params.setIsCompleted(false);
            params.setRespForObject(null);
            params.setException(exception);
        }

        params.setExpandInfo(loggerConfig.getExpandInfo());
        params.setInterfaceDetail(interfaceDetail);
        return params;
    }

    public HttpServletRequest getHttpServletRequest() {
        return httpServletRequest;
    }

    public HttpSession getHttpSession() {
        return httpSession;
    }

    //*************************


}

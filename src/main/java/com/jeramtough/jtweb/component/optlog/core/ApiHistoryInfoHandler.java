package com.jeramtough.jtweb.component.optlog.core;

import com.jeramtough.jtcomponent.utils.DateTimeUtil;
import com.jeramtough.jtweb.util.IpAddrUtil;
import com.jeramtough.jtweb.component.optlog.bean.AddHistoryParams;
import com.jeramtough.jtweb.component.optlog.bean.InterfaceDetail;
import com.jeramtough.jtweb.component.optlog.config.OptLoggerConfig;
import org.springframework.beans.factory.annotation.Autowired;
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
@Component
@Scope("request")
public class ApiHistoryInfoHandler {

    private HttpServletRequest httpServletRequest;
    private HttpServletResponse httpServletResponse;
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

    @Autowired
    public void setHttpServletResponse(HttpServletResponse httpServletResponse) {
        this.httpServletResponse = httpServletResponse;
    }

    public AddHistoryParams newAddHistoryParams(InterfaceDetail interfaceDetail, Object[] args, Object resp,
                                                boolean isCompleted) {
        AddHistoryParams params = new AddHistoryParams();

        if (!interfaceDetail.getIgnoreResponse()) {
            params.setRespForObject(resp);
        }

        if (!interfaceDetail.getIgnoreArgs()) {
            params.setArgsForObject(args);
        }

        if (httpServletRequest != null) {
            String requestMethod = httpServletRequest.getMethod();
            params.setRequestMethod(requestMethod);

            String requestUrl = httpServletRequest.getRequestURL().toString();
            params.setRequestUrl(requestUrl);

            params.setCreateTime(DateTimeUtil.getCurrentDateTime());
            params.setIp(IpAddrUtil.getIpAddr(httpServletRequest));
            params.setUserId(loggerConfig.getUserId(httpServletRequest));
        }

        params.setIsCompleted(isCompleted);
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

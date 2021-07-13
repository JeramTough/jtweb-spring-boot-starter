package com.jeramtough.jtweb.component.optlog.filter;


import com.jeramtough.jtweb.component.optlog.bean.AddHistoryParams;

/**
 * <pre>
 * Created on 2021/4/22 16:18
 * by @author WeiBoWen
 * </pre>
 */
public interface OptLogFilter {

    boolean filter(AddHistoryParams params);

}

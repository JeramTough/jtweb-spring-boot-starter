package com.jeramtough.jtweb.component.business.extractentity;

import com.alibaba.fastjson.JSON;
import com.jeramtough.jtcomponent.task.bean.PreTaskResult;
import com.jeramtough.jtcomponent.task.bean.TaskResult;
import com.jeramtough.jtlog.with.WithLogger;

import java.io.Serializable;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * <pre>
 * Created on 2021/8/13 下午3:27
 * by @author WeiBoWen
 * </pre>
 */
public interface ExtractEntityRunner<T> {

    T getEntity() throws Throwable;
}

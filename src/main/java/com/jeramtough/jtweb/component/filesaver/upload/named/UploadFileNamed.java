package com.jeramtough.jtweb.component.filesaver.upload.named;

import java.util.Map;

/**
 * <pre>
 * Created on 2021/12/3 下午2:39
 * by @author WeiBoWen
 * </pre>
 */
public interface UploadFileNamed {

    String getBoundSymbol();

    String getPrefix();

    /**
     * 得到未确定命名后缀部分
     */
    String getUndeterminedSuffix();

    /**
     * 得到随机字符名部分
     */
    String getRandomNamePart();

    /**
     * 得到时间名部分
     */
    String getTimePart();

    /**
     * 返回完整的文件名
     * @param params
     */
    String getCompletedName(Map<String,Object> params);

}

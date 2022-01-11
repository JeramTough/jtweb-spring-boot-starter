package com.jeramtough.jtweb.component.cache.util;

import com.baomidou.mybatisplus.core.conditions.ISqlSegment;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.jeramtough.jtcomponent.utils.StringUtil;
import com.jeramtough.jtweb.component.cache.annotation.BeCached;
import org.aspectj.lang.ProceedingJoinPoint;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * Created on 2021/8/15 上午9:35
 * by @author WeiBoWen
 * </pre>
 */
public class JtCacheUtil {

    public static Long getOutTimedFromCacheObject(Object o) {
        BeCached beCachedAnnotation = o.getClass().getDeclaredAnnotation(BeCached.class);
        if (beCachedAnnotation == null) {
            return null;
        }
        else {
            long timed = beCachedAnnotation.timed();
            return timed;
        }
    }

    public static String generateKey(ProceedingJoinPoint joinPoint) {
        List<String> values = new ArrayList<>();
        for (Object arg : joinPoint.getArgs()) {
            try {
                String argStr = "";
                if (arg instanceof Wrapper) {
                    Wrapper<?> wrapper = (Wrapper<?>) arg;
                    argStr = argStr + wrapper.getTargetSql();
                    argStr = argStr + wrapper.getSqlSelect();
                    argStr = argStr + wrapper.getSqlComment();
                    argStr = argStr + wrapper.getSqlSet();
                    argStr = argStr + wrapper.getCustomSqlSegment();

                    for (ISqlSegment segment : wrapper.getExpression().getNormal()) {
                        argStr = argStr + segment.getSqlSegment();
                    }
                }
                else {
                    argStr = arg == null ? "" : arg.toString();
                }
                values.add(argStr);
            }
            catch (Exception ignored) {
            }
        }

        List<String> typeList = new ArrayList<>();
        Type[] types = joinPoint.getTarget().getClass().getGenericInterfaces();
        if (types.length > 0) {
            for (Type type : types) {
                if (type != null) {
                    typeList.add(type.toString());
                }
            }
        }

        String key =
                StringUtil.appendByComma(
                        typeList) +"_"+ joinPoint.toString() + "_(" + StringUtil.appendByComma(
                        values) + ")";
        return key;
    }

}

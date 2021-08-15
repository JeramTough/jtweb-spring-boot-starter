package com.jeramtough.jtweb.component.cache.template;

import cn.hutool.core.util.RandomUtil;
import com.jeramtough.jtweb.component.cache.annotation.BeCached;

/**
 * <pre>
 * Created on 2021/8/13 上午1:25
 * by @author WeiBoWen
 * </pre>
 */
public abstract class BaseCacheTemplate implements CacheTemplate {

    /**
     * 十分钟,过时基数
     */
    private long baseOutTimed = 1000L * 60 * 60;


    @Override
    public void setBaseOutTimed(long baseOutTimed) {
        this.baseOutTimed = baseOutTimed;
    }

    protected long getRandomTimedCount() {
        if (baseOutTimed == 0) {
            return 0;
        }
        long offsetOutTime = 0;
        try {
            offsetOutTime = baseOutTimed / 60;
            offsetOutTime = RandomUtil.randomLong(offsetOutTime,
                    offsetOutTime * 3);
        }
        catch (Exception ignored) {

        }
        long random = baseOutTimed - offsetOutTime;
        return random;
    }

    protected long getBaseTimedCount() {
        return baseOutTimed;
    }

    protected long getConfigTimedCount(Object o) {
        BeCached beCachedAnnotation = o.getClass().getDeclaredAnnotation(BeCached.class);
        if (beCachedAnnotation == null) {
            return 0;
        }
        else {
            long timed = beCachedAnnotation.timed();
            return timed;
        }
    }


}

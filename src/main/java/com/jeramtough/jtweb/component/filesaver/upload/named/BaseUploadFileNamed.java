package com.jeramtough.jtweb.component.filesaver.upload.named;

import cn.hutool.core.date.LocalDateTimeUtil;
import cn.hutool.core.util.RandomUtil;
import com.jeramtough.jtweb.component.filesaver.config.upload.UploadFileSaveConfigAdapter;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.util.Map;

/**
 * <pre>
 * Created on 2021/12/3 下午3:03
 * by @author WeiBoWen
 * </pre>
 */
public abstract class BaseUploadFileNamed implements UploadFileNamed {

    private static final String UNDETERMINED_SUFFIX = "unde";
    private static final String BOUND_SYMBOL = "_";

    private final UploadFileSaveConfigAdapter uploadFileSaveConfigAdapter;

    protected BaseUploadFileNamed(
            UploadFileSaveConfigAdapter uploadFileSaveConfigAdapter) {
        this.uploadFileSaveConfigAdapter = uploadFileSaveConfigAdapter;
    }

    @Override
    public String getBoundSymbol() {
        return BOUND_SYMBOL;
    }

    @Override
    public String getUndeterminedSuffix() {
        if (Boolean.TRUE.equals(uploadFileSaveConfigAdapter.allowRemoveUndeterminedOnScheme())) {
            return UNDETERMINED_SUFFIX;
        }
        else {
            return null;
        }
    }

    @Override
    public String getRandomNamePart() {
        return RandomUtil.randomString(3);
    }

    @Override
    public String getTimePart() {
        LocalDateTime time = LocalDateTime.now();
        String name =
                LocalDateTimeUtil.format(time,
                        "yyyyMMddHHmmss");
        return name;
    }

    @Override
    public String getCompletedName(Map<String, Object> params) {
        String name = "";
        String prefix = getPrefix();
        String randomNamePart = getRandomNamePart();
        String timePart = getTimePart();
        String undeterminedSuffix = getUndeterminedSuffix();

        if (StringUtils.hasText(prefix)) {
            name = name + prefix;
        }
        if (StringUtils.hasText(timePart)) {
            name = name + getBoundSymbol() + timePart;
        }
        if (StringUtils.hasText(randomNamePart)) {
            name = name + getBoundSymbol() + randomNamePart;
        }
        if (StringUtils.hasText(undeterminedSuffix)) {
            name = name + getBoundSymbol() + undeterminedSuffix;
        }

        return name;
    }
}

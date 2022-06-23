package com.jeramtough.jtweb.component.filesaver.config.upload.oss;

import com.jeramtough.jtweb.component.filesaver.config.upload.ImageUploadFileSaveConfigAdapter;
import com.jeramtough.jtweb.component.filesaver.config.upload.UploadFileSaveConfigAdapter;
import com.jeramtough.jtweb.component.filesaver.config.upload.oss.OssSettingAdapter;

/**
 * <pre>
 * Created on 2021/9/15 上午9:31
 * by @author WeiBoWen
 * </pre>
 */
public interface OssImageUploadFileSaveConfigAdapter extends ImageUploadFileSaveConfigAdapter {

    OssSettingAdapter getOssSetting();

}

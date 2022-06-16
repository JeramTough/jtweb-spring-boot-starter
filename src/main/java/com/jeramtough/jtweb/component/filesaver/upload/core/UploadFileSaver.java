package com.jeramtough.jtweb.component.filesaver.upload.core;

import com.jeramtough.jtweb.component.filesaver.base.FileSaver;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.NoSuchFileException;

/**
 * <pre>
 * Created on 2021/9/15 上午9:29
 * by @author WeiBoWen
 * </pre>
 */
public interface UploadFileSaver extends FileSaver<MultipartFile> {

    /**
     * 确定图片
     */
    File determined(String relativePath) throws NoSuchFileException;

}

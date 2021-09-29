package com.jeramtough.jtweb.component.filesaver.core;

import com.jeramtough.jtweb.component.filesaver.exception.IllegalFileTypeException;
import com.jeramtough.jtweb.component.filesaver.exception.MaxSizeLimitException;
import com.jeramtough.jtweb.component.filesaver.exception.SaveFileException;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.NoSuchFileException;

/**
 * <pre>
 * Created on 2021/9/15 上午9:29
 * by @author WeiBoWen
 * </pre>
 */
public interface FileSaver {

    File save(MultipartFile file) throws IOException, MaxSizeLimitException,
            IllegalFileTypeException, SaveFileException;

    String getRelativePath();

    File read(String relativePath) throws NoSuchFileException;

    String getFileContentType(File file);
}

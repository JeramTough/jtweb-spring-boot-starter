package com.jeramtough.jtweb.component.filesaver.upload.oss;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Set;

/**
 * <pre>
 * Created on 2022/3/27 上午2:52
 * by @author WeiBoWen
 * </pre>
 */
public interface OssClient {

    void open();

    void shutdown();

    void upload(File file, String relativePath);

    void download(File savedFile, String relativePath) throws FileNotFoundException;

    List<String> ls(String relativeDir);

    void delete(String relativePath);

}

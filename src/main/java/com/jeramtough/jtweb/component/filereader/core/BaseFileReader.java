package com.jeramtough.jtweb.component.filereader.core;

import cn.hutool.core.io.file.FileNameUtil;
import com.jeramtough.jtcomponent.io.Directory;
import com.jeramtough.jtweb.component.filereader.config.FileReaderConfigAdapter;
import com.jeramtough.jtweb.component.filereader.filter.FileFilter;

import java.io.File;
import java.nio.file.NoSuchFileException;

/**
 * <pre>
 * Created on 2021/9/15 上午10:00
 * by @author WeiBoWen
 * </pre>
 */
public abstract class BaseFileReader implements FileReader {

    private final FileReaderConfigAdapter configAdapter;

    protected BaseFileReader(
            FileReaderConfigAdapter configAdapter) {
        this.configAdapter = configAdapter;
    }


    @Override
    public File read(String relativePath) throws NoSuchFileException {
        String basePath = configAdapter.getBasePath();
        String path = basePath + File.separator + relativePath;
        File file = new File(path);
        if (!file.exists()) {
            throw new NoSuchFileException(path);
        }
        return file;
    }

    @Override
    public String getRelativePath(File file) {

        String basePath = new File(configAdapter.getBasePath()).getAbsolutePath();
        if (!file.getAbsolutePath().startsWith(basePath)) {
            throw new IllegalStateException(file.getAbsolutePath() + "该文件不存在基础路径之上！");
        }

        String path = file.getAbsolutePath();
        String relativePath = path.substring(basePath.length());
        relativePath = relativePath.replace("\\\\", "/");
        relativePath = relativePath.replace("\\", "/");
        return relativePath;
    }

    @Override
    public File[] read(FileFilter fileFilter) throws NoSuchFileException {
        String basePath = configAdapter.getBasePath();

        Directory directory = new Directory(basePath,true);
        //到了这里，一定是文件夹而且存在
        return fileFilter.filter(directory);
    }

    @Override
    public File readOne(FileFilter fileFilter) throws NoSuchFileException {
        return read(fileFilter)[0];
    }

    @Override
    public String getFileContentType(File file) {
        String extName = FileNameUtil.extName(file);
        if ("jpg".equals(extName)) {
            return "image/jpeg";
        }
        else if ("png".equals(extName)) {
            return "image/png";
        }
        else if ("git".equals(extName)) {
            return "image/git";
        }
        else {
            return "";
        }
    }


}

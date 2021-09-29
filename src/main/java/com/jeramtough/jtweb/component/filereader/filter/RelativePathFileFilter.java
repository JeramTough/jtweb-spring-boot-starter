package com.jeramtough.jtweb.component.filereader.filter;

import com.jeramtough.jtcomponent.io.Directory;

import java.io.File;
import java.nio.file.NoSuchFileException;

/**
 * <pre>
 * Created on 2021/9/28 下午2:57
 * by @author WeiBoWen
 * </pre>
 */
public class RelativePathFileFilter implements FileFilter {

    private final String[] relativePath;

    public RelativePathFileFilter(String[] relativePath) {
        this.relativePath = relativePath;
    }

    /**
     * 返回配置文件路径+相对路径
     * <p>
     * relativePath 相对路径
     *
     * @param directory 基础文件夹
     */
    @Override
    public File[] filter(Directory directory) throws NoSuchFileException {
        String path = directory.getAbsolutePath() + File.separator + relativePath;
        File file = new File(path);
        if (!file.exists()) {
            throw new NoSuchFileException(file.getAbsolutePath());
        }
        return new File[]{file};
    }
}

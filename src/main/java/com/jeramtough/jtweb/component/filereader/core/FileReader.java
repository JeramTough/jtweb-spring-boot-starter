package com.jeramtough.jtweb.component.filereader.core;

import com.jeramtough.jtweb.component.filereader.filter.FileFilter;

import java.io.File;
import java.nio.file.NoSuchFileException;

/**
 * <pre>
 * Created on 2021/9/15 上午9:29
 * by @author WeiBoWen
 * </pre>
 */
public interface FileReader {



    File read(String relativePath) throws NoSuchFileException;

    File[] read(FileFilter fileFilter) throws NoSuchFileException;

    File readOne(FileFilter fileFilter) throws NoSuchFileException;

    String getFileContentType(File file);
}

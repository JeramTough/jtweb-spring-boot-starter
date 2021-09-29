package com.jeramtough.jtweb.component.filereader.filter;

import com.jeramtough.jtcomponent.io.Directory;

import java.io.File;
import java.nio.file.NoSuchFileException;

/**
 * <pre>
 * Created on 2021/2/7 14:08
 * by @author WeiBoWen
 * </pre>
 */
public interface FileFilter {

    File[] filter(Directory directory) throws NoSuchFileException;

}

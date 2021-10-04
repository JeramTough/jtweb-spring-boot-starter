package com.jeramtough.jtweb.component.filereader.core;

import com.jeramtough.jtweb.component.filereader.config.FileReaderConfigAdapter;
import com.jeramtough.jtweb.component.filereader.filter.FileFilter;
import com.jeramtough.jtweb.component.filereader.image.DefaultImageManager;
import com.jeramtough.jtweb.component.filereader.image.ImageManager;

import java.io.File;
import java.nio.file.NoSuchFileException;

/**
 * <pre>
 * Created on 2021/9/28 下午2:15
 * by @author WeiBoWen
 * </pre>
 */
public class ImageFileReader extends BaseFileReader implements FileReader {

    public ImageFileReader(
            FileReaderConfigAdapter configAdapter) {
        super(configAdapter);
    }

    @Override
    public File readOne(FileFilter fileFilter) throws NoSuchFileException {
        return super.readOne(fileFilter);
    }

    public File readImage(String relativePath, int imageQuality) throws NoSuchFileException {
        File file = super.read(relativePath);
        ImageManager imageManager = new DefaultImageManager();
        return imageManager.get(file, imageQuality);
    }

    public File readImage(FileFilter fileFilter, int imageQuality) throws NoSuchFileException {
        File file = super.readOne(fileFilter);
        ImageManager imageManager = new DefaultImageManager();
        return imageManager.get(file, imageQuality);
    }
}

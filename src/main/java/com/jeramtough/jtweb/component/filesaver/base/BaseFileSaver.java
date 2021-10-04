package com.jeramtough.jtweb.component.filesaver.base;

import com.jeramtough.jtweb.component.filesaver.config.FileSaveConfigAdapter;
import com.jeramtough.jtweb.component.filesaver.exception.IllegalFileTypeException;
import com.jeramtough.jtweb.component.filesaver.exception.MaxSizeLimitException;
import com.jeramtough.jtweb.component.filesaver.exception.SaveFileException;

import java.io.File;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * <pre>
 * Created on 2021/10/2 下午11:13
 * by @author WeiBoWen
 * </pre>
 */
public abstract class BaseFileSaver<T> implements FileSaver<T> {

    private final FileSaveConfigAdapter fileSaveConfigAdapter;
    private final ScheduledExecutorService scheduledExecutorService;

    public BaseFileSaver(
            FileSaveConfigAdapter fileSaveConfigAdapter) {
        this.fileSaveConfigAdapter = fileSaveConfigAdapter;

        scheduledExecutorService = new ScheduledThreadPoolExecutor(10);
    }

    @Override
    public File save(T t, long delay, TimeUnit unit) throws IOException, SaveFileException,
            MaxSizeLimitException, IllegalFileTypeException {

        final File productFile = save(t);

        scheduledExecutorService.schedule(() -> {
            if (productFile.exists()) {
                productFile.delete();
            }
        }, delay, unit);

        return productFile;
    }

    @Override
    public String getRelativePath(File productFile) {
        String path = productFile.getAbsolutePath();
        path = path.replace(fileSaveConfigAdapter.getPath(), "");
        if (!path.startsWith(File.separator)) {
            path = File.separator + path;
        }
        return path;
    }

    @Override
    public File read(String relativePath) throws NoSuchFileException {
        String path = fileSaveConfigAdapter.getPath() + File.separator + relativePath;
        File file = new File(path);
        if (!file.exists()) {
            throw new NoSuchFileException(path);
        }
        return file;
    }
}

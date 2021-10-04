package com.jeramtough.jtweb.component.filesaver.Serializable;

import com.jeramtough.jtweb.component.filesaver.base.BaseFileSaver;
import com.jeramtough.jtweb.component.filesaver.base.FileSaver;
import com.jeramtough.jtweb.component.filesaver.config.FileSaveConfigAdapter;
import com.jeramtough.jtweb.component.filesaver.exception.IllegalFileTypeException;
import com.jeramtough.jtweb.component.filesaver.exception.MaxSizeLimitException;
import com.jeramtough.jtweb.component.filesaver.exception.SaveFileException;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.NoSuchFileException;

/**
 * <pre>
 * Created on 2021/10/2 下午11:11
 * by @author WeiBoWen
 * </pre>
 */
public class SerializableFileSaver extends BaseFileSaver<Serializable>
        implements FileSaver<Serializable> {

    public SerializableFileSaver(
            FileSaveConfigAdapter fileSaveConfigAdapter) {
        super(fileSaveConfigAdapter);
    }

    @Override
    public File save(Serializable serializable) throws IOException, SaveFileException,
            MaxSizeLimitException, IllegalFileTypeException {
        return null;
    }


}

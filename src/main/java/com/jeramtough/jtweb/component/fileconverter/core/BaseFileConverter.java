package com.jeramtough.jtweb.component.fileconverter.core;

import cn.hutool.core.io.file.FileNameUtil;
import com.jeramtough.jtlog.with.WithLogger;
import com.jeramtough.jtweb.component.fileconverter.bean.FileType;
import com.jeramtough.jtweb.component.fileconverter.exception.FailedConvertException;
import com.jeramtough.jtweb.component.fileconverter.exception.UnsupportedConvertException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

/**
 * <pre>
 * Created on 2021/2/24 14:48
 * by @author WeiBoWen
 * </pre>
 */
public abstract class BaseFileConverter implements FileConverter, WithLogger {

    @Override
    public File convert(File beConvertedFile, String tag) throws UnsupportedConvertException,
            FileNotFoundException, FailedConvertException {
        if (beConvertedFile.exists()) {
            String extName = FileNameUtil.extName(beConvertedFile).toLowerCase();

            boolean isSupported = Arrays.asList(supportedFileTypes())
                                        .parallelStream()
                                        .anyMatch(fileType -> fileType.getSuffixName().equals(extName));
            if (!isSupported) {
                throw new UnsupportedConvertException(
                        "不支持转换文件" + beConvertedFile.getName() + "至" + targetType().getSuffixName() + "类型");
            }

            //如果已经有缓存了，就直接拿缓存
            File targetFile = getTargetFile(beConvertedFile, tag);
            if (targetFile.exists()) {
                getLogger().debug("从缓存中读取 [%s]",targetFile.getAbsolutePath());
                return targetFile;
            }
            else {
                return convert(beConvertedFile, targetFile);
            }


        }
        else {
            throw new FileNotFoundException(beConvertedFile.getAbsolutePath());
        }
    }

    /**
     * 文件转换器支持的转换的类型
     */
    protected abstract FileType[] supportedFileTypes();

    /**
     * 子类需要实现的转换方法
     */
    protected abstract File convert(File beConvertedFile, File targetFile) throws
            FailedConvertException, UnsupportedConvertException;


    protected String getSuffixName(File file) {
        String extName = FileNameUtil.extName(file).toLowerCase();
        return extName;
    }

    protected FileType getFileType(File file) {
        String extName = FileNameUtil.extName(file).toLowerCase();
        return FileType.getBySuffixName(extName);
    }

    protected synchronized File getTargetFile(File beConvertedFile, String tag) {
        String fileName = FileNameUtil.getName(beConvertedFile);
        String path =
                beConvertedFile.getParentFile().getAbsolutePath() + File.separator + "转换格式后的产品缓存" + File.separator + fileName + "_" + tag + "."
                        + targetType().getSuffixName();
        File tempFile = new File(path);
        if (!tempFile.getParentFile().exists()) {
            tempFile.getParentFile().mkdirs();
        }
        return tempFile;
    }

}

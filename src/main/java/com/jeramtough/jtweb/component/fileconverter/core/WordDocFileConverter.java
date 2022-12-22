package com.jeramtough.jtweb.component.fileconverter.core;

import com.jeramtough.jtweb.component.fileconverter.bean.FileType;
import com.jeramtough.jtweb.component.fileconverter.exception.FailedConvertException;
import com.jeramtough.jtweb.component.fileconverter.util.HtmlConvertUtil;

import java.io.File;
import java.io.IOException;

/**
 * <pre>
 * Created on 2021/2/24 14:42
 * by @author WeiBoWen
 * </pre>
 */
public class WordDocFileConverter extends BaseFileConverter implements FileConverter {

    @Override
    public FileType targetType() {
        return FileType.DOC;
    }

    @Override
    public File convert(File beConvertedFile, File targetFile) throws FailedConvertException {

        switch (FileType.getBySuffixName(getSuffixName(beConvertedFile))) {
            case HTML:
                /*File htmlFile = beConvertedFile;
                try {
                    HtmlConvertUtil.html2wordDoc(htmlFile, targetFile);
                }
                catch (IOException e) {
                    e.printStackTrace();
                    getLogger().error("转换html文件成doc文件失败！");
                    throw new FailedConvertException(beConvertedFile, targetFile, e);
                }*/
                break;
            case PDF:
                break;
            case DOCX:
                break;
            case DOC:
                //因为目标格式相同，直接返回
                targetFile = beConvertedFile;
                break;
            default:
        }
        return targetFile;
    }

    @Override
    protected FileType[] supportedFileTypes() {
        return new FileType[]{FileType.HTML, FileType.DOC};
    }
}

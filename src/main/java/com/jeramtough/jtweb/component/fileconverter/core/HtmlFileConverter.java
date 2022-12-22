package com.jeramtough.jtweb.component.fileconverter.core;

import com.jeramtough.jtweb.component.fileconverter.aspose.PdfAspose;
import com.jeramtough.jtweb.component.fileconverter.aspose.WordsAspose;
import com.jeramtough.jtweb.component.fileconverter.bean.FileType;
import com.jeramtough.jtweb.component.fileconverter.exception.FailedConvertException;
import com.jeramtough.jtweb.component.fileconverter.util.Word2PdfAsposeUtil;

import java.io.File;

/**
 * <pre>
 * Created on 2021/2/24 14:42
 * by @author WeiBoWen
 * </pre>
 */
public class HtmlFileConverter extends BaseFileConverter implements FileConverter {

    @Override
    public FileType targetType() {
        return FileType.HTML;
    }

    @Override
    public File convert(File beConvertedFile, File targetFile) throws FailedConvertException {
        switch (FileType.getBySuffixName(getSuffixName(beConvertedFile))) {
            case HTML:
                //因为目标格式相同，直接返回
                targetFile = beConvertedFile;
                break;
            case PDF:
                try {
                    PdfAspose.getInstance().pdf2html(beConvertedFile, targetFile);
                }
                catch (Exception e) {
                    e.printStackTrace();
                    getLogger().error("转换pdf文件成html文件失败！");
                    throw new FailedConvertException(beConvertedFile, targetFile, e);
                }
                break;
            case DOCX:
            case DOC:
                try {
                    WordsAspose.getInstance().word2html(beConvertedFile, targetFile);
                }
                catch (Exception e) {
                    e.printStackTrace();
                    getLogger().error("转换doc文件成html文件失败！");
                    throw new FailedConvertException(beConvertedFile, targetFile, e);
                }
                break;
            default:
        }
        return targetFile;
    }

    @Override
    protected FileType[] supportedFileTypes() {
        return new FileType[]{FileType.HTML, FileType.PDF, FileType.DOCX, FileType.DOC};
    }
}

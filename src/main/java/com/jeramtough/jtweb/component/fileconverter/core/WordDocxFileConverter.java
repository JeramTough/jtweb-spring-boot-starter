package com.jeramtough.jtweb.component.fileconverter.core;

import com.jeramtough.jtweb.component.fileconverter.bean.FileType;
import com.jeramtough.jtweb.component.fileconverter.exception.FailedConvertException;
import com.jeramtough.jtweb.component.fileconverter.exception.UnsupportedConvertException;
import com.jeramtough.jtweb.component.fileconverter.util.HtmlConvertUtil;
import com.jeramtough.jtweb.component.fileconverter.util.Word2PdfAsposeUtil;

import java.io.File;
import java.io.IOException;

/**
 * <pre>
 * Created on 2021/2/24 14:42
 * by @author WeiBoWen
 * </pre>
 */
public class WordDocxFileConverter extends BaseFileConverter implements FileConverter {

    @Override
    public FileType targetType() {
        return FileType.DOCX;
    }

    @Override
    public File convert(File beConvertedFile, File targetFile) throws FailedConvertException,
            UnsupportedConvertException {
        switch (FileType.getBySuffixName(getSuffixName(beConvertedFile))) {
            case HTML:
                File htmlFile = beConvertedFile;
                /*try {
                    HtmlConvertUtil.html2wordDocx(htmlFile, targetFile);
                }
                catch (IOException | Docx4JException e) {
                    e.printStackTrace();
                    getLogger().error("转换html文件成docx文件失败！");
                    throw new FailedConvertException(beConvertedFile, targetFile, e);
                }*/
            case PDF:
                break;
            case DOCX:
                //因为目标格式相同，直接返回
                targetFile = beConvertedFile;
                break;
            case DOC:
                try {
                    Word2PdfAsposeUtil word2PdfAsposeUtil = new Word2PdfAsposeUtil();
                    word2PdfAsposeUtil.doc2docx(beConvertedFile.getAbsolutePath(),
                            targetFile.getAbsolutePath());
                }
                catch (Exception e) {
                    e.printStackTrace();
                    getLogger().error("转换doc文件成docx文件失败！");
                    throw new FailedConvertException(beConvertedFile, targetFile, e);
                }
                break;
            default:
        }
        return targetFile;
    }

    @Override
    protected FileType[] supportedFileTypes() {
        return new FileType[]{FileType.HTML, FileType.DOCX, FileType.DOC};
    }
}

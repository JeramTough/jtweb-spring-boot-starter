package com.jeramtough.jtweb.component.fileconverter.core;

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
public class PdfFileConverter extends BaseFileConverter implements FileConverter {

    @Override
    public FileType targetType() {
        return FileType.PDF;
    }

    @Override
    public File convert(File beConvertedFile, File targetFile) throws FailedConvertException {
        switch (FileType.getBySuffixName(getSuffixName(beConvertedFile))) {
            case HTML:
               /* try {
                    HtmlConvertUtil.html2pdf2(beConvertedFile, targetFile);
                }
                catch (Exception e) {
                    e.printStackTrace();
                    getLogger().error("转换html文件成pdf文件失败！");
                    throw new FailedConvertException(beConvertedFile, targetFile, e);
                }*/
                break;
            case PDF:
                //因为目标格式相同，直接返回
                targetFile = beConvertedFile;
                break;
            case DOCX:
                /*try {
                    WordConvertUtil.word2pdf3(beConvertedFile, targetFile);
                }
                catch (Exception e) {
                    e.printStackTrace();
                    getLogger().error("转换docx文件成pdf文件失败！");
                    throw new FailedConvertException(beConvertedFile, targetFile, e);
                }*/
                break;
            case DOC:
                try {
                    Word2PdfAsposeUtil word2PdfAsposeUtil=new Word2PdfAsposeUtil();
                    word2PdfAsposeUtil.doc2pdf(beConvertedFile.getAbsolutePath(),
                            targetFile.getAbsolutePath());
                }
                catch (Exception e) {
                    e.printStackTrace();
                    getLogger().error("转换doc文件成pdf文件失败！");
                    throw new FailedConvertException(beConvertedFile, targetFile, e);
                }
                break;
            default:
        }
        return targetFile;
    }

    @Override
    protected FileType[] supportedFileTypes() {
        return new FileType[]{FileType.PDF, FileType.DOCX, FileType.DOC};
    }
}

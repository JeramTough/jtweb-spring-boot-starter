package com.jeramtough.jtweb.component.fileconverter.core;

import com.jeramtough.jtweb.component.fileconverter.bean.FileType;

import java.util.Objects;

/**
 * <pre>
 * Created on 2021/2/24 16:39
 * by @author WeiBoWen
 * </pre>
 */
public class FileConverterFactory {

    private static final WordDocFileConverter WORD_DOC_FILE_CONVERTER;
    private static final WordDocxFileConverter WORD_DOCX_FILE_CONVERTER;
    private static final PdfFileConverter PDF_FILE_CONVERTER;
    private static final HtmlFileConverter HTML_FILE_CONVERTER;

    static {
        WORD_DOC_FILE_CONVERTER = new WordDocFileConverter();
        WORD_DOCX_FILE_CONVERTER = new WordDocxFileConverter();
        PDF_FILE_CONVERTER = new PdfFileConverter();
        HTML_FILE_CONVERTER = new HtmlFileConverter();
    }


    public static FileConverter getFileConverter(FileType targetFileType) {
        FileConverter fileConverter = null;
        switch (targetFileType) {
            case DOC:
                fileConverter = WORD_DOC_FILE_CONVERTER;
                break;
            case DOCX:
                fileConverter = WORD_DOCX_FILE_CONVERTER;
                break;
            case PDF:
                fileConverter = PDF_FILE_CONVERTER;
                break;
            case HTML:
                fileConverter = HTML_FILE_CONVERTER;
                break;
            default:
        }
        Objects.requireNonNull(fileConverter);
        return fileConverter;

    }

}

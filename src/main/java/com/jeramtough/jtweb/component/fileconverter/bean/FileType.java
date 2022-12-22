package com.jeramtough.jtweb.component.fileconverter.bean;

import java.util.Objects;

/**
 * <pre>
 * Created on 2021/2/24 14:51
 * by @author WeiBoWen
 * </pre>
 */
public enum FileType {

    /**
     * doc
     */
    DOC("doc"),

    /**
     * docx
     */
    DOCX("docx"),
    /**
     * pdf
     */
    PDF("pdf"),
    /**
     * html
     */
    HTML("html"),
    ;


    private final String suffixName;


    public String getSuffixName() {
        return suffixName;
    }

    FileType(String suffixName) {
        this.suffixName = suffixName;
    }

    public static FileType getBySuffixName(String suffixName) {
        FileType fileType = null;
        for (FileType value : values()) {
            if (value.getSuffixName().equals(suffixName)) {
                fileType = value;
            }
        }
        Objects.requireNonNull(fileType);
        return fileType;
    }


}

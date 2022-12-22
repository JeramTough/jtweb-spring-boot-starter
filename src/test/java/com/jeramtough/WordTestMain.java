package com.jeramtough;

import cn.hutool.core.io.IoUtil;
import cn.hutool.core.io.LineHandler;
import com.jeramtough.jtcomponent.utils.Base64Util;
import com.jeramtough.jtlog.facade.L;
import com.jeramtough.jtweb.component.fileconverter.aspose.PdfAspose;
import com.jeramtough.jtweb.component.fileconverter.aspose.WordsAspose;
import com.jeramtough.jtweb.component.fileconverter.bean.FileType;
import com.jeramtough.jtweb.component.fileconverter.core.FileConverter;
import com.jeramtough.jtweb.component.fileconverter.core.FileConverterFactory;
import com.jeramtough.jtweb.component.fileconverter.exception.FailedConvertException;
import com.jeramtough.jtweb.component.fileconverter.exception.UnsupportedConvertException;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

/**
 * <pre>
 * Created on 2022/9/15 下午10:13
 * by @author WeiBoWen
 * </pre>
 */
public class WordTestMain {
    public static void main(String[] args) {

        FileConverter fileConverter = FileConverterFactory.getFileConverter(FileType.HTML);

        try {
            File outFile = fileConverter.convert(new File("/home/jeramtough/Temp/abc" +
                    "/20220614093106990.pdf"), System.currentTimeMillis() + "");

       /*  File outFile = fileConverter.convert(new File("/home/jeramtough/Temp/abc" +
                    "/20220819050826325.doc"),System.currentTimeMillis()+"");*/
        }
        catch (UnsupportedConvertException | FileNotFoundException |
               FailedConvertException e) {
            throw new RuntimeException(e);
        }
    }


    @Test
    public void test1() {
        WordsAspose wordsAspose = WordsAspose.getInstance();
        try {
            wordsAspose.word2png(new File("/home/jeramtough/Temp/abc" +
                    "/DOCUMENT.doc"), new File("/home/jeramtough/Temp/abc" +
                    "/20220819050826325.png"));
            pngToHtml(new File("/home/jeramtough/Temp/abc" +
                    "/20220819050826325.png"));
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    protected String pngToHtml(File pngFile) throws IOException {
        String imghead = "data:image/jpeg;base64,";
        String base64Str =
                imghead + Base64Util.toBase64Str(
                        IoUtil.readBytes(Files.newInputStream(pngFile.toPath())));
        String htmlStr = "<img src=\"xxx\" width=\"100%\">";
        htmlStr = htmlStr.replace("xxx", base64Str);

        return htmlStr;
    }

    @Test
    public void test2() {
        PdfAspose wordsAspose = PdfAspose.getInstance();
        try {
            wordsAspose.pdf2png(new File("/home/jeramtough/Temp/abc" +
                    "/20220614093106990.pdf"), new File("/home/jeramtough/Temp/abc" +
                    "/20220614093106990.png"));
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test3() {
        WordsAspose wordsAspose = WordsAspose.getInstance();
        try {
            wordsAspose.word2html("/home/jeramtough/Temp/W020221101536659619674.docx",
                    "/home/jeramtough/Temp/a.html", true);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test4() throws FileNotFoundException {
        File file = new File("/home/jeramtough/文档/Mine/Work/KPRXKJ/heilongjiang/lanmu.txt");

        final String[] text = {""};
        IoUtil.readLines(new FileInputStream(file), StandardCharsets.UTF_8, new LineHandler() {
            @Override
            public void handle(String line) {
                String a[] = line.split(",");
                text[0] = text[0] + a[0] + "," + a[1] + "," + a[2]+","+a[3]+"\n";
            }
        });
        L.debug(text[0]);
        IoUtil.write(new FileOutputStream("/home/jeramtough/文档/Mine/Work/KPRXKJ/heilongjiang" +
                "/lanmu2.txt"),true,text[0].getBytes(StandardCharsets.UTF_8));
    }
}

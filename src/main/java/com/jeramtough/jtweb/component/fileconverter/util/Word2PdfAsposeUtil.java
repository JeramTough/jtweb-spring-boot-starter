package com.jeramtough.jtweb.component.fileconverter.util;

import com.aspose.words.Document;
import com.aspose.words.HtmlSaveOptions;
import com.aspose.words.License;
import com.aspose.words.SaveFormat;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public class Word2PdfAsposeUtil {

    public boolean getLicense() {
        boolean result = false;
        try {
            String license = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?> \n" +
                    "<License>\n" +
                    "  <Data>\n" +
                    "    <Products>\n" +
                    "      <Product>Aspose.Total for Java</Product>\n" +
                    "      <Product>Aspose.Words for Java</Product>\n" +
                    "    </Products>\n" +
                    "    <EditionType>Enterprise</EditionType>\n" +
                    "    <SubscriptionExpiry>20991231</SubscriptionExpiry>\n" +
                    "    <LicenseExpiry>20991231</LicenseExpiry>\n" +
                    "    <SerialNumber>8bfe198c-7f0c-4ef8-8ff0-acc3237bf0d7</SerialNumber>\n" +
                    "  </Data>\n" +
                    "  <Signature>sNLLKGMUdF0r8O1kKilWAGdgfs2BvJb/2Xp8p5iuDVfZXmhppo+d0Ran1P9TKdjV4ABwAgKXxJ3jcQTqE/2IRfqwnPf8itN8aFZlV3TJPYeD3yWE7IT55Gz6EijUpC7aKeoohTb4w2fpox58wWoF3SNp6sK6jDfiAUGEHYJ9pjU=</Signature>\n" +
                    "</License>";
            InputStream is = new ByteArrayInputStream(license.getBytes("UTF-8"));
            License aposeLic = new License();
            aposeLic.setLicense(is);
            result = true;
            if (is != null) {
                is.close();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public void doc2pdf(String inPath, String outPath) throws Exception {
        if (!getLicense()) { // 验证License 若不验证则转化出的pdf文档会有水印产生
            throw new IllegalStateException();
        }
        System.out.println("开始转化PDF：" + inPath);
        long old = System.currentTimeMillis();
        File file = new File(outPath); // 新建一个空白pdf文档
        FileOutputStream os = new FileOutputStream(file);
        Document doc = new Document(inPath); // Address是将要被转化的word文档
        //FontSettings.setFontsFolder();
        doc.save(os, SaveFormat.PDF);// 全面支持DOC, DOCX, OOXML, RTF HTML, OpenDocument, PDF,
        // EPUB, XPS, SWF 相互转换
        os.flush();
        os.close();
        long now = System.currentTimeMillis();
        System.out.println("共耗时：" + ((now - old) / 1000.0) + "秒"); // 转化用时
    }

    public void doc2docx(String inPath, String outPath) throws Exception {
        if (!getLicense()) { // 验证License 若不验证则转化出的pdf文档会有水印产生
            throw new IllegalStateException();
        }
        System.out.println("开始转化DOC：" + inPath);
        long old = System.currentTimeMillis();
        File file = new File(outPath); // 新建一个空白pdf文档
        FileOutputStream os = new FileOutputStream(file);
        Document doc = new Document(inPath); // Address是将要被转化的word文档
        //FontSettings.setFontsFolder();
        doc.save(os, SaveFormat.DOCX);// 全面支持DOC, DOCX, OOXML, RTF HTML, OpenDocument, PDF,
        // EPUB, XPS, SWF 相互转换
        os.flush();
        os.close();
        long now = System.currentTimeMillis();
        System.out.println("共耗时：" + ((now - old) / 1000.0) + "秒"); // 转化用时
    }

    public boolean doc2png(String inPath, String outPath) {
        boolean license = getLicense();
        if (!license) { // 验证License 若不验证则转化出的pdf文档会有水印产生
            System.out.println("flase_license:" + license);
            return false;
        }
        try {
            System.out.println("kais");
            long old = System.currentTimeMillis();
            File file = new File(outPath); // 新建一个空白pdf文档
            FileOutputStream os = new FileOutputStream(file);
            Document doc = new Document(inPath); // Address是将要被转化的word文档
            doc.save(os, SaveFormat.PNG);// 全面支持DOC, DOCX, OOXML, RTF HTML, OpenDocument, PDF,
            os.flush();
            os.close();
            // EPUB, XPS, SWF 相互转换  
            long now = System.currentTimeMillis();
            System.out.println("共耗时：" + ((now - old) / 1000.0) + "秒"); // 转化用时
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public void word2html(File docFile, File htmlFile) throws Exception {
        if (!getLicense()) { // 验证License 若不验证则转化出的pdf文档会有水印产生
            throw new IllegalStateException();
        }
        System.out.println("开始转化DOC：" + docFile.getAbsolutePath());
        long old = System.currentTimeMillis();

        Document doc = new Document(docFile.getAbsolutePath());
        HtmlSaveOptions opts = new HtmlSaveOptions(SaveFormat.HTML);
//        opts.setHtmlVersion(HtmlVersion.HTML_5);
        opts.setExportImagesAsBase64(true);
//        opts.setExportPageMargins(true);
        doc.save(htmlFile.getAbsolutePath(), opts);
        long now = System.currentTimeMillis();
        System.out.println("共耗时：" + ((now - old) / 1000.0) + "秒"); // 转化用时
    }

    public static void main(String[] arg) {

       /*Word2PdfAsposeUtil ww = new Word2PdfAsposeUtil();
       ww.doc2pdf("C:\\Users\\Administrator\\Desktop\\bs\\mm.docx","C:\\Users\\Administrator\\Desktop\\bs\\mm.pdf");*/

    }
}

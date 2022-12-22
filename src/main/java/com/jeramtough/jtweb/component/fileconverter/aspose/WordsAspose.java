package com.jeramtough.jtweb.component.fileconverter.aspose;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;
import com.aspose.words.*;
import com.jeramtough.jtlog.with.WithLogger;
import com.jeramtough.jtweb.component.fileconverter.util.ImageUtil;
import org.jsoup.Jsoup;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * Created on 2022/9/16 上午12:06
 * by @author WeiBoWen
 * </pre>
 */
public class WordsAspose extends BaseAspose implements WithLogger {

    private static volatile WordsAspose wordsAspose;

    private WordsAspose() {
        try {
            registerWord_v_22_5();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static WordsAspose getInstance() {
        if (wordsAspose == null) {
            synchronized (WordsAspose.class) {
                if (wordsAspose == null) {
                    wordsAspose = new WordsAspose();
                }
            }
        }
        return wordsAspose;
    }

    public void word2pdf(File wordFile, File pdfFile) {

    }

    public void word2html(File wordFile, File htmlFile) throws Exception {

        long old = System.currentTimeMillis();
        getLogger().debug("开始转化word为html：" + wordFile.getAbsolutePath());

        Document doc = new Document(wordFile.getAbsolutePath());
        HtmlSaveOptions opts = new HtmlSaveOptions(SaveFormat.HTML);
        opts.setHtmlVersion(HtmlVersion.HTML_5);
        opts.setExportImagesAsBase64(true);
        opts.setExportPageMargins(true);
        doc.save(htmlFile.getAbsolutePath(), opts);

        long now = System.currentTimeMillis();
        getLogger().debug("共耗时：" + ((now - old) / 1000.0) + "秒");

    }

    public void word2html(String wordFile, String htmlFile, boolean tryFixStyle) throws
            Exception {
        Document doc = new Document(wordFile);
        HtmlSaveOptions opts = new HtmlSaveOptions(50);
        opts.setHtmlVersion(1);
        opts.setExportImagesAsBase64(true);
        opts.setExportPageMargins(true);
        opts.setExportPageSetup(true);
        opts.setProgressCallback(new IDocumentSavingCallback() {
            @Override
            public void notify(DocumentSavingArgs documentSavingArgs) {
            }
        });

        doc.save(htmlFile, opts);
        if (tryFixStyle) {
            String[] errorStyle = new String[]{"position:absolute"};
            File file = FileUtil.file(htmlFile);
            org.jsoup.nodes.Document document = Jsoup.parse(
                    FileUtil.readString(file, StandardCharsets.UTF_8));
            document.select("img").forEach((img) -> {
                String style = img.attr("style");
                String[] var3 = errorStyle;
                int var4 = errorStyle.length;

                for (int var5 = 0; var5 < var4; ++var5) {
                    String es = var3[var5];
                    style = StrUtil.removeAll(style, es);
                }

                img.attr("style", style);
            });
            FileUtil.writeUtf8String(document.html(), file);
        }

    }

    public void word2png(File wordFile, File pngFile) throws Exception {
        long old = System.currentTimeMillis();
        getLogger().debug("开始转化word为png：" + wordFile.getAbsolutePath());

        Document doc = new Document(wordFile.getAbsolutePath());

        //写入图片到流缓存
        List<BufferedImage> imageList = new ArrayList<>();
        for (int i = 0; i < doc.getPageCount(); i++) {
            Document document = doc.extractPages(i, 1);
            ByteArrayOutputStream bas = new ByteArrayOutputStream();
            ImageSaveOptions imageSaveOptions = new ImageSaveOptions(SaveFormat.PNG);
            document.save(bas, imageSaveOptions);
            ByteArrayInputStream byteArrayInputStream =
                    new ByteArrayInputStream(bas.toByteArray());
            bas.close();
            ImageInputStream imageInputStream = ImageIO.createImageInputStream(
                    byteArrayInputStream);
            byteArrayInputStream.close();
            imageList.add(ImageIO.read(imageInputStream));
        }
        BufferedImage mergeImage = ImageUtil.mergeImage(false, imageList);
        FileOutputStream fileOutputStream = new FileOutputStream(pngFile);
        ImageIO.write(mergeImage, "png", fileOutputStream);
        fileOutputStream.close();

        long now = System.currentTimeMillis();
        getLogger().debug("共耗时：" + ((now - old) / 1000.0) + "秒");
    }


    //

}

package com.jeramtough.jtweb.component.fileconverter.aspose;

import com.aspose.pdf.*;
import com.aspose.pdf.devices.JpegDevice;
import com.aspose.pdf.devices.PngDevice;
import com.aspose.pdf.devices.Resolution;
import com.jeramtough.jtlog.with.WithLogger;
import com.jeramtough.jtweb.component.fileconverter.util.ImageUtil;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * Created on 2022/9/16 上午12:06
 * by @author WeiBoWen
 * </pre>
 */
public class PdfAspose extends BaseAspose implements WithLogger {

    private static volatile PdfAspose pdfAspose;

    private PdfAspose() {
        try {
            registerPdf_v_21_7();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static PdfAspose getInstance() {
        if (pdfAspose == null) {
            synchronized (PdfAspose.class) {
                if (pdfAspose == null) {
                    pdfAspose = new PdfAspose();
                }
            }
        }
        return pdfAspose;
    }

    public void pdf2html(File pdfFile, File htmlFile) throws Exception {
        long old = System.currentTimeMillis();
        getLogger().debug("开始转化pdf为html：" + pdfFile.getAbsolutePath());

        Document doc = new Document(pdfFile.getAbsolutePath());
        HtmlSaveOptions htmlOptions = new HtmlSaveOptions();
        // Specify to split the output into multiple pages
        htmlOptions.setSplitIntoPages(false);
        htmlOptions.setRenderTextAsImage(true);
        htmlOptions.setSplitCssIntoPages(false);

        doc.save(htmlFile.getAbsolutePath(), htmlOptions);

        long now = System.currentTimeMillis();
        getLogger().debug("共耗时：" + ((now - old) / 1000.0) + "秒");
    }

    public void pdf2png(File pdfFile, File pngFile) throws IOException {
        long old = System.currentTimeMillis();
        getLogger().debug("开始转化pdf为png：" + pdfFile.getAbsolutePath());

        // Open document
        String pdfDocumentFileName = pdfFile.getAbsolutePath();
        Document pdfDocument = new Document(pdfDocumentFileName);

        // Create Resolution object
        Resolution resolution = new Resolution(300);
        PngDevice pngDevice = new PngDevice(resolution);

        //写入图片到流缓存
        List<BufferedImage> imageList = new ArrayList<>();
        for (Page page : pdfDocument.getPages()) {
            ByteArrayOutputStream bas = new ByteArrayOutputStream();
            pngDevice.process(page, bas);
            ByteArrayInputStream byteArrayInputStream =
                    new ByteArrayInputStream(bas.toByteArray());
            ImageInputStream imageInputStream = ImageIO.createImageInputStream(
                    byteArrayInputStream);
            imageList.add(ImageIO.read(imageInputStream));
        }

        BufferedImage mergeImage = ImageUtil.mergeImage(false, imageList);
        FileOutputStream fileOutputStream = new FileOutputStream(pngFile);
        ImageIO.write(mergeImage, "png", fileOutputStream);


        long now = System.currentTimeMillis();
        getLogger().debug("共耗时：" + ((now - old) / 1000.0) + "秒");
    }

}

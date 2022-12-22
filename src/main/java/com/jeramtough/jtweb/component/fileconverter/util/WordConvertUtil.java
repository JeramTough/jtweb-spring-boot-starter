package com.jeramtough.jtweb.component.fileconverter.util;

/**
 * <pre>
 * Created on 2021/2/24 15:26
 * by @author WeiBoWen
 * </pre>
 */
public class WordConvertUtil {


    /*public static void word2pdf(File wordFile, File pdfFile) throws Exception {
        // 1) Load DOCX into XWPFDocument
        InputStream in = new FileInputStream(wordFile);
        XWPFDocument document = new XWPFDocument(in);

        // 2) Prepare Pdf options
        PdfOptions options = PdfOptions.create().fontEncoding("UTF-8");

        // 3) Convert XWPFDocument to Pdf
        OutputStream out = new FileOutputStream(pdfFile);
        PdfConverter.getInstance().convert(document, out, options);
    }

    public static void word2pdf2(File wordFile, File pdfFile) throws Exception {
        // 1) Load Docx file by filling Velocity template engine and cache
        // it to the registry
        InputStream in = new FileInputStream(wordFile);
        IXDocReport report = XDocReportRegistry.getRegistry().loadReport(
                in, TemplateEngineKind.Velocity);

        // 2) Create context Java model
        IContext context = report.createContext();
       *//* Project project = new Project("XDocReport");
        context.put("project", project);*//*

        // 3) Generate report by merging Java model with the Docx
        OutputStream out = new FileOutputStream(pdfFile);
        // report.process(context, out);
        Options options = Options.getTo(ConverterTypeTo.PDF).via(
                ConverterTypeVia.XWPF);
        report.convert(context, options, out);
    }

    public static void word2pdf3(File wordFile, File pdfFile) throws Exception {
        Word2PdfAsposeUtil word2PdfAsposeUtil = new Word2PdfAsposeUtil();
        word2PdfAsposeUtil.doc2pdf(wordFile.getAbsolutePath(), pdfFile.getAbsolutePath());
    }

    public static void word2html(File wordFile, File htmlFile) throws IOException {
        // 1) Load DOCX into XWPFDocument
        InputStream in = new FileInputStream(wordFile);
        XWPFDocument document = new XWPFDocument(in);

        // 2) Prepare XHTML options (here we set the `ImageManager` to store image and resolve iamge src)
        XHTMLOptions options = XHTMLOptions.create().setImageManager(
                new Base64EmbedImgManager());

        // 3) Convert XWPFDocument to XHTML
        OutputStream out = new FileOutputStream(htmlFile);
        XHTMLConverter.getInstance().convert(document, out, options);
    }

    public static void doc2docx(File docFile, File docxFile) throws Exception {
        Word2PdfAsposeUtil word2PdfAsposeUtil = new Word2PdfAsposeUtil();
        word2PdfAsposeUtil.doc2docx(docFile.getAbsolutePath(), docxFile.getAbsolutePath());
    }*/
}

package com.jeramtough.jtweb.component.fileconverter.util;

/**
 * <pre>
 * Created on 2021/2/24 15:26
 * by @author WeiBoWen
 * </pre>
 */
public class HtmlConvertUtil {

    /*private static WordprocessingMLPackage wordMLPackage;

    static {
        // Create an empty docx package
        try {
            wordMLPackage = WordprocessingMLPackage.createPackage();
            NumberingDefinitionsPart ndp = new NumberingDefinitionsPart();
            wordMLPackage.getMainDocumentPart().addTargetPart(ndp);
            ndp.unmarshalDefaultNumbering();
        }
        catch (InvalidFormatException | JAXBException e) {
            e.printStackTrace();
        }


    }

    *//**
     * 将HTML转成PD格式的文件。html文件的格式比较严格
     *//*
    public static void html2pdf(File htmlFile, File pdfFile) throws Exception {
        // step 1
        String htmlString = IoUtil.read(new FileInputStream(htmlFile), "UTF-8");
        //注意这里为啥要写这个，主要是替换成这样的字体，如果不设置中文有可能显示不出来。
        htmlString = htmlString.replaceAll("\"", "'").replaceAll("<style>",
                "<style>body{font-family:SimHei;font-size:14px;}")
        ;
        // step 2
        OutputStream os = new FileOutputStream(pdfFile);
        ITextRenderer renderer = new ITextRenderer();
//        renderer.setDocument(url);
        renderer.setDocumentFromString(htmlString);

        // step 3 解决中文支持
        ITextFontResolver fontResolver = renderer.getFontResolver();

        if (SystemUtil.getOsInfo().isLinux()) {
            fontResolver.addFont("/usr/share/fonts/chiness/simsun.ttc", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
        }
        else {
            fontResolver.addFont("c:/Windows/Fonts/simsun.ttc", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
            fontResolver.addFont("C:/Windows/Fonts/simhei.ttf", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
            fontResolver.addFont("C:/Windows/Fonts/simkai.ttf", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
        }

        renderer.layout();
        renderer.createPDF(os);
        os.close();
    }


    public static void html2pdf2(File htmlFile, File pdfFile) throws Exception {
        final String pdfPath = pdfFile.getAbsolutePath();
        final String htmlPath = htmlFile.getAbsolutePath();

        // step 1
        Document document = new Document();
        // step 2
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(pdfPath));
        // step 3
        document.open();
        // step 4
        XMLWorkerFontProvider fontImp = new XMLWorkerFontProvider(XMLWorkerFontProvider.DONTLOOKFORFONTS);
        if (SystemUtil.getOsInfo().isLinux()) {
            fontImp.register("/usr/share/fonts/chiness/simsun.ttc");
            fontImp.register("/usr/share/fonts/chiness/simhei.ttf");
            fontImp.register("/usr/share/fonts/chiness/simkai.ttf");
        }
        else {
            fontImp.register("c:/Windows/Fonts/simsun.ttc");
            fontImp.register("C:/Windows/Fonts/simhei.ttf");
            fontImp.register("C:/Windows/Fonts/simkai.ttf");
        }

        XMLWorkerHelper.getInstance().parseXHtml(writer, document,
                new FileInputStream(htmlPath), null, Charset.forName("UTF-8"), fontImp);
        // step 5
        document.close();

    }

    public static void html2wordDoc(File htmlFile, File wordDocFile) throws IOException {
        // 检查目录是否存在
        File fileDir = htmlFile.getParentFile();
        if (fileDir.exists()) {
            String content = IoUtil.read(new FileInputStream(htmlFile), "UTF-8");

            byte[] b = content.getBytes();
            ByteArrayInputStream bais = new ByteArrayInputStream(b);
            POIFSFileSystem poifs = new POIFSFileSystem();
            DirectoryEntry directory = poifs.getRoot();
            DocumentEntry documentEntry = directory.createDocument("WordDocument", bais);
            FileOutputStream ostream = new FileOutputStream(wordDocFile);
            poifs.writeFilesystem(ostream);
            bais.close();
            ostream.close();

        }
    }

    public static void html2wordDocx(File htmlFile, File wordDocxFile) throws IOException, Docx4JException {
        String htmlContent = IoUtil.read(new FileInputStream(htmlFile), "UTF-8");

        XHTMLImporterImpl xHTMLImporter = new XHTMLImporterImpl(wordMLPackage);
        xHTMLImporter.setHyperlinkStyle("Hyperlink");

        // Convert the XHTML, and add it into the empty docx we made
        wordMLPackage.getMainDocumentPart().getContent().addAll(xHTMLImporter.convert(htmlContent, null));

        wordMLPackage.save(wordDocxFile);

    }*/


}

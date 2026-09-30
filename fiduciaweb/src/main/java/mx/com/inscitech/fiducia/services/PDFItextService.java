package mx.com.inscitech.fiducia.services;

import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.Pipeline;
import com.itextpdf.tool.xml.XMLWorker;
import com.itextpdf.tool.xml.css.CSSFileWrapper;
import com.itextpdf.tool.xml.css.CssFile;
import com.itextpdf.tool.xml.css.StyleAttrCSSResolver;
import com.itextpdf.tool.xml.html.Tags;
import com.itextpdf.tool.xml.parser.XMLParser;
import com.itextpdf.tool.xml.pipeline.css.CSSResolver;
import com.itextpdf.tool.xml.pipeline.css.CssResolverPipeline;
import com.itextpdf.tool.xml.pipeline.end.PdfWriterPipeline;
import com.itextpdf.tool.xml.pipeline.html.AbstractImageProvider;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipeline;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

import mx.com.inscitech.fiducia.common.services.LoggingService;

public class PDFItextService {

    protected LoggingService logger = null;

    private String author = "Actinver";
    private String creator = "Actinver / Fiducia Web / Inscitech";
    private String subject = "Documento Confidencial";
    private String title = "Documento Fiducia Web";

    private StringBuffer htmlContent = null;
    private StringBuffer cssData = null;

    private String imageRootPath = null;

    private ByteArrayOutputStream thePDF = null;

    public PDFItextService() {
        super();
    }

    public PDFItextService(String subject, String title) {
        super();

        this.subject = subject;
        this.title = title;
    }

    public PDFItextService(String title) {
        super();
        this.title = title;
    }

    public void htmlToPDF() {

        logger = LoggingService.getNewInstance();

        Document document = null;
        PdfWriter writer = null;

        CSSResolver cssResolver = null;
        HtmlPipelineContext htmlContext = null;
        Pipeline<?> pipeline = null;

        XMLWorker worker = null;
        XMLParser parser = null;

        try {

            thePDF = new ByteArrayOutputStream();

            document = new Document(PageSize.LETTER);

            // Left, Right, Top, Bottom
            document.setMargins(9.0f, 9.0f, 9.0f, 9.0f);
            //document.setMarginMirroring(true);
            //document.setMarginMirroringTopBottom(true);

            writer = PdfWriter.getInstance(document, thePDF);

            document.open();

            document.addAuthor(this.author);
            document.addCreator(this.creator);
            document.addSubject(this.subject);
            document.addTitle(this.title);
            document.addCreationDate();

            if (cssData != null) {
                cssResolver = new StyleAttrCSSResolver();
                cssResolver.addCss(cssData.toString(), true);
            } else {
                // TODO: Agregar soporte
            }

            htmlContext = new HtmlPipelineContext(null);
            htmlContext.setTagFactory(Tags.getHtmlTagProcessorFactory());

            if (imageRootPath != null) {
                htmlContext.setImageProvider(new AbstractImageProvider() {
                    public String getImageRootPath() {
                        return imageRootPath;
                    }
                });
            }

            pipeline = new CssResolverPipeline(cssResolver, new HtmlPipeline(htmlContext, new PdfWriterPipeline(document, writer)));

            worker = new XMLWorker(pipeline, true);
            parser = new XMLParser(worker);

            parser.parse(new StringReader(htmlContent.toString()));

            document.close();

        } catch (Exception e) {

            e.printStackTrace();
            logger.log(this, Thread.currentThread(), LoggingService.ERROR, "Error al convertir el HTML a PDF", e);

        }

    }

    public void setLogger(LoggingService logger) {
        this.logger = logger;
    }

    public LoggingService getLogger() {
        return logger;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreator() {
        return creator;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setHtmlContent(StringBuffer htmlContent) {
        this.htmlContent = htmlContent;
    }

    public StringBuffer getHtmlContent() {
        return htmlContent;
    }

    public void setCssData(StringBuffer cssData) {
        this.cssData = cssData;
    }

    public StringBuffer getCssData() {
        return cssData;
    }

    public void setImageRootPath(String imageRootPath) {
        this.imageRootPath = imageRootPath;
    }

    public String getImageRootPath() {
        return imageRootPath;
    }

    public void setThePDF(ByteArrayOutputStream thePDF) {
        this.thePDF = thePDF;
    }

    public ByteArrayOutputStream getThePDF() {
        return thePDF;
    }

}

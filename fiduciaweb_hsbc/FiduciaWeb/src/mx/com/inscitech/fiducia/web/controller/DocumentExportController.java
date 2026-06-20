package mx.com.inscitech.fiducia.web.controller;

import java.io.IOException;

import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.inscitech.fiducia.services.WebContentServices;

import mx.com.inscitech.fiducia.services.PDFItextService;

import mx.com.inscitech.fiducia.common.services.LoggingService;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class DocumentExportController implements Controller {

    protected LoggingService logger = LoggingService.getInstance();

    public DocumentExportController() {
        super();
    }

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        WebContentServices htmlService = null;
        PDFItextService pdfService = null;

        StringBuffer htmlContent = null;
        StringBuffer cssData = null;

        HashMap<String, Object> data = null;

        String dataID = request.getParameter("container"); // TODO: if dataID = null
        logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "dataID: " + dataID);

        String theURL = "", theCSS = "", theTitle = "", imagePath = "", baseURL = "";

        byte[] theDocument = null;

        try {

            imagePath = request.getSession()
                               .getServletContext()
                               .getRealPath("/");
            data = SessionDataController.getData(dataID);

            theURL = "" + data.get("theURL");
            theCSS = "" + data.get("theCSS");
            theTitle = "" + data.get("titulo");

            baseURL = request.getRequestURL().toString();
            baseURL = baseURL.substring(0, baseURL.indexOf(request.getContextPath()));

            // Soporte a URL's relativas al contexto
            //if(theURL.indexOf(request.getContextPath()) < 0) theURL += request.getContextPath();

            logger.log(this, Thread.currentThread(), LoggingService.DEBUG, " theURL: " + theURL + " theCSS: " + theCSS + " theTitle: " + theTitle + " baseURL: " + baseURL);

            htmlService = new WebContentServices(baseURL);

            htmlService.setRequestProperties(new String[][] { { "dataID", dataID } });

            htmlContent = htmlService.retrieveHTML(theURL);
            cssData = "".equals(theCSS) ? new StringBuffer() : htmlService.retrieveHTML(theCSS);

            pdfService = new PDFItextService(theTitle);
            pdfService.setHtmlContent(htmlContent);
            pdfService.setCssData(cssData);
            pdfService.setImageRootPath(imagePath);

            pdfService.htmlToPDF();

            theDocument = pdfService.getThePDF().toByteArray();

            response.setContentType("application/pdf");
            response.setHeader("Content-Disposition", "attachment; filename=\"" + theTitle + ".pdf\"");

            response.setContentLength(theDocument.length);
            response.getOutputStream().write(theDocument);

        } catch (Exception e) {

            logger.log(this, Thread.currentThread(), LoggingService.ERROR, "Error al recuperar la informacion!", e);

        } finally {

            htmlService = null;
            pdfService = null;
            htmlContent = null;
            cssData = null;
            data = null;

        }

        return null;
    }

}

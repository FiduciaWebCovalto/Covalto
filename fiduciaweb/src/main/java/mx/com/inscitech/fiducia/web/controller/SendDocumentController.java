package mx.com.inscitech.fiducia.web.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;

import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.inscitech.fiducia.services.MailService;
import mx.com.inscitech.fiducia.services.WebContentServices;

import mx.com.inscitech.fiducia.common.services.LoggingService;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class SendDocumentController implements Controller {
    private static final Logger LOGGER = LoggerFactory.getLogger(SendDocumentController.class);


    protected LoggingService logger = LoggingService.getInstance();

    public SendDocumentController() {
        super();
    }

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String responseCode = "1";

        WebContentServices htmlService = null;

        String dataID = request.getParameter("container"); // TODO: if dataID = null
        String sendTo = request.getParameter("sendTo");

        String theURL = "", baseURL = "";

        byte[] theDocument = null;

        MailService mailer = null;

        try {

            theURL = request.getContextPath() + "/documentExport.do?container=" + dataID;

            baseURL = request.getRequestURL().toString();
            baseURL = baseURL.substring(0, baseURL.indexOf(request.getContextPath()));

            // Soporte a URL's relativas al contexto
            //if(theURL.indexOf(request.getContextPath()) < 0) theURL += request.getContextPath();

            logger.log(this, Thread.currentThread(), LoggingService.DEBUG, " theURL: " + theURL + " baseURL: " + baseURL);

            htmlService = new WebContentServices(baseURL);

            theDocument = htmlService.retrieveBinary(theURL);

            HashMap<String, String> mailConfig = new HashMap<String, String>();

            mailConfig.put("mail.transport.protocol", "smtp");
            mailConfig.put("mail.smtp.host", "smtp.gmail.com");
            mailConfig.put("mail.smtp.port", "587");
            mailConfig.put("mail.smtp.auth", "true");
            mailConfig.put("mail.smtp.starttls.enable", "true");

            mailConfig.put("mail.smtp.user", "gerardohr09@gmail.com");
            mailConfig.put("mail.smtp.password", "");

            /*mailConfig.put("mail.smtp.socketFactory.port", "465");
            mailConfig.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            mailConfig.put("mail.smtp.socketFactory.fallback", "false");*/
            //mailConfig.put("mail.user", "geardohr09@gmail.com");
            //mailConfig.put("mail.password", "DaigaKusei09");

            //mailConfig.put("AUTH_TYPE", "USER/PASSWORD");
            mailConfig.put("username", "gerardohr09@gmail.com");
            mailConfig.put("password", "");

            //mailConfig.put("mail.smtps.quitwait", "false");
            mailConfig.put("mail.debug", "true");

            mailer = new MailService(mailConfig);

            mailer.addFrom("gerardohr09@gmail.com");
            mailer.setSubject("FiduciaWeb Mail Test");
            //mailer.addReplyTo("noreply@gmail.com");
            mailer.addTo("gerardohr09@gmail.com");
            mailer.attachData("Reporte.pdf", theDocument);
            mailer.setContent("Este es un correo de prueba de envio de correos desde FiduciaWeb!");

            mailer.sendMail();
            mailer.finalize();

            /*FileOutputStream fo = new FileOutputStream(new File("D:\\Temp\\fiduciaWeb.pdf"));
            fo.write(theDocument);
            fo.flush();
            fo.close();
            fo = null;*/

            LOGGER.debug("Documento Recuperado!");

            responseCode = "0";

        } catch (Exception e) {

            logger.log(this, Thread.currentThread(), LoggingService.ERROR, "Error al recuperar la informacion!", e);

        } finally {

            htmlService = null;
            mailer = null;
            theDocument = null;

        }

        response.getOutputStream().write(responseCode.getBytes());

        return null;
    }

}

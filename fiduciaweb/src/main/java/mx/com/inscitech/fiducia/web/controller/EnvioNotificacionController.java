package mx.com.inscitech.fiducia.web.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.inscitech.fiducia.common.services.LoggingService;
import mx.com.inscitech.fiducia.procesos.EnvioEstadosDeCuenta;
import mx.com.inscitech.fiducia.procesos.ProcessFailureException;
import mx.com.inscitech.fiducia.procesos.xml.MailServiceConfig;
import mx.com.inscitech.fiducia.services.MailService;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class EnvioNotificacionController implements Controller {

    protected LoggingService logger = LoggingService.getInstance();

    private static final int BUFFER = 2048;

    private MailService mailService = null;

    private JdbcTemplate jdbcTemplate;

    public EnvioNotificacionController() {
        super();
    }

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getSession().removeAttribute("enviado");

        List resultadoUpload = null;
        Iterator itArchivos = null;
        FileItem elArchivo = null;

        HashMap parametros = new HashMap();
        HashMap archivos = new HashMap();

        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String strSQL =
            "SELECT \n" + "    N.FNOT_NOMBRE ASUNTO,\n" + "    N.FNOT_DESCRIPCION CONTENIDO,\n" + "    C.CON_DEPENDENCIA \n" + "FROM \n" + "    CONTACTO C, \n" +
            "    F_NOTIFICA N,\n" + "    F_NOTIFICA_ENVIO E \n" + "WHERE \n" + "    N.FNOT_SECUENCIAL = E.FNEN_SECUENCIAL \n" + "    AND C.CON_NOM_CONTACTO = E.FNEN_CONTACTO \n" +
            "    AND N.FNOT_SECUENCIAL = ?";

        try {

            if (ServletFileUpload.isMultipartContent(request)) {

                String configDir = request.getSession()
                                          .getServletContext()
                                          .getRealPath("/appConfig.xml");
                EnvioEstadosDeCuenta envioInfo = new EnvioEstadosDeCuenta();
                envioInfo.loadConfig(configDir);
                envioInfo.configure();

                setMailService(envioInfo.getMailServerConfig());

                FileItemFactory factory = new DiskFileItemFactory();
                ServletFileUpload theUploadFile = new ServletFileUpload(factory);
                resultadoUpload = theUploadFile.parseRequest(request);

                itArchivos = resultadoUpload.iterator();
                while (itArchivos.hasNext()) {
                    elArchivo = (FileItem) itArchivos.next();

                    if (elArchivo.isFormField()) {

                        logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "Add parameter: '" + elArchivo.getFieldName() + "' value: '" + elArchivo.getString() + "'");
                        parametros.put(elArchivo.getFieldName(), elArchivo.getString());

                    } else {

                        logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "Add file: '" + elArchivo.getName() + "' Field Name: " + elArchivo.getFieldName());

                        int count = 0;
                        byte[] data = new byte[BUFFER];

                        ByteArrayOutputStream theFile = new ByteArrayOutputStream();
                        InputStream fileData = elArchivo.getInputStream();

                        while ((count = fileData.read(data, 0, BUFFER)) != -1) {
                            theFile.write(data, 0, count);
                        }
                        theFile.flush();

                        //archivos.put(elArchivo.getName(), theFile.toByteArray());
                        archivos.put("Notificaciones Actinver.pdf", theFile.toByteArray());
                        theFile.close();

                        fileData = null;
                        theFile = null;

                    }

                }

            }

            //TODO: Soporte multiarchivo
            itArchivos = archivos.keySet().iterator();
            while (itArchivos.hasNext()) {
                String fileName = (String) itArchivos.next();
                //mailService.setAttachment((byte[])archivos.get(fileName));
                //mailService.setAttachmentName(fileName);
            }

            String subject = parametros.get("fnotNombre") != null ? parametros.get("fnotNombre").toString() : "No Subject";
            String messageBody = parametros.get("fnotDescripcion") != null ? parametros.get("fnotDescripcion").toString() : "HSBC";

            mailService.setSubject(subject);
            //mailService.setBodyMessage(messageBody);

            if (parametros.get("fnotSecuencialHdn") != null) {

                logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "fnotSecuencialHdn: " + parametros.get("fnotSecuencialHdn"));
                int notificacionID = Integer.parseInt(parametros.get("fnotSecuencialHdn").toString());

                cn = jdbcTemplate.getDataSource().getConnection();
                ps = cn.prepareCall(strSQL);
                ps.setInt(1, notificacionID);
                rs = ps.executeQuery();

                while (rs.next()) {
                    //mailService.setDestinationAddress(rs.getString(3));
                    mailService.sendMail();
                }

            }

            mailService = null;

        } catch (Exception e) {

            logger.log(this, Thread.currentThread(), LoggingService.ERROR, "Error al recuperar la informacion!", e);

        } finally {

            try {
                if (ps != null)
                    ps.close();
            } catch (Exception e) {
            }
            try {
                if (cn != null)
                    cn.close();
            } catch (Exception e) {
            }

            ps = null;
            cn = null;
        }

        request.getSession().setAttribute("enviado", "enviado");
        response.sendRedirect(request.getContextPath() + "/modules/Interfases/Transacciones/EnvioTransacciones.do");

        return null;
    }

    private void setMailService(MailServiceConfig mailServiceCFG) throws ProcessFailureException {

        try {

            mailService = new MailService();

            //mailService.setServer(mailServiceCFG.getMailServer());
            //mailService.setServerPort(mailServiceCFG.getMailServerPort());
            //mailService.setSenderAddress(mailServiceCFG.getSenderAddress());
            mailService.setSubject(mailServiceCFG.getSubject());
            //mailService.setBodyMessage(mailServiceCFG.getMailBody());
            //mailService.setUseAuth(mailServiceCFG.isUseAuth());

            /*if(mailServiceCFG.getServerUserName() != null && !"".equals(mailServiceCFG.getServerUserName().trim())) {
              mailService.setUserName(mailServiceCFG.getServerUserName());
          }*/

            /*if(mailServiceCFG.getServerPassword() != null && !"".equals(mailServiceCFG.getServerPassword().trim())) {
              mailService.setUserPassword(mailServiceCFG.getServerPassword());
          }

          mailService.setUseTLS(mailServiceCFG.isUseTLS());*/

            /*logger.log(this, Thread.currentThread(), LoggingService.DEBUG,
                     "Mail Service Configuration.\n\t" +
                       "Server: '" + mailService.getServer() + "'\n\t" +
                       "Port: '" + mailService.getServerPort() + "'\n\t" +
                       "Sender Address: '" + mailService.getSenderAddress() + "'\n\t" +
                       "Subject: '" + mailService.getSubject() + "'\n\t" +
                       "Body: '" + mailService.getBodyMessage() + "'\n\t" +
                       "Use Auth: " + mailService.isUseAuth() + "'\n\t" +
                       "Username: '" + mailService.getUserName() + "'\n\t" +
                       "Use TLS: " + mailService.isUseTLS());*/

        } catch (Exception e) {
            throw new ProcessFailureException(e);
        }
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
}

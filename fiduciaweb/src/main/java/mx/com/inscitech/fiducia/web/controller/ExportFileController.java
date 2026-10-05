package mx.com.inscitech.fiducia.web.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import java.lang.ArrayIndexOutOfBoundsException;

import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.inscitech.fiducia.business.services.GenericDataAccessService;
import mx.com.inscitech.fiducia.common.services.LoggingService;

import net.sf.json.JSONObject;

import org.apache.log4j.Level;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


/**
 * Controller que sirve para procesar las solicitudes que contienen sol informacion de la vista HTML
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class ExportFileController implements Controller {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExportFileController.class);


    protected LoggingService logger = LoggingService.getInstance();

    private GenericDataAccessService genericDataAccessService;

    /**
     * Metodo para obtener el objeto JavaScript (JSON) del request
     * @return Un objeto JSON con la informacion del request
     * @param request El request de la peticion
     */
    protected JSONObject getJSONRequestObject(HttpServletRequest request) {
        String json = null;
        JSONObject jsonObject = null;

        try {
            json = request.getParameter("json");
            logger.log(this.getClass(), Thread.currentThread(), Level.DEBUG, "JSON Request Chain: " + json);
            ;

            //Se crea el objeto bean a partir de la cadena json
            jsonObject = JSONObject.fromObject(json);
        } catch (Exception e) {
            LOGGER.error("Exception: ", e);
        }

        return jsonObject;
    }

    /**
     * Metodo usado por el controller para obtener las vistas solicitadas
     * @throws java.io.IOException Cuando ocurre un error al escribir/leer el request y/o response
     * @throws javax.servlet.ServletException Cuando no es posible procesar la peticion
     * @return La vista solicitada
     * @param response La respuesta http que se le envia al cliente
     * @param request La peticion http que realiza el cliente
     */
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ByteArrayOutputStream archivoSalida = null;
        ServletOutputStream out = null;

        JSONObject jsonObject = null;

        String colData = "";
        String fileName = null;
        String linea = null;

        List consulta = null;
        Map row = null;
        Map parametros = null;

        Object queryId = null;

        int tipoId = 1;

        byte[] fileData = null;

        //logger.log(this.getClass(), Thread.currentThread(), Level.DEBUG, "Vista solicitada: " + url);

        try {

            jsonObject = getJSONRequestObject(request);
            parametros = (Map) JSONObject.toBean(jsonObject, Map.class);

            fileName = (String) parametros.get("fileName");

            if (fileName.indexOf(".") < 0)
                fileName += ".file";

            logger.log(this.getClass(), Thread.currentThread(), Level.INFO, "Nombre de archivo a exportar" + fileName);

            tipoId = parametros.get("tipoId") == null ? 1 : Integer.parseInt(parametros.get("tipoId").toString());
            logger.log(this.getClass(), Thread.currentThread(), Level.DEBUG, "tipoId " + String.valueOf(tipoId));

            switch (tipoId) {
            case 1: // Ejecuta Consulta

                queryId = parametros.get("queryId");
                parametros.put("id", queryId);
                consulta = genericDataAccessService.ejecutaConsulta(parametros);
                colData = (String) parametros.get("colData");
                break;

            case 2: // Ejecuta Store Procedure y Consulta
                /*
          Object spId = parametros.get("spId");
          Object queryId = parametros.get("queryId");
          parametros.put("id", spId);
          genericDataAccessService.ejecutaProcedimiento(parametros);

          parametros.put("id", queryId);
          consulta = genericDataAccessService.ejecutaConsulta(parametros);
        */
                break;
            default:

            }

            logger.log(this.getClass(), Thread.currentThread(), Level.DEBUG, "Registros: " + String.valueOf(consulta.size()));

            archivoSalida = new ByteArrayOutputStream();

            for (int i = 0; i < consulta.size(); i++) {
                row = (Map) consulta.get(i);
                linea = (String) row.get(colData) + "\r\n";

                try {
                    archivoSalida.write(linea.getBytes());
                } catch (ArrayIndexOutOfBoundsException ar) {
                    logger.log(this.getClass(), Thread.currentThread(), Level.WARN, "Error al cargar la informacion en el response!", ar);
                }
            }

            fileData = archivoSalida.toByteArray();

        } catch (Exception e) {
            logger.log(this.getClass(), Thread.currentThread(), Level.ERROR, "Error!", e);
        }

        try {

            if (archivoSalida == null || fileData == null) {
                archivoSalida = new ByteArrayOutputStream();
                archivoSalida.write("Error al procesar la informacion!\n\rConsulte al administrador".getBytes());
                fileData = archivoSalida.toByteArray();
            }

            response.setContentLength(fileData.length);
            response.setContentType("application/octet-stream");
            response.setHeader("Content-Disposition:", "attachment;filename=\"" + fileName + "\"");

            out = response.getOutputStream();
            out.write(fileData);
            out.flush();

        } catch (Exception e) {
            logger.log(this.getClass(), Thread.currentThread(), Level.ERROR, "Error!", e);
        }

        return null;
    }


    public void setGenericDataAccessService(GenericDataAccessService genericDataAccessService) {
        this.genericDataAccessService = genericDataAccessService;
    }


    public GenericDataAccessService getGenericDataAccessService() {
        return genericDataAccessService;
    }
}

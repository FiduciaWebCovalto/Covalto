package mx.com.inscitech.fiducia.web.controller;

import java.io.IOException;

import java.util.Enumeration;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.inscitech.fiducia.business.services.GenericDataAccessService;
import mx.com.inscitech.fiducia.common.business.InterfaceDef;
import mx.com.inscitech.fiducia.common.services.LoggingService;
import mx.com.inscitech.fiducia.common.util.ReflectionUtils;

import org.apache.log4j.Level;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


/**
 * Controller usado para invocar un servicio de la clase InterfaceDef para la invocación de un servicio de negocio.
 * Esta clase se encarga de
 * @see mx.com.inscitech.fiducia.common.business.InterfaceDef
 * @author Ing. Gerardo Hernandez Rojas
 * @version 1.0
 */
public class ServicesController implements Controller {

    protected LoggingService logger = LoggingService.getInstance();
    private GenericDataAccessService dataAccess;
    protected JdbcTemplate jdbcTemplate;

    private HashMap<String, String> paramsRQ = null;

    public ServicesController() {
        super();
        paramsRQ = new HashMap<String, String>();
    }

    // TODO: Implementar un controller especial para no estar repitiendo codigo
    //protected JSONObject getJSONRequestObject(HttpServletRequest request) {

    protected void parseRequest(HttpServletRequest request) {
        paramsRQ.clear();

        String parameterName = "";

        Enumeration helper = request.getParameterNames();
        while (helper.hasMoreElements()) {
            parameterName = (String) helper.nextElement();
            paramsRQ.put(parameterName, request.getParameter(parameterName));
        }
    }

    /**
     * Cuando se llama a este controller, espera una cadena JSON que tenga el detalle del servicio a llamar. Ej:
     * {'service':'mx.com.inscitech.fiducia.common.business.TheService'}
     * @param request
     * @param response
     * @return Una cadena JSON donde se especifica el resultado de la operación y sus detalles
     * @throws ServletException
     * @throws IOException
     */
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        parseRequest(request);

        ServletOutputStream jsonResponse = null;
        String jsonString = "{\"codigo\":-1,\"desc\":\"Error desconocido\"}";

        String theServiceStr = "mx.com.inscitech.fiducia.common.business.InterfaceDef";
        InterfaceDef theService = null;

        try {

            if (!paramsRQ.containsKey("service"))
                throw new Exception("Service implementation required!");
            theServiceStr = paramsRQ.get("service");

            logger.log(this.getClass(), Thread.currentThread(), Level.DEBUG, "Service to be Invoked: " + theServiceStr);

            theService = (InterfaceDef) new ReflectionUtils().getClass(theServiceStr).newInstance();
            //theService.setDataAccess(dataAccess);
            theService.setJdbcTemplate(jdbcTemplate);
            theService.setParameters(paramsRQ);
            theService.execute();

            jsonString = "{\"codigo\":" + theService.getResultCode() + ",\"resultado\":\"" + theService.getStrCode() + "\", \"desc\":\"" + theService.getDescription() + "\"}";

            theService = null;

        } catch (Exception e) {
            logger.log(this, Thread.currentThread(), Level.ERROR, e);
            jsonString = "{\"codigo\":1,\"desc\":'" + e.getMessage() + "\"}";
        }

        jsonResponse = response.getOutputStream();
        jsonResponse.write(jsonString.getBytes());
        jsonResponse.flush();

        return null;
    }

    public void setDataAccess(GenericDataAccessService dataAccess) {
        this.dataAccess = dataAccess;
    }

    public GenericDataAccessService getDataAccess() {
        return dataAccess;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

}

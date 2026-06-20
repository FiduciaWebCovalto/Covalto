package mx.com.inscitech.fiducia.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.inscitech.fiducia.business.services.GenericDataAccessService;
import mx.com.inscitech.fiducia.common.services.ConfigurationService;
import mx.com.inscitech.fiducia.common.services.LoggingService;

import mx.com.inscitech.fiducia.common.util.ObjectCache;

import org.apache.log4j.Level;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * Controller que se encarga de despachar el menu segun el(los) puesto(s) que tenga asignado(s) el usuario
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class MenuController implements Controller {

    protected LoggingService logger = LoggingService.getInstance();

    private GenericDataAccessService genericDataAccessService;

    public void setGenericDataAccessService(GenericDataAccessService genericDataAccessService) {
        this.genericDataAccessService = genericDataAccessService;
    }

    public GenericDataAccessService getGenericDataAccessService() {
        return genericDataAccessService;
    }

    /**
     * Metodo usado por el controller para entregar el menu
     * @throws java.io.IOException Cuando ocurre un error al escribir/leer el request y/o response
     * @throws javax.servlet.ServletException Cuando no es posible procesar la peticion
     * @return El menu en xml segun el(los) puesto(s) asignado(s) al usuario
     * @param response La respuesta http que se le envia al cliente
     * @param request La peticion http que realiza el cliente
     */
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userName = (String) request.getSession().getAttribute("username");
        String roles = (String) request.getSession().getAttribute("roles");

        response.setHeader("Cache-Control", "no-cache");
        response.setContentType(ConfigurationService.getInstance().getProperty("defalutXMLContentType"));
        //response.setContentType("text/xml");

        logger.log(this.getClass(), Thread.currentThread(), Level.DEBUG, "Buscando menu el el ObjectCache. Roles: " + roles);

        if (ObjectCache.getInstance().get("roles") != null) {
            logger.log(this.getClass(), Thread.currentThread(), Level.DEBUG, "Usando menu almacenado en el ObjectCache.");

        } else {
            logger.log(this.getClass(), Thread.currentThread(), Level.DEBUG, "Generando menu.");
            logger.log(this.getClass(), Thread.currentThread(), Level.DEBUG, "Menu almacenado en el ObjectCache.");
        }

        return null;
    }
}

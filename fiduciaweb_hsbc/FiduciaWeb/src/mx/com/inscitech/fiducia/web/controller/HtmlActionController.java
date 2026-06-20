package mx.com.inscitech.fiducia.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.inscitech.fiducia.common.services.ConfigurationService;
import mx.com.inscitech.fiducia.common.services.LoggingService;

import org.apache.log4j.Level;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * Controller que sirve para procesar las solicitudes que contienen sol informacion de la vista HTML
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class HtmlActionController implements Controller {

    protected LoggingService logger = LoggingService.getInstance();

    /**
     * Metodo usado por el controller para obtener las vistas solicitadas
     * @throws java.io.IOException Cuando ocurre un error al escribir/leer el request y/o response
     * @throws javax.servlet.ServletException Cuando no es posible procesar la peticion
     * @return La vista solicitada
     * @param response La respuesta http que se le envia al cliente
     * @param request La peticion http que realiza el cliente
     */
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String url = request.getRequestURI().replaceAll(request.getContextPath(), "");

        logger.log(this.getClass(), Thread.currentThread(), Level.DEBUG, "Vista solicitada: " + url);

        String newUrl = url.substring(0, url.lastIndexOf(".do")) + ".jsp";

        logger.log(this.getClass(), Thread.currentThread(), Level.DEBUG, "Vista asociada: " + newUrl);

        response.setHeader("Cache-Control", "no-cache");
        response.setHeader("Content-Language", "es-MX");
        response.setContentType(ConfigurationService.getInstance().getProperty("defalutContentType"));

        return new ModelAndView(newUrl);
    }
}

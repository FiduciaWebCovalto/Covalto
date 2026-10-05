package mx.com.inscitech.fiducia.web.servlets;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mx.com.inscitech.fiducia.business.services.MenuService;
import mx.com.inscitech.fiducia.common.beans.MenuBean;
import mx.com.inscitech.fiducia.common.services.ConfigurationService;
import mx.com.inscitech.fiducia.common.util.ObjectCache;


public class MenuDispatcherServlet extends HttpServlet {
    private static final Logger LOGGER = LoggerFactory.getLogger(MenuDispatcherServlet.class);


    private static final String CONTENT_TYPE = "text/xml; charset=ISO-8859-1";

    @SuppressWarnings("compatibility:-7251114465230553497")
    private static final long serialVersionUID = 4630062595118152655L;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    public void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //response.setContentType(CONTENT_TYPE);
        response.setContentType(ConfigurationService.getInstance().getProperty("defalutXMLContentType"));

        HttpSession session = request.getSession();

        Integer puesto = (Integer) session.getAttribute("puestoId");

        String uri = request.getRequestURI();
        uri = uri.substring(0, uri.indexOf(".xml")) + puesto;
        LOGGER.debug("url: " + uri);
        ObjectCache cache = ObjectCache.getInstance();
        MenuBean menu = null;
        MenuService menuService = null;

        // TODO: Verificar si no es mucha carga el obtener los bytes con getMenuInfo, si es asi, guardar en el cache los bytes en lugar del objeto
        if (cache.get(uri) == null) {
            menuService = MenuService.getInstance();
            menu = menuService.getMenu(puesto);
            menuService.finalize();
            menuService = null;
            cache.put(uri, menu);
        } else {
            menu = (MenuBean) cache.get(uri);
        }

        response.getOutputStream().write(menu.getMenuInfo());
    }
}

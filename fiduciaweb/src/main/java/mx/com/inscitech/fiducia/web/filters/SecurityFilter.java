package mx.com.inscitech.fiducia.web.filters;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;

import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mx.com.inscitech.fiducia.business.services.BitacoraService;
import mx.com.inscitech.fiducia.common.ConfigurationException;
import mx.com.inscitech.fiducia.common.beans.UserServiceData;
import mx.com.inscitech.fiducia.common.beans.UsersInformation;
import mx.com.inscitech.fiducia.common.services.ConfigurationService;
import mx.com.inscitech.fiducia.common.services.LoggingService;
import mx.com.inscitech.fiducia.common.services.UserInformationService;
import mx.com.inscitech.fiducia.exceptions.FiduciaException;
import mx.com.inscitech.fiducia.exceptions.impl.InvalidUserException;

import org.apache.commons.lang3.StringUtils;

public class SecurityFilter implements Filter {
    private static final Logger LOGGER = LoggerFactory.getLogger(SecurityFilter.class);


    private static String ALWAYS_ALLOW_HOSTS = "127.0.0.1,localhost,209.209.43.73";

    private static final String URL_LOOK_FOR = "modules";

    private FilterConfig _filterConfig = null;

    private LoggingService logger = null;
    
    public void init(FilterConfig filterConfig) throws ServletException {
        _filterConfig = filterConfig;
        logger = LoggingService.getNewInstance();
    }

    public void destroy() {
        _filterConfig = null;
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "Security Filter Invoked!");

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        HttpSession session = httpRequest.getSession();

        httpResponse.setHeader("Cache-Control", "no-cache");
        httpResponse.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        httpResponse.setHeader("Pragma", "no-cache");
        httpResponse.setDateHeader("Expires", 0);

        String remoteAddress = httpRequest.getRemoteAddr();

        logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "Configuration Loaded: " + ConfigurationService.isConfigLoadedOnce());
        if (!ConfigurationService.isConfigLoadedOnce() || request.getParameter("CFG_LOAD") != null) {
            try {
                
                String configPath = session.getServletContext().getRealPath("/WEB-INF/config/fiduciario_config.xml");
                ConfigurationService.getInstance()
                                    .setConfigFilePath(configPath)
                                    .loadConfiguration()
                                    .loadFiduciaConfigFromDB();
                
            } catch (ConfigurationException e) {
                logger.log(this, Thread.currentThread(), LoggingService.WARN, "Unable to load configuration!");
            }
        }

        UsersInformation userInfo = null;

        String userName = null;
        String uri = httpRequest.getRequestURI();
        LOGGER.debug("request: "+uri);
        LOGGER.debug("session: "+session);
        LOGGER.debug("usuario sesion: "+session.getAttribute("username"));
        
        if (session.getAttribute("userInfo") == null) {

            userName = (String)session.getAttribute("username");
            String userPassword = "valido";//request.getParameter("password");

            int tipoCambio = 1;//Integer.parseInt(request.getParameter("tipo") == null ? "3" : request.getParameter("tipo"));

            logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "userName: " + userName + " tipoCambio: " + tipoCambio);

            UserInformationService userService = UserInformationService.getInstance();

            try {
                boolean alwaysAllow = true;//ALWAYS_ALLOW_HOSTS.indexOf(remoteAddress) != -1;
                logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "remoteAddress: "+remoteAddress);
                logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "alwaysAllow: " + alwaysAllow);

                if (StringUtils.isEmpty(userName) && !alwaysAllow && StringUtils.isEmpty(userPassword)) {
                    logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "ALWAYS_ALLOW_HOSTS");
                    logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "Usuario y/o Contraseña no validos o no especificados!");
                    throw new InvalidUserException("Usuario y/o Contraseña no validos o no especificados!");
                } else {

                    UserServiceData userData = userService.getUserInfo(userName, userPassword, tipoCambio, alwaysAllow);
                    userInfo = userData.getUsersInformation();
                    userInfo.setIp(remoteAddress);

                    session.setAttribute("fechaContable", userInfo.getFechaContable());
                    session.setAttribute("strFechaContable", userInfo.getStrFechaContable());
                    session.setAttribute("userid", userInfo.getUserId());
                    session.setAttribute("puestoId", userInfo.getPuestoId());
                    session.setAttribute("puesto", userInfo.getPuesto());
                    session.setAttribute("mesAbiertoLbl", userInfo.getMesAbiertoStr());
                    session.setAttribute("mesAbierto", userInfo.getMesAbierto());

                    session.setAttribute("userInfo", userInfo);
                    session.setAttribute("empresa_1",userData.getCompanies().get(0).getName());
                    session.setAttribute("empresa_2","DIRECCION FIDUCIARIA");
                    /*for (int s = 0; s < userData.getCompanies().size(); s++) {
                        session.setAttribute("empresa",userData.getCompanies().get(s).getName());
                    }*/

                }
            } catch (FiduciaException fe) {
                session.setAttribute("error", fe.getMessage());
                httpResponse.sendRedirect("login.jsp");
                return;
            } catch (InvalidUserException e) {
                session.setAttribute("error", "Invalid user! Please check your credentials.");
                httpResponse.sendRedirect("login.jsp");
                return;
            }

        } else {
            userInfo = (UsersInformation) session.getAttribute("userInfo");
            userName = userInfo.getUserName();
            if(!userInfo.getIp().equals(remoteAddress)) {
                httpResponse.sendRedirect(httpRequest.getContextPath() + "/principal.do");
                return;
            }
        }

        logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "UserInfo: " + userInfo);
        logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "uri: " + uri);
        
        if (uri.indexOf("jsp") != -1) {
            httpResponse.sendRedirect(httpRequest.getContextPath() + "/principal.do");
        } else {

            if(!isAuthorized(userInfo, uri)) {
                httpResponse.sendRedirect(httpRequest.getContextPath() + "/ssologoff.jsp");
                return;
            }

            if (uri.indexOf("altaCatalogo") != -1)
                BitacoraService.getInstance().registraBitacora(BitacoraService.ALTA, uri, "0", userName, userInfo.getUserId().intValue());
            else if (uri.indexOf("bajaCatalogo") != -1)
                BitacoraService.getInstance().registraBitacora(BitacoraService.BAJA, uri, "0", userName, userInfo.getUserId().intValue());
            else if (uri.indexOf("modificaCatalogo") != -1)
                BitacoraService.getInstance().registraBitacora(BitacoraService.MODIFICACION, uri, "0", userName, userInfo.getUserId().intValue());
            else if (uri.indexOf("Ref") != -1)
                BitacoraService.getInstance().registraBitacora(BitacoraService.CONSULTA, uri, "0", userName, userInfo.getUserId().intValue());

            logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "Do chain!");
            chain.doFilter(request, response);
        }

        logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "Security filter end!");
    }
    
    private boolean isAuthorized(UsersInformation userInfo, String url) {
        
        if(url.indexOf("principal.do") != -1 || url.indexOf(URL_LOOK_FOR) == -1) {
            return true;
        }
        
        boolean authorized = false;
        String theURL = url.substring(url.indexOf(URL_LOOK_FOR) + URL_LOOK_FOR.length() + 1);
        theURL = theURL.substring(0, theURL.indexOf("."));
        theURL = theURL.replaceAll("/", ".");
        
        final String searchURL = theURL.toUpperCase();
        logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "searchURL: " + searchURL);
        
        List<String> functions = UserInformationService.USER_FUNCTIONS.get(""+userInfo.getPuestoId());
        if(functions != null && functions.size() > 0) {               
            
            authorized = functions.stream().anyMatch(name -> name.equals(searchURL));
            if(!authorized && searchURL.indexOf(".") != -1) {
                String baseURL = searchURL.substring(0, searchURL.indexOf("."));
                logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "baseURL: " + baseURL);
                authorized = functions.stream().anyMatch(name -> name.equals(baseURL));
            }
            
            logger.log(this, Thread.currentThread(), LoggingService.DEBUG, "authorized? " + authorized);
        } else {
            authorized = true;
        }
        
        return authorized;
    }
    
}

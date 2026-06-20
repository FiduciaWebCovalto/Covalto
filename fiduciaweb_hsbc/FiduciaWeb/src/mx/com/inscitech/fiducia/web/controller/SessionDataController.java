package mx.com.inscitech.fiducia.web.controller;

import java.io.IOException;

import java.util.Enumeration;
import java.util.HashMap;

import java.util.Iterator;

import java.util.Timer;

import java.util.TimerTask;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;

import mx.com.inscitech.fiducia.common.services.LoggingService;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class SessionDataController implements Controller {

    protected LoggingService logger = LoggingService.getInstance();

    private static SessionDataController _instance = null;
    private HashMap<String, HashMap> datosSesion = null;

    static {
        _instance = new SessionDataController(new HashMap<String, HashMap>());
    }

    public SessionDataController() {
        super();
    }

    public SessionDataController(HashMap<String, HashMap> datosSesion) {
        super();
        this.datosSesion = datosSesion;
    }

    public SessionDataController getInstance() {
        return _instance;
    }

    public static HashMap<String, Object> getData(String dataID) {
        HashMap<String, Object> result = null;

        if (_instance.datosSesion.get(dataID) != null) {
            result = (HashMap<String, Object>) _instance.datosSesion
                                                        .get(dataID)
                                                        .clone();
            //clearData(dataID);
        }

        return result;
    }

    public static void clearData(String dataID) {
        _instance.datosSesion.remove(dataID);
    }

    public static void clearAllData() {
        _instance.datosSesion.clear();
    }

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Enumeration names = null;
        String name = null;

        HttpSession session = request.getSession();

        names = session.getAttributeNames();
        HashMap<String, Object> parametros = new HashMap<String, Object>();

        while (names.hasMoreElements()) {
            name = (String) names.nextElement();
            parametros.put(name, session.getAttribute(name));
        }

        names = request.getAttributeNames();
        while (names.hasMoreElements()) {
            name = (String) names.nextElement();
            parametros.put(name, request.getAttribute(name));
        }

        names = request.getParameterNames();
        while (names.hasMoreElements()) {
            name = (String) names.nextElement();
            parametros.put(name, request.getParameter(name));
        }

        String key = "" + System.currentTimeMillis();
        _instance.datosSesion.put(key, parametros);

        response.getOutputStream().write(key.getBytes());

        // TODO: Se borran a los 5 min... Repetir?
        Timer ereaser = new Timer();
        ereaser.schedule(new TimerTask() {
            public void run() {
                ereaseOldOnes();
            }
        }, 300000); // Cada 5 min

        return null;
    }

    private void ereaseOldOnes() {
        long helper = 0L, currentTime = System.currentTimeMillis() - 60000L;

        try {

            if (_instance.datosSesion.size() > 0) {
                Iterator<String> keys = _instance.datosSesion
                                                 .keySet()
                                                 .iterator();
                while (keys.hasNext()) {
                    helper = Long.parseLong(keys.next());
                    if (helper < currentTime)
                        _instance.datosSesion.remove("" + helper);
                }
            }

        } catch (Exception e) {

        }
    }

}

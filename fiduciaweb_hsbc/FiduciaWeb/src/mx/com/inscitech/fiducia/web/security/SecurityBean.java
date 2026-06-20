package mx.com.inscitech.fiducia.web.security;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecurityBean {
  
    public SecurityBean() {
        super();
    }
    
    public static String getToken() {
        return getToken(null, null);
    }

    public static String getToken(HttpServletRequest request, HttpSession session) {
        String cadenaCharra = UUID.randomUUID().toString() + "-%A" + UUID.randomUUID().toString();
        String cadenaFinal = "<input type=\"hidden\" name=\"token\" value=\"" + cadenaCharra + "\" />";
        
        return cadenaFinal;
    }
    
    
}

package mx.com.inscitech.fiducia.common.constants;


public class GlobalConstants {
    public GlobalConstants() {
        super();
    }

    public class HSBCServices {
        public static final String LDAP_CONTEXT_FACTORY = "";
        public static final String LADAP_URL_JNDI_LOCATION = "";
        public static final String LADAP_SEARCH_BASE_JNDI_LOCATION = "";
    }

    public class AuthErrorCodes {
        public static final String LDAP_CONNECTION_FAILURE_CODE = "FW-HSBC-AUTH-001";
        public static final String LDAP_CONNECTION_FAILURE_MESSAGE = "Unable to get connection to security environment. Contact support.";
    }

}

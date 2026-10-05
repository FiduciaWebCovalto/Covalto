package mx.com.inscitech.fiducia.common.services;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Optional;

import javax.naming.CommunicationException;
import javax.naming.Context;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

import mx.com.inscitech.fiducia.common.beans.Company;
import mx.com.inscitech.fiducia.common.beans.UserServiceData;
import mx.com.inscitech.fiducia.common.beans.UsersInformation;
import static mx.com.inscitech.fiducia.common.constants.GlobalConstants.AuthErrorCodes.LDAP_CONNECTION_FAILURE_CODE;
import static mx.com.inscitech.fiducia.common.constants.GlobalConstants.AuthErrorCodes.LDAP_CONNECTION_FAILURE_MESSAGE;
import static mx.com.inscitech.fiducia.common.constants.GlobalConstants.HSBCServices.LADAP_SEARCH_BASE_JNDI_LOCATION;
import static mx.com.inscitech.fiducia.common.constants.GlobalConstants.HSBCServices.LADAP_URL_JNDI_LOCATION;
import static mx.com.inscitech.fiducia.common.constants.GlobalConstants.HSBCServices.LDAP_CONTEXT_FACTORY;
import mx.com.inscitech.fiducia.common.util.ServiceLocator;
import mx.com.inscitech.fiducia.dml.GenericDML;
import mx.com.inscitech.fiducia.dml.vo.DataRow;
import mx.com.inscitech.fiducia.dml.vo.DataSet;
import mx.com.inscitech.fiducia.exceptions.FiduciaException;
import mx.com.inscitech.fiducia.exceptions.impl.InvalidUserException;
import mx.com.inscitech.fiducia.exceptions.impl.LDAPIntegrationException;

import org.apache.log4j.Level;

/**
 * Servicio que sirve para obtener y/o modificar la informacion de un usuario.
 * @author Inscitech México inscitech@inscitechmexico.com
 */
public class UserInformationService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserInformationService.class);


    public static final HashMap<String, List<String>> USER_FUNCTIONS = new HashMap<>();

    private static final String USER_INFO_QUERY = "SELECT * FROM TABLE(FN_GET_USER_INFO(?,?,?))";

    private static final String QUERY_EMPRESA =
        "SELECT EMP_NUM_EMPRESA, EMP_NOM_EMPRESA, EMP_NOM_AREA, EMP_DIRECCION, EMP_NOM_AUTORIZA, EMP_NOM_FIRMA, " +
        "EMP_IDIOMA, EMP_ESTILO, EMP_FEC_CAMBIO, EMP_LLAVE_EMPRESA FROM F_EMPRESA WHERE EMP_NUM_EMPRESA = 0";

    private static final String QUERY_FUNCIONES = "SELECT B.FFUN_ID_FUNCION, C.FFUN_NOMBRE_FUNCION FROM USUARIOS A, " +
                                                  "F_PER_FUN B, F_FUNCION C WHERE A.USU_NUM_PUESTO = B.FPER_ID_PERFIL " +
                                                  "AND B.FFUN_ID_FUNCION = C.FFUN_ID_FUNCION AND A.USU_NOM_USUARIO = ? " +
                                                  "AND C.FFUN_NOMBRE_FUNCION IS NOT NULL ORDER BY 2";

    private static boolean isConfigured = false;

    private static String ldapProviderURL = "";
    private static String ldapScurityAuthentication = "simple";
    private static String ldapSearchBase = "";

    private LoggingService logger;

    private Object obj_empresa[] = new Object[10]; // objeto empresas

    public static synchronized UserInformationService getInstance() {
        return new UserInformationService();
    }

    public UserInformationService() {
        logger = LoggingService.getInstance();
    }

    private void configureEnv() {
        Object adamURL = ServiceLocator.getInstance().getObject(LADAP_URL_JNDI_LOCATION);
        Object searchBase = ServiceLocator.getInstance().getObject(LADAP_SEARCH_BASE_JNDI_LOCATION);

        logger.log(this, Thread.currentThread(), Level.INFO, "Set adam URL to: [" + adamURL + "]");
        logger.log(this, Thread.currentThread(), Level.INFO, "Set searchBase to: [" + searchBase + "]");
        logger.log(this, Thread.currentThread(), Level.INFO, "Set Scurity Authentication as: [" + ldapScurityAuthentication + "]");

        /*if (adamURL != null)
            ldapProviderURL = "" + adamURL;
        if (searchBase != null)
            ldapSearchBase = "" + searchBase;

        if (ldapProviderURL.indexOf("ldap") < 0) {
            ldapProviderURL = "ldaps://aa-lds-prod.mx.hsbc:3269";
            logger.log(this, Thread.currentThread(), Level.DEBUG, "ldapProviderURL was set from HC");
        }

        if (ldapSearchBase.indexOf("OU=") < 0) {
            ldapSearchBase = "OU=HSBCPeople,DC=InfoDir,DC=PROD,DC=HSBC";
            logger.log(this, Thread.currentThread(), Level.DEBUG, "ldapSearchBase was set from HC");
        }*/

        isConfigured = true;
    }

    public UserServiceData getUserInfo(String userName, String userPassword, int tipoCambio, boolean alwaysAllow) throws InvalidUserException, FiduciaException {

        UsersInformation userInfoBean = null;
        LOGGER.debug("UserServiceData alwaysAllow:"+alwaysAllow);
        /*if (!alwaysAllow)
            isUserValid(userName, userPassword);
        */
        GenericDML genericDML = new GenericDML();
        DataRow dbUserInfo = genericDML.getDataRow(USER_INFO_QUERY, new Object[] { userName, "NONE", tipoCambio });

        if (dbUserInfo != null) {
            userInfoBean = buildUserInfoBean(dbUserInfo);
        } else {
            userInfoBean = createUser(userName);
        }

        UserServiceData serviceData = new UserServiceData(userInfoBean, new Company(genericDML.getDataRow(QUERY_EMPRESA)));
        
        if(!USER_FUNCTIONS.containsKey(""+userInfoBean.getPuestoId())) {
            DataSet userFunctions = genericDML.getDataSet(QUERY_FUNCIONES, new Object[] { userName });
            List<String> functions = new ArrayList<>();
            for(int i = 0; i < userFunctions.getRowCount(); i++) {
                String function = userFunctions.getRow(i).getString("FFUN_NOMBRE_FUNCION").trim().toUpperCase();
                functions.add(function);
                if(function.indexOf(".") != -1) {
                    functions.add(function.substring(0, function.indexOf(".")));
                }
            }            
            USER_FUNCTIONS.put(""+userInfoBean.getPuestoId(), functions);
        }
        
        return serviceData;
    }

    private void isUserValid(String userName, String password) throws InvalidUserException, FiduciaException {
        if (!isConfigured)
            configureEnv();

        Hashtable<String, String> env = new Hashtable<String, String>();

        String securityPrincipal = "CN=" + userName + "," + ldapSearchBase;

        env.put(Context.INITIAL_CONTEXT_FACTORY, LDAP_CONTEXT_FACTORY);
        env.put(Context.PROVIDER_URL, ldapProviderURL);
        env.put(Context.SECURITY_AUTHENTICATION, ldapScurityAuthentication);
        env.put(Context.SECURITY_PRINCIPAL, securityPrincipal);
        env.put(Context.SECURITY_CREDENTIALS, password);

        logger.log(this, Thread.currentThread(), Level.INFO, "INITIAL_CONTEXT_FACTORY: [" + LDAP_CONTEXT_FACTORY + "]");
        logger.log(this, Thread.currentThread(), Level.INFO, "PROVIDER_URL: [" + ldapProviderURL + "]");
        logger.log(this, Thread.currentThread(), Level.INFO, "SECURITY_AUTHENTICATION: [" + ldapScurityAuthentication + "]");
        logger.log(this, Thread.currentThread(), Level.DEBUG, "SECURITY_PRINCIPAL: [" + securityPrincipal + "]");
        //logger.log(this, Thread.currentThread(), Level.DEBUG, "SECURITY_CREDENTIALS: [" + password + "]");
        if(password == null || "".equals(password.trim())) throw new InvalidUserException(userName);
        try {

            DirContext ctx = new InitialDirContext(env);

            ctx.close();

        } catch (CommunicationException ce) {
            logger.log(this, Thread.currentThread(), Level.ERROR, ce);
            throw new LDAPIntegrationException(LDAP_CONNECTION_FAILURE_CODE, LDAP_CONNECTION_FAILURE_MESSAGE, Optional.empty());
        } catch (Exception e) {
            logger.log(this, Thread.currentThread(), Level.ERROR, e);
            throw new InvalidUserException(userName);
        }
    }

    private UsersInformation buildUserInfoBean(DataRow dbUserInfo) {
        UsersInformation userInfoBean = new UsersInformation();
        userInfoBean.setUserName(dbUserInfo.getString("USERNAME"));
        userInfoBean.setUserId(dbUserInfo.getInteger("USERID"));
        userInfoBean.setNombre(dbUserInfo.getString("NOMBRE"));
        userInfoBean.setPuesto(dbUserInfo.getString("PUESTO"));
        userInfoBean.setPuestoId(0);
        userInfoBean.setFechaContable(dbUserInfo.getString("FECHACONTABLE"));
        userInfoBean.setMesAbierto(dbUserInfo.getInteger("MESABIERTO")); // EN OCASIONES SERA EL ACCESO A LA PAGINA
        return userInfoBean;
    }

    private UsersInformation createUser(String user) {
        return new UsersInformation(); //TODO: Create user
    }
}

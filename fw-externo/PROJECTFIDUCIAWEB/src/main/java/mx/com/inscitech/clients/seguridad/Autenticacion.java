/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/

package mx.com.inscitech.clients.seguridad;

import java.util.Hashtable;

import javax.naming.CommunicationException;
import javax.naming.Context;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

import netscape.ldap.LDAPException;

public class Autenticacion {    
    
    public static final String LDAP_CONTEXT_FACTORY = "com.sun.jndi.ldap.LdapCtxFactory";
    public static final String LADAP_URL_JNDI_LOCATION = "HTSL_M485_FIDUCIARIO_ADAM_URI";
    public static final String LADAP_SEARCH_BASE_JNDI_LOCATION = "HTSL_M485_FIDUCIARIO_ADAM_BASE";

    private static boolean isConfigured = false;

    private static String ldapProviderURL = "ldaps://aa-lds-prod.mx.hsbc:3269";
    private static String ldapScurityAuthentication = "simple";
    private static String ldapSearchBase = "OU=HSBCPeople,DC=InfoDir,DC=PROD,DC=HSBC";
    
    public Autenticacion(){
    }
    
    private void configureEnv() {
        Object adamURL = LADAP_URL_JNDI_LOCATION;
        Object searchBase = LADAP_SEARCH_BASE_JNDI_LOCATION;

        if (adamURL != null)
            ldapProviderURL = "" + adamURL;
        if (searchBase != null)
            ldapSearchBase = "" + searchBase;

        if (ldapProviderURL.indexOf("ldap") < 0) {
            ldapProviderURL = "ldaps://aa-lds-prod.mx.hsbc:3269";
        }

        if (ldapSearchBase.indexOf("OU=") < 0) {
            ldapSearchBase = "OU=HSBCPeople,DC=InfoDir,DC=PROD,DC=HSBC";
        }

        isConfigured = true;
    }
    
    /**
     * Autenticacion de usuario en servidor LDAP
     * @param stUsuario usuario
     * @param stPassword password
     * @return 0 - credenciales no validas, 1 - Autenticacion exitosa
     * @throws netscape.ldap.LDAPException Si hay error de conexion a servidor LDAP
     */
    public byte autenticar(String stUsuario, String stPassword) throws LDAPException {
        byte btResult = -1;
        if (!isConfigured) configureEnv();
        
        Hashtable<String, String> env = new Hashtable<String, String>();

        String securityPrincipal = "CN=" + stUsuario + "," + ldapSearchBase;


        try {

            if(stUsuario!=null&&stPassword!=null&&!stPassword.trim().isEmpty()&&!stUsuario.trim().isEmpty()){    
                env.put(Context.INITIAL_CONTEXT_FACTORY, LDAP_CONTEXT_FACTORY);
                env.put(Context.PROVIDER_URL, ldapProviderURL);
                env.put(Context.SECURITY_AUTHENTICATION, ldapScurityAuthentication);
                env.put(Context.SECURITY_PRINCIPAL, securityPrincipal);
                env.put(Context.SECURITY_CREDENTIALS, stPassword);
        
                DirContext ctx = new InitialDirContext(env);
                ctx.close();
                btResult = 1;
            }
            else{
                btResult = -1;
                System.out.println("El usuario y/o contrase�a estan vacios. Usuario:"+stUsuario+" Contrase�a:"+stPassword);
            }

        } catch (CommunicationException ce) {
            ce.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return btResult;
    }
    
    public static void main(String[] args){
        Autenticacion ut = new Autenticacion();
        byte res = -1;
        try {

            res = ut.autenticar("assaia", "asas7");
        } catch (LDAPException ex) {
            throw new RuntimeException("FALLA EN ACCESO A LDAP");
        }
        
        if(res == 1) System.out.println("exito");
        else System.out.println("falla");
        
        System.out.println("fin");
    }

}

/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/

package mx.com.inscitech.clients.seguridad;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Enumeration;
import netscape.ldap.LDAPAttributeSet;
import netscape.ldap.LDAPConnection;
import netscape.ldap.LDAPEntry;

public class ConexionLDAP 
{
    private static final Logger LOGGER = LoggerFactory.getLogger(ConexionLDAP.class);


  public ConexionLDAP()
  {
  }

  /**
   * 
   * @param args
   */
  public static void main(String[] args)
  {
      try {
    		int port = 7031;
    		String host = "atlas.finalmex.com";
    		LDAPConnection ld = new LDAPConnection();
    		ld.connect(host, port);
        ld.authenticate("uid=weblogic,ou=people,ou=myrealm,dc=fiduciaDomain", "weblogic");
    		LOGGER.debug("{}", ld.getAuthenticationPassword());
    		LOGGER.debug("{}", ld.getAuthenticationDN());
    		LOGGER.debug("{}", ld.getAuthenticationMethod());
    		LDAPEntry ldapEntry = ld.read("uid=weblogic,ou=people,ou=myrealm,dc=fiduciaDomain");
    		LDAPAttributeSet ldapAttributeSet = ldapEntry.getAttributeSet();
    		Enumeration e = ldapAttributeSet.getAttributes();
    		
    		while(e.hasMoreElements()) {
    			LOGGER.debug("{}", e.nextElement());
    		}
    		
    		LOGGER.debug("");
    		ld.disconnect();
    	}catch(Exception e) {
    		LOGGER.error("Exception: ", e);
    	}

  }
}
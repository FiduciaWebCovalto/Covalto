/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/

package com.bancomext.seguridad;

import java.util.Enumeration;
import netscape.ldap.LDAPAttributeSet;
import netscape.ldap.LDAPConnection;
import netscape.ldap.LDAPEntry;

public class ConexionLDAP 
{

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
    		System.out.println(ld.getAuthenticationPassword());
    		System.out.println(ld.getAuthenticationDN());
    		System.out.println(ld.getAuthenticationMethod());
    		LDAPEntry ldapEntry = ld.read("uid=weblogic,ou=people,ou=myrealm,dc=fiduciaDomain");
    		LDAPAttributeSet ldapAttributeSet = ldapEntry.getAttributeSet();
    		Enumeration e = ldapAttributeSet.getAttributes();
    		
    		while(e.hasMoreElements()) {
    			System.out.println(e.nextElement());
    		}
    		
    		System.out.println();
    		ld.disconnect();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}

  }
}
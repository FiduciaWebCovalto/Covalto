<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<jsp:useBean id="BD" class="com.bancomext.negocio.FiduciaBD"/>
<%


if(BD.getData(52,"1")!=null)
{
  String empresa[] = BD.getData(52,"1")[0].split("-");// datos empresa 1 
  
  for(int s = 0;s<empresa.length;s++)
  {
    session.setAttribute("empresa_"+s,empresa[s]);
  }
  
  session.setAttribute("empresa_4","");
}

String usrInfo=null;
String logoutURL  = null;
String userName=(String)session.getAttribute("username");  
String password=(String)session.getAttribute("password");  
session.setAttribute("username", userName);
session.setAttribute("password", password);

if (userName==null)
	{

    
        if(userName == null)
    		{
		%>
		<font face="Arial, Helvetica, sans-serif" size="+1" color="#000066">
		<center >
 			 Por favor espere mientras se redirecciona al Servidor del SSO ... 
		</center>
		</font> 
		<%
    		} 
	}
	
userName=(String)session.getAttribute("username");

if (userName!=null)
	{

		userName=userName.toLowerCase();
		System.out.println("Aplicativo FI_ValidUser: " + userName); 

		//APLICATIVO
		session.setAttribute("Mensaje","");
		// valida si el acceso al sistema esta habilitado
		if(!BD.getAccesoInternet())
			{
			System.out.println("POR EL MOMENTO EL SISTEMA NO ESTA DISPONIBLE<BR>FAVOR DE INTENTAR MAS TARDE");
			session.setAttribute("Mensaje","POR EL MOMENTO EL SISTEMA NO ESTA DISPONIBLE<BR>FAVOR DE INTENTAR MAS TARDE");
			%>
			<jsp:forward page="salir.jsp"/>
			<%
			}
			
					
		

	
		if (userName==null)
			{
			System.out.println(" NO SE PUDO RECUPERAR EL USUARIO DEL SSO");
			session.setAttribute("Mensaje"," NO SE PUDO RECUPERAR EL USUARIO DEL SSO");
			%>
			<jsp:forward page="salir.jsp"/>
			<%
			}
	
		System.out.println("inumuser");
	int iNumUser= BD.existeUsuario(userName,password);
	System.out.println("Aplicativo FI_ValidUser iNumUser: " + iNumUser); 
	switch (iNumUser)
	{
	case -1:
		System.out.println(" EL USUARIO NO SE ENCUENTRA REGISTRADO EN EL SISTEMA<BR> FAVOR DE COMUNICARSE CON SU EJECUTIVO DE CUENTA");
		session.setAttribute("Mensaje"," EL USUARIO NO SE ENCUENTRA REGISTRADO EN EL SISTEMA<BR> FAVOR DE COMUNICARSE CON SU EJECUTIVO DE CUENTA");
		%>
		<TD background="imagenes/fondoMenu.gif" align="right"><A href="salir.jsp" class="Menu">SALIR</A>&nbsp;</TD>
    <jsp:forward page="salir.jsp"/>
		<%
		break;
	case -2:
		System.out.println(" EL USUARIO NO SE ENCUENTRA ACTIVO<BR> FAVOR DE COMUNICARSE CON SU EJECUTIVO DE CUENTA");
		session.setAttribute("Mensaje"," EL USUARIO NO SE ENCUENTRA ACTIVO<BR> FAVOR DE COMUNICARSE CON SU EJECUTIVO DE CUENTA");
		%>
		<jsp:forward page="salir.jsp"/>
		<%
		break;
	case -3:
		System.out.println("EL USUARIO NO TIENE ASIGNADOS FIDEICOMISOS<BR>");
		session.setAttribute("Mensaje"," EL USUARIO NO TIENE ASIGNADOS FIDEICOMISOS<BR> FAVOR DE COMUNICARSE CON SU EJECUTIVO DE CUENTA");
		%>
		<jsp:forward page="salir.jsp"/>
		<%
		break;
  case -4:
		System.out.println("LA CONTRASE�A DEL USUARIO ES INCORRECTA<BR> FAVOR DE COMUNICARSE CON SU EJECUTIVO DE CUENTA");
		session.setAttribute("Mensaje"," LA CONTRASE�A DEL USUARIO ES INCORRECTA<BR> FAVOR DE COMUNICARSE CON SU EJECUTIVO DE CUENTA");
		%>
		<jsp:forward page="salir.jsp"/>
		<%
		break;		
  case -5:
		System.out.println("EL USUARIO ESTA BLOQUEADO<BR> FAVOR DE COMUNICARSE CON SU EJECUTIVO DE CUENTA");
		session.setAttribute("Mensaje"," EL USUARIO ESTA BLOQUEADO<BR> FAVOR DE COMUNICARSE CON SU EJECUTIVO DE CUENTA");
		%>
		<jsp:forward page="salir.jsp"/>
		<%
		break;	    
    default:
	
			System.out.println("BIENVENIDO"+userName);			
			int i=0;
			String[] strDatos= BD.getDatosUsuario(userName);
	     		String[] asFideicomiso;

			if (strDatos.length>0)
				{
				asFideicomiso= new String[strDatos.length - 4];
                                System.out.println("Longitud:"+strDatos.length);
				for (i = 4; i<strDatos.length;i++)
					asFideicomiso[i-4] = strDatos[i];
				session.setAttribute("user",userName);
				System.out.println("user:"+userName);
				session.setAttribute("token",strDatos[3]);
				session.setAttribute("permiso",strDatos[2]);
				session.setAttribute("totFid","2");
				session.setAttribute("NumUser",iNumUser+"");	
                                System.out.println("perfil:"+strDatos[2]);
				session.setAttribute("NomUser",strDatos[0]);
				session.setAttribute("Email",strDatos[1]);
				session.setAttribute("Fideicomisos",asFideicomiso);
				session.setAttribute("sesionFI","nueva");	
				
			
				System.out.println("i"+i);
				
				BD.actualizaUltimoAcceso((String)session.getAttribute("username"));//actualiza la fecha de ultimo acceso
				if (i == 5)//solo un fiso
			  		{
                                        session.setAttribute("totFid","1");
                                        if(!strDatos[2].equalsIgnoreCase("ADMINISTRACION")&&
                                        !strDatos[2].equalsIgnoreCase("CONTABILIZA INSTRUCCIONES")&&
                                        !strDatos[2].equalsIgnoreCase("LIBERA INSTRUCCIONES")&&
                                        !strDatos[2].equalsIgnoreCase("AUTORIZACION INSTRUCCIONES"))
                                        {
                                            session.setAttribute( "NumFid", (asFideicomiso[0]).substring(0,(asFideicomiso[0]).indexOf('-')));
                                        } 
                                        else
                                            session.setAttribute( "NumFid", "0"); 
                                            session.setAttribute( "Fideicomiso", asFideicomiso[0]);
                                            session.setAttribute("CtasInd","0");
					
					
					if(((String)session.getAttribute("token")).equals("1"))
					    {%>
				      <jsp:forward page="FI_Token.jsp"/>
					    <%
					     }
					else if(!strDatos[2].equalsIgnoreCase("ADMINISTRACION")&&
                                          !strDatos[2].equalsIgnoreCase("CONTABILIZA INSTRUCCIONES")&&
                                          !strDatos[2].equalsIgnoreCase("LIBERA INSTRUCCIONES")&&
                                          !strDatos[2].equalsIgnoreCase("AUTORIZACION INSTRUCCIONES"))
						 {%>	 
					<jsp:forward page="FI_Bienvenida.jsp"/>		
						<%}
                                      }//i==5
                                      else if(i<5){  
                                        %>
                                      <jsp:forward page="FI_BienvenidaAdmin.jsp"/>		
                                        <%
                                       }else
					{
					System.out.println("FI_Fideicomiso.jsp");
					%>

					<jsp:forward page="FI_Fideicomiso.jsp"/>
					<%
					} 
				}
				else
					{

					System.out.println("NO TRAE DATOS EL USUARIO");
					}	
			break;
			}


}               
			%> 
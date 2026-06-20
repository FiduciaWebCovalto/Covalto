<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%
	
      //codigo incorporado para efectos del uso del Token
      //--------------------------------------------------
      
      if ( passCode != null)
	
       //autenticaUsuario=Token.autenticaUsu(fileProperties,claveUsuario,passCode);
		  /*
		       *		1. Autenticacion No Satisfactoria
			   *		0. Autenticacion Satisfactoria
     		   *		6. PIN Aceptado
               *		7. PIN Rechazado
               *		2. Se requiere el Proximo Codigo
               *		4. Proximo Codigo Erroneo
		  */
		  
		  if(autenticaUsuario!=0)
		  	{
			switch(autenticaUsuario)
					{
					case 1:
							mensajeToken="Autenticacion No Satisfactoria clave";
							break;
					case 2:
							//mensajeToken="Se requiere proximo token";
							//break;
					case 4:
							//token desincronizado
							%>
							<jsp:forward page="FI_Sincroniza_Token.jsp"/>    
							<%  
							break;		
					default:
							mensajeToken="EL TOKEN INCORPORADO ES INCORRECTO<BR>FAVOR DE INTENTAR NUEVAMENTE";
							break;					
					}
			session.setAttribute("errorToken",mensajeToken);
			%>
			<jsp:forward page="salir.jsp"/>    
			<%         
			} 	
   
	  
%>

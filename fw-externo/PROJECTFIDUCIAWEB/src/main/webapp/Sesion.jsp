<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%	  
//**************************************************************Seguridad*******************************************************/
   if (session.getAttribute("NumUser")==null )
	   {
	   session.setAttribute("Error","Por razones de seguridad tu sesi�n ha finalizado<br>por exceder el tiempo m�ximo de inactividad.<br> Por favor inicia de nuevo"); 
	  	%>
	   <jsp:forward page="salir.jsp"/>	
	   <%
	   }
	  
  if(!BD.getHorarioOperacion())
		{
		session.setAttribute("Error","Por el momento el sistema no esta Disponible<br>Favor de Intentar mas tarde...");
		%>
	   <jsp:forward page="salir.jsp"/>	
	   <%
	  
		}	   

   String sysFecha=BD.fecha();  	  
   String fecha=BD.getFecha();  
   String sCaptura = (((String)session.getAttribute("permiso")).equals("CLIENTE CAPTURA"))?"SI":"NO";
   String tipoUsuario = (String)session.getAttribute("permiso")!=null?(String)session.getAttribute("permiso"):"OTRO";    
session.setAttribute("TRASPINTERFID","0");	 
		 %>

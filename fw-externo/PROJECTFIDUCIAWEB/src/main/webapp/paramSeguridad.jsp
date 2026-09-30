<jsp:useBean id="param"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<jsp:useBean id="seguridad"  class="mx.com.inscitech.clients.negocio.nSeguridad"/>
<jsp:useBean id="comTec"  class="mx.com.inscitech.clients.negocio.nAcuerdos"/>
<%	  
//**************************************************************Seguridad*******************************************************/



   if (session.getAttribute("NumUser")==null )
	   {
	   session.setAttribute("Error","Por razones de seguridad tu sesi�n ha finalizado<br>por exceder el tiempo m�ximo de inactividad.<br> Por favor inicia de nuevo"); 
	  	%>
	   <jsp:forward page="salir.jsp"/>	
	   <%
	   }
	  
  if(!param.getHorarioOperacion())
		{
		session.setAttribute("Error","Por el momento el sistema no esta Disponible<br>Favor de Intentar mas tarde...");
		%>
	   <jsp:forward page="salir.jsp"/>	
	   <%
	  
		}	   

 
   String sysFecha=param.fecha();  	  
   String fecha=param.getFecha(); 
   


   int idUsuario = Integer.parseInt((String)session.getAttribute("NumUser"));
   String correoFiducia=param.getDatosParametros(101);
   int idMenu = 0;     
   String sCaptura = "NO";
   String tipoUsuario = (String)session.getAttribute("permiso")!=null?(String)session.getAttribute("permiso"):"OTRO"; 
   int numFiso=0;
   
   boolean bFoseg=false;
   boolean bComiteTecnico= false;
   boolean bCtasInd=false;
   boolean bToken=false;
  
   if(session.getAttribute( "NumFid" )!=null)
		{
     numFiso=Integer.parseInt((String)session.getAttribute( "NumFid" ));
		 bComiteTecnico= comTec.aplica(numFiso);
  	 bCtasInd= param.ExistenCtasInd(numFiso+"");
    // sCaptura = param.tipoUsuario(idUsuario,0);

     if(((String)session.getAttribute("token")).equals("1"))
          {
          bToken=true;

          }
      
      
      
   		if(param.getTipoFiso((String)session.getAttribute( "NumFid" )))
	  	   {
		     session.setAttribute("FOSEG","S");
		     bFoseg=true;
		     }
      else 
         session.setAttribute("FOSEG","N");


		}
		
String tempCboSelect="";
String siglaMonedaOrigenOper="";
String siglaMonedaDestinoOper="";
String cveMonedaOrigenOper="";
String cveMonedaDestinoOper="";
//******************************************************************************************************************************/		 
		 %>

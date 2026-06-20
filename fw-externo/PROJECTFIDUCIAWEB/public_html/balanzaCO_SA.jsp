<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<jsp:useBean id="bal" class="com.bancomext.negocio.balanzaComprob"/>
<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>

<%@ page import="java.util.*" %>
<html>
<head>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<%
String[] meses={"ENERO","FEBRERO","MARZO","ABRIL","MAYO","JUNIO","JULIO","AGOSTO","SEPTIEMBRE","OCTUBRE","NOVIEMBRE","DICIEMBRE","",""};
String[] bitacora = new String[5];
String fechaCont=BD.getFecha();
String folioBit="";
int regBitacora=0;
int moneda = ((String)request.getParameter("moneda")).equalsIgnoreCase("1")?Integer.parseInt(request.getParameter("moneda")):2;
%>
<title>Balanza de Comprobacion de <%= meses[Integer.parseInt(request.getParameter("mes")) - 1] %> del 
<%= request.getParameter("anio") %> Fideicomiso: <%=(String)session.getAttribute( "Fideicomiso" )%></title>

<style type="text/css">
<!--
	.style14 {
				font-size: 16px;
				font-weight: bold;
				font-family: Verdana, Arial, Helvetica, sans-serif;
			 }
	.style15 {
				font-family: Verdana, Arial, Helvetica, sans-serif;
				font-size: 12px;
				font-weight: bold;
			 }
	.style16 {font-family: Arial, Helvetica, sans-serif}
	.style18 {
				font-size: 12px;
				font-weight: bold;
				font-family: Arial, Helvetica, sans-serif;
			 }
	.error   {
	       font-family: Arial, Helvetica, Verdana;	
				 font-size: 14px;color: #006699;
				 font-weight: bold;
			 }	 		 
.style26 {font-size: xx-small}
body,td,th {
	font-size: xx-small;
}
-->
</style>
<script language="javascript">

	function ventanaError( mensajeError ) {
	   document.write("<center>");
	   document.write("<table border='0'>");
	   document.write("<tr><td>&nbsp;</td></tr>");
	   document.write("<tr><td>&nbsp;</td></tr>");
	   document.write("<tr><td>&nbsp;</td></tr>");
	   document.write("<tr><td class='error'>El Reporte de la Balanza de Comprobacion</td></tr>");
	   document.write("<tr><td class='error'>No esta Disponible</td></tr>");
	   document.write("<tr><td class='error'>&nbsp;</td></tr>");
	   document.write("<tr><td class='error'>" + mensajeError + "</td></tr>");
	   document.write("<tr><td class='error'>&nbsp;</td></tr>");
	   document.write("<tr><td><input class='boton' type='button' value='Cerrar' onClick='window.close()'/></td></tr>");	
	}
</script>
</head>
<% 

int noCuenta = Integer.parseInt(request.getParameter("numFid"));
int anio = Integer.parseInt(request.getParameter("anio"));
int mes  = Integer.parseInt(request.getParameter("mes"));
Vector datos = bal.generaBalanzaCom( noCuenta, anio, mes, moneda ); //moneda nacional%>
    <%
	    int numeroFiso = Integer.parseInt(request.getParameter("numFid"));

		//incorporacion de la bitacora
		 folioBit=BD.getFolio(2);
		 System.out.println("Folio"+folioBit);
		 bitacora[0]=fechaCont;
		 bitacora[1]= folioBit;
		 bitacora[2]=(String)session.getAttribute("NumUser");
		 bitacora[3]="Consulta de la Balanza de Comprobacion para el Fideicomiso "+numeroFiso
		 +" del Mes "+meses[mes].toUpperCase()+" del Anio "+anio;
		 bitacora[4]="120.0.0.1";
		
		 regBitacora=BD.insertaBitacora(bitacora);	
	    
		if(bal.tieneAdministracion( numeroFiso ).booleanValue() ) {
	%>
	         <script language="javascript"> 
			     var mensajeError = "Por ser Fideicomiso con Administracion, la consulta solicitada no cotiene informaci�n"; 
				 ventanaError( mensajeError ); 
			 </script>   
	<% } else { 
				Vector sumas = bal.generaSumas( noCuenta, anio, mes, moneda ); //
				if( datos.isEmpty() ) {
	%>
				       <script language="javascript"> 
								var mensajeError = "El Mes solicitado no contiene informacion"; 
							ventanaError( mensajeError );
						</script>
							
	<%			
	             } else {
    %>
          
	<% 
		     String mesCompleto = meses[Integer.parseInt(request.getParameter("mes")) - 1];
		     int paginas = ( bal.obtenPaginas( noCuenta, anio, mes ).intValue() );
		     int pagina; 
			   int pag;
			 
		     for ( pagina = 1; pagina <= paginas; pagina++ )  {
			      if( pagina == paginas){ pag = 1; } else { pag = 0; }
			      if (pagina==1 || request.getParameter("bImprimir")!=null) 
				     out.println(bal.escribeEncabezado( (String)session.getAttribute("Fideicomiso"), request.getParameter("anio"), mesCompleto, pag , moneda));
				  	 out.println(bal.escribeBalanza( datos, pagina )); 
			  }	  
		  %>
		  
		  <tr>
           <td height="30"  colspan="10" class="textohome2"><div align="center"><span class="style26">SUMAS</span></div></td>
             <% out.println(bal.escribeSumasBalanza( sumas )); %>   
         </tr>
		 <tr width="900" style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    		<td width="25" colspan="2">&nbsp;</td>
   		   <td  colspan="11" align="center"><p align="justify">&nbsp; </p></td>
    		</tr><tr><td align="center" style="font-family: Arial;	font-size: 9px;color: #000000;" colspan="14">&nbsp;</td>
  			</tr>
  </table> 
		
<%
     }
 } //La llave del ultimo else	
%>

</body>
</html>

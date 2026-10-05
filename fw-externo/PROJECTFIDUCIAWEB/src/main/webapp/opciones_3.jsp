<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.util.*,java.text.*"%>		
<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<jsp:useBean id="CTA" class="mx.com.inscitech.clients.negocio.TransferenciaElectronica" />
<%@ include file="sesionOpc2.jsp" %>
<%@ include file="pki.jsp" %>
<%@ include file="parametrosPKI.jsp" %>
<%@ page import="java.util.*, javax.mail.*, javax.mail.internet.*, java.io.*, javax.activation.*" %>
<%
String detalleBit="";
int tipo=Integer.parseInt(request.getParameter("tipo")!=null?request.getParameter("tipo").trim():"0");
String sCuerpo="";
String subject = "";
int existeCta = CTA.existeTercero(request.getParameter("txtRFC"),(String)session.getAttribute( "NumFid" ));
boolean bValidaCta=false;


boolean bExisteCta=false;
boolean bRegistra=false;
try{
	if(existeCta==1 ) 
    bExisteCta=true;
	if(existeCta==0 ){
		session.setAttribute("msgError","Error al registrar la Cuenta<br>Por Favor, intenta mas tarde");
%>
	<jsp:forward page="FI_Opciones.jsp"/>    
<%   
  }	
	if(existeCta==3 ){
		session.setAttribute("msgError","EL FIDEICOMISO YA TIENE SOLICITADA O ASIGNADA ESTA CUENTA");
%>
<jsp:forward page="FI_Opciones.jsp"/>    
<%   
	}
			
	bValidaCta=CTA.validaTercero(request.getParameter("txtRFC"),(String)session.getAttribute( "NumFid" ));	

  if( sCaptura.equals("NO")){
	//**************************************************************Firma Digital***********************************************************/
%>		
<!--%@include file="firmaDigital.jsp"%-->
<%  
//**************************************************************Fin Firma Digital********************************************************/
}	
    bRegistra=CTA.registraTercero(			 
                                  request.getParameter("txtFolio"),
                                  request.getParameter("txtCuenta"),                                  
                                  (String)session.getAttribute("username"),                                
                                  (String)session.getAttribute("NumFid"),                                  
                                  request.getParameter("txtRFC"),
                                  (sCaptura.equals("SI")?"CAPTURADA":"PENDIENTE"),fecha,1,"0",
                                  request.getParameter("txtConvenio"));

    
  		if(!bRegistra)
					  {
					  session.setAttribute("msgError","La Cuenta no fue registrada<br>Intenta nuevamente");
						%>
							<jsp:forward page="FI_Opciones.jsp"/>     
						<%       
					   }
						
								subject = "Solicitud de Alta de Cuenta para Pago Interbancario";//request.getParameter();
                
								sCuerpo ="<HTML><HEAD><TITLE>Registro de Otra Cuenta - FiduciaWeb Movil: Encuesta</TITLE>"
                
											+ "<META content=\"text/html; charset=windows-1252\" http-equiv=Content-Type>"
											+"<META content=\"P�gina Principal\" name=0>"
											+"<link href=\"http://www.bancomext.com/fiducia/styles/bancomext.css\" rel=\"stylesheet\" type=\"text/css\">"
											+"</HEAD>"
											+"<BODY vLink=#052206 leftMargin=0 topMargin=0 marginwidth=0 marginheight=0 >"
											+"<table border=0 width=800 class=\"texto\">"
											+"<tr class=\"titulo\">"
											+"<td height=12><b>DATOS DEL USUARIO</td>"
											+"</tr>"
											+"<tr >"
											+"<td width=800 height=12>&nbsp;</td>"
											+"</tr>"
											+"<tr >"
											+"<td width=800 height=12>&nbsp;&nbsp;&nbsp;&nbsp;USUARIO SOLICITANTE:&nbsp;&nbsp;<b>" + session.getAttribute("NomUser")+"</td></b></tr>"
											+"<tr><td width=800 height=12>&nbsp;&nbsp;&nbsp;&nbsp;FIDEICOMISO:&nbsp;&nbsp;<b>" + session.getAttribute("Fideicomiso")+"</b></td></tr>"
											+"<tr><td width=800 height=12>&nbsp;&nbsp;&nbsp;&nbsp;FOLIO:&nbsp;&nbsp;<b>" +request.getParameter("txtFolio")+"</b></td></tr>"
											+"<tr><td width=800 height=12>&nbsp;</td></tr>"
											+"<tr><td width=800 height=12>&nbsp;</td></tr>"
								            +"<tr><td width=800 height=12 class=\"titulo\">DATOS DE LA CUENTA</td></tr>"					 
											+"<tr><td width=800 height=12>&nbsp;</td></tr>"
											+"<tr><td width=800 height=12>&nbsp;</td></tr>"
											+"<tr><td width=800 height=12>&nbsp;&nbsp;&nbsp;&nbsp;N&uacute;mero de Cuenta:&nbsp;&nbsp;<b>"+request.getParameter("txtCuenta")+"</b></td></tr>"
											+"<tr><td width=800 height=12>&nbsp;&nbsp;&nbsp;&nbsp;Titular de la Cuenta:&nbsp;&nbsp;<b>"+request.getParameter("txtTitular")+"</b></td></tr>"
											+"<tr><td width=800 height=12>&nbsp;&nbsp;&nbsp;&nbsp;RFC:&nbsp;&nbsp;<b>"+request.getParameter("txtRFC")+"</td></tr>"
											+"<tr><td width=800 height=12>&nbsp;&nbsp;&nbsp;&nbsp;Correo electronico:&nbsp;&nbsp;<b>"+(request.getParameter("txtCorreo").trim().equals("")?((String)session.getAttribute("Email") ):request.getParameter("txtCorreo"))+"</b></td></tr>";
										
								if(bValidaCta)
									{
									sCuerpo = sCuerpo	+ "<tr><td width=800 height=12>&nbsp;</td></tr>"
														        + "<tr><td width=800 height=12>&nbsp;</td></tr>"
														        + "<tr><td width=800 height=12 class=\"alerta\"><b>Nota: Esta cuenta ya fue validada y se encuentra como aceptada en el sistema.</b></td></tr>";
									}		
							       sCuerpo=sCuerpo+"</table></body></html>";
        
      if(bRegistra && sCaptura.equals("NO")){
			  Properties props = new Properties();
			  String fromAddress = "";
			  String toAddress = "";
			  %>		
	   		<!--%@ include file="configuraMail.jsp" %-->
   			<% 
			}
%>
<%}catch (Exception ex){
  System.out.println("EEROR AL EN OPCIONES_2:"+ex);
}
finally {
%>

<HTML>
<HEAD>

<TITLE>Opciones - Solicitud de Alta de Otra Cuenta</TITLE>

<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
<link href="styles/bancomext.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">
function instrucciones()
	{
	parent.location="FI_Opciones.jsp";
	}

function imprimir()
	{
	window.print();
	parent.location="FI_Opciones.jsp";
	}

</script>
<script> 
function window.onbeforeprint()
{ 
Imprimir.style.visibility = 'hidden';
Salir.style.visibility = 'hidden'; 
} 
function window.onafterprint(){ 
Imprimir.style.visibility = 'visible';
Salir.style.visibility = 'visible'; 
}
</script> 
</HEAD>
<BODY vLink=#052206 leftMargin=0 topMargin=0 marginwidth="0" marginheight="0">
<table border="0" width="90%" align="center">
  <tr bordercolor="#000000"> 
    <td  ><hr size="2"></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td align="right" class="textoNegrita"><table width="100%" border="0" height="79">
        <tr bordercolor="#000000"> 
          <td width="11%"><img src="imagenes/logo.jpg" width="135" height="89"></td>
          <td width="89%" align="center" bordercolor="#FFFFFF" class="subtitulo">DIRECCION 
            FIDUCIARIA <br>
           
            <%=sCaptura.equals("NO")?"SOLICITUD DE ALTA DE TERCEROS":""%> 
            <%=sCaptura.equals("SI") ?"SOLICITUD  DE ALTA DE TERCEROS EN ESPERA DE AUTORIZACION":""%> 
      
          </td>
        </tr>
      </table></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td ><hr size="2"></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  align="right" class="textoNegrita">Fecha: <%=fecha+"&nbsp;&nbsp;  "+BD.getHora() +" hrs."%></td>
  </tr>
  <tr bordercolor="#000000">
    <td  align="right" class="textoNegrita">&nbsp;</td>
  </tr>
</table>
<table width="70%" border="0" align="center">
  <tr> 
    <td align="center"> 
	<table width="100%"  border="1" bordercolor="#FFFFFF">
        <tr bordercolor="#006699"> 
          <td   colspan="2" bordercolor="#000000" bgcolor="#CCCCCC" class="subtitulo">Folio: 
            <%=Folio%></td>
        </tr>
        <tr bordercolor="#000000"> 
          <td class="texto">Fidecomiso:</td>
          <td class="texto"><%= session.getAttribute( "Fideicomiso" ) %></td>
        </tr>
        <tr bordercolor="#000000" bgcolor="#FFFFFF"> 
          <td width="37%" class=texto> <%=sCaptura.equals("NO")?"Solicitante:":"Capturada:"%>&nbsp;&nbsp; </td>
          <td width="63%" class="texto"> <%=session.getAttribute("NomUser")%> 
          </td>
        </tr>
        <tr bordercolor="#000000" bgcolor="#FFFFFF"> 
        
          <td height="29" colspan="2"  align="center" class=texto>DATOS DEL TERCERO</td>
        
        </tr>
        <tr bordercolor="#000000" bgcolor="#FFFFFF"> 
          <td  class=texto>Nombre</td>
          <td class="texto" ><%=request.getParameter("txtCuenta")%> </td>
        </tr>
        <tr bordercolor="#000000" bgcolor="#FFFFFF"> 
          <td  class=texto  >RFC:&nbsp;&nbsp;</td>
          <td  class="texto" ><%=request.getParameter("txtRFC")%> </td>
        </tr>
        <tr bordercolor="#000000" bgcolor="#FFFFFF"> 
          <td  class=texto  >Numero de Convenio:&nbsp;&nbsp;</td>
          <td  class="texto" ><%=request.getParameter("txtConvenio")%> </td>
        </tr>       

      </table></td>
  </tr>
  <tr> 
    <td align="center"> 
	<table width="100%" >
        <tr> 
          <td >&nbsp;</td>
        </tr>
        <tr> 

        <tr> 
           <td class="textoNegrita" align="center"><%=sCaptura.equals("SI")?"Capturada":"Autorizada"%> por:</td>
        </tr>
        <tr> 
          <td align="center">&nbsp;</td>
        </tr>
        <tr> 
          <td align="center"> _______________________</td>
        </tr>
        <tr> 
          <td class="textoNegrita" ><div align="center"><b><%=(String)session.getAttribute("NomUser")%></b></div></td>
        </tr>

        <tr> 
          <td > 
            <%
			if(sCaptura.equals("NO") )
				{
	%>
            <table border="0" width="98%">
              <tr> 
                <td align="justify"  class="subtitulo" > <p> Recuerde que el alta 
                    del&nbsp;Tercero al fideicomiso est&aacute; sujeta a su verificaci&oacute;n y este tr&aacute;mite podr&aacute; tardar hasta 
                    3 d&iacute;as h&aacute;biles</p></td>
              </tr>
              <tr> 
                <td> <p   align="CENTER" class="alerta"> &nbsp; 
                    <%}%>
                  </p>
                  </td>
              </tr>
            </table>
            <p class="subtitulo" align="justify">&nbsp; </p>
          </td>
        </tr>
        <tr> 
          <td>&nbsp;</td>
        </tr>
          <td  align="center"> <input type="button" name="Imprimir"  class="boton" value="Imprimir"   onClick="javascript:imprimir()" > 
            &nbsp; <input type="button" name="Salir"  class="boton" value="Salir"   onClick="javascript:instrucciones()" ></td>
        </tr>
      </table></td>
  </tr>
</table>


</BODY>
</HTML>
<%}%>
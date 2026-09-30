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
//String detalleBit="";
 int tipo=Integer.parseInt(request.getParameter("tipo")!=null?request.getParameter("tipo").trim():"0");
String sCuerpo="";
String subject = "";


int existeCta = CTA.existeCuenta(request.getParameter("cveCuendep"),(String)session.getAttribute( "NumFid" ));

String clabe = "";
boolean bValidaCta=false;
String moneda=(request.getParameter("txtMoneda")!=null?request.getParameter("txtMoneda"):null);
String nmoneda=(moneda!=null?moneda.substring(0,moneda.indexOf("-")):"0");
String nombreBanco=(request.getParameter("txtNombreBanco")!=null?request.getParameter("txtNombreBanco"):"");


boolean bExisteCta=false;
boolean bRegistra=false;
try
{
	if(existeCta==1 ) 
  {
    bExisteCta=true;
    clabe = request.getParameter("txtCuenta");
  }
  else
  {
    clabe = request.getParameter("cveCuendep");
  }

	if(existeCta==0 ) 
		{
		session.setAttribute("msgError","Error al regiostrar la Cuenta<br>Por Favor, intenta mas tarde");
		%>
		<jsp:forward page="FI_Opciones.jsp"/>    
		<%   
		}
		
	if(existeCta==3 ) 
		{
		session.setAttribute("msgError","EL FIDEICOMISO YA TIENE SOLICITADA O ASIGNADA ESTA CUENTA");
		%>
		<jsp:forward page="FI_Opciones.jsp"/>    
		<%   
		}
			
	bValidaCta=CTA.validaCta(request.getParameter("txtCuenta"));					 
	 if( sCaptura.equals("NO") )
   {
		/**************************************************************Firma Digital***********************************************************/
		   %>		
		   <%@ include file="firmaDigital.jsp" %>
		   <%  
		/**************************************************************Fin Firma Digital********************************************************/
	 }						
	
	
	bRegistra=CTA.registraCuenta(					 request.getParameter("txtFolio"),
																 request.getParameter("txtNCuenta"),
																 (String)session.getAttribute("username"),
																 (String)session.getAttribute("NumFid"),
                                  nmoneda,
																  clabe,
																  request.getParameter("txtBanco"),
																  request.getParameter("txtPlaza2"),
																  request.getParameter("txtSucursal"),
																  request.getParameter("txtTitular"),
                                  request.getParameter("chTipoPersona"),
                                  ((request.getParameter("cbTipoPersona")!=null)?request.getParameter("cbTipoPersona"):"0"),
																  request.getParameter("txtRFC"),
																  bExisteCta,
																  //(sCaptura.equals("SI")?"CAPTURADA":"PENDIENTE"),
																 "PENDIENTE",
																  "");//detalleBit.toUpperCase());	       
  
  
  		if(!bRegistra)
					  {
					  session.setAttribute("msgError","La Cuenta no fue registrada<br>Intenta nuevamente");
						%>
							<jsp:forward page="FI_Opciones.jsp"/>     
						<%       
					   }
						
								subject = "Solicitud de Alta de Cuenta para Pago Interbancario";//request.getParameter();
								sCuerpo ="<HTML><HEAD><TITLE>Registro de Cuenta TEF - FiduciaWeb Movil: Encuesta</TITLE>"
											+ "<META content=\"text/html; charset=windows-1252\" http-equiv=Content-Type>"
											+"<META content=\"P?gina Principal\" name=0>"
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
											+"<tr><td width=800 height=12>&nbsp;&nbsp;&nbsp;&nbsp;Banco donde radica la cuenta:&nbsp;&nbsp;<b>"+request.getParameter("txtBanco")+"  - "+(nombreBanco==null?"":nombreBanco)+"</b></td></tr>"
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
        
           if (bRegistra &&  sCaptura.equals("NO") )
			  	{
			  Properties props = new Properties();
			  String fromAddress = "";
			  String toAddress = "";
			  %>		
	   		 <%@ include file="configuraMail.jsp" %>
   			 <% 
			  Session s = Session.getInstance(props,null);
			  Message message = new MimeMessage(s);	
			  InternetAddress from = new InternetAddress(fromAddress);
              InternetAddress to = new InternetAddress(toAddress);
			  message.setFrom(from);	
			  message.addRecipient(Message.RecipientType.TO, to);
			  message.setSubject(subject);
			  message.setHeader("X-Mailer","sendhtml");
			  message.setSentDate(new Date());
			  DataHandler data = new DataHandler(sCuerpo,"text/html");
			  message.setDataHandler(data);
			  Transport.send(message);
				}


%>
<%}
catch (Exception ex)
{
System.out.println("EEROR AL EN OPCIONES_2:"+ex);
}
finally {
%>

<HTML>
<HEAD>

<TITLE>Opciones - Solicitud de Alta de Cuenta CLABE</TITLE>

<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P?gina Principal" name=O>
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
            <%=sCaptura.equals("NO")?"SOLICITUD DE ALTA DE CUENTA CLABE":""%> 
            <%=sCaptura.equals("SI") ?"SOLICITUD  DE ALTA DE CUENTA CLABE EN ESPERA DE AUTORIZACION":""%> 
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

          <td height="29" colspan="2"  align="center" class=texto>DATOS CUENTA CLABE</td>

        </tr>
        <tr bordercolor="#000000" bgcolor="#FFFFFF"> 
            <td  class=texto> Moneda:&nbsp;&nbsp;</td>
            <td  class="texto"><%=moneda==null?"":moneda%> &nbsp; 
            </td>
        </tr>
        <tr bordercolor="#000000" bgcolor="#FFFFFF"> 
            <td  class=texto> Banco donde radica la cuenta:&nbsp;&nbsp;</td>
            <td  class="texto"><%=nombreBanco==null?"":nombreBanco%> &nbsp; 
            </td>
        </tr>
        <tr bordercolor="#000000" bgcolor="#FFFFFF"> 
          <td  class=texto>N&uacute;mero de Cuenta:&nbsp;&nbsp;</td>
          <td class="texto" ><%=request.getParameter("txtCuenta")%> </td>
        </tr>
  
        <tr bordercolor="#000000" bgcolor="#FFFFFF" > 
          <td  class=texto > Titular de la Cuenta:&nbsp;&nbsp;</td>
          <td class="texto" ><%=request.getParameter("txtTitular")%> </td>
        </tr>

        <tr bordercolor="#000000" bgcolor="#FFFFFF"> 
          <td  class=texto  >RFC:&nbsp;&nbsp;</td>
          <td  class="texto" ><%=request.getParameter("txtRFC")%> </td>
        </tr>

        <tr bordercolor="#000000" bgcolor="#FFFFFF"> 
          <td  class=texto  >Correo electronico:&nbsp;&nbsp;</td>
          <td  class="texto" ><%=(request.getParameter("txtCorreo").trim().equals("")?((String)session.getAttribute("Email") ):request.getParameter("txtCorreo"))%>&nbsp;</td>
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
                    de la cuenta al fideicomiso est&aacute; sujeta a su verificaci&oacute;n 
                    con su banco y este tr&aacute;mite podr&aacute; tardar hasta 
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
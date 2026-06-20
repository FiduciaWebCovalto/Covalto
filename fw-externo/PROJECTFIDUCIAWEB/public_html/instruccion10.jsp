<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<jsp:useBean id="BD"  class="com.bancomext.negocio.nInstrucciones"/>
<%@ page import="java.util.*,java.text.*"%>
<%@ include file="sesionInstrucc.jsp" %>
<%@ include file="pki.jsp" %>
<%@ include file="parametrosPKI.jsp" %>
<%
  String sImporte = request.getParameter("txtImporteTC")!=null?request.getParameter("txtImporteTC")  :"0";
	double impT= Double.valueOf(sImporte.replaceAll(",","").replaceAll(" ","")).doubleValue();
  String valCtoInverOrigen;      
  valCtoInverOrigen=((String)request.getParameter("cboContratoOrigenTC"));
  String valCtoInverDestino;      
  valCtoInverDestino=((String)request.getParameter("cboContratoDestinoTC"));
  String fechaValor = request.getParameter("fechaValor")!=null?request.getParameter("fechaValor"):fecha; 
  
  String valSubCtaOrigen[]=request.getParameter("cboSubCuentaOrigen").toString().split("-");
  String valSubCtaDestino[]=request.getParameter("cboSubCuentaDestino").toString().split("-");
    
	//VERIFICA QUE NO EXISTA UNA INSTRUCCION CON ESTE FOLIO
	if(BD.existeFolio(request.getParameter("txtFolio"),3))
		{
		session.setAttribute("msgError","Tu operaci�n no fue procesada<br>Por Favor, registrala nuevamente");
		%>
		<jsp:forward page="FI_Instrucciones.jsp"/>    
		<%     
		}
		
	   //se validan los saldos disponibles
    if(sCaptura.equals("NO"))
		{       	
	if(impT>0)
     		if(BD.getSaldoActualCtaCheques((String)session.getAttribute("NumFid"),valCtoInverOrigen,
      request.getParameter("cboSubCuentaOrigen").toString())< impT)
					{
					session.setAttribute("msgError","Tu operaci�n no fue registrada<br>El saldo en la cta de cheques origen es insuficiente");
					%>
					<jsp:forward page="FI_Instrucciones.jsp"/>    
					<%     
					}
		}
		
 if(sCaptura.equals("NO"))
   {
/**************************************************************Firma Digital***********************************************************/
   %>		
   <%@ include file="firmaDigital.jsp" %>
   <%  
/**************************************************************Fin Firma Digital********************************************************/
	 }			

    boolean     bInstruccion=false;
    boolean bFirmasMan=BD.firmasMancomunadas((String)session.getAttribute("NumFid"));

		 String[] bitacora = new String[4];
		 bitacora[0]=fecha;
		 bitacora[1]=Folio;
		 bitacora[2]=(String)session.getAttribute("username");
		 bitacora[3]="Traspaso por Internet con Folio: "+Folio+(sCaptura.equals("SI") || bFirmasMan ?"  y en espera de autorizaci�n":"");//;+detalleBit;
	 	 
		 String[] firmas = new String[5];
		 firmas[0]= sCaptura.equals("SI")?"1":"2";
		 firmas[1]= Folio;
		 firmas[2]= (String)session.getAttribute("NumFid");
		 firmas[3]= (String)session.getAttribute("NumUser");
		 firmas[4]= fecha;

		bInstruccion= BD.insertaTraspaso (fechaValor,
												 Folio,
												(String)session.getAttribute("NumFid"),
												(String)session.getAttribute( "NumUser" ) ,
												valCtoInverOrigen,
												valCtoInverDestino,
                        valSubCtaOrigen[0],valSubCtaDestino[0],
												request.getParameter("txtImporteTC"),
												"0",
												sCaptura.equals("NO")?"ACTIVO":"ESPERA",
												bitacora,firmas);
			if(!bInstruccion)
					  {
					  session.setAttribute("msgError","Tu operaci�n no fue procesada<br>Intenta nuevamente");
						%>
						<jsp:forward page="FI_Instrucciones.jsp"/>    
						<%       
						}												
															

	session.setAttribute("operacion",bInstruccion?"La Instruccion con Folio:"+Folio+ " fue registrada orrectamnete<br>Error al imprimir tu comprobante de la instruccion<br>Informale a tu ejecutivo de Cuenta":"La operacion no fue registrada, Intenta Nuevamente");		
									
	%>
<HTML><HEAD>
<TITLE>Instrucciones - FiduciaWeb Movil</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
<link href="styles/bancomext.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">
function instrucciones()
	{
		parent.location='FI_Instrucciones.jsp'
	}

function imprimir()
	{
		window.print();
		parent.location='FI_Instrucciones.jsp';
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
            <%=sCaptura.equals("NO") && !bFirmasMan?"SOLICITUD DE TRASPASO":""%> 
            <%=sCaptura.equals("SI") && !bFirmasMan?"SOLICITUD DE TRASPASO EN ESPERA DE AUTORIZACI�N":""%> 
            <%=sCaptura.equals("SI") && bFirmasMan?"SOLICITUD DE TRASPASO EN ESPERA DE LA 1ra.  FIRMA DE AUTORIZACI�N":""%> 
            <%=sCaptura.equals("NO") && bFirmasMan?"SOLICITUD DE TRASPASO EN ESPERA DE LA 2da. FIRMA DE AUTORIZACI�N":""%> 
          </td>
        </tr>
      </table></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td ><hr size="2"></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  align="right" class="textoNegrita">Fecha: <%=BD.getFecha()+"&nbsp;&nbsp;  "+BD.getHora() +" hrs."%></td>
  </tr>
  <tr bordercolor="#000000">
    <td  align="right" class="textoNegrita">&nbsp;</td>
  </tr>
</table>
<table width="70%" border="0" align="center">
  <tr> 
    <td align="center">
	<table width="100%" border="1" bordercolor="#FFFFFF">
        <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
          <td colspan="3" h><b class="subtitulo">Folio de Operaci&oacute;n: 
            <%=Folio%> </b></td>
        </tr>
        <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
          <td colspan="3" h><b class="subtitulo">Fecha de Operaci&oacute;n:
            <%=fechaValor%> </b></td>
        </tr>
        <tr bordercolor="#000000"> 
          <td width="166"  class="texto">Fideicomiso:</td>
          <td width="368"  class="texto"><%= session.getAttribute( "Fideicomiso" ) %></td>
        </tr>
        <tr bordercolor="#000000"> 
          <td class="texto">Cuenta&nbsp;Bancaria Origen:</td>
          <td class="texto"> 
            <%
		      	if(request.getParameter("cboContratoOrigenTC")!=null)
                        	out.print(request.getParameter("cboContratoOrigenTC"));
					%>
          </td>
        </tr>
        <tr bordercolor="#000000"> 
          <td class="texto">Subcuenta Origen:</td>
          <td class="texto"> 
            <%
		      	if(request.getParameter("cboSubCuentaOrigen")!=null)
                        	out.print(request.getParameter("cboSubCuentaOrigen"));
					%>
          </td>
        </tr>
        <tr bordercolor="#000000"> 
          <td class="texto">Cuenta&nbsp;Bancaria Destino:</td>
          <td class="texto"> 
            <%
			if(request.getParameter("cboContratoDestinoTC")!=null)
                        	out.print(request.getParameter("cboContratoDestinoTC"));
					%>
          </td>
        </tr>
         <tr bordercolor="#000000"> 
          <td class="texto">Subcuenta Destino:</td>
          <td class="texto"> 
            <%
		      	if(request.getParameter("cboSubCuentaDestino")!=null)
                        	out.print(request.getParameter("cboSubCuentaDestino"));
					%>
          </td>
        </tr>
        
        <tr bordercolor="#000000"> 
          <td  class="texto"> Importe   del traspaso:</td>
          <td class="texto">
            <%
			if(request.getParameter("txtImporteTC")!=null)
                        out.print(NumberFormat.getCurrencyInstance(Locale.US).format(Double.parseDouble(request.getParameter("txtImporteTC"))));%>
          </td>
        </tr>      
      </table> </td>
  </tr>
  <tr> 
    <td align="center">
    
    
    
    <table width="100%" height="38">
        <tr> 
          <td >&nbsp;</td>
        </tr>
          <tr> 
          <td class="textoNegrita" align="center"><%=sCaptura.equals("SI")?"Capturada":"Elaborada"%> por:</td>
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
        <!--INICIO APROBO-->
        <tr> 
          <td >&nbsp;</td>
        </tr>
        <tr> 
          <td >&nbsp;</td>
        </tr>
          <tr> 
          <td class="textoNegrita" align="center">Autorizada por:</td>
        </tr>       
        <tr> 
          <td align="center">&nbsp;</td>
        </tr>
        <tr> 
          <td align="center"> _______________________</td>
        </tr>
        <tr> 
          <td class="textoNegrita" ><div align="center"><b><%=(String)session.getAttribute("empresa_4")%></b></div></td>
        </tr>
        <!--FIN APROBO-->
        <%
        if (sCaptura.equals("NO") && !bFirmasMan)
        {
        %>
        <tr> 
          <td >&nbsp;</td>
        </tr>
        <!--tr> 
          <td > <p class="subtitulo" align="justify"> 
			  La aplicaci&oacute;n de este traspaso est&aacute; 
              sujeta a la recepci&oacute;n de su notificaci&oacute;n por este 
              medio, a m&aacute;s tardar a las 12:30 horas. En caso de requerir 
              inversiones en valores gubernamentales, la notificaci&oacute;n deber&aacute; 
              realizarse antes de las 10:30 horas. 
			  </p>
            <p class="subtitulo" align="justify"> 
			  Los traspasos solicitados y notificados fuera 
              de ese horario se realizar&aacute;n al siguiente d&iacute;a h&aacute;bil 
            </p>
            </tr-->
        <%
        }
        %>
        <tr> 
          <td >&nbsp;</td>
        </tr>
        <tr> 
          <td  class="texto" align="center"> <input type="button" name="Imprimir"  class="boton" value="Imprimir"   onClick="javascript:imprimir()" > 
            &nbsp; <input type="button" name="Salir"  class="boton" value="Salir"   onClick="javascript:instrucciones()" > 
          </td>
        </tr>
      </table>
    </td>
  </tr>
</table>
</BODY>
</HTML>

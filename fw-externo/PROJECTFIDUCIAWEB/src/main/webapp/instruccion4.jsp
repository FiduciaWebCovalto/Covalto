<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.text.*,java.util.*"%>
<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.nInstrucciones"/>
<jsp:useBean id="Formato"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<jsp:useBean id="Moneda"  class="mx.com.inscitech.clients.negocio.nConsultas"/>
<%@ include file="sesionInst4.jsp" %>
<%@ include file="pki.jsp" %>
<%@ include file="parametrosPKI.jsp" %>
<% 
	//VERIFICA QUE NO EXISTA UNA INSTRUCCION CON ESTE FOLIO
	if(BD.existeFolio(request.getParameter("txtFolio"),4))
		{
		session.setAttribute("msgError","Tu operaci�n no fue procesada<br>Por Favor, registrala nuevamente");
		%>
		<jsp:forward page="FI_Instrucciones.jsp"/>    
		<%     
		}

/**************************************************************Firma Digital***********************************************************/
   %>		
   <%@ include file="firmaDigital.jsp" %>
   <%  
/**************************************************************Fin Firma Digital********************************************************/

  String fechaValor = request.getParameter("fechaValor")!=null?request.getParameter("fechaValor"):fecha; 
     String[] bitacora = new String[4];
	 bitacora[0]=fecha;
	 bitacora[1]=Folio;
	 bitacora[2]=(String)session.getAttribute("username");
	 bitacora[3]="Pago de Honorarios por Internet con Folio: "+Folio+detalleBit;

 DecimalFormat num = new DecimalFormat("############0.00");
// double importe=Double.valueOf( ((String)request.getParameter("txtImportePH")) ).doubleValue();
Moneda.setVtrStrDato1((String)request.getParameter("txtNomMoneda")!=null?(String)request.getParameter("txtNomMoneda"):"MONEDA NACIONAL" );
Moneda.querySelect(49);
int cveMoneda = Moneda.getVtrIntDato1();
 boolean bInstruccion=false;
 bInstruccion=BD.insertaPagoHonorarios(
								(String)session.getAttribute("NumFid"),
								(String)request.getParameter("cboCuentaPH"),
								(String)request.getParameter("cboContratoPH"),
								//num.format(importe),
                (String)request.getParameter("txtImportePH"),
								Folio,bitacora,fechaValor,String.valueOf(cveMoneda));	

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
	parent.location='FI_Instrucciones.jsp';
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
            AVISO DE PAGO DE HONORARIOS FIDUCIARIOS </td>
        </tr>
      </table></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td ><hr size="2"></td>
  </tr>
  <tr bordercolor="#000000">
    <td  align="right" class="textoNegrita">Fecha:<%=BD.getFecha()+"&nbsp;&nbsp;  "+BD.getHora() +" hrs."%></td>
  </tr>
  <tr bordercolor="#000000"> 
    <td  align="right" class="textoNegrita">&nbsp;</td>
  </tr>
</table>
<table width="70%" border="0" align="center">
  <tr> 
    <td align="center">
	<table width="100%"  border="1" bordercolor="#FFFFFF">
        <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
          <td colspan="2" class="subtitulo">Folio de Operaci&oacute;n: <%=Folio%></td>
        </tr>
        <tr bordercolor="#000000"> 
          <td width="203"  class="texto">Fideicomiso:</td>
          <td width="331"  class="texto"><%= session.getAttribute( "Fideicomiso" ) %></td>
        </tr>
        <%if(request.getParameter("cboCuentaPH")!=null&&request.getParameter("cboContratoPH")==null) 
			{%>
        <tr bordercolor="#000000"> 
          <td class="texto">Cuenta <%=session.getAttribute("empresa_9")%> en la que se Deposito:</td>
          <td class="texto"> <%=request.getParameter("cboCuentaPH")%></td>
        </tr>
        <%}%>
        <%if(request.getParameter("cboCuentaPH")==null&&request.getParameter("cboContratoPH")!=null) 
			{%>
        <tr bordercolor="#000000"> 
          <td  class="texto"> Descontar del Contrato:</td>
          <td  class="texto"> <%=request.getParameter("cboContratoPH")%></td>
        </tr>
        <%}%>
        <tr bordercolor="#000000"> 
          <td  class="texto" width="22%"> Divisa:</td>
          <td  class="texto" width="58%"> 
            <%=request.getParameter("txtNomMoneda")%>
          </td>
        </tr>        
        <tr bordercolor="#000000"> 
          <td class="texto"> Importe del Pago de Honorarios:</td>
          <td class="texto"> 
            <%
					if(request.getParameter("txtImportePH")!=null)
                        	//out.print(NumberFormat.getCurrencyInstance(Locale.US).format( NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImportePH")).doubleValue() ));
                            //out.print(NumberFormat.getCurrencyInstance(Locale.US).format(Double.parseDouble(request.getParameter("txtImportePH"))));
                            //out.print(Formato.muestraImporte((String)request.getParameter("txtImportePH")));
                            out.print((String)request.getParameter("txtImportePH"));
					%>
            (incluye IVA)</td>
        </tr>
      </table> 
	</td>
  </tr>
  <tr> 
    <td align="center">
	
	<table width="100%" height="38">
            <!--tr> 
          <td class="texto"> 
            <%if(request.getParameter("cboContratoPH")==null)
	     {%>
            <p class="subtitulo" align="justify"> 
			  La aplicaci&oacute;n de este pago est&aacute; 
              sujeta a la recepci&oacute;n de los recursos en la cuenta indicada 
              y a su notificaci&oacute;n por este medio, a mas tardar a las 12:30 
              horas de su fecha. 
			  </p>
             <p class="subtitulo" align="justify"> 
			 Los pagos recibidos y notificados fuera de ese 
              horario se aplicar&aacute;n al siguiente d&iacute;a h&aacute;bil. 
            </p>
            <%}%>
          </td>
        </tr-->
        <tr> 
          <td>&nbsp;</td>
        </tr>
        <tr> 
           
          <td class="texto" align="center"> <input type="button" name="Imprimir"  class="boton" value="Imprimir"   onClick="javascript:imprimir()" > 
            &nbsp; <input type="button" name="Salir"  class="boton" value="Salir"   onClick="javascript:instrucciones()" > 
          </td>
        </tr>
      </table> </td>
  </tr>
</table>
</BODY>
</HTML>




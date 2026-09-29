<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<jsp:useBean id="BD"  class="com.bancomext.negocio.nInstrucciones"/>
<jsp:useBean id="secuencial"  class="com.bancomext.negocio.nServicios"/>
<%@ page import="java.util.*,java.text.*"%>
<%@ include file="sesionInstrucc.jsp" %>
<%@ include file="pki.jsp" %>
<%@ include file="configura_bus.jsp" %>
<%@ include file="parametrosPKI.jsp" %>
<%

    String fechaValor = request.getParameter("fechaValor")!=null?request.getParameter("fechaValor"):fecha; 
    
    String temporal = request.getParameter("cboFormaInversion");
    int idFormaInversion = temporal != null && !"-1".equals(temporal) ? Integer.parseInt(temporal.substring(0, 1)) : -1;
    int cveConcepto=0;
    String cboFormaInversion = ((String)request.getParameter("cboFormaInversion"));
    String cboConcepto = ((String)request.getParameter("cboConcepto"));
    String txtObservaciones = ((String)request.getParameter("txtObservaciones"));
    String txtMonto = ((String)request.getParameter("txtMonto"));
    secuencial.setVtrStrDato1(cboConcepto);
    secuencial.querySelect(12);
    secuencial.setIndex(0);
    cveConcepto=Integer.valueOf(secuencial.getVtrStrDato2()).intValue();
    // Campos para cambio tipo, plazo y/o instrumento de inversi&oacute;n
    String txtTipoInstrumentoOriginal = ((String)request.getParameter("txtTipoInstrumentoOriginal"));
    String txtTipoInstrumentoNuevo = ((String)request.getParameter("txtTipoInstrumentoNuevo"));
    String cboContratoOrigen = ((String)request.getParameter("cboContratoOrigen"));
    String cboContratoDestino = ((String)request.getParameter("cboContratoDestino"));
    String txtCajonIndeval = ((String)request.getParameter("txtCajonIndeval"));
    String txtPlazoNuevoRequerido = ((String)request.getParameter("txtPlazoNuevoRequerido"));
    String txtInstitucion = ((String)request.getParameter("txtInstitucion"));
    String txtContratoBursatil = ((String)request.getParameter("txtContratoBursatil"));
    
    // Campos para traspaso de títulos
    String cboCuentaInversionOrigen = ((String)request.getParameter("cboCuentaInversionOrigen"));
    String cboCuentaInversionDestino = ((String)request.getParameter("cboCuentaInversionDestino"));
    
    // Campos para compra
    String cboCuentaCargo = ((String)request.getParameter("cboCuentaCargo"));
    String cboContratoInversion = ((String)request.getParameter("cboContratoInversion"));
    String cboDivisa = ((String)request.getParameter("cboDivisa"));
    String txtNombreBeneficiario = ((String)request.getParameter("txtNombreBeneficiario"));
    String cboTipoInstrumento = ((String)request.getParameter("cboTipoInstrumento"));
    String txtClavePizarra = ((String)request.getParameter("txtClavePizarra"));
    String txtPlazo = ((String)request.getParameter("txtPlazo"));
    String txtLiquidez = ((String)request.getParameter("txtLiquidez"));
    String txtPrecioTecho = ((String)request.getParameter("txtPrecioTecho"));
    String txtPrecioPiso = ((String)request.getParameter("txtPrecioPiso"));
    String cboPrecioMercado = ((String)request.getParameter("cboPrecioMercado"));

	//VERIFICA QUE NO EXISTA UNA INSTRUCCION CON ESTE FOLIO
	if(BD.existeFolio(request.getParameter("txtFolio"),3))
		{
		session.setAttribute("msgError","Tu operaci�n no fue procesada<br>Por Favor, registrala nuevamente");
		%>
		<jsp:forward page="FI_Instrucciones.jsp"/>    
		<%     
		}
		
    boolean     bInstruccion=false;

		 String[] bitacora = new String[4];
		 bitacora[0]=fecha;
		 bitacora[1]=Folio;
		 bitacora[2]=(String)session.getAttribute("username");
		 bitacora[3]="Inversion por Internet con Folio: "+Folio;//;+detalleBit;
	 	 
		 String[] firmas = new String[5];
		 firmas[0]= sCaptura.equals("SI")?"1":"2";
		 firmas[1]= Folio;
		 firmas[2]= (String)session.getAttribute("NumFid");
		 firmas[3]= (String)session.getAttribute("NumUser");
		 firmas[4]= fecha;


                bInstruccion = BD.insertaInversion(
                          fechaValor,
                          Folio,
                          (String)session.getAttribute("NumFid"),
                          idFormaInversion+"",
                          cveConcepto+"",
                          txtObservaciones,              
                          txtMonto,
                          cboTipoInstrumento,
                          txtTipoInstrumentoOriginal,
                          txtTipoInstrumentoNuevo,
                          cboContratoOrigen,
                          cboContratoDestino,
                          txtCajonIndeval,
                          txtPlazoNuevoRequerido,
                          txtInstitucion,
                          txtContratoBursatil,
                          "sMoneda",
                          "sTipoPersona",
                          txtNombreBeneficiario,
                          txtClavePizarra,
                          txtLiquidez,
                          txtPrecioTecho,
                          txtPrecioPiso,
                          cboPrecioMercado,
                          (String)session.getAttribute("NumUser"),bitacora);
 %>
      <script>
        sendEmail( "<%=(String)session.getAttribute("username")%>",
        <%=(String)request.getParameter("txtFolio")%> ,'INVERSION',
        "<%=(String)request.getParameter("txtMonto")%>",
        "<%=(String)request.getParameter("cboConcepto")%>");
      </script>
      <%
		
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
<jsp:include page="header.jsp"/>
<jsp:include page="NuevoMenu.jsp"/>
<div class="table-responsive">
    <table id="fisosDisponibles"  class="table table-responsive table-hover">
            <thead class="table-primary" align="center">
                <tr>
                    <th>&nbsp;</th>
                    <th><h1 class="display-3">DIRECCION FIDUCIARIA</h1></th>
                    <th>&nbsp;</th>
                </tr>
                <tr>
                    <th>&nbsp;</th>
                    <th><h1 class="display-4">AVISO DE INVERSION</h1></th>
                    <th>&nbsp;</th>
                </tr>
            </thead>
    </table>
    <table id="fisosDisponibles"  class="table table-responsive table-hover">
        <thead class="table-primary" align="left">
            <tr>
                <th>&nbsp;</th>
                <th>Fecha de Operaci&oacute;n: <%=fechaValor%></th>
                <th>&nbsp;</th>
            </tr>
            <tr>
                <th>&nbsp;</th>
                <th>Folio de Operaci&oacute;n: <%=Folio%></th>
                <th>&nbsp;</th>
            </tr>
        </thead>
        <tbody>
            <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
            <td width="35%">Forma de Inversi&oacute;n:</td>
            <td width="65%" ><%=cboFormaInversion.split("-")[1]%></td>
            </tr>
            <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
            <td width="35%">Concepto:</td>
            <td width="65%"><%=cboConcepto%>
            </tr>
            <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
            <td width="35%">Observaciones:</td>
            <td width="65%"><%=txtObservaciones%>
            </tr>
            <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
            <td width="35%">Monto en N&uacute;mero / N&uacute;mero de T&iacute;tulos:</td>
            <td width="65%"><%=txtMonto%>
            </tr>
            
            <% if(idFormaInversion == 1) { %>
            <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
            <td width="35%">Tipo de Instrumento Original:</td>
            <td width="65%"><%=txtTipoInstrumentoOriginal%>
            </tr>
            <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
            <td width="35%">Tipo de Instrumento al que se Requiere Cambiar:</td>
            <td width="65%"><%=txtTipoInstrumentoNuevo%>
            </tr>
            <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
            <td width="35%">Cuenta de Inversi&oacute;n Origen:</td>
            <td width="65%"><%=cboContratoOrigen%>
            </tr>
            <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
            <td width="35%">Cuenta de Inversi&oacute;n Destino:</td>
            <td width="65%"><%=cboContratoDestino%>
            </tr>
            <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
            <td width="35%">Caj&oacute;n de Indeval:</td>
            <td width="65%"><%=txtCajonIndeval%>
            </tr>
            <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
            <td width="35%">Plazo Nuevo Requerido (en d&iacute;as):</td>
            <td width="65%"><%=txtPlazoNuevoRequerido%>
            </tr>
            <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
            <td width="35%">Instituci&oacute;n:</td>
            <td width="65%"><%=txtInstitucion%>
            </tr>
            <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
            <td width="35%">Contrato Burs&aacute;til:</td>
            <td width="65%"><%=txtContratoBursatil%>
            </tr>
            <%} else if(idFormaInversion == 2) {%>
            <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
            <td width="35%">Cuenta de Inversi&oacute;n Origen:</td>
            <td width="65%"><%=cboCuentaInversionOrigen%>
            </tr>
            <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
            <td width="35%">Cuenta de Inversi&oacute;n Destino:</td>
            <td width="65%"><%=cboCuentaInversionDestino%>
            </tr>
            <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
            <td width="35%">Caj&oacute;n de Indeval:</td>
            <td width="65%"><%=txtCajonIndeval%>
            </tr>
            <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
            <td width="35%">Instituci&oacute;n:</td>
            <td width="65%"><%=txtInstitucion%>
            </tr>
            <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
            <td width="35%">Contrato Burs&aacute;til:</td>
            <td width="65%"><%=txtContratoBursatil%>
            </tr>
            <%} else if(idFormaInversion == 3) {%>
            <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
            <td width="35%">Cuenta Cargo:</td>
            <td width="65%"><%=cboCuentaCargo%>
            </tr>
            <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
            <td width="35%">Contrato de Inversi&oacute;n:</td>
            <td width="65%"><%=cboContratoInversion%>
            </tr>
            <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
            <td width="35%">Divisa:</td>
            <td width="65%"><%=cboDivisa%>
            </tr>
            <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
            <td width="35%">Nombre del Beneficiario:</td>
            <td width="65%"><%=txtNombreBeneficiario%>
            </tr>
            <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
            <td width="35%">Tipo de Instrumento:</td>
            <td width="65%"><%=cboTipoInstrumento%>
            </tr>
            <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
            <td width="35%">Clave de Pizarra:</td>
            <td width="65%"><%=txtClavePizarra%>
            </tr>
            <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
            <td width="35%">Plazo:</td>
            <td width="65%"><%=txtPlazo%>
            </tr>
            <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
            <td width="35%">Liquidez:</td>
            <td width="65%"><%=txtLiquidez%>
            </tr>
            <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
            <td width="35%">Precio Techo:</td>
            <td width="65%"><%=NumberFormat.getCurrencyInstance(Locale.US).format(NumberFormat.getInstance(Locale.US).parse(txtPrecioTecho).doubleValue())%>
            </tr>
            <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
            <td width="35%">Precio Piso:</td>
            <td width="65%"><%=NumberFormat.getCurrencyInstance(Locale.US).format(NumberFormat.getInstance(Locale.US).parse(txtPrecioPiso).doubleValue())%>
            </tr>
            <tr bordercolor="#000000" bgcolor="#CCCCCC"> 
            <td width="35%">Precio de Mercado:</td>
            <td width="65%"><%=cboPrecioMercado%>
            </tr>
            <%}%>     

                <tr> 
                 <td >&nbsp;</td>
                  <td >&nbsp;</td>
                  <td >&nbsp;</td>
                </tr>           
                <tr> 
                 <td >&nbsp;</td>
                   <td><%=sCaptura.equals("SI")?"Capturada":"Elaborada"%> por:</td>
                    <td >&nbsp;</td>
                </tr>
                <tr> 
                 <td >&nbsp;</td>
                  <td >&nbsp;</td>
                   <td >&nbsp;</td>
                </tr>
                <tr> 
                 <td >&nbsp;</td>
                  <td> _______________________</td>
                   <td >&nbsp;</td>
                </tr>
                <tr> 
                 <td >&nbsp;</td>
                  <td><div><b><%=(String)session.getAttribute("NomUser")%></b></div></td>
                   <td >&nbsp;</td>
                </tr>
                <!--INICIO APROBO-->
                <tr> 
                 <td >&nbsp;</td>
                  <td >&nbsp;</td>
                  <td >&nbsp;</td>
                </tr>
                  <tr > 
                   <td >&nbsp;</td>
                  <td>Autorizada por:</td>
                   <td >&nbsp;</td>
                </tr>       
                <tr> 
                 <td >&nbsp;</td>
                  <td >&nbsp;</td>
                  <td>&nbsp;</td>
                </tr>
                <tr> 
                 <td >&nbsp;</td>
                  <td> _______________________</td>
                   <td >&nbsp;</td>
                </tr>
                <tr > 
                 <td >&nbsp;</td>
                  <td><div><b>&nbsp;<%=(String)session.getAttribute("empresa_4")%></b></div></td>
                   <td >&nbsp;</td>
                </tr>
                <tr> 
                  <td>&nbsp;</td>
                   <td >&nbsp;</td>
                    <td >&nbsp;</td>
                </tr>
                <tr>
                 <td >&nbsp;</td>
                  <td  align="center"> 
                    <input type="button" name="Imprimir"   class="btn btn-info" value="Imprimir"   onClick="javascript:imprimir()" > 
                    </td>
                     <td >&nbsp;</td>
                </tr>                

        </tbody>
     </table>   
</div>    
</BODY>
</HTML>

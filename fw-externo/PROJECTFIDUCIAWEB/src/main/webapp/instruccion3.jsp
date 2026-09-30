<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.nInstrucciones"/>
<%@ page import="java.util.*,java.text.*"%>
<%@ include file="sesionInstrucc.jsp" %>
<%@ include file="pki.jsp" %>
<%@ include file="configura_bus.jsp" %>
<%@ include file="parametrosPKI.jsp" %>
<%
  String sImporte = request.getParameter("txtImporteTC")!=null?request.getParameter("txtImporteTC"):"0";
	double impT= Double.valueOf(sImporte.replaceAll(",","").replaceAll(" ","")).doubleValue();
  String[] valCtoInverOrigen;      
  valCtoInverOrigen=((String)request.getParameter("cboContratoOrigenTC")).split("-");
  String[] valCtoInverDestino;      
  valCtoInverDestino=((String)request.getParameter("cboContratoDestinoTC")).split("-");
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
     		if(false)//if(BD.getSaldoActual((String)session.getAttribute("NumFid"),(valCtoInverOrigen[0]!=null?valCtoInverOrigen[0]:"0")  )< impT)
					{
					session.setAttribute("msgError","Tu operaci�n no fue registrada<br>El saldo en el contrato de inversi�n origen es insuficiente");
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
												"1",////(String)session.getAttribute( "NumUser" ) ,
												valCtoInverOrigen[0],
												valCtoInverDestino[0],
                        valSubCtaOrigen[0],valSubCtaDestino[0],
												request.getParameter("txtImporteTC"),
												"0",
												sCaptura.equals("NO")?"ACTIVO":"ESPERA",
								bitacora,firmas);
                        %>
                        <script>
                        sendEmail( "<%=(String)session.getAttribute("username")%>",
                        <%=(String)request.getParameter("txtFolio")%> ,'TRASPASO',
                        "<%=(String)request.getParameter("txtImporteTC")%>",
                        "Del contrato <%=(String)request.getParameter("cboSubCuentaOrigen")%> al Contrato Destino <%=(String)request.getParameter("cboContratoDestinoTC")%>");
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
                    <th><h1 class="display-4">AVISO RETIRO</h1></th>
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
        </thead  align="left">
        <tbody> 
            <tr> 
            <td>&nbsp;</td>
              <td >Fideicomiso:</td>
              <td   ><%= session.getAttribute( "Fideicomiso" ) %></td>
            </tr>
            <tr> 
            <td>&nbsp;</td>
              <td >Contrato  de inversi&oacute;n Origen:</td>
              <td > 
                <%
                            if(request.getParameter("cboContratoOrigenTC")!=null)
                                    out.print(request.getParameter("cboContratoOrigenTC"));
                                            %>
              </td>
            </tr>
            <tr> 
            <td>&nbsp;</td>
              <td >Subcuenta Origen:</td>
              <td > 
                <%
                            if(request.getParameter("cboSubCuentaOrigen")!=null)
                                    out.print(request.getParameter("cboSubCuentaOrigen"));
                                            %>
              </td>
            </tr>
            <tr> 
            <td>&nbsp;</td>
              <td >Contrato de inversi&oacute;n  Destino:</td>
              <td > 
                <%
                            if(request.getParameter("cboContratoDestinoTC")!=null)
                                    out.print(request.getParameter("cboContratoDestinoTC"));
                                            %>
              </td>
            </tr>
            <tr> 
            <td>&nbsp;</td>
              <td >Subcuenta Destino:</td>
              <td > 
                <%
                            if(request.getParameter("cboSubCuentaDestino")!=null)
                                    out.print(request.getParameter("cboSubCuentaDestino"));
                                            %>
              </td>
            </tr>
            <tr> 
            <td >&nbsp;</td>
              <td  > Importe   del traspaso:</td>
              <td >
                <%
                            if(request.getParameter("txtImporteTC")!=null)
                            out.print(NumberFormat.getCurrencyInstance(Locale.US).format(Double.parseDouble(request.getParameter("txtImporteTC"))));%>
              </td>
            </tr>  
            
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

<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.util.*,java.text.*"%>
<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.nInstrucciones"/>
<jsp:useBean id="Correo"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<jsp:useBean id="BD2"  class="mx.com.inscitech.clients.negocio.nFiducia"/>
<jsp:useBean id="Alerta"  class="mx.com.inscitech.clients.negocio.nInstrucciones"/>
<%@ include file="sesionInst1.jsp" %>
<%@ include file="pki.jsp" %>
<%@ include file="configura_bus.jsp" %>
<%@ include file="parametrosPKI.jsp" %>

<%   

	//VERIFICA QUE NO EXISTA UNA INSTRUCCION CON ESTE FOLIO
	if(BD.existeFolio(request.getParameter("txtFolio"),1))
		{
		session.setAttribute("msgError","Tu operaci�n no fue procesada<br>Por Favor, registrala nuevamente");
		%>
		<jsp:forward page="FI_Instrucciones.jsp"/>    
		<%     
		}


		   
   boolean bInstruccion=false;
   boolean bFirmasMan=false;
   String persona = "";
   String tipoPers = "";
   String fechaValor = request.getParameter("fechaValor")!=null?request.getParameter("fechaValor"):fecha; 
   String[] bitacora = new String[4];
	 bitacora[0]=fecha;
	 bitacora[1]=Folio;
	 bitacora[2]=(String)session.getAttribute("username");
	 bitacora[3]="Deposito por Internet con Folio: "+Folio+(sCaptura.equals("SI") || bFirmasMan ?"  y en espera de autorizaci�n":"");//+detalleBit;
	 
	 String[] firmas = new String[5];
	 firmas[0]= sCaptura.equals("SI")?"1":"2";
	 firmas[1]= Folio;
	 firmas[2]= (String)session.getAttribute("NumFid");
	 firmas[3]= (String)session.getAttribute("NumUser");
	 firmas[4]= fecha;	 
   
   String folioRcp = BD2.getFolio(22);
   String folioAgenda = BD2.getFolio(1);
   
   
   persona = (String)request.getParameter("cboPersona");
   
   tipoPers = (String)request.getParameter("txtTipoPers");             
   
       
   String[] Datos = new String[26];
   Datos[0] = folioRcp; //Folio Recepci�n
   Datos[1] = Folio; //Folio
   Datos[2] = "0";//(String)request.getParameter("txtNumOper"); //Num Oper. 
   Datos[3] = (String)session.getAttribute("NumFid"); //Fideicomiso
   Datos[4] = (String)request.getParameter("txtCveParam1"); // Destino
   
   Datos[5] = request.getParameter("txtNumTipoPersona"); // Numero Persona
   Datos[6] = request.getParameter("txtNomTipoPersona"); //Nombre Persona
   Datos[7] = (request.getParameter("txtTipoPersona").equals("1")?"FIDEICOMITENTE":request.getParameter("txtTipoPersona").equals("2")?"FIDEICOMISARIO":"TERCERO"); // Tipo Persona 
   System.out.println("NumTipoPersona= "+Datos[5]);
   System.out.println("NomTipoPersona= "+Datos[6]);
   System.out.println("TipoPersona= "+Datos[7]);
   String cveFormaLiq=request.getParameter("cboFormaR")!=null?(String)request.getParameter("cboFormaR"):"";
   
   Datos[8] = (String)request.getParameter("txtCveParam2"); // Tipo Recepcion
   Datos[9] = (String)request.getParameter("txtImporteD"); // Importe
   Datos[10] = (String)request.getParameter("txtCveMoneda"); //Moneda
   Datos[11] = (String)request.getParameter("txtnumBanco"); //Num. Banco
   Datos[12] = (String)request.getParameter("txtsNomBco"); //Nom. Banco
   Datos[13] = (String)request.getParameter("cboInstrumentoD"); // Instrumento
   Datos[14] = (String)request.getParameter("cboConceptoD"); // Concepto
   Datos[15] = (String)request.getParameter("txtConceptoD"); // Descripcion
   Datos[16] = (String)request.getParameter("txtsNumCta"); // Num. Cta.
   Datos[17] = fechaValor;   //fecha
   Datos[18] = (String)request.getParameter("txtNumIntermed"); // Val. intermediario
   
    //Se obtiene la moneda
    String cboContratoD=request.getParameter("cboContratoD").equals("Selecciona Contrato")?"0":(String)request.getParameter("cboContratoD");
    if(cboContratoD.equals("Selecciona Contrato")){
       cboContratoD="0-0";
    }
    String[] valCtoInver;      
    valCtoInver=cboContratoD.split("-");
   
   Datos[19] = valCtoInver[0]; // Cto. Inv.
   Datos[20] = folioAgenda; //Folio Agenda
   Datos[21] = (String)request.getParameter("txtCotizacion"); //Cotizacion
   Datos[22] = request.getParameter("cboCtaCheques").equals("Selecciona Cuenta de Cheque")?"0":(String)request.getParameter("cboCtaCheques"); //Cotizacion
       String auxNumSubCta;
       String[] numSubCta=null;
   auxNumSubCta=((String)request.getParameter("cboSubCtas")).equals("Selecciona una Subcta")||
   request.getParameter("cboSubCtas")==null?"0-0":request.getParameter("cboSubCtas"); //SubCtas
   numSubCta=auxNumSubCta.split("-");
   Datos[23] = numSubCta[0];
   Datos[24] = (String)request.getParameter("txtNomMoneda"); // nombre moneda
   Datos[25] = (String)request.getParameter("txtFormaLiq"); // nombre instrumento

     //Inserta Dep�sito  
     bInstruccion = BD.insertaDeposito(Datos,bitacora,firmas);  
	 System.out.println("Forma de Deposito"+ cveFormaLiq);
	 if(cveFormaLiq!=null)
		if(cveFormaLiq.equals("24")){ 
			 String sNumeroCheque=request.getParameter("txtNumeroChequeHidden")!=null?(String)request.getParameter("txtNumeroChequeHidden"):""; 
			 String sNombreBeneficiario=request.getParameter("txtNombreBeneficiarioHidden")!=null?(String)request.getParameter("txtNombreBeneficiarioHidden"):""; 
			bInstruccion = BD.insertaDepositoComp(1,Datos[3],Folio,sNumeroCheque,sNombreBeneficiario);  
			System.out.println("Resultado insertaDepositoComp "+bInstruccion);
		}	

    //String sClasifica=Alerta.getAlertamiento(Folio);
      if(bInstruccion){
      %>
      <script>
        sendEmail( "<%=(String)session.getAttribute("username")%>",
        <%=(String)request.getParameter("txtFolio")%> ,'DEPOSITO',
        "<%=(String)request.getParameter("txtImporteD")%>",
        "<%=(String)request.getParameter("cboConceptoD")%>");
      </script>
      <%
      }    
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

<link href="styles/nafin.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">

function instrucciones()
	{
	parent.location='FI_Instrucciones.jsp'
	}

function imprimir()
{
window.print();
}
</script>
<script> 
function window.onbeforeprint()
{ 
Imprimir.style.visibility = 'hidden';
} 
function window.onafterprint(){ 
Imprimir.style.visibility = 'visible';
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
                    <th><h1 class="display-4">AVISO DEPOSITO</h1></th>
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
        <tr> 
          <td>&nbsp;</td>
          <td width="38%"  class="texto">Fideicomiso:</td>
          <td width="62%" class="texto"><%= session.getAttribute( "Fideicomiso" ) %></td>
        </tr>

        <tr> 
        <td>&nbsp;</td>
          <td  class="texto"> Divisa:</td>
          <td  class="texto"> 
            <%=request.getParameter("txtNomMoneda")%>
          </td>
        </tr>

        <tr> 
        <td>&nbsp;</td>
          <td  class="texto"> Importe del deposito:</td>
          <td  class="texto"> 
            <%
			if(request.getParameter("txtImporteD")!=null)
                        out.print(NumberFormat.getCurrencyInstance(Locale.US).format(Double.parseDouble(request.getParameter("txtImporteD"))));%>
          </td>
        </tr>

       <%if(Integer.valueOf((String)request.getParameter("txtCveMoneda")).intValue()!=1){%> 
        <tr> 
        <td>&nbsp;</td>
          <td  class="texto"> Tipo de cambioProvisional:</td>
          <td  class="texto"> 
            <%
			if(request.getParameter("txtTipoCambio")!=null)
                        out.print(NumberFormat.getCurrencyInstance(Locale.US).format(Double.parseDouble(request.getParameter("txtTipoCambio"))));%>
          </td><%}%>
      
<tr> 
<td>&nbsp;</td>
          <td class="texto"> Concepto del deposito:</td>
          <td  class="texto"> 
            <%
			if(!request.getParameter("cboConceptoD").equals("")&&request.getParameter("txtConceptoD").equals(""))
         out.print(request.getParameter("cboConceptoD"));
			else if(!request.getParameter("txtConceptoD").equals(""))
         out.print(request.getParameter("cboConceptoD") + "/" +request.getParameter("txtConceptoD"));
			%>
          </td>
      <% 
        if(Integer.parseInt((String)session.getAttribute("TpoCont")) == 1 ) {
      %>    
      
         <tr> 
         <td>&nbsp;</td>
          <td  class="texto" > Persona que deposita:</td>
          <td class="texto"> 
            <%
			         if(request.getParameter("cboPersona")!=null)
                  out.print(request.getParameter("cboPersona"));%>
          </td>
        </tr>
      
      <% } %>     
        </tr>
       
        <tr> 
        <td>&nbsp;</td>
          <td  class="texto" > Tipo de Persona</td>
          <td class="texto"> 
            <%
			if(request.getParameter("txtTipoPersona")!=null)
            	out.print(Datos[7]);
            %>
          </td>
        </tr>
         <tr> 
         <td>&nbsp;</td>
          <td  class="texto" > Persona</td>
          <td class="texto"> 
            <%
			if(request.getParameter("txtNomTipoPersona")!=null)
            out.print(Datos[6]);
            %>
          </td>
        </tr>
        <%
             if(!request.getParameter("cboSubCtas").equals("Selecciona una Subcta")){
        %>
             <tr> 
             <td>&nbsp;</td>
              <td  class="texto"> SubCta:</td>
              <td  class="texto"> <%=request.getParameter("cboSubCtas")%></td>
            </tr>
        <%
           }
        %>       
        <tr>
        <td>&nbsp;</td>
  <%
          if(request.getParameter("cboContratoD").equals("0-0")){
  %>
          <td  class="texto" > Abono a la Cta de Cheque No:</td>
          <td class="texto">
  <%
              out.print(request.getParameter("cboCtaCheques"));
   %>
          </td>
   <%
          }else{
   %>
          <td  class="texto" > Abono al Contrato de Inversi&oacute;n No.:</td>
          <td class="texto"> 
   <%
             out.print(request.getParameter("cboContratoD"));
   %>
          </td>
    <%
          }
    %>
        </tr>

	
							<%if(cveFormaLiq!=null){
							if(cveFormaLiq.equals("24")){
							%>
         <tr> 
         <td>&nbsp;</td>
          <td  class="texto"> Forma de Deposito:</td>
          <td  class="texto"> <%=cveFormaLiq.equals("24")?"CANCELACION DE CHEQUES DE CAJA":""%></td>
        </tr>							
         <tr> 
         <td>&nbsp;</td>
          <td  class="texto"> Numero de Cheque:</td>
          <td  class="texto"> <%=request.getParameter("txtNumeroChequeHidden")%></td>
        </tr>
         <tr> 
         <td>&nbsp;</td>
          <td  class="texto"> Nombre del Beneficiario:</td>
          <td  class="texto"> <%=request.getParameter("txtNombreBeneficiarioHidden")%></td>
        </tr>		
							<%}
							}%>							
	
        <% if(request.getParameter("cboInstrumentoD")!=null&&!(request.getParameter("cboInstrumentoD")).equals("Selecciona Instrumento")) 
			{%>
        <tr> 
        <td>&nbsp;</td>
          <td  class="texto"> Invertir en Instrumento:</td>
          <td  class="texto"> <%=request.getParameter("cboInstrumentoD")%></td>
        </tr>
        <% } %>

        <tr> 
        <td>&nbsp;</td>
        <td>&nbsp;</td>
          <td >&nbsp;</td>
        </tr>
          <tr>
          <td>&nbsp;</td>
          <td class="textoNegrita" align="center"><%=sCaptura.equals("SI")?"Capturada":"Elaborada"%> por:</td>
          <td>&nbsp;</td>
        </tr>       
        <tr> 
        <td>&nbsp;</td>
          <td align="center">&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr> 
        <td>&nbsp;</td>
          <td align="center"> _______________________</td>
          <td>&nbsp;</td>
        </tr>
        <tr> 
        <td>&nbsp;</td>
          <td class="textoNegrita" ><div align="center"><b><%=(String)session.getAttribute("NomUser")%></b></div></td>
          <td>&nbsp;</td>
        </tr>
        <tr> 
        <td>&nbsp;</td>
        <td>&nbsp;</td>
          <td >&nbsp;</td>
        </tr>
          <tr> 
          <td>&nbsp;</td>
          <td>Autorizada por:</td>
          <td>&nbsp;</td>
        </tr>       
        <tr> 
        <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr> 
        <td>&nbsp;</td>
          <td> _______________________</td>
          <td>&nbsp;</td>
        </tr>
        <tr> 
        <td>&nbsp;</td>
          <td class="textoNegrita" ><div align="center"><b>&nbsp;<%=(String)session.getAttribute("empresa_4")%></b></div></td>
          <td>&nbsp;</td>
        </tr>
        <!--FIN APROBO-->
        <%
        if (sCaptura.equals("NO") && !bFirmasMan)
        {
        %>
        <%
        }
        %>
        <tr> 
        <td>&nbsp;</td>
          <td align="center"> <input type="button" name="Imprimir"  class="btn btn-info" value="Imprimir"   onClick="javascript:imprimir()" > 
          </td>
          <td>&nbsp;</td>
        </tr>
        </tbody>
    </table>
</div>
</BODY>
</HTML>
<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.text.*,java.util.*"%>
<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<jsp:useBean id="Moneda"  class="com.bancomext.negocio.nServicios"/>
<jsp:useBean id="Horario"  class="com.bancomext.negocio.nConsultas"/>
<jsp:useBean id="FechaHabilSig"  class="com.bancomext.negocio.RetirosDB"/>
  <jsp:useBean id="CargaArchivo"  class="com.bancomext.negocio.CargaArchivo"/>
  <jsp:useBean id="CargaArchivo2"  class="com.bancomext.negocio.CargaArchivo"/>
<%@ include file="parametrosToken.jsp" %>
<%@ include file="sesionInst1.jsp" %>
<%@ include file="configura_bus.jsp" %>
<HTML>
<HEAD><TITLE>Instrucciones - Confirmar Deposito </TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="Página Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
<%
    // Recuperamos el parámetro del web.xml
    String sUrl = getServletContext().getInitParameter("apiBaseUrl");
%>
    <script>
        const API_BASE_URL = "<%= sUrl %>";
        console.log('1.la ip configurada es: '+API_BASE_URL);    
        
        if (!localStorage.getItem('token')) {
            window.location.href = 'login.jsp'; // Redirigir si no hay token
        }
    </script>
<%

   //mensaje a firmar digitalmente
			 String Folio="";
  		 String  mensaje="\"INSTRUCCION DE DEPOSITO\\n";
		           mensaje+="\\nFolio de Operación: "+Folio;
			       mensaje+="\\nFideicomiso: "+session.getAttribute( "Fideicomiso" );
			       mensaje+="\\nCuenta "+ session.getAttribute("empresa_9").toString() +" en la que se deposito: "+request.getParameter("cboCuentaD");
			       mensaje+="\\nImporte del deposito: "+NumberFormat.getCurrencyInstance(Locale.US).format(Double.valueOf(request.getParameter("txtImporteD")).doubleValue());
		  
      if(request.getParameter("cboConceptoD")!=null && !request.getParameter("cboConceptoD").equals("otro"))
			   mensaje+="\\nConcepto del deposito: "+request.getParameter("cboConceptoD");
		  else        	
 		     mensaje+="\\nConcepto del deposito: "+request.getParameter("txtConceptoD");

 	/*************************** Modificado por cubo ******************************/
		if(request.getParameter("cboTipoD")!=null)    	
 		     mensaje+="\\Persona que realiza el  deposito: "+request.getParameter("cboTipoD");
	/****************************************************************************************/
	
		  mensaje+="\\nAbono al Contrato de Inversión No.: "+request.getParameter("cboContratoD");
		  
      if(request.getParameter("cboInstrumentoD")!=null&&!(request.getParameter("cboInstrumentoD")).equals("Selecciona Instrumento")) 
			{
			   mensaje+="\\nInvertir en Instrumento: "+request.getParameter("cboInstrumentoD");
			}
			mensaje+="\\n\\n\\nIntruccion Realizada por: "+session.getAttribute( "NomUser" );
   		mensaje+="\";";
      NumberFormat nf = NumberFormat.getNumberInstance();
      nf.setMaximumIntegerDigits(2);
      nf.setMinimumIntegerDigits(2);
      
      
      String cboContratoD=request.getParameter("cboContratoD");
      String tipoPers;
      String cotizacion;
      String valor;
      //Se obtiene la moneda
      String[] valMoneda=null;
      String auxValMoneda=null;
      String nomMon=null;
      String fiso=(String)session.getAttribute( "Fideicomiso" );
      String[] fisoAux=fiso.replaceAll(" ","").split("-");

      String alerta="";
      String cveFormaLiq=request.getParameter("txtFormaLiq")!=null?(String)request.getParameter("cboFormasL"):"";
    
      boolean bDeposito=true;
      //String nombreIntermed = BD.obtenNombreIntermed((String)session.getAttribute("NumFid"),auxValMoneda);
      String numOperacion = "";
      
      NumberFormat nftp = NumberFormat.getNumberInstance();
      nftp.setMaximumIntegerDigits(1);
      nftp.setMinimumIntegerDigits(1);
      String NomTipoPersona;
   	  String NumTipoPersona;
   	  String TipoPersona;
          System.out.println("valor completo tipo persona: "+request.getParameter("cboTipoD"));
          System.out.println("valor tipo persona2: "+request.getParameter("cboTipoD").substring(0,request.getParameter("cboTipoD").indexOf("-")));
  	  NumTipoPersona=request.getParameter("cboTipoD").substring(0,request.getParameter("cboTipoD").indexOf("-"));
      NomTipoPersona=request.getParameter("cboTipoD").substring(request.getParameter("cboTipoD").indexOf("-")+1);
	  
      TipoPersona=request.getParameter("radioTipoPersona");
      int cvePers = 0;
      //obtener secuencial de deposito
      double cveParam1 = BD.obtenDatosEscritura(1,(String)request.getParameter("cboConceptoD"));			
      //obtener numero de cuenta
      //double cveParam2 = BD.obtenDatosEscritura(2,(String)request.getParameter("cboCuentaD"));
   String snumCtoInver=request.getParameter("cboContratoD")==null||request.getParameter("cboContratoD").equals("Selecciona un Contrato")?"":request.getParameter("cboContratoD");
   String sNumCtaCheques= request.getParameter("cboCtaCheques")==null||request.getParameter("cboCtaCheques").equals("Selecciona Cuenta de Cheque")?"":request.getParameter("cboCtaCheques");
   System.out.println("Valor cuenta de snumCtoInver"+snumCtoInver);
   System.out.println("Valor cuenta de sNumCtaCheques"+sNumCtaCheques);
      String[] CuentasDeposito = {null};
      //System.out.println("Cuenta deposito: "+(String)request.getParameter("cboCtaCheques"));
      if(snumCtoInver.length()==0||snumCtoInver==null)
        CuentasDeposito[0]=(String)request.getParameter("cboCtaCheques");
      else  
        CuentasDeposito[0]=snumCtoInver.substring(0, snumCtoInver.indexOf("-"));

      Moneda.setVtrStrDato1((String)request.getParameter("cboDivisa"));
      Moneda.querySelect(49);
      
      int cveMoneda = Moneda.getVtrIntDato1();
      int tipoPersonaNum ;
      tipoPersonaNum=Integer.valueOf(NumTipoPersona.trim()).intValue();
      int cveBenef  = BD.obtenDatosPersona(2,NomTipoPersona.trim(),(String)session.getAttribute("NumFid"));			
      int cveTercero  = BD.obtenDatosPersona(3,NomTipoPersona.trim(),(String)session.getAttribute("NumFid"));		
      int cveFideicomitente  = BD.obtenDatosPersona(1,NomTipoPersona.trim(),(String)session.getAttribute("NumFid"));		
      double numBanco = BD.obtenDatosEscritura(5,(String)request.getParameter("cboCuentaD"));
      int numSec   = 0;//BD.obtenDatosEscritura(6,(String)request.getParameter("cboCuentaD"));
      double numIntermed = 0;//BD.obtenDatosEscritura(4,nombreIntermed);
      int noContabiliza = 0;
      
      String sNumCta = BD.obtenNumCuenta(numSec);
      String sNomBco = (numBanco>0?BD.obtenNombreBanco(numBanco):"");
      //Armado del numero de operacion contable
      //numOperacion = "1" + nftp.format(Integer.parseInt(TipoPersona)) + nf.format(cveParam1) + nf.format(cveParam2) + nf.format(cveMoneda) + "60";
      double impValor;
      if ( cveBenef != 0 ) {
          cvePers = cveBenef;
          tipoPers = "BENEFICIARIO";
      } else if(cveTercero != 0){
          cvePers = cveTercero;
          tipoPers = "BENEFICIARIO";
      } else{
          cvePers = cveFideicomitente;
          tipoPers = "FIDEICOMITENTE";      
      }
       String fechaValor="";
       fechaValor = request.getParameter("txtFecha")!=null?request.getParameter("txtFecha"):fecha;  
       /*Horario.querySelect(65);     //SE OBTIENE LA HORA DE LA BASE Y SE COMPARA VS EL HORARIO DE OPERACION EN FORMATO HH24MI
       if(Horario.getVtrIntDato1()<1600){//HORARIO MAYOR A 14:30 EN RETIROS
        fechaValor = request.getParameter("txtFecha")!=null?request.getParameter("txtFecha"):fecha;  
        fechaValor=FechaHabilSig.obtenerFechaHabilSig(fechaValor,cveMoneda,1);
       } 
       else{
        fechaValor = request.getParameter("txtFecha")!=null?request.getParameter("txtFecha"):fecha;  
        fechaValor=FechaHabilSig.obtenerFechaHabilSig(fechaValor,cveMoneda,2); 
       }*/
      
      if( cveMoneda != 1 ) {
           cotizacion = BD.obtenTipoCambio(cveMoneda, fecha);
           //impValor = Double.parseDouble(request.getParameter("txtImporteD")) * Double.parseDouble(cotizacion);
      } else {
           cotizacion = "1";
      }
      
      valor = request.getParameter("txtImporteD");
      //CUENTAS POR COBRAR
      boolean bValidaCarga=true;
      String sValidaCarga="";
      String sFolioTemp=request.getParameter("txtFolioRec")==null?"":request.getParameter("txtFolioRec");
      if(sFolioTemp.equalsIgnoreCase("")){
        sFolioTemp=request.getParameter("txtFolio")==null?"":request.getParameter("txtFolio");
        if(sFolioTemp.length()>0)
                bValidaCarga=CargaArchivo.iValidaCarga(Folio,sFolioTemp,Double.valueOf(valor).doubleValue());
      }  
      ////////////////////
 
     //seccion de pagos multiples
    String elFolio=BD.getFolioUnchanged(2);            
  
  if(request.getParameter("pagosM")!=null&&session.getAttribute("FolioRetiroMultiple")!=null){
    elFolio=(String)session.getAttribute("FolioRetiroMultiple");
    alerta=(String)session.getAttribute("AlertaRetiroMultiple");
    bDeposito=CargaArchivo2.iValidaCarga((String)session.getAttribute("FolioRetiroMultiple"),valor, Integer.valueOf( (String)session.getAttribute("NumFid") ).intValue() ).equals("1")?false:true; 
    if(!bDeposito){//se valida el monto
      if(!alerta.equals("SE PRODUJO UN ERROR DURANTE LA LECTURA DEL ARCHIVO, VERIFIQUE EL FORMATO."))
        alerta="El Monto de los Depositos Individuales No coincide con el Monto Total de la Instrucción";
      session.setAttribute("FolioRetiroMultiple","");	
    }   
   } 
   else if(session.getAttribute("FolioRetiroMultiple")==null && (request.getParameter("pagosM")!=null && request.getParameter("pagosM").equals("S") ))
   {
    bDeposito=false;
    alerta="No se cargo ningún archivo para la Dispersión Múltiple.";
   }  
      
      System.out.println("# Operacion Deposito:"+numOperacion);

       if(cotizacion.length()==0)
       {
          alerta="No hay valor del tipo de cambio para la moneda y fecha seleccionados";  
          bDeposito=false;  
       }
        
       if (!bValidaCarga)
                 {
           alerta="El importe del Archivo no corresponde con el Total de la Instruccion, Verifique";
           bDeposito=false;  
           }
           

 if(request.getParameter("pagosM")!=null&&session.getAttribute("FolioRetiroMultiple")!=null)
    Folio=(String)session.getAttribute("FolioRetiroMultiple");
  else 
     Folio=BD.getFolio(2);
  System.out.println("El Folio asignado es "+Folio);
  
    // validacion garantias deposito ---
    sValidaCarga=CargaArchivo.iValidaCargaGarantiasDeposito(Folio,valor,Integer.parseInt(fisoAux[0]));
    
    if(sValidaCarga.indexOf("1;")==0){//se valida el monto
      if(!alerta.equals("SE PRODUJO UN ERROR DURANTE LA LECTURA DEL ARCHIVO, VERIFIQUE EL FORMATO."))
        alerta="El Monto de los Depositos por Bien es mayor al monto disponible de la Garantia "+sValidaCarga.substring(sValidaCarga.indexOf("1;")+2,sValidaCarga.indexOf("-"))+" y del Bien "+
        sValidaCarga.substring(sValidaCarga.indexOf("-")+1,sValidaCarga.length());
        bDeposito=false;
      session.setAttribute("FolioRetiroMultiple","");	 
    }
    //-------------------------------  
  
%>

 <%@ include file="objetosPKI.jsp" %>
<script language="JavaScript" SRC='scripts/navegador.js'></script>
<script language="JavaScript" type="text/JavaScript">
function cancelar()
		{
		parent.location='FI_Instrucciones.jsp'
		}
    


	function Sign()
	{


			document.Deposito.action="instruccion1.jsp";
			document.Deposito.submit();	
 	
}

function confirmar() 
{
   <%
   if(sCaptura.equals("NO"))
   {
   %>
      Sign();
   <%
   }
   else
   {
   %>
      document.Deposito.action='instruccion1.jsp';
      document.Deposito.submit();
   <%
   }
   %>
}
</script>
</HEAD>
<body  class="bg-light"  leftMargin="0" topMargin="0" marginwidth="0" marginheight="0" >
<jsp:include page="header.jsp"/>
<jsp:include page="NuevoMenu.jsp"/>
<div class="table-responsive">

<TABLE border="0" cellPadding="0" cellSpacing="0" width="100%">
  <TBODY>
    <TR > 
      <TD valign="top" align="center"> <table width="100%" border="0">
          <tr> 
            <td class="fiso">&nbsp;&nbsp;<%= session.getAttribute( "Fideicomiso" ) %><a name="top"></a></td>
          </tr>
        </table>
        </td>
     </tr>
     <tr>
        <td>
        <%try {%>
        <div class="table-responsive" >
            <table id="fisosDisponibles"  class="table table-responsive table-hover">
                <thead class="table-primary" align="center">
                    <tr>
                        <th><h1 class="display-1">Confirmar Dep&oacute;sito</h1></th>
                    </tr>
                </thead>
            <tbody>
                <tr>
                    <th class="alerta"><%=alerta%></th>
                </tr>
                <tr> 
                  <td align="center"> 
                    <form name="Deposito" method="post" action="instruccion1.jsp">
                      <input type="HIDDEN" name="txtFolio" value="<%=Folio%>">
                      <input type="HIDDEN" name="Pkcs7">
                      <input type="HIDDEN" name="SignedText">
                      <input type="HIDDEN" name="cboCuentaD" value="<%=request.getParameter("cboCuentaD")%>">
                      <input type="HIDDEN" name="txtImporteD" value="<%=valor%>">
                      <input type="hidden" name="cboFormaR" value="<%=request.getParameter("cboFormasL")%>">					  
                      <input type="hidden" name="txtFormaLiq" value="<%=request.getParameter("txtFormaLiq")%>">
                      <input type="hidden" name="cboConceptoD" value="<%=request.getParameter("cboConceptoD")%>">
                      <input type="HIDDEN" name="txtConceptoD" value="<%=request.getParameter("txtConceptoD")%>">
                      <input type="HIDDEN" name="cboContratoD" value="<%=request.getParameter("cboContratoD").equals("Selecciona Contrato")?"0-0":request.getParameter("cboContratoD")%>">
                      <input type="HIDDEN" name="cboCtaCheques" value="<%=request.getParameter("cboCtaCheques")%>">
                      <input type="HIDDEN" name="cboSubCtas" value="<%=request.getParameter("cboSubCtas")%>">
                         <% 
                         if(request.getParameter("cboInstrumentoD")!=null&&!(request.getParameter("cboInstrumentoD")).equals("Selecciona Instrumento")) 
									       {%>
                      <input type="HIDDEN" name="cboInstrumentoD" value="<%=request.getParameter("cboInstrumentoD")%>">
                      <%}%>
                      <input type="HIDDEN" name="cboPersona" value="<%=request.getParameter("cboTipoD")%>">
                      <input type="HIDDEN"  name="txtCveParam1" value="<%=cveParam1 %>">
                      <input type="HIDDEN"  name="txtCveParam2" value="<%=CuentasDeposito[0]%>">
                      <input type="HIDDEN"  name="txtCveMoneda" value="<%=cveMoneda %>">
                      <input type="HIDDEN"  name="txtNomMoneda" value="<%=(String)request.getParameter("cboDivisa")%>">
                      <input type="HIDDEN"  name="txtTipoCambio" value="<%=cotizacion %>">
                      <input type="HIDDEN"  name="txtPersona" value="<%=cvePers%>">
                      <input type="HIDDEN"  name="txtNumOper" value="<%=numOperacion%>">
                      <input type="HIDDEN"  name="txtNumIntermed" value="<%=numIntermed%>">
                      <input type="HIDDEN"  name="txtTipoPers" value="<%=tipoPers%>">
                      <input type="HIDDEN"  name="txtnumBanco" value="<%=numBanco%>">
                      <input type="HIDDEN"  name="txtsNumCta" value="<%=sNumCta%>">
                      <input type="HIDDEN"  name="txtsNomBco" value="<%=sNomBco%>">
                      <input type="HIDDEN"  name="txtCotizacion" value="<%=cotizacion%>">
                      <!--<input type="HIDDEN"  name="fechaValor" value="<%=request.getParameter("txtFecha")!=null?request.getParameter("txtFecha"):""%>"-->
                        <input type="HIDDEN"  name="fechaValor" 
                        value="<%=fechaValor!=null&&fechaValor.length()>0?fechaValor:(request.getParameter("txtFecha")!=null?request.getParameter("txtFecha"):"")%>">
                        <div class="table-responsive" >
                            <table id="fisosDisponibles"  class="table table-responsive table-hover">
                                <thead class="table-primary" align="center">
                                    <tr>
                                        <th>&nbsp;</th>
                                        <th>DETALLE DEPOSITO</th>
                                        <th>&nbsp;</th>
                                    </tr>
                                </thead>
                            </table>
                            <table id="fisosDisponibles"  class="table table-responsive table-hover">
                                <tbody>
                                    <tr> 
                                      <td>&nbsp;</td>
                                      <td align="left">Fecha del deposito: </td>
                                      <td> <%=fechaValor!=null&&fechaValor.length()>0?
                                      fechaValor:(request.getParameter("txtFecha")!=null?request.getParameter("txtFecha"):"")%> 
                                      </td>
                                      <td>&nbsp;</td>
                                    </tr>                        
                                    <tr> 
                                      <td>&nbsp;</td>                                    
                                      <td align="left"   ><%=request.getParameter("cboCtaCheques")==null||request.getParameter("cboCtaCheques").equals("Selecciona Cuenta de Cheque")?"Contrato de Inversión":"Cuenta de cheques:"%></td>
                                      <td> 
                                        <%
                                        if( !(((String)request.getParameter("cboContratoD")).length()==0
                                        ||((String)request.getParameter("cboContratoD"))==null))
                                        out.print(request.getParameter("cboContratoD"));
                                        else
                                        out.print(request.getParameter("cboCtaCheques"));
                                        %>
                                      </td>
                                      <td>&nbsp;</td>
                                    </tr>
                                 
                                    <tr> 
                                      <td>&nbsp;</td>                                    
                                      <td align="left">Divisa: </td>
                                      <td > <%=(String)request.getParameter("cboDivisa")%> 
                                      </td>
                                      td>&nbsp;</td>
                                    </tr>                                                
                                    <tr> 
                                      <td>&nbsp;</td>                                    
                                      <td align="left">Importe del deposito: </td>
                                      <td > <%=NumberFormat.getCurrencyInstance(Locale.US).format(Double.valueOf(request.getParameter("txtImporteD")).doubleValue())%> 
                                      </td>
                                      <td>&nbsp;</td>
                                    </tr>
                                    <%if( cveMoneda != 1 ) {%>
                                    <tr> 
                                      <td>&nbsp;</td>                                    
                                      <td align="left">Tipo de Cambio Provisional: </td>
                                      <td > <%=cotizacion%> 
                                      </td>
                                      <td>&nbsp;</td>
                                    </tr>
                                    <%}%>
                                    <tr> 
                                      <td>&nbsp;</td>                                    
                                      <td > Concepto del deposito: </td>
                                      <!-- <td> <%=request.getParameter("cboConceptoD")!=null && !request.getParameter("cboConceptoD").trim().equals("otro") ?request.getParameter("cboConceptoD"):request.getParameter("txtConceptoD")%> -->
                                      <td> 
                                        <%
                                     if(!request.getParameter("cboConceptoD").equals("")&&request.getParameter("txtConceptoD").equals(""))
                                        out.print(request.getParameter("cboConceptoD"));
                                                       else if(!request.getParameter("txtConceptoD").equals(""))
                                        out.print(request.getParameter("cboConceptoD") + "/" +request.getParameter("txtConceptoD"));
                                      %>
                                      </td>
                                      <td>&nbsp;</td>
                                    </tr>
                                    <tr> 
                                      <td>&nbsp;</td>                                    
                                      <td>Tipo de Persona: </td>
                                      <td> <%=(TipoPersona.equals("1")?"FIDEICOMITENTE":TipoPersona.equals("2")?"FIDEICOMISARIO":"TERCERO")%></td>
                                      <td>&nbsp;</td>
                                    </tr>
                                    <tr> 
                                      <td>&nbsp;</td>                                    
                                      <td> Persona: </td>
                                      <td> <%=NomTipoPersona%></td>
                                      <td>&nbsp;</td>
                                    </tr>
                                    <input type="hidden" name="txtNumTipoPersona" value="<%=NumTipoPersona%>">
                                    <input type="hidden" name="txtNomTipoPersona" value="<%=NomTipoPersona%>">
                                    <input type="hidden" name="txtTipoPersona" value="<%=TipoPersona%>">
                                    <!--/*****************************************************************************************/-->
                                    <tr>
                                      <td>&nbsp;</td>                                    
                                        <%
                                        if(request.getParameter("cboContratoD").equals("Selecciona Contrato")){
                                        %>
                                        <td> Abono a la Cta de cheques No:</td>
                                        <td >
                                        <%
                                        out.print(request.getParameter("cboCtaCheques"));
                                        }else {
                                        %>
                                        </td>
                                        <td> Abono al Contrato de Inversi&oacute;n No.:</td>
                                        <td > 
                                        <%
                                        out.print(request.getParameter("cboContratoD"));
                                        %>
                                        </td>
                                        <%
                                        }
                                        %>
                                        <td>&nbsp;</td>                                        
                                    </tr>
                                    <%if(request.getParameter("cboSubCtas")!=null&&!(request.getParameter("cboSubCtas")).equals("Selecciona una Subcta")){%>
                                    <tr> 
                                      <td>&nbsp;</td>                                    
                                      <td > SubCuenta:</td>
                                      <td > <%=request.getParameter("cboSubCtas")%> </td>
                                      <td>&nbsp;</td>                                                                              
                                    </tr>                                    
                                    <%} %>
                                    <%if(cveFormaLiq!=null){
                                    if(cveFormaLiq.equals("24")){
                                    %>
                                    <tr> 
                                      <td>&nbsp;</td>                                    
                                      <td>Forma de Depósito:</td>
                                      <td> 
                                        <%if(request.getParameter("cboFormasL")!=null)
                                                   out.print("CANCELACION DE CHEQUES DE CAJA");%>
                                      </td>
                                      <td>&nbsp;</td>                                                                              
                                    </tr>
                                    <input type="HIDDEN"  name="txtFormaLiqHidden" value="<%=request.getParameter("txtFormaLiq") %>">							
                                    <input type="HIDDEN"  name="txtNumeroChequeHidden" value="<%=request.getParameter("txtNumeroChequeHidden") %>">
                                    <input type="HIDDEN"  name="txtNombreBeneficiarioHidden" value="<%=request.getParameter("txtNombreBeneficiarioHidden") %>">
                                    <tr> 
                                      <td>&nbsp;</td>                                    
                                      <td>Numero de Cheque:</td>
                                      <td> 
                                        <%if(request.getParameter("txtNumeroChequeHidden")!=null)
                                                   out.print(request.getParameter("txtNumeroChequeHidden"));%>
                                      </td>
                                      <td>&nbsp;</td>                                                                                                                    
                                    </tr>	
                                    <tr> 
                                      <td>&nbsp;</td>                                    
                                      <td>Nombre del Beneficiario:</td>
                                      <td> 
                                        <%if(request.getParameter("txtNombreBeneficiarioHidden")!=null)
                                                   out.print(request.getParameter("txtNombreBeneficiarioHidden"));%>
                                      </td>
                                      <td>&nbsp;</td>                                                                                                                    
                                    </tr>						
                                    <%}
                                    }%>
                                    <% if(request.getParameter("cboInstrumentoD")!=null&&!(request.getParameter("cboInstrumentoD")).equals("Selecciona Instrumento")) 
                                    {%>
                                    <tr> 
                                      <td>&nbsp;</td>                                    
                                      <td > Invertir en Instrumento:</td>
                                      <td > <%=request.getParameter("cboInstrumentoD")%> </td>
                                      <td>&nbsp;</td>                                                                              
                                    </tr>
                                    <%} %>  
                                    <!--SECCION PARA SUBIR PDF-->
                                    <tr> 
                                    <td>&nbsp;</td>  
                                    <td>&nbsp;</td>   
                                    <td style="text-align: center;"> 
                                    <div class="card shadow d-flex justify-content-center" style="width: 45rem;" >
                                    <div class="card-header bg-primary text-white">
                                    <h4 class="mb-0">Subir Carta Instruccion PDF</h4>
                                    </div>
                                    <div class="card-body">
                                    <form id="uploadForm" enctype="multipart/form-data">
                                    <div class="mb-3">
                                    <label for="pdfFile" class="form-label">Seleccionar PDF</label>
                                    <input class="form-control" type="file" id="pdfFile" 
                                    name="pdfFile" accept="application/pdf" required>
                                    </div>
                                    <button type="button" onclick="uploadFile()" class="btn btn-success">Subir</button>
                                    <button id="btnEnviarOPT" class="btn btn-primary py-2" onclick="solicitarOtp()" disabled>
                                        Enviar Codigo de Seguridad
                                    </button>

                                    </form>
                                    <input type="hidden" name="pdfName" id="hiddenPdfName"> 
                                    <!-- Área para mostrar mensajes -->
                                    <div id="statusMessage" class="mt-3"></div>
                                    </div>
                                    </div>
                                    </td>
                                    <td>&nbsp;</td>                                                                              
                                    </tr>                                    
                                    <!--FIN SECCION PARA SUBIR PDF-->
                                    
                                    <!-- Modal de Validación OTP (Oculto inicialmente) -->
                                    <div class="modal fade" id="otpModal" tabindex="-1" aria-hidden="true" data-bs-backdrop="static">
                                        <div class="modal-dialog modal-dialog-centered">
                                            <div class="modal-content">
                                                <div class="modal-header border-0">
                                                    <h5 class="modal-title">Verificacion de Identidad</h5>
                                                </div>
                                                <div class="modal-body text-center">
                                                    <p class="text-muted">Hemos enviado un codigo de 6 dígitos a tu correo.</p>
                                                    <div class="mb-3">
                                                        <input type="text" class="form-control text-center fs-3" id="otpInput" placeholder="000000" maxlength="6">
                                                    </div>
                                                    <button class="btn btn-success" id="btnverificarOtp">Autorizar Operación</button>
                                                </div>
                                            </div>
                                        </div>
                                    </div>                                    
                                    <tr> 
                                    <td>&nbsp;</td>
                                        <td>&nbsp;</td>                              
                                      <td align="left"> 
                                        <% if(!bDeposito)
                                           {
                                         %>
                                        <input type="button" name="Modificar" value="Modificar" onClick="javascript:history.back()" class="btn btn-success"> 
                                        <%}
                                   else    {%>
                                            <button type="submit" id="btnEnviar" class="btn btn-primary" disabled>Aceptar</button>
                                        <%}%>
                                      </td>
                                      <td>&nbsp;</td>
                                      
                                    </tr>  
                                </tbody>
                            </table>
                        </div>  
                      </form>
                    </td>
                </tr>
                
                <!--CUENTAS POR COBRAR-->
                <% if(bDeposito)
                  {
                  %>
                <tr> 
                  <td align="left">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                  <a href="javascript:history.back()"><u>Modificar
                    Instrucci&oacute;n</u></a></td>
                </tr>
                <tr> 
                  <td >&nbsp;</td>
                </tr>
                <%}%>
    
                </tbody>
            </table>
        </div>
        <script>
        async function uploadFile() {          
            const fileInput = document.getElementById('pdfFile');
            const statusMessage = document.getElementById('statusMessage');
            const submitBtn = document.getElementById('btnEnviarOPT');
            const token = localStorage.getItem('token'); 
            const usuario = localStorage.getItem('usuario'); 
             var id = '<%= Folio %>'; 
            // 1. Recuperar credenciales del almacenamiento local

            if (fileInput.files.length === 0) return;

            // Crear FormData para enviar archivos vía AJAX
            const formData = new FormData();
            formData.append('file', fileInput.files[0]);
            formData.append('id', id);
            formData.append('usuario', usuario);
            formData.append('token', token);


            statusMessage.innerHTML = '<div class="alert alert-info">Subiendo...</div>';

            try {

                const response = await 
                fetch('uploadServlet', {
                method: 'POST',
                body: formData
                });
                
                const result = await response.json();
                console.log('Respuesta del Servlet:', result);

                if (result=="200") {                    
                    statusMessage.innerHTML = 'Archivo subido con éxito!';
                    statusMessage.style.color = 'green';
                    //habilitar el boton para otp
                    submitBtn.disabled = false;
                } else if (result=="800")
                {
                    statusMessage.innerHTML = 'El archivo ya se subio';
                    statusMessage.style.color = 'red';
                }
                 else {
                    //throw new Error('Error en el servidor');
                    submitBtn.disabled = true;
                }            
            } catch (error) {
                statusMessage.innerHTML = 'Error al subir el archivo.';
                statusMessage.style.color = 'red';
            }

        }
        
        let modalOtp = new bootstrap.Modal(document.getElementById('otpModal'));

        async function solicitarOtp() {
            const btnEnviarOPT = document.getElementById('btnEnviarOPT');
            const mensajeEstado = document.getElementById('statusMessage');

            // Cambiar estado del botón (feedback de carga)
            btnEnviarOPT.disabled = true;
            btnEnviarOPT.innerHTML = `<span class="spinner-border spinner-border-sm" role="status" aria-hidden="true"></span> Enviando...`;
            mensajeEstado.innerHTML = "";

            try {
                // Ejecución API REST Asíncrona (Fetch)
                const BEARER_TOKEN = localStorage.getItem('token');
                console.log(API_BASE_URL+'/api/auth/enviar-otp')
                console.log('Bearer '+BEARER_TOKEN)
                console.log('email:'+ localStorage.getItem('usuario'))
                const response = await fetch(API_BASE_URL+'/api/auth/enviar-otp', {
                    method: 'POST',
                    headers: {
                        'Authorization': 'Bearer '+BEARER_TOKEN,
                        'Content-Type': 'application/json'
                    },
                     body: JSON.stringify({ email: localStorage.getItem('usuario') })
                });                

                if (response.ok) {
                    mensajeEstado.innerHTML = `<div class="alert alert-success">¡Codigo enviado con éxito!</div>`;
                    // Abrir el modal para ingresar el OTP
                    modalOtp.show();
                } else {
                    mensajeEstado.innerHTML = `<div class="alert alert-danger">Error al enviar el codigo.</div>`;
                }
            } catch (error) {
                console.error("Error:", error);
                mensajeEstado.innerHTML = `<div class="alert alert-danger">Error de conexión con el servidor.</div>`;
            } finally {
                btnEnviarOPT.disabled = false;
                btnEnviarOPT.innerHTML = "Enviar Código de Seguridad";
            }
        }

        async  function verificarOtp(otpIngresado) {
            const mensajeEstado = document.getElementById('statusMessage');
            const submitBtn = document.getElementById('btnEnviar');
            // Ejecución API REST Asíncrona (Fetch)
            const BEARER_TOKEN = localStorage.getItem('token');
            const response = await fetch(API_BASE_URL+'/api/auth/validar-otp', {
                method: 'POST',
                headers: {
                    'Authorization': 'Bearer '+BEARER_TOKEN,
                    'Content-Type': 'application/json'
                },
                 body: JSON.stringify({ email: localStorage.getItem('usuario'),
                 otp:otpIngresado})
            });            
            if (response.ok) {
                mensajeEstado.innerHTML = `<div class="alert alert-success">¡Código Correcto!</div>`;
                // Habilitar el botón de submit final
                submitBtn.disabled = false;                
            } else {
                mensajeEstado.innerHTML = `<div class="alert alert-danger">¡Código InCorrecto!</div>`;
            }
            modalOtp.hide();
        }
        // 2. Seleccionamos el botón
          const botonOtp = document.getElementById('btnverificarOtp');
        
          // 3. Agregamos el evento click
          botonOtp.addEventListener('click', async () => {
            try {
              botonOtp.disabled = true; // Desactivar el botón para evitar clics múltiples
                const otpIngresado = document.getElementById('otpInput').value;
                if(otpIngresado.length !== 6) {
                    Swal.fire('error', 'El código debe ser de 6 dígitos.!', 'error');
                    return;
                }       
              // Esperamos a que la función asíncrona termine
              const resultado = await verificarOtp(otpIngresado); 
            } catch (error) {
              console.error('Error:', error);
            } finally {
              botonOtp.disabled = false; // Reactivamos el botón
            }
          });
        </script>
        <table width="593" border="0">
          <tr> 
            <td  align="center" valign="top">
            <%
            }
            catch(Exception e)
            {
            %>
            <div class="table-responsive" style="max-height: 450px; overflow-y: auto;">
                <table id="fisosDisponibles"  class="table table-responsive table-hover">
                    <thead class="table-primary">
                        <tr>
                            <th class="alerta"><p>TU OPERACION NO PUEDE SER PROCESADA, AUN NO HA SIDO PARAMETRIZADA 
                            EN EL SISTEMA.</p>
                            </th>
                        </tr>
                    </thead>
                </table>
            </div>            
            <%
            }
            %>
            </td>
          </tr>
        </table>
        </TD>
    </TR>
  </TBODY>
</TABLE>
</div>
</BODY></HTML>

<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.text.*,java.util.*"%>
<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.RetirosDB"/>
<jsp:useBean id="DB"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<jsp:useBean id="Moneda"  class="mx.com.inscitech.clients.negocio.nServicios"/>
<jsp:useBean id="Horario"  class="mx.com.inscitech.clients.negocio.nConsultas"/>
<jsp:useBean id="CargaArchivo2"  class="mx.com.inscitech.clients.negocio.CargaArchivo"/>
<jsp:useBean id="FechaHabilSig"  class="mx.com.inscitech.clients.negocio.RetirosDB"/>
<%@ include file="configura_bus.jsp" %>
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
//**************************************************************Seguridad*******************************************************/
   if (session.getAttribute("NumUser")==null )
	   {
	   session.setAttribute("Error","Por razones de seguridad tu sesi�n ha finalizado<br>por exceder el tiempo m�ximo de inactividad.<br> Por favor inicia de nuevo"); 
	   %>
	   <jsp:forward page="salir.jsp"/>	
	   <%
	   }
	  
  if(!BD.getHorarioOperacion())
		{
		session.setAttribute("Error","Por el momento el sistema no esta Disponible<br>Favor de Intentar mas tarde...");
	    %>
	     <jsp:forward page="salir.jsp"/>
		<%
		}	   

 if(((String)session.getAttribute("permiso")).equals("CLIENTE CONSULTA Y DEPOSITO") ||((String)session.getAttribute("permiso")).equals("CLIENTE DEPOSITO") || ((String)session.getAttribute("permiso")).equals("CLIENTE CONSULTA"))
            {
			
   			%>
			 <jsp:forward page="FI_Instrucciones.jsp?permiso=0"/>
  			 <%
            }
   String sysFecha=BD.fecha();  	  
   String fecha=BD.getFecha();  	  
   String sCaptura = (((String)session.getAttribute("permiso")).equals("CAPTURA CON ACUERDOS")||
   ((String)session.getAttribute("permiso")).equals("CAPTURA SIN ACUERDOS"))?"SI":"NO";
   String sArchivo =(String)request.getParameter("archivoIntercam");
   String tipoUsuario = (String)session.getAttribute("permiso")!=null?(String)session.getAttribute("permiso"):"OTRO"; 				 
System.out.println("txtConcepto:"+request.getParameter("txtConcepto"));   
System.out.println("txtFormaLiq:"+request.getParameter("txtFormaLiq"));   
System.out.println("cboFormasL:"+request.getParameter("cboFormasL"));   
System.out.println("TitularHidden: "+request.getParameter("txtTitularCuentaClabeSpeiHidden"));
System.out.println("CuentaHidden: "+request.getParameter("txtCuentaClabeSpeiHidden"));
//******************************************************************************************************************************/		 
		 %>

<%@ include file="parametrosToken.jsp" %>
<%

   int numFiso=Integer.parseInt((String)session.getAttribute( "NumFid" ));
   String sImporte;
   String sOperValida = "";
   String sOperacion= "0";
   String cotizacion;   
   String sBeneficiario = "";   
   String sNumPersona="";
   String sLiq81[]=BD.getData(1,request.getParameter("cboFormasL"));
   String sPersona = "0";   
   String sTipoCont="0";
   String sOperacionPersona = "";
   String sNomBanco = "";
   double iNumBanco = 0;
   double iCveParam3 = 0;
   double noContabiliza = 0;
   sPersona=request.getParameter("radioTipoPersona");
   iCveParam3 = 0;
   String snumCtoInver=request.getParameter("cboContratoR")==null||request.getParameter("cboContratoR").equals("Selecciona un Contrato")?"":request.getParameter("cboContratoR");
   String sNumCtaCheques= request.getParameter("cboCtaCheques")==null||request.getParameter("cboCtaCheques").equals("Selecciona Cuenta de Cheque")?"":request.getParameter("cboCtaCheques");
   System.out.println("Valor cuenta de snumCtoInver"+snumCtoInver);
   System.out.println("Valor cuenta de sNumCtaCheques"+sNumCtaCheques);
   if(snumCtoInver.length()==0||snumCtoInver==null){
       System.out.println("Valor cuenta de Cheques"+sNumCtaCheques.substring(0,3));   
       iNumBanco = BD.obtenDatosEscritura(10,sNumCtaCheques.substring(0,3));
       sNomBanco = BD.obtenNombreBanco(iNumBanco);   
   }
 
    boolean bRetiro=true;   
  String alerta=""; 
    String cveFormaLiq=request.getParameter("txtFormaLiq")!=null?(String)request.getParameter("cboFormasL"):"";
	System.out.println("Valor de Nueva cuenta"+request.getParameter("txtCuentaClabeSpei"));

 
    System.out.println("Moneda confirmar2: "+(String)request.getParameter("cboDivisa"));
    Moneda.removerValores();
    Moneda.setVtrStrDato1((String)request.getParameter("cboDivisa")!=null?(String)request.getParameter("cboDivisa"):(String)request.getParameter("cboMonedaSwiftR"));
    Moneda.querySelect(49);
    int cveMoneda = Moneda.getVtrIntDato1();
 String fechaValor="";
 Horario.querySelect(65);     //SE OBTIENE LA HORA DE LA BASE Y SE COMPARA VS EL HORARIO DE OPERACION EN FORMATO HH24MI
 if(Horario.getVtrIntDato1()<1600){//HORARIO MAYOR A 14:30 EN RETIROS
  fechaValor = request.getParameter("txtFecha")!=null?request.getParameter("txtFecha"):fecha;  
 // fechaValor=FechaHabilSig.obtenerFechaHabilSig(fechaValor,cveMoneda,1);
 } 
 else{
  fechaValor = request.getParameter("txtFecha")!=null?request.getParameter("txtFecha"):fecha;  
 // fechaValor=FechaHabilSig.obtenerFechaHabilSig(fechaValor,cveMoneda,2); 
 }

System.out.println("cveMoneda confirmar2: "+cveMoneda +" fecha "+fecha);    
    if( cveMoneda != 1 ) {
         if(fechaValor.length()>0)
           fecha=fecha;
          //fecha=fechaValor;
         cotizacion = BD.obtenTipoCambio(cveMoneda, fecha);
         //cotizacion = DB.obtenTipoCambio(cveMoneda, fecha);
         //impValor = Double.parseDouble(request.getParameter("txtImporteD")) * Double.parseDouble(cotizacion);
    } else {
         cotizacion = "1";
    }

   
   sTipoCont=(String)session.getAttribute("TpoCont");
   
   int i;
   i= (int)Integer.parseInt(sTipoCont);

   //SWIFT
   if (request.getParameter("cboFormasL").equals("21"))
      sImporte = request.getParameter("txtImporteTSwiftR");
   else
      sImporte = request.getParameter("txtImporteR");
          	
	   
    //Se obtiene la moneda
    String[] valCtoInver=null;
    String sCmbCtoInver="";      
    sCmbCtoInver=request.getParameter("cboContratoR")==null||request.getParameter("cboContratoR").equals("Selecciona un Contrato")?"":request.getParameter("cboContratoR");
    if(sCmbCtoInver!=null&&sCmbCtoInver.length()>0)
      valCtoInver=((String)request.getParameter("cboContratoR")).split("-");
	   
     String elFolio="";
     String Folio="";
     System.out.println("Pago Multiple activado:"+request.getParameter("pagosM"));
    //seccion de pagos multiples
  if(request.getParameter("pagosM")!=null&&session.getAttribute("FolioRetiroMultiple")!=null)
  {
      elFolio=(String)session.getAttribute("FolioRetiroMultiple");        
      Folio =elFolio;
  }
  else
  {         
      Folio =BD.getFolio(2);   
  }
  if(request.getParameter("pagosM")!=null&&session.getAttribute("FolioRetiroMultiple")!=null){
    elFolio=(String)session.getAttribute("FolioRetiroMultiple");
    alerta=(String)session.getAttribute("AlertaRetiroMultiple");
    bRetiro=CargaArchivo2.iValidaCarga((String)session.getAttribute("FolioRetiroMultiple"),sImporte,numFiso).equals("1")?false:true; 
    
    bRetiro=CargaArchivo2.iValidaCarga((String)session.getAttribute("FolioRetiroMultiple"),sImporte,numFiso).equals("1")?false:true; 
    if(!bRetiro){//se valida el monto
      if(!alerta.equals("SE PRODUJO UN ERROR DURANTE LA LECTURA DEL ARCHIVO, VERIFIQUE EL FORMATO."))
        alerta="El Monto de los Retiros Individuales No coincide con el Monto Total de la Instrucci�n";
      session.setAttribute("FolioRetiroMultiple","");	
    }
    
    // validacion garantias retiro ---
    String sValidaCarga="";
    sValidaCarga=CargaArchivo2.iValidaCargaGarantiasRetiro((String)session.getAttribute("FolioRetiroMultiple"),sImporte,numFiso); 
    if(sValidaCarga.indexOf("1;")==0){//se valida el monto
      if(!alerta.equals("SE PRODUJO UN ERROR DURANTE LA LECTURA DEL ARCHIVO, VERIFIQUE EL FORMATO."))
        alerta="El Monto de los Retiros por Bien es mayor al saldo de la Garantia "+sValidaCarga.substring(sValidaCarga.indexOf("1;")+2,sValidaCarga.indexOf("-"))+" y del Bien "+
        sValidaCarga.substring(sValidaCarga.indexOf("-")+1,sValidaCarga.length());
        bRetiro=false;
      session.setAttribute("FolioRetiroMultiple","");	
    }
    //-------------------------------
    
    
    if(bRetiro &&cveFormaLiq!=null &&(cveFormaLiq.equals("20") || cveFormaLiq.equals("23") )){//se validan las cuentas clabe
      String[] sRegresoValidaRFC=CargaArchivo2.sValidaCLABES((String)session.getAttribute("FolioRetiroMultiple"),sImporte);   
      bRetiro=(sRegresoValidaRFC[0].equals("1")||sRegresoValidaRFC[0].equals("2")?false:true);
      if(!alerta.equals("SE PRODUJO UN ERROR DURANTE LA LECTURA DEL ARCHIVO, VERIFIQUE EL FORMATO."))
        alerta=sRegresoValidaRFC[1];
      if(!bRetiro)
       session.setAttribute("FolioRetiroMultiple","");	
    } 
    
    if((cveFormaLiq.equals("22"))&&!CargaArchivo2.bancosValidos(elFolio)&&bRetiro){
      bRetiro=false;
      if(!alerta.equals("SE PRODUJO UN ERROR DURANTE LA LECTURA DEL ARCHIVO, VERIFIQUE EL FORMATO."))
        alerta="Existen m�ltiples bancos en el archivo � hay registros con el Banco inv�lido";
      session.setAttribute("FolioRetiroMultiple","");
    }

    
   } 
   else if(session.getAttribute("FolioRetiroMultiple")==null && (request.getParameter("pagosM")!=null && request.getParameter("pagosM").equals("S") ))
   {
    bRetiro=false;
    alerta="No se cargo ning�n archivo para la Dispersi�n M�ltiple.";
   }  
     	  
    double SaldoCO=0;
    
    //se valida el saldo si el usuario eliqe el cto de inversion
    if(sNumCtaCheques==null||sNumCtaCheques.length()==0)
      SaldoCO=BD.getSaldoActual((String)session.getAttribute("NumFid"),valCtoInver[0]);
    else
      SaldoCO=BD.getSaldoActualCtaCheques((String)session.getAttribute("NumFid"),sNumCtaCheques,
      (String)request.getParameter("cboSubCtas"));
   
   //mensaje a firmar


 if ((NumberFormat.getInstance(Locale.US).parse(sImporte).doubleValue()) < 0.01)
       	   {
	   alerta="El importe de tu operaci�n no es valido, por favor captura nuevamente el importe total";
	   bRetiro=false;  
	   }
if(SaldoCO<(NumberFormat.getInstance(Locale.US).parse(sImporte).doubleValue()) &&
(sNumCtaCheques==null||sNumCtaCheques.length()==0))	{
		bRetiro=false;   
		alerta="El saldo del contrato de inversion es insuficiente<BR>No se puede realizar el retiro";
		}
if(cotizacion.equalsIgnoreCase("0")||cotizacion.length()==0)	{
		bRetiro=false;   
		alerta="No existe Tipo de Cambio para el dia Seleccionado";
		}    
if(!(request.getParameter("cboFormasL")).equals("21")){
  if(!BD.getImporteMaxRetiro((String)session.getAttribute("username"),(String)request.getParameter("txtImporteR")))	{
      bRetiro=false;   
      alerta="El importe solicitado es superior al Maximo Autorizado";
      }     
}    
else
  if(!BD.getImporteMaxRetiro((String)session.getAttribute("username"),(String)request.getParameter("txtImporteTSwiftR")))	{
      bRetiro=false;   
      alerta="El importe solicitado es superior al Maximo Autorizado";
      }     
  
if(cotizacion.length()==0)
{
  alerta="No hay valor del tipo de cambio para la moneda y fecha seleccionados";  
  bRetiro=false;  
}  
  
if (!sOperValida.equals("")){
		bRetiro=false;   
		alerta=sOperValida+ "<BR>NO SE PUEDE REALIZAR EL RETIRO";
		}		

		

	//Datos Acuerdo Comite T�cnico
	String datosComiteTec = request.getParameter("cboAcuerdosComiteTec")!=null?request.getParameter("cboAcuerdosComiteTec"):"";
  String fechaSesion = "";
	String tipoSesion = "";
	String noAcuerdo = "";
	  
	if(!datosComiteTec.trim().equals(""))
	 	{
		  fechaSesion=datosComiteTec.substring(0,10);
		  tipoSesion=datosComiteTec.substring(11,13).equals("TO")?"O":"E";
		  noAcuerdo=datosComiteTec.substring(14,datosComiteTec.length());
		  System.out.println(BD.getSaldoDisponibleAcuerdoCT(numFiso,fechaSesion,tipoSesion,noAcuerdo));
		  		  System.out.println((NumberFormat.getInstance(Locale.US).parse(sImporte).doubleValue()) );
		 if(BD.getSaldoDisponibleAcuerdoCT(numFiso,fechaSesion,tipoSesion,noAcuerdo)<(NumberFormat.getInstance(Locale.US).parse(sImporte).doubleValue()) )
			 {
			 alerta=(alerta.trim().equals("")?"":(alerta+ "<BR><BR>"))+"El Saldo disponible en el Acuerdo de Comite con No. :"+noAcuerdo +",es insuficiente";
			 bRetiro=false;
			 }
			 
		}
					   		
%>   
<HTML>
<HEAD><TITLE>Confirmar de Retiro  - FiduciaWeb Movil</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
<link rel="stylesheet" href="styles/bancomext.css" type="text/css">
 <%@ include file="objetosPKI.jsp" %>
<script language="JavaScript" src="scripts/navegador.js"></script>
<script language="JavaScript" type="text/JavaScript">

function cancelar()
		{
		parent.location='FI_Instrucciones.jsp'
		}
function confirmar(){
	<%

	if(request.getParameter("pagosM")!=null && request.getParameter("pagosM").equals("S") && sCaptura.equals("NO")){
	%>
			Sign();
	<%
	}else{
		if(sCaptura.equals("NO")){
		%>
			Sign();
		<%
		}else{
		%>
			document.Retiro.action='instruccion2.jsp';
			document.Retiro.submit();
		<%
		}
	}
	%>
}

//*************************************************************************************************************
function Sign()
{
  document.Retiro.action="instruccion2.jsp";
  document.Retiro.submit();
}


//-->
</script>

</HEAD>
<body class="bg-light">
<jsp:include page="header.jsp"/>
<jsp:include page="NuevoMenu.jsp"/>
<div class="table-responsive">

<TABLE border="0" cellPadding="0" cellSpacing="0" width="100%" height="100%">
  <TBODY>
    <TR > 
      <TD valign="top" align="center">
        <table width="100%" border="0">
          <tr> 
            <td class="fiso">&nbsp;&nbsp;<%= session.getAttribute( "Fideicomiso" ) %><a name="top"></a></td>
          </tr>
        </table>
    </td>
    </tr>
    <%try
    {%>
    <tr>
      <td>        
        <div class="table-responsive">
            <table id="fisosDisponibles"  class="table table-responsive table-hover">
                <thead class="table-primary" align="center">
                    <tr>
                        <th><h1 class="display-1">Confirmar Retiro</h1></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <th class="alerta"><%=alerta%></th>
                    </tr>
                <tr> 
                  <td  align="center"  valign="top" > 
                    <form name="Retiro"  method="post"  action="instruccion2.jsp">

                                    <input type="hidden" name="Pkcs7">
                                    <input type="hidden" name="SignedText">
                                    <input type="hidden" name="txtFolio" value="<%=Folio%>">
                                    <input type="hidden" name="cboContratoR" value="<%=request.getParameter("cboContratoR")%>">
                                    <input type="hidden" name="hiddentxtIdSubcuenta" value="<%=request.getParameter("hiddentxtIdSubcuenta")%>">
                                    <input type="hidden" name="cboCtaCheques" value="<%=request.getParameter("cboCtaCheques")%>">
                                    
                                    <input type="HIDDEN"  name="txtCveMoneda" value="<%=cveMoneda %>">
                                    <input type="HIDDEN"  name="txtNomMoneda" value="<%=(String)request.getParameter("cboDivisa")%>">
                                    <input type="HIDDEN"  name="txtTipoCambio" value="<%=cotizacion %>">
                                    
                                    <input type="hidden" name="cboAcuerdosComiteTec" value="<%=request.getParameter("cboAcuerdosComiteTec")%>">
                                    <input type="hidden" name="txtNumPagoR" value="<%=request.getParameter("txtNumPagoR")%>">
                                    <input type="hidden" name="txtFechaSesion" value="<%=fechaSesion%>">
                                    <input type="hidden" name="txtTipoSesion" value="<%=tipoSesion%>">
                                    <input type="hidden" name="txtNoAcuerdo" value="<%=noAcuerdo%>">		  					  
                                    <input type="hidden" name="cboFormaR" value="<%=request.getParameter("cboFormasL")%>">					  
                                    <input type="hidden" name="txtFormaLiq" value="<%=request.getParameter("txtFormaLiq")%>">
                                    <input type="hidden" name="cboConceptoR" value="<%=request.getParameter("cboConceptoR")%>">									  
                                    <input type="hidden" name="txtConceptoR" value="<%=request.getParameter("txtConcepto")%>">									  					  
                                    <input type="hidden" name="txtLiquidacion" value="<%=sLiq81[0]%>">
                                    <input type="hidden" name="txtFormaLiq" value="<%=request.getParameter("txtFormaLiq")%>">
                                    <input type="hidden" name="txtNomBanco" value="<%=sNomBanco%>">
                                    <input class="texto" type="hidden" name="Agregarcuenta"  value="<%=request.getParameter("Agregarcuenta")%>">
                                    <input type="hidden" name="txtImporteR" value="<%=Double.valueOf(sImporte).doubleValue()%>">
					  
					  <!--NUEVA SECCION PARA CAMPOS HSBC-->
					  <input type="hidden" name="cboTipoPago" value="<%=request.getParameter("cboTipoPago")%>">
					  
					  <input type="hidden" name="txtNombrePersonaSpeiHidden" value="<%=request.getParameter("txtNombrePersonaSpeiHidden")%>">
					  <input type="hidden" name="txtCuentaClabeSpeiHidden" value="<%=request.getParameter("txtCuentaClabeSpeiHidden")%>">
                                          <input type="hidden" name="txtCuentaClabeSpei" value="<%=request.getParameter("txtCuentaClabeSpei")%>">
					  <input type="hidden" name="txtTitularCuentaClabeSpeiHidden" value="<%=request.getParameter("txtTitularCuentaClabeSpeiHidden")%>">			
                                          <input type="hidden" name="txtTitularCuentaClabeSpei" value="<%=request.getParameter("txtTitularCuentaClabeSpei")%>">			
				
                                          <input type="hidden" name="txtSWreferenciapago8Hidden" value="<%=request.getParameter("txtSWreferenciapago8")%>">
                                          <input type="hidden" name="txtSWreferenciapago82Hidden" value="<%=request.getParameter("txtSWreferenciapago82")%>">
                                          <input type="hidden" name="txtSWreferenciapago83Hidden" value="<%=request.getParameter("txtSWreferenciapago83")%>"> 
                                          <input type="hidden" name="txtPagoUnicoHidden" value="<%=request.getParameter("txtPagoUnico")%>"> 
                                       
                                          
                                          <input type="hidden" name="txtperscheque  CajaHidden" value="<%=request.getParameter("txtperschequeCaja")%>">
                                        <input type="hidden" name="txtCalleCajaHidden" value="<%=request.getParameter("txtCalleCaja")%>">
                                        <input type="hidden" name="txtNumExtCajaHidden" value="<%=request.getParameter("txtNumExtCaja")%>">
                                        <input type="hidden" name="txtNumIntCajaHidden" value="<%=request.getParameter("txtNumIntCaja")%>">
                                        <input type="hidden" name="txtColoniaCajaHidden" value="<%=request.getParameter("txtColoniaCaja")%>">
                                        <input type="hidden" name="txtDeleCajaHidden" value="<%=request.getParameter("txtDeleCaja")%>">
                                        <input type="hidden" name="txtCpCajaHidden" value="<%=request.getParameter("txtCpCaja")%>">
                                        <input type="hidden" name="txtEstadoCajaHidden" value="<%=request.getParameter("txtEstadoCaja")%>">
                                        <input type="hidden" name="txtCiudadCajaHidden" value="<%=request.getParameter("txtCiudadCaja")%>">

                                        <input type="hidden" name="archivo" value="<%=request.getParameter("archivo")%>">
                                          
                                	  <!--NUEVA SECCION PARA CAMPOS HSBC-->					  
					  
					  <%if(request.getParameter("pagosM")!=null)
					  {%>
                      	<input type="hidden" name="pagosM" value="<%=request.getParameter("pagosM")!=null?"S":"N"%>">
                      <%}%>	
                   
                      <%
					  //SWIFT
					  if(!(request.getParameter("cboFormasL")).equals("21") && request.getParameter("pagosM")==null)
                      {%>
                      <input type="hidden" name="txtImporteR" value="<%=Double.valueOf(sImporte).doubleValue()%>">
                      <%}
                        if(request.getParameter("cboConceptoR")!=null&&request.getParameter("txtConceptoR")==null)
                        {%>
                        <input type="hidden" name="cboConceptoR" value="<%=request.getParameter("cboConceptoR")%>">
                        <%}
                        else if(request.getParameter("txtConceptoR")!=null)
                        {%>                      
                        <input type="hidden" name="txtConceptoR" value="<%=request.getParameter("txtConceptoR")%>">
                        <%}%>
                        <%
                        if(request.getParameter("txtFormaLiq")!=null)
                        {%>
                        <input type="hidden" name="txtFormaLiq" value="<%=request.getParameter("txtFormaLiq")%>">
                        <%}  				
                            if((
                            (request.getParameter("cboFormasL")).equals("31")|| // CHEQUE DEL BANCO
                            (request.getParameter("cboFormasL")).equals("2")||
                            (request.getParameter("cboFormasL")).equals("11")
                            )&&request.getParameter("txtFormaLiq")!=null)  { 
                                sOperacion = "-1";	
                            }																				  					  
                                
                                if(((request.getParameter("cboFormasL")).equals("31")||
                                (request.getParameter("cboFormasL")).equals("3")) 
                                && request.getParameter("cboFormasL")!=null 
                                && request.getParameter("pagosM")==null){
                                    sOperacion = "-1";
                                }
//----------------------------------------------------------------------------------------------------------------------		
                        {%>
                      <input type="hidden" name="txtCveBancoPagoR" value="<%=request.getParameter("txtCveBancoPagoR")%>">
                      <input type="hidden" name="txtCuentaPagoR" value="<%=request.getParameter("txtCuentaPagoR")%>">
                      <input type="hidden" name="txtPlazaPagoR" value="<%=request.getParameter("txtPlazaPagoR")%>">
                      <input type="hidden" name="cboSubCtas" value="<%=request.getParameter("cboSubCtas")%>">
                      <input type="hidden" name="txtTitularPagoR" value="<%=request.getParameter("txtTitularPagoR")%>">
                      <input type="hidden" name="txtRfcPagoR" value="<%=request.getParameter("txtRfcPagoR")%>">                              
                      <!---------------------------------------------------------------------------------------------------------------------->
                      <%} 
			 //SWIFT
      		if((request.getParameter("cboFormasL")).equals("21")&&request.getParameter("cboFormasL")!=null &&
                request.getParameter("pagosM")==null)
			{
				if(i==1) {
					sPersona = "0"; 
					sNumPersona="0";
					sBeneficiario = "0"; //request.getParameter("txtInstitucionSiacR");
					}
				else {
					sNumPersona="0";
					sPersona = "0"; 
					sBeneficiario = "0" ; //request.getParameter("txtInstitucionSiacR");
				}
			}
      
                     { %>
                      <input type="hidden" name="txtBancoDSwiftR" value="<%=request.getParameter("txtBancoDSwiftR")%>">
                      <input type="hidden" name="cboPaisDSwiftR" value="<%=request.getParameter("cboPaisDSwiftR")%>">
                      <input type="hidden" name="txtCiudadDSwiftR" value="<%=request.getParameter("txtCiudadDSwiftR")%>">
                      <input type="hidden" name="txtPlazaSwiftR" value="<%=request.getParameter("txtPlazaSwiftR")%>">
                      <input type="hidden" name="txtSucursalSwiftR" value="<%=request.getParameter("txtSucursalSwiftR")%>">
                      <input type="hidden" name="txtCuentaSwiftR" value="<%=request.getParameter("txtCuentaSwiftR")%>">
                      <input type="hidden" name="txtBranchSwiftR" value="<%=request.getParameter("txtBranchSwiftR")%>">
                      <input type="hidden" name="cboMonedaSwiftR" value="<%=request.getParameter("cboMonedaSwiftR")%>">
                      <input type="hidden" name="txtImporteTSwiftR" value="<%=Double.valueOf(sImporte).doubleValue()%>">
                      <input type="hidden" name="txtCodigoSwiftR" value="<%=request.getParameter("txtCodigoSwiftR")%>">
                      <input type="hidden" name="txtNombreBSwiftR" value="<%=request.getParameter("txtNombreBSwiftR")%>">
                      <input type="hidden" name="cboPaisBSwiftR" value="<%=request.getParameter("cboPaisBSwiftR")%>">
                      <input type="hidden" name="txtCiudadBSwiftR" value="<%=request.getParameter("txtCiudadBSwiftR")%>">
                      <input type="hidden" name="txtDomicilioBSwiftR" value="<%=request.getParameter("txtDomicilioBSwiftR")%>">
                      <input type="hidden" name="txtTelefonoBSwiftR" value="<%=request.getParameter("txtTelefonoBSwiftR")%>">
                      <input type="hidden" name="txtCodigoSWIFT" value="<%=request.getParameter("txtCodigoSWIFT")%>">
                      <input type="hidden" name="txtNomBeneficiario" value="<%=request.getParameter("txtNomBeneficiario")%>">
                      
                      <!------------------------------------------------------------------------------------------------------------------------------------------------------>
                      <% } %>					

                        <input type="hidden" name="txtBeneficiarioChequeR" value="<%=sBeneficiario%>">	
                        <input type="hidden" name="txtOperacion" value="<%=sOperacion%>">		
                        <input type="hidden" name="txtTipoPersona" value="<%=request.getParameter("radioTipoPersona")%>">	
                        <input type="hidden" name="txtNumPersona" value="<%=request.getParameter("cboTipoD")%>">
                        
                        <input type="hidden" name="txtHon" value="<%=request.getParameter("txtHon")%>">
                        <div class="table-responsive">
                            <table id="fisosDisponibles"  class="table table-responsive table-hover">
                                <thead class="table-primary" align="center">
                                    <tr>
                                        <th>&nbsp;</th>
                                        <th>DETALLE RETIRO</th>
                                        <th>&nbsp;</th>
                                    </tr>
                                </thead>
                            </table>					
			</div>

                      <table class="table table-responsive table-hover">
                        <input type="HIDDEN"  name="fechaValor" 
                        value="<%=fechaValor!=null&&fechaValor.length()>0?fechaValor:(request.getParameter("txtFecha")!=null?request.getParameter("txtFecha"):"")%>">
                        <tr  > 
                          <td align="left">Fecha del Retiro: </td>
                          <td > <%=fechaValor!=null&&fechaValor.length()>0?fechaValor:(request.getParameter("txtFecha")!=null?request.getParameter("txtFecha"):"")%> 
                          </td>
                        </tr>                                                
                        <tr  > 
                          <td width="37%"  ><%=request.getParameter("cboCtaCheques").length()>0?"Retiro de Cuenta de Cheques:":"Retiro del Contrato de Inversion:"%></td>
                          <td width="63%" > 
                            <%
                            if(request.getParameter("cboCtaCheques").length()>0)
                                out.print(request.getParameter("cboCtaCheques"));
                            else{
                                out.print(request.getParameter("cboContratoR"));
                            //if(SaldoCO<(NumberFormat.getInstance(Locale.US).parse(sImporte).doubleValue()))
                                out.print("<font class=\"subtitulo\" >&nbsp;&nbsp;[Saldo disponible: "+NumberFormat.getCurrencyInstance(Locale.US).format(SaldoCO)+"]</font>");      
                                }
                            %>
                            </td>
                        </tr>
                        <%
                        if(!(request.getParameter("cboFormasL")).equals("21")) 
                        {%>
                            <tr  > 
                            <td align="left">Divisa: </td>
                            <td > <%=(String)request.getParameter("cboDivisa")%> 
                            </td>
                            </tr>                                                
                            
                            <tr  > 
                            <td>Importe del retiro:</td>
                            <td > 
                            <%  if(request.getParameter("txtImporteR")!=null)
                            out.print("$"+((NumberFormat.getCurrencyInstance(Locale.US).format(NumberFormat.getInstance(Locale.US).parse(sImporte).doubleValue())).replace('$',' ')).trim());
                            %>
                            </td>
                            </tr>
                                                                            
                                                                                                    
                            <%if( cveMoneda != 1 ) {%>
                            <tr  > 
                              <td align="left">Tipo de Cambio Provisional: </td>
                              <td > <%=cotizacion%> 
                              </td>
                            </tr>
                            <%}%>
                        
                        <%}%>
                        <%if(!(request.getParameter("cboFormasL")).equals("21"))
                        {%>
                        <tr   > 
                          <td > Concepto del retiro: </td>
                          <td > 
                            <%
                              if(request.getParameter("cboConceptoR")!=null)
                                 out.print(request.getParameter("txtConcepto"));
                            %>
                          </td>
                        </tr>

                            <tr  > 
                          <td>Forma de Liquidaci&oacute;n:</td>
                          <td> 
                            <%if(request.getParameter("cboFormasL")!=null)
                                       out.print(request.getParameter("txtFormaLiq"));%>
                          </td>
                        </tr>
                        <%} else {%>
                        <tr  > 
                          <td> Concepto del retiro:</td>
                          <td > 
                            <% 
                                if(request.getParameter("cboConceptoR")!=null)
                                    out.print(request.getParameter("txtConcepto"));
                              %>
                          </td>
                        </tr>
						
                        <tr  > 
                          <td  >Forma de Liquidaci&oacute;n: </td>
                          <td > 
                            <%if(request.getParameter("cboFormasL")!=null)
                                       out.print(request.getParameter("txtFormaLiq"));%>
                          </td>
                        </tr>
                        <%}%>
                        <tr> 
                          <td  colspan="2" align="center"  >&nbsp;</td>
                        </tr>
                        <%
                        if(
                        (
                            (request.getParameter("cboFormasL")).equals("31")|| // CHEQUE DEL BANCO
                            (request.getParameter("cboFormasL")).equals("2")||
                            (request.getParameter("cboFormasL")).equals("11")  
                            )&&request.getParameter("cboFormasL")!=null  && request.getParameter("pagosM")==null) 
                        {%>
                            <%if((request.getParameter("cboFormasL")).equals("2")||
                            (request.getParameter("cboFormasL")).equals("11")){%>
                                <tr  > 
                                <td>Nombre del Beneficiario:</td>
                                <td > 
                                <% 				
                                out.print(request.getParameter("txtNomBeneficiario"));						
                                %>
                                </td>
                                </tr>
                        <%}
                        }         

                        if( ( (request.getParameter("cboFormasL")).equals("3") || 
                        (request.getParameter("cboFormasL")).equals("17") ) 
                        && request.getParameter("txtFormaLiq")!=null 
                        && request.getParameter("pagosM")==null)
                        {
                            System.out.println("Entro a la opcion: "+request.getParameter("cboFormasL"));
                        %>
                            
                            <%if(request.getParameter("txtCuentaClabeSpei")!=null||
                            request.getParameter("txtCuentaClabeSpeiHidden")!=null){%>
                                <tr  > 
                                <td >Cuenta Clabe:</td>
                                <td> 
                                <% if(request.getParameter("txtCuentaClabeSpei")!=null||
                                request.getParameter("txtCuentaClabeSpeiHidden")!=null)
                                out.print(request.getParameter("txtCuentaClabeSpei")==null?
                                request.getParameter("txtCuentaClabeSpeiHidden"):
                                request.getParameter("txtCuentaClabeSpei"));%>
                                </td>
                                </tr>	
                                
                                <tr  > 
                                <td >Titular:</td>
                                <td> 
                                <% if(request.getParameter("txtTitularCuentaClabeSpei")!=null||
                                request.getParameter("txtTitularCuentaClabeSpeiHidden")!=null)
                                out.print(request.getParameter("txtTitularCuentaClabeSpei")==null?
                                request.getParameter("txtTitularCuentaClabeSpeiHidden"):
                                request.getParameter("txtTitularCuentaClabeSpei"));%>
                                </td>
                                </tr>	
                            <%}%>				
				
                            <tr  > 
                            <td >Subcuenta:</td>
                            <td> 
                            <% if(request.getParameter("cboSubCtas")!=null)
                            out.print(request.getParameter("cboSubCtas"));
                            %>
                            </td>
                            </tr>
                <% }//FIN DE CONDICION SPEI
                        
                  //NUEVA SECCION 31 EXPEDICION CHEQUE DE CAJA         
	  	if( (request.getParameter("cboFormasL")).equals("31")  
                && request.getParameter("cboFormasL")!=null && request.getParameter("pagosM")==null)
                  {%>
                    <input type="hidden" name="HiddencboNomPer" value="<%=request.getParameter("cboNomPer")%>">			  
                    <%if(request.getParameter("cboNomPer")!=null){
                    if(!request.getParameter("cboNomPer").equals("-1")){%>
                            <tr  > 
                            <td >Tipo de Operacion:</td>
                            <td> 
                            <% if(request.getParameter("cboNomPer")!=null)
                            out.print(request.getParameter("cboNomPer"));%>
                            </td>
                            </tr>	
                            <tr  > 
                            <td >Nombre persona para recibir cheque:</td>
                            <td> 
                            <% if(request.getParameter("txtperschequeCaja")!=null)
                            out.print(request.getParameter("txtperschequeCaja"));%>
                            </td>
                            </tr>
                            <tr  > 
                            <td >Calle:</td>
                            <td> 
                            <% if(request.getParameter("txtCalleCaja")!=null)
                            out.print(request.getParameter("txtCalleCaja"));%>
                            </td>
                            </tr>
                            <tr  > 
                            <td >Numero Exterior:</td>
                            <td> 
                            <% if(request.getParameter("txtNumExtCaja")!=null)
                            out.print(request.getParameter("txtNumExtCaja"));%>
                            </td>
                            </tr>
                            <tr  > 
                            <td >Numero Interior:</td>
                            <td> 
                            <% if(request.getParameter("txtNumIntCaja")!=null)
                            out.print(request.getParameter("txtNumIntCaja"));%>
                            </td>
                            </tr>
                            <tr  > 
                            <td >Colonia:</td>
                            <td> 
                            <% if(request.getParameter("txtColoniaCaja")!=null)
                            out.print(request.getParameter("txtColoniaCaja"));%>
                            </td>
                            </tr>
                            <tr  > 
                            <td >Delegacion:</td>
                            <td> 
                            <% if(request.getParameter("txtDeleCaja")!=null)
                            out.print(request.getParameter("txtDeleCaja"));%>
                            </td>
                            </tr>
                            <tr  > 
                            <td >Codigo Postal:</td>
                            <td> 
                            <% if(request.getParameter("txtCpCaja")!=null)
                            out.print(request.getParameter("txtCpCaja"));%>
                            </td>
                            </tr>
                            <tr  > 
                            <td >Estado:</td>
                            <td> 
                            <% if(request.getParameter("txtEstadoCaja")!=null)
                            out.print(request.getParameter("txtEstadoCaja"));%>
                            </td>
                            </tr>
                            <tr  > 
                            <td >Ciudad:</td>
                            <td> 
                            <% if(request.getParameter("txtCiudadCaja")!=null)
                            out.print(request.getParameter("txtCiudadCaja"));%>
                            </td>
                            </tr>
                        <% }
                        }
                    }//FIN DE CONDICION INDIVIDUALIZACION E FONDOS  

                    if( ((request.getParameter("cboFormasL")).equals("31")  ) && 
                    request.getParameter("cboFormasL")!=null  && request.getParameter("pagosM")==null)
                    {%>

 			<input type="hidden" name="HiddentxtBeneficiarioChequeR" value="<%=request.getParameter("txtBeneficiarioChequeR")%>">			  
				
                        <tr  > 
                        <td >Nombre de Beneficiario:</td>
                        <td> 
                        <% if(request.getParameter("txtBeneficiarioChequeR")!=null)
                             out.print(request.getParameter("txtBeneficiarioChequeR"));%>
                        </td>
                        </tr>	
                        <tr  > 
                        <td >Nombre persona para recibir cheque:</td>
                        <td> 
                        <% if(request.getParameter("txtperschequeCaja")!=null)
                            out.print(request.getParameter("txtperschequeCaja"));%>
                        </td>
                        </tr>
                        <tr  > 
                        <td >Calle:</td>
                        <td> 
                        <% if(request.getParameter("txtCalleCaja")!=null)
                            out.print(request.getParameter("txtCalleCaja"));%>
                        </td>
                        </tr>
                        <tr  > 
                        <td >Numero Exterior:</td>
                        <td> 
                        <% if(request.getParameter("txtNumExtCaja")!=null)
                            out.print(request.getParameter("txtNumExtCaja"));%>
                        </td>
                        </tr>
                        
                        <tr  > 
                        <td >Numero Interior:</td>
                        <td> 
                        <% if(request.getParameter("txtNumIntCaja")!=null)
                            out.print(request.getParameter("txtNumIntCaja"));%>
                        </td>
                        </tr>
                        
                        
                        <tr  > 
                        <td >Colonia:</td>
                        <td> 
                        <% if(request.getParameter("txtColoniaCaja")!=null)
                            out.print(request.getParameter("txtColoniaCaja"));%>
                        </td>
                        </tr>
                        
                        
                        <tr  > 
                        <td >Delegacion:</td>
                        <td> 
                        <% if(request.getParameter("txtDeleCaja")!=null)
                            out.print(request.getParameter("txtDeleCaja"));%>
                        </td>
                        </tr>
                        
                        
                        <tr  > 
                        <td >Codigo Postal:</td>
                        <td> 
                        <% if(request.getParameter("txtCpCaja")!=null)
                            out.print(request.getParameter("txtCpCaja"));%>
                        </td>
                        </tr>
                        
                        
                        <tr  > 
                        <td >Estado:</td>
                        <td> 
                        <% if(request.getParameter("txtEstadoCaja")!=null)
                            out.print(request.getParameter("txtEstadoCaja"));%>
                        </td>
                        </tr>
                        
                        
                        <tr  > 
                        <td >Ciudad:</td>
                        <td> 
                        <% if(request.getParameter("txtCiudadCaja")!=null)
                            out.print(request.getParameter("txtCiudadCaja"));%>
                        </td>
                        </tr>

                <%}
                //SWIFT
                if((request.getParameter("cboFormasL")).equals("21")&&
                request.getParameter("txtFormaLiq")!=null && request.getParameter("pagosM")==null)  
                  {%>
                        <tr  > 
                        <td height="29" colspan="2" align="center" class="celda01">Datos 
                        del Banco Domiciliario</td>
                        </tr>
                        <tr  > 
                        <td >Pa&iacute;s:</td>
                        <td> 
                        <% if(request.getParameter("cboPaisDSwiftR")!=null)
                        out.print(request.getParameter("cboPaisDSwiftR"));
                        %>
                        </td>
                        </tr>
                        <tr  > 
                        <td >Ciudad:</td>
                        <td> 
                        <% if(request.getParameter("txtCiudadDSwiftR")!=null)
                        out.print(request.getParameter("txtCiudadDSwiftR"));
                        %>
                        </td>
                        </tr>
                        <tr  > 
                        <td >Nombre del Banco:</td>
                        <td> 
                        <% if(request.getParameter("txtBancoDSwiftR")!=null)
                        out.print(request.getParameter("txtBancoDSwiftR"));%>
                        </td>
                        </tr>
                        <tr  > 
                        <td>Plaza:</td>
                        <td> 
                        <% if(request.getParameter("txtPlazaSwiftR")!=null)
                        out.print(request.getParameter("txtPlazaSwiftR"));
                        %>
                        </td>
                        </tr>
                        <tr  > 
                        <td >Sucursal:</td>
                        <td > 
                        <% if(request.getParameter("txtSucursalSwiftR")!=null)
                        out.print(request.getParameter("txtSucursalSwiftR"));
                        %>
                        </td>
                        </tr>
                        <tr  > 
                        <td>N&uacute;mero de Cuenta:</td>
                        <td> 
                        <% if(request.getParameter("txtCuentaSwiftR")!=null)
                        out.print(request.getParameter("txtCuentaSwiftR"));
                        %>
                        </td>
                        </tr>
                        <tr  > 
                        <td >Pago Unico:</td>
                        <td> 
                        <% if(request.getParameter("txtPagoUnico")!=null)
                        out.print(request.getParameter("txtPagoUnico"));%>
                        </td>
                        </tr>
                        
                        <tr  > 
                        <td >Branch:</td>
                        <td> 
                        <% if(request.getParameter("txtBranchSwiftR")!=null)
                        out.print(request.getParameter("txtBranchSwiftR"));
                        %>
                        </td>
                        </tr>
                        <tr  >
                        <td>Moneda Extranjera:</td>
                        <td> 
                        <% if(request.getParameter("cboMonedaSwiftR")!=null)
                        out.print(request.getParameter("cboMonedaSwiftR"));
                        %>
                        </td>
                        </tr>
                        <tr  >
                        <td>Importe a transferir en Moneda Extranjera:</td>
                        <td> 
                        <% if(request.getParameter("txtImporteTSwiftR")!=null)
                        out.print("$"+((NumberFormat.getCurrencyInstance(Locale.US).format(NumberFormat.getInstance(Locale.US).parse(sImporte).doubleValue())).replace('$',' ')).trim());
                        %>
                        </td>
                        </tr>
                        <tr > 
                        <td >C�digo SWIFT ABA o IBAN :</td>
                        <td colspan="2" > 
                        <% if(request.getParameter("txtCodigoSwiftR")!=null)
                        out.print(request.getParameter("txtCodigoSwiftR") + " ");
                        if(request.getParameter("txtCodigoSWIFT")!=null)
                        out.print(request.getParameter("txtCodigoSWIFT"));
                        %>
                        </td>
                        </tr>
                        <!---------------------------------------------------------------------------------------------------------------------------------->
                        <tr   > 
                        <td height="29" colspan="2"  align="center" class="celda01">Datos 
                        del Beneficiario</td>
                        </tr>
                        <tr  > 
                        <td >Nombre:</td>
                        <td> 
                        <% if(request.getParameter("txtNombreBSwiftR")!=null)
                        out.print(request.getParameter("txtNombreBSwiftR"));
                        %>
                        </td>
                        </tr>
                        <tr  > 
                        <td>Pa&iacute;s:</td>
                        <td> 
                        <% if(request.getParameter("cboPaisBSwiftR")!=null)
                        out.print(request.getParameter("cboPaisBSwiftR"));
                        %>
                        </td>
                        </tr>
                        <tr  > 
                        <td >Ciudad:</td>
                        <td> 
                        <% if(request.getParameter("txtCiudadBSwiftR")!=null)
                        out.print(request.getParameter("txtCiudadBSwiftR"));
                        %>
                        </td>
                        </tr>
                        <tr  > 
                        <td >Domicilio:</td>
                        <td> 
                        <% if(request.getParameter("txtDomicilioBSwiftR")!=null)
                        out.print(request.getParameter("txtDomicilioBSwiftR"));
                        %>
                        </td>
                        </tr>
                        <tr  > 
                        <td>Tel&eacute;fono:</td>
                        <td> 
                        <% if(request.getParameter("txtTelefonoBSwiftR")!=null)
                        out.print(request.getParameter("txtTelefonoBSwiftR"));
                        %>
                        </td>
                        </tr>
                        <tr  > 
                        <td >Referencia:</td>
                        <td> 
                        <% if(request.getParameter("txtSWreferenciapago8")!=null)
                        out.print(request.getParameter("txtSWreferenciapago8"));%>
                        </td>
                        </tr>
                        <tr  > 
                        <td >Referencia 2:</td>
                        <td> 
                        <% if(request.getParameter("txtSWreferenciapago82")!=null)
                        out.print(request.getParameter("txtSWreferenciapago82"));%>
                        </td>
                        </tr>
                        <tr  > 
                        <td >Referencia 3:</td>
                        <td> 
                        <% if(request.getParameter("txtSWreferenciapago83")!=null)
                        out.print(request.getParameter("txtSWreferenciapago83"));%>
                        </td>
                        </tr>
                    <% } %>
                        <%
                        if(request.getParameter("pagosM")!=null && request.getParameter("pagosM").equals("S") 
                        && sCaptura.equals("NO"))
						{%>
                        <tr > 
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                          <td align="center"  colspan="3">&nbsp;</td>
                          <td>&nbsp;</td>
                        </tr>
                        <tr > 
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                          <td align="center" class="subtitulo"  colspan="3">&nbsp;</td>
                          <td>&nbsp;</td>
                        </tr>
                        <%}%>
                        
                        <tr> 
                        <td align="center">&nbsp;</td>
                        </tr>
                        <% if(bRetiro)
                        {
                        %>
                        <tr> 
                        <td>&nbsp;</td>
                        <td align="left">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="javascript:history.back()"><u>Modificar
                        Instrucci&oacute;n</u></a></td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        </tr>
                        <tr>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td >&nbsp;</td>
                        </tr>
                        <%}%>
                                    <!--SECCION PARA SUBIR PDF-->
                                    <tr> 
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
                                    <%if(bRetiro){%>
                                    <button type="button" onclick="uploadFile()" class="btn btn-success">Subir</button>
                                    <button id="btnEnviarOPT" class="btn btn-primary py-2" onclick="solicitarOtp()" disabled>
                                        Enviar Codigo de Seguridad
                                    </button>                                    
                                    <%}%>
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
                        <td align="left"> 
                        <% if(!bRetiro)
                        {
                        %>
                        <input type="button" name="Modificar" value="Modificar" onClick="javascript:history.back()" class="btn btn-success"> 
                        <%}
                        else    {%>
                        <button type="submit" id="btnEnviar" class="btn btn-primary" disabled>Aceptar</button>
                        <%}%>
                        </td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        </tr>
                        
                      </table>
                    </form>
                </td>
                </tr>
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

                    // Habilitar el botón de submit final
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

        </td>
        </tr>
        <%
        }catch(Exception e)
        {System.out.println(e);}
        %>        

    </TABLE>
    </div>
  </BODY>
</HTML>

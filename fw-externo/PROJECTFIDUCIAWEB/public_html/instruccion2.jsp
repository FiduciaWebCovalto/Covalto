

<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.util.*,java.text.*"%>
<jsp:useBean id="BD"  class="com.bancomext.negocio.nInstrucciones"/>
<jsp:useBean id="BDRet"  class="com.bancomext.negocio.RetirosDB"/>
<jsp:useBean id="ct"  class="com.bancomext.negocio.nAcuerdos"/>
<jsp:useBean id="BD2"  class="com.bancomext.negocio.FiduciaBD"/>
<%@ include file="sesionInstrucc.jsp" %>
<%@ include file="pki.jsp" %>
<%@ include file="configura_bus.jsp" %>
<%@ include file="parametrosPKI.jsp" %>
<%@ page import="java.util.*, javax.mail.*, javax.mail.internet.*, java.io.*, javax.activation.*" %>
<%
String sArchivo =(String)request.getParameter("archivo");
String cveFormaLiq=(String)request.getParameter("cboFormaR");
String sAgregarCuenta=(String)request.getParameter("Agregarcuenta");
System.out.println("CuentaNuevaInstruccionRetiro: "+sAgregarCuenta);
   int numFiso=Integer.parseInt((String)session.getAttribute( "NumFid" ));
   boolean  bInstruccion=false;
   boolean bFirmasMan=false;
   System.out.println("Validacion Folio "+request.getParameter("txtFolio"));
	//VERIFICA QUE NO EXISTA UNA INSTRUCCION CON ESTE FOLIO
	if(BD.existeFolio(request.getParameter("txtFolio"),2))
		{
		session.setAttribute("msgError","Tu operaci�n no fue procesada<br>Por Favor, registrala nuevamente <br><br> No. Operaci�n : "+(request.getParameter("txtOperacion")).trim());
		%>
		<jsp:forward page="FI_Instrucciones.jsp"/>    
		<%     
		}

    String[] valCtoInver=null;
    String sCmbCtoInver="";  
    System.out.println("Contrato de inversion: "+request.getParameter("cboContratoR"));
    System.out.println("Cuenta de Cheques: "+request.getParameter("cboCtaCheques"));
    String sConceptoE="";
    if(request.getParameter("cboConceptoR")!=null&&request.getParameter("txtConceptoR")==null)
        sConceptoE=request.getParameter("cboConceptoR");
    else if(request.getParameter("txtConceptoR")!=null)
        sConceptoE=request.getParameter("txtConceptoR");
    
    sCmbCtoInver=request.getParameter("cboContratoR")==null?"":request.getParameter("cboContratoR");
    if(sCmbCtoInver.length()>0){
        System.out.println("Split cto inver");
      valCtoInver=((String)request.getParameter("cboContratoR")).split("-");
    }  



	//se validan los saldos disponibles
    if(sCaptura.equals("NO"))
		{       	
   		double impR= NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImporteR")!=null?request.getParameter("txtImporteR"):"0").doubleValue();      
	    double impRSWIFT= NumberFormat.getInstance(Locale.US).parse(request.getParameter("txtImporteTSwiftR")!=null?request.getParameter("txtImporteTSwiftR"):"0").doubleValue();
	  }
 String fechaValor = request.getParameter("fechaValor")!=null?request.getParameter("fechaValor"):fecha; 
 //en caso de no haber cto inver la moneda siempre es 1 es decir nacional
 //String[] moneda = BD2.getData(43,(valCtoInver[2]!=null?valCtoInver[2]:"1"));
 
 String[] sData = new String[200];	
	sData[0] = fechaValor;
	sData[1] = Folio;//ID
	sData[2] = (String)session.getAttribute("NumFid");
  if(valCtoInver==null)
      sData[3]="0";
  else
      sData[3] = (valCtoInver[0]!=null?valCtoInver[0]:"0");
	sData[4] = request.getParameter("txtImporteR");
	sData[5] = "SI";
	sData[6] = request.getParameter("txtConceptoR");
  sData[63] = request.getParameter("cboCtaCheques").length()==0?"0":request.getParameter("cboCtaCheques");
  Object algo = request.getParameter("cboSubCtas");
  
  if(algo!=null)
    sData[64] = algo!=null&&request.getParameter("cboSubCtas").indexOf("-")>-1?request.getParameter("cboSubCtas").substring(0,request.getParameter("cboSubCtas").indexOf("-")):"0";
  else
    sData[64] = "0";
	sData[7] = (request.getParameter("cboFormaR")).trim();
	sData[10] = "";
	// Concepto
	sData[48] = (request.getParameter("cboConceptoR")).trim();
	//Datos del Comite Tecnico
   sData[56] = (String)request.getParameter("txtFechaSesion")!=null?(String)request.getParameter("txtFechaSesion") :"01/01/2099";
   sData[57] = (String)request.getParameter("txtTipoSesion")!=null?(String)request.getParameter("txtTipoSesion") :"0";
   sData[58] = request.getParameter("txtNoAcuerdo") ;
   
	// Tipo de liquidacion
	sData[49] = (request.getParameter("txtLiquidacion")).trim();
	// Numero de operacion
	sData[50] = (request.getParameter("txtOperacion")).trim();

	// Numero Persona
	sData[51] = (request.getParameter("txtTipoPersona")).trim();
	
	//String sEntidad[][]= BDRet.getDataFormas(8,(String)session.getAttribute("NumFid"), sData[3]);
		
	sData[52]="0";
	sData[53]="0";
 
  // Numero de persona
	if(sData[51].equals("1"))
		sData[47] = "1";//FIDEICOMITENTE";
	else if(sData[51].equals("2"))
		sData[47] = "2";//"BENEFICIARIO";
	else 
		sData[47] = "3";//"TERCERO";
	
   String snumPresona = (String)(request.getParameter("txtNumPersona"));
   if(request.getParameter("txtNomBeneficiario")!=null){
    sData[51]=(request.getParameter("txtNomBeneficiario")!=null?(String)request.getParameter("txtNomBeneficiario"):"0");
   }
   else{
        // Cambia la variable para captura el Numero de Persona	
        if(snumPresona!=null && !snumPresona.equals("null")){
        sData[51] =snumPresona.substring(0,snumPresona.indexOf('-')).trim();
        }else{
        sData[51]=(request.getParameter("txtNomBeneficiario")!=null?(String)request.getParameter("txtNomBeneficiario"):"0");
        }
  }
  
	//Retiro en espera de autorizacion
	sData[30]=sCaptura;
	sData[31] = (String)session.getAttribute( "NumUser") ;

	  if(
    (
    (request.getParameter("cboFormaR")).equals("1")||
    (request.getParameter("cboFormaR")).equals("2")||
    (request.getParameter("cboFormaR")).equals("11")
    )
    && request.getParameter("cboFormaR")!=null && request.getParameter("pagosM")==null) {

			  sData[8] = request.getParameter("txtBeneficiarioChequeR");
			  sData[9] = request.getParameter("cboBancoChequeR") ;
		   }
	

	 if((
         (request.getParameter("cboFormaR")).equals("3")  || 
         (request.getParameter("cboFormaR")).equals("31") ||
         request.getParameter("cboFormaR").equals("11")  || 
         (request.getParameter("cboFormaR")).equals("2")) &&  
         request.getParameter("cboFormaR")!=null && 
         request.getParameter("pagosM")==null)  

               {
                  
                                  System.out.println("Cuenta clabe: "+request.getParameter("txtCuentaClabeSpei"));  
                                  System.out.println("Cuenta clabe Hidden: "+request.getParameter("txtCuentaClabeSpeiHidden"));  
                                  String scuentaclabe="",sTitular="";
                                  if(request.getParameter("txtCuentaClabeSpei")!=null&&
                                  !request.getParameter("txtCuentaClabeSpei").equals("null")){
                                    scuentaclabe=request.getParameter("txtCuentaClabeSpei");
                                    sTitular=request.getParameter("txtTitularCuentaClabeSpei");                                  
                                  }else{
                                    scuentaclabe=request.getParameter("txtCuentaClabeSpeiHidden");
                                    sTitular=request.getParameter("txtTitularCuentaClabeSpeiHidden");
                                  }
                                  System.out.println("Cuenta scuentaclabe: "+scuentaclabe);  
                                  System.out.println("sTitular: "+sTitular);
				  if(scuentaclabe!=null){ 
					  sData[10] =scuentaclabe;// request.getParameter("txtCuentaClabeSpeiHidden")!=null?(String)request.getParameter("txtCuentaClabeSpeiHidden"):"";                                 
                                          sData[51] = sTitular;//request.getParameter("txtTitularCuentaClabeSpeiHidden")!=null?(String)request.getParameter("txtTitularCuentaClabeSpeiHidden"):"";
					  sData[8] = "0";
					  sData[9] = "0";
					  sData[11] = "0";
					  sData[12] = "0";
					  sData[13] = "0";
					  sData[54] = "0";				  }
					else				  
					{
					  sData[8] = "0";
                                          sData[51] = "0";
					  sData[10] = "0";
					  sData[9] = "0";
					  sData[10] = "0";
					  sData[11] = "0";
					  sData[12] = "0";
					  sData[13] = "0";
					  sData[54] = "0";				
					}
               }
               
	  if((request.getParameter("cboFormaR")).equals("21")&&
          request.getParameter("cboFormaR")!=null && request.getParameter("pagosM")==null) 
               {
                  sData[4] = request.getParameter("txtImporteTSwiftR");
                  sData[8] = request.getParameter("txtBancoDSwiftR") ;
                  sData[9] = request.getParameter("cboPaisDSwiftR") ;
                  sData[10] = request.getParameter("txtPlazaSwiftR") + "," + request.getParameter("txtCodigoSWIFT");
                  sData[11] = request.getParameter("txtCiudadDSwiftR") ;
                  sData[12] = request.getParameter("txtSucursalSwiftR") ;
                  sData[13] = request.getParameter("txtCuentaSwiftR") ;
                  sData[14] = request.getParameter("txtBranchSwiftR") ;
                  sData[15] = request.getParameter("cboMonedaSwiftR") ;
                  sData[16] = request.getParameter("txtCodigoSwiftR") ;
                  sData[17] = request.getParameter("txtNombreBSwiftR") ;
                  sData[18] = request.getParameter("cboPaisBSwiftR") ;
                  sData[19] = request.getParameter("txtCiudadBSwiftR") ;
                  sData[20] = request.getParameter("txtDomicilioBSwiftR") ;
                  sData[21] = request.getParameter("txtTelefonoBSwiftR") ;				
                  sData[59] = ((String)request.getParameter("txtCodigoSWIFT")).trim().equals("ABA")?"1":"2";//PARA SWIFT TIPO ABA O IBAN                  
                }
              else
              sData[59] = "0";

                if( request.getParameter("cboAcuerdosComiteTec")!=null &&  !request.getParameter("cboAcuerdosComiteTec").trim().equals(""))
                sData[22] = request.getParameter("cboAcuerdosComiteTec") ;
                if(request.getParameter("pagosM")!=null && request.getParameter("pagosM").equals("S")&&request.getParameter("cboFormaR")!=null) 
               {
                      sData[7] ="3";//PM
                      sData[29]=request.getParameter("cboFormaR"); //.equals("19")?"19":request.getParameter("cboFormaR").equals("20")?"20":request.getParameter("cboFormaR").equals("22")?"22":"";
               }
    sData[55] = (String)request.getParameter("txtCveMoneda");//MONEDA CTOINVER  
    sData[60] = request.getParameter("txtTipoCambio")!=null?(String)request.getParameter("txtTipoCambio"):""; //Cotizacion	 
    sData[61] = ""; //Cotizacion	 
    sData[62] = (String)session.getAttribute( "permiso" );
  
  
  //MESA DE CONTROL
    //SE ALMACENARA LA OPERACION EN LA CLAVE 100
    //Los Criterios para armar la operacion son los siguientes
    /*
    digito 1 - fijo "1"
    digito 2 clave 639 - 	"2" Deposito (Ingreso)
                          "1" Retiro (Egreso)
    Para Retiros:              
      digito 3 y 4 clave 2 -  Forma de liquidacion
      digito 5 - 	"1" Pago Multiple
          "0" Si no es Pago Multiple    
    Para Depositos:
      Se rellena con "000"
    */   
    String sPagoMultiple="";
    sPagoMultiple=request.getParameter("pagosM")!=null?request.getParameter("pagosM").toString():"N";
    sData[100]=("11"+(cveFormaLiq.trim().length()==1?("0"+cveFormaLiq.trim()).trim():(!cveFormaLiq.trim().equals("22")?cveFormaLiq.trim():"22")  )+
    (sPagoMultiple.equals("S")?"1":"0")).trim();  
  
  
	 String[] bitacora = new String[4];
	 bitacora[0]=fecha;
	 bitacora[1]=Folio;
	 bitacora[2]=(String)session.getAttribute("username");
	 bitacora[3]="Retiro por Internet con Folio: "+Folio+(sCaptura.equals("SI") || bFirmasMan ?"  y en espera de autorizaci�n":"");//+detalleBit;
	 
	 String[] firmas = new String[5];
	 firmas[0]= sCaptura.equals("SI")?"1":"2";
	 firmas[1]= Folio;
	 firmas[2]= (String)session.getAttribute("NumFid");
	 firmas[3]= (String)session.getAttribute("NumUser");
	 firmas[4]= fecha; 
	 
   

	 String[] honorarios = new String[7];	 
	 
	 	 
	 if(sCaptura.equals("NO"))
	{         
/**************************************************************Firma Digital***********************************************************/
   %>		
   <%@ include file="firmaDigital.jsp" %>
   <%//{//error de llave por finally  
/**************************************************************Fin Firma Digital********************************************************/
	}
        bInstruccion=true;
  /*SE RECUPERA LA INFORMACION PARA TABLA COMPLEMENTARIA 2*/ 
        System.out.println("Primer Punto de Control: ");
        String txtPagoUnicoHidden=request.getParameter("txtPagoUnicoHidden")!=null?(String)request.getParameter("txtPagoUnicoHidden"):"";
        String txtperschequeCajaHidden=request.getParameter("txtperschequeCajaHidden")!=null?(String)request.getParameter("txtperschequeCajaHidden"):"";
        String txtreferenciapago8Hidden=request.getParameter("txtreferenciapago8Hidden")!=null?(String)request.getParameter("txtreferenciapago8Hidden"):""; 
        String txtreferenciapago82Hidden=request.getParameter("txtreferenciapago82Hidden")!=null?(String)request.getParameter("txtreferenciapago82Hidden"):""; 
        String txtreferenciapago83Hidden=request.getParameter("txtreferenciapago83Hidden")!=null?(String)request.getParameter("txtreferenciapago83Hidden"):""; 
        String txtSWreferenciapago8Hidden=request.getParameter("txtSWreferenciapago8Hidden")!=null?(String)request.getParameter("txtSWreferenciapago8Hidden"):""; 
        String txtSWreferenciapago82Hidden=request.getParameter("txtSWreferenciapago82Hidden")!=null?(String)request.getParameter("txtSWreferenciapago82Hidden"):"";
        String txtSWreferenciapago83Hidden=request.getParameter("txtSWreferenciapago83Hidden")!=null?(String)request.getParameter("txtSWreferenciapago83Hidden"):"";
        String txtCalleCajaHidden=request.getParameter("txtCalleCajaHidden")!=null?(String)request.getParameter("txtCalleCajaHidden"):"";
        String txtNumExtCajaHidden=request.getParameter("txtNumExtCajaHidden")!=null?(String)request.getParameter("txtNumExtCajaHidden"):"";
        String txtNumIntCajaHidden=request.getParameter("txtNumIntCajaHidden")!=null?(String)request.getParameter("txtNumIntCajaHidden"):"";
        String txtColoniaCajaHidden=request.getParameter("txtColoniaCajaHidden")!=null?(String)request.getParameter("txtColoniaCajaHidden"):"";
        String txtDeleCajaHidden=request.getParameter("txtDeleCajaHidden")!=null?(String)request.getParameter("txtDeleCajaHidden"):"";
        String txtCpCajaHidden=request.getParameter("txtCpCajaHidden")!=null?(String)request.getParameter("txtCpCajaHidden"):"";
        String txtEstadoCajaHidden=request.getParameter("txtEstadoCajaHidden")!=null?(String)request.getParameter("txtEstadoCajaHidden"):"";
        String txtCiudadCajaHidden=request.getParameter("txtCiudadCajaHidden")!=null?(String)request.getParameter("txtCiudadCajaHidden"):"";
        sData[100]=txtPagoUnicoHidden;
        sData[101]=txtperschequeCajaHidden;
        sData[102]=txtreferenciapago8Hidden;
        sData[103]=txtreferenciapago82Hidden;
        sData[104]=txtreferenciapago83Hidden;
        sData[105]=txtCalleCajaHidden;
        sData[106]=txtNumExtCajaHidden;
        sData[107]=txtNumIntCajaHidden;
        sData[108]=txtColoniaCajaHidden;
        sData[109]=txtDeleCajaHidden;
        sData[110]=txtCpCajaHidden;
        sData[111]=txtEstadoCajaHidden;
        sData[112]=txtCiudadCajaHidden;  
        System.out.println("Segundo Punto de Control: ");
        
      bInstruccion=BD.insertaRetiro(sData,bitacora,firmas,null);   

		if(cveFormaLiq!=null&&bInstruccion){ 
			 String txtTipoPagoHidden=request.getParameter("cboTipoPago")!=null?(String)request.getParameter("cboTipoPago"):""; 
			 String txtConvenioCieTipoPagoHidden=request.getParameter("txtConvenioCieTipoPagoHidden")!=null?(String)request.getParameter("txtConvenioCieTipoPagoHidden"):""; 
			 String txtReferenciaTipoPagoHidden=request.getParameter("txtReferenciaTipoPagoHidden")!=null?(String)request.getParameter("txtReferenciaTipoPagoHidden"):""; 
			 String txtBeneficiarioTipoPagoHidden=request.getParameter("txtBeneficiarioTipoPagoHidden")!=null?(String)request.getParameter("txtBeneficiarioTipoPagoHidden"):""; 
			 String txtLineaCapturaTipoPagoHidden=request.getParameter("txtLineaCapturaTipoPagoHidden")!=null?(String)request.getParameter("txtLineaCapturaTipoPagoHidden"):""; 
			 String txtRFCContribuyenteTipoPagoHidden=request.getParameter("txtRFCContribuyenteTipoPagoHidden")!=null?(String)request.getParameter("txtRFCContribuyenteTipoPagoHidden"):""; 			 
			 String txtFechaVencimientoTipoPagoHidden=request.getParameter("txtFechaVencimientoTipoPagoHidden")!=null?(String)request.getParameter("txtFechaVencimientoTipoPagoHidden"):""; 
			 String txtFechaCumplimientoTipoPagoHidden=request.getParameter("txtFechaCumplimientoTipoPagoHidden")!=null?(String)request.getParameter("txtFechaCumplimientoTipoPagoHidden"):""; 
			 String txtCuentaClabeSpeiHidden=request.getParameter("txtCuentaClabeSpeiHidden")!=null?(String)request.getParameter("txtCuentaClabeSpeiHidden"):""; 
			 String txtTitularCuentaClabeSpeiHidden=request.getParameter("txtTitularCuentaClabeSpeiHidden")!=null?(String)request.getParameter("txtTitularCuentaClabeSpeiHidden"):""; 					 
			bInstruccion = BD.insertaRetiroComp(2,firmas[2],Folio,txtTipoPagoHidden,txtConvenioCieTipoPagoHidden,txtReferenciaTipoPagoHidden,txtBeneficiarioTipoPagoHidden,
			txtLineaCapturaTipoPagoHidden,txtRFCContribuyenteTipoPagoHidden,txtFechaCumplimientoTipoPagoHidden,txtFechaVencimientoTipoPagoHidden,txtCuentaClabeSpeiHidden,
			txtTitularCuentaClabeSpeiHidden);  
			System.out.println("Resultado insertaRetiroComp "+bInstruccion);
		}
                
     if(bInstruccion){           
%>
      <script>
        sendEmail( "<%=(String)session.getAttribute("username")%>",
        "<%=(String)request.getParameter("txtFolio")%>" ,'RETIRO',
        "<%=(String)request.getParameter("txtImporteR")%>",
        "<%=sConceptoE%>");
      </script>
      <%
        System.out.println("Envio correo alta cuenta: "+sAgregarCuenta);
        if(sAgregarCuenta!=null)
            if(sAgregarCuenta.equals("1")){
            %>
                <script>      
                sendEmailCuentaNueva( "<%=(String)session.getAttribute("username")%>",
                "<%=(String)session.getAttribute("NumFid")%>" ,
                "<%=(String)request.getParameter("txtCuentaClabeSpei")%>",
                "<%=(String)request.getParameter("fechaValor")%>");
                </script>      
            <%
            }
      }	 				
   if(!bInstruccion)
					  {
					    session.setAttribute("msgError","Tu operaci�n no fue procesada<br> No. Operaci�n : "+request.getParameter("txtOperacion")+"<br><br>Intenta nuevamente");
						%>
						<jsp:forward page="FI_Instrucciones.jsp"/>    
						<%       
						}%>
          
<HTML>
<HEAD>
<TITLE>Instrucciones - FiduciaWeb Movil</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META content="P�gina Principal" name=O>
<link href="styles/bancomext.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/JavaScript">
function instrucciones()
	{
	parent.location="FI_Instrucciones.jsp";
	}

function imprimir()
	{
	window.print();
	parent.location="FI_Instrucciones.jsp";
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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script> 

</HEAD>
<BODY vLink=#052206 leftMargin=0 topMargin=0 marginwidth="0" marginheight="0">
<jsp:include page="header.jsp"/>
<jsp:include page="NuevoMenu.jsp"/>
 
<div class="table-responsive" >
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
        </thead>
        <tbody> 

                <tr> 
                  <td>&nbsp;</td>
                  <td>Fideicomiso:</td>
                  <td><%= session.getAttribute( "Fideicomiso" ) %></td>
                </tr>
                <%if(request.getParameter("cboCtaCheques").length()>0){%><!--CHEQUE DEL BANCO-->
                      <tr> 
                        <td>&nbsp;</td>
                        <td> Retiro de Cuenta de Cheques:</td>
                        <td> 
                          <%
                                      if(request.getParameter("cboCtaCheques")!=null)
                                                  out.print(request.getParameter("cboCtaCheques"));
                          %>
                        </td>
                      </tr>
                <%}else{%>
                       <tr> 
                        <td>&nbsp;</td>
                        <td> Retiro del Contrato de Inversi&oacute;n:</td>
                        <td> 
                          <%
                                      if(request.getParameter("cboContratoR")!=null)
                                                  out.print(request.getParameter("cboContratoR"));
                          %>
                        </td>
                      </tr>
                <%}%>    
                <%
                                        if(!(request.getParameter("cboFormaR")).equals("21")) 
                                        {%>
                
                <tr> 
                <td>&nbsp;</td>
                  <td  > Divisa:</td>
                  <td  > 
                    <%=request.getParameter("txtNomMoneda")%>
                  </td>
                </tr>
                        
                <tr> 
                <td>&nbsp;</td>
                  <td  >Importe del retiro:</td>
                  <td > 
                    <%  if(request.getParameter("txtImporteR")!=null)
                                                            out.print(NumberFormat.getCurrencyInstance(Locale.US).format(Double.parseDouble(request.getParameter("txtImporteR")))); %>
                  </td>
                </tr>
                
              <%if(Integer.valueOf((String)request.getParameter("txtCveMoneda")).intValue()!=1){%> 
                <tr> 
                <td>&nbsp;</td>
                  <td  > Tipo de cambio Provisional:</td>
                  <td  > 
                    <%
                                if(request.getParameter("txtTipoCambio")!=null)
                                out.print(NumberFormat.getCurrencyInstance(Locale.US).format(Double.parseDouble(request.getParameter("txtTipoCambio"))));%>
                  </td>
                </tr>
              <%}%>        
                
                <%}%>   
                <tr > 
                <td>&nbsp;</td>
                  <td  > Concepto del retiro: </td>
                  <td > 
                    <%
                                                        if(request.getParameter("cboConceptoR")!=null&&request.getParameter("txtConceptoR")==null)
                                                                        out.print(request.getParameter("cboConceptoR"));
                                                        else if(request.getParameter("txtConceptoR")!=null)
                                                                out.print(request.getParameter("txtConceptoR")); 
                                        %>
                  </td>
                </tr>
                        
                   <%if( ct.aplica(numFiso,(String)session.getAttribute("permiso")))
                                                                {
            
                                                                %>
                <tr>
                <td>&nbsp;</td>
                  <td  >Acuerdo del Comite T&eacute;cnico: </td>
                  <td  > Fecha de Sesion&nbsp;<%=request.getParameter("txtFechaSesion")%> 
                    <br>
                    Tipo de Sesi&oacute;n: &nbsp; <%=request.getParameter("txtTipoSesion")%> 
                    <br>
                    No. Acuerdo:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=request.getParameter("txtNoAcuerdo")%> 
                  </td>
                </tr>
                        <%}%>
                <tr> 
                <td>&nbsp;</td>
                  <td  >Forma de Liquidaci&oacute;n:</td>
                  <td  > 
                    <%if(request.getParameter("txtFormaLiq")!=null)
                                                out.print(request.getParameter("txtFormaLiq"));%>
                  </td>
                </tr>
                <%	
                        if(
                ((request.getParameter("cboFormaR")).equals("2")||
                (request.getParameter("cboFormaR")).equals("11")||
                request.getParameter("cboFormaR").equals("31") /*CHEQUE DEL BANCO*/
                )
                &&request.getParameter("cboFormaR")!=null && request.getParameter("pagosM")==null) 
                                                        {%>
                <tr  > 
                <td>&nbsp;</td>
                  <td  >Nombre del Beneficiario:</td>
                  <td > 
                    <% if(request.getParameter("HiddentxtBeneficiarioChequeR")!=null)
                          out.print(request.getParameter("HiddentxtBeneficiarioChequeR"));%>
                  </td>
                </tr>
                <%}
                  if((request.getParameter("cboFormaR")).equals("31")&&request.getParameter("cboFormaR")!=null && request.getParameter("pagosM")==null) 
                  {%>
                  
                  <tr  > 
                  <td>&nbsp;</td>
                  <td  >Nombre persona para recibir cheque:</td>
                  <td > 
                    <% if(request.getParameter("txtperschequeCajaHidden")!=null)
                          out.print(request.getParameter("txtperschequeCajaHidden"));%>
                  </td>
                </tr>
                  
                  <tr  > 
                  <td>&nbsp;</td>
                  <td  >Calle:</td>
                  <td > 
                    <% if(request.getParameter("txtCalleCajaHidden")!=null)
                          out.print(request.getParameter("txtCalleCajaHidden"));%>
                  </td>
                </tr> 
                
                  <tr  > 
                  <td>&nbsp;</td>
                  <td  >Numero exterior:</td>
                  <td > 
                    <% if(request.getParameter("txtNumExtCajaHidden")!=null)
                          out.print(request.getParameter("txtNumExtCajaHidden"));%>
                  </td>
                </tr>
                <tr  > 
                <td>&nbsp;</td>
                  <td  >Numero interior:</td>
                  <td > 
                    <% if(request.getParameter("txtNumIntCajaHidden")!=null)
                          out.print(request.getParameter("txtNumIntCajaHidden"));%>
                  </td>
                </tr>
                <tr  > 
                <td>&nbsp;</td>
                  <td  >Colonia:</td>
                  <td > 
                    <% if(request.getParameter("txtColoniaCajaHidden")!=null)
                          out.print(request.getParameter("txtColoniaCajaHidden"));%>
                  </td>
                </tr>
                <tr  > 
                <td>&nbsp;</td>
                  <td  >Calle:</td>
                  <td > 
                    <% if(request.getParameter("txtCalleCajaHidden")!=null)
                          out.print(request.getParameter("txtCalleCajaHidden"));%>
                  </td>
                </tr>
                <tr  > 
                <td>&nbsp;</td>
                  <td  >Delegacion:</td>
                  <td > 
                    <% if(request.getParameter("txtDeleCajaHidden")!=null)
                          out.print(request.getParameter("txtDeleCajaHidden"));%>
                  </td>
                </tr>
                <tr  > 
                <td>&nbsp;</td>
                  <td  >Codigo Postal:</td>
                  <td > 
                    <% if(request.getParameter("txtCpCajaHidden")!=null)
                          out.print(request.getParameter("txtCpCajaHidden"));%>
                  </td>
                </tr>
                <tr  > 
                <td>&nbsp;</td>
                  <td  >Estado:</td>
                  <td > 
                    <% if(request.getParameter("txtEstadoCajaHidden")!=null)
                          out.print(request.getParameter("txtEstadoCajaHidden"));%>
                  </td>
                </tr>
                <tr  > 
                <td>&nbsp;</td>
                  <td  >Ciudad:</td>
                  <td > 
                    <% if(request.getParameter("txtCiudadCajaHidden")!=null)
                          out.print(request.getParameter("txtCiudadCajaHidden"));%>
                  </td>
                </tr>
                  
                  
                  
                   
                <%} 
   
                        // SE INCORPORA LA FORMA DE LIQUIDACION SPEI LA CUAL SUSTITUYE SPEUA Y FUNCIONA COMO TEF
            
                        if( ( (request.getParameter("cboFormaR")).equals("3") ||
                        (request.getParameter("cboFormaR")).equals("17") )&& 
                        request.getParameter("cboFormaR")!=null  && 
                        request.getParameter("pagosM")==null) 
                        {%>
                                    <%if(request.getParameter("txtCuentaClabeSpeiHidden")!=null){%>
                                        <tr   > 
                                        <td>&nbsp;</td>
                                        <td >Cuenta Clabe:</td>
                                        <td> 
                                        <% if(request.getParameter("txtCuentaClabeSpeiHidden")!=null)
                                        out.print(request.getParameter("txtCuentaClabeSpeiHidden"));%>
                                        </td>
                                        </tr>	
                                        
                                        <tr   > 
                                        <td>&nbsp;</td>
                                        <td >Titular:</td>
                                        <td> 
                                        <% if(request.getParameter("txtTitularCuentaClabeSpeiHidden")!=null)
                                        out.print(request.getParameter("txtTitularCuentaClabeSpeiHidden"));%>
                                        </td>
                                        </tr>	
                                    <%}%>							
            
                                    <tr> 
                                    <td>&nbsp;</td>
                                    <td  >SubCuenta:</td>
                                    <td  > 
                                    <% if(request.getParameter("cboSubCtas")!=null)
                                    out.print(request.getParameter("cboSubCtas"));
                                    %>
                                    </td>
                                    </tr>
                
                <%         
                }
            
                if((request.getParameter("cboFormaR")).equals("21")&&
                request.getParameter("cboFormaR")!=null && request.getParameter("pagosM")==null)             
                {%>
                <tr> 
                <td>&nbsp;</td>
                  <td >Datos del Banco 
                    Domiciliario</td>
                    <td>&nbsp;</td>
                </tr>
                <tr> 
                <td>&nbsp;</td>
                  <td >Pa&iacute;s:</td>
                  <td > 
                    <% if(request.getParameter("cboPaisDSwiftR")!=null)
                                         out.print(request.getParameter("cboPaisDSwiftR"));
                                                        %>
                  </td>
                </tr>
                <tr> 
                <td>&nbsp;</td>
                  <td >Ciudad:</td>
                  <td > 
                    <% if(request.getParameter("txtCiudadDSwiftR")!=null)
                                                                                   out.print(request.getParameter("txtCiudadDSwiftR"));
                                                                        %>
                  </td>
                </tr>
                <tr  > 
                  <td  >Nombre del Banco:</td>
                  <td  > 
                    <% if(request.getParameter("txtBancoDSwiftR")!=null)
                                                                   out.print(request.getParameter("txtBancoDSwiftR"));%>
                  </td>
                </tr>
                <tr> 
                    <td>&nbsp;</td>
                  <td >Plaza:</td>
                  <td > 
                    <% if(request.getParameter("txtPlazaSwiftR")!=null)
                                          out.print(request.getParameter("txtPlazaSwiftR"));
                                                        %>
                  </td>
                </tr>
                <tr  > 
                <td>&nbsp;</td>
                  <td  >Sucursal:</td>
                  <td > 
                    <% if(request.getParameter("txtSucursalSwiftR")!=null)
                                         out.print(request.getParameter("txtSucursalSwiftR"));
                       else              
                                        out.print("");                                 
                                                        %>
                  </td>
                </tr>
                <tr> 
                <td>&nbsp;</td>
                  <td  >N&uacute;mero de Cuenta:</td>
                  <td  > 
                    <% if(request.getParameter("txtCuentaSwiftR")!=null)
                                         out.print(request.getParameter("txtCuentaSwiftR"));
                                                        %>
                  </td>
                </tr>
                <tr  > 
                <td>&nbsp;</td>
                  <td  >Branch:</td>
                  <td  > 
                    <% if(request.getParameter("txtBranchSwiftR")!=null)
                                         out.print(request.getParameter("txtBranchSwiftR"));
                                                        %>
                  </td>
                </tr>
                
                <tr  > 
                <td>&nbsp;</td>
                  <td  >Pago Unico:</td>
                  <td  > 
                    <% if(request.getParameter("txtPagoUnicoHidden")!=null)
                                         out.print(request.getParameter("txtPagoUnicoHidden"));
                                                        %>
                  </td>
                </tr>
                
                
                <tr> 
                <td>&nbsp;</td>
                  <td >Moneda Extranjera:</td>
                  <td  > 
                    <% if(request.getParameter("cboMonedaSwiftR")!=null)
                                           out.print(request.getParameter("cboMonedaSwiftR"));
                                                        %>
                  </td>
                </tr>
                <tr> 
                <td>&nbsp;</td>
                  <td >Importe a transferir en Moneda Extranjera:</td>
                  <td > 
                    <% if(request.getParameter("txtImporteTSwiftR")!=null)
                                                                                        out.print(NumberFormat.getCurrencyInstance(Locale.US).format(Double.parseDouble(request.getParameter("txtImporteTSwiftR"))));
                                                                        %>
                  </td>
                </tr>
                <tr> 
                <td>&nbsp;</td>
            
                  <td  >C�digo SWIFT ABA o&nbsp;IBAN :</td>
                  <td  ><%=request.getParameter("txtCodigoSwiftR")!=null?request.getParameter("txtCodigoSwiftR"):""%>&nbsp;<%=request.getParameter("txtCodigoSWIFT")!=null?request.getParameter("txtCodigoSWIFT"):""%>
            
                  </td>
                </tr>
                <tr> 
                <td>&nbsp;</td>
                  <td >Datos del Beneficiario</td>
                  <td>&nbsp;</td>
                </tr>
                <tr> 
                <td>&nbsp;</td>
                  <td  >Nombre:</td>
                  <td  > 
                    <% if(request.getParameter("txtNombreBSwiftR")!=null)
                                         out.print(request.getParameter("txtNombreBSwiftR"));
                                                        %>
                  </td>
                </tr>
                <tr> 
                <td>&nbsp;</td>
                  <td >Pa&iacute;s:</td>
                  <td > 
                    <% if(request.getParameter("cboPaisBSwiftR")!=null)
                                           out.print(request.getParameter("cboPaisBSwiftR"));
                                                        %>
                  </td>
                </tr>
                <tr> 
                <td>&nbsp;</td>
                  <td >Ciudad:</td>
                  <td > 
                    <% if(request.getParameter("txtCiudadBSwiftR")!=null)
                                         out.print(request.getParameter("txtCiudadBSwiftR"));
                                                        %>
                  </td>
                </tr>
                <tr  > 
                <td>&nbsp;</td>
                  <td  >Domicilio:</td>
                  <td > 
                    <% if(request.getParameter("txtDomicilioBSwiftR")!=null)
                                         out.print(request.getParameter("txtDomicilioBSwiftR"));
                       else              
                                        out.print("");
                                                        %>
                  </td>
                </tr>
                <tr> 
                <td>&nbsp;</td>
                  <td >Tel&eacute;fono:</td>
                  <td  > 
                    <% if(request.getParameter("txtTelefonoBSwiftR")!=null)
                                         out.print(request.getParameter("txtTelefonoBSwiftR"));
                       else              
                                        out.print("");
                       
                                                        %>
                  </td>
                </tr>
                <tr  > 
                <td>&nbsp;</td>
                  <td  >Referencia:</td>
                  <td > 
                    <% if(request.getParameter("txtSWreferenciapago8Hidden")!=null)
                                         out.print(request.getParameter("txtSWreferenciapago8Hidden"));
                       else              
                                        out.print("");
                                                        %>
                  </td>
                </tr>
                <tr  > 
                <td>&nbsp;</td>
                  <td  >Referencia 2:</td>
                  <td > 
                    <% if(request.getParameter("txtSWreferenciapago82Hidden")!=null)
                                         out.print(request.getParameter("txtSWreferenciapago82Hidden"));
                       else              
                                        out.print("");
                                                        %>
                  </td>
                </tr>
                <tr  > 
                <td>&nbsp;</td>
                  <td  >Referencia 3:</td>
                  <td > 
                    <% if(request.getParameter("txtSWreferenciapago83Hidden")!=null)
                                         out.print(request.getParameter("txtSWreferenciapago83Hidden"));
                       else              
                                        out.print("");
                                                        %>
                  </td>
                </tr>
                
                
                <% } %>
                
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
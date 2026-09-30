<%@ page import="java.text.*,java.util.*,java.lang.*"%>
<!---------------------------------- balanceGeneral.jsp ---------------------------------------->
<jsp:useBean id="balance" class="mx.com.inscitech.fiducia.business.nReporte"/>
<jsp:useBean id="valida" class="mx.com.inscitech.fiducia.business.nReporte"/>
<jsp:useBean id="cuentas" class="mx.com.inscitech.fiducia.business.BalanceFormulas"/>
<jsp:useBean id="BD"  class="mx.com.inscitech.fiducia.business.FiduciaBD"/>
<!---------------------------------- balanceGeneral.jsp ---------------------------------------->

<!---------------------------------- balanzaCO_SA.jsp ---------------------------------------->
<jsp:useBean id="bal" class="mx.com.inscitech.fiducia.business.balanzaComprob"/>
<jsp:useBean id="nConsultas" class="mx.com.inscitech.fiducia.business.nConsultas"/>
<!---------------------------------- balanzaCO_SA.jsp ---------------------------------------->

<!---------------------------------- edoRes.jsp ---------------------------------------->
<jsp:useBean id="reporte" class="mx.com.inscitech.fiducia.business.nReporte"/>
<jsp:useBean id="edoRes" scope="page" class="mx.com.inscitech.fiducia.business.edoResFormulas" />

<jsp:useBean id="repEdoFinan"  class="mx.com.inscitech.fiducia.business.FiduciaBD"/>
<jsp:useBean id="datEdoFinan" class="mx.com.inscitech.fiducia.business.nReporte"/>
<%@ page import="java.math.BigDecimal, mx.com.inscitech.fiducia.common.util.DecimalFormatUtils"%>
<!---------------------------------- edoRes.jsp ---------------------------------------->

<%
String sPeriodoGlobal="";
DecimalFormat decFormat = new DecimalFormat("###,###,###,###,###,###,###,##0.00");
String[] bitacora = new String[5];
String fechaCont=BD.getFecha();
String folioBit="";
int regBitacora=0;
String fideicomiso="";
String periodo="";					
int numFid=0;

//response.setContentType("application/vnd.ms-excel");

try
	{
double sumPasivo=0;
double sumEtiPatri=0;
double sumSubTotal1=0;
double sumSubTotal2=0;
double sumFCajayBco=0; //CAJA Y BANCOS(@FCAJAYBCO) tabla:saldosmsa
double sumValoresPorRecibir=0;//VALORES POR RECIBIR EN OPERACIONES DE PR?STAMO DENTRO DEL ACTIVO Y DE PASO	  
double sumOtrasDispon=0;//OTRAS DISPONIB(@OTRAS DISPON)
double sumTitulos=0; //TITULOS PARA NEGOCIAR(@TITULOS)
double sumFAccion=0;//ACCION(@FACCION)
double sumValoresNoCotizados=0;//VALORES NO COTIZADOS(@VALORES NO COTIZADOS)
double sumValGub=0;//VALORES GUBER(@VAL_GUB)
double sumDescuentos=0;//DESCUENTOS(@DESCUENTOS)
double sumPrestaquiro=0;//PRESTAMOS QUIROGRAFARIOS(@PRESTAQUIRO)
double sumPrestgara=0;//PRESTAMOS CON GARANTIA(@PRESTGARA)
double sumCartera=0;//CARTERA DE CREDTIDOS(@CARTERA)
double sumPresHabi=0;//PRESTAMOS DE HABILITACION(@PRESHABI)
double sumGarantiPag=0;//GARANTIAS PAGADAS POR RECUPERARSE(@GARANTIPAG)				
double sumPrestRef=0;//PRESTAMOS REFACCIONARIOS(@PREST_REF)
double sumCreditosAfec=0;//CREDITOS AFECTOS EN GARANTIA(@CREDITOS_AFEC)
double sumPresCongaran=0;//PRESTAMOS CON GARANTIA INMOBILIARIA(@PRES_CONGARAN)
double sumCarteraVencida=0;//CARTERA VENCIDA(@CARTERA VENCIDA)
double sumEstimacion=0;//ESTIMACION PREVENTIVA(@ESTIMACION)
double sumClientesYDoc=0;//CLIENTES Y DOCUMENTOS POR COBRAR(@CLIENTES Y DOC)		
double sumDeudoresDiversos=0;//DEUDORES DIVERSOS(@DEUDORES DIVERSOS)
double sumInvenInmovil=0;//INVENTARIOS INMOBILIARIOS(@INVEN_INMOVIL)
double sumOtrasInversiones=0;//OTRAS INVERSIONES(@OTRAS INVERISONES)
double sumDerechos=0;//@DERECHOS
double sumInmuebles=0;//INMUEBLES, MOVILIARIO Y EQUIPO(@INMUEBLES)
double sumMaquinaria=0;//MAQUINARIA E IMPLEMENTOS AGRICOLAS(@MAQUINARIA)
double sumInventDistri=0;//INVENTARISO PARA DISTRIBUCION(@INVENT_DISTRI)
double sumInventIndust=0;//INVENTARIOS INDUSTRIALES(@INVENT_INDUST)
double sumInventDeLaIndus=0;//INVENTARIOS DE LA INDUSTRIA DE LA CONSTRUCCION(@INVENT_DE LA INDUS)
double sumInversionesParaLaConstrucc=0;//INVERSIONES PARA LA CONSTRUCCION(@INVERSIONES PARA LA CONSTRUC)
double sumBienesAdjudicatos=0;//BIENES ADJUDICADOS(@BIENES ADJUDICADOS)
double sumCargosDiferidos=0;//CARGOS DIFERIODS E INTANGIBLES(@CARGOS DIFERIDOS)
double sumDocumentosyCuentas=0;//DOCUMENTOS Y CUENTAS POR PAGAR(@DOCUMENTOS Y CUENTAS)
double sumAcreedPorCertif=0;//ACREEDORES POR CERTIFICADOS(@ACREED_POR CERTIF)
double sumAcreedDiversos=0;//ACREEDORES DIVERSOS(@ACREED_DIVERSOS)
double sumAcreePorIntereses=0;//ACREEDORES POR INTERESES UDIS(@ACREE_POR INTERESES)
double sumFinanBan=0;//FINANCIAMIENTOS BANCARIOS(@FINAN_BAN)
double sumPrestamosDeGobierno=0;//PRESTAMOS DE GOBIERNO FEDERAL (@PRESTAMOS DE GOBIERNO)
double sumOtrasObliga=0;//OTRAS OBLIGACIONES(@OTRAS OBLIGA)
double sumOtrosFinan=0;//OTROS FINANCIAMIENTOS(@OTROS FINAN)
double sumCertfDeParti=0;//CERTIFICADOS POR PARTICIPACION (@CERTIF_DE PARTI)
double sumFinanciBancarios=0;//FINANCIAMIENTOS BANCARIOS LARGO(@FINANCI_BANCARIOS)
double sumReservasyProvisiones=0;//RESERVAS Y PROVISIONES PARA  OBLIG.(@RESERVAS Y PROVISIONES)
double sumProvisionParaCobertura=0;//PROVISION PARA COBERTURA DE RIESGOS(@PROVISON PARA COBERTURA)
double sumProvisionDiferencial=0;//PROVISION PARA COBERTURA DEL DIFERENCIAL(@PROVISION DIFERENCIAL)
double sumCreditosDiferidos=0;//CREDITOS DEFERIDOS (@CREDITOS DIFERIDOS)
double sumPatrimonio=0;//PATRIMONIOS(@PATRIMONIO)
double sumPatrimEtiqueta=0;//@PATRIM_ETIQUETA	
double sumPatrimonioNoAportado=0;//PATRIMONIO NO APORTADO(@PATRIMONIO NO APORTADO)
double sumPatNoAporEtiqu=0;//@PATNOAPOR_ETIQU
double sumEntregasPatrimoniales=0;//ENTREGAS PATRIMONIALES(@ENTREGAS PATRIMONIALES)
double sumEntregasEtiq=0;//@ENTREGAS_ETIQ
double sumRemanenteLiquido=0;//REMANENTE LIQUIDO DE EJERCIOS ANERIORES(@REMANENTE LIQUIDO)
double sumRemanEtiqu=0;//@REMAN_ETIQU
double sumDeficienteLiquido=0;//DEFICIENTE LIQUIDO DE EJERCICIOS ANTERIORES(@DEFICIENTE LIQUIDO)
double sumDefEtiq=0;//@DEF_ETIQ
double sumRevaluacionDeActivos=0;//REVALUACION DE ACTIVOS(@REVALUACION DE ACTIVOS)
double sumResultadosDelEjercicio=0;//RESULTADOS DEL EJERCICIO EN CURSO(@RESULTADOS DEL EJERCICIO)
double sumResultadosDelEjerciciosAnteriores=0;//RESULTADOS DEL EJERCICIO EN CURSO(@RESULTADOS DE EJERCICIOS ANTERIORES)
double sumCreditosYDocumentos=0;//CREDITOS Y DOCUEMNTOS DESCONTADOS(@CREDITOS Y DOCUMENTOS)
double sumDeudoresPorAval=0;//DEUDORES POR AVAL(@DEUDORES POR AVAL)
double sumOtrasObligacionesCont=0;//OTRAS OBLIGACIONES CONTINGENTES(@OTRAS OBLIGACINES CONT)
double sumValoresYBienes=0;//VALORES Y BIENES EN DEPOSITO(@VALORES Y BIENES)
double sumCuentasDeudoras=0;//CUENTAS DEUDORAS DE REGISTRO(@CUENTAS DEUDORAS)
double sumDividendosPag=0;//@DividendosPag
double sumIntegracionDeCartera=0;//@INTEGRACION DE CARTERA


double sumCertificadosETF=0;//CUENTAS CERTIFICADOS ETF'S(@ 6312)
double sumCertificadosCirculacionETF=0;//CUENTAS CERTIFICADOS ETF'S(@ 6312)
double sumCertificadosAutorizadosETF=0;//CUENTAS CERTIFICADOS ETF'S(@ 6312)
double sumCertificadosTesoreriaETF=0;//CUENTAS CERTIFICADOS ETF'S(@ 6312)

boolean bCertificadosTesoreriaETF = false;


String mensaje="";	
String[] meses={" ","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
numFid=Integer.valueOf(request.getParameter("Fiso")).intValue();
int mes=Integer.valueOf(request.getParameter("Mes")).intValue();
int anio=Integer.valueOf(request.getParameter("Ano")).intValue();
String tabla = "saldos"+(request.getParameter("tipoReporte") == null ? "" : request.getParameter("tipoReporte"));

//incorporacion de la bitacora
 folioBit=BD.getFolio(2);
 System.out.println("Folio"+folioBit);
 bitacora[0]=fechaCont;
 bitacora[1]= folioBit;
 bitacora[2]="300";//(String)session.getValue("userid");
 bitacora[3]="Consulta del Balance General para el Fideicomiso "+numFid
 +" del Mes "+meses[mes].toUpperCase()+" del Anio "+anio;
 bitacora[4]="120.0.0.1";

 //regBitacora=BD.insertaBitacora(bitacora);	

//Valida si el fideicomiso tiene administracion propia o no

valida.setVtrIntDato1(numFid);//numero de contrato
valida.querySelect(10, tabla);


int j=0;
String tipoAdmin="";
if(valida.hasData())
	tipoAdmin=valida.getVtrStrDato1().trim();
		
if(tipoAdmin.equals("NO"))
		{
balance.setVtrIntDato1(numFid);//numero de contrato
balance.setVtrIntDato2(mes);//mes del Reporte
balance.setVtrIntDato3(anio);//a?o del Reportes
balance.querySelect(1, tabla);
		}
else
		{
		mensaje="El Reporte de Balance General<BR>No esta disponible<BR><BR>Para Fideicomisos con administraci?n propia";
		}
if(tipoAdmin.equals("NO") && !balance.hasData())
		{
	
		mensaje="No esta disponible<BR>El Reporte de Balance General<BR>De "+meses[mes]+" del "+anio;
		}
%>
<!DOCTYPE>
<html>
<head>
<title>&nbsp;</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link rel="stylesheet" type="text/css" href="nafin.css" />
</head>
<body <%=request.getParameter("bImprimir")!=null && request.getParameter("bImprimir").trim().equals("1") && balance.hasData()==true ?"onLoad=\"window.print();window.close();\"":" "%>  oncontextmenu="return false" onkeydown="return false"   onmousemove ="return false" onselectstart ="return false" onclick="return false">
<%
boolean encabezado=false;
if(balance.hasData()==true)
	{
	
	fideicomiso=balance.getVtrStrDato2().toUpperCase();
	periodo=balance.getVtrStrDato3();
        sPeriodoGlobal=periodo;
	%>
  <%do
	{
    balance.setIndex(j);
	
	//Datos de saldosH
	int sal_num_ctam = balance.getVtrIntDato4();// ctam
	int sal_num_scta =balance.getVtrIntDato5(); //scta
  int sal_num_sscta =balance.getVtrIntDato6(); //sscta 
	int sal_num_ssscta =balance.getVtrIntDato7(); //ssscta
	int sal_num_sssscta =balance.getVtrIntDato8(); //sssscta
	int sal_num_ssssscta =balance.getVtrIntDato9(); //ssssscta
	int sal_num_aux1 =balance.getVtrIntDato10(); //aux1 
	double sal_num_aux2 =balance.getVtrDoubleDato11(); //aux2 
	double sal_num_aux3 =balance.getVtrDoubleDato12(); //aux3 
	double sal_imp_saldo_act =balance.getVtrDoubleDato13(); //saldoAct
	
	// Cuentas y saldos
	cuentas.setValores( sal_num_ctam,  sal_num_scta,  sal_num_sscta,sal_num_ssscta,sal_num_sssscta,sal_num_ssssscta,sal_num_aux1, sal_num_aux2,  sal_num_aux3,  sal_imp_saldo_act  );					
	

	//CAJA Y BANCOS(@FCAJAYBCO) tabla:saldosmsa
	sumFCajayBco = sumFCajayBco + cuentas.fCajayBco(); 

    // valoresPorRecibir
	sumValoresPorRecibir=sumValoresPorRecibir+ cuentas.valoresPorRecibir(); 
	//OTRAS DISPONIB(@OTRAS DISPON)
	sumOtrasDispon = sumOtrasDispon + cuentas.otrasDispon();
	
	//TITULOS PARA NEGOCIAR(@TITULOS)
	sumTitulos  =sumTitulos + cuentas.titulos(); 

	//ACCION(@FACCION)
	sumFAccion = sumFAccion + cuentas.fAccion();

	//VALORES NO COTIZADOS(@VALORES NO COTIZADOS)
	sumValoresNoCotizados = sumValoresNoCotizados + cuentas.valoresNoCotizados();

	//VALORES GUBER(@VAL_GUB)
	sumValGub = sumValGub + cuentas.valGub();

	//DESCUENTOS(@DESCUENTOS)
	sumDescuentos = sumDescuentos + cuentas.descuentos();

	//PRESTAMOS QUIROGRAFARIOS(@PRESTAQUIRO)
	sumPrestaquiro = sumPrestaquiro + cuentas.prestaquiro();

	//PRESTAMOS CON GARANTIA(@PRESTGARA)
	sumPrestgara = sumPrestgara + cuentas.prestgara();

	//CARTERA DE CREDTIDOS(@CARTERA)
	sumCartera = sumCartera + cuentas.cartera();
	
	//PRESTAMOS DE HABILITACION(@PRESHABI)
	sumPresHabi = sumPresHabi + cuentas.presHabi();

	//GARANTIAS PAGADAS POR RECUPERARSE(@GARANTIPAG)				
	sumGarantiPag = sumGarantiPag + cuentas.garantiPag();

	//PRESTAMOS REFACCIONARIOS(@PREST_REF)
	sumPrestRef = sumPrestRef + cuentas.prestRef();
	
	//CREDITOS AFECTOS EN GARANTIA(@CREDITOS_AFEC)
	sumCreditosAfec = sumCreditosAfec + cuentas.creditosAfec();

	//PRESTAMOS CON GARANTIA INMOBILIARIA(@PRES_CONGARAN)
	sumPresCongaran = sumPresCongaran + cuentas.presCongaran();

	//CARTERA VENCIDA(@CARTERA VENCIDA)
	sumCarteraVencida = sumCarteraVencida + cuentas.carteraVencida();

	//ESTIMACION PREVENTIVA(@ESTIMACION)
	//ESTIMACION PREVENTIVA(@ESTIMACION)
	sumEstimacion = sumEstimacion + cuentas.estimacion();

	//CLIENTES Y DOCUMENTOS POR COBRAR(@CLIENTES Y DOC)		
	sumClientesYDoc = sumClientesYDoc + cuentas.clientesYDoc();

	//DEUDORES DIVERSOS(@DEUDORES DIVERSOS)
	sumDeudoresDiversos = sumDeudoresDiversos + cuentas.deudoresDiversos();

	//INVENTARIOS INMOBILIARIOS(@INVEN_INMOVIL)
	sumInvenInmovil = sumInvenInmovil + cuentas.invenInmovil();

	//OTRAS INVERSIONES(@OTRAS INVERISONES)
	sumOtrasInversiones = sumOtrasInversiones + cuentas.otrasInversiones();

	//@DERECHOS
	sumDerechos = sumDerechos + cuentas.derechos();

	//INMUEBLES, MOVILIARIO Y EQUIPO(@INMUEBLES)
	sumInmuebles = sumInmuebles + cuentas.inmuebles();

	//MAQUINARIA E IMPLEMENTOS AGRICOLAS(@MAQUINARIA)
	sumMaquinaria = sumMaquinaria + cuentas.maquinaria();

	//INVENTARISO PARA DISTRIBUCION(@INVENT_DISTRI)
	sumInventDistri = sumInventDistri + cuentas.inventDistri();
	
	//INVENTARIOS INDUSTRIALES(@INVENT_INDUST)
	sumInventIndust = sumInventIndust + cuentas.inventIndust();

	//INVENTARIOS DE LA INDUSTRIA DE LA CONSTRUCCION(@INVENT_DE LA INDUS)
	sumInventDeLaIndus = sumInventDeLaIndus +  cuentas.inventDeLaIndus();

	//INVERSIONES PARA LA CONSTRUCCION(@INVERSIONES PARA LA CONSTRUC)
	sumInversionesParaLaConstrucc = sumInversionesParaLaConstrucc + cuentas.inversionesParaLaConstrucc();

	//BIENES ADJUDICADOS(@BIENES ADJUDICADOS)
	sumBienesAdjudicatos = sumBienesAdjudicatos + cuentas.bienesAdjudicatos();

	//CARGOS DIFERIODS E INTANGIBLES(@CARGOS DIFERIDOS)
	sumCargosDiferidos = sumCargosDiferidos + cuentas.cargosDiferidos();

	//DOCUMENTOS Y CUENTAS POR PAGAR(@DOCUMENTOS Y CUENTAS)
	sumDocumentosyCuentas = sumDocumentosyCuentas + cuentas.documentosyCuentas();

	//ACREEDORES POR CERTIFICADOS(@ACREED_POR CERTIF)
	sumAcreedPorCertif = sumAcreedPorCertif + cuentas.acreedPorCertif();

	//ACREEDORES DIVERSOS(@ACREED_DIVERSOS)
	sumAcreedDiversos = sumAcreedDiversos + cuentas.acreedDiversos();

	//ACREEDORES POR INTERESES UDIS(@ACREE_POR INTERESES)
	sumAcreePorIntereses = sumAcreePorIntereses + cuentas.acreePorIntereses();

	//FINANCIAMIENTOS BANCARIOS(@FINAN_BAN)
	sumFinanBan = sumFinanBan + cuentas.finanBan();

	//PRESTAMOS DE GOBIERNO FEDERAL (@PRESTAMOS DE GOBIERNO)
	sumPrestamosDeGobierno = sumPrestamosDeGobierno + cuentas.prestamosDeGobierno();

	//OTRAS OBLIGACIONES(@OTRAS OBLIGA)
	sumOtrasObliga = sumOtrasObliga + cuentas.otrasObliga();

	//OTROS FINANCIAMIENTOS(@OTROS FINAN)
	sumOtrosFinan = sumOtrosFinan + cuentas.otrosFinan();

	//CERTIFICADOS POR PARTICIPACION (@CERTIF_DE PARTI)
	sumCertfDeParti = sumCertfDeParti + cuentas.certfDeParti();

	//FINANCIAMIENTOS BANCARIOS LARGO(@FINANCI_BANCARIOS)
	sumFinanciBancarios = sumFinanciBancarios + cuentas.financiBancarios();

	//RESERVAS Y PROVISIONES PARA  OBLIG.(@RESERVAS Y PROVISIONES)
	sumReservasyProvisiones = sumReservasyProvisiones + cuentas.reservasyProvisiones();

	//PROVISION PARA COBERTURA DE RIESGOS(@PROVISON PARA COBERTURA)
	sumProvisionParaCobertura = sumProvisionParaCobertura + cuentas.provisionParaCobertura();

	//PROVISION PARA COBERTURA DEL DIFERENCIAL(@PROVISION DIFERENCIAL)
	sumProvisionDiferencial = sumProvisionDiferencial + cuentas.provisionDiferencial();
	
	//CREDITOS DEFERIDOS (@CREDITOS DIFERIDOS)
	sumCreditosDiferidos = sumCreditosDiferidos + cuentas.creditosDiferidos();

	//PATRIMONIOS(@PATRIMONIO)
	sumPatrimonio = sumPatrimonio + cuentas.patrimonio();

	//@PATRIM_ETIQUETA	
	sumPatrimEtiqueta = sumPatrimEtiqueta + cuentas.patrimEtiqueta();

	//PATRIMONIO NO APORTADO(@PATRIMONIO NO APORTADO)
	sumPatrimonioNoAportado = sumPatrimonioNoAportado + cuentas.patrimonioNoAportado();

	//@PATNOAPOR_ETIQU
	sumPatNoAporEtiqu = sumPatNoAporEtiqu + cuentas.patNoAporEtiqu();

	//ENTREGAS PATRIMONIALES(@ENTREGAS PATRIMONIALES)
	sumEntregasPatrimoniales = sumEntregasPatrimoniales + cuentas.entregasPatrimoniales();

	//@ENTREGAS_ETIQ
	sumEntregasEtiq = sumEntregasEtiq + cuentas.entregasEtiq();

	//REMANENTE LIQUIDO DE EJERCIOS ANERIORES(@REMANENTE LIQUIDO)
	sumRemanenteLiquido = sumRemanenteLiquido + cuentas.remanenteLiquido();

	//@REMAN_ETIQU
	sumRemanEtiqu = sumRemanEtiqu + cuentas.remanEtiqu();

	//DEFICIENTE LIQUIDO DE EJERCICIOS ANTERIORES(@DEFICIENTE LIQUIDO)
	sumDeficienteLiquido = sumDeficienteLiquido + cuentas.deficienteLiquido();

	//@DEF_ETIQ
	sumDefEtiq = sumDefEtiq + cuentas.defEtiq();

	//REVALUACION DE ACTIVOS(@REVALUACION DE ACTIVOS)
	sumRevaluacionDeActivos = sumRevaluacionDeActivos + cuentas.revaluacionDeActivos();

	//RESULTADOS DEL EJERCICIO EN CURSO(@RESULTADOS DEL EJERCICIO)
	sumResultadosDelEjercicio = sumResultadosDelEjercicio + cuentas.resultadosDelEjercicio();

	//CREDITOS Y DOCUEMNTOS DESCONTADOS(@CREDITOS Y DOCUMENTOS)
	sumCreditosYDocumentos = sumCreditosYDocumentos + cuentas.creditosYDocumentos();

	//DEUDORES POR AVAL(@DEUDORES POR AVAL)
	sumDeudoresPorAval = sumDeudoresPorAval + cuentas.deudoresPorAval();

	//OTRAS OBLIGACIONES CONTINGENTES(@OTRAS OBLIGACINES CONT)
	sumOtrasObligacionesCont = sumOtrasObligacionesCont + cuentas.otrasObligacionesCont();

	//VALORES Y BIENES EN DEPOSITO(@VALORES Y BIENES)
	sumValoresYBienes = sumValoresYBienes + cuentas.valoresYBienes();

	//CUENTAS DEUDORAS DE REGISTRO(@CUENTAS DEUDORAS)
	sumCuentasDeudoras = sumCuentasDeudoras + cuentas.cuentasDeudoras();

	//@DividendosPag
	sumDividendosPag = sumDividendosPag + cuentas.dividendosPag();

	//@INTEGRACION DE CARTERA  
	sumIntegracionDeCartera = sumIntegracionDeCartera + cuentas.integracionDeCartera();
  
  
	//CUENTAS CERTIFICADOS ETF'S(@ 6312)-------
	sumCertificadosETF = cuentas.certificadosETF();
  
  if(cuentas.bCertificadosETF)
  {
    bCertificadosTesoreriaETF = true;
    if(cuentas.bCertificadosAutorizadosETF)
      sumCertificadosAutorizadosETF = sumCertificadosETF;
    else if(cuentas.bCertificadosCirculacionETF)
      sumCertificadosCirculacionETF = sumCertificadosETF;
    else if(cuentas.bCertificadosTesoreriaETF)
      sumCertificadosTesoreriaETF = sumCertificadosETF;
  }
  
     
	j++;
	}
	while(j<balance.getSize());%>
	
<table width="960" border="0" align="center">
<tr><td><table width="680">
  <tr>
    &nbsp;
  </tr>
  </table>
  </td>
  <td width='151' height='91' rowspan="4"><img src="<%=request.getContextPath()%>/imagenes/logo_bn.jpg" ></td>  
  </tr>
</table>
<table width="960" border="0" align="center">
<tr>
<td  align="center">
_______________________________________________________________________________________________________________________________________
</td>
</tr>
</table>
<table width="960" border="0" align="center">
  <tr> 
    <td align="center" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" colspan="7"><%=fideicomiso%></td>
  </tr>

  <tr> 
    <td align="left" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" colspan="7"> 
     BALANCE GENERAL</td>
  </tr>
  <tr> 
    <td align="left" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" colspan="7"> 
     Al <%=periodo%></td>
  </tr>
</table>

    
<table width="960" border="0" align="center">
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;" >
    <td align="center" colspan="8">&nbsp;</td>
  </tr>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;" > 
    <td align="center" colspan="8">(Importe en Pesos)</td>
  </tr>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" > 
    <td align="center" width="50%" colspan="4">ACTIVO</td>
    <td align="center" width="50%" colspan="4">PASIVO</td>
  </tr>
</table>
<table width="960" border="0" align="center">
  <%if (cuentas.bFCajayBco || cuentas.bDocumentosyCuentas || (cuentas.bFCajayBco && cuentas.bDocumentosyCuentas))
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td width="30%"><%=cuentas.bFCajayBco?"CAJA Y BANCOS":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bFCajayBco && !cuentas.bOtrasDispon?" "+decFormat.format(sumFCajayBco):"&nbsp;"%></td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td width="30%"><%=cuentas.bDocumentosyCuentas?"DOCUMENTOS Y CUENTAS POR PAGAR":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=(cuentas.bDocumentosyCuentas && !cuentas.bAcreedPorCertif && !cuentas.bAcreedDiversos   && !cuentas.bAcreePorIntereses)?" "+decFormat.format((-1)*(sumDocumentosyCuentas+sumAcreedPorCertif+sumAcreedDiversos+ sumAcreePorIntereses)):"&nbsp;"%></td>
  </tr>
  <%     }%>
  <%if (cuentas.bOtrasDispon || cuentas.bAcreedPorCertif || (cuentas.bOtrasDispon && cuentas.bAcreedPorCertif ) )
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td  width="30%"><%=cuentas.bOtrasDispon?"OTRAS DISPONIBILIDADES":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bOtrasDispon?" "+decFormat.format(sumFCajayBco+sumOtrasDispon):"&nbsp;"%></td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td width="30%"><%=cuentas.bAcreedPorCertif?"ACREEDORES POR CERTIFICADOS, OTROS TITULOS Y CUPONES DE INTERESES":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=(cuentas.bAcreedPorCertif && !cuentas.bAcreedDiversos   && !cuentas.bAcreePorIntereses)?" "+decFormat.format((-1)*(sumDocumentosyCuentas+sumAcreedPorCertif+sumAcreedDiversos+ sumAcreePorIntereses)):"&nbsp;"%></td>
  </tr>
  <%    }%>
  
    
  
  <%if (cuentas.bTitulos || cuentas.bAcreedDiversos || (cuentas.bTitulos && cuentas.bAcreedDiversos) )
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td width="30%"><%=cuentas.bTitulos?"INVERSIONES EN VALORES":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bTitulos?" "+decFormat.format(sumTitulos):"&nbsp;"%></td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td width="30%"><%=cuentas.bAcreedDiversos?"ACREEDORES DIVERSOS":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=( cuentas.bAcreedDiversos && !cuentas.bAcreePorIntereses)?" "+decFormat.format((-1)*(sumDocumentosyCuentas+sumAcreedPorCertif+sumAcreedDiversos+ sumAcreePorIntereses)):"&nbsp;"%></td>
  </tr>
  <%    }%>
  
  <%if (cuentas.bValoresPorRecibir)
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td width="30%"><%=cuentas.bTitulos?"VALORES POR RECIBIR EN OPERACIONES DE PR?STAMO":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bValoresPorRecibir?" "+decFormat.format(sumValoresPorRecibir):"&nbsp;"%></td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td width="30%">&nbsp;</td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%">&nbsp;</td>
  </tr>
  <%    }%>
  
  <%if (cuentas.bFAccion || cuentas.bAcreePorIntereses || (cuentas.bFAccion && cuentas.bAcreePorIntereses) )
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td  width="30%"><%=cuentas.bFAccion?"ACCIONES":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bFAccion?" "+decFormat.format(sumFAccion):"&nbsp;"%></td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td width="30%"><%=cuentas.bAcreePorIntereses?"ACREEDORES POR INTERESES UDI'S":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bAcreePorIntereses?" "+decFormat.format((-1)*(sumDocumentosyCuentas+sumAcreedPorCertif+sumAcreedDiversos+ sumAcreePorIntereses)):"&nbsp;"%></td>
  </tr>
  <%    }%>
  <%if (cuentas.bValoresNoCotizados || cuentas.bFinanBan  || (cuentas.bValoresNoCotizados && cuentas.bFinanBan) )
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td width="30%"><%=cuentas.bValoresNoCotizados?"VALORES NO COTIZADOS":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bValoresNoCotizados?" "+decFormat.format(sumValoresNoCotizados):"&nbsp;"%></td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td width="30%"><%=cuentas.bFinanBan?"FINANCIAMIENTOS BANCARIOS":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bFinanBan && !cuentas.bFinanciBancarios && !cuentas.bOtrosFinan?" "+decFormat.format((-1)*(sumFinanciBancarios+sumFinanBan+sumOtrosFinan)):"&nbsp;"%></td>
  </tr>
  <%    }%>
  <%if (cuentas.bValGub || cuentas.bFinanciBancarios || (cuentas.bValGub && cuentas.bFinanciBancarios))
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td width="30%"><%=cuentas.bValGub?"VALORES GUBERNAMENTALES EN GARANTIA":"&nbsp;"%></td> <!--LEYENDA ANTERIOR VALORES GUBERNAMENTALES UDI'S-->
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bValGub?" "+decFormat.format(sumValGub):"&nbsp;"%></td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td width="30%"><%=cuentas.bFinanciBancarios?"FINANCIAMIENTOS BANCARIOS LARGO PLAZO":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bFinanciBancarios && !cuentas.bOtrosFinan?" "+decFormat.format((-1)*(sumFinanciBancarios+sumFinanBan+sumOtrosFinan)):"&nbsp;"%></td>
  </tr>
  <%    }%>
  <%if (cuentas.bDescuentos || cuentas.bOtrosFinan || (cuentas.bDescuentos && cuentas.bOtrosFinan))
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td width="30%"><%=cuentas.bDescuentos?"DESCUENTOS (NETOS)":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bDescuentos && !cuentas.bPrestaquiro && !cuentas.bPrestgara && !cuentas.bPresHabi && !cuentas.bPrestRef && !cuentas.bPresCongaran?" "+decFormat.format(sumDescuentos+sumPrestaquiro+sumPrestgara+sumPresHabi+sumPrestRef+sumPresCongaran):"&nbsp;"%></td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td  width="30%"><%=cuentas.bOtrosFinan?"OTROS FINANCIAMIENTOS":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bOtrosFinan?" "+decFormat.format((-1)*(sumFinanciBancarios+sumFinanBan+sumOtrosFinan)):"&nbsp;"%></td></td>
  </tr>
  <%    }%>
  <%if (cuentas.bPrestaquiro || cuentas.bOtrasObliga || (cuentas.bPrestaquiro && cuentas.bOtrasObliga))
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td width="30%"><%=cuentas.bPrestaquiro?"PRESTAMOS QUIROGRAFARIOS Y PRENDARIOS":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bPrestaquiro && !cuentas.bPrestgara && !cuentas.bPresHabi && !cuentas.bPrestRef && !cuentas.bPresCongaran?" "+decFormat.format(sumDescuentos+sumPrestaquiro+sumPrestgara+sumPresHabi+sumPrestRef+sumPresCongaran):"&nbsp;"%></td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td width="30%"><%=cuentas.bOtrasObliga?"OTRAS OBLIGACIONES":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bOtrasObliga?" "+decFormat.format((-1)*sumOtrasObliga):"&nbsp;"%></td>
  </tr>
  <%    }%>
  <%if (cuentas.bPrestgara || cuentas.bPrestamosDeGobierno || (cuentas.bPrestgara && cuentas.bPrestamosDeGobierno))
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td width="30%"><%=cuentas.bPrestgara?"PRESTAMOS CON GARANTIA DE UNIDADES INDUSTRIALES":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bPrestgara && !cuentas.bPresHabi && !cuentas.bPrestRef && !cuentas.bPresCongaran?" "+decFormat.format(sumDescuentos+sumPrestaquiro+sumPrestgara+sumPresHabi+sumPrestRef+sumPresCongaran):"&nbsp;"%></td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td width="30%"><%=cuentas.bPrestamosDeGobierno?"PRESTAMOS DE GOBIERNO FEDERAL PROGRAMA UDI'S":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bPrestamosDeGobierno?" "+decFormat.format((-1)*sumPrestamosDeGobierno):"&nbsp;"%></td>
  </tr>
  <%    }%>
  <%if (cuentas.bPresHabi || cuentas.bCertfDeParti || (cuentas.bPresHabi && cuentas.bCertfDeParti))
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td  width="30%"><%=cuentas.bPresHabi?"PRESTAMOS DE HABILITACION O AVIO (NETO)":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bPresHabi && !cuentas.bPrestRef && !cuentas.bPresCongaran?" "+decFormat.format(sumDescuentos+sumPrestaquiro+sumPrestgara+sumPresHabi+sumPrestRef+sumPresCongaran):"&nbsp;"%></td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td width="30%"><%=cuentas.bCertfDeParti?"CERTIFICADOS DE PARTICIP., OTROS TIT. Y CUPONES DE INTS. LARGO PLAZO":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bCertfDeParti?" "+decFormat.format((-1)*sumCertfDeParti):"&nbsp;"%></td>
  </tr>
  <%    }%>
  <%if (cuentas.bPrestRef || cuentas.bReservasyProvisiones || (cuentas.bPrestRef && cuentas.bReservasyProvisiones))
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td  width="30%"><%=cuentas.bPrestRef?"PRESTAMOS REFACCIONARIOS (NETO)":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bPrestRef && !cuentas.bPresCongaran?" "+decFormat.format(sumDescuentos+sumPrestaquiro+sumPrestgara+sumPresHabi+sumPrestRef+sumPresCongaran):"&nbsp;"%></td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td width="30%"><%=cuentas.bReservasyProvisiones?"RESERVAS Y PROVISIONES PARA OBLIGACIONES DIVERSAS":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bReservasyProvisiones?" "+decFormat.format((-1)*sumReservasyProvisiones):"&nbsp;"%></td>
  </tr>
  <%    }%>
  <%if (cuentas.bPresCongaran)
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td  width="30%">PRESTAMOS CON GARANTIA INMOBILIARIA (NETO)</td>
    <td align="right" width="9%">&nbsp;<%=decFormat.format(sumPresCongaran)%></td>
    <td align="right" width="9%"><%=" "+decFormat.format(sumDescuentos+sumPrestaquiro+sumPrestgara+sumPresHabi+sumPrestRef+sumPresCongaran)%></td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td width="30%">&nbsp;</td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%">&nbsp;</td>
  </tr>
  <%    }%>
  <%if (cuentas.bGarantiPag || cuentas.bProvisionParaCobertura || (cuentas.bGarantiPag && cuentas.bProvisionParaCobertura))
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td  width="30%"><%=cuentas.bGarantiPag?"GARANTIAS PAGADAS POR RECUPERARSE":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bGarantiPag?" "+decFormat.format(sumGarantiPag):"&nbsp;"%></td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td width="30%"><%=cuentas.bProvisionParaCobertura?"PROVISIONES PARA COBERTURA DE RIESGOS CREDITICIOS UDI'S":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bProvisionParaCobertura?" "+decFormat.format((-1)*sumProvisionParaCobertura):"&nbsp;"%></td>
  </tr>
  <%    }%>
  <%if (cuentas.bCartera || cuentas.bProvisionDiferencial || (cuentas.bCartera && cuentas.bProvisionDiferencial))
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td  width="30%"><%=cuentas.bCartera?"CARTERA DE CREDITOS PROGRAMA UDI'S":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bCartera?" "+decFormat.format(sumCartera):"&nbsp;"%></td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td width="30%"><%=cuentas.bProvisionDiferencial?"PROVISION PARA COBERTURA DEL DIFERENCIAL DE LA TASA DEL 4%":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bProvisionDiferencial?" "+decFormat.format((-1)*sumProvisionDiferencial):"&nbsp;"%></td>
  </tr>
  <%    }%>
  <%if (cuentas.bCreditosAfec || cuentas.bCreditosDiferidos)
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td  width="30%"><%=cuentas.bCreditosAfec?"CREDITOS AFECTOS EN GARANTIA":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bCreditosAfec?" "+decFormat.format(sumCreditosAfec):"&nbsp;"%></td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td width="30%"><%=cuentas.bCreditosDiferidos?"CREDITOS DIFERIDOS":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bCreditosDiferidos?" "+decFormat.format((-1)*sumCreditosDiferidos):"&nbsp;"%></td>
  </tr>
  <%    }%>
  <%if (cuentas.bCarteraVencida || cuentas.bPatrimonio || (cuentas.bCarteraVencida && cuentas.bPatrimonio))
			{%>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" >
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">TOTAL PASIVO</td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%" align="right"><%=decFormat.format(-1*cuentas.pasivo(sumDocumentosyCuentas, sumAcreedPorCertif, sumAcreedDiversos , sumAcreePorIntereses, sumFinanBan , sumPrestamosDeGobierno , sumOtrasObliga, sumOtrosFinan, sumCertfDeParti, sumFinanciBancarios, sumReservasyProvisiones, sumProvisionParaCobertura, sumProvisionDiferencial, sumCreditosDiferidos,0.00))%></td>
  </tr>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" >
    <td align="center" width="100%" colspan="8">&nbsp;</td>
  </tr>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" > 
   <td align="center" width="50%" colspan="4">&nbsp;</td>
    <td align="center" width="50%" colspan="4">PATRIMONIO</td>
  </tr>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td  width="30%"><%=cuentas.bCarteraVencida?"CARTERA VENCIDA":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bCarteraVencida?" "+decFormat.format(sumCarteraVencida):"&nbsp;"%></td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td width="30%"><%=cuentas.bPatrimonio?"PATRIMONIO":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bPatrimonio?" "+decFormat.format((-1)*sumPatrimonio):"&nbsp;"%></td>
  </tr>
  <%    }%>
  <%if (cuentas.bEstimacion || cuentas.bEntregasPatrimoniales|| (cuentas.bEstimacion && cuentas.bEntregasPatrimoniales))
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td  width="30%"><%=cuentas.bEstimacion?"ESTIMACION PREVENTIVA PAR RIESGOS CREDITICIOS":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bEstimacion?" "+decFormat.format(sumEstimacion):"&nbsp;"%></td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td width="30%"><%=cuentas.bEntregasPatrimoniales?"ENTREGAS PATRIMONIALES":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bEntregasPatrimoniales && !cuentas.bPatrimonioNoAportado?" "+decFormat.format(sumEntregasPatrimoniales):"&nbsp;"%></td>
  </tr>
  <%    }%>
  <%if (cuentas.bClientesYDoc || cuentas.bPatrimonioNoAportado || (cuentas.bClientesYDoc && cuentas.bPatrimonioNoAportado))
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td  width="30%"><%=cuentas.bClientesYDoc?"CLIENTES Y DOCTOS. POR COBRAR (NETO)":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bClientesYDoc?" "+decFormat.format(sumClientesYDoc):"&nbsp;"%></td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td width="30%"><%=cuentas.bPatrimonioNoAportado?"PATRIMONIO NO PORTADO":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bPatrimonioNoAportado?" "+decFormat.format((-1)*((sumPatrimonio+sumEntregasPatrimoniales)+sumPatrimonioNoAportado)):"&nbsp;"%></td>
  </tr>
  <%//@subtotal2
		sumSubTotal2=cuentas.subTotal2(sumEntregasPatrimoniales,sumPatrimonio);
		%>
  <%    }%>
  <%if (cuentas.bDeudoresDiversos|| cuentas.bRemanenteLiquido || (cuentas.bDeudoresDiversos && cuentas.bRemanenteLiquido))
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td  width="30%"><%=cuentas.bDeudoresDiversos?"DEUDORES DIVERSOS":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bDeudoresDiversos?" "+decFormat.format(sumDeudoresDiversos):"&nbsp;"%></td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td width="30%"><%=cuentas.bRemanenteLiquido && !cuentas.bDeficienteLiquido?"RESULTADO DE EJERCICIOS ANTERIORES":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bRemanenteLiquido && !cuentas.bDeficienteLiquido ?" "+decFormat.format((-1)*sumRemanenteLiquido):"&nbsp;"%></td>
  </tr>
  <%    }%>
  <%if (cuentas.bDerechos|| cuentas.bDeficienteLiquido|| cuentas.bRemanenteLiquido || (cuentas.bDerechos && cuentas.bDeficienteLiquido))
			{
         sumResultadosDelEjerciciosAnteriores = sumRemanenteLiquido+sumDeficienteLiquido;
   %>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td  width="30%"><%=cuentas.bDerechos?"DERECHOS":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bDerechos?" "+decFormat.format(sumDerechos):"&nbsp;"%></td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td width="30%"><%=cuentas.bDeficienteLiquido?"RESULTADO DE EJERCICIOS ANTERIORES":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bDeficienteLiquido?" "+decFormat.format((-1)*(sumResultadosDelEjerciciosAnteriores)):"&nbsp;"%></td>
  </tr>
  <%    }%>
  <%if (cuentas.bOtrasInversiones|| cuentas.bRevaluacionDeActivos || (cuentas.bOtrasInversiones&& cuentas.bRevaluacionDeActivos))
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td  width="30%"><%=cuentas.bOtrasInversiones?"OTRAS INVERSIONES":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bOtrasInversiones?" "+decFormat.format(sumOtrasInversiones):"&nbsp;"%></td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td width="30%"><%=cuentas.bRevaluacionDeActivos?"REVALUACION DE ACTIVOS":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bRevaluacionDeActivos?" "+decFormat.format((-1)*sumRevaluacionDeActivos):"&nbsp;"%></td>
  </tr>
  <%    }%>
  <%if (cuentas.bInvenInmovil || cuentas.bResultadosDelEjercicio || (cuentas.bInvenInmovil && cuentas.bResultadosDelEjercicio))
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td  width="30%"><%=cuentas.bInvenInmovil?"INVENTARIOS INMOBILIARIOS":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bInvenInmovil?" "+decFormat.format(sumInvenInmovil):"&nbsp;"%></td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td width="30%"><%=cuentas.bResultadosDelEjercicio?"RESULTADO DEL EJERCICIO EN CURSO":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bResultadosDelEjercicio?" "+decFormat.format((-1)*sumResultadosDelEjercicio):"&nbsp;"%></td>
  </tr>
  <%    }%>
  <%if (cuentas.bInmuebles || cuentas.bMaquinaria || (cuentas.bInmuebles && cuentas.bMaquinaria))
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td  width="30%"><%=cuentas.bInmuebles?"INMUEBLES, MOBILIARIO Y EQUIPO (NETO)":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bInmuebles?" "+decFormat.format(sumInmuebles):"&nbsp;"%>&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td width="30%"><%=cuentas.bMaquinaria?"MAQUINARIA E IMPLEMENTOS AGRICOLAS":"&nbsp;"%></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%"><%=cuentas.bMaquinaria?" "+decFormat.format((-1)*sumMaquinaria):"&nbsp;"%></td>
  </tr>
  <%    }%>
  <%if (cuentas.bInventDistri)
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td  width="30%">INVENTARIOS PARA DISTRIBUCION Y VENTA></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%">&nbsp;<%=decFormat.format(sumInventDistri)%></td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td width="30%"></td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%">&nbsp;</td>
  </tr>
  <%    }%>
  <%if (cuentas.bInventIndust)
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td  width="30%">INVENTARIOS INDUSTRIALES</td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%">&nbsp;<%=decFormat.format(sumInventIndust)%></td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td width="30%"> </td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%">&nbsp;</td>
  </tr>
  <%    }%>
  <%if (cuentas.bInventDeLaIndus)
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td  width="30%">INVENT. CONST. DE VIVIENDA Y OBRAS DE INFRAEST.</td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%">&nbsp;<%=decFormat.format(sumInventDeLaIndus)%></td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td width="30%"> </td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%">&nbsp;</td>
  </tr>
  <%    }%>
  <%if (cuentas.bInversionesParaLaConstrucc)
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td  width="30%">INV. CONST. DE VIVIENDA Y OBRAS DE INFRAEST.</td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%">&nbsp;<%=decFormat.format(sumInversionesParaLaConstrucc)%></td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td width="30%"> </td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%">&nbsp;</td>
  </tr>
  <%    }%>
  <%if (cuentas.bBienesAdjudicatos)
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td  width="30%">BIENES ADJUDICADOS</td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%">&nbsp;<%=decFormat.format(sumBienesAdjudicatos)%></td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td width="30%"> </td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%">&nbsp;</td>
  </tr>
  <%    }%>
  <%if (cuentas.bCargosDiferidos)
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td  width="30%">CARGOS DIFERIDOS E INTANGIBLES (NETO)</td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%">&nbsp;<%=decFormat.format(sumCargosDiferidos)%></td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td width="30%"> </td>
    <td align="right" width="9%">&nbsp;</td>
    <td align="right" width="9%">&nbsp;</td>
  </tr>
  <%    }%>
  <tr style="font-family: Arial;font-size: 12px;color: #000000;font-weight: bold;" >
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">		
		<div style="width:100px !important;overflow:hidden;border-bottom:1px solid !important;">
			&nbsp;
		</div>
	</td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;&nbsp;TOTAL PATRIMONIO</td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="right">
		<div style="width:100px !important;overflow:hidden;border-top:1px solid !important;">
			<%=decFormat.format((-1)*(sumPatrimonio+sumEntregasPatrimoniales+sumResultadosDelEjercicio+sumResultadosDelEjerciciosAnteriores+sumRevaluacionDeActivos))%>
		</div>
	</td>
  </tr>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" >
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
  </tr>  
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" >
    <td align="right" width="2%">SUMA DE ACTIVO:</td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="right" width="2%">
		<div style="width:100px !important;overflow:hidden;border-top:1px solid !important;border-bottom:4px solid double !important;">
			<%=decFormat.format(cuentas.totalActivo(sumFCajayBco, sumOtrasDispon, sumTitulos, sumFAccion, sumValoresNoCotizados, sumValGub, sumDescuentos, sumPrestaquiro, sumPrestgara, sumCartera, sumPresHabi, sumGarantiPag, sumPrestRef, sumCreditosAfec, 	 sumPresCongaran, sumCarteraVencida, sumEstimacion, sumClientesYDoc, sumDeudoresDiversos, sumInvenInmovil, 	 sumOtrasInversiones, sumDerechos, sumInmuebles, sumMaquinaria, sumInventDistri,sumInventIndust, sumInventDeLaIndus, 	sumInversionesParaLaConstrucc, sumCargosDiferidos,  sumBienesAdjudicatos,sumValoresPorRecibir))%></td>
		</div>
    <td align="center" width="2%">&nbsp;</td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="right" width="2%">SUMA DE PASIVO Y PATRIMONIO:</td>
    <td align="center" width="2%">&nbsp;</td>
    <td align="right" width="2%">
		<div style="width:100px !important;overflow:hidden;border-top:1px solid !important;border-bottom:4px solid double !important;">
			<%=decFormat.format((-1)*(cuentas.pasivo(sumDocumentosyCuentas, sumAcreedPorCertif, sumAcreedDiversos , sumAcreePorIntereses, sumFinanBan , sumPrestamosDeGobierno , sumOtrasObliga, sumOtrosFinan, sumCertfDeParti, sumFinanciBancarios, sumReservasyProvisiones, sumProvisionParaCobertura, sumProvisionDiferencial, sumCreditosDiferidos, sumPatrimonio) + cuentas.patrimon(sumPatrimonioNoAportado,sumEntregasPatrimoniales,sumRemanenteLiquido,sumDeficienteLiquido,sumRevaluacionDeActivos, sumResultadosDelEjercicio)))%></td>
		</div>
  </tr> 
</table>
     
<table width="622" border="0" align="center">
  <tr> 
    <td align="center" style="font-family: Arial;	font-size: 9px;color: #000000;"  colspan="2">&nbsp;</td>
  </tr>
  <tr> 
    <td align="center" style="font-family: Arial;	font-size: 9px;color: #000000;"  colspan="2">&nbsp;</td>
  </tr>
  <tr> 
    <td align="center" style="font-family: Arial;	font-size: 11px;color: #000000;font-weight: bold;" colspan="2"> 
      <%=(cuentas.bCreditosYDocumentos||cuentas.bDeudoresPorAval||cuentas.bValoresYBienes||cuentas.bCuentasDeudoras||cuentas.bCuentasDeudoras|| cuentas.bIntegracionDeCartera|| bCertificadosTesoreriaETF)?"CUENTAS DE ORDEN":""%> </td>
  </tr>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td width="325"  >&nbsp;</td>
    <td width="320"  align="right">&nbsp;</td>
  </tr>
  <%if (cuentas.bCreditosYDocumentos)
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td  >CREDITOS Y DOCUMENTOS DESCONTADOS</td>
    <td  align="right"><%=decFormat.format(sumCreditosYDocumentos)%></td>
  </tr>
  <%    }%>
  <%if (cuentas.bDeudoresPorAval)
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td>DEUDORES POR AVAL</td>
    <td align="right"><%=decFormat.format(sumDeudoresPorAval)%></td>
  </tr>
  <%    }%>
  <%if (cuentas.bOtrasObligacionesCont)
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td>OTRAS OBLIGACIONES CONTINGENTES</td>
    <td align="right"><%=decFormat.format(sumOtrasObligacionesCont)%></td>
  </tr>
  <%    }%>
  <%if (cuentas.bValoresYBienes)
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td>VALORES Y BIENES EN DEPOSITO, ADMINISTRACION O GARANTIA</td>
    <td align="right"><%=decFormat.format(sumValoresYBienes)%></td>
  </tr>
  <%    }%>
  <%if (cuentas.bCuentasDeudoras)
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td >CUENTAS DEUDORAS DE REGISTRO</td>
    <td align="right"><%=decFormat.format(sumCuentasDeudoras)%></td>
  </tr>
  <%    }%>
  <%if (cuentas.bIntegracionDeCartera)
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td>INTEGRACION DE CARTERA CRED.</td>
    <td align="right"><%=decFormat.format(sumIntegracionDeCartera)%></td>
  </tr>
  <%    }%>
  
  
  <!--ESPECIAL ETFS-->
  <%if (sumCertificadosAutorizadosETF>0)
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td>CERTIFICADOS AUTORIZADOS</td>
    <td align="right"><%=decFormat.format(sumCertificadosAutorizadosETF)%></td>
  </tr>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td colspan=2><hr></td>
  </tr>
  <%    }%>
  <%if (sumCertificadosCirculacionETF>0)
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td height="13">CERTIFICADOS EN CIRCULACION</td>
    <td align="right" height="13"><%=decFormat.format(sumCertificadosCirculacionETF)%></td>
  </tr>
  <%    }%>
  <%if (sumCertificadosTesoreriaETF>0)
			{%>
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td>CERTIFICADOS EN TESORERIA</td>
    <td align="right"><%=decFormat.format(sumCertificadosTesoreriaETF)%></td>
  </tr>
  <%    }%>
  <tr> 
    <td align="center" style="font-family: Arial;	font-size: 9px;color: #000000;"  colspan="2">&nbsp;</td>
  </tr>
  <tr> 
    <td align="center" style="font-family: Arial;	font-size: 9px;color: #000000;"  colspan="2">&nbsp;</td>
  </tr>
</table>
		<%
		cuentas.limpiaBanderas();
		/*
		<%=sumPatrimEtiqueta	 @PATRIM_ETIQUETA	
		<%=sumPatNoAporEtiqu	 @PATNOAPOR_ETIQU
		<%=sumEntregasEtiq	@ENTREGAS_ETIQ
		<%=sumRemanEtiqu	@REMAN_ETIQU
		<%=sumDefEtiq	@DEF_ETIQ
		<%=sumDividendosPag   @DividendosPag
			*/
		%>

<table width="960" border="0" align="center">
<%
// firma 
boolean bfirma = request.getParameter("EjecutivoFirma")!=null;
String nom_firma1 = "";
String nom_firma2 = "";
if(bfirma)
{
  String ejecutivoFirma = request.getParameter("EjecutivoFirma").toString();
  nom_firma1 = ejecutivoFirma;
  if(ejecutivoFirma.indexOf(";")>=0)
  {
    nom_firma1 = ejecutivoFirma.split(";")[0];
    nom_firma2 = ejecutivoFirma.split(";")[1];
  }
}

if(bfirma){%>
<tr align="left">
	<td>&nbsp;</td>
	<td>&nbsp;</td>
	<td>&nbsp;</td>
	<td>&nbsp;</td>
	<td>&nbsp;</td>
	<td>&nbsp;</td>        
	<td>&nbsp;</td>        
</tr>
<tr align="left">
	<td>&nbsp;</td>
	<td>&nbsp;</td>
	<td>&nbsp;</td>
	<td>&nbsp;</td>
	<td>&nbsp;</td>
	<td>&nbsp;</td>        
	<td>&nbsp;</td>        
</tr>
<tr align="left">
	<td>&nbsp;</td>
	<td>&nbsp;</td>
	<td>&nbsp;</td>
	<td>&nbsp;</td>
	<td>&nbsp;</td>
	<td>&nbsp;</td>        
	<td>&nbsp;</td>         
</tr>
<tr align="left">
	<td>&nbsp;</td>
	<td>
		<div style="width:300px !important;overflow:hidden;border-top:1px solid !important;text-align:center;">
			<%=nom_firma1%>
		</div>
	</td>
	<td>&nbsp;</td>
	<td>
		<div style="width:300px !important;overflow:hidden;border-top:1px solid !important;text-align:center;">
			<%=nom_firma2%>
		</div>
	</td>
	<td>&nbsp;</td>
	<td>&nbsp;</td>        
	<td>&nbsp;</td>        
</tr>
<%}%>
</table>		
<table width="960" border="0"  align="center">
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td width="17%">&nbsp;</td>
    <td width="15%">&nbsp;</td>
  </tr>
    <tr  >
    <td align="center" style="font-family: Arial;	font-size: 9px;color: #000000;" colspan="8">&nbsp;</td>
  </tr>
  <%if(anio<2005 || (anio==2005 && mes<8)) 
  
  	{%>
  <tr  > 
    <td align="center" style="font-family: Arial;	font-size: 12px;color: #000000;" colspan="8"><img src="<%=request.getContextPath()%>/imagenes/THARTI.jpg" width="206" height="71" ></td>
  </tr>
  <tr  > 
    <td align="center" style="font-family: Arial;	font-size: 9px;color: #000000;" colspan="8">	
       &nbsp;</td>
  </tr>
  <%}
  
  else
  {
  %>
    <tr  > 
    <td align="center" style="font-family: Arial;	font-size: 12px;color: #000000;" colspan="8"><img src="<%=request.getContextPath()%>/imagenes/THARTI.jpg" width="158" height="99"></td>
  </tr>
  <tr  > 
    <td align="center" style="font-family: Arial;	font-size: 9px;color: #000000;" colspan="8">	
      &nbsp;</td>
  </tr>
  <%}%>
  <tr  >
    <td align="center" style="font-family: Arial;	font-size: 9px;color: #000000;" colspan="8">&nbsp;</td>
  </tr>
  <tr  > 
    <td align="center" style="font-family: Arial;	font-size: 9px;color: #000000;" colspan="8">	
      &nbsp;</td>
  </tr>


<%
}
else
	{%>
<table width="447" align="center">
  <tr>
    <td height="19" >&nbsp;</td>
  </tr>
  <tr> 
    <td width="439" height="19" >&nbsp;</td>
  </tr>
  <tr> 
    <td height="19" style="font-family: Arial, Helvetica, Verdana;	font-size: 14px;color: #006699;font-weight: bold;" align="center"> 
		<%=mensaje%>    
    </td>
  </tr>
  <tr> 
    <td align="center">&nbsp;</td>
  </tr>
  <tr> 
    <td align="center"><input type="button" name="Cerrar" value="Cerrar" onClick="window.close();" style="background: #006699; border: 1px solid #000066; font-family: Verdana, Arial, Helvetica, sans-serif; font-size: 9px; color: #FFFFFF; font-weight: normal;"></td>
  </tr>
</table>
	<%}%>

<%}
catch(Exception e)
	{
System.out.println(" Reporte Balance General: \nError:"+e);
e.printStackTrace();	%>

	<table width="447" align="center">
  <tr>
    <td height="19">&nbsp;</td>
  </tr>
  <tr> 
    <td width="439" height="19">&nbsp;</td>
  </tr>
  <tr> 
    <td  align="center" height="19" style="font-family: Arial, Helvetica, Verdana;	font-size: 14px;color: #006699;font-weight: bold;">Reporte Balance General: Error:<%=e%></td>
  </tr>
  <tr> 
    <td align="center">&nbsp;</td>
  </tr>
 
</table>

<%}%>
</body>
<!--/body-->
<!---------------------------------- balanceGeneral.jsp ---------------------------------------->



<!---------------------------------- edoRes.jsp ---------------------------------------->
<%

try
	{
double subTotal1=0;
double subTotal2=0;
double subTotal3=0;
double subTotal4=0;
double subTotal5=0;
double total=0;
//String fideicomiso="";
String apertura=""; 
double sumInteCobra=0;
double sumVentas=0;
double sumComiCobra=0;
double sumDonativos=0;
double sumPrimaXgar =0;
double sumUdis =0;
double sumSAL_NUM_AUX1   =0;
double sumCambios1 =0;
double sumIngresos_por_servicio =0;
double sumCosPer = 0;
double sumCosAdmi = 0;
double sumEntregas_a_fideicom  = 0;
double sumGastos_administrativo  = 0;
double sumHonorarios = 0;
double sumImpDiver = 0;
double sumOtrosIng  = 0;
double sumAplicacion  = 0;
double sumQuebrantos = 0;
double sumOtros_Gastos  = 0;
double sumCastigos  = 0;
double sumAplicacion1  = 0;
double sumAfectacion  = 0;
double sum_5209 =0;
double sumCambios=0;
double sumRes_por_valuacion  = 0;
double sumIntePagado  = 0;
double sumComiPag  =0;
double sumDividendosPag=0;
double sumRES_NEG=0;//P
double sumCAMBIOS_NEG=0;//P
double sumEtiqueta_cambios=0;
double sumEtiqueta_resultados=0;
int j=0;
String tipoAdmin="";
String mensaje="";	
String[] meses={"","ENERO","FEBRERO","MARZO","ABRIL","MAYO","JUNIO","JULIO","AGOSTO","SEPTIEMBRE","OCTUBRE","NOVIEMBRE","DICIEMBRE","",""};
Calendar calend = Calendar.getInstance();
String tabla = "saldos"+(request.getParameter("tipoReporte") == null ? "" : request.getParameter("tipoReporte"));
int anio = (request.getParameter("Ano") == null || request.getParameter("Ano").equals("0")?1900+calend.getTime().getYear():Integer.parseInt(request.getParameter("Ano")));
int mes  =(request.getParameter("Mes") == null || request.getParameter("Mes").equals("0")? 1 + calend.getTime().getMonth():Integer.parseInt(request.getParameter("Mes")));

numFid=Integer.valueOf(request.getParameter("Fiso")).intValue();
String dia = ((mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12)?"31":"30");
dia = ((mes==2&&anio%4==0)?"29":((mes==2)?"28":dia));
//int dia = Integer.valueOf(request.getParameter("Dia")).intValue();


//incorporacion de la bitacora
 folioBit=BD.getFolio(2);
 System.out.println("Folio"+folioBit);
 bitacora[0]=fechaCont;
 bitacora[1]= folioBit;
 bitacora[2]="300";//(String)session.getValue("userid");
 bitacora[3]="Consulta del Estado de Resultados para el Fideicomiso "+numFid
 +" del Mes "+meses[mes-1].toUpperCase()+" del Anio "+anio;
 bitacora[4]="120.0.0.1";

 //regBitacora=BD.insertaBitacora(bitacora);	

//Valida si el fideicomiso tiene administracion propia o no
valida.setVtrIntDato1(numFid);//numero de contrato
valida.querySelect(10, tabla);
if(valida.hasData())
	tipoAdmin=valida.getVtrStrDato1().trim();
		
if(tipoAdmin.equals("NO"))
		{
reporte.setVtrIntDato1(numFid);//numero de contrato
reporte.setVtrIntDato2(mes);//mes del Reporte
reporte.setVtrIntDato3(anio);//a?o del Reportes
reporte.querySelect(2, tabla);
		}
else
		{
		mensaje="El Reporte de Estado de Resultados<BR>No esta disponible<BR><BR>Para Fideicomisos con administraci?n propia";
		}
if(tipoAdmin.equals("NO") && !reporte.hasData())
		{
	
		mensaje="No esta disponible<BR>El Reporte de Estado de Resultados<BR>De "+meses[mes-1]+" del "+anio;
		}

%>
<html>
<head>
<title>&nbsp;</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link rel="stylesheet" type="text/css" href="nafin.css" />

</head>
<body <%=request.getParameter("bImprimir")!=null && request.getParameter("bImprimir").trim().equals("1") && reporte.hasData()==true ?"onLoad=\"window.print();window.close();\"":" "%>  oncontextmenu="return false" onkeydown="return false"   onmousemove ="return false" onselectstart ="return false" onclick="return false">
<%
boolean encabezado=false;
if(reporte.hasData()==true)
	{
	fideicomiso=reporte.getVtrStrDato2().toUpperCase();
  apertura = reporte.getVtrStrDato3().toUpperCase();
  String anApertura = apertura.substring(apertura.length()-4,apertura.length());
  String anActual = String.valueOf(anio);//reporte.getVtrStrDato4().substring(reporte.getVtrStrDato4().length()-4,reporte.getVtrStrDato4().length());
  //String periodo="";  
	periodo= dia+" DE "+meses[mes].toUpperCase()+" DEL "+anio;//reporte.getVtrStrDato4();
  //periodo= " DEL MES DE "+meses[mes-1].toUpperCase()+" DEL "+anio;
do
	{
    reporte.setIndex(j);
	
  int sal_num_ctam = reporte.getVtrIntDato5(   );
	int sal_num_scta =  reporte.getVtrIntDato6(   );
	int sal_num_sscta = reporte.getVtrIntDato7(   );
	int sal_num_ssscta = reporte.getVtrIntDato8(  );
	int SAL_NUM_AUX1 = reporte.getVtrIntDato11(   );
	double SAL_NUM_AUX2 = reporte.getVtrDoubleDato12(  );
	double SAL_NUM_AUX3 = reporte.getVtrDoubleDato13(   );
	double sal_imp_saldo_act = reporte.getVtrDoubleDato14(  );

	// Cuentas y saldos
	edoRes.setValores( sal_num_ctam,  sal_num_scta,  sal_num_sscta,sal_num_ssscta, SAL_NUM_AUX2,  SAL_NUM_AUX3,  sal_imp_saldo_act  );					
	
    sumInteCobra=sumInteCobra+edoRes.InteCobra();//INTERESES COBRADOS
	sumVentas = sumVentas + edoRes.ventas();//VENTAS	
	sumComiCobra = sumComiCobra + edoRes.comiCobra();//COMISIONES COBRADAS
	sumIngresos_por_servicio= sumIngresos_por_servicio + edoRes.ingresos_por_servicio();
	sumDonativos= sumDonativos + edoRes.donativos();
	sumPrimaXgar = sumPrimaXgar + edoRes.primaXgar();
	sumUdis = sumUdis + edoRes.udis();
	sumRes_por_valuacion = sumRes_por_valuacion + edoRes.res_por_valuacion();		
	sum_5209 = sum_5209 + edoRes._5209();
	sumCambios = sumCambios + edoRes.Cambios();
	
	sumIntePagado =  sumIntePagado + edoRes.IntePagado();
	sumComiPag = sumComiPag + edoRes.comiPag();
	sumDividendosPag = sumDividendosPag + edoRes.dividendosPag();
	sumCambios1 = sumCambios1 + edoRes.cambios1();
	sumCosPer = sumCosPer + edoRes.cosPer();
	sumCosAdmi = sumCosAdmi + edoRes.cosAdmi();
	sumEntregas_a_fideicom = sumEntregas_a_fideicom + edoRes.entregas_a_fideicom();
	sumGastos_administrativo = sumGastos_administrativo + edoRes.gastos_administrativo();
	sumHonorarios = sumHonorarios + edoRes.honorarios();
	sumImpDiver = sumImpDiver + edoRes.impDiver();
	sumOtrosIng  = sumOtrosIng  + edoRes.otrosIng();
	sumAplicacion = sumAplicacion + edoRes.aplicacion();
	sumQuebrantos =  sumQuebrantos + edoRes.quebrantos();
	sumOtros_Gastos =  sumOtros_Gastos + edoRes.otros_Gastos();
	sumCastigos = sumCastigos + edoRes.castigos();
	sumAplicacion1 = sumAplicacion1 + edoRes.aplicacion1();
	sumAfectacion =  sumAfectacion +  edoRes.afectacion();

	
	j++;
	}
	while(j<reporte.getSize());
	System.out.println("cambios:"+sumCambios);
	sumEtiqueta_cambios =  sumEtiqueta_cambios + edoRes.etiqueta_cambios(sumCambios);
	sumEtiqueta_resultados =  sumEtiqueta_resultados + edoRes.etiqueta_resultados(sumRes_por_valuacion);
	//resultados por valuacion
	if(sumRes_por_valuacion<0 )
		 sumRES_NEG= sumRes_por_valuacion*-1;
	else
		 sumRES_NEG= 0 ;
	//CAMBIOS NEGATIVOS	 
	if(sumCambios<0 )
		 sumCAMBIOS_NEG= sumCambios;
	else
		 sumCAMBIOS_NEG= 0 ;	 
	 
	
%>

<table width="960" border="0" align="center">
<tr><td><table width="680">
  <tr> 
&nbsp;
  </tr>
  </table>
  </td>
  <td width='151' height='91' rowspan="4"><img src="<%=request.getContextPath()%>/imagenes/logo_bn.jpg" ></td>  
  </tr>
</table>
<table width="960" border="0" align="center">
<tr>
<td align="center">
_______________________________________________________________________________________________________________________________________
</td>
</tr>
</table>
<table width="960" border="0" align="center">
  <tr> 
    <td align="center" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" colspan="7"><%=fideicomiso%></td>
  </tr>
  <tr> 
    <td align="left" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" colspan="7"> 
     ESTADO DE RESULTADOS </td>
  </tr>
  <tr> 
    <td align="left" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" colspan="7"> 
     Al <%=periodo%></td>
  </tr>
</table>

	  
<table width="860" border="0" align="center">
  <tr> 
    <td align="center" style="font-family: Arial;	font-size: 9px;color: #000000;"  colspan="2">&nbsp;</td>
  </tr>
  <tr> 
    <td align="center" style="font-family: Arial;	font-size: 9px;color: #000000;"  colspan="2">&nbsp;</td>
  </tr>
  <tr> 
    <td align="center" style="font-family: Arial;	font-size: 9px;color: #000000;"  colspan="2">&nbsp;</td>
  </tr>

  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;"> 
    <td width="53" >&nbsp;</td>
    <td width="419" >INGRESOS</td>
    <td width="208" >&nbsp;</td>
    <td width="191" >&nbsp;</td>
    <td width="73" >&nbsp;</td>
  </tr>
  <%//sumInteCobra PONER BANDERAS%>
  <% if(edoRes.bInteCobra)
  	{
	%>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" > 
    <td >&nbsp;</td>
    <td >INTERESES COBRADOS</td>
    <td >&nbsp; </td>
    <td  align="right"><%=decFormat.format(sumInteCobra)%></td>
    <td>&nbsp;</td>
  </tr>
  <%}
   if(edoRes.bVentas)
  	{
	%>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;"> 
    <td >&nbsp;</td>
    <td >VENTAS</td>
    <td >&nbsp;</td>
    <td  align="right"><%=decFormat.format(sumVentas)%></td>
    <td>&nbsp;</td>
  </tr>
    <%}
   if(edoRes.bComiCobra)
  	{
	%>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" > 
    <td >&nbsp;</td>
    <td >COMISIONES COBRADAS</td>
    <td >&nbsp;</td>
    <td  align="right"><%=decFormat.format(sumComiCobra)%></td>
    <td>&nbsp;</td>
  </tr>
   <%}
   if(edoRes.bIngresos_por_servicio)
  	{
	%>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" > 
    <td >&nbsp;</td>
    <td >INGRESOS POR SERVICIO</td>
    <td >&nbsp;</td>
    <td  align="right"><%=decFormat.format(sumIngresos_por_servicio)%></td>
    <td>&nbsp;</td>
  </tr>
   		<%}
  if(edoRes.bDonativos)
  		{
		%>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;"> 
    <td >&nbsp;</td>
    <td >DONATIVOS</td>
    <td >&nbsp;</td>
    <td  align="right"><%=decFormat.format(sumDonativos)%></td>
    <td>&nbsp;</td>
  </tr>
 		<%}
  if(edoRes.bPrimaXgar)
  		{
		%>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" > 
    <td >&nbsp;</td>
    <td >PRIMAS POR GARANTIAS Y APOYOS OTROGADOS</td>
    <td >&nbsp;</td>
    <td  align="right"><%=decFormat.format(sumPrimaXgar)%></td>
    <td>&nbsp;</td>
  </tr>
   		<%}
  if(edoRes.bUdis)
  		{
		%>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" > 
    <td >&nbsp;</td>
    <td >INTERESES COBRADOS SOBRE VALORES GUBERNAMENTALES UDI'S</td>
    <td >&nbsp;</td>
    <td  align="right"><%=decFormat.format(sumUdis)%>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
       <%}
     
	 if (sumRes_por_valuacion<0)
	    {
		sumRes_por_valuacion=sumRes_por_valuacion * (-1);
		}
     else
	 	{
		sumRes_por_valuacion=0;
		edoRes.bRes_por_valuacion=false;
		}		
  if(edoRes.bRes_por_valuacion)
  		{
		%>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" > 
    <td >&nbsp;</td>
    <td >RESULTADO POR VALUACION</td>
    <td >&nbsp;</td>
    <td  align="right"><%=decFormat.format(sumRes_por_valuacion)%>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
       <%}
	 if (sumCambios<0)
	    {
		sumCambios=sumCambios * (-1);
		}
     else
	 	{
		sumCambios=0;
		edoRes.bCambios=false;
		}	
  if(edoRes.bCambios  )
  		{
		%>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" > 
    <td >&nbsp;</td>
    <td >CAMBIOS</td>
    <td >&nbsp;</td>
    <td  align="right"><%=decFormat.format(sumCambios)%>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
       <%}
  if(edoRes.b_5209)
  		{
		%>  
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" > 
    <td >&nbsp;</td>
    <td >VALORIZACI&Oacute;N CUENTAS EN OTRAS MONEDAS</td>
    <td >&nbsp;</td>
    <td  align="right"><%=decFormat.format(sum_5209)%>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <%}%>
    <%if(edoRes.bOtrosIng)
  		{%>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" > 
    <td >&nbsp;</td>
    <td >OTROS INGRESOS, BENEFICIOS Y RECUPERACIONES</td>
    <td >&nbsp;</td>
    <td  align="right"><%=decFormat.format(sumOtrosIng)%>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  	  <%} %>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;"> 
    <td >&nbsp;</td>
    <td align="right">&nbsp;</td>
    <td >&nbsp;</td>
    <td ><table width="100%">
        <td width="30%"></td>
        <td><hr size="1" noshade></td>
      </table></td>
    <td>&nbsp;</td>
  </tr>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" > 
    <td >&nbsp;</td>
    <td align="right">SUBTOTAL</td>
    <td >&nbsp;</td>
    <%
	subTotal1= sumInteCobra + sumVentas + sumComiCobra + sumIngresos_por_servicio + sumDonativos + sumPrimaXgar + sumUdis + sumRes_por_valuacion + sumCambios + sum_5209 + sumOtrosIng ;
	%>
    <td  align="right"><%=decFormat.format(subTotal1)%>&nbsp;</td>

    <td>&nbsp;</td>
  </tr>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" > 
    <td >&nbsp;</td>
    <td align="right">MENOS</td>
    <td >&nbsp;</td>
    <td >&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;"> 
    <td >&nbsp;</td>
    <td >EGRESOS</td>
    <td >&nbsp;</td>
    <td >&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <%
  subTotal2=sumIntePagado+sumComiPag+sumDividendosPag+sumEtiqueta_cambios+sumEtiqueta_resultados;  
   
  if(edoRes.bIntePagado) 
  	{%>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" > 
    <td >&nbsp;</td>
    <td >INTERESES PAGADOS</td>
    <td  align="right"><%=decFormat.format(sumIntePagado)%>&nbsp;</td>
    <td  align="right"><%=!edoRes.bComiPag && !edoRes.bEtiqueta_cambios  && !edoRes.bDividendosPag  && !edoRes.bEtiqueta_resultados?decFormat.format(subTotal2):""%>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
    <%}
  if(edoRes.bComiPag) 
  	{%>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" > 
    <td >&nbsp;</td>
    <td >COMISIONES PAGADAS</td>
    <td  align="right"><%=decFormat.format(sumComiPag)%>&nbsp;</td>
    <td  align="right"><%=!edoRes.bEtiqueta_cambios  && !edoRes.bDividendosPag  && !edoRes.bEtiqueta_resultados?decFormat.format(subTotal2):""%>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
     <%}
  if(edoRes.bDividendosPag) 
  	{%> 
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold; " > 
    <td >&nbsp;</td>
    <td >DIVIDENDOS PAGADOS</td>
    <td  align="right"><%=decFormat.format(sumDividendosPag)%>&nbsp;</td>
    <td  align="right"><%=!edoRes.bEtiqueta_cambios && !edoRes.bEtiqueta_resultados?decFormat.format(subTotal2):""%>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
    <%}
  if(edoRes.bEtiqueta_cambios && sumEtiqueta_cambios!= 0 ) 
  	{%>  
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" > 
    <td >&nbsp;</td>
    <td >CAMBIOS</td>
	<td  align="right"><%=decFormat.format(sumEtiqueta_cambios)%>&nbsp;</td>
    <td  align="right"><%=!edoRes.bEtiqueta_resultados?decFormat.format(subTotal2):""%>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
   <%}
   
  if(edoRes.bEtiqueta_resultados && sumEtiqueta_resultados!=0) 
  	{
	%>
	
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" > 
    <td >&nbsp;</td>
    <td >RESULTADO POR VALUACION</td>
    <td  align="right"><%=decFormat.format(sumEtiqueta_resultados)%>&nbsp;</td>
    <td  align="right"><%=decFormat.format(subTotal2)%>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
   <%}%>  
   <%if(edoRes.bComiPag || edoRes.bEtiqueta_cambios || edoRes.bDividendosPag || edoRes.bEtiqueta_resultados)
   		{%>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" > 
    <td >&nbsp;</td>
    <td align="right">&nbsp;</td>
    <td ><table width="100%">
        <td width="30%"></td>
        <td><hr size="1" noshade></td>
      </table></td>
    <td><table width="100%">
        <td width="30%"></td>
        <td><hr size="1" noshade></td>
      </table></td>
    <td>&nbsp;</td>
  </tr>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" > 
    <td >&nbsp;</td>
    <td align="right">SUBTOTAL</td>
    <td >&nbsp;</td>
    <td  align="right"><%=subTotal2==0?decFormat.format(0):decFormat.format(subTotal1-subTotal2)%>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" > 
    <td >&nbsp;</td>
    <td align="right">MENOS</td>
    <td >&nbsp;</td>
    <td align="right">&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <%}%>
  
   <%
	subTotal3=sumCosPer + sumCosAdmi + sumEntregas_a_fideicom + sumGastos_administrativo + sumHonorarios + sumCastigos + sumImpDiver;
	
	
    if(edoRes.bCosPer)
      {%>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" > 
    <td >&nbsp;</td>
    <td >COSTO DE PERSONAL</td>
    <td  align="right"><%=decFormat.format(sumCosPer)%>&nbsp;</td>
    <td  align="right"><%= !edoRes.bCosAdmi && !edoRes.bEntregas_a_fideicom && !edoRes.bGastos_administrativo && !edoRes.bHonorarios && !edoRes.bCastigos && !edoRes.bImpDiver?decFormat.format(subTotal3):""%>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
   <%}
  if(edoRes.bCosAdmi)
  	{%>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" > 
    <td >&nbsp;</td>
    <td >GASTOS DE FIDEICOMISO</td>
    <td  align="right"><%=decFormat.format(sumCosAdmi)%>&nbsp;</td>
    <td  align="right"><%=!edoRes.bEntregas_a_fideicom && !edoRes.bGastos_administrativo && !edoRes.bHonorarios && !edoRes.bCastigos && !edoRes.bImpDiver?decFormat.format(subTotal3):""%>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
   <%}
  if(edoRes.bEntregas_a_fideicom)
  	{%>  
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" > 
    <td >&nbsp;</td>
    <td >ENTREGAS A FIDEICOMISARIOS O FIDEICOMITENTES</td>
    <td  align="right"><%=decFormat.format(sumEntregas_a_fideicom)%>&nbsp;</td>
    <td  align="right"><%=!edoRes.bGastos_administrativo && !edoRes.bHonorarios && !edoRes.bCastigos && !edoRes.bImpDiver?decFormat.format(subTotal3):""%>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
     <%}
  if(edoRes.bGastos_administrativo)
  	{%>  
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" > 
    <td >&nbsp;</td>
    <td >GASTOS ADMINISTRATIVOS UDI'S</td>
    <td  align="right"><%=decFormat.format(sumGastos_administrativo)%>&nbsp;</td>
    <td  align="right"><%=!edoRes.bHonorarios && !edoRes.bCastigos && !edoRes.bImpDiver?decFormat.format(subTotal3):""%>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
   <%}
  if(edoRes.bHonorarios)
  	{%>   
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;"> 
    <td >&nbsp;</td>
    <td >HONORARIOS</td>
    <td  align="right"><%=decFormat.format(sumHonorarios)%>&nbsp;</td>
    <td  align="right"><%=!edoRes.bCastigos && !edoRes.bImpDiver?decFormat.format(subTotal3):""%>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
   <%}
  if(edoRes.bCastigos)
  	{%>   
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" > 
    <td >&nbsp;</td>
    <td >CASTIGOS, DEPRECIACIONES Y AMORTIZACIONES</td>
    <td  align="right"><%=decFormat.format(sumCastigos)%>&nbsp;</td>
    <td  align="right"><%=!edoRes.bImpDiver?decFormat.format(subTotal3):""%>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
     <%}
  if(edoRes.bImpDiver)
  	{%> 
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;"> 
    <td >&nbsp;</td>
    <td >IMPUESTOS DIVERSOS</td>
    <td  align="right"><%=decFormat.format(sumImpDiver)%>&nbsp;</td>
    <td  align="right"><%=decFormat.format(subTotal3)%>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <%}%>

  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" > 
    <td >&nbsp;</td>
    <td align="right">&nbsp;</td>
    <td ><table width="100%">
        <td width="30%"></td>
        <td><hr size="1" noshade></td>
      </table></td>
    <td align="right"><table width="100%">
        <td width="30%"></td>
        <td><hr size="1" noshade></td>
      </table></td>
    <td>&nbsp;</td>
  </tr>

  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" > 
    <td >&nbsp;</td>
    <td align="right">UTILIDAD (O PERDIDA) DE OPERACION:</td>
    <td >&nbsp;</td>
    <td  align="right"><%=decFormat.format((subTotal1-subTotal2)-subTotal3)%>&nbsp;</td>

    <td>&nbsp;</td>
  </tr>
   <%
	subTotal4= sumAplicacion;
	%>
<% 
	 if(edoRes.bAplicacion)
  		{%>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" > 
    <td >&nbsp;</td>
    <td >APLICACION REMANENTES</td>
    <td align="right"><%=decFormat.format(((-1)*sumAplicacion))%>&nbsp;</td>

    <td  align="right"><%=decFormat.format(((-1)*sumAplicacion))%>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <%}%>
  <%
  if(edoRes.bAplicacion)
  		{%>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" > 
    <td >&nbsp;</td>
   
    <td align="right">SUBTOTAL</td>
    <td >&nbsp;</td>
    <td  align="right"><%=subTotal4==0?decFormat.format(0):decFormat.format(((subTotal1-subTotal2) - subTotal3) + subTotal4)%>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <%
  if(subTotal4>0) {%>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;"  > 
    <td >&nbsp;</td>
    <td align="right">MENOS</td>
    <td >&nbsp;</td>
    <td >&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  	 				<%}
    }%>
   <%
	subTotal5=sumQuebrantos + sumOtros_Gastos + sumAfectacion;
	
   %>
   <%if(edoRes.bQuebrantos)
   		{%>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" > 
    <td >&nbsp;</td>
    <td >UTILIDADES / PERDIDAS</td>
    <td  align="right"><%=decFormat.format(sumQuebrantos)%>&nbsp;</td>
    <td  align="right"><%=!edoRes.bOtros_Gastos && !edoRes.bAfectacion?decFormat.format(subTotal5):""%>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  		<%}
	if(edoRes.bOtros_Gastos)
   		{%>	
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" > 
    <td >&nbsp;</td>
    <td >OTROS GASTOS DE OPERACION</td>
    <td  align="right"><%=decFormat.format(sumOtros_Gastos)%>&nbsp;</td>
    <td  align="right"><%=!edoRes.bAfectacion?decFormat.format(subTotal5):""%>&nbsp;</td>
    <td >&nbsp;</td>
  </tr>
  		<%}
	if(edoRes.bAfectacion)
   		{%>  
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" > 
    <td >&nbsp;</td>
    <td >AFECTACION PARA LA CONSTITUCION DE PROVISIONES</td>
    <td  align="right"><%=decFormat.format(sumAfectacion)%>&nbsp;</td>
    <td  align="right"><%=decFormat.format(subTotal5)%>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
   <%}%>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" >
    <td >&nbsp;</td>
    <td >&nbsp;</td>
    <td >&nbsp;</td>
    <td height="2"><table width="100%" height="2"><td width="30%"></td><td width="70%"></td></table></td>
    <td>&nbsp;</td>
  </tr>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;"> 
    <td  >&nbsp;</td>
    <td  >&nbsp;</td>
    <%
	total=(((subTotal1-subTotal2)-subTotal3)+subTotal4)-subTotal5;
	%>
    <td  align="right" ><%=total>0?"RESULTADO NETO":"RESULTADO NETO"%> &nbsp;</td>
    <td  align="right">
		<div style="width:100px !important;overflow:hidden;border-top:1px solid !important;border-bottom:4px solid double !important;">
			<%=decFormat.format(total)%>&nbsp;
		</div>
	</td>

    <td   >&nbsp;</td>
  </tr>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;"> 
    <td  >&nbsp;</td>
    <td  >&nbsp;</td>
    <td  align="right"  > &nbsp;</td>
    <td  align="right"  width="13%" >&nbsp;</td>

    <td   >&nbsp;</td>
  </tr>  
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" > 
    <td >&nbsp;</td>
    <td >&nbsp;</td>
    <td >&nbsp;</td>
    <td >&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" > 
    <td >&nbsp;</td>
    <td >&nbsp;</td>
    <td >&nbsp;</td>
    <td >&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>

<table width="960" border="0" align="center">
<%
// firma 
boolean bfirma = request.getParameter("EjecutivoFirma")!=null;
String nom_firma1 = "";
String nom_firma2 = "";
if(bfirma)
{
  String ejecutivoFirma = request.getParameter("EjecutivoFirma").toString();
  nom_firma1 = ejecutivoFirma;
  if(ejecutivoFirma.indexOf(";")>=0)
  {
    nom_firma1 = ejecutivoFirma.split(";")[0];
    nom_firma2 = ejecutivoFirma.split(";")[1];
  }
}

if(bfirma){%>
<tr align="left">
	<td>&nbsp;</td>
	<td>&nbsp;</td>
	<td>&nbsp;</td>
	<td>&nbsp;</td>
	<td>&nbsp;</td>
	<td>&nbsp;</td>        
	<td>&nbsp;</td>        
</tr>
<tr align="left">
	<td>&nbsp;</td>
	<td>&nbsp;</td>
	<td>&nbsp;</td>
	<td>&nbsp;</td>
	<td>&nbsp;</td>
	<td>&nbsp;</td>        
	<td>&nbsp;</td>        
</tr>
<tr align="left">
	<td>&nbsp;</td>
	<td>&nbsp;</td>
	<td>&nbsp;</td>
	<td>&nbsp;</td>
	<td>&nbsp;</td>
	<td>&nbsp;</td>        
	<td>&nbsp;</td>         
</tr>
<tr align="left">
	<td>&nbsp;</td>
	<td>
		<div style="width:300px !important;overflow:hidden;border-top:1px solid !important;text-align:center;">
			<%=nom_firma1%>
		</div>
	</td>
	<td>&nbsp;</td>
	<td>
		<div style="width:300px !important;overflow:hidden;border-top:1px solid !important;text-align:center;">
			<%=nom_firma2%>
		</div>
	</td>
	<td>&nbsp;</td>
	<td>&nbsp;</td>        
	<td>&nbsp;</td>        
</tr>
<%}%>
</table>

<table width="447" align="center">
  <tr>
    <td height="19" >&nbsp;</td>
  </tr>
  <tr> 
    <td width="439" height="19" >&nbsp;</td>
  </tr>
  <tr> 
    <td height="19" style="font-family: Arial, Helvetica, Verdana;	font-size: 14px;color: #006699;font-weight: bold;" align="center"> 
		<%=mensaje%>    
    </td>
  </tr>
  <tr> 
    <td align="center">&nbsp;</td>
  </tr>
  <tr> 
    &nbsp;
  </tr>
</table>
<table width="447" align="center">
  <tr>
    <td height="19" >&nbsp;</td>
  </tr>
  <tr> 
    <td width="439" height="19" >&nbsp;</td>
  </tr>
  <tr> 
    <td height="19" style="font-family: Arial, Helvetica, Verdana;	font-size: 14px;color: #006699;font-weight: bold;" align="center"> 
		<%=mensaje%>    
    </td>
  </tr>
  <tr> 
    <td align="center">&nbsp;</td>
  </tr>
  <tr> 
    &nbsp;
  </tr>
</table>

<%
}
else
	{%>
<table width="447" align="center">
  <tr>
    <td height="19" >&nbsp;</td>
  </tr>
  <tr> 
    <td width="439" height="19" >&nbsp;</td>
  </tr>
  <tr> 
    <td height="19" style="font-family: Arial, Helvetica, Verdana;	font-size: 14px;color: #006699;font-weight: bold;" align="center"> 
		<%=mensaje%>    
    </td>
  </tr>
  <tr> 
    <td align="center">&nbsp;</td>
  </tr>
  <tr> 
    <td align="center"><input type="button" name="Cerrar" value="Cerrar" onClick="window.close();" style="background: #006699; border: 1px solid #000066; font-family: Verdana, Arial, Helvetica, sans-serif; font-size: 9px; color: #FFFFFF; font-weight: normal;"></td>
  </tr>
</table>

	<%}%>

<%}
catch(Exception e)
	{
System.out.println(" Reporte Estado de Resultados: \nError:"+e);
	%>

	<table width="447" align="center">
  <tr>
    <td height="19">&nbsp;</td>
  </tr>
  <tr> 
    <td width="439" height="19">&nbsp;</td>
  </tr>
  <tr> 
    <td  align="center" height="19" style="font-family: Arial, Helvetica, Verdana;	font-size: 14px;color: #006699;font-weight: bold;">Reporte Estado de Resultados: Error:<%=e%></td>
  </tr>
  <tr> 
    <td align="center">&nbsp;</td>
  </tr>
 
</table>

<%}%>
</body>

<!--/body-->
<!---------------------------------- edoRes.jsp ---------------------------------------->





<%

    String mensaje="";	
    //Variables que contendr?n los elementos de cada tupla
    String sNumFideicomiso ="";    
    double iEsEtiqueta = 0 ;   
    double dValorDato = 0;   
    double dordenDato = 0;   

    double dValorDato2 = 0;   
    double dValorDato3 = 0;   
    double dValorDato4 = 0;   
    double dValorDato5 = 0;   

    double valorDatoTemp= 0;
    double dSumTotalReng= 0;
    double dSumTotalCol1= 0;
    double dSumTotalCol2= 0;
    double dSumTotalCol3= 0;
    double dSumTotalCol4= 0;
    double dSumTotalCol5= 0;
    String sValorLogicoTemp="";
    String sNombreImpresoTemp="";
    String sNombreAgrupacion="";
    String sNomUsuario="";
    String sCuenta="";    
    String sMotRechazo=""; 
    String sFideicomiso="";
    String sPeriodo="";
    String sNombreImpreso="";
/*int numFid=Integer.valueOf(request.getParameter("Fiso")).intValue();
int mes=Integer.valueOf(request.getParameter("Mes")).intValue();
int anio=Integer.valueOf(request.getParameter("Ano")).intValue();*/
    
 //nuevos   
    int numContrato= 0;
    String nomContrato="";
    String Fecha="";
    double col1= 0;
    double col2= 0;
    double col3= 0;
    double col4= 0;
    double col5= 0;
    double numColumna= 0;
    String etiquetas="";
    int iCtaOrden=0;
    String FechaAnt="";

    String sFiso=String.valueOf(request.getParameter("Fiso"));
    String sFecha=String.valueOf(request.getParameter("Fecha"));
    String sUsuario=String.valueOf(request.getParameter("Usuario"));
    String tabla = "saldos"+(request.getParameter("tipoReporte") == null ? "" : request.getParameter("tipoReporte"));      
    //se ejecuta el procedimiento de variacion de patrimonio
    repEdoFinan.spVariacionPatrimonio(sFiso,sFecha,sUsuario);
    
    datEdoFinan.setVtrIntDato1(Integer.valueOf(sFiso).intValue());//numero de contrato
    datEdoFinan.querySelect(13,tabla);


  if(datEdoFinan.hasData())
  {
    datEdoFinan.setIndex(0);
  
    numContrato=datEdoFinan.getVtrIntDato3();
    nomContrato=datEdoFinan.getVtrStrDato2();
    /*
    balance.setVtrIntDato1(numFid);//numero de contrato
    balance.setVtrIntDato2(mes);//mes del Reporte
    balance.setVtrIntDato3(anio);//a?o del Reportes
    balance.querySelect(1, tabla);*/
    
    //sPeriodo=datEdoFinan.getVtrStrDato3();
    sPeriodo=sPeriodoGlobal;
    

   
 /*   if(tipoAdmin.equals("SI"))
        {
        mensaje="El Reporte de Balance General<BR>No esta disponible<BR><BR>Para Fideicomisos con administraci?n propia";
        }*/
  }
  else
  {
    mensaje="No esta disponible<BR>El Reporte Variacion del Patrimonio<BR>De "+sPeriodo;
  }
  //Valida si el fideicomiso tiene administracion propia o no
int j=0;

%>

<html>
<head>
<title>ESTADO DE  VARIACIONES DEL PATRIMONIO</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>
<body <%=request.getParameter("bImprimir")!=null && request.getParameter("bImprimir").trim().equals("1") && balance.hasData()==true ?"onLoad=\"window.print();window.close();\"":" "%>  oncontextmenu="return false" onkeydown="return false"   onmousemove ="return false" onselectstart ="return false" onclick="return false">

<table width="960" border="0" align="center">
<tr><td><table width="680">
  <tr> 
    &nbsp;
  </tr>
  </table>
  </td>
  <td width='151' height='91' rowspan="4"><img src="<%=request.getContextPath()%>/imagenes/logo_bn.jpg" ></td>  
  </tr>
</table>
<table width="960" border="0" align="center">
<tr>
<td  align="center" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" colspan="7">
_______________________________________________________________________________________________________________________________________
</td>
</tr>
</table>
<table width="960" border="0" align="center">
  <tr> 
    <td align="center" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" colspan="7"><%=fideicomiso%></td>
  </tr>

  <tr> 
    <td align="left" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" colspan="7"> 
     ESTADO DE VARIACION </td>
  </tr>
  <tr> 
    <td align="left" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" colspan="7"> 
     Al <%=sPeriodo%></td>
  </tr>
</table>
	
          <P>&nbsp;</P>

           <table width="960"  border="0" align="center" bgcolor="#CCCCCC" style="font-family: Arial;	font-size: 13px;color: #000000;font-weight: bold;">
            <tr>
                <td align="center" width="350">&nbsp;</td>
                <td align="center" width="157">Patrimonio Fideicomitido</td>
                <td align="center" width="102">Aplicaciones Patrimoniales</td>
                <td align="center" width="188">Resultado Ejercicios Ant. </td>
                <td align="center" width="156">Resultado del Ejericio</td>
                <td align="center" width="112">Total</td>
            </tr>
</table>
<table width="960"  border="0" align="center">
      <%

      
           for(int i = 0; i < datEdoFinan.getSize(); i++) {  //Para cada registro
                datEdoFinan.setIndex(i);

                numColumna = datEdoFinan.getVtrDoubleDato2(); 
                sNombreImpreso = datEdoFinan.getVtrStrDato1(); 
                iEsEtiqueta = datEdoFinan.getVtrIntDato1();
                dValorDato = datEdoFinan.getVtrDoubleDato1(); 
                dValorDato2 = datEdoFinan.getVtrDoubleDato3(); 
                dValorDato3 = datEdoFinan.getVtrDoubleDato5(); 
                dValorDato4 = datEdoFinan.getVtrDoubleDato7(); 
                dValorDato5 = datEdoFinan.getVtrDoubleDato9(); 
                dordenDato = datEdoFinan.getVtrIntDato2();             
                dSumTotalReng=(dValorDato2+
                dValorDato3+dValorDato4+
                dValorDato5);
                //se obtienen totales por columna
                dSumTotalCol1= (dSumTotalCol1 + dValorDato2);
                dSumTotalCol2= (dSumTotalCol2 + dValorDato3);
                dSumTotalCol3= (dSumTotalCol3 + dValorDato4);
                dSumTotalCol4= (dSumTotalCol4 + dValorDato5);
                dSumTotalCol5= (dSumTotalCol5 + dSumTotalReng);
                            
             %>               
          <tr style="font-family: Arial;	font-size: 10px;color: #000000;">
            <td align="left" width="350" ><%=sNombreImpreso%></td>
            <td align="right" width="157" ><%=DecimalFormatUtils.getFormatedNumber("###,###,###,###,###.00",dValorDato2)%></td>                
            <td align="right" width="102" ><%=DecimalFormatUtils.getFormatedNumber("###,###,###,###,###.00",dValorDato3)%></td>                
            <td align="right" width="188" ><%=DecimalFormatUtils.getFormatedNumber("###,###,###,###,###.00",dValorDato4)%></td>                
            <td align="right" width="156" ><%=DecimalFormatUtils.getFormatedNumber("###,###,###,###,###.00",dValorDato5)%></td>                
            <td align="right" width="112" ><%=DecimalFormatUtils.getFormatedNumber("###,###,###,###,###.00",dSumTotalReng)%></td>                
          </tr>   
      <% }
            //se coloca el total por columna
          if(datEdoFinan.hasData())
          {
            datEdoFinan.setIndex(1);
      %>
          <tr bgcolor="#CCCCCC" style="font-family: Arial;	font-size: 13px;color: #000000;font-weight: bold;">
            <td align="left" width="350" >Total:</td>
            <td align="right" width="157" ><%=DecimalFormatUtils.getFormatedNumber("###,###,###,###,###.00",dSumTotalCol1)%></td>                
            <td align="right" width="102" ><%=DecimalFormatUtils.getFormatedNumber("###,###,###,###,###.00",dSumTotalCol2)%></td>                
            <td align="right" width="188" ><%=DecimalFormatUtils.getFormatedNumber("###,###,###,###,###.00",dSumTotalCol3)%></td>                
            <td align="right" width="156" ><%=DecimalFormatUtils.getFormatedNumber("###,###,###,###,###.00",dSumTotalCol4)%></td>                
            <td align="right" width="112" ><%=DecimalFormatUtils.getFormatedNumber("###,###,###,###,###.00",dSumTotalCol5)%></td>                
          </tr>         
      <%}%>
    </table>


</body>
</html>
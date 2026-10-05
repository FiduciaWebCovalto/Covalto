<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.text.*,java.util.*,java.lang.*"%>
<jsp:useBean id="reporte" class="mx.com.inscitech.clients.negocio.nReporte"/>
<jsp:useBean id="valida" class="mx.com.inscitech.clients.negocio.nReporte"/>
<jsp:useBean id="edoRes" scope="page" class="mx.com.inscitech.clients.negocio.edoResFormulas" />
<jsp:useBean id="BD"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<jsp:useBean id="repEdoFinan"  class="mx.com.inscitech.clients.negocio.FiduciaBD"/>
<jsp:useBean id="datEdoFinan" class="mx.com.inscitech.clients.negocio.nReporte"/>

<%
String[] bitacora = new String[5];
String fechaCont=BD.getFecha();
String folioBit="";
int regBitacora=0;

try
	{
double subTotal1=0;
double subTotal2=0;
double subTotal3=0;
double subTotal4=0;
double subTotal5=0;
double total=0;
String fideicomiso="";
String periodo="";					
DecimalFormat decFormat = new DecimalFormat("###,###,###,###,###,###,###,##0.00");
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
String[] meses={" ","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
int numFid=Integer.valueOf(request.getParameter("numFid")).intValue();
int mes=Integer.valueOf(request.getParameter("mes")).intValue();
int anio=Integer.valueOf(request.getParameter("anio")).intValue();

//incorporacion de la bitacora
 folioBit=BD.getFolio(2);
 System.out.println("Folio"+folioBit);
 bitacora[0]=fechaCont;
 bitacora[1]= folioBit;
 bitacora[2]=(String)session.getAttribute("NumUser");
 bitacora[3]="Consulta del Estado de Resultados para el Fideicomiso "+numFid
 +" del Mes "+meses[mes].toUpperCase()+" del Anio "+anio;
 bitacora[4]="120.0.0.1";

 regBitacora=BD.insertaBitacora(bitacora);	

//Valida si el fideicomiso tiene administracion propia o no
valida.setVtrIntDato1(numFid);//numero de contrato
valida.querySelect(10);
if(valida.hasData())
	tipoAdmin=valida.getVtrStrDato1().trim();
		
if(tipoAdmin.equals("NO"))
		{
reporte.setVtrIntDato1(numFid);//numero de contrato
reporte.setVtrIntDato2(mes);//mes del Reporte
reporte.setVtrIntDato3(anio);//a�o del Reportes
reporte.querySelect(2);
		}
else
		{
		mensaje="El Reporte de Estado de Resultados<BR>No esta disponible<BR><BR>Para Fideicomisos con administraci�n propia";
		}
if(tipoAdmin.equals("NO") && !reporte.hasData())
		{
	
		mensaje="No esta disponible<BR>El Reporte de Estado de Resultados<BR>De "+meses[mes]+" del "+anio;
		}

%>
<html>
<head>
<title>Estado de Resultados de <%=meses[mes]%> del <%=anio%>  Fideicomiso: <%=(String)session.getAttribute( "Fideicomiso" )%></title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>
<body <%=request.getParameter("bImprimir")!=null && request.getParameter("bImprimir").trim().equals("1") && reporte.hasData()==true ?"onLoad=\"window.print();window.close();\"":" "%>  oncontextmenu="return false" onkeydown="return false"   onmousemove ="return false" onselectstart ="return false" onclick="return false">
<%
boolean encabezado=false;
if(reporte.hasData()==true)
	{
	
	fideicomiso=reporte.getVtrIntDato1() +"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+reporte.getVtrStrDato2().toUpperCase();
	periodo= " DEL 1 DE ENERO AL " + reporte.getVtrStrDato4();

  //SE PROCEDE A EJECUTAR EL STORE QUE ARMA EL ESTADO FINANCIERO
  boolean genEdoFin=repEdoFinan.generaEdosFinan((String)request.getParameter("numFid"),String.valueOf(anio),String.valueOf(mes),1,"SALDOSH");  
	 	
%>
	
<table width="960" border="0" align="center">
<tr><td><hr width="960" size="1"> </td></tr>
</table>  
<table width="966" border="0" align="center">
  <tr> 
    <td width="100" rowspan="4"><img src="imagenes/logo_bn.GIF" alt="<%=session.getAttribute("empresa_9")%>"></td>
    <td colspan="7"  align="center"  style="font-family: Arial;	font-size: 16px;color: #000000;font-weight: bold;">Inscitech</td>
    <td width="100"  align="center"  style="font-family: Arial;	font-size: 16px;color: #000000;font-weight: bold;">&nbsp;</td>
  </tr>
  <tr> 
    <td  align="center" colspan="7" style="font-family: Verdana, Arial, Helvetica;	font-size: 12px;color: #000000;font-weight: bold;">Direcci�n 
      Fiduciaria</td>
    <td  align="center" style="font-family: Verdana, Arial, Helvetica;	font-size: 12px;color: #000000;font-weight: bold;">&nbsp;</td>
  </tr>
  <tr> 
    <td align="center" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" colspan="7"> 
      FIDEICOMISO&nbsp;&nbsp;<%=fideicomiso%>&nbsp;</td>
    <td align="center" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;">&nbsp;</td>
  </tr>
  <tr> 
    <td align="center" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" colspan="7">ESTADO 
      DE RESULTADOS <%=periodo%>&nbsp;</td>
    <td align="center" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;">&nbsp;</td>
  </tr>
</table>
<table width="960" border="0" align="center">
<tr><td><hr width="960" size="1"> </td></tr>
</table>
    
<table width="960" border="0" align="center">
  <%
  //SE INCORPORAN LOS DATOS DEL ESTADO FINANCIERO
  int contlineagrupo=0;
  int contlineatotal=0;
  datEdoFinan.setVtrIntDato1(Integer.valueOf(request.getParameter("numFid")).intValue());	
  datEdoFinan.setVtrIntDato2(1);	  
  datEdoFinan.querySelect(5);  
  do
	{
    datEdoFinan.setIndex(j);
    
    if(datEdoFinan.getVtrStrDato1().equalsIgnoreCase("TOTAL GRUPO")){//&&datEdoFinan.getVtrIntDato1()!=0){
      j++;
      if(j<datEdoFinan.getSize()){
        datEdoFinan.setIndex(j);
        if(datEdoFinan.getVtrIntDato6()!=-3)
          contlineagrupo=0;//SE INICIALIZA EL CONTADOR DE DETALLE        
        j--;  
        datEdoFinan.setIndex(j);  
        j++;
      }  
      continue;
    }
	%>
  <%if(datEdoFinan.getVtrIntDato6()==1||datEdoFinan.getVtrIntDato6()==2||datEdoFinan.getVtrIntDato6()==0||datEdoFinan.getVtrIntDato6()==-3){//SECCION DE DETALLE%>
    <%if(datEdoFinan.getVtrDoubleDato1()!=0){//SE PRESENTAN CONCEPTOS CUYO IMPORTE SEA DISTINTO DE CERO
    %>
      <%if(contlineagrupo==0){//SE IDENTIFICA SI ES TITULO,LOS TITULOS SIEMPREN SON LOS PRIMEROS DE UN GRUPO
      contlineatotal=0;//SE INICIALIZA EL CONTADOR DE TOTALES%>
          <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
          <td width="15%"></td>            
          <td width="30%" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;"><%=datEdoFinan.getVtrStrDato1()!=null?datEdoFinan.getVtrStrDato1():"&nbsp;"%></td>
          <td align="right" width="18%">&nbsp;</td>
          <td width="15%"></td>                      
          </tr>              
      <%}
      else if(datEdoFinan.getVtrIntDato6()!=-3){//NO ES TITULO ES DETALLE%>
          <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
          <td width="15%"></td>                      
          <td width="30%"><%=datEdoFinan.getVtrStrDato1()!=null?datEdoFinan.getVtrStrDato1():"&nbsp;"%></td>
          <td align="right" width="18%"><%=String.valueOf(datEdoFinan.getVtrDoubleDato1())!=null?NumberFormat.getCurrencyInstance(Locale.US).format(datEdoFinan.getVtrDoubleDato1()):"&nbsp;"%></td>
          <td width="15%"></td>                      
          </tr>              
      <%}
      else if(datEdoFinan.getVtrIntDato6()==-3){//NO ES TITULO ES DETALLE%>
          <tr>
            <td width="15%"></td>                      
            <td width="30%">&nbsp;</td>
            <td align="right" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;">-------------------------</td>
            <td width="15%"></td>                      
          </tr>      
          <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
          <td width="15%"></td>                      
          <td width="30%">&nbsp;</td>
          <td align="right" width="18%"><%=String.valueOf(datEdoFinan.getVtrDoubleDato1())!=null?NumberFormat.getCurrencyInstance(Locale.US).format(datEdoFinan.getVtrDoubleDato1()):"&nbsp;"%></td>
          <td width="15%"></td>                      
          </tr>              
      <%}%>
      
      
    <%}%>
  <%
  contlineagrupo++;//SE INCREMENTA EL CONTADOR DE DETALLE
  }//FIN DE SECCION DE DETALLE
  if(datEdoFinan.getVtrIntDato6()==3){//SECCION DE TOTALES%>  
    <%if(datEdoFinan.getVtrDoubleDato1()!=0){//SE PRESENTAN CONCEPTOS CUYO IMPORTE SEA DISTINTO DE CERO%>
      <%if(contlineatotal==0){//SE IDENTIFICA SI ES EL PRIMER ELEMENTO PARA PRESENTARLO COMO TOTAL%>
          <tr style="font-family: Arial;	font-size: 9px;color: #000000;" >         
            <td width="15%"></td>                                
            <td width="30%" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;"><%=datEdoFinan.getVtrStrDato1()!=null?datEdoFinan.getVtrStrDato1():"&nbsp;"%></td>
            <td align="right" width="18%" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;">
            <table>
              <tr>
                <td align="right" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;">-------------------------</td>
              </tr>
              <tr>
                <td align="right" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;"><%=String.valueOf(datEdoFinan.getVtrDoubleDato1())!=null?NumberFormat.getCurrencyInstance(Locale.US).format(datEdoFinan.getVtrDoubleDato1()):"&nbsp;"%></td>
              </tr>
            </table>  
            </td>
          <td width="15%"></td>                                  
          </tr>
      <%}
    }
  contlineatotal++;  //SE INCREMENTA EL CONTADOR DE TOTALES
  contlineagrupo=0;//SE INICIALIZA EL CONTADOR DE DETALLE
  }//FIN SECCION DE TOTALES
  %>
  <%       
	j++;
	}
	while(j<datEdoFinan.getSize());  
  %>
</table>  

<table width="960" border="0"  align="center">
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
    <td align="center"><p align="justify"> EL PRESENTE ESTADO DE CONTABILIDAD SE FORMULO DE ACUERDO CON
    LAS DISPOSICIONES DE CARACTER GENERAL EMITIDAS POR LA COMISION NACIONAL BANCARIA Y DE VALORES, ENCONTRANDOSE
    CORRETAMENTE REFLEJADOS EN EL, LAS OPERACIONES EFECTUADAS POR EL FIDEICOMISO EN EL PERIODO AL QUE EL PROPIO
    ESTADO SE REFIERE. LAS CUALES SE REALIZARON CON EL APEGO A LAS SANAS PRACTICAS Y A LAS NORMAS LEGALES Y 
    ADMINISTRATIVAS APLICABLES, Y FUERON REGISTRADAS DE MANERA CONSISTENTE EN LAS CUENTAS QUE CORRESPONDEN
    CONFORME AL CATALOGO DE CUENTAS OFICIAL EN VIGOR. </p></td>
  </tr>
</table>

<table width="960" border="0"  align="center">
    <tr  >
    <td align="center" style="font-family: Arial;	font-size: 9px;color: #000000;" colspan="8">&nbsp;</td>
  </tr>
  <tr  > 
    <td align="center" style="font-family: Arial;	font-size: 12px;color: #000000;"  width="50%">&nbsp;</td>
    <td align="center" style="font-family: Arial;	font-size: 12px;color: #000000;"  width="50%">&nbsp;</td>    
  </tr>
  <tr  > 
    <td align="center" style="font-family: Arial;	font-size: 9px;color: #000000;" width="50%">&nbsp;</td>
    <td align="center" style="font-family: Arial;	font-size: 9px;color: #000000;" width="50%">&nbsp;</td>      
  </tr>
  <tr  >
    <td align="center" style="font-family: Arial;	font-size: 9px;color: #000000;" colspan="8">&nbsp;</td>
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
</html>
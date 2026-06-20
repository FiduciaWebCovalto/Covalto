<!doctype html>
<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.text.*,java.util.*,java.lang.*,java.io.*,java.sql.*"%>
<jsp:useBean id="balance" class="com.bancomext.negocio.nReporte"/>
<jsp:useBean id="valida" class="com.bancomext.negocio.nReporte"/>
<jsp:useBean id="cuentas" class="com.bancomext.negocio.balanceFormulas"/>
<jsp:useBean id="BD"  class="com.bancomext.negocio.FiduciaBD"/>
<jsp:useBean id="repEdoFinan"  class="com.bancomext.negocio.FiduciaBD"/>
<jsp:useBean id="datEdoFinan" class="com.bancomext.negocio.nReporte"/>
<%

DecimalFormat decFormat = new DecimalFormat("###,###,###,###,###,###,###,##0.00");
String[] bitacora = new String[5];
String fechaCont=BD.getFecha();
String folioBit="";
int regBitacora=0;
%>
<%
try
	{
String fideicomiso="";
String periodo="";					

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
 bitacora[2]=(String)session.getAttribute("username");
 bitacora[3]="Consulta del Estado de Posicion Financiera para el Fideicomiso "+numFid
 +" del Mes "+meses[mes].toUpperCase()+" del Anio "+anio;
 bitacora[4]="120.0.0.1";

 regBitacora=BD.insertaBitacora(bitacora);	

//Valida si el fideicomiso tiene administracion propia o no

valida.setVtrIntDato1(numFid);//numero de contrato
valida.querySelect(10);


int j=0;
int contlineatotactivo=0;
int contlineatotpasivo=0;
String tipoAdmin="";
if(valida.hasData())
	tipoAdmin=valida.getVtrStrDato1().trim();
		
if(tipoAdmin.equals("NO"))
		{
balance.setVtrIntDato1(numFid);//numero de contrato
balance.setVtrIntDato2(mes);//mes del Reporte
balance.setVtrIntDato3(anio);//a�o del Reportes
balance.querySelect(1);
		}
else
		{
		mensaje="El Reporte de Estado de Posicion Financiera<BR>No esta disponible<BR><BR>Para Fideicomisos con administraci�n propia";
		}
if(tipoAdmin.equals("NO") && !balance.hasData())
		{
	
		mensaje="No esta disponible<BR>El Reporte de Estado de Posicion Financiera<BR>De "+meses[mes]+" del "+anio;
		}
%>

<html>
<head>
<title>Estado de Posicion Financiera de <%=meses[mes]%> del <%=anio%>  Fideicomiso: <%=(String)session.getAttribute( "Fideicomiso" )%></title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>
<body <%=request.getParameter("bImprimir")!=null && request.getParameter("bImprimir").trim().equals("1") && balance.hasData()==true ?"onLoad=\"window.print();window.close();\"":" "%>  oncontextmenu="return false" onkeydown="return false"   onmousemove ="return false" onselectstart ="return false" onclick="return false">
<%
boolean encabezado=false;
if(balance.hasData()==true)
	{
	
	fideicomiso=balance.getVtrIntDato1() +"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+balance.getVtrStrDato2().toUpperCase();
	periodo=balance.getVtrStrDato3();
  
  //SE PROCEDE A EJECUTAR EL STORE QUE ARMA EL ESTADO FINANCIERO

  boolean genEdoFin=repEdoFinan.generaEdosFinan((String)request.getParameter("numFid"),String.valueOf(anio),String.valueOf(mes),2,"SALDOSH");  
  %>
<table width="960" border="0" align="center">
<tr><td><hr width="960" size="1"> </td></tr>
</table>
<table width="960" border="0" align="center">
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
      FIDEICOMISO&nbsp;&nbsp;<%=fideicomiso%> </td>
    <td align="center" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;">&nbsp;</td>
  </tr>
  <tr> 
    <td align="center" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;" colspan="7">ESTADO DE POSICION FINANCIERA AL <%=periodo%></td>
    <td align="center" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;">&nbsp;</td>
  </tr>
</table>
<table width="960" border="0" align="center">
<tr><td><hr width="960" size="1"> </td></tr>
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
    <td align="center" width="50%" colspan="4">PASIVO Y PATRIMONIO</td>
  </tr>
</table>


<table width="960" border="0" align="center">
  <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
  <td width="50%">
  <table width="480" border="0" align="center">  
  <%
  //SE INCORPORAN LOS DATOS DEL ESTADO FINANCIERO
  int contlineagrupo=0;
  int contlineatotal=0;
  datEdoFinan.setVtrIntDato1(Integer.valueOf(request.getParameter("numFid")).intValue());	
  datEdoFinan.setVtrStrDato1("ACTIVO");  
  datEdoFinan.querySelect(3);  
  do
	{
    datEdoFinan.setIndex(j);
    
    
    if(datEdoFinan.getVtrStrDato1().equalsIgnoreCase("TOTAL GRUPO")){
      contlineagrupo=0;//SE INICIALIZA EL CONTADOR DE DETALLE
      j++;
      continue;
    }    
	%>
  <%if(datEdoFinan.getVtrStrDato2().equalsIgnoreCase("ACTIVO")){//INICIO DE ACTIVO%>
    <%if(datEdoFinan.getVtrIntDato6()==1){//SECCION DE DETALLE%>
      <%if(datEdoFinan.getVtrDoubleDato1()!=0){//SE PRESENTAN CONCEPTOS CUYO IMPORTE SEA DISTINTO DE CERO
          contlineatotactivo++;
      %>
        <%if(contlineagrupo==0){//SE IDENTIFICA SI ES TITULO,LOS TITULOS SIEMPREN SON LOS PRIMEROS DE UN GRUPO
        contlineatotal=0;//SE INICIALIZA EL CONTADOR DE TOTALES%>
          <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
          <td width="30%" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;"><%=datEdoFinan.getVtrStrDato1()!=null?datEdoFinan.getVtrStrDato1():"&nbsp;"%></td>
          <td align="right" width="18%">&nbsp;</td>
          </tr>              
        <%}
        else{//NO ES TITULO ES DETALLE%>
          <tr style="font-family: Arial;	font-size: 9px;color: #000000;" > 
          <td width="30%"><%=datEdoFinan.getVtrStrDato1()!=null?datEdoFinan.getVtrStrDato1():"&nbsp;"%></td>
          <td align="right" width="18%"><%=String.valueOf(datEdoFinan.getVtrDoubleDato1())!=null?NumberFormat.getCurrencyInstance(Locale.US).format(datEdoFinan.getVtrDoubleDato1()):"&nbsp;"%></td>
          </tr>              
        <%}%>
      <%}%>
    <%
    contlineagrupo++;//SE INCREMENTA EL CONTADOR DE DETALLE
    }//FIN DE SECCION DE DETALLE
    if(datEdoFinan.getVtrIntDato6()==3){//SECCION DE TOTALES%>  
      <%if(datEdoFinan.getVtrDoubleDato1()!=0){//SE PRESENTAN CONCEPTOS CUYO IMPORTE SEA DISTINTO DE CERO%>
        <%if(contlineatotal==0||((datEdoFinan.getSize()-j)==3)){//SE IDENTIFICA SI ES EL PRIMER ELEMENTO PARA PRESENTARLO COMO TOTAL%>
          <tr style="font-family: Arial;	font-size: 9px;color: #000000;" >         
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
          </tr>
        <%}
      }
    contlineatotal++;  //SE INCREMENTA EL CONTADOR DE TOTALES
    contlineagrupo=0;//SE INICIALIZA EL CONTADOR DE DETALLE
    }//FIN SECCION DE TOTALES
    %>
  <%}//FIN DE ACTIVO%>  
  <%       
	j++;
	}
	while(j<datEdoFinan.getSize());
  
  //SE INCORPORAN LOS DATOS DEL ESTADO FINANCIERO
  //PASIVO
  contlineagrupo=0;
  contlineatotal=0;
  j=0;
  datEdoFinan.removerValores();
  datEdoFinan.setVtrIntDato1(Integer.valueOf(request.getParameter("numFid")).intValue());	
  datEdoFinan.setVtrStrDato1("PASIVO Y PATRIMONIO");  
  datEdoFinan.querySelect(3);    
  do{
    datEdoFinan.setIndex(j);
    if(datEdoFinan.getVtrDoubleDato1()!=0)
      contlineatotpasivo++;
	j++;
	}
	while(j<datEdoFinan.getSize());
  j=0;
  %>
  </table>
  </td>
  <td width="50%">
  <table width="480" border="0" align="center">  
  <%
  contlineagrupo=0;
  contlineatotal=0;
  j=0;
  datEdoFinan.removerValores();
  datEdoFinan.setVtrIntDato1(Integer.valueOf(request.getParameter("numFid")).intValue());	
  datEdoFinan.setVtrStrDato1("PASIVO Y PATRIMONIO");  
  datEdoFinan.querySelect(3);    
  
  do
	{
    datEdoFinan.setIndex(j);
    
    if(datEdoFinan.getVtrStrDato1().equalsIgnoreCase("TOTAL GRUPO")){
      contlineagrupo=0;//SE INICIALIZA EL CONTADOR DE DETALLE
      j++;
      continue;
    }     
	%>
  <%if(datEdoFinan.getVtrStrDato2().equalsIgnoreCase("PASIVO Y PATRIMONIO")){//INICIO DE PASIVO%>
    <%if(datEdoFinan.getVtrIntDato6()==1){//SECCION DE DETALLE%>
      <%if(datEdoFinan.getVtrDoubleDato1()!=0){//SE PRESENTAN CONCEPTOS CUYO IMPORTE SEA DISTINTO DE CERO%>
        <%if(contlineagrupo==0){//SE IDENTIFICA SI ES TITULO,LOS TITULOS SIEMPREN SON LOS PRIMEROS DE UN GRUPO
        contlineatotal=0;//SE INICIALIZA EL CONTADOR DE TOTALES%>
          <tr style="font-family: Arial;	font-size: 9px;color: #000000;" >                 
          <td width="30%" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;"><%=datEdoFinan.getVtrStrDato1()!=null?datEdoFinan.getVtrStrDato1():"&nbsp;"%></td>
          <td align="right" width="18%">&nbsp;</td>
          </tr>              
        <%}
        else{//NO ES TITULO ES DETALLE%>
          <tr style="font-family: Arial;	font-size: 9px;color: #000000;" >                         
          <td width="30%"><%=datEdoFinan.getVtrStrDato1()!=null?datEdoFinan.getVtrStrDato1():"&nbsp;"%></td>
          <td align="right" width="18%"><%=String.valueOf(datEdoFinan.getVtrDoubleDato1())!=null?NumberFormat.getCurrencyInstance(Locale.US).format(datEdoFinan.getVtrDoubleDato1()):"&nbsp;"%></td>
          </tr>
        <%}%>
      <%}%>
    <%
        contlineagrupo++;//SE INCREMENTA EL CONTADOR DE DETALLE
    }//FIN DE SECCION DE DETALLE
    if(datEdoFinan.getVtrIntDato6()==3){//SECCION DE TOTALES%>  
      <%if(datEdoFinan.getVtrDoubleDato1()!=0){//SE PRESENTAN CONCEPTOS CUYO IMPORTE SEA DISTINTO DE CERO%>
        <%if(contlineatotal==0||((datEdoFinan.getSize()-j)==3)){//SE IDENTIFICA SI ES EL PRIMER ELEMENTO PARA PRESENTARLO COMO TOTAL%>
          <tr style="font-family: Arial;	font-size: 9px;color: #000000;" >                         
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
          </tr>
        <%}
      }
    contlineatotal++;  //SE INCREMENTA EL CONTADOR DE TOTALES
    contlineagrupo=0;//SE INICIALIZA EL CONTADOR DE DETALLE
    }//FIN SECCION DE TOTALES
    %>
  <%}//FIN DE ACTIVO%>  
  <%       
	j++;
	}
	while(j<datEdoFinan.getSize());%>
  </table>  
  </td>
  </tr>
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
    <td align="center" style="font-family: Arial;	font-size: 12px;color: #000000;"  width="50%"><img src="imagenes/mauricio.JPG" width="206" height="71" ></td>
    <td align="center" style="font-family: Arial;	font-size: 12px;color: #000000;"  width="50%"><img src="imagenes/erika.JPG" width="206" height="71" ></td>    
  </tr>
  <tr  > 
    <td align="center" style="font-family: Arial;	font-size: 9px;color: #000000;" width="50%">	
      Delegado Fiduciario</td>
    <td align="center" style="font-family: Arial;	font-size: 9px;color: #000000;" width="50%">	
      C.P. Contador General</td>
      
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
System.out.println(" Reporte Estado de Posicion Financiera: \nError:"+e);
	%>

	<table width="447" align="center">
  <tr>
    <td height="19">&nbsp;</td>
  </tr>
  <tr> 
    <td width="439" height="19">&nbsp;</td>
  </tr>
  <tr> 
    <td  align="center" height="19" style="font-family: Arial, Helvetica, Verdana;	font-size: 14px;color: #006699;font-weight: bold;">Reporte Estado de Posicion Financiera: Error:<%=e%></td>
  </tr>
  <tr> 
    <td align="center">&nbsp;</td>
  </tr>
 
</table>

<%}%>
</body>
</html>
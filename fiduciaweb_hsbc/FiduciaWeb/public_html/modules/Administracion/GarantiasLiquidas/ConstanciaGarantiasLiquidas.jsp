<!--
/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/
-->

<%@ page import="java.text.*,java.util.*,java.lang.*,java.io.*,java.sql.*"%>
<jsp:useBean id="balance" class="mx.com.inscitech.fiducia.business.nReporte"/>
<jsp:useBean id="valida" class="mx.com.inscitech.fiducia.business.nReporte"/>
<jsp:useBean id="cuentas" class="mx.com.inscitech.fiducia.business.BalanceFormulas"/>
<jsp:useBean id="BD"  class="mx.com.inscitech.fiducia.business.FiduciaBD"/>
<jsp:useBean id="repEdoFinan"  class="mx.com.inscitech.fiducia.business.FiduciaBD"/>
<jsp:useBean id="datEdoFinan" class="mx.com.inscitech.fiducia.business.nReporte"/>
<%@ page import="java.math.BigDecimal, mx.com.inscitech.fiducia.common.util.DecimalFormatUtils"%>
<%

DecimalFormat decFormat = new DecimalFormat("###,###,###,###,###,###,###,##0.00");
String[] bitacora = new String[5];

String fechaCont=BD.getFecha();
String folioBit="";
int regBitacora=0;
String tipoAdmin="";

try
	{
  
    java.util.List consulta = (java.util.List)request.getAttribute("consulta");
    //Variable para obtener tupla por tupla
    java.util.Map registro = null;
    
    //Variables que contendr�n los elementos de cada tupla
    
    BigDecimal cgr_id_folio = new BigDecimal(0);
    BigDecimal cgr_tipo_reporte = new BigDecimal(0);
	  String cgr_fideicomiso = "";
    String cgr_credito = "";
    BigDecimal cgr_num_disposicion = new BigDecimal(0);
    String cgr_reporte = "";
    String cgr_dato1 = "";
    String cgr_dato2 = "";
    String cgr_dato3 = "";
    String cgr_dato4 = "";
    String cgr_dato5 = "";
    String cgr_dato6 = "";
    String cgr_dato7 = "";
    String cgr_dato8 = "";
    String cgr_dato9 = "";
    String cgr_dato10 = "";
    String cgr_dato11 = "";
    String cgr_dato12 = "";
    String cgr_dato13 = "";
    String cgr_dato14 = "";
    String cgr_dato15 = "";
    String cgr_institucion = "";
    String cgr_atencion = "";
    String cgr_puesto_atencion = "";
    String cgr_calle = "";
    String cgr_colonia = "";
    String cgr_delegacion = "";
    String cgr_estado = "";
    String cgr_cp = "";
    String cgr_fecha = "";
    String cgr_nombre_autoriza1 = "";
    String cgr_puesto_autoriza1 = "";
    String cgr_institucion_autoriza1 = "";
    String cgr_firma1 = "";
    String cgr_nombre_autoriza2 = "";
    String cgr_puesto_autoriza2 = "";
    String cgr_institucion_autoriza2 = "";
    String cgr_firma2 = "";
    String cgr_CCP1 = "";
    String cgr_CCP2 = "";

  
String fideicomiso="";
String periodo="";					

String mensaje="";	
String[] meses={" ","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};

//se valida si hay informacion en la tabla
  if(consulta.size()>0)
  {
    registro = (java.util.Map)consulta.get(0);
    
    cgr_id_folio =  (BigDecimal)registro.get("cgrIdFolio");
    cgr_tipo_reporte = (BigDecimal)registro.get("cgrTipoReporte");
	  cgr_fideicomiso = (String)registro.get("cgrFideicomiso");
    cgr_credito = (String)registro.get("cgrCredito");
    cgr_num_disposicion = (BigDecimal)registro.get("cgrNumDisposicion");
    cgr_reporte = (String)registro.get("cgrReporte");
    cgr_dato1 = (String)registro.get("cgrDato1");
    cgr_dato2 = (String)registro.get("cgrDato2");
    cgr_dato3 = (String)registro.get("cgrDato3");
    cgr_dato4 = (String)registro.get("cgrDato4");
    cgr_dato5 = (String)registro.get("cgrDato5");
    cgr_dato6 = (String)registro.get("cgrDato6");
    cgr_dato7 = (String)registro.get("cgrDato7");
    cgr_dato8 = (String)registro.get("cgrDato8");
    cgr_dato9 = (String)registro.get("cgrDato9");
    cgr_dato10 = (String)registro.get("cgrDato10");
    cgr_dato11 = (String)registro.get("cgrDato11");
    cgr_dato12 = (String)registro.get("cgrDato12");
    cgr_dato13 = (String)registro.get("cgrDato12");
    cgr_dato14 = (String)registro.get("cgrDato14");
    cgr_dato15 = (String)registro.get("cgrDato15");
    cgr_institucion = (String)registro.get("cgrInstitucion");
    cgr_atencion = (String)registro.get("cgrAtencion");
    cgr_puesto_atencion = (String)registro.get("cgrPuestoAtencion");
    cgr_calle = (String)registro.get("cgrCalle");
    cgr_colonia = (String)registro.get("cgrColonia");
    cgr_delegacion = (String)registro.get("cgrDelegacion");
    cgr_estado = (String)registro.get("cgrEstado");
    cgr_cp = (String)registro.get("cgrCp");
    cgr_fecha = (String)registro.get("cgrFecha");
    cgr_nombre_autoriza1 = (String)registro.get("cgrNombreAutoriza1");
    cgr_puesto_autoriza1 = (String)registro.get("cgrPuestoAutoriza1");
    cgr_institucion_autoriza1 = (String)registro.get("cgrInstitucionAutoriza1");
    cgr_firma1 = (String)registro.get("cgrFirma1");
    cgr_nombre_autoriza2 = (String)registro.get("cgrNombreAutoriza2");
    cgr_puesto_autoriza2 = (String)registro.get("cgrPuestoAutoriza2");
    cgr_institucion_autoriza2 = (String)registro.get("cgrInstitucionAutoriza2");
    cgr_firma2 = (String)registro.get("cgrFirma2");
    cgr_CCP1 = (String)registro.get("cgrCcp1");
    cgr_CCP2 = (String)registro.get("cgrCcp2");
  }
%>

<html>
<head>
<title>Constancia Garantias</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>
<body <%=request.getParameter("bImprimir")!=null && request.getParameter("bImprimir").trim().equals("1") && balance.hasData()==true ?"onLoad=\"window.print();window.close();\"":" "%>  oncontextmenu="return false" onkeydown="return false"   onmousemove ="return false" onselectstart ="return false" onclick="return false">
<table width="90%" border="0" align="center">
<tr><td><hr width="960" size="1"> </td></tr>
</table>


<table border='0' bordercolor='#000000' bgcolor='#FFFFFF' width="80%" align="center" >
  <tr>
    <td align=CENTER>
      <img src="<%=request.getContextPath()%>/imagenes/logo_bn.jpg" >
    </td>
  <tr>
    <td align=right valign=bottom class="texto"> 
      <B>M�xico, D.F. a <%=cgr_fecha%></B>
    </td>
  </tr>
</table>

<table width="960" border="0" align="center">
<tr><td><hr width="960" size="1"> </td></tr>
</table>



<table border='0' bordercolor='#000000' bgcolor='#FFFFFF' width="75%" align="center" >
		<tr>
    <td class="texto" align="justify">
<P align="center">
  <b>
  Constancia Fiduciaria <%=cgr_id_folio%>
  </b>
</P>

<P>
  
  <b><%=cgr_dato1%></b>
  <br>
  <b>Presente</b>
</P>
  <p align="justify">
    <b><%=cgr_dato1%>, <%=cgr_dato2%></b>, de conformidad con lo establecido en la Cl�usula XX del Contrato de Fideicomiso de Garant�a y Fuente Alterna de Pago n�mero <b><%=cgr_fideicomiso%></b>, celebrado entre 
    <b><%=cgr_dato1%></b> en su car�cter de Fideicomisaria en Primer Lugar, <b><%=cgr_dato3%></b>, como Fideicomitente y <b><%=cgr_dato1%>, <%=cgr_dato2%></b>, como Fiduciaria;  ha recibido instrucci�n por 
    parte del Comit� T�cnico del citado Fideicomiso para emitir constancia fiduciaria a favor de <b><%=cgr_dato1%></b>,  hasta por la cantidad de $<b><%=cgr_dato4%></b> M.N.(<b><%=cgr_dato5%></b> 00/100M.N.), en virtud 
    de que cuenta con los recursos fideicomitidos suficientes para ello.
  </p>
  
  <p align="justify">
    La cantidad se�alada en el p�rrafo anterior cubre y garantiza el <b><%=cgr_dato8%></b>% de la disposici�n de fecha <b><%=cgr_dato9%></b>, hasta por la cantidad de $<b><%=cgr_dato6%></b> M.N.(<b><%=cgr_dato7%></b> 00/100M.N),
    respecto del cr�dito de (av�o o refaccionario) de fecha <b><%=cgr_dato9%></b>, para (x o X) que hasta por la cantidad de $<b><%=cgr_dato4%></b> M.N. (<b><%=cgr_dato5%></b> de pesos 00/100M.N.), <b><%=cgr_dato1%></b> como acreditante 
    otorg� a <b><%=cgr_dato3%></b> como acreditado(a), cantidad  la cual se encontrar� separada dentro del patrimonio del citado Fideicomiso.
  </p>
  
  <p align="justify">
    El t�rmino de la vigencia de esta Fuente Alterna de pago ser� hasta la fecha en que ya no existan cantidades pendientes por pagar derivadas del cr�dito referido en el p�rrafo anterior.
  </p>
  
  <p align="justify">
    Para hacer v�lida y efectiva la presente Constancia Fiduciaria ser� indispensable presentar el original de este documento acompa�ado de la solicitud formal de ejecuci�n por parte de <b><%=cgr_dato1%></b>.  En caso de que el total del cr�dito referido anteriormente sea liquidado oportunamente 
    junto con sus intereses y dem�s accesorios legales conforme al contrato de cr�dito, se le solicita devuelva a esta Fiduciaria el documento original conjuntamente con el documento que se�ale la causa de la  devoluci�n. 
  </p>
  
  <p align="justify">
    La presente Constancia Fiduciaria s�lo podr� hacerse efectiva en una ocasi�n y no es  negociable.
  </p>
  
  <p align="justify">
    �En caso de que el Fideicomitente no se encuentre al corriente en el pago de comisiones fiduciarias, el Fiduciario podr� aplicar el patrimonio fideicomitido al pago de las mismas y el remanente se aplicar�, hasta donde alcance, 
    al pago del cr�dito mencionado en la presente constancia emitida cuando se haya solicitado su aplicaci�n, dejando a salvo los derechos del beneficiario de la misma para hacerlos valer en la v�a y forma que a sus intereses convenga.�
  </p>
    </td>
	</tr>
</table>



<table width="960" border="0"  align="center" class="texto">
  <tr>
    <td align="center">Atentamente</td>
  </tr>
  <tr> 
    <td align="center" style="font-family: Arial;color: #000000;" width="50%">	
      <b><%=cgr_nombre_autoriza1%></b>
    </td>
  </tr>
  <tr> 
    <td align="center" style="font-family: Arial;	color: #000000;"  width="50%">
      <img src="<%=request.getContextPath()%>/<%=cgr_firma1%>" height="100" >
    </td>
  </tr>
  
  <tr  > 
    <td align="center" style="font-family: Arial;color: #000000;" width="50%">	
      <b><%=cgr_puesto_autoriza1%> de <%=cgr_dato1%>, <%=cgr_dato2%></b>
    </td>
    
  </tr>
  <tr>
    <td align="center" style="font-family: Arial;	font-size: 9px;color: #000000;" colspan="2">&nbsp;</td>
  </tr>
</table>


<table width="960" border="0" align="center">
<tr><td><hr width="960" size="1"> </td></tr>
</table>

<table border='0' bordercolor='#000000' bgcolor='#FFFFFF' width="80%" align="center" >
  <tr>
    <td align=center valign=bottom class="texto"> 
      <p align="justify">
      Edificio Corporativo Altavista Blvd. Adolfo L�pez Mateos No. 379  3-A <br>
      Col. San �ngel Inn  Deleg. �lvaro Obreg�n C.P. 01060, M�xico, D.F. Tel. 5595-8382
      </p>
      
    </td>
  </tr>
</table>


<%


}
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
    <td  align="center" height="19" style="font-family: Arial, Helvetica, Verdana;	font-size: 14px;color: #006699;font-weight: bold;">CONSTANCIA: Error:<%=e%></td>
  </tr>
  <tr> 
    <td align="center">&nbsp;</td>
  </tr>
 
</table>

<%}%>
</body>
</html>

<style>

.texto {  
		font-family: calibri,arial, helvetica, sanserif; 
		color: #000000; 
		font-size: 14px;  
		font-weight: normal; 
    }

</style>

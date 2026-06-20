

<%@ page import="java.text.*,java.util.*,java.lang.*,java.io.*,java.sql.*"%>
<jsp:useBean id="balance" class="mx.com.inscitech.fiducia.business.nReporte"/>
<jsp:useBean id="BD"  class="mx.com.inscitech.fiducia.business.FiduciaBD"/>
<%@ page import="java.math.BigDecimal, mx.com.inscitech.fiducia.common.util.DecimalFormatUtils"%>
<%

DecimalFormat decFormat = new DecimalFormat("###,###,###,###,###,###,###,##0.00");
String[] bitacora = new String[5];
String fechaCont=BD.getFecha();
String folioBit="";
int regBitacora=0;
String tipoAdmin="";

%>
<%
 
    java.util.List consulta = (java.util.List)request.getAttribute("consulta");
    //Variable para obtener tupla por tupla
    java.util.Map registro = null;
    
    //Variables que contendr�n los elementos de cada tupla
    
    String meses [] = {"","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    String fec_reporte = request.getParameter("fechaReporte")!=null?Integer.parseInt(request.getParameter("fechaReporte").toString().replaceAll("'","").split("/")[0])+" de "+meses[Integer.parseInt(request.getParameter("fechaReporte").toString().replaceAll("'","").split("/")[1])]+" de "+Integer.parseInt(request.getParameter("fechaReporte").toString().replaceAll("'","").split("/")[2]):"";
    String fec_fin_reporte = request.getParameter("fechaFinReporte")!=null?Integer.parseInt(request.getParameter("fechaFinReporte").toString().replaceAll("'","").split("/")[0])+" de "+meses[Integer.parseInt(request.getParameter("fechaFinReporte").toString().replaceAll("'","").split("/")[1])]+" de "+Integer.parseInt(request.getParameter("fechaFinReporte").toString().replaceAll("'","").split("/")[2]):"";
    int fideicomiso = request.getParameter("fideicomiso")!=null?Integer.parseInt(request.getParameter("fideicomiso").toString()):0;
    BigDecimal bdFideicomiso = new BigDecimal(fideicomiso);
    boolean bFideicomiso = true;
  
    boolean bperiodofechas = (fec_reporte.length()>0&&fec_fin_reporte.length()>0);
  
    boolean bproyecciones = false;
    
    if(request.getParameter("proyecciones")!=null)
    {
      String sproyecciones = request.getParameter("proyecciones").toString();
      if(sproyecciones.equals("true"))        
        bproyecciones = true;
    }
    
    int nFolioOrigen = 0;
    
    if(request.getParameter("folioOrigen")!=null)
    {
      String sFolioOrigen = request.getParameter("folioOrigen").toString();
      nFolioOrigen = Integer.parseInt(sFolioOrigen);
    }
    BigDecimal numFolio = new BigDecimal(0);
    BigDecimal numContrato = new BigDecimal(0);
    BigDecimal numFolioPadre = new BigDecimal(0);
    BigDecimal numSecuencial = new BigDecimal(0);
    
    BigDecimal numSubContrato = new BigDecimal(0);
    String fecha = "";
    String fechaFin = "";
    String descripcion="";
    String periodicidad="";
    BigDecimal eventos= new BigDecimal(0);
    BigDecimal secEevento= new BigDecimal(0);
    String estatus="";

    
    int contador=0;
   
%>

<html>
<head>
<title>REPORTE AGENDA</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>
<body <%=request.getParameter("bImprimir")!=null && request.getParameter("bImprimir").trim().equals("1") && balance.hasData()==true ?"onLoad=\"window.print();window.close();\"":" "%>  oncontextmenu="return false" onkeydown="return false"   onmousemove ="return false" onselectstart ="return false" onclick="return false">
<table width="960" border="0" align="center">
<tr><td><hr width="960" size="1"> </td></tr>
</table>


<table border='0' bordercolor='#000000' bgcolor='#FFFFFF'>
		<tr>		
		<td>
			<table width='860'>
				<tr>
					<td align="CENTER"  style="font-family: Arial;	font-size: 16px;color: #000000;font-weight: bold;"><%=session.getAttribute("empresa_1")%></td>
				</tr>
				<tr>
					<td><div align='center' style="font-family: Verdana, Arial, Helvetica;	font-size: 12px;color: #000000;font-weight: bold;"><%=session.getAttribute("empresa_2")%></div></td>
				</tr>
				<tr>
					<td><div align='center' style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;"></div></td>
				</tr>
				<tr><td height='23'>&nbsp;</td></tr>
        <tr><td align="center" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;">REPORTE AGENDA DE EVENTOS<%=bperiodofechas?"&nbsp;&nbsp;&nbsp&nbsp("+fec_reporte+"&nbsp&nbsp al &nbsp&nbsp"+fec_fin_reporte+")":""%></td></tr>
			</table>
		</td>
		<td>
			<table> 
				<tr>
					<td width='151' height='91' rowspan='7'><div align='center'><img src="<%=request.getContextPath()%>/imagenes/logo_bn.jpg" ></div></td>					
				</tr>
			</table>
		</td>
	</tr>
</table>	
	
          <P>&nbsp;</P>



<table width="960"  border="0" cellpadding="2" cellspacing="0" align="center">
          <tr><td colspan="10" align='center'  style="font-family: Arial;	font-size: 14px;color: #000000;font-weight: bold;">&nbsp;</td></tr>
          <tr>
              <td colspan="10" align="center" style="font-family: Arial;	font-size: 14px;color: #000000;font-weight:bold;"><%=(bproyecciones?"Proyecciones":"Eventos")%></td>   
          </tr>
          <tr>
              <%if(bproyecciones){%><!--Proyecciones-->
              <td align="center" width="100" bgcolor="#999999" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight:bold;">Folio</td>
              <td align="center" width="100" bgcolor="#999999" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight:bold;">Evento</td>
              <td align="center" width="100" bgcolor="#999999" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight:bold;">Secuencial</td>
              <td align="center" width="100" bgcolor="#999999" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight:bold;">No. Fideicomiso</td>
              <td align="center" width="100" bgcolor="#999999" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight:bold;">Fecha</td>
              <td align="center" width="400" bgcolor="#999999" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight:bold;" colspan=2>Descripci�n</td>
              <td align="center" width="100" bgcolor="#999999" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight:bold;">Estatus</td> 
              <%}else{%><!--Eventos-->
              <td align="center" width="100" bgcolor="#999999" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight:bold;">Folio</td>
              <td align="center" width="100" bgcolor="#999999" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight:bold;">No. Fideicomiso</td>
              <td align="center" width="100" bgcolor="#999999" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight:bold;">Fecha Inicio</td>
              <td align="center" width="100" bgcolor="#999999" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight:bold;">Fecha Fin</td>
              <td align="center" width="400" bgcolor="#999999" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight:bold;">Descripci�n</td>
              <td align="center" width="100" bgcolor="#999999" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight:bold;">Periodicidad</td>
              <td align="center" width="100" bgcolor="#999999" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight:bold;">Eventos</td>
              <td align="center" width="100" bgcolor="#999999" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight:bold;">Estatus</td>   
              <%}%>
          </tr>
          <%
            
               for(int i = 0; i < consulta.size(); i++) 
                {  //Para cada registro
                  registro = (java.util.Map)consulta.get(i); 
                 
                  numFolio=(BigDecimal)registro.get("eageIdFolio");
                  numContrato=(BigDecimal)registro.get("eageFideicomiso");
                  
                  bFideicomiso = !bdFideicomiso.equals(new BigDecimal(0))?bdFideicomiso.equals(numContrato):true;// es el fideicomiso seleccionado?
                  
                
                  numFolioPadre = (BigDecimal)registro.get("eageFolioPadre");
                  numSecuencial = (BigDecimal)registro.get("eageIdSubfolio");
                  
                  numSubContrato = (BigDecimal)registro.get("eageSubcuenta");
                  fecha = (String)registro.get("eageFecEvento");
                  fechaFin = (String)registro.get("eageFecFinEvento");
                  
                  descripcion= (String)registro.get("eageDesEvento");
                  periodicidad= (String)registro.get("eagePeriodicidad");
                  eventos= (BigDecimal)registro.get("eageNumEventos");
                  estatus= (String)registro.get("eageCveStatus");
                  
                  contador++;
              %>    
              <%if(bproyecciones&&(numFolioPadre.intValue()!=numFolio.intValue())){
                if((nFolioOrigen!=0&&nFolioOrigen==numFolioPadre.intValue())||nFolioOrigen==0){// se seleccion� folio padre y coincide o no se seleccion� padre
                if(bFideicomiso){// parametro fideicomiso
              %>                                                                    
                  <!--Proyecciones--> 
                  <tr style="font-family: Arial;	font-size: 11px;color: #000000;">       
                    <td align="right" width="100"><%=numFolio%></td>
                    <td align="right" width="100"><%=numFolioPadre%></td>
                    <td align="right" width="100"><%=numSecuencial%></td>
                    <td align="right" width="100" ><%=numContrato%></td>   
                    <td align="center" width="100" ><%=fecha!=null?fecha:""%></td>
                    <td  align="left" width="400" colspan=2 ><%=descripcion!=null?descripcion:""%></td>
                    <td  align="right" width="100"><%=estatus!=null?estatus:""%></td>                   
                  </tr>
                <%}}}else if(!bproyecciones&&numFolioPadre.intValue()==numFolio.intValue()){
                if(bFideicomiso){// parametro fideicomiso%><!--Eventos-->
              <tr style="font-family: Arial;	font-size: 11px;color: #000000;">  
                <td align="right" width="100"><%=numFolio%></td>
                <td align="right" width="100" ><%=numContrato%></td>    
                <td align="center" width="100" ><%=fecha!=null?fecha:""%></td>
                <td align="center" width="100" ><%=fechaFin!=null?fechaFin:""%></td>
                <td  align="left" width="400"><%=descripcion!=null?descripcion:""%></td> 
                <td  align="right" width="100"><%=periodicidad!=null?periodicidad:""%></td> 
                <td  align="right" width="100"><%=eventos%></td>
                <td  align="right" width="100"><%=estatus!=null?estatus:""%></td>                   
              </tr>
                <%}}%>       
                 
          <% } %>
    </table>
         <%
      if(contador==0)
      {
        %>
          <script>alert("No se encontrar�n resultados � no se seleccion� periodo de consulta")</script>
        <%      
      }
      %>
</body>
</html>
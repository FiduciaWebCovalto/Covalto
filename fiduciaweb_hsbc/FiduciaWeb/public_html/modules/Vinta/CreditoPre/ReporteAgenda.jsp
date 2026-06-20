

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
    
    //--- Fechas ----
    //String fReporte = request.getParameter("Nombre")!=null?request.getParameter("Nombre").toString().replaceAll("'","").trim():"XXXX";
    
    
    //------------------
    BigDecimal numCliente = new BigDecimal(0);
    String Nombre = "";
    String TipoPersona = "";
    String Nacionalidad = "";
    String RFC = "";
    String Direccion = "";
    String Tel = "";
    String Sexo = "";
    String numCredito = "";
    String Producto="";
    BigDecimal Monto=new BigDecimal(0);
    String Moneda="";
    BigDecimal sTasa= new BigDecimal(0);
    String Periodicidad="";
    BigDecimal NoPeriodos= new BigDecimal(0);
    BigDecimal NoPeriodo= new BigDecimal(0);
    String Pago="";
    String Tasa= "";
    String Interes="";
    String IVA="";
    String PagoTotal="";
    String Capital="";
    String ValorFinal="";
    String Fecha="";
    
    int contador=0;
   
%>

<!doctype html>
<head>
<title>REPORTE CLIENTE</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<!-- Enable IE9 Standards mode -->
<meta http-equiv="X-UA-Compatible" content="IE=9" >
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
        <tr><td align="center" style="font-family: Arial;	font-size: 12px;color: #000000;font-weight: bold;"> COTIZACION<%=request.getParameter("Folio")!=null?
		"&nbsp;&nbsp;&nbsp("+""+")":session.getAttribute("strFechaContable")!=null?"&nbsp;&nbsp;&nbsp;("+session.getAttribute("strFechaContable")+")":""%></td></tr>
			</table>
		</td>
		<td>
			<table> 
				<tr>
					<td width='151' height='91' rowspan='7'><div align='center'><img height="120px" src="<%=request.getContextPath()%>/imagenes/logo_bn.jpg" ></div></td>					
				</tr>
			</table>
		</td>
	</tr>
</table>	


<table width="960"  border="0" cellpadding="2" cellspacing="0" align="center">
          <tr ><td colspan="10" align='center'  style="font-family: Calibri,Arial;	font-size: 14px;color: #000000;font-weight: bold;">&nbsp;</td></tr>
          <%
           for(int i = 0; i < consulta.size(); i++) 
            {  //Para cada registro
              registro = (java.util.Map)consulta.get(i); 

                numCliente = (BigDecimal)registro.get("idCliente");
                Nombre = (String)registro.get("nombreCliente");
                TipoPersona = (String)registro.get("ctipoPersona");
                Nacionalidad = (String)registro.get("vnacionalidad");
                RFC = (String)registro.get("vrfc");
                Direccion = (String)registro.get("direccion");
                Tel=  (String)registro.get("telefono");
                Sexo=  (String)registro.get("csexo");
                numCredito = (String)registro.get("anumeroCredito");
                Producto=(String)registro.get("descripcionProducto");
                Monto=(BigDecimal)registro.get("imontoCred");
                Moneda=(String)registro.get("imonedaCred");
                sTasa=(BigDecimal)registro.get("itasaIa");
                Periodicidad=(String)registro.get("iperiodicidad");
                NoPeriodos= (BigDecimal)registro.get("inumperiodos");
                NoPeriodo= (BigDecimal)registro.get("iperiod");
                Pago= (String)registro.get("icapital");
                Tasa= (String)registro.get("itasaInteres");
                Interes= (String)registro.get("iintereses");
                IVA= (String)registro.get("iiva");
                PagoTotal= (String)registro.get("icapital");
                Capital= (String)registro.get("ipagoTotal");    
                ValorFinal= (String)registro.get("isaldoCapital");    
                Fecha=(String)registro.get("dfechaFin");
                
                if (i==0){
            %>
              <tr>
                  <td align="left" width="100" bgcolor="#006598"  style="font-family: Calibri,Arial;	font-size: 12px;color: #FFFFFF;font-weight:bold;">&nbsp;Id Cliente</td>
                  <td align="left" width="100" bgcolor="#006598" style="font-family: Calibri,Arial;	font-size: 12px;color: #FFFFFF;font-weight:bold;">Nombre/Razon Social</td>
                  <td align="left" width="100" bgcolor="#006598" style="font-family: Calibri,Arial;	font-size: 12px;color: #FFFFFF;font-weight:bold;">Tipo Persona</td>
                  <td align="left" width="150" bgcolor="#006598" style="font-family: Calibri,Arial;	font-size: 12px;color: #FFFFFF;font-weight:bold;">Nacionalidad</td>
                  <td align="left" width="100" bgcolor="#006598" style="font-family: Calibri,Arial;	font-size: 12px;color: #FFFFFF;font-weight:bold;">RFC</td>
                  <td align="left" width="550" bgcolor="#006598" style="font-family: Calibri,Arial;	font-size: 12px;color: #FFFFFF;font-weight:bold;">Direccion</td>
                  <td align="left" width="300" bgcolor="#006598" style="font-family: Calibri,Arial;	font-size: 12px;color: #FFFFFF;font-weight:bold;">Tel.</td>
                  <td align="left" width="100" bgcolor="#006598" style="font-family: Calibri,Arial;	font-size: 12px;color: #FFFFFF;font-weight:bold;">Sexo</td>   
              </tr>            
          <tr style="font-family: Calibri,Arial;	font-size: 12px;color: #000000;">           
                <td align="left" width="100"><%=numCliente %></td>
                <td align="left" width="100" ><%=Nombre %></td>
                <td align="left" width="100" ><%=TipoPersona%></td>   
                <td align="left" width="150" ><%=Nacionalidad%></td>
                <td align="left" width="100" ><%=RFC%></td>
                <td  align="left" width="550"><%=Direccion%></td> 
                <td  align="left" width="300"><%=Tel%></td> 
                <td  align="left" width="100"><%=Sexo%></td>                                      
          </tr>

          <tr>
              <td align="left" width="100" bgcolor="#006598"  style="font-family: Calibri,Arial;	font-size: 12px;color: #FFFFFF;font-weight:bold;">&nbsp;Id Credito</td>
              <td align="left" width="100" bgcolor="#006598" style="font-family: Calibri,Arial;	font-size: 12px;color: #FFFFFF;font-weight:bold;">Producto</td>
              <td align="left" width="100" bgcolor="#006598" style="font-family: Calibri,Arial;	font-size: 12px;color: #FFFFFF;font-weight:bold;">Monto</td>
              <td align="left" width="150" bgcolor="#006598" style="font-family: Calibri,Arial;	font-size: 12px;color: #FFFFFF;font-weight:bold;">Moneda</td>
              <td align="left" width="100" bgcolor="#006598" style="font-family: Calibri,Arial;	font-size: 12px;color: #FFFFFF;font-weight:bold;">Tasa</td>
              <td align="left" width="550" bgcolor="#006598" style="font-family: Calibri,Arial;	font-size: 12px;color: #FFFFFF;font-weight:bold;">No. Periodos</td>
              <td align="left" width="300" bgcolor="#006598" style="font-family: Calibri,Arial;	font-size: 12px;color: #FFFFFF;font-weight:bold;">Periodicidad</td>
          </tr>

          <tr style="font-family: Calibri,Arial;	font-size: 12px;color: #000000;">           
                <td align="left" width="100"><%=numCredito%></td>
                <td align="left" width="100" ><%=Producto%></td>
                <td align="left" width="100" ><%=DecimalFormatUtils.getFormatedNumber("###,###,###,###,###,###,###,###,###,###,###.00", Monto)%></td>   
                <td align="left" width="150" ><%=Moneda%></td>
                <td align="left" width="100" ><%=sTasa%></td>
                <td  align="left" width="300"><%=NoPeriodos%></td> 
                <td  align="left" width="550"><%=Periodicidad%></td>                                 
          </tr>

          <tr>
              <td align="left" width="100" bgcolor="#006598"  style="font-family: Calibri,Arial;	font-size: 12px;color: #FFFFFF;font-weight:bold;">&nbsp;Periodo</td>
              <td align="left" width="100" bgcolor="#006598" style="font-family: Calibri,Arial;	font-size: 12px;color: #FFFFFF;font-weight:bold;">Fecha</td>
              <td align="left" width="100" bgcolor="#006598" style="font-family: Calibri,Arial;	font-size: 12px;color: #FFFFFF;font-weight:bold;">Pago</td>
              <td align="left" width="150" bgcolor="#006598" style="font-family: Calibri,Arial;	font-size: 12px;color: #FFFFFF;font-weight:bold;">Tasa</td>
              <td align="left" width="100" bgcolor="#006598" style="font-family: Calibri,Arial;	font-size: 12px;color: #FFFFFF;font-weight:bold;">Pago Interes</td>
              <td align="left" width="550" bgcolor="#006598" style="font-family: Calibri,Arial;	font-size: 12px;color: #FFFFFF;font-weight:bold;">IVA</td>
              <td align="left" width="300" bgcolor="#006598" style="font-family: Calibri,Arial;	font-size: 12px;color: #FFFFFF;font-weight:bold;">Pago Total</td>
              <td align="left" width="300" bgcolor="#006598" style="font-family: Calibri,Arial;	font-size: 12px;color: #FFFFFF;font-weight:bold;">Capital Cont. en Pago</td>
              <td align="left" width="300" bgcolor="#006598" style="font-family: Calibri,Arial;	font-size: 12px;color: #FFFFFF;font-weight:bold;">Valor Final</td>
          </tr>            
             
      <% 
            }
            %>

          <tr style="font-family: Calibri,Arial;	font-size: 12px;color: #000000;">           
                <td align="left" width="100"><%=NoPeriodo%></td>
                <td  align="left" width="550"><%=Fecha%></td>                                 
                <td align="left" width="100" ><%=Pago%></td>
                <td align="left" width="100" ><%= Tasa%></td>   
                <td align="left" width="150" ><%=Interes%></td>
                <td align="left" width="100" ><%=IVA%></td>
                <td  align="left" width="300"><%=PagoTotal%></td> 
                <td  align="left" width="550"><%= Capital%></td>                                 
                <td  align="left" width="550"><%= ValorFinal%></td>                                 
          </tr>

            <%
                
                          
      contador++;

      } %>
    </table>
         <%
      if(contador==0)
      {
        %>
          <script>alert("No se encontrar�n resultados")</script>
        <%      
      }
      %>
</body>
</html>
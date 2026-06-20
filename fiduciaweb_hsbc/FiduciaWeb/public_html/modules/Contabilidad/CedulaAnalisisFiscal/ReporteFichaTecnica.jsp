<!--
/*
  @Autor:Inscitech
  @Creado: Febrero 2019
*/
-->

<%@ page import="java.text.*,java.util.*,java.lang.*,java.io.*,java.sql.*"%>
<jsp:useBean id="balance" class="mx.com.inscitech.fiducia.business.nReporte"/>
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

%>
<%
 
    java.util.List consulta = (java.util.List)request.getAttribute("consulta");
    //Variable para obtener tupla por tupla
    java.util.Map registro = null;
    
    //Variables que contendr�n los elementos de cada tupla
    BigDecimal numfideico = new BigDecimal(0);
    BigDecimal numcedula = new BigDecimal(0);
    
    String fechaelab = "";
    String fechaconst = "";
    String promotor = "";
    String administrador = "";
    String patrimoniofecha = "";
    String patrimoniovalor = "";
    String nombre = "";
    String fideicomitentesnombres = "";
    String fideicomitentestipo = "";
    String patrimoniofideicomitido = "";
    String finesfiscales = "";
    String documentosfaltan = "";
    String recomendacion = "";
    String despanombre = "";
    String desparepsat = "";
    String despadomic = "";
    String despatelef = "";
    String despacontac = "";
    String resulrevis = "";
    String docsolic = "";
    int contador=0;


//se valida si hay informacion en la tabla
  if(consulta.size()>0)
  {
    registro = (java.util.Map)consulta.get(0);
    
    numfideico=(BigDecimal)registro.get("fcaNumFideicom");
    numcedula=(BigDecimal)registro.get("fcaNumCedula");
    fechaelab = (String)registro.get("fcaFechaElabora");
    fechaconst = (String)registro.get("fcaFechaConst");
    promotor = (String)registro.get("fcaPromotor");
    administrador = (String)registro.get("fcaAdministrador");
    patrimoniovalor = (String)registro.get("fcaPatrimonio");
    nombre = (String)registro.get("fcaNombre");
    fideicomitentesnombres = (String)registro.get("fcaFidtesNom");
    fideicomitentestipo = (String)registro.get("fcaFidtesTipo");
    patrimoniofideicomitido = (String)registro.get("fcaPatrimonioFide");
    finesfiscales = (String)registro.get("fcaFinesFisc");
    documentosfaltan = (String)registro.get("fcaDocFalt");
    recomendacion = (String)registro.get("fcaRecom");
    despanombre = (String)registro.get("fcaDespNombre");
    desparepsat = (String)registro.get("fcaDespRepsat");
    despadomic = (String)registro.get("fcaDespaDomic");
    despatelef = (String)registro.get("fcaDespTelef");
    despacontac = (String)registro.get("fcaDespContac");
    resulrevis = (String)registro.get("fcaResulRevis");
    docsolic = (String)registro.get("fcaDocSolic");
 }
%>

<html>
    <head>
        <title>FICHA TECNICA ADMINISTRATIVA</title>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
    </head>
    <body <%=request.getParameter("bImprimir")!=null && request.getParameter("bImprimir").trim().equals("1") && balance.hasData()==true ?"onLoad=\"window.print();window.close();\"":" "%>  oncontextmenu="return false" onkeydown="return false"   onmousemove ="return false" onselectstart ="return false" onclick="return false">    
    
        <table border='0' bordercolor='#000000' bgcolor='#FFFFFF'>
        
                        <tr>
                        <td rowspan="5"   align="center"><img src="<%=request.getContextPath()%>/imagenes/logo_bn.jpg"  height="40"></td>
                        <td colspan="5" align="CENTER"  style="font-family: Arial; font-size: 16px;color: #000000;font-weight: bold;">CEDULA DE AN&Aacute;LISIS FISCAL</td>
                      </tr>
        </table>	
        
        <table width="960"  border="0" align="left">
              <tr ><td colspan="10" align='left'  style="font-family: Arial; font-size: 14px;color: #000000;font-weight: bold;">&nbsp;</td></tr>
              <tr>
                  <td align="right" width="120" style="font-family: Arial; font-size: 12px;"><b>&nbsp;</b></td>
                  <td align="right" width="248" style="font-family: Arial; font-size: 12px;"><b>Fecha de elaboraci&oacute;n</b></td>
                  <td align="right" width="154" style="font-family: Arial; font-size: 12px;"><%=fechaelab!=null?fechaelab:""%></td>
              </tr>
              <tr>
                <td align="left" width="120" style="font-family: Arial; font-size: 12px;" height="15"><b>&nbsp;</b></td>
              </tr>
              <tr>
                <td align="left" width="120" style="font-family: Arial; font-size: 12px;" height="15"><b>N&uacute;mero de contrato</b></td>
                  <td align="left" width="248" style="font-family: Arial; font-size: 12px;" height="15"><%=String.valueOf(numfideico)%></td>
                  <td align="left" width="154" style="font-family: Arial; font-size: 12px;" height="15"><b>Fecha de Constituci&oacute;n</b></td>
                  <td align="left" width="424" style="font-family: Arial; font-size: 12px;" height="15"><%=fechaconst!=null?fechaconst:""%></td>
              </tr>
              <tr>
                <td align="left" width="120" style="font-family: Arial; font-size: 12px;"><b>&nbsp;</b></td>
              </tr>
              <tr>
                  <td align="left" width="120" style="font-family: Arial; font-size: 12px;"><b>Promotor</b></td>
                  <td align="left" width="248" style="font-family: Arial; font-size: 12px;"><%=promotor!=null?promotor:""%></td>
              <tr>
                  <td align="left" width="120" style="font-family: Arial; font-size: 12px;"><b>Administrador</b></td>
                  <td align="left" width="248" style="font-family: Arial; font-size: 12px;"><%=administrador!=null?administrador:""%></td>
                  <!-- <td align="left" width="154" style="font-family: Arial; font-size: 12px;"><b>Patrimonio</b></td>
                  <td align="left" width="424" style="font-family: Arial; font-size: 12px;"><%=patrimoniovalor!=null?patrimoniovalor:""%></td> -->
              </tr>
              <tr>
                <td align="left" width="120" style="font-family: Arial; font-size: 12px;"><b>&nbsp;</b></td>
              </tr>
              <tr>
                  <td align="left" width="120" style="font-family: Arial; font-size: 12px;"><b>Nombre</b></td>
                  <td align="left" width="248" style="font-family: Arial; font-size: 12px;"><%=nombre!=null?nombre:""%></td>
              </tr>
              <tr>
                <td align="left" width="120" style="font-family: Arial; font-size: 12px;"><b>&nbsp;</b></td>
              </tr>
              <tr>
                  <td align="left" width="120" style="font-family: Arial; font-size: 12px;"><b>Fideicomitentes</b></td>
              </tr>
              <tr>
                  <td align="left" width="120" style="font-family: Arial; font-size: 12px;"><b>&nbsp;</b></td>
                  <td align="left" width="248" style="font-family: Arial; font-size: 12px;"><b>&nbsp;</b></td>
                  <td align="left" width="154" style="font-family: Arial; font-size: 12px;"><b>Tipo de Fideicomiso</b></td>
              </tr>
              <!-- Listado de Fideicomitentes seguido del tipo -->
              <tr>
                  <td align="left" width="120" style="font-family: Arial; font-size: 12px;">&nbsp;</td>
                  <td align="left" width="248" style="font-family: Arial; font-size: 12px;"><%=fideicomitentesnombres!=null?fideicomitentesnombres:""%></td>
                  <td align="left" width="154" style="font-family: Arial; font-size: 12px;"><%=fideicomitentestipo!=null?fideicomitentestipo:""%></td>
              </tr>
              <!-- <tr>
                  <td align="left" width="120" style="font-family: Arial; font-size: 12px;"><b>&nbsp;</b></td>
                  <td align="left" width="248" style="font-family: Arial; font-size: 12px;">Isaac Attie Laniado</td>
                  <td align="left" width="154" style="font-family: Arial; font-size: 12px;">Arrendamiento</td>
              </tr> -->
        </table>
        
        <table width="960"  border="0" align="left">
            <tr ><td colspan="10" align='left'  style="font-family: Arial; font-size: 14px;color: #000000;font-weight: bold;">&nbsp;</td></tr>
            <tr>
                <td align="left" width="100"><h5>Patrimonio Fideicomitido</h5>
                <p style="width:500px"><%=patrimoniofideicomitido!=null?patrimoniofideicomitido:""%></p></td>
            </tr >
            <tr ><td><p>&nbsp;</p></td></tr >
            
            <tr>
                <td align="left" width="100"><h5>Fines (Efectos Fiscales)</h5>
                <p style="width:500px"><%=finesfiscales!=null?finesfiscales:""%></p></td>
            </tr >
            <tr ><td><p>&nbsp;</p></td></tr >
            
            <tr>
                <td align="left" width="100"><h5>Documentaci&oacute;n faltante Fideicomiso</h5>
                <p style="width:500px"><%=documentosfaltan!=null?documentosfaltan:""%></p></td>
            </tr >
            <tr ><td><p>&nbsp;</p></td></tr >
            
            <tr>
                <td align="left" width="100"><h5>Recomendaci&oacute;n</h5>
                <p style="width:500px"><%=recomendacion!=null?recomendacion:""%></p></td>
            </tr >
            <tr ><td><p>&nbsp;</p></td></tr >
            <tr ><td><p>&nbsp;</p></td></tr >
            <tr ><td><p>&nbsp;</p></td></tr >
        </table>
        <table width="960"  border="0" align="left">
            <tr ><td colspan="10" align='left'  style="font-family: Arial; font-size: 14px;color: #000000;font-weight: bold;">Datos del despacho encargado</td></tr>
            <tr>
                  <td align="left" width="213" style="font-family: Arial; font-size: 12px;"><b>Despacho</b></td>
                  <td align="left" width="738" style="font-family: Arial; font-size: 12px;"><%=despanombre!=null?despanombre:""%></td>
            </tr>
            <tr>
                  <td align="left" width="213" style="font-family: Arial; font-size: 12px;"><b>Representante Legal ante el SAT</b></td>
                  <td align="left" width="738" style="font-family: Arial; font-size: 12px;"><%=desparepsat!=null?desparepsat:""%></td>
            </tr>
            <tr>
                  <td align="left" width="213" style="font-family: Arial; font-size: 12px;"><b>Domicilio</b></td>
                  <td align="left" width="738" style="font-family: Arial; font-size: 12px;"><%=despadomic!=null?despadomic:""%></td>
            </tr>
            <tr>
                  <td align="left" width="213" style="font-family: Arial; font-size: 12px;"><b>Tel&eacute;fono</b></td>
                  <td align="left" width="738" style="font-family: Arial; font-size: 12px;"><%=despatelef!=null?despatelef:""%></td>
            </tr>
            <tr>
                  <td align="left" width="213" style="font-family: Arial; font-size: 12px;"><b>Contacto Adicional</b></td>
                  <td align="left" width="738" style="font-family: Arial; font-size: 12px;"><%=despacontac!=null?despacontac:""%></td>
            </tr>
            <tr ><td><p>&nbsp;</p></td></tr >
            <tr ><td><p>&nbsp;</p></td></tr >
        </table>
        <table width="960"  border="0" align="left">
            <tr ><td colspan="10" align='left'  style="font-family: Arial; font-size: 14px;color: #000000;font-weight: bold;">Resultado a la revisi&oacute;n de las obligacciones fiscales</td></tr>
            <tr>
                <td align="left" width="100"><p style="width:500px"><%=resulrevis!=null?resulrevis:""%></p></td>
            </tr>
            <tr ><td><p>&nbsp;</p></td></tr >
            <tr ><td><p>&nbsp;</p></td></tr >
        </table>
        <table width="960"  border="0" align="left">
            <tr ><td colspan="10" align='left'  style="font-family: Arial; font-size: 14px;color: #000000;font-weight: bold;">Documentaci&oacute;n a solicitar al cliente EJERCICIO 2018.</td></tr>
            <!--Listaddo de documentos a soliciar al cliente-->
            <tr>
                <td align="left" width="100"><%=docsolic!=null?docsolic:""%></td>
            </tr>
            <tr ><td><p>&nbsp;</p></td></tr >
            <tr ><td><p>&nbsp;</p></td></tr >
        </table>  
        
    </body>
</html>
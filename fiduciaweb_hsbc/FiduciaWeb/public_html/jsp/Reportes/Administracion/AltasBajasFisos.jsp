<%@ page contentType="text/html;charset=iso-8859-1"%>
<%@ page import="java.math.BigDecimal, mx.com.inscitech.fiducia.common.util.DecimalFormatUtils"%>
<%
java.util.List consulta = (java.util.List)request.getAttribute("consulta");
%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
    <title>untitled</title>
  </head>
  <body>
  
  <%
    //Variable para obtener tupla por tupla
    java.util.Map registro = null;
    
    //Variables que contendrán los elementos de cada tupla
    String status = "";
    String fecha = "";
    BigDecimal numContrato = new BigDecimal(0);
    String nomContrato = "";
    String sector = "";
    String importe_1 = "";
    String importe_2 = "";
    String importe_3 = "";
    String importe_4 = "";
    String importe_5 = "";
    String importe_6 = "";
    
    //Variables auxiliares para llevara  cabo los cortes
    String Status = "";
    
    //Variables auxiliares para la lógica e impresión
    boolean primerStatus = true;
    String honorarios = "";
    BigDecimal subTotal = new BigDecimal(0);
  %>
  
  <table border="0" cellspacing="0" cellpadding="0">
    <tr><td colspan="8" style="font-weight:bolder" align="center">DIVISION FIDUCIARIA</td></tr>
    <tr><td colspan="8" style="font-weight:bolder" align="center">ALTAS Y BAJAS DE FIDEICOMISOS</td></tr>
    <tr><td colspan="8">&nbsp;</td></tr>
    <tr>
      <td width="100" style="font-weight:bolder" align="center">Fecha de Alta</td>
      <td width="70" style="font-weight:bolder">No. Fiso</td>
      <td width="20" style="font-weight:bolder">&nbsp;</td>
      <td width="500" style="font-weight:bolder">Nombre</td>
      <td width="400" style="font-weight:bolder">Sector</td>
      <td width="200" style="font-weight:bolder">Honorarios</td>
      <td width="60" style="font-weight:bolder">&nbsp;</td>
      <td width="60" style="font-weight:bolder">&nbsp;</td>
    </tr>
    <tr><td colspan="8"><hr/></td></tr>
  <%  
    for(int i = 0; i < consulta.size(); i++) {  //Para cada registro
      registro = (java.util.Map)consulta.get(i);
      //Obtener datos de la BD
      status = (String)registro.get("status");
      fecha = (String)registro.get("fecha");
      numContrato = (BigDecimal)registro.get("ctoNumContrato");
      nomContrato = (String)registro.get("ctoNomContrato");
      sector = (String)registro.get("ctoNomActividad");
      importe_1 = (String)registro.get("importe1");
      importe_2 = (String)registro.get("importe2");
      importe_3 = (String)registro.get("importe3");
      importe_4 = (String)registro.get("importe4");
      importe_5 = (String)registro.get("importe5");
      importe_6 = (String)registro.get("importe6");
      
      if(importe_1 != null) honorarios = importe_1;
      else if(importe_2 != null) honorarios = importe_2;
      else if(importe_3 != null) honorarios = importe_3;
      else if(importe_4 != null) honorarios = importe_4;
      else if(importe_5 != null) honorarios = importe_5;
      else if(importe_6 != null) honorarios = importe_6;
      
      if(!status.equals(Status)) { //Primer corte: STATUS
        i--;
        Status = status;
        
        if(!primerStatus)
        {
  %>
          <tr><td colspan="8">&nbsp;</td></tr>
          <tr>
            <td colspan="6">&nbsp;</td>
            <td width="60" style="font-weight:bolder" align="left">Total: </td>
            <td width="60" style="font-weight:bolder" align="right"><%=(subTotal.intValue()==0)?"0":DecimalFormatUtils.getFormatedNumber("###,###", subTotal)%></td>
          </tr>
          <tr><td colspan="8"><hr/></td></tr>
  <%
          subTotal = new BigDecimal(0);
        }
        else
          primerStatus = false;
  %>
        <tr>
          <tr><td colspan="8" style="font-weight:bolder"><%=status%></td></tr>
        </tr>
  <%
      }//Fin de Primer corte
      else
      {
        //Hacer la suma del sub-total
        subTotal = new BigDecimal(subTotal.intValue()+1);
  %>
        <tr>
          <td width="100"><%=fecha%></td>
          <td width="70" align="right"><%=numContrato%></td>
          <td width="20">&nbsp</td>
          <td width="500"><%=nomContrato%></td>
          <td width="400"><%=sector%></td>
          <td width="200"><%=honorarios%></td>
          <td width="60">&nbsp;</td>
          <td width="60">&nbsp;</td>
        </tr>
  <%
      }
      
      //Si se trata del último resgistro, presentar la información del último sub-total
      if(i==(consulta.size()-1))
      {
  %>
        <tr><td colspan="8">&nbsp;</td></tr>
        <tr>
          <td colspan="6">&nbsp;</td>
          <td width="60" style="font-weight:bolder">Total: </td>
          <td width="60" style="font-weight:bolder" align="right"><%=(subTotal.intValue()==0)?"0":DecimalFormatUtils.getFormatedNumber("###,###", subTotal)%></td>
        </tr>
  <%
      }
    }//Fin de las iteraciones para los registros
  %>
  </table>
  
  </body>
</html>
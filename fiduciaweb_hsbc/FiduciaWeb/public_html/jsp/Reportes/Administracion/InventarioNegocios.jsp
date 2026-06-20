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
    String nomActividad = "";
    BigDecimal numContrato = new BigDecimal(0);
    BigDecimal numProducto = new BigDecimal(0);
    String nomContrato = "";
    String regNalInvEx = "";
    String fechaApertura = "";
    BigDecimal patrimonio = new BigDecimal(0);
    
    //Variables auxiliares para llevara  cabo los cortes
    String NomActividad = "";
    
    //Variables auxiliares para la lógica e impresión
    boolean primerActividad = true;
    BigDecimal subNumActividades = new BigDecimal(0);
    BigDecimal subPatrimonio = new BigDecimal(0);
    BigDecimal totNumActividades = new BigDecimal(0);
    BigDecimal totPatrimonio = new BigDecimal(0);
  %>
  
  <table border="0" cellspacing="0" cellpadding="0">
    <tr><td colspan="5" style="font-weight:bolder" align="center">DIVISION FIDUCIARIA</td></tr>
    <tr><td colspan="5" style="font-weight:bolder" align="center">INVENTARIO DE NEGOCIOS</td></tr>
    <tr><td colspan="5">&nbsp;</td></tr>
    <tr>
      <td width="70" style="font-weight:bolder">NUM</td>
      <td width="20" style="font-weight:bolder">&nbsp;</td>
      <td width="700" style="font-weight:bolder">NEGOCIO</td>
      <td width="150" style="font-weight:bolder" align="center">FECHA DE CONSTITUCIÓN</td>
      <td width="150" style="font-weight:bolder" align="right">PATRIMONIO</td>
    </tr>
    <tr><td colspan="5"><hr/></td></tr>
  <%  
    for(int i = 0; i < consulta.size(); i++) {  //Para cada registro
      registro = (java.util.Map)consulta.get(i);
      //Obtener datos de la BD
      nomActividad = (String)registro.get("repNomActividad");
      numContrato = (BigDecimal)registro.get("ctoNumContrato");
      numProducto = (BigDecimal)registro.get("prlNumProducto");
      nomContrato = (String)registro.get("repNomContrato");
      regNalInvEx = (String)registro.get("repRegNalInvEx");
      fechaApertura = (String)registro.get("fechaApertura");
      patrimonio = (BigDecimal)registro.get("patrimonio");
      
      if(!nomActividad.equals(NomActividad)) { //Primer corte: REP_NOM_ACTIVIDAD
        i--;
        NomActividad = nomActividad;
        
        if(!primerActividad)
        {
  %>
          <tr><td colspan="5">&nbsp;</td></tr>
          <tr>
            <td colspan="3" style="font-weight:bolder" align="left">TOTAL DE NEGOCIOS POR ACTIVIDAD: </td>
            <td style="font-weight:bolder" align="center"><%=(subNumActividades.intValue()==0)?"0":DecimalFormatUtils.getFormatedNumber("###,###", subNumActividades)%></td>
            <td style="font-weight:bolder" align="right"><%=(subPatrimonio.intValue()==0)?"0.00":DecimalFormatUtils.getFormatedNumber("###,###.00", subPatrimonio)%></td>
          </tr>
          <tr><td colspan="5"><hr/></td></tr>
  <%
          totNumActividades = new BigDecimal(totNumActividades.intValue()+subNumActividades.intValue());
          totPatrimonio = new BigDecimal(totPatrimonio.doubleValue()+subPatrimonio.doubleValue());
          
          subNumActividades = new BigDecimal(0);
          subPatrimonio = new BigDecimal(0);
        }
        else
          primerActividad = false;
        
  %>
        <tr>
          <tr><td colspan="5" style="font-weight:bolder" align="center"><%=nomActividad%></td></tr>
        </tr>
  <%
      } //Fin de Primer Corte
      else
      {
        //Hacer la suma de los sub-totales
        subNumActividades = new BigDecimal(subNumActividades.intValue()+1);
        subPatrimonio = new BigDecimal(subPatrimonio.doubleValue()+patrimonio.doubleValue());
  %>
        <tr>
          <td width="60" align="right"><%=numContrato%></td>
          <td width="20" align="right">&nbsp;</td>
          <td width="700"><%=(nomContrato==null)?"&nbsp;":nomContrato.toString()%></td>
          <td width="150" align="center"><%=(fechaApertura==null)?"&nbsp;":fechaApertura.toString()%></td>
          <td width="150" align="right"><%=(patrimonio.intValue()==0)?"0.00":DecimalFormatUtils.getFormatedNumber("###,###.00", patrimonio)%></td>
        </tr>
  <%
      }
      
      //Si se trata del último resgistro, presentar la información de las sumatorias de los cortes (TOTAL)
      if(i==(consulta.size()-1))
      {
        totNumActividades = new BigDecimal(totNumActividades.intValue()+subNumActividades.intValue());
        totPatrimonio = new BigDecimal(totPatrimonio.doubleValue()+subPatrimonio.doubleValue());
  %>
        <tr><td colspan="5">&nbsp;</td></tr>
        <tr>
          <td colspan="3" style="font-weight:bolder" align="left">TOTAL DE NEGOCIOS POR ACTIVIDAD: </td>
          <td style="font-weight:bolder" align="center"><%=(subNumActividades.intValue()==0)?"0":DecimalFormatUtils.getFormatedNumber("###,###", subNumActividades)%></td>
          <td style="font-weight:bolder" align="right"><%=(subPatrimonio.intValue()==0)?"0.00":DecimalFormatUtils.getFormatedNumber("###,###.00", subPatrimonio)%></td>
        </tr>
        <tr><td colspan="5"><hr/></td></tr>
        <tr><td colspan="5">&nbsp;</td></tr>
        <tr>
          <td colspan="3" style="font-weight:bolder" align="left">TOTAL DE NEGOCIOS GENERAL: </td>
          <td style="font-weight:bolder" align="center"><%=(totNumActividades.intValue()==0)?"0":DecimalFormatUtils.getFormatedNumber("###,###", totNumActividades)%></td>
          <td style="font-weight:bolder" align="right"><%=(totPatrimonio.intValue()==0)?"0.00":DecimalFormatUtils.getFormatedNumber("###,###.00", totPatrimonio)%></td>
        </tr>
  <%
      }
    } //Fin de las iteraciones para los registros
  %>
  </table>
  
  </body>
</html>
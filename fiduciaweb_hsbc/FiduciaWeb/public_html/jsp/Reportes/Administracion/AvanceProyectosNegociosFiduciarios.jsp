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
    String fecha = "";
    BigDecimal tipo = new BigDecimal(0);
    BigDecimal secuencial = new BigDecimal(0);
    String fechaInicio = "";
    BigDecimal anteproyecto = new BigDecimal(0);
    String nombre = "";
    String tipoNegocio = "";
    BigDecimal patrimonio = new BigDecimal(0);
    BigDecimal honoAceptacion = new BigDecimal(0);
    BigDecimal honoManejo = new BigDecimal(0);
    
    //Variables auxiliares para llevara  cabo los cortes
    BigDecimal tipoEnCurso = new BigDecimal(0);
    
    //Variables auxiliares para la lógica e impresión
    boolean primerTipo = true;
    
    BigDecimal subPatrimonio = new BigDecimal(0);
    BigDecimal subAceptacion = new BigDecimal(0);
    BigDecimal subManejo = new BigDecimal(0);
    BigDecimal subTotal = new BigDecimal(0);
    
    BigDecimal totPatrimonio = new BigDecimal(0);
    BigDecimal totAceptacion = new BigDecimal(0);
    BigDecimal totManejo = new BigDecimal(0);
    BigDecimal Total = new BigDecimal(0);
    
    //Obteniendo la Fecha para el encabezado
    if(consulta.size() > 0) {
      registro = (java.util.Map)consulta.get(0);
      fecha = (String)registro.get("apfFecha");
    }
  %>
  
  <table border="0" cellspacing="0" cellpadding="0">
    <tr><td colspan="7" style="font-weight:bolder" align="center">PROTEGO&nbsp;CASA&nbsp;DE&nbsp;BOLSA S.A. de C.V.</td></tr>
    <tr><td colspan="7" style="font-weight:bolder" align="center">DIVISION FIDUCIARIA</td></tr>
    <tr><td colspan="7" style="font-weight:bolder" align="center">Avance de proyectos de negocios fiduciarios</td></tr>
    <tr>
      <td colspan="3">&nbsp;</td>
      <td style="font-weight:bolder" align="right">Fecha: </td>
      <td style="font-weight:bolder"><%=fecha%></td>
      <td colspan="2">&nbsp;</td>
    </tr>
    <tr><td colspan="7">&nbsp;</td></tr>
    <tr>
      <td colspan="4">&nbsp;</td>
      <td colspan="3" style="font-weight:bolder" align="center">Honoraros por:</td>
    </tr>
    <tr>
      <td width="150" style="font-weight:bolder">Fecha Inicio</td>
      <td width="100" style="font-weight:bolder">Proyecto</td>
      <td width="400" style="font-weight:bolder">Nombre</td>
      <td width="400" style="font-weight:bolder">Tipo de Negocio</td>
      <td width="150" style="font-weight:bolder" align="right">Patrimonio</td>
      <td width="150" style="font-weight:bolder" align="right">Aceptación</td>
      <td width="150" style="font-weight:bolder" align="right">Manejo</td>
    </tr>
    <tr><td colspan="7"><hr/></td></tr>
  
  <%  
    for(int i = 0; i < consulta.size(); i++) {  //Para cada registro
      registro = (java.util.Map)consulta.get(i);
      //Obtener datos de la BD
      fecha = (String)registro.get("apfFecha");
      tipo = (BigDecimal)registro.get("apfTipo");
      secuencial = (BigDecimal)registro.get("apfSecuencial");
      fechaInicio = (String)registro.get("apfFechaInicio");
      anteproyecto = (BigDecimal)registro.get("apfAnteproyecto");
      nombre = (String)registro.get("apfNombre");
      tipoNegocio = (String)registro.get("apfTipoNegocio");
      patrimonio = (BigDecimal)registro.get("apfPatrimonio");
      honoAceptacion = (BigDecimal)registro.get("apfHonoAceptacion");
      honoManejo = (BigDecimal)registro.get("apfHonoManejo");
      
      if(tipo.intValue() != tipoEnCurso.intValue()) { //Primer corte: APF_TIPO
        i--;
        tipoEnCurso = new BigDecimal(tipo.intValue());
        
        if(!primerTipo)
        {
  %>
          <tr><td colspan="7">&nbsp;</td></tr>
          <tr>
            <td colspan="3">&nbsp;</td>
            <td style="font-weight:bolder">Total:   <%=subTotal%></td>
            <td style="font-weight:bolder" align="right"><%=(subPatrimonio.intValue()==0)?"0.00":DecimalFormatUtils.getFormatedNumber("###,###.00", subPatrimonio)%></td>
            <td style="font-weight:bolder" align="right"><%=(subAceptacion.intValue()==0)?"0.00":DecimalFormatUtils.getFormatedNumber("###,###.00", subAceptacion)%></td>
            <td style="font-weight:bolder" align="right"><%=(subManejo.intValue()==0)?"0.00":DecimalFormatUtils.getFormatedNumber("###,###.00", subManejo)%></td>
          </tr>
          <tr><td colspan="7"><hr/></td></tr>
  <%
          //Hacer la suma de los totales
          Total = new BigDecimal(Total.intValue()+subTotal.intValue());
          totPatrimonio = new BigDecimal(totPatrimonio.doubleValue()+subPatrimonio.doubleValue());
          totAceptacion = new BigDecimal(totAceptacion.doubleValue()+subAceptacion.doubleValue());
          totManejo = new BigDecimal(totManejo.doubleValue()+subManejo.doubleValue());
          
          subTotal = new BigDecimal(0);
          subPatrimonio = new BigDecimal(0);
          subAceptacion = new BigDecimal(0);
          subManejo = new BigDecimal(0);
        }
        else
          primerTipo = false;
  %>
        <tr>
          <tr><td colspan="7" style="font-weight:bolder"><%=tipo%></td></tr>
        </tr>
  <%
      }//Fin de primer corte
      else
      {
        //Hacer la suma de los sub-totales
        subTotal = new BigDecimal(subTotal.intValue()+1);
        subPatrimonio = new BigDecimal(subPatrimonio.doubleValue()+patrimonio.doubleValue());
        subAceptacion = new BigDecimal(subAceptacion.doubleValue()+honoAceptacion.doubleValue());
        subManejo = new BigDecimal(subManejo.doubleValue()+honoManejo.doubleValue());
  %>
        <tr>
          <td><%=fechaInicio%></td>
          <td><%=anteproyecto%></td>
          <td><%=nombre%></td>
          <td><%=tipoNegocio%></td>
          <td align="right"><%=patrimonio%></td>
          <td align="right"><%=honoAceptacion%></td>
          <td align="right"><%=honoManejo%></td>
        </tr>
  <%
      }
      
      //Si se trata del último resgistro, presentar la información de las sumatorias de los cortes (TOTAL)
      if(i==(consulta.size()-1))
      {
        //Hacer la suma de los totales
        Total = new BigDecimal(Total.intValue()+subTotal.intValue());
        totPatrimonio = new BigDecimal(totPatrimonio.doubleValue()+subPatrimonio.doubleValue());
        totAceptacion = new BigDecimal(totAceptacion.doubleValue()+subAceptacion.doubleValue());
        totManejo = new BigDecimal(totManejo.doubleValue()+subManejo.doubleValue());
  %>
        <tr><td colspan="7">&nbsp;</td></tr>
        <tr>
          <td colspan="3">&nbsp;</td>
          <td style="font-weight:bolder">Total:   <%=subTotal%></td>
          <td style="font-weight:bolder" align="right"><%=(subPatrimonio.intValue()==0)?"0.00":DecimalFormatUtils.getFormatedNumber("###,###.00", subPatrimonio)%></td>
          <td style="font-weight:bolder" align="right"><%=(subAceptacion.intValue()==0)?"0.00":DecimalFormatUtils.getFormatedNumber("###,###.00", subAceptacion)%></td>
          <td style="font-weight:bolder" align="right"><%=(subManejo.intValue()==0)?"0.00":DecimalFormatUtils.getFormatedNumber("###,###.00", subManejo)%></td>
        </tr>
        <tr><td colspan="7"><hr/></td></tr>
        <tr><td colspan="7">&nbsp;</td></tr>
        <tr>
          <td colspan="3">&nbsp;</td>
          <td style="font-weight:bolder">Totales:   <%=Total%></td>
          <td style="font-weight:bolder" align="right"><%=(totPatrimonio.intValue()==0)?"0.00":DecimalFormatUtils.getFormatedNumber("###,###.00", totPatrimonio)%></td>
          <td style="font-weight:bolder" align="right"><%=(totAceptacion.intValue()==0)?"0.00":DecimalFormatUtils.getFormatedNumber("###,###.00", totAceptacion)%></td>
          <td style="font-weight:bolder" align="right"><%=(totManejo.intValue()==0)?"0.00":DecimalFormatUtils.getFormatedNumber("###,###.00", totManejo)%></td>
        </tr>
  <%
      }
    }//Fin de las iteraciones para los registros
  %>
  </table>
  
  </body>
</html>
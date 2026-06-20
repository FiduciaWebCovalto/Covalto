<%@ page contentType="text/html;"%>
<br/>
<input type="hidden" id="paramUsuario" name="paramUsuario" value="<%=session.getAttribute("userid").toString()%>"/>
<input type="hidden" id="paramOrder" name="paramOrder" value="s" />
<input type="hidden" id="paramCtaCheques" name="paramCtaCheques" tipo="Numero" maxlength="10" size="10"/>
<!--input type="hidden" id="urlReporte" name="urlR eporte" value="<%=request.getContextPath()%>/imprimirReporte.do?"/-->
<input type="hidden" id="refSP" name="refSP" value="repEdoCuentaPeriodico"/><!-- HABILITAR CUANDO YA SE VAYA A EJECUTAR LA FUNCIÓN-->
<input type="hidden" id="refQry" name="refQry" value="getDatEdoCuentaPeriodico"/>
<input type="hidden" id="paramsendToJSP" name="paramsendToJSP" value="true"/>
<input type="hidden" id="paramtakeParameters" name="paramtakeParameters" value="true"/>
<input type="hidden" id="paramurlReporte" name="paramurlReporte" value="/jsp/Reportes/Contabilidad/EstadoCuenta.jsp"/>
<table border="0" cellpadding="1" class="texto" cellspacing="5" width="60%" align="center">
  <tr>
    <td>Fideicomiso:</td>
    <td>
      <input type="text" id="paramFiso" name="paramFiso" tipo="Numero" maxlength="10" size="10" onchange="valorFide(this.value)">
    </td>
  </tr>  
  <tr>
    <td>Fecha Inicial:</td>
    <td>
      <input type="text" id="paramFechaInicial" name="paramFechaInicial" tipo="Fecha" maxlength="10" size="10"/>
    </td>
  </tr>
  <tr>
    <td>Fecha Final:</td>
    <td>
      <input type="text" id="paramFechaFinal" name="paramFechaFinal" tipo="Fecha" maxlength="10" size="10"/>
    </td>
  </tr>

</table>

<br/></br>

<hr/>
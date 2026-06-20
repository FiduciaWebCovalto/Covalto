<!--ReportePosicion.jsp-->
<%@ page contentType="text/html;"%>

<br/>
<input type="hidden" id="paramUsuario" name="paramUsuario" value="<%=session.getAttribute("userid").toString()%>"/>
<input type="hidden" id="refSP" name="refSP" value="repRepEdoCuenta"/>
<input type="hidden" id="refQry" name="refQry" value="getRepEdoCuenta"/>
<input type="hidden" id="paramsendToJSP" name="paramsendToJSP" value="true"/>
<input type="hidden" id="paramurlReporte" name="paramurlReporte" value="/jsp/Reportes/Contabilidad/EdoCuenta.jsp"/>
<!--
<input type="hidden" id="refSP" name="refSP" value="repRepContratosInv"/>
<input type="hidden" id="refQry" name="refQry" value="getRepContratosInv"/>
<input type="hidden" id="paramsendToJSP" name="paramsendToJSP" value="true"/>
<input type="hidden" id="paramurlReporte" name="paramurlReporte" value="/jsp/Reportes/Contabilidad/ContratosInversion.jsp"/>
-->
<table border="0" cellpadding="1" class="texto" cellspacing="5" width="100%">
  <tr>
    <td>Fideicomiso:</td>
    <td>
      <input type="text" id="paramFideicomiso" name="paramFiso" required tipo="Numero"  maxlength="10" size="10"> <!-- onblur="cargaComboCto(this)" -->
    </td>
  </tr>  
  <tr>
    <td>Fecha:</td>
    <td>
      <input type="text" id="paramFechaUnica" name="paramFechaUnica" tipo="Fecha" maxlength="10" size="10"/>
      <div style="visibility:hidden;"><a href="#" id="linkEdoCtaPDF" target="_new">Download</a></div>
    </td>
  </tr>
<!--   <tr>   
    <td>Contrato Inversi&oacute;n</td>
    <td>
      <select size="1" name="cmbContratoInversion"  id="cmbContratoInversion" ref="conDatConInv2" keyValue="cprEntidadFin" theValue="numContratoNomIntermed" fun="loadComboElement" param="cmbContratoInversionParam" onchange="document.getElementById('paramSubcuenta').value=this.options[this.selectedIndex].text.split('/')[0]"/> 
    </td>
    <td>
      Ignorar contrato<input type="checkbox" name="chkTodosContratos"  id="chkTodosContratos" value="0" onclick="if(GI('paramSinContrato').value==0){GI('cmbContratoInversion').disabled=true;GI('cmbContratoInversion').selectedIndex=0;GI('paramSinContrato').value=1;}else{GI('cmbContratoInversion').disabled=false;GI('paramSinContrato').value=0;}"/>    
    </td>
  </tr>
<input type="hidden" id="paramSubcuenta" name="paramSubcuenta" value=""/>
<input type="hidden" id="paramSinContrato" name="paramSinContrato" value="0"/> -->

</table>

<br/></br>

<hr/>

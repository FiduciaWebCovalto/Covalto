<%@ page contentType="text/html;charset=windows-1252"%>

<br/>

<input type="hidden" id="paramAno" name="paramAno" value="0"/>
<input type="hidden" id="paramMes" name="paramMes" value="0"/>
<input type="hidden" id="paramDia" name="paramDia" value="0"/>

<input type="hidden" id="refSP" name="refSP" value="repMatrizRiesgo"/>
<input type="hidden" id="refQry" name="refQry" value="getMatrizRiesgo"/>
<input type="hidden" id="paramsendToJSP" name="paramsendToJSP" value="true"/>
<input type="hidden" id="paramurlReporte" name="paramurlReporte" value="/jsp/Reportes/Formalizacion/MatrizRiesgo.jsp"/>

<table border="0" cellpadding="1" class="texto" cellspacing="5" width="100%">
   
  <tr>
    <td>Fideicomiso:</td>
    <td>
      <input type="text" id="paramFiso" name="paramFiso" maxlength="10" size="10">
    </td>
  </tr> 
  
  <tr>
    <td>RFC Persona:</td>
    <td>
      <input type="text" id="paramRFC" name="paramRFC"   size="10">
    </td>
  </tr>  
  
</table>

<br/></br>

<hr/>
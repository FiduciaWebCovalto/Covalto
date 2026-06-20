<%@ page contentType="text/html;charset=windows-1252"%>

<br/>


<input type="hidden" id="refSP" name="refSP" value="repMatrizRiesgo"/>
<input type="hidden" id="refQry" name="refQry" value="getMatrizRiesgo"/>
<input type="hidden" id="paramsendToJSP" name="paramsendToJSP" value="true"/>
<input type="hidden" id="paramurlReporte" name="paramurlReporte" value="/jsp/Reportes/Formalizacion/MatrizRiesgo.jsp" />
<a id="linkReporte" href="#" style="visibility:hidden" target="_new">Archivo</a> 
<a id="linkReporteNew" href="#" style="visibility:hidden" target="_new">Archivo</a>
<table border="0" cellpadding="1" class="texto" cellspacing="5" width="100%">
  
  <tr>
    <td>Num Persona:</td>
    <td>
      <input type="text" id="paramNumPersona" name="paramNumPersona"   size="10">
    </td>
  </tr>   
  
  <tr>
    <td>Nombre Cliente:</td>
    <td>
      <input type="text" id="paramRFC" name="paramRFC"   size="50">
    </td>
  </tr>  
  
</table>

<br/></br>

<hr/>
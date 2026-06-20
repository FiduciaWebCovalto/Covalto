<form name="frmDatosInterfase" id="frmDatosInterfase">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo" style="padding-top:25px;">Poliza Contable</td>
    </tr>
    <tr>
      <td height="100%"><br/></td>
    </tr>
    <tr>
      <td height="100%">
        <table width="100%" align="center" class="texto">
          <tr>
            <td><br/></td>
          </tr>
          <tr>
            <td>
                <div style="text-align:center;">
                    Fecha Valor:&nbsp;<input type="text" name="txtFechaValor" id="txtFechaValor" size="10" ref="conFecCon" fun="loadTxtElementX" theValue="fecha" next="asignaFechaValor" maxlength="10" tipo="Fecha" required message="La Fecha Valor es un campo obligatorio"/>
                </div>
            </td>
          </tr>
          <tr>
            <td><br/><br/></td>
          </tr>
          <tr>
            <td style="text-align:center;">
                <input type="button" value="Aceptar" name="cmdAceptar" value="Aceptar" class="btn btn-primary" onclick="ejecutaStoreInterfase();"/>
                <input type="button" value="Limpiar" name="cmdLimpiar" id="cmdLimpiar" class="btn btn-primary" onclick="onButtonClickPestania('Interfases.InterfaseSalomon3.PrincipalInterfaseSalomon','');"/>            
            </td>
          </tr>
        </table>
      </td>
    </tr>
  </table>
   
</form>
<a id="linkReporte" href="#" style="visibility:hidden">Archivo</a> 
<a id="linkReporteNew" href="#" style="visibility:hidden" target="_new">Archivo</a> 
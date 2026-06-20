<form name="frmDatosMatriz" id="frmDatosMatriz" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Cat&aacute;logo de Matriz de Cuentas</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="90%" class="texto" align="center">
          <tr>
            <td width="30%">&nbsp;</td>
            <td>Cuenta</td>
            <td>Scta</td>
            <td>Sscta</td>
            <td>Ssscta</td>
            <td>Sssscta</td>
            <td>Ssssscta</td>
            <td width="30%">&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td>
              <input type="text" name="paramNumCta" id="paramNumCta" size="4" maxlength="4" tipo="Num"/>
            </td>
            <td>
              <input type="text" name="paramNumScta" id="paramNumScta" size="4" maxlength="2" tipo="Num"/>
            </td>
            <td>
              <input type="text" name="paramNumSscta" id="paramNumSscta" size="4" tipo="Num"/>
            </td>
            <td>
              <input type="text" name="paramNumSsscta" id="paramNumSsscta" size="4" maxlength="2" tipo="Num"/>
            </td>
            <td>
              <input type="text" name="paramNumSsssscta" id="paramNumSssscta" size="4" maxlength="4" tipo="Num"/>
            </td>
            <td>
              <input type="text" name="paramNumSsssscta" id="paramNumSsssscta" size="4" tipo="Num"/>
            </td>
            <td width="30%">&nbsp;</td>
          </tr>
          <tr>
            <td width="15%">&nbsp;</td>
            <td width="10%" nowrap>Origen</td>
            <td colspan="5">
              <select size="1" name="paramOrigen" id="paramOrigen">
                  <option value="">Seleccione</option>
                  <option value="8">Banco</option>
                  <option value="1">Casa de Bolsa</option>
                </select>
            </td>
            <td>&nbsp;</td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="8" align="center">
              <input type="text" name="paramorder" id="paramorder" size="2" value="s" style="visibility:hidden"/>
            </td>
          </tr>
          <tr>
            <td colspan="8" align="center">&nbsp;
              <input type="button" value="Aceptar" name="cmdAceptar" class="btn btn-primary" ref="conPriMatCue" fun="loadTableElement" tabla="tblRegPriMatCue" onclick="consultarCount(this, frmDatosMatriz, false);"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <input type="button" value="Limpiar" name="cmdLimpiar" class="btn btn-warning" onclick="limpiar(frmDatosMatriz);"/>
            </td>
          </tr>
          <tr>
            <td colspan="8">&nbsp;</td>
          </tr>
          <tr>
            <td height="100%" align="center" colspan="8">
              <input type="button" value="   Alta  " name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoMatrizCuentas(1);"/>
              <input type="button" value="Modificar" name="cmdModificar" class="btn btn-success" onclick="cargaMantenimientoMatrizCuentas(2);"/>
              <input type="button" value="   Baja  " name="cmdBaja" class="btn btn-danger" onclick="cargaMantenimientoMatrizCuentas(3);"/>
              <input type="button" value="Consultar" name="cmdConsultar" class="btn btn-info" onclick="cargaMantenimientoMatrizCuentas(4);"/>
            </td>
          </tr>
          <tr>
            <td colspan="8">&nbsp;</td>
          </tr>

          
            <tr  align="center">
              <td colspan="6">
                <div style="height:800px; overflow:auto; position:relative; vertical-align:top; width:100%">
                  <table id="tblRegPriMatCue" border="0" cellspacing="0" class="texto" style="width:100%;"   width=800px  cellpadding="0" dataInfo="arrTblMatCueDat" keys="ctamTipoNegocio,ctamClasifProd,ctamCtaClien,ctamSctaClien,ctamSsctaClien,ctamSssctaClien,ctamSsssctaClien,ctamSssssctaClien" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                  <thead>
                  <tr align="left" class="cabeceras">
                  <td>&nbsp;</td>
                  <td>Origen</td>
                  <td>Cuenta</td>
                  <td>Scta</td>
                  <td>Sscta</td>
                  <td>Ssscta</td>
                  <td>Sssscta</td>
                  <td>Nombre</td>
                  <td>Cuenta</td>
                  <td>Scta</td>
                  <td>Sscta</td>
                  <td>Ssscta</td>
                  <td>Sssscta</td>                 
                  </tr>                  
                  </thead>
                   <tbody></tbody>
                  </table>
                </div>
              </td>
            </tr>             
          
        </table>
      </td>
    </tr>
  </table>
</form>

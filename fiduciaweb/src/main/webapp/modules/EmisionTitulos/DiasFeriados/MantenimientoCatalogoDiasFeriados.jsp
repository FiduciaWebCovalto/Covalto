<form name="frmDatos" id="frmDatos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table width="100%">
    <tr>
      <td align="center" class="titulo">Mantenimiento a Cat&aacute;logo de D&iacute;as Feriados</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table align="center" class="texto" width="100%">
          <tr valign="middle">
            <td width="35%">&nbsp;</td>
            <td nowrap width="15%">Pa&iacute;s</td>
            <td colspan="2">
              <select size="1" name="edfaIdPais" id="edfaIdPais" ref="conNumPaiNomPai" fun="loadComboElement" keyValue="paiNumPais" theValue="paiNomPais" next="edfaRegla" required message="El Pa�s es un campo obligatorio"/>
            </td>
            <td width="30%">&nbsp;</td>
          </tr>
          <tr>
            <td width="35%">&nbsp;</td>
            <td nowrap width="15%">D&iacute;a</td>
            <td colspan="2">
              <input type="text" name="edfaIdDia" id="edfaIdDia" size="2" maxlength="2" tipo="Num" required message="El D�a es un campo obligatorio"/>
            </td>
            <td width="30%">&nbsp;</td>
          </tr>
          <tr>
            <td width="35%">&nbsp;</td>
            <td nowrap width="15%">Mes</td>
            <td colspan="2">
              <input type="text" name="edfaIdMes" id="edfaIdMes" size="2" maxlength="2" tipo="Num" required message="El Mes es un campo obligatorio"/>
            </td>
            <td width="30%">&nbsp;</td>
          </tr>
          <tr>
            <td width="35%">&nbsp;</td>
            <td nowrap width="15%">Descripci&oacute;n</td>
            <td colspan="2">
              <input type="text" name="edfaDescFecha" id="edfaDescFecha" size="50" maxlength="50" required message="La Descripci�n es un campo obligatorio"/>
            </td>
            <td width="30%">&nbsp;</td>
          </tr>
          <tr>
            <td width="35%">&nbsp;</td>
            <td nowrap width="15%">&nbsp;</td>
            <td>
              <input type="radio" class="radio" name="rdDia" id="edfaTipoDia" value2="0" onclick="estableceTipoDia('edfaTipoDia',this);" required message="El Tipo de D�a es un campo obligatorio"/>&nbsp;D&iacute;a Fijo
            </td>
            <td>
              <input type="radio" class="radio" name="rdDia" id="rdDiaVariable" value="1" onclick="estableceTipoDia('edfaTipoDia',this);"/>&nbsp;D&iacute;a Variable
            </td>
            <td width="30%">&nbsp;</td>
          </tr>
          <tr>
            <td width="35%">&nbsp;</td>
            <td nowrap width="15%">Regla</td>
            <td colspan="2">
              <select size="1" name="edfaRegla" id="edfaRegla" ref="conETDatInd" fun="loadComboElement" keyValue="eindDescripcion" theValue="eindDescripcion" param="cmbReglaParam" next="edfaSemana" message="La Regla es un campo obligatorio"/>
            </td>
            <td width="30%">&nbsp;</td>
          </tr>
          <tr>
            <td width="35%">&nbsp;</td>
            <td nowrap width="15%">Semana</td>
            <td colspan="2">
              <select size="1" name="edfaSemana" id="edfaSemana" ref="conETDatInd" fun="loadComboElement" keyValue="eindIdSubindice" theValue="eindDescripcion" param="cmbSemanaParam" next="edfaDiaSemana" message="La Semana es un campo obligatorio"/>
            </td>
            <td width="30%">&nbsp;</td>
          </tr>
          <tr>
            <td width="35%">&nbsp;</td>
            <td nowrap width="15%">D&iacute;a de la Semana</td>
            <td colspan="2">
              <select size="1" name="edfaDiaSemana" id="edfaDiaSemana" ref="conETDatInd" fun="loadComboElement" keyValue="eindIdSubindice" theValue="eindDescripcion" param="cmbDiaSemanaParam" next="ediaStDiasfera" message="El D�a de la Semana es un campo obligatorio"/>
            </td>
            <td width="30%">&nbsp;</td>
          </tr>
          <tr>
            <td width="35%">&nbsp;</td>
            <td nowrap width="15%">Status</td>
            <td colspan="2">
              <select size="1" name="edfaStDiasfera" id="ediaStDiasfera" ref="conETDatInd" fun="loadComboElement" keyValue="eindDescripcion" theValue="eindDescripcion" param="cmbStatusParam" next="asignaValues2ObjHTML" required message="El Status es un campo obligatorio"/>
            </td>
            <td width="30%">&nbsp;</td>
          </tr>
        </table>
      </td>
    </tr>
    <tr>
      <td width="60%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%" align="center">
        <input type="BUTTON" value="Aceptar " name="cmdAceptar" value="Aceptar" class="btn btn-primary" onclick="ejecutaOperacionDiaFeriado();" style="visibility:hidden"/>
        <input type="BUTTON" value="Cancelar" name="cmdCancelar" id="cmdCancelar" class="btn btn-danger" onclick="onButtonClick('EmisionTitulos.DiasFeriados.PrincipalCatalogoDiasFeriados','')" style="visibility:hidden"/>
      </td>
    </tr>
  </table>
</form>

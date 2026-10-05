<form name="frmDatos" id="frmDatos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>

  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Movimientos</td>
    </tr>
          <tr valign="middle">
            <td align="left" width="29%">&nbsp;</td>
            <td align="right" width="3%">Agenda</td><!--F_CONINSNOMON_VALOR-->
            <td align="left" width="44%">
              <input type="radio" name="chkReporte" id="chkReporte11" class="radio" value="11" onclick="setReporte(this)"/>
            </td>
            <td align="left" width="24%">&nbsp;</td>
          </tr>

          <tr valign="middle">
            <td align="left" width="29%">&nbsp;</td>
            <td align="right" width="3%">Cuentas Bancarias</td><!--F_BIENESGAR-->
            <td align="left" width="44%">
              <input type="radio" name="chkReporte" id="chkReporte12" class="radio" value="12" onclick="setReporte(this)"/>
            </td>
            <td align="left" width="24%">&nbsp;</td>
          </tr>

          <tr valign="middle">
            <td align="left" width="29%">&nbsp;</td>
            <td align="right" width="3%">Honorarios</td><!--F_PERFIL_TRANSAC-->
            <td align="left" width="44%">
              <input type="radio" name="chkReporte" id="chkReporte13" class="radio" value="13" onclick="setReporte(this)"/>
            </td>
            <td align="left" width="24%">&nbsp;</td>
          </tr>

          <tr valign="middle">
            <td align="left" width="29%">&nbsp;</td>
            <td align="right" width="3%">Asientos</td><!--F_CONDATO-->
            <td align="left" w  idth="44%">
              <input type="radio" name="chkReporte" id="chkReporte14" class="radio" value="14" onclick="setReporte(this)"/>
            </td>
            <td align="left" width="24%">&nbsp;</td>
          </tr>

          <tr valign="middle">
            <td align="left" width="29%">&nbsp;</td>
            <td align="right" width="3%">Saldos</td><!--CONTRATO-->
            <td align="left" width="44%">
              <input type="radio" name="chkReporte" id="chkReporte15" class="radio" value="15" onclick="setReporte(this)"/>
            </td>
            <td align="left" width="24%">&nbsp;</td>
          </tr>

          <tr valign="middle">
            <td align="left" width="29%">&nbsp;</td>
            <td align="right" width="3%">Saldos Historicos</td><!--FINALIDA-->
            <td align="left" width="44%">
              <input type="radio" name="chkReporte" id="chkReporte16" class="radio" value="16" onclick="setReporte(this)"/>
            </td>
            <td align="left" width="24%">&nbsp;</td>
          </tr>

          <tr valign="middle">
            <td align="left" width="29%">&nbsp;</td>
            <td align="right" width="3%">Instrucciones</td><!--F_ACTOS_LEGALES-->
            <td align="left" width="44%">
              <input type="radio" name="chkReporte" id="chkReporte17" class="radio" value="17" onclick="setReporte(this)"/>
            </td>
            <td align="left" width="24%">&nbsp;</td>
          </tr>

          <tr valign="middle">
            <td align="left" width="29%">&nbsp;</td>
            <td align="right" width="3%">Depositos</td><!--FINALIDA-->
            <td align="left" width="44%">
              <input type="radio" name="chkReporte" id="chkReporte18" class="radio" value="18" onclick="setReporte(this)"/>
            </td>
            <td align="left" width="24%">&nbsp;</td>
          </tr>

          <tr valign="middle">
            <td align="left" width="29%">&nbsp;</td>
            <td align="right" width="3%">Retiros</td><!--F_CONTRATO_LEGAL-->
            <td align="left" width="44%">
              <input type="radio" name="chkReporte" id="chkReporte19" class="radio" value="19" onclick="setReporte(this)"/>
            </td>
            <td align="left" width="24%">&nbsp;</td>
          </tr>


  <tr valign="middle">
            <td align="left" width="29%">&nbsp;</td>
            <td align="right" width="3%">Inversiones</td><!--F_CONTRATO_LEGAL-->
            <td align="left" width="44%">
              <input type="radio" name="chkReporte" id="chkReporte20" class="radio" value="20" onclick="setReporte(this)"/>
            </td>
            <td align="left" width="24%">&nbsp;</td>
          </tr>

  <tr valign="middle">
            <td align="left" width="29%">&nbsp;</td>
            <td align="right" width="3%">Operaciones no monetarias</td><!--F_CONTRATO_LEGAL-->
            <td align="left" width="44%">
              <input type="radio" name="chkReporte" id="chkReporte21" class="radio" value="21" onclick="setReporte(this)"/>
            </td>
            <td align="left" width="24%">&nbsp;</td>
          </tr>

  <tr valign="middle">
            <td align="left" width="29%">&nbsp;</td>
            <td align="right" width="3%">Bienes</td><!--F_CONTRATO_LEGAL-->
            <td align="left" width="44%">
              <input type="radio" name="chkReporte" id="chkReporte22" class="radio" value="22" onclick="setReporte(this)"/>
            </td>
            <td align="left" width="24%">&nbsp;</td>
          </tr>


  <tr valign="middle">
            <td align="left" width="29%">&nbsp;</td>
            <td align="right" width="3%">Perfil Transaccional</td><!--F_CONTRATO_LEGAL-->
            <td align="left" width="44%">
              <input type="radio" name="chkReporte" id="chkReporte23" class="radio" value="23" onclick="setReporte(this)"/>
            </td>
            <td align="left" width="24%">&nbsp;</td>
          </tr>

  <tr valign="middle">
            <td align="left" width="29%">&nbsp;</td>
            <td align="right" width="3%">Datos ADministrativos  KYC</td><!--F_CONTRATO_LEGAL-->
            <td align="left" width="44%">
              <input type="radio" name="chkReporte" id="chkReporte24" class="radio" value="24" onclick="setReporte(this)"/>
            </td>
            <td align="left" width="24%">&nbsp;</td>
          </tr>

  <tr valign="middle">
            <td align="left" width="29%">&nbsp;</td>
            <td align="right" width="3%">Fideicomisos</td><!--F_CONTRATO_LEGAL-->
            <td align="left" width="44%">
              <input type="radio" name="chkReporte" id="chkReporte25" class="radio" value="25" onclick="setReporte(this)"/>
            </td>
            <td align="left" width="24%">&nbsp;</td>
          </tr>

  <tr valign="middle">
            <td align="left" width="29%">&nbsp;</td>
            <td align="right" width="3%">Fines</td><!--F_CONTRATO_LEGAL-->
            <td align="left" width="44%">
              <input type="radio" name="chkReporte" id="chkReporte26" class="radio" value="26" onclick="setReporte(this)"/>
            </td>
            <td align="left" width="24%">&nbsp;</td>
          </tr>


  <tr valign="middle">
            <td align="left" width="29%">&nbsp;</td>
            <td align="right" width="3%">Actos Legales </td><!--F_CONTRATO_LEGAL-->
            <td align="left" width="44%">
              <input type="radio" name="chkReporte" id="chkReporte27" class="radio" value="27" onclick="setReporte(this)"/>
            </td>
            <td align="left" width="24%">&nbsp;</td>
          </tr>

  <tr valign="middle">
            <td align="left" width="29%">&nbsp;</td>
            <td align="right" width="3%">Inversion</td><!--F_CONTRATO_LEGAL-->
            <td align="left" width="44%">
              <input type="radio" name="chkReporte" id="chkReporte28" class="radio" value="28" onclick="setReporte(this)"/>
            </td>
            <td align="left" width="24%">&nbsp;</td>
          </tr>

  <tr valign="middle">
            <td align="left" width="29%">&nbsp;</td>
            <td align="right" width="3%">Fiscal</td><!--F_CONTRATO_LEGAL-->
            <td align="left" width="44%">
              <input type="radio" name="chkReporte" id="chkReporte29" class="radio" value="29" onclick="setReporte(this)"/>
            </td>
            <td align="left" width="24%">&nbsp;</td>
          </tr>


          <tr>
            <td align="center" colspan="9">&nbsp;
              <input type="button" value="Descargar" name="cmdDownload" id="cmdDownload" class="btn btn-info"onclick="doDownload();" />
            </td>
          </tr>
  </table>
</form>

<div style="visibility:hidden;">
	<form id="frmExport" method="POST" action="DatosFiduciarios.xls" target="iframeDownload">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
		<input type="hidden" id="jsonExport" name="json" value="" />
		<input type="hidden" name="headers"/>
	</form>
	<iframe name="iframeDownload" src=""></iframe>
</div>
<form name="frmDatosObligacionesFiscales" id="frmDatosObligacionesFiscales" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Documentos Fiscales</td>
    </tr>
    <tr>
      <td height="24">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table width="100%" class="texto">
          <tr>
            <td width="20%">&nbsp;</td>
            <td>Fideicomiso</td>
            <td>
              <input type="text" name="crfNumFideicom" id="crfNumFideicom" size="10" maxlength="10" tipo="Num" ref="conPriDocFis2" fun="loadTableElement" tabla="tblRegPriOblFid" required message="El Fideicomiso es un campo obligatorio" onblur="consultaNombreFideicomiso('nomFideicomiso',this);"/>
            </td>
            <td><div id="nomFideicomiso" class="textoNegrita" ref="conNomFid" fun="asignaValor2DivFideicomiso" param="divNombreFideicomisoParam">&nbsp;</div></td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td align="center" colspan="5">
              <input type="text" name="paramorder" id="paramorder" size="2" value="s" ref="conPriDocFid" fun="loadTableElement" tabla="tblRegPriOblFis" style="visibility:hidden"/>
              <input type="text" name="paramFideicomiso" id="paramFideicomiso" size="5" style="visibility:hidden"/>
            </td>
          </tr>
          <tr>
            <td colspan="5" class="subtitulo" align="center">Cat&aacute;logo de Documentos</td>
          </tr>
          <tr>
            <td colspan="5" class="subtitulo" align="center">
              <table cellspacing="0" cellpadding="0" border="0" width="350">
                <tr class="cabeceras">
                  <td width="23">&nbsp;</td>
                  <td width="150">ID Documento</td>
                  <td width="167">Nombre</td>
                </tr>
              </table>
              <div style="height:150px; overflow:auto; position:relative; vertical-align:top;">
                <table border="0" cellpadding="0" cellspacing="0" class="texto" id="tblRegPriOblFis" dataInfo="arrTblOblFisDat" keys="fdocIdDocumento,fdocNombre" fun="clickTabla2" radioWidth="23px">
                </table>
              </div>
            </td>
          </tr>
          <tr>
            <td colspan="5" class="subtitulo" align="center">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="5" class="subtitulo" align="center">
              <input type="button" value="Agregar" name="cmdAgregar" id="cmdAgregar" onclick="agregarObligacion();"/>
              <input type="button" value=" Quitar " name="cmdQuitar" id="cmdQuitar" onclick="quitarObligacion();"/>
            </td>
          </tr>
          <tr>
            <td colspan="5" class="subtitulo" align="center">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="5" class="subtitulo" align="center">Documentos por Fideicomiso</td>
          </tr>
          <tr>
            <td colspan="5" class="subtitulo" align="center">
              <table cellspacing="0" cellpadding="0" border="0" width="350">
                <tr class="cabeceras">
                  <td width="23">&nbsp;</td>
                  <td width="150">ID Documento</td>
                  <td width="167">Nombre</td>
                </tr>
              </table>
              <div style="height:150px; overflow:auto; position:relative; vertical-align:top;">
                <table border="0" cellpadding="0" cellspacing="0" class="texto" id="tblRegPriOblFid" dataInfo="arrTblOblFisDat" keys="crfNumFideicom,obfCveObligfisc,oblTipoImp" fun="clickTabla3" radioWidth="23px">
                </table>
              </div>
            </td>
          </tr>
        </table>
      </td>
    </tr>
    <tr>
      <td width="60%" height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%" align="center">
        <input type="button" value="Regresar " name="cmdRegresar" class="btn btn-primary" onclick="cargaMantenimientoCedulaFiscal(4);"/>
      </td>
    </tr>
  </table>
</form>

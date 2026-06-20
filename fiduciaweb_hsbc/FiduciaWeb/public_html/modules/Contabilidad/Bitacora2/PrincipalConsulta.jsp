<form name="frmPrincipal" id="frmPrincipal" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Bitacora</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table class="texto" border="0">
          <tr>
            <td width="45%">&nbsp;</td>
            <td width="5%">Fideicomiso</td>
            <td width="5%">
              <input type="text" name="paramFideicomiso" id="paramFideicomiso" size="10" maxlength="10" tipo="Num"/>
            </td>
            <td width="45%">&nbsp;</td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td>Folio</td>
            <td>
              <input type="text" name="paramFolio" id="paramFolio" size="10" maxlength="10" tipo="Num"/>
            </td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td>Concepto</td>
            <td>
              <input type="text" name="paramConcepto" id="paramConcepto" size="50" maxlength="50" />
            </td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td>Fecha Inicio</td>
            <td>
              <input type="text" name="paramFechaInicial" id="paramFechaInicial" size="10" ref="conFecCon" fun="loadTxtElementX" theValue="fecha" maxlength="10" tipo="Fecha" requireds message="Este es un campo obligatorio"/>
            </td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td>Fecha Fin</td>
            <td>
              <input type="text" name="paramFechaFinal" id="paramFechaFinal" size="10" ref="conFecCon" fun="loadTxtElementX" theValue="fecha" maxlength="10" tipo="Fecha"  requireds message="Este es un campo obligatorio"/>
            </td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td colspan="2" align="center">
              <input type="text" name="paramOrder" id="paramOrder" size="2" value="S" style="visibility:hidden"/>
            </td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td align="center" colspan="4">&nbsp;
              <input type="button" value="Aceptar" name="cmdAceptar" value="Aceptar" class="btn btn-primary" ref="qry.contabilidad.bitacora" fun="loadTableElement" tabla="tblResultados" onclick="consultarBitacora(this, frmPrincipal, false);" style="padding-right:10px;"/>
              <input type="button" value="Limpiar" name="cmdLimpiar" id="cmdLimpiar" class="btn btn-primary" onclick="limpiar(frmPrincipal);"/>
              <input type="button" value="Descargar" name="cmdDownload" id="cmdDownload" class="btn btn-info"onclick="doDownload(frmPrincipal);" />
            </td>
          </tr>
          <tr>
            <td colspan="4" class="subtitulo" align="center">&nbsp;</td>
          </tr>
          <tr align="center">
            <td colspan="4">
              <table cellspacing="0" cellpadding="0" border="0">
                <tr class="cabeceras">
                  <td nowrap width="23">&nbsp;</td>
                  <td width="50" nowrap>Folio</td>
                  <td width="80" nowrap>Fecha Contable</td>
                  <td width="80" nowrap>Transaccion</td>
                  <td width="100" nowrap>Origen</td>
                  <td width="80" nowrap>Estatus</td>
                  <td width="80" nowrap>Fecha</td>
                  <td width="80" nowrap>Aprobador</td>
                  <td width="80" nowrap>Fecha</td>
                  <td width="100" nowrap>Fideicomiso</td>
                  <td width="20" nowrap>Cuenta Mayor</td>
                  <td width="20" nowrap>S1</td>
                  <td width="20" nowrap>S2</td>
                  <td width="20" nowrap>S3</td>
                  <td width="20" nowrap>S4</td>
                  <td width="20" nowrap>S5</td>
                  <td width="20" nowrap>Aux 2</td>
                  <td width="20" nowrap>Aux 3</td>
                  <td width="100" nowrap>Descripcion Contable</td>
                  <td width="80" nowrap>Monto</td>
                  <td width="80" nowrap>Cargo</td>
                  <td width="80" nowrap>Abono</td>
                  <td width="100" nowrap>Descripcion Conciliacion</td>
                </tr>
              </table>
              <div style="height:250px; overflow:auto; position:relative; vertical-align:top;">
                <table border="0" cellpadding="0" cellspacing="0" class="texto" id="tblResultados" dataInfo="arrTblDat" keys="folio" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de busqueda">
                </table>
              </div>              
            </td>
          </tr>
        </table>
      </td>
      <td colspan="4" align="center" class="subtitulo" width="30%">
        <a id="ligaArchivo" href="#" style="visibility:hidden">Archivo</a>
      </td>
    </tr>
  </table>
</form>
<div style="visibility:hidden;">
    <form id="frmExport" method="POST" action="DatosFiduciarios.xls" target="iframeDownload">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
        <input type="hidden" id="jsonExport" name="json" value="" />
        <input type="hidden" name="headers" value="Folio,Fecha Contable,Transaccion,Origen,Estatus,Fecha,Fideicomiso,Cuenta Mayor,S1,S2,S3,S4,S5,Auxiliar 2,Auxiliar 3,Descripcion Contable,Monto,Cargo,Abono,Descripcion Conciliacion" />
        <input type="hidden" name="fields" value="folio,fechaContable,transaccion,origen,estatus,fecha1,fideicomiso,ctam,s1,s2,s3,s4,s5,aux2,aux3,descripcionContable,monto,cargo,abono,descripcionConciliacion" />
    </form>
    <iframe name="iframeDownload" src=""></iframe>
</div>


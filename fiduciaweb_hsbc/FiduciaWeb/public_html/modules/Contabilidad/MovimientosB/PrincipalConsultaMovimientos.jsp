<form name="frmDatos" id="frmDatos" onsubmit="">
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
        <table class="texto">
          <tr>
            <td width="30%">&nbsp;</td>
            <td>Fideicomiso</td>
            <td>Subcontrato</td>
            <td>Folio</td>
            <td>Concepto</td>
            <td>Fecha Inicio</td>
            <td>Fecha Fin</td>
            <td width="30%">&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td>
              <input type="text" name="paramFideicomiso" id="paramFideicomiso" size="10" maxlength="10" tipo="Num"/>
            </td>
            <td>
              <input type="text" name="paramSubcontrato" id="paramSubcontrato" size="10" maxlength="10" tipo="Num"/>
            </td>
            <td>
              <input type="text" name="paramFolio" id="paramFolio" size="10" maxlength="10" tipo="Num" onblur="porFolio(this);"/>
            </td>
            <td>
              <input type="text" name="paramConcepto" id="paramConcepto" size="10" maxlength="10" tipo="Num" />
            </td>
            <td>
              <input type="text" name="paramFecha1" id="paramFecha1" size="10" ref="conFecCon" fun="loadTxtElementX" theValue="fecha" next="asignaFechaValor" maxlength="10" tipo="Fecha" required message="La Fecha de Inicio es un campo obligatorio"/>
            </td>
            <td>
              <input type="text" name="paramFecha2" id="paramFecha2" size="10" ref="conFecCon" fun="loadTxtElementX" theValue="fecha" next="asignaFechaValor" maxlength="10" tipo="Fecha"  required message="La Fecha Fin es un campo obligatorio"/>
            </td>
            <td width="30%">&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td>
              <input type="checkbox" name="paramchkStatus" id="paramchkStatus" onclick="cambiaStatus(this,paramStatus);" class="check"/>&nbsp;Cancelados
            </td>
            <td>&nbsp;
              </td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td width="30%">&nbsp;</td>
          </tr>
          <tr>
            <td width="30%">&nbsp;</td>
            <td>Descripcion</td>
            <td colspan="6">
              <input type="text" name="paramDescripcion" id="paramDescripcion" size="50" onblur="convertirMayusculas(this)"/>
            </td>
           <td>&nbsp;
              </td> 
          </tr>
          <tr>
            <td colspan="9" align="center">
              <input type="text" name="paramorder" id="paramorder" size="2" value="s" style="visibility:hidden"/>
              <input type="text" name="paramStatus" id="paramStatus" size="2" value="ACTIVO" style="visibility:hidden"/>
            </td>
          </tr>
          <tr>
            <td align="center" colspan="9">&nbsp;
              <input type="button" value="Aceptar" name="cmdAceptar" value="Aceptar" class="btn btn-primary" ref="conPriMov" fun="loadTableElement" tabla="tblRegPriMov" onclick="if(fvCat.checkForm())consultarSaveParameters(this, frmDatos, false);" style="padding-right:10px;"/>
              <input type="button" value="Limpiar" name="cmdLimpiar" id="cmdLimpiar" class="btn btn-primary" onclick="limpiar(frmDatos);"/>
              <input type="button" value="Descargar" name="cmdDownload" id="cmdDownload" class="btn btn-info"onclick="doDownload();" />
            </td>
          </tr>
          <tr>
            <td colspan="9" class="subtitulo" align="center">&nbsp;</td>
          </tr>
          <tr>
            <td height="100%" align="center" colspan="9">
              <input type="button" value="Consultar" name="cmdConsultar" id="cmdConsultar" class="btn btn-primary" onclick="cargaPrincipalConsultarConsultaMovimientos();"/>
              <!--input type="button" value="Movtos. Dia Fiso" name="cmdGuardar" id="cmdGuardar" class="btn btn-primary" onclick="recuperaTAS();"/-->
            </td>
          </tr>
          <tr>
            <td colspan="9" class="subtitulo" align="center">&nbsp;</td>
          </tr>
          <tr align="center">
            <td colspan="9">
              <table cellspacing="0" cellpadding="0" border="0">
                <tr class="cabeceras">
                  <td nowrap width="23">&nbsp;</td>
                  <td width="30" nowrap>D&iacute;a</td>
                  <td width="32" nowrap>Mes</td>
                  <td width="32" nowrap>A&ntilde;o</td>
                  <td width="83" nowrap>Fideicomiso</td>
                  <td width="83" nowrap>Subcontrato</td>
                  <td width="70" nowrap>Folio</td>
                  <td width="70" nowrap>Concepto.</td>
                  <td width="300" nowrap>Descripci&oacute;n</td>
                  <td width="150" nowrap>Importe</td>
                  <td width="44" nowrap>E/S</td>
                </tr>
              </table>
              <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:917px;">
                <table border="0" cellpadding="0" cellspacing="0" class="texto" id="tblRegPriMov" dataInfo="arrTblMovDat" keys="movAnoMovto,movMesMovto,movDiaMovto,movNumContrato,movSubContrato,movFolioOpera,movNumModulo,movNumTransac" fun="clickTabla" radioWidth="23" NoRecordsMsg="No existen Registros para estos criterios de busqueda">
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
            <input type="hidden" name="headers" value="Fecha, SubContrato, Descripcion , Importe,  Concepto,Fideicomiso,Folio, Status" />
        </form>
        <iframe name="iframeDownload" src=""></iframe>
    </div>


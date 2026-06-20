<FORM name="frmDatos" id="frmDatos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table width="100%" style="height:auto;">
    <tr>
      <td align="center" class="titulo">Clonacion KYC</td>
    </tr>
    <tr>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
        <table align="center" class="texto" width="90%">

          <tr>
            <td width="25%">No. Prospecto</td>
            <td width="20%"><input type="text" name="paramFideicomiso" id="paramFideicomiso" tipo="Num" size="10" maxlength="10" required="required"/></td>
            <td>&nbsp;
            </td>
            <td width="25%">&nbsp;
            </td>
          </tr>        

          <tr>
            <td width="25%">RFC</td>
            <td width="20%">
            <input type="text" name="paramRFC" id="paramRFC" size="15" maxlength="15"/></td>
            <!--td>Tipo de Parte/Rol
            </td>
            <td width="25%">
                <select id="paramParte" name="paramParte" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="formsLoaded" param="clavesComboTipoParte" required="required" onchange="loadTipoPersona(this, GI('paramTipoPersona'))">
                </select>
            </td-->
          </tr>        

          <tr>
            <td width="25%">Nombre o Raz&oacute;n Social</td>
            <td width="20%">
            <input type="text" name="paramNombre" id="paramNombre" size="50" maxlength="50"/></td>
            <!--td>Tipo de Persona
            </td>
            <td width="20%">
                <select id="paramTipoPersona" name="paramTipoPersona" ref="claves" fun="filterTipoPersona" keyValue="cveDescClave" theValue="cveDescClave" next="hideWaitLayer" param="clavesComboTipoPersona" required="required">
                </select>
            </td-->
          </tr>          
          <tr>
            <td colspan="4" align="center">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4" align="center">
              <table cellpadding="0" cellspacing="0">
                <tr>                  
                   <td width="112"  align="center" valign="middle"> <input type="button" value="Aceptar" name="cmdAceptar" id="cmdAceptar" class="btn btn-primary" ref="qryClonacionKYCProyecto" fun="loadTableElement" tabla="tblReg" onclick="consultaClonacionKyc(this)"/> </td>
                   <td width="112"  align="center" valign="middle"> <input type="button" value="Limpiar" name="cmdLimpiar" class="btn btn-warning" onclick="limpiar(frmDatos);"/> </td>
                </tr>
              </table>
            </td>
          </tr>
          <tr>
            <td colspan="4" align="center">
              <input type="text" name="paramorder" id="paramorder" size="2" value="s" style="visibility:hidden;"/>
              <input type="text" name="paramIdPersona" id="paramIdPersona" size="2" value="" style="visibility:hidden;"/>
            </td>
          </tr>
          <tr>
            <td colspan="4" align="center">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4" align="center" class="subtitulo">Original</td>
          </tr>
          <tr align="center">
            <td colspan="4">
              <div style="height:150px; overflow:auto; position:relative; vertical-align:top; width:100%px;">
                  <table border="0" cellpadding="0" cellspacing="0" class="texto" id="tblReg" dataInfo="arrTblDat" keys="proyecto,numTipoParte,numPersona" fun="clickTabla" radioWidth="23px" NoRecordsMsg="No existen Registros para estos criterios de búsqueda">
                    <thead>
                        <tr class="cabeceras" align="left">
                          <td align="center" width="23" nowrap>&nbsp;</td>
                          <td width="100" nowrap>Prospecto</td>
                          <td width="50" nowrap>Csc</td>
                          <td width="50" nowrap>CIS</td>
                          <td width="100" nowrap>RFC</td>
                          <td width="150" nowrap>Nombre</td>
                          <td width="150" nowrap>Tipo de Parte</td>
                          <td width="150" nowrap>Tipo de Persona</td>
                          <td width="150" nowrap>Estatus</td>
                        </tr>
                    </thead>
                    <tbody></tbody>
                  </table>
              </div>
            </td>
          </tr>
          <tr>
            <td colspan="4" align="center">&nbsp;</td>
          </tr>
          <tr>
            <td colspan="4" align="center">
              <input type="button" value="Clonar" name="cmbClonar" id="cmbClonar" class="btn btn-primary" onclick="generaClonacionKyc()"/>&nbsp;&nbsp;&nbsp;
            </td>
          </tr>
        </table>
      </td>
    </tr>
  </table>
</FORM>

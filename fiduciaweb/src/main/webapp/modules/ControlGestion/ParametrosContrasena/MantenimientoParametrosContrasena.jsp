<FORM name="frmDatosMantenimiento" id="frmDatosMantenimiento" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td rowspan="7" width="10%" height="100%">&nbsp;</td>
        <td height="100%">&nbsp;</td>
        <td rowspan="7" width="10%" height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td align="center" height="100%" class="titulo">Mantenimiento Configuraci&oacute;n Passwords</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table class="texto">
            <tr>
              <tr>
              <td width="7">&nbsp;</td>
              <td nowrap width="164">Id</td>
              <td nowrap width="96">
                <input type="text" name="empNumEmpresa" id="empNumEmpresa" tipo="Num" value="1" disabled size="5" maxlength="5"/>
              </td>
              <td nowrap colspan=6 style="font-weight:bold;">&nbsp;EVERCORE CASA DE BOLSA S.A. de C.V.</td>
              <td width="8">&nbsp;</td>
            </tr>
                        
            <tr>
              <td width="7">&nbsp;</td>
              <td nowrap width="164">Vigencia en Dias</td>
              <td nowrap colspan =3>
                <input type="text" name="fpaNumDiasCambio" id="fpaNumDiasCambio" size="10" maxlength="5"/>
              </td>
              <td nowrap width="30">&nbsp;</td>
              <td nowrap width="185">No. Intentos Fallidos</td>
              <td nowrap width="123">
                <input type="text" name="fpaNumFallas" id="fpaNumFallas" size="10" maxlength="5"/>
              <td nowrap width="60">&nbsp;</td>
            </tr>
            
            <tr>
              <tr>
              <td width="7">&nbsp;</td>
              <td nowrap width="164" class="subtitulo">Validaci�n Password</td>
              <td nowrap colspan=6>&nbsp;</td>
              <td width="60">&nbsp;</td>
            </tr>
            <tr>
              <td width="7">&nbsp;</td>
              <td nowrap colspan="7"><hr></td>
              <td width="60">&nbsp;</td>
            </tr>
            
            <tr>
              <td width="7">&nbsp;</td>
              <td nowrap width="164">No. Mayusculas</td>
              <td nowrap colspan =3>
                <input type="text" name="fpaNumCaracteres" id="fpaNumCaracteres" size="10" maxlength="5"/>
              </td>
              <td nowrap width="30">&nbsp;</td>
              <td nowrap width="185">No. Minusculas</td>
              <td nowrap width="123">
                <input type="text" name="fpaMinDesconeccion" id="fpaMinDesconeccion" size="10" maxlength="5"/>
              <td nowrap width="60">&nbsp;</td>
            </tr>
            <tr>
              <td width="7">&nbsp;</td>
              <td nowrap width="164">No. Letras</td>
              <td nowrap colspan =3>
                <input type="text" name="fpaNumLetras" id="fpaNumLetras" size="10" maxlength="5"/>
              </td>
              <td nowrap width="30">&nbsp;</td>
              <td nowrap width="185">No. Numeros</td>
              <td nowrap width="123">
                <input type="text" name="fpaNumNumeros" id="fpaNumNumeros" size="10" maxlength="5"/>
              <td nowrap width="60">&nbsp;</td>
            </tr>
            
            <tr>
              <tr>
              <td width="7">&nbsp;</td>
              <td nowrap width="164" class="subtitulo">Par�metros</td>
              <td nowrap colspan=6>&nbsp;</td>
              <td width="60">&nbsp;</td>
            </tr>
            <tr>
              <td width="7">&nbsp;</td>
              <td nowrap colspan="7"><hr></td>
              <td width="60">&nbsp;</td>
            </tr>
            
            <tr>
              <td width="7">&nbsp;</td>
              <td nowrap width="164">No. Pwd Almacenados</td>
              <td nowrap colspan =3>
                <input type="text" name="fpaNumHistoria" id="fpaNumHistoria" size="10" maxlength="5"/>
              </td>
              <td nowrap width="30">&nbsp;</td>
              <td nowrap width="185">Longitud Minima</td>
              <td nowrap width="123">
                <input type="text" name="fpaNumDiasInactivo" id="fpaNumDiasInactivo" size="10" maxlength="5"/>
              <td nowrap width="60">&nbsp;</td>
            </tr>            
          </table>
        </td>
      </tr>
      <tr>
        <td width="60%" height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%" align="center">
          <input type="button" value="Aceptar " name="cmdAceptar" class="btn btn-primary" onclick="AltaOModificaInfo();" style="visibility:hidden"/>
          <input type="button" value="Cancelar" name="cmdCancelar" class="btn btn-danger" onclick="cargaPrincipal();" ><!--style="visibility:hidden"/>-->
        </td>
      </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
  </table>
</FORM>

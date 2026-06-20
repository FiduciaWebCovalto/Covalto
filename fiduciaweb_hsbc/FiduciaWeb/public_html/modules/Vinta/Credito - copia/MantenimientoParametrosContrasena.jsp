<FORM name="frmDatosMantenimiento" id="frmDatosMantenimiento" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td rowspan="7" width="10%" height="100%">&nbsp;</td>
        <td height="100%">&nbsp;</td>
        <td rowspan="7" width="10%" height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td align="center" height="100%" class="titulo">Mantenimiento Credito</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table class="texto">
            <tr>
              <tr>
              <td width="15%">&nbsp;</td>
              <td nowrap >Numero Cliente</td>
              <td nowrap>
                <select size="1" name="idCliente" id="idCliente" ref="conClienteCred" fun="loadComboElement" keyValue="idCliente" theValue="nombre" next="idProducto" />
              </td>
              <td nowrap colspan=6 style="font-weight:bold;">&nbsp;</td>
              <td width="10%">&nbsp;</td>
            </tr>
            
            <tr>
              <tr>
              <td width="15%">&nbsp;</td>
              <td nowrap width="15%" class="subtitulo">Producto</td>
              <td nowrap colspan=6>
                <select size="1" name="idProducto" id="idProducto" ref="conProductoCredito" fun="loadComboElement" keyValue="idProducto" theValue="vdescripcion" next="imonedaCred" onblur="verificarAlta()"/>
              </td>
              <td width="10%">&nbsp;</td>
            </tr>

            <tr>
              <tr>
              <td width="15%">&nbsp;</td>
              <td nowrap width="15%" class="subtitulo">Identificador Credito</td>
              <td nowrap colspan=6><input type="text" name="idCredito" id="idCredito" disable size="10" maxlength="5" tipo="Num"/></td>
              <td width="10%">&nbsp;</td>
            </tr>


            <tr>
              <tr>
              <td width="15%">&nbsp;</td>
              <td nowrap width="15%" class="subtitulo">Numero Credito</td>
              <td nowrap colspan=6><input type="text" name="anumeroCredito" id="anumeroCredito" size="15" maxlength="30" /></td>
              <td width="10%">&nbsp;</td>
            </tr>


            <tr>
              <td width="15%">&nbsp;</td>
              <td nowrap colspan="7"><hr></td>
              <td width="10%">&nbsp;</td>
            </tr>
            
            <tr>
              <td width="15%">&nbsp;</td>
              <td nowrap>Monto Credito</td>
              <td nowrap colspan =3>
                <input type="text" name="imontoCred" id="imontoCred"  size="15" maxlength="30" tipo="Money"/>
              </td>
              <td nowrap width="5%">&nbsp;</td>
              <td nowrap>Moneda</td>
              <td nowrap>
                <select size="1" name="imonedaCred" id="imonedaCred" ref="conNumMonNomMonCred" fun="loadComboElement" keyValue="monNomMoneda" theValue="monNomMoneda"  next="iperiodicidad"/>
              <td nowrap width="10%">&nbsp;</td>
            </tr>

            <tr>
              <td width="15%" height="16">&nbsp;</td>
              <td nowrap height="16">Fecha Otorgamiento</td>
              <td nowrap colspan =3 height="16">
                <input type="text" name="dfechaOtrorg" id="dfechaOtrorg"  size="10" maxlength="10" tipo="Fecha"/>
              </td>
              <td nowrap width="5%" height="16">&nbsp;</td>
              <td nowrap height="16">Fecha Vencimiento</td>
              <td nowrap height="16">
                <input type="text" name="dfechaVenc" id="dfechaVenc"  size="10" maxlength="10" tipo="Fecha"/>
              <td nowrap width="10%" height="16">&nbsp;</td>
            </tr>

            <tr>
              <td width="15%">&nbsp;</td>
              <td nowrap>Tasa Interes Ord.</td>
              <td nowrap colspan =3>
                <input type="text" name="itasaIa" id="itasaIa"  size="15" maxlength="15"/>
              </td>
              <td nowrap width="5%">&nbsp;</td>
              <td nowrap>Tasa Interes Mor.</td>
              <td nowrap>
                <input type="text" name="itasaMa" id="itasaMa" size="15" maxlength="15"/>
              <td nowrap width="10%">&nbsp;</td>
            </tr>

            <tr>
              <td width="15%">&nbsp;</td>
              <td nowrap>Costo Anual Total </td>
              <td nowrap colspan =3>
                <input type="text" name="icostoAt" id="icostoAt"  size="15" maxlength="15"/>
              </td>
              <td nowrap width="5%">&nbsp;</td>
              <td nowrap>Periodicidad</td>
              <td nowrap>
                <select size="1" name="iperiodicidad" id="iperiodicidad" ref=claves fun=loadComboElement keyValue="cveDescClave" theValue="cveDescClave" param="clavesCombo52" next="loadCatalogo"/>
              <td nowrap width="10%">&nbsp;</td>
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
          <input type="BUTTON" value="Tabla Amortizacion" name="cmdTabla" class="btn btn-primary" onclick="cargaPrincipalTabla();" style="visibility:hidden"/>
        </td>
      </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
  </table>
</FORM>

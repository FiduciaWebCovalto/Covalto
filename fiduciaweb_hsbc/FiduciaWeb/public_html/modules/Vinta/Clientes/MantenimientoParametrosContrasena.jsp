<FORM name="frmDatosMantenimiento" id="frmDatosMantenimiento" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
      <tr>
        <td rowspan="7" width="10%" height="100%">&nbsp;</td>
        <td height="100%">&nbsp;</td>
        <td rowspan="7" width="10%" height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td align="center" height="100%" class="titulo">Mantenimiento Clientes</td>
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
              <td nowrap >Numero</td>
              <td nowrap>
                <input type="text" name="idCliente" id="idCliente" disabled size="5" maxlength="5"/>
                <input type="text" name="idDatosCliente"  id="idDatosCliente" style="position:absolute;visibility:hidden" disabled size="5" maxlength="5"/>
                <input type="text" name="idDireccion" id="idDireccion" style="position:absolute;visibility:hidden" disabled size="5" maxlength="5"/>
              </td>
              <td nowrap colspan=6 style="font-weight:bold;">&nbsp;</td>
              <td width="10%">&nbsp;</td>
            </tr>
            
            <tr>
              <tr>
              <td width="15%">&nbsp;</td>
              <td nowrap width="15%" class="subtitulo">Identificador</td>
              <td nowrap colspan=6><input type="text" name="incliente" id="incliente" size="20" maxlength="20"/> 
                                                                                                                                                         </td>
              <td width="10%">&nbsp;</td>
            </tr>

            <tr>
              <tr>
              <td width="15%">&nbsp;</td>
              <td nowrap width="15%" class="subtitulo">Tipo Persona</td>
              <td nowrap colspan=6><select size="1" name="ctipoPersona" id="ctipoPersona" ref="claves" fun="loadComboElement" keyValue="cveDescClave" theValue="cveDescClave" next="vnacionalidad" param="clavesCombo23" required message="El Tipo de Persona es un campo obligatorio" onblur="funcactivacampos()"/></td>
              <td width="10%">&nbsp;</td>
            </tr>

            <tr>
              <td width="15%">&nbsp;</td>
              <td nowrap colspan="7"><hr></td>
              <td width="10%">&nbsp;</td>
            </tr>
            
            <tr>
              <td width="15%">&nbsp;</td>
              <td nowrap>Razon Social / Nombre</td>
              <td nowrap colspan =3>
                <input type="text" name="vnRs" id="vnRs"  size="50" maxlength="255" />
              </td>
              <td nowrap width="5%">&nbsp;</td>
              <td nowrap>Apellido Paterno</td>
              <td nowrap>
                <input type="text" name="vapaterno" id="vapaterno"  size="50" maxlength="255"/>
              <td nowrap width="10%">&nbsp;</td>
            </tr>

            <tr>
              <td width="15%" height="16">&nbsp;</td>
              <td nowrap height="16">Apellido Materno</td>
              <td nowrap colspan =3 height="16">
                <input type="text" name="vamaterno" id="vamaterno" size="50" maxlength="255"/>
              </td>
              <td nowrap width="5%" height="16">&nbsp;</td>
              <td nowrap height="16">Nacionalidad</td>
              <td nowrap height="16">
                <select size="1" name="vnacionalidad" id="vnacionalidad" ref="claveNacionalidad" fun="loadComboElement" onchange="GI('vnacionalidad').selectedIndex=((this.options[this.selectedIndex].text=='MEXICANA')?1:2);" keyValue="nacNomNacional" theValue="nacNomNacional" next="vpaisNac" required message="La nacionalidad es un campo obligatorio"/>
              <td nowrap width="10%" height="16">&nbsp;</td>
            </tr>

            <tr>
              <td width="15%">&nbsp;</td>
              <td nowrap>Sexo</td>
              <td nowrap colspan =3>
                <input type="text" name="csexo" id="csexo"  size="10" maxlength="10"/>
              </td>
              <td nowrap width="5%">&nbsp;</td>
              <td nowrap>CURP</td>
              <td nowrap>
                <input type="text" name="vcurp" id="vcurp" size="20" maxlength="18" onblur="ValidaLongCURP()"/>
              <td nowrap width="10%">&nbsp;</td>
            </tr>

            <tr>
              <td width="15%">&nbsp;</td>
              <td nowrap>RFC</td>
              <td nowrap colspan =3>
                <input type="text" name="vrfc" id="vrfc"  size="18" maxlength="18" onblur="ValidaLongRFC()"/>
              </td>
              <td nowrap width="5%">&nbsp;</td>
              <td nowrap>Fiel</td>
              <td nowrap>
                <input type="text" name="vnumFiel" id="vnumFiel" size="20" maxlength="20"  />
              <td nowrap width="10%">&nbsp;</td>
            </tr>
            

            <tr>
              <td width="15%">&nbsp;</td>
              <td nowrap>Cuenta 1</td>
              <td nowrap colspan =3>
                <input type="text" name="icta1" id="icta1"  size="20" maxlength="20"/>
              </td>
              <td nowrap width="5%">&nbsp;</td>
              <td nowrap>Cuenta 2</td>
              <td nowrap>
                <input type="text" name="icta2" id="icta2" size="20" maxlength="20"  /> 
              <td nowrap width="10%">&nbsp;</td>
            </tr>

            <tr>
              <td width="15%">&nbsp;</td>
              <td nowrap>Nivel de Riesgo</td>
              <td nowrap colspan =3>
                <input type="text" name="vnivelRiesgo" id="vnivelRiesgo"  size="20" maxlength="20" disabled /> 
              </td>
              <td nowrap width="5%">&nbsp;</td>
              <td nowrap>Lugar Nacimiento</td>
              <td nowrap>
                <input type="text" name="vlugarNac" id="vlugarNac" size="25" maxlength="50"/>
              <td nowrap width="10%">&nbsp;</td>
            </tr>


            <tr>
              <td width="15%">&nbsp;</td>
              <td nowrap>Pais</td>
              <td nowrap colspan =3>
                <select size="1" name="vpaisNac" id="vpaisNac" ref="clavePais" fun="loadComboElement" keyValue="paiNomPais" theValue="paiNomPais" next="loadCatalogo" />
                <input type="text" name="vpais" id="vpais" style="position:absolute;visibility:hidden" size="25" maxlength="60"/>
              </td>
              <td nowrap width="5%">&nbsp;</td>
              <td nowrap>Estado</td>
              <td nowrap>
                <input type="text" name="ventFed" id="ventFed" size="30" maxlength="125"/>
                <input type="text" name="vestado" id="vestado" style="position:absolute;visibility:hidden" size="25" maxlength="60"/>                
              <td nowrap width="10%">&nbsp;</td>
            </tr>

            <tr>
              <td width="15%">&nbsp;</td>
              <td nowrap>Delegacion / Municipio</td>
              <td nowrap colspan =3>
                <input type="text" name="fdelgMun" id="fdelgMun"  size="25" maxlength="60"/>
                <input type="text" name="vmunDel" id="vmunDel" style="position:absolute;visibility:hidden" size="25" maxlength="60"/>
              </td>
              <td nowrap width="5%">&nbsp;</td>
              <td nowrap>Fecha Nacimiento</td>
              <td nowrap>
                <input type="text" name="dfechaNac" id="dfechaNac" size="25" maxlength="30" tipo="Fecha"/>
              <td nowrap width="10%">&nbsp;</td>
            </tr>


            <tr>
              <td width="15%">&nbsp;</td>
              <td nowrap>Estado Civil</td>
              <td nowrap colspan =3>
                <input type="text" name="vestadoCiv" id="vestadoCiv"  size="25" maxlength="60"/>
              </td>
              <td nowrap width="5%">&nbsp;</td>
              <td nowrap>Regimen Mat.</td>
              <td nowrap>
                <input type="text" name="vregMat" id="vregMat" size="25" maxlength="30" />
              <td nowrap width="10%">&nbsp;</td>
            </tr>


            <tr>
              <td width="15%">&nbsp;</td>
              <td nowrap>Calle</td>
              <td nowrap colspan =3>
                <input type="text" name="vcalleNum" id="vcalleNum"  size="25" maxlength="60" />
              </td>
              <td nowrap width="5%">&nbsp;</td>
              <td nowrap>Colonia</td>
              <td nowrap>
                <input type="text" name="vcolonia" id="vcolonia" size="25" maxlength="50"/> 
              <td nowrap width="10%">&nbsp;</td>
            </tr>


            <tr>
              <td width="15%">&nbsp;</td>
              <td nowrap>Poblacion</td>
              <td nowrap colspan =3>
                <input type="text" name="vpoblacion" id="vpoblacion"  size="30" maxlength="60"/>
              </td>
              <td nowrap width="5%">&nbsp;</td>
              <td nowrap>CP</td>
              <td nowrap>
                <input type="text" name="ncp" id="ncp" size="20" maxlength="30"/>
              <td nowrap width="10%">&nbsp;</td>
            </tr>


            <tr>
              <td width="15%">&nbsp;</td>
              <td nowrap>Telefono Ofic/Part</td>
              <td nowrap colspan =3>
                <input type="text" name="ntel" id="ntel"  size="20" maxlength="30"/>
              </td>
              <td nowrap width="5%">&nbsp;</td>
              <td nowrap>&nbsp;</td>
              <td nowrap>
                &nbsp;
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
        </td>
      </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
  </table>
</FORM>

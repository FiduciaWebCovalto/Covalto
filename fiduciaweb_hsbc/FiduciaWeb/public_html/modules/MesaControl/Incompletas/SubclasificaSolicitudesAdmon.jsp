<FORM name="frmDocumentos" id="frmDocumentos" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="vertical-align:top;">
      <tr>
        <td align="center" height="100%" class="titulo">SubClasificacion de Instruccion No Monetaria</td>
      </tr>
      <tr>
        <td height="100%">&nbsp;</td>
      </tr>
      <tr>
        <td height="100%">
          <table width="90%" align="center" class="texto" border="0">
            <tr>
                            
          <td width="100%" height="34"> <table width="100%" class="texto">
              <tr> 
                <td> Proyecto 
                  <input type="text" name="txtNumContrato" id="txtNumContrato2" size="20" disabled="disabled"/>
                  - 
                  <input type="text" name="txtNomContraro" id="txtNomContraro2" size="80" disabled="disabled"/> 
                </td>
              </tr>
            </table></td>
                        </tr>
                        <tr>
                         <td width="100%">
                               <hr size="2">
                                <table width="1000" class="texto">
                                    <tr>
                                       <td width="50%" align="center" colspan="2">TIPO DE INTRUCCION</td>
                                        <td width="25%" align="center">FOLIO</td>
                                        <td width="25%" align="center">ESTATUS INSTRUCCION</td>
                                    </tr>
                                    <tr>
                                       <td width="50%" align="center" colspan="2">
                                         <input type="text" name="insCveTipoInstr" id="insCveTipoInstr" size="80" disabled="disabled"/>
                                        </td>
                                        <td width="25%" align="center">
                                          <input type="text" name="insNumFolioInst" id="insNumFolioInst" size="40" disabled="disabled"/>
                                        </td>
                                        <td width="25%" align="center">
                                          <input type="text" name="insCveStInstruc" id="insCveStInstruc" size="40" disabled="disabled"/>
                                        </td>
                                    </tr>
                                    <tr>
                                       <td width="50%" align="center" colspan="2">TIPO DE SOLICITUD</td>
                                        <td width="25%" align="center"></td>
                                        <td width="25%" align="center"></td>
                                    </tr>                                    
                                    <tr>
                                       <td width="50%" align="center" colspan="2">
                                         <input type="text" name="txtInsOperacion" id="txtInsOperacion" size="80" disabled="disabled"/>
                                        </td>
                                        <td width="25%" align="center">
                                        <input  id="paramEtapa" name="paramEtapa" size="10" style="visibility:hidden" /></input>
                                        <input  id="paramFideicomiso" name="paramFideicomiso" size="10" style="visibility:hidden" /></input></td>
                                        <td width="25%" align="center">
                                        </td>
                                    </tr>      </table>
            <table width="1000" class="texto">                                 
            <tr>
              <td width="100%" colspan="5" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr style="visibility:visible">
			<td width="25%">&nbsp;</td>
			<td colspan="2">
				SubClasifica:&nbsp;&nbsp;
				<select size="1" name="cboNombre" id="cboNombre" ref="muestraDatosSolicitudesSubclasifica" fun="loadComboElement" keyValue="ftsNumOperHija" theValue="ftsNombreTipoper" next="fin" required message="Seleccione una SubClasificacion"/>
			</td>
			<td width="5%">&nbsp;</td>
			<td nowrap>&nbsp;</td>
		</tr>
            <tr>
              <td width="100%" colspan="5" align="center" valign="middle">&nbsp;</td>
            </tr>
            <tr align="center"><td colspan="5">&nbsp;</td></tr>
            <tr align="center"><td colspan="5">
               <input type="BUTTON" name="btnGuardar" value="Guardar" class="btn btn-primary" onclick="guardar(3);"/>
               <input type="BUTTON" name="btnRegresar" value="Regresar" class="btn btn-danger" onclick="regresarAlaCharola2();"/>
            </td></tr>
          </table>
        </td>
      </tr>
  </table>
</FORM>
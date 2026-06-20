<FORM name="frmDatos" id="frmDatos" enctype="multipart/form-data" onsubmit="">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table cellspacing="1" cellpadding="1" border="0" width="100%" align="center" style="height:auto;">
    <tr>
      <td align="center" height="100%" class="titulo">Vigencia de Documentos</td>
    </tr>
    <tr>
      <td height="100%">&nbsp;</td>
    </tr>
    <tr>
      <td height="100%">
          <table width="90%" style="text-align:left" class="texto" border="0">
            <tr>
            <td width="12%">&nbsp;</td>
            <td nowrap width="15%">No. Prospecto</td>
            <td>
              <input type="text" name="paramnumProyec" id="paramnumProyec" size="10" maxlength="10" disabled/>
            </td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td width="12%">&nbsp;</td>
            <td nowrap width="15%">No. Persona</td>
            <td>
              <input type="text" name="paramnumPersona" id="paramnumPersona" size="10" maxlength="10" disabled/>
            </td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
            <td width="12%">&nbsp;</td>
            <td nowrap width="15%">Nombre / Razon Social</td>
            <td>
              <input type="text" name="paramNombre" id="paramNombre" size="50" maxlength="50" disabled/>
            </td>
            <td width="10%">&nbsp;</td>
          </tr>
          <tr>
              <td width="25%">&nbsp;</td>
              <td width="10%" nowrap>Tipo de Parte</td>
              <td>
                <input type="text" name="paramTipoParte" id="paramTipoParte" size="50" maxlength="50" disabled/>
              </td>
              <td width="10%">&nbsp;</td>
          </tr>
          <tr>
              <td width="25%">&nbsp;</td>
              <td width="10%" nowrap>Tipo de Persona</td>
              <td>
                <input type="text" name="paramTipoPer" id="paramTipoPer" size="50" maxlength="50" disabled/>
              </td>
              <td width="10%">&nbsp;</td>
          </tr>
          <tr>
              <td width="25%">&nbsp;</td>
              <td>
                <input type="text" name="pantORIG" id="pantORIG" size="10" maxlength="10" style="visibility:hidden"/>
                <input type="text" name="afbTelFidben" id="afbTelFidben" size="10" maxlength="10" style="visibility:hidden"/>
                <input type="text" name="afbCvePersona" id="afbCvePersona" size="10" maxlength="10" style="visibility:hidden"/>
                <input type="text" name="antNumContrato" id="antNumContrato" value=""  style="visibility:hidden"/> 
              </td>
              <td width="10%">&nbsp;</td>
              <td width="10%">&nbsp;</td>
            </tr>
          
          <tr>
            <td colspan="8" align="center">&nbsp;
            <input type="BUTTON" value="Regresar" id="cmdRegresar" name="cmdRegresar" class="btn btn-primary" ref="qryDoctoxVigencia" fun="loadTableElement" tabla="tblReg" onclick="cargaPrincipalProspectosFideicomitentes();"/></td> <!--ref="conPriDirFid"-->            
          </tr>
          <tr>
            <td align="center" colspan="8">
              <input type="BUTTON" value="  Alta   " id="cmdAlta" name="cmdAlta" class="btn btn-primary" onclick="cargaMantenimientoCuentas(1);"/>
              <input type="BUTTON" value="  Baja   " id="cmdBaja" name="cmdBaja" class="btn btn-danger" onclick="cargaMantenimientoCuentas(3);"/>
              <button type="button" id="cmdDocumento" onclick="validaDocumentoVigenciaDoctoPDF()" class="btn btn-success">Ver Docto</button>
              <!--input type="button" value="Subir Docto" id="cmdSubirDocumento" name="cmdSubirDocumento" class="btn btn-info" onclick="mostrarDiv();"/-->
            </td>
          </tr>
          <tr>
            <td colspan="8">&nbsp;</td>
          </tr>
          
            <tr align="center">
              <td colspan="5">
                <div style="height:250px; overflow:auto; position:relative; vertical-align:top; width:100%;">
                    <table id="tblReg" border="0" cellspacing="0" cellpadding="0" 
                    dataInfo="arrTblDatProsp" keys="fdocIdDocumentovig,fdocNumper,
                    fdocTipoPer,fdocIdAnteproy,fiso,semaforo" fun="clickTablaProsp" radioWidth="23" NoRecordsMsg="No existen registros para estos criterios de busqueda"  rowFunction="rowInstruccion">
                        <thead>
                          <tr class="cabeceras">
                            <td width="23" align="center">&nbsp;</td>
                            <td width="23px">Expediente</td>
                            <td>Csc</td>
                            <td>Fideicomiso Reservado</td>
                            <td>Id</td>
                            <td>Nombre Documento</td>
                            <td>Fecha de Vencimiento</td>
                            <td>Estatus de Vigencia</td>
                          </tr>
                        </thead>
                        <tbody></tbody>
                    </table>
                </div>
              </td>
            </tr>
                   
          
        </table>
      </td>
    </tr>
    <tr>
            <td colspan="8" align="center">
                <div id="divUpload" class="card shadow d-flex justify-content-center" style="width: 45rem;" >
                <div class="card-header bg-primary text-white">
                <h4 class="mb-0">Subir Expediente Electronico</h4>
                </div>
                <div class="card-body">
                <form id="uploadForm" enctype="multipart/form-data">
                <div class="mb-3">
                <label for="pdfFile" class="form-label">Seleccionar PDF</label>
                <input class="form-control" type="file" id="pdfFile" 
                name="pdfFile" accept="application/pdf" required>
                </div>
                <button type="button" id="btnUpload" onclick="uploadFile()" class="btn btn-success">Subir</button>
                </form>
                <input type="hidden" name="pdfName" id="hiddenPdfName"> 
                <!-- Área para mostrar mensajes -->
                <div id="statusMessage" class="mt-3"></div>
                </div>
                </div>
                
                <!--FIN SECCION PARA SUBIR PDF-->
            </td>
          </tr>    
  </table>
</FORM>
    
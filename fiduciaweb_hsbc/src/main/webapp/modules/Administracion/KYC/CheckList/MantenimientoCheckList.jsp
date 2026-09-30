 <form name="frmCheckListHead" id="frmCheckListHead">
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
    <table style="position:relative;display: none;">
      <tr>
        <td>
      </tr>
      <tr valign="middle">
        <td align="left">Fideicomiso:</td>
        <td align="left">
            <input type="text" id="paramFideicomiso" name="paramFideicomiso" value="1" required /> 
        </td>
        <td>Nombre Persona :</td>
        <td>
          <input type="text" id="paramNombre" name="paramNombre" value="PFNAC" required/>
        </td>
      </tr>
      <tr valign="middle">
        <td align="left">Numero de Persona:</td>
        <td align="left">
            <!--input type="text" id="paramNumPersona" name="paramNumPersona" value="1" required /--> 
        </td>
        <td align="left">Numero Concepto:</td>
        <td align="left">
            <input type="text" id="paramConcepto" name="paramConcepto" value="1" required > 
        </td>
      </tr>
      <tr valign="middle">
        <td align="left">Id Persona:</td>
        <td align="left">
            <input type="text" id="paramPersona" name="paramPersona" value="PFNAC" required/>
        </td>
      </tr>  
      <tr valign="middle">
        <td align="left">Tipo de Persona:</td>
        <td align="left">
            <input type="text" id="paramTipPersona" name="paramTipPersona" value="1" required/>
        </td>
      </tr>   
      <tr valign="middle">
        <td colspan="4">
            <input type="button" value="Carga Tabla Concepto" id="cmdCargarTablaConcepto" name="cmdCargarTablaConcepto" class="btn btn-primary" ref="consultaListaConcepto" fun="loadTableElement" tabla="tablaListaConcepto" onclick="consultar(this, GI('frmCheckListHead'), false);">
        </td>
      </tr>    
    </table>
  </form>
<br>
<FORM name="frmCheckList" id="frmCheckList" method="post" onsubmit=""> 
  <%=mx.com.inscitech.fiducia.web.security.SecurityBean.getToken(request, session)%>
  <table class="texto" border="0" width="960" align="center" height="100%">                   
      <tr>			
          <td>
            <div style="height:150px; overflow:auto; position:page; vertical-align:top; width:100%;">
                <table id="tablaListaConcepto" align="center" cellspacing="0" cellpadding="0" dataInfo="tablaListaConceptoDataInfo" keys="secConcepto,nomConcepto" fun="clickTablaListaConcepto" radioWidth="23" NoRecordsMsg="No existen registros para estos criterios de busqueda">
                    <thead>
                        <tr class="cabeceras">
                            <td width="25" align="center">&nbsp;</td>
                            <td width="300" id="tdListaConcepto">Nombre</td>
                        </tr>
                    </thead>
                    <tbody></tbody>
                </table>
            </div>
          </td>
          <td align="left">&nbsp;</td>
      </tr>
      <tr align="center">
      <td><input type="button" value="A&ntilde;adir" name="cmdAgregar" id="cmdAgregar" class="btn btn-primary" onclick="agregarConcepto()" style="visibility:visible"/></td>
      <td>&nbsp;</td>
      </tr>
    <tr style="visibility:hidden;position:absolute">
      <td>
          <input type="BUTTON" value="Buscar" name="cmdBuscar" id="cmdBuscar" class="btn btn-primary" onclick="consultaDatosKYC()" style="visibility:hidden;"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <div align="center" id="titleConcepto" class="titulo" >Nombre Concepto</div>
      </td>
    </tr>
    <tr>
      <td height="100%" colspan="10" valign=top>
          <div style="visibility:hidden; top:100px;overflow:vertical;" id="divResultados">
              <table border=0 class="texto" name="tablaResultados" id="tablaResultados" width="960" align="center" cellpadding="0" cellspacing="0">                           
                  <tr>
                      <td  align="center" valign="middle" height="50">
                          <input type="BUTTON" id="cmdGuardar" value="Guardar" name="cmdGuardar"  class="btn btn-primary" onclick="mandaDatosKYC()" style="visibility:hidden"/>&nbsp;&nbsp;&nbsp;
                      </td>
                  </tr> 
                  <tr>			
                      <td align="center" id="NombreConcepto" style="visibility:hidden">Nombre Concepto</td>			
                  </tr>
                  <!--tr>
                    <td align="center" colspan="*"><input type="file" id="fileField" name="fileField" sstyle="visibility:hidden" onchange="GI('urlSubconcepto'+GI('conSelected').value).value=this.value;SA(GI('etiSubconcepto'+GI('conSelected').value),'urlaux',this.value);this.value='';this.style.visibility='hidden';GI('Agregar'+GI('conSelected').value).style.visibility='hidden';GI('Agregar'+GI('conSelected').value).style.position='absolute';GI('Quitar'+GI('conSelected').value).style.visibility='visible';GI('Quitar'+GI('conSelected').value).style.position='relative';"/></td>
                  </tr-->
                  <tr>			
                      <td height="20"><input type="hidden" id="conSelected"/></td>			
                  </tr>                  
                  <tr>
                      <td> 
                      
                      <%for(int i=1;i<70;i++){%>
                      
                          <div style="visibility:hidden;" id="divSubconcepto<%=i%>">
                              <table class="texto" width="960" border="0" cellpadding="0" cellspacing="0">                              
                                <tr>
                                    <td width="20">
										
                                    </td>
                                    <td  align="left" width="250" > <a id="etiSubconcepto<%=i%>" urlaux="" onclick="muestraDocumento(GA(this,'urlaux'))" target="_new">Subconcepto<%=i%></a></td>
                                    <td width="370" align="left">
                                      <input type="text" id="paramSubconcepto<%=i%>" name="paramSubconcepto<%=i%>" value="" size="70"/>
                                      <select onchange="pasaValor(id)" style="visibility:hidden;position:absolute" id="cmbSubconcepto<%=i%>" name="cmbSubconcepto<%=i%>" ref="" fun="loadComboElement" keyValue="" param="objComboParam" theValue="" next=""></select>
                                    </td>                                    
                                    <td width="370" align="left">
                                      <select onchange="pasaValor(id)" style="visibility:hidden" id="cmbSubconceptoAlt<%=i%>" name="cmbSubconceptoAlt<%=i%>" ref="" fun="loadComboElement" keyValue="" param="objComboParamAlt" theValue="" next=""></select>
                                    </td>
                                </tr> 
                                <tr><td colspan="4"><hr width="960" id="separador<%=i%>" style="visibility:hidden"/></td></tr>
                              </table>
                              <input type="checkbox" id="checkSubconcepto<%=i%>" name="checkSubconcepto<%=i%>" style="position:absolute;visibility:hidden;"/>
                              <input type="text" id="urlSubconcepto<%=i%>" name="urlSubconcepto<%=i%>" style="position:absolute;visibility:hidden;"/> 
                              <br>
                          </div>
                          <%}%>
                      </td>
                  </tr>
                  <tr>
                      <td  align="center" valign="middle" height="50" width="100%">
                            <input align="center" type="BUTTON" value="Guardar" name="cmdGuardar" id="cmdGuardar" class="btn btn-primary" onclick="mandaDatosKYC()"/>&nbsp;&nbsp;&nbsp;
                      </td>
                  </tr> 
            </table>
          </div>              
        </tr>
      </td>
    </tr>
  </table>
</form> 

<a id="linkReporte" href="#" style="visibility:hidden" target="_new">Archivo</a> 
<a id="linkReporteNew" href="#" style="visibility:hidden" target="_new">Archivo</a>
                          

